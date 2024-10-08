The following version of the puzzle appeared in Life International in 1962:

There are five houses.  
The Englishman lives in the red house.  
The Spaniard owns the dog.  
Coffee is drunk in the green house.  
The Ukrainian drinks tea.  
The green house is immediately to the right of the ivory house.  
The Old Gold smoker owns snails.  
Kools are smoked in the yellow house.  
Milk is drunk in the middle house.  
The Norwegian lives in the first house.  
The man who smokes Chesterfields lives in the house next to the man with the fox.  
Kools are smoked in the house next to the house where the horse is kept.  
The Lucky Strike smoker drinks orange juice.  
The Japanese smokes Parliaments.  
The Norwegian lives next to the blue house.

Now, who drinks water? Who owns the zebra?

In the interest of clarity, it must be added that each of the five houses is painted a different color, and their
inhabitants are of different national extractions, own different pets, drink different beverages and smoke different
brands of American cigarets. One other thing: in statement 6, right means your right.

There are 2 solver types:

- `AI`: accepts any input and solves the puzzle using a ai chatbot to solve.
- `DUMMY`: accepts any input and provides hardcoded solution.

## Usage

```
POST http://localhost:8080/zebra/solve
Content-Type: application/json

{
  "type": "DUMMY",
  "clues": [
    "There are five houses.",
    "The Englishman lives in the red house.",
    "The Spaniard owns the dog.",
    "Coffee is drunk in the green house.",
    "The Ukrainian drinks tea.",
    "The green house is immediately to the right of the ivory house.",
    "The Old Gold smoker owns snails.",
    "Kools are smoked in the yellow house.",
    "Milk is drunk in the middle house.",
    "The Norwegian lives in the first house.",
    "The man who smokes Chesterfields lives in the house next to the man with the fox.",
    "Kools are smoked in the house next to the house where the horse is kept.",
    "The Lucky Strike smoker drinks orange juice.",
    "The Japanese smokes Parliaments.",
    "The Norwegian lives next to the blue house."
  ]
}
```
