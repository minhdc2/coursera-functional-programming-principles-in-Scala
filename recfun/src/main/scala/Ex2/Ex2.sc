//Exercise 2: Parentheses Balancing
//
//  Write a recursive function which verifies the balancing of parentheses
//  in a string, which we represent as a List[Char] not a String. For example
//  , the function should return true for the following strings:

def balance(chars: List[Char]): Boolean = {

  def IsListEmpty(OpenBracketTail: List[Int]
                  , CloseBracketTail: List[Int]): Boolean = {
    if (OpenBracketTail.isEmpty == true & CloseBracketTail.isEmpty == true)
      true
    else
      ParenthesesPair(OpenBracketTail, CloseBracketTail)
  }

  def ParenthesesPair(OpenBracketPos: List[Int]
                      , CloseBracketPos: List[Int]): Boolean = {
    if (OpenBracketPos(0) < CloseBracketPos(0))
      IsListEmpty(OpenBracketPos.tail, CloseBracketPos.tail)
    else
      false
  }

  def OpenBracketPos(chars:List[Char]): List[Int] = {
    var OpenBracketPos: List[Int] = List()
    for (i <- 0 to chars.length-1) {
      if (chars(i) == '(')
        OpenBracketPos = OpenBracketPos :+ i
    }
    OpenBracketPos
  }

  def CloseBracketPos(chars:List[Char]): List[Int] = {
    var CloseBracketPos: List[Int] = List()
    for (i <- 0 to chars.length-1) {
      if (chars(i) == ')')
        CloseBracketPos = CloseBracketPos :+ i
    }
    CloseBracketPos
  }
  ////// Cut-off //////
  var OpenBracketpos = OpenBracketPos(chars)
  var CloseBracketpos = CloseBracketPos(chars)
  if (OpenBracketpos.isEmpty == true | CloseBracketpos.isEmpty == true)
    false
  else
    ParenthesesPair(OpenBracketpos, CloseBracketpos)
}

var str = "I told him (that it’s not (yet) done). (But he wasn’t listening)".toList
balance(str)


