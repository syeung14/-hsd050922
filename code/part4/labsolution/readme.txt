A developer has decided to create the following design.

class Rectangle {
  private double length;
  private double width;
  
  public double getLength() { return length; }
  public void setLength(double value) { length = value; }
  
  public double getWidth() { return width; }
  public void setWidth(double value) { width = value; }  
}

class Square extends Rectangle {
  public void setLength(double value) {
    setWidth(value);
  }
  
  public void setWidth(double value) {
    super.setLength(value);
    super.setWidth(value);
  }  
}

Is this a good design or are there issues with it?

This is not a good design even though in Math we hear that a Square is a Rectangle.

If we substitute an instance of a Square where a Rectangle is used then we need to be sure that the user does not have to worry about the difference.

If a user modifies the width of a rectangle, they do not expect the length to change. They may call getLength before changing the width. Now their  calculation and expections are off if a square is used instead of a rectangle.

In this case, if the goal was to reuse a Rectangle in the implementation of a Square, then a delegation is a better choice.

For another example, is an Electric Car an extension of a Car?
No, because the user of a ElectricCar will be surprised at the gas pump.

Substitutability is really the key when it comes to asking if inheritance is a choice.

For example, in Java we have LSP in many places - good and bad.

Good

A derived class overriding method should be public if the base method is public; or - protected or public if the base method is protected.

An overriding method is not allowed to specify throws for an arbitrary exception than the corresponding base methods.

Sadly, Stack extends Vector in the JDK and that may violate the 
invariants of a Stack when used where a Vector is expected. Delegation
should have been used in this.

In the JDK they have Stack extends Vector, instead they should have
use Vector internal to a Stack.

A user of a Stack should not be allowed to use it like a Vector.
A Stack may use a Vector but not be used as a Vector.

Context matter.


