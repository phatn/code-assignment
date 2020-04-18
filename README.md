#A1
#Optimization
* Move all behaviors into an AnimalBehavior interface
* Change Animal into an abstract class and implements AnimalBehavior to provide default behaviors
* Bird class will extends Animal and override specific behavior if needed

#A2
* Add two subclasses of Bird and define say and swim behavior
* Duck can say and swim
* Chicken can say only, so swim method does nothing

#A3
#A3 a,b
Rooster is a subclass of Chicken, that is IS-A relationship
#A3 c
Move say behavior into an interface and inject implementation for classes, so Chicken and Rooster has a Say behavior, that is HAS-A relationship

#A4
*Refactor all classes to implement HAS-A relationship
1. Move all behaviors into interfaces
2. Define implementations for those interfaces
3. Inject (either constructor or setter method) implementation into subclasses

#B1
*Add Fish class that extends Animal
*Implement Sing and Walk behaviors for Fish

#E1 Count
a. how many of these animals can fly?
b. how many of these animals can walk? 
c. how many of these animals can sing? 
d. how many of these animals can swim?
