package izumi.functional.bio

import izumi.functional.bio.impl._
import izumi.functional.bio.Async2
import izumi.functional.bio.DivergenceHelper.Divergent
import izumi.functional.bio.Root._

object Demo00 {
  def main(args: Array[String]): Unit = {
    // this is broken:
    println(cast3To2(null:Async3[zio.ZIO]))
    // println(cast3To2(AsyncZio))
    //println(implicitly[Async2[zio.IO]])

    // this is ok:
    // println(AsyncZio)
    // println(Divergent(AsyncZio))
  }
}
