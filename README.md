# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

The five objects that are created in the main include the three dogs that are created and put into the list dogs: Fido with 4 legs, Fido with 3 legs, and Alfie with 4 legs. The other two objects are the list itself, dogs, and the comparator created to sort the list

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?

The Comparator constructor call takes place within the Collections.sort call. The program defines the comparator and its compare method within the declaration of the object itself. By doing this, there is not need for a seperate class definition for the Comparator. Comparator itself is a functional interface, and can therfore be instantiated, which is what takes place in the main method given.
