package ru.memori.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ru.memori.model.Card;
import ru.memori.service.CardService;


@Controller
public class CardController {

	private CardService cardService;

	public CardService getCardService() {
		return cardService;
	}

	@Autowired
	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}
	
	@RequestMapping(value = "/card/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getCardDetails(@PathVariable("id") long id, Model model) {

		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		try {
			Card card = cardService.getCardById(id);
			return gson.toJson(card, Card.class);
		}
		catch (RuntimeException e) {
			e.printStackTrace();
			return "{error:true}";
		}
	}
}
