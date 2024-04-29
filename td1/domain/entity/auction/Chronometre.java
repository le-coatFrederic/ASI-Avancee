package td1.domain.entity.auction;

import java.sql.Time;

public class Chronometre {
  private Time time;
  public Chronometre () {
    time = new Time(Time.parse("29/04/2024"));
    System.out.println(time);
  }

  public static void main(String[] args) {
    Chronometre chrono = new Chronometre();
  }
}
