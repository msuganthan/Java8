Functional Interface:
=====================

    This interface can hold
    1. Must have only one single abstract method
    2. May have any number of default methods
    3. Can have Object class abstract methods like hashCode(), equals(Object obj)
    4. The Function interface which is extending an existing functional interface, should not have any new
        abstract method(See Cook3)

    * The class can implement two functional interface with same method signature
    * The class can't implement two functional interface with same default method
        If this is case, the case has to override the default method.