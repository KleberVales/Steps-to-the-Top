# Steps-to-the-Top

In this challenge, the goal is to construct and display a right-aligned staircase pattern using # symbols and spaces, based on the given size 𝑛. The staircase will have both a height and a width of 𝑛.

## How It Works

1. Structure:
   - Each row contains a combination of spaces and # symbols.
   - The number of rows is equal to 𝑛.
   - The number of spaces decreases from 𝑛 − 1 to 0 as you go down the rows.
   - The number of # symbols increases from 1 to 𝑛.

2. Key Features:
   - The staircase is right-aligned, meaning the # symbols are aligned to the right edge.
   - The first row has 𝑛−1 spaces and 1 #.
   - The last row has no spaces and 𝑛 # symbols.
  
3. Input:
    - A single integer 𝑛, which determines the size of the staircase.
  
4. Output:
    - A staircase of size 𝑛, printed with # symbols and spaces.

## Example

### Input:
```
6

```
### Output:
``` shell
     #
    ##
   ###
  ####
 #####
######

```
