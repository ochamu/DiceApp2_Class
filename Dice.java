public class Dice {
  int me;
  void roll() {
    me = (int)(Math.random() * 6) + 1;
  }
}