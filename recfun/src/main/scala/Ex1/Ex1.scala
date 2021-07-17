package Ex1

object Ex1 {
  def pascal(c: Int, r: Int): Int = {
    if (c <= r & c >= 0) {
      if (c == 0) 1
      else if (c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
    else -1
  }

  pascal(4,5)
}
