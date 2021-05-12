package edu.cnm.deepdive;

import java.io.IOException;

public class Wolf {

  private final int weight;
  private final int height;

  public Wolf(int weight, int height) {
    this.weight = weight;
    this.height = height;
  }

  public int getWeight() {
    return weight;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public String toString() {
    return String.format("%s[weight: %d grams, height: %d cm]", getClass().getSimpleName(), weight, height);
  }

  public void hunt() {
    System.out.println("Hunt in packs for live prey");
  }

  public static void describe() {
    System.out.println("Wild, Carnivorous species of the canis genus.");
  }

  boolean isDomesticated() {
    return false;
  }

  public CharSequence speak() throws IOException {
    return new StringBuilder("Howl!!");
  }
}
