Remember, TDD is not about _taking_ teeny-tiny steps, it's about _being able to_ take teeny-tiny steps.

### TODO

1. $5+10CHF=$10 if rate is 2:1  
2. ~~$5*2 = $10~~  
3. make "amount" private  
4. ~~side effect~~  
5. Money rounding
6. ~~equals()~~  
7. hashCode()

#### Dependency and Duplication

Steve Freeman pointed out that the problem with the test and code as it sits is not duplication.  
The problem is the dependency between the code, and the test—you can't change one without changing the other. Our goal is to be able to write another test that “makes sense” to us, without having to change the code.  
If dependency is the problem, duplication is the symptom. Duplication most often takes the form of duplicate logic the same expression appearing in multiple places in the code.

#### TDD cycle

1. Write a test. Think about how you would like the operation in your mind to appear in your code.  
2. Make it run. Speed is the key. If the clean, simple solution is obvious, but it will take you a minute, then make a note of it and get back to the main problem, which is getting the bar green in seconds.  
3. Make it right. Make the code clean and keep the test pass.

#### How to make test green quickly

We have two choices:  
1. Fake it. Return a constant and gradually replace constants with variables until you have the real code.  
2. Use Obvious Implementation. Type in the real implementation.

Other option, triangulation  
1. Translated a design objection (side effects) into a test case that failed because of the objection.  
2. Got the code to compile quickly with a stub implementation.  
3. Made the test work by typing in what seemed to be the right code.

Using triangulation, we only generalize code when we have two examples or more. When the second example demands a more general solution, then and only then do we generalize.  
Use it when we are unsure of how to refactor.  
If we can see how to eliminate duplication between code and tests and create the general solution, then just do it.  
Triangulation provides a chance to think about the problem from a slightly different direction.