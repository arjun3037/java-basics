Singleton Design pattern is a creational design pattern
Singleton design pattern ensure that only single instance of class can be created.
There are multiple ways to implement the singelton design pattern
1) By providing factory method inside the class , constructor should be private
    check class Singleton for reference. but this implementation is not thread safe
   this class can be break in multi-threading environment.
2) To avoid this issue we should ensure that new object creation happens inside the
    synchronized block so that only one thread can access that piece of code.
   check class ThreadSafeSingleton for more reference.
3) There one more way to create thread safe singelton class if we declare class reference as static ,classloader will gaurantee
that instance will not be visible until its fully created. but this is not lazy initialization.
    
    ex - private static final Singleton INSTANCE = new Singleton();

4) ThreadSafeSingleton class also broken in case of Reflection, 

   Reflection case - Anyone can access the private constructor by using Relection API. To handle this issue we need to through exception from
    constructor.
   Serialization case - If we serialize the singleton class instance at the time of deserialization new instance can be created 

