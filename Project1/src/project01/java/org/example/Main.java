package org.example;

public class Main {
  public static void main(String[] args) {
    Vector3D v1 = new Vector3D(3, 4, 5);
    Vector3D v2 = new Vector3D(1, 2, 3);

    // Testing getMagnitude
    System.out.println("Magnitude of v1: " + v1.getMagnitude());

    // Testing normalize
    Vector3D normalizedV1 = v1.normalize();
    System.out.println("Normalized v1: " + normalizedV1.vectorToString());

    // Testing add
    Vector3D sum = v1.add(v2);
    System.out.println("Sum of v1 and v2: " + sum.vectorToString());

    // Testing multiply
    Vector3D scaledV1 = v1.multiply(2);
    System.out.println("v1 scaled by 2: " + scaledV1.vectorToString());

    // Testing dotProduct
    double dotProduct = v1.dotProduct(v2);
    System.out.println("Dot product of v1 and v2: " + dotProduct);

    // Testing angleBetween
    double angle = v1.angleBetween(v2);
    System.out.println("Angle between v1 and v2: " + angle + " degrees");

    // Testing crossProduct
    Vector3D crossProduct = v1.crossProduct(v2);
    System.out.println("Cross product of v1 and v2: " + crossProduct.vectorToString());
  }
}