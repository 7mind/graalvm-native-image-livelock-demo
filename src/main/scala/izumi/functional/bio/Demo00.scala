package izumi.functional.bio

object Demo00 {
  def main(args: Array[String]): Unit = {
    // this is broken:
     println(new copy.Syntax3.ImplicitPuns19 {})
    // println(new izumi.functional.bio.syntax.Syntax3.ImplicitPuns19 {})
    // println((new Syntax3 {}).Async3(null: Async3[zio.ZIO]))
    // println(izumi.functional.bio.cast3To2(AsyncZio))
    // println(implicitly[Async2[zio.IO]])

    // this is ok:
    // println(AsyncZio)
    // println(Divergent(AsyncZio))
    // println(new DeepTraitHierarchy.ImplicitPuns19 {})
    // println(new DeepTraitHierarchy.A1 {})
  }
}
