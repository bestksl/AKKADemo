def swap[T, S](tup: (T, S)) = {
  tup match {
    case (a, b) => (b, a)
  }
}