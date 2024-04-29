package td1.domain.entity.auction;

import java.sql.Time;

public class Chronometre {
  private Time time = new Time(120000);
  public Chronometre () {
    System.out.println(time);
  }

  public static void main(String[] args) {
    Chronometre chrono = new Chronometre();
  }
}
