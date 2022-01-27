package izumi.functional.bio

object Demo00 {
  def main(args: Array[String]): Unit = {
    // this line causes hang if you try to
    // build native image using command:
    // ```
    //   sbt GraalVMNativeImage/packageBin
    // ```
     println(new copy.Syntax3.ImplicitPuns19 {})
  }
}
