# ProperGettersSetters
This project demonstrates secure and unsecure ways of creating getters and setters in Java.

# Summary
1. An array of primitives or objects

Insecure: Don't set or get object references directly. 

Secure: Use a copy of the object instead.

e.g. A privitve type array or an array of objects

2. Mutable objects

Insecure: Don't set or get object references to mutable objects directly. 

Secure: Use a clone of the object instead. You will need to override clone method from Object class for custom classes.

e.g a Date object or a Department Object

3. Collection of mutable objects

Insecure: Don't set or get object references to Collections of objects. 

Secure: Clone each object inside the collection. Insert it into a new collection.

e.g a List of Department objects
