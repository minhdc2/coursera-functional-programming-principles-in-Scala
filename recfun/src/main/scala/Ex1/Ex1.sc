//Exercise 1: Pascal’s Triangle
//Do this exercise by implementing the pascal function in Main.scala
// , which takes a column c and a row r, counting from 0 and returns
// the number at that spot in the triangle. For example, pascal(0,2)=1
// ,pascal(1,2)=2 and pascal(1,3)=3.

def pascal(c: Int, r: Int): Int = {
  if (c <= r & c >= 0) {
    if (c == 0) 1
    else if (c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
  else -1
}

pascal(4,5)