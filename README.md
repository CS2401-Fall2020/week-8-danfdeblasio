# Week 8

We will maintain a double linked list and keep a single node pointer. 
That stored node may not always be the head or the tail, 
but since it is doubly linked you can still reach all possible nodes by moving left or right. 

Your task is to keep a list of users and their average scores in a game. 
Each node in the list will store the sum of that users scores so far, and the number of scores received. 
The nodes will be sorted by the `username` and this ordering will be maintained by inserting any new user in-order. 

You can print the entire list by printing the nodes to the left of a given node in reverse order, the node itself, then the nodes to the right of the given node. 

# Example
Assume that we begin with a list in the following state, with out `current` node pointing to the node with username `"saflores"`:

![Initial State](/images/initial.png)

We then want to add `"dfdeblasio"` recent score of `6149`. 
To do this we move `current` to the node with the username `"dfdeblasio"` then add the score and increment the counter. 
In this case this user is to the left of the original `current` node because it is lexicographically smaller than `"saflores"`. 
This is the state after this addition:

![After Step 2](/images/step2.png)

When we print the entire list, it will look like the following since `"dfdeblasio"` is the `current` node. 

```
/-> caalvarado (7663.5) <--> null
|
\/
dfdeblasio (6451.0)
/\
|
\-> saflores (6640.666666667) <--> null
```

(note that `printForward()` and `printReverse()` were defined in class and can be found in the `ScoresLLNode` class already)


If we then add the score `9201` for `"igastelum"` followed by the score `8834` for `"atberowitz"`.
Note two things: (1) the order is important, and (2) neither of the users exist in the list at the start. 
After these two operations, the states would be: 

![After Step 3](/images/step3.png)

after adding `"igastelum"`s score, and 

![After Step 4](/images/step4.png)

after adding `"atberowitz"`s score. 

Then when printed the output would be 
```
/->
|
\/
atberowitz (8834.0)
/\
|
\-> caalvarado (7663.5) <--> dfdeblasio (6451.0) <--> igastelum (9201.0) <--> saflores (6640.6666667) <--> 
```

# Your Tasks
You will be completing two classes, one will contain the particular score nodes (`ScoreLLNode`) as well as a wrapper class (`ScoreLL`) that will contain the pointer to the most recently modified node. 
`StringLL` will also contain the main print method which will call the recursive print nodes that we generated earlier. 

**Do not change the method signatures, do not add methods other than the needed constructors.**

## `ScoreLL`
This class will contain a single public `ScoreLLNode` object called `current`. 
It will only have a default contructor, but this constructor does not need to do anything. 

### `print()`
This method, when called on a `ScoreLL` node will first a formatted line containing the reverse list from `current`s `previous` node (if it exists). 
Then it will print a formatting line then use `ScoreLLNodes`s `toString()` method to print the current node. 
Finally it will print a formatting line, then a formatted line containing the forward list from `current`s `next` node (if it exists).
See above for examples of what the `print()` methods output. 

### `insertScore(String, int)`
This method takes in a new scoring event. 
If the user is already in the list, it will add the score to the user's record using the `addScore(int)` method (described below). 
If the user is not in the list already it will be added in-order. 
The current pointer will be moved in order to find the location the user needs to be added. 
After this method us run, `current` will point to the record of the user with the username that was given. 

## `ScoreLLNode`
This class contains public `next` and `previous` pointers, as well as **private** variables containing the `username` (String), the `scoreTotal` (int) and `scoreCount` (int). 

You will need to, in other parts of the lab, use the following methods that are already implemented:
* `compareTo(String)` compared a given string to the current username using the `String` classes' `compareTo` method. 
* `printForward()` will print the list of the nodes from a given node to the end following the `next` pointers. 
* `printReverse()` will print the list of the nodes from a given node to the start following the `previous` pointers. 

### `toString()`
Prints the username and the average score in parenthesis. 
Eventhough the total score and count are integers, the average will be a decimal. 

### `addScore(int)`
Adds the input score to the total score and incremements the counter. 

### `ScoreLLNode(String , int )`
Creates a new node with the given username one score ad given. 

## `tester`
This class will contain a main method, and 5 tests that show that all of the methods in the other classes work as intended. 

# Grading
* `ScoreLL` -- 40 pts
  * constructors and class setup -- 10 pts
  * `insertScore` -- 20 pts
  * `print` -- 10 pts
* `ScoreLLNode` -- 40 pts
  * class setup -- 10 pts
  * constructor -- 10 pts
  * `toString` -- 10 pts
  * `addScore` -- 10 pts
* `tester` -- 20 pts (4 pts each)

Lateness rule: -10 pts for 1 day of lateness / - 20 pts for 2 days of lateness / 0 after that, but you still have to turn in your work

