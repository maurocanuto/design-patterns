# Software design patterns

In software engineering, a software design pattern is a **general reusable solution to a commonly occurring problem** within a given context in software design. It is not a finished design that can be transformed directly into source or machine code. It is a description or template for how to solve a problem that can be used in many different situations.

[![Design patterns organization](https://faisalsikder.files.wordpress.com/2010/02/design-pattern-organization.gif)](https://faisalsikder.files.wordpress.com/2010/02/design-pattern-organization.gif)

## Builder
*Exercise:
I want to create a Hero with a name, a profession (WARRIOR, THIEF, WIZARD), a weapon (DAGGER, SWORD, BOW) and an armor. Weapon and armor are optional while name and profession are final.*

The builder pattern is an object creation software design pattern with the intentions of finding a solution to the telescoping constructor anti-pattern:

```java
Pizza(int size) { ... }
Pizza(int size, boolean cheese) { ... }
Pizza(int size, boolean cheese, boolean pepperoni) { ... }
Pizza(int size, boolean cheese, boolean pepperoni, boolean bacon) { ... }
```

Use the Builder pattern when the algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled the construction process must allow different representations for the object that's constructed.

**Applicability**
* Too many arguments to pass from client program to the Factory class that can be error prone
* Some of the parameters might be optional unlike in Factory which forces to send all parameters
* Object is heavy and its creation is complex. e.g. building various types of pizzas

## Decorator
*Exercise:
A Robot can have 3 actions: attack, getPower and escape. We have 1 transportation means for escaping (MOTO).
I want to create a Rider which perform these actions.
Now, the rider has evolved to a new level and can teletransport himself (TELETRANSPORTATION mean). Add this feature without modifying the other objects.*

Decorator pattern lets you dynamically change the behavior of an object at run time by wrapping them in an object of a decorator class.

*Wikipedia says:*
> In object-oriented programming, the decorator pattern is a design pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern.

Use the decorator pattern to add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects or for responsibilities that can be withdrawn.
Also when extension by subclassing is impractical or when a large number of independent extensions are possible and would produce an explosion of subclasses to support every combination. If a class definition may be hidden or otherwise unavailable for subclassing this can also be a good approach.

**Applicability**
* Add behaviour to object at run time. Inheritance is the key to achieve this functionality, which is both advantage and disadvantage of this pattern.
* It enhances the behaviour of interface.
* Decorator can be viewed as a degenerate Composite with only one component. However, a Decorator adds additional responsibilities - it isn't intended for object aggregation.
* Decorator supports recursive composition
* Decorator is designed to let you add responsibilities to objects without sub-classing.

## Chain of responsibility
*Exercise:*
*We are in war and have 3 actions: KILL, DEFEND, STEAL.
Action is made of a actionType, a description and a status.
Our troupe is made up of:*
* *Officer can STEAL*
* *Colonel can DEFEND*
* *Lieutenant can KILL*

*Commander is the one who send the action.
He orders to Kill, then steal, then defend.*

It helps building a chain of objects. Request enters from one end and keeps going from object to object till it finds the suitable handler.

*Wikipedia says:*
>In object-oriented design, the chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects. Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain.

**Applicability**
* More than one object may handle a request, and the handler isn't known a priori. The handler should be ascertained automatically
* You want to issue a request to one of several objects without specifying the receiver explicitly
the set of objects that can handle a request should be specified dynamically

