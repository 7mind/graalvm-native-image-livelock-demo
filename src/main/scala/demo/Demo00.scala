package demo

import izumi.functional.bio.Async2

object Demo00 {
  def main(args: Array[String]): Unit = {
    println(implicitly[Async2[zio.IO]])
  }
}
