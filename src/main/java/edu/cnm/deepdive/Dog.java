package edu.cnm.deepdive;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Dog extends Wolf {

  private final List<String> tricks;

  public Dog(int weight, int height) {
    this(weight, height, new String[]{});
  }

  public Dog(int weight, int height, String... tricks) {
    super(weight, height);
    this.tricks = new LinkedList<>();
    Collections.addAll(this.tricks, tricks);
  }

  @Override
  public void hunt() {
    System.out.println("Finds the most fluffy toy in the box");
  }

  public static void describe() {
    System.out.println("Tame(for now), Divergent subspecies of the canis lupus species. ");
  }

  public List<String> getTricks() {
    return tricks;
  }

  @Override
  public String speak() {
    return "Bark! Bark!";
  }
}
