package org.example;

import java.text.DecimalFormat;

/**
 * Represents a three-dimensional vector with x, y, and z components.
 */
public class Vector3D {
  private double x;
  private double y;
  private double z;

  /**
   * Create a new Vector3D object
   *
   * @param x the x component of the vector
   * @param y the y component of the vector
   * @param z the z component of the vector
   */
  public Vector3D(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Gets the x component of the vector.
   *
   * @return the x component
   */
  public double getX() { return this.x; }

  /**
   * Gets the y component of the vector.
   *
   * @return the y component
   */
  public double getY() { return this.y; }

  /**
   * Gets the z component of the vector.
   *
   * @return the z component
   */
  public double getZ() { return this.z; }

  /**
   * Returns a string representation of the vector with each component rounded to two decimal places.
   *
   * @return a string representation of the vector
   */
  public String vectorToString() {
    return String.format("(%1$.2f, %2$.2f, %3$.2f)", this.x, this.y, this.z);
  }

  /**
   * Calculates and returns the magnitude of the vector.
   *
   * @return the magnitude of the vector
   */
  public double getMagnitude() {
    return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
  }

  /**
   * Normalizes the vector to a unit vector.
   *
   * @return a new normalized Vector3D object
   * @throws IllegalStateException if the vector is a zero vector
   */
  public Vector3D normalize() {
    double magnitude = getMagnitude();
    if (magnitude == 0) {
      throw new IllegalStateException("A zero vector cannot be normalized!");
    }
    return new Vector3D(this.x / magnitude, this.y / magnitude, this.z / magnitude );
  }

  /**
   * Adds this vector to another vector and returns the resulting vector.
   *
   * @param other the other vector to add
   * @return a new Vector3D object that is the sum of this vector and the other vector
   */
  public Vector3D add(Vector3D other) {
    return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
  }

  /**
   * Multiplies this vector by a constant and returns the resulting vector.
   *
   * @param constant the constant to multiply the vector by
   * @return a new Vector3D object that is the product of this vector and the constant
   */
  public Vector3D multiply(double constant) {
    return new Vector3D(this.x * constant, this.y * constant, this.z * constant);
  }

  /**
   * Calculates the dot product of this vector and another vector.
   *
   * @param other the other vector
   * @return the dot product of this vector and the other vector
   */
  public double dotProduct(Vector3D other) {
    return this.x * other.x + this.y * other.y + this.z * other.z;
  }

  /**
   * Calculates the angle between this vector and another vector in degrees.
   *
   * @param other the other vector
   * @return the angle between the two vectors in degrees
   * @throws IllegalStateException if either vector is a zero vector
   */
  public double angleBetween(Vector3D other) {
    double dotProduct = dotProduct(other);
    double magnitude = getMagnitude() * other.getMagnitude();
    if (magnitude == 0) {
      throw new IllegalStateException("Cannot calculate the angle with a zero vector!");
    }
    double angleGrad = Math.acos(dotProduct / magnitude);
    return Math.toDegrees(angleGrad);
  }

  /**
   * Calculates the cross product of this vector and another vector.
   *
   * @param other the other vector to cross with this one
   * @return a new Vector3D object that is the cross product of this vector and the other vector
   */
  public Vector3D crossProduct(Vector3D other) {
    return new Vector3D(
            this.y * other.z - this.z * other.y,
            this.z * other.x - this.x * other.z,
            this.x * other.y - this.y * other.x
    );
  }
}
