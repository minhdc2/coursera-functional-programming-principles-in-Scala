
//Exercise 3: Counting Change
// Write a recursive function that counts how many different ways you can make change for an amount
// , given a list of coin denominations. For example, there are 3 ways to give change for 4 if you have coins
// with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.

def countChange(money: Int, coins: List[Int]): Int =
  