Generics - Type Erasure - To implements generics, java compiler applies type erasure.

Replace all type parameter in generic types with their bounds or object if the type parameter are unbounded
Insert type casts if necessary to preserve type safety.
Heap Pollution -

Heap pollution occur when a variable of a parametrized type refers to an object that is not of that parametrized type.
