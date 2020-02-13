# How Objects Behave

A method uses parameters. A caller passes arguments.

# Pass by value
Java is pass-by-value. That means pass-by-copy.

# Encapsulation
Setters and Getters
Any place where a particular value can be used, a method call that returns that type can be used.

# Instance Variables
Instance variables always get a default value. If you don’t explicitly assign a value
to an instance variable, or you don’t call a setter method, the instance variable still has a value!

# Local Variables
Local variables do NOT get a default value! The compiler complains if you try to use a local variable before
the variable is initialized.

Local variables are declared within a method.

Local variables MUST be initialized before use!

# Comparison
Use == to compare two primitives,
or to see if two references refer to the same object. -- Very Important

Use the equals() method to see
if two different objects are equal.
