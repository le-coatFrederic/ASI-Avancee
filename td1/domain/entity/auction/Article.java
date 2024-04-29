package td1.domain.entity.auction;

import java.util.ArrayList;

public class Article {
  private int identifiant;
  private String nom;
  private String description;
  private Chronometre tempsRestant;
  private ArrayList<Enchere> encheres;

  public Article(int id) {
    identifiant = id;

  }
}
