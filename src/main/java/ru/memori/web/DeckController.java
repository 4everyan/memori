package ru.memori.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.memori.service.DeckService;


@Controller
public class DeckController {
	
	private DeckService deckService;

	public DeckService getDeckService() {
		return deckService;
	}

	@Autowired
	public void setDeckService(DeckService deckService) {
		this.deckService = deckService;
	}

	@RequestMapping(value = "/decks", method = RequestMethod.GET)
	public String showDeckList(Model model) {
		
		// deckService.getDeckList(username);
		model.addAttribute("deckList", null);
		return "decks/list";
	}
	
	@RequestMapping(value = "/deck/{id}", method = RequestMethod.GET)
	public String showDeck(@PathVariable("id") long id, Model model) {
		
		// deckService.getDeckById(id);
		model.addAttribute("deck", null);
		return "decks/view";
	}
	
	@RequestMapping(value = "/deck/{id}", method = RequestMethod.GET, params = "learn")
	public String learnDeck(@PathVariable("id") long id, Model model) {
		
		model.addAttribute("deck", null);
		return "decks/learn";
	}
}
