Svar på frågor:

1. What happens if the designers of the Storage class decide to change the
   implementation of the List to LinkedList?
    * Det slutar fungera. Pga av att metod anrop på specifika
      interface, t.ex trimToSize() i Main.

    - Think about the method calls in main - does trimToSize() exist in
      LinkedList?

    * Nej Linkedlist har inte trimToSize()

    - Should Main know about what concrete type of List Storage provides?

    * Nej main ska inte bry sig om "HUR" Storage hanterar sina listor.

2. Make a UML diagram showing the inheritance tree (you don't need to be
   specific)
    * Se fil uml-diagram

3. Is it possible in this design for an Engineer to also become a Manager?
    * Nej för i nuläget ärver både Manager och Engineer från Employee. Och båda
      är separata klasser.
   