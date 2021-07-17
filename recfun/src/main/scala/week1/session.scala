package week1

object session {

  def abs(x: Double):Double = if (x<0) -x else x

  def isGoodEnough(guess: Double, x: Double):Boolean =
    abs(guess * guess - x) < 0.001

  def improve(guess: Double, x: Double):Double =
    (guess + x / guess) / 2

  def sqrtIter(guess: Double, x: Double):Double = {
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)
  }

  def sqrt_(x: Double):Double = sqrtIter(guess = 1.0, x)

  sqrt_(2)
}

