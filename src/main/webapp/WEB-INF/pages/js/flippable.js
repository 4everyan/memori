
function Flippable (container) {
  var c = $(container);
  var sides = c.children("div");

  if (sides.length < 2)
    return null;

  var front = sides.first();
  var back = front.next();

  front.addClass("flippable not-flipped");
  back.addClass("flippable back-flipped");

  var onresize = function () {
    c.height(front.outerHeight(true));
    front.outerWidth(c.innerWidth(), true);
    back.outerWidth(c.innerWidth(), true);
  };
  $(window).resize(onresize);
  onresize();

  // save all variables as fields
  this.front = front;
  this.back = back;
  this.container = c;
  this.initialized = true;
}

Flippable.prototype.toggle = function() {

  if (!this.initialized) {
    console.log("undefined");
    return;
  }

  this.front.toggleClass("not-flipped");
  this.front.toggleClass("front-flipped");

  this.back.toggleClass("not-flipped");
  this.back.toggleClass("back-flipped");
};