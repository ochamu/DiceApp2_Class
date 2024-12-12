public class Game {
  Player p1, p2;
  Dice d1, d2;

  Game() {
    p1 = new Player();
    p2 = new Player();
    d1 = new Dice();
    d2 = new Dice();
  }

  void start() {
    p1.turn(d1);
    p2.turn(d2);
    System.out.println("Player1: " + d1.me + "\n"  + "Player2: " + d2.me);
    judge();
  }

  void judge() {
    if (d1.me == d2.me) {
      System.out.println("あいこ");
      start();
    }else if (d1.me > d2.me) {
      System.out.println("Player1の勝ち");
    } else {
      System.out.println("Player2の勝ち");
    }
  }
}