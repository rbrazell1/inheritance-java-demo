package edu.cnm.deepdive;

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
    return String.format("5s[weight: %d, height: %d}", "Wolf", weight, height);
  }
}
