package izumi.functional.bio

//import izumi.functional.bio.syntax.BIO3Syntax
//import izumi.functional.bio.syntax.Syntax3.{FunctorOps, ProfunctorOps}

//import scala.language.implicitConversions

//import izumi.functional.bio.impl._
//import izumi.functional.bio.DivergenceHelper.Divergent
//import izumi.functional.bio.Root._
//import izumi.functional.bio.syntax.BIO3Syntax.{BIO3ImplicitPuns, BIOImplicitPuns20}
//import izumi.functional.bio.syntax.{BIO3Syntax, Syntax3}
//import izumi.functional.bio.syntax.Syntax3.{FunctorOps, ImplicitPuns19, ProfunctorOps}

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

//object DeepTraitHierarchy {
//  trait A1 extends A2
//  trait A2 extends A3
//  trait A3 extends A4
//  trait A4 extends A5
//  trait A5 extends A6
//  trait A6 extends A7
//  trait A7 extends A8
//  trait A8 extends A9
//  trait A9 extends A11
//  trait A11 extends A12
//  trait A12 extends A13
//  trait A13 extends A14
//  trait A14 extends A15
//  trait A15 extends A16
//  trait A16 extends A17
//  trait A17 extends A18
//  trait A18 extends A19
//  trait A19 extends A21
//  trait A21 extends A22
//  trait A22 extends A23
//  trait A23 extends A24
//  trait A24 extends A25
//  trait A25 extends A26
//  trait A26 extends A27
//  trait A27 extends A28
//  trait A28 extends A29
//  trait A29 extends A31
//  trait A31 extends A32
//  trait A32 extends A33
//  trait A33 extends A34
//  trait A34 extends A35
//  trait A35 extends A36
//  trait A36 extends A37
//  trait A37 extends A38
//  trait A38 extends A39
//  trait A39 extends ImplicitPuns19
//
//  trait ImplicitPuns19 extends BIO3ImplicitPuns {
//    @inline implicit final def Profunctor3[FR[-_, +_, +_]: Profunctor3, R, E, A](self: FR[R, E, A]): ProfunctorOps[FR, R, E, A] = new ProfunctorOps[FR, R, E, A](self)
//    @inline implicit final def Profunctor3[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): FunctorOps[FR, R, E, A] = new FunctorOps[FR, R, E, A](self)
//    @inline final def Profunctor3[FR[-_, +_, +_]: Profunctor3]: Profunctor3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns extends BIO3ImplicitPuns1 {
//    @inline implicit final def BIOTemporal3[FR[-_, +_, +_]: Temporal3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOTemporal3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOTemporal3Ops[FR, R, E, A](self)
//    @inline implicit final def BIOTemporal3[FR[-_, +_, +_]: Error3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOError3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOError3Ops[FR, R, E, A](self)
//    @inline final def BIOTemporal3[FR[-_, +_, +_]: Temporal3]: Temporal3[FR] = implicitly
////
//    @inline implicit final def BIOFork3[FR[-_, +_, +_]: Fork3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOFork3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOFork3Ops[FR, R, E, A](self)
//    @inline final def BIOFork3[FR[-_, +_, +_]: Fork3]: Fork3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns1 extends BIO3ImplicitPuns2 {
//    @inline implicit final def BIOAsync3[FR[-_, +_, +_]: Async3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOAsync3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOAsync3Ops[FR, R, E, A](self)
//    @inline final def BIOAsync3[FR[-_, +_, +_]: Async3]: Async3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns2 extends BIO3ImplicitPuns3 {
//    @inline implicit final def BIOConcurrent3[FR[-_, +_, +_]: Concurrent3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOConcurrent3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOConcurrent3Ops[FR, R, E, A](self)
//    @inline implicit final def BIOConcurrent3[FR[-_, +_, +_]: Panic3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOPanic3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOPanic3Ops[FR, R, E, A](self)
//    @inline final def BIOConcurrent3[FR[-_, +_, +_]: Concurrent3]: Concurrent3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns3 extends BIO3ImplicitPuns4 {
//    @inline implicit final def BIOParallel3[FR[-_, +_, +_]: Parallel3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOParallel3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOParallel3Ops[FR, R, E, A](self)
//    @inline implicit final def BIOParallel3[F[-_, +_, +_]: Monad3, R, E, A](self: F[R, E, A]): BIO3Syntax.BIOMonad3Ops[F, R, E, A] =
//    new BIO3Syntax.BIOMonad3Ops[F, R, E, A](self)
//    @inline final def BIOParallel3[FR[-_, +_, +_]: Parallel3]: Parallel3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns4 extends BIO3ImplicitPuns5 {
//    @inline implicit final def BIO3[FR[-_, +_, +_]: IO3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIO3Ops[FR, R, E, A] = new BIO3Syntax.BIO3Ops[FR, R, E, A](self)
//  /**
//    * Shorthand for [[IO3#syncThrowable]]
//    *
//    * {{{
//    *   IO3(println("Hello world!"))
//    * }}}
//    */
//    @inline final def BIO3[FR[-_, +_, +_], A](effect: => A)(implicit F: IO3[FR]): FR[Any, Throwable, A] = F.syncThrowable(effect)
//    @inline final def BIO3[FR[-_, +_, +_]: IO3]: IO3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns5 extends BIO3ImplicitPuns6 {
//    @inline implicit final def BIOPanic3[FR[-_, +_, +_]: Panic3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOPanic3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOPanic3Ops[FR, R, E, A](self)
//    @inline final def BIOPanic3[FR[-_, +_, +_]: Panic3]: Panic3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns6 extends BIO3ImplicitPuns7 {
//    @inline implicit final def BIOBracket3[FR[-_, +_, +_]: Bracket3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOBracket3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOBracket3Ops[FR, R, E, A](self)
//    @inline final def BIOBracket3[FR[-_, +_, +_]: Bracket3]: Bracket3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns7 extends BIO3ImplicitPuns8 {
//    @inline implicit final def BIOError3[FR[-_, +_, +_]: Error3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOError3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOError3Ops[FR, R, E, A](self)
//    @inline final def BIOError3[FR[-_, +_, +_]: Error3]: Error3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns8 extends BIO3ImplicitPuns9 {
//    @inline implicit final def BIOApplicativeError3[FR[-_, +_, +_]: ApplicativeError3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOApplicativeError3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOApplicativeError3Ops[FR, R, E, A](self)
//    @inline final def BIOApplicativeError3[FR[-_, +_, +_]: ApplicativeError3]: ApplicativeError3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns9 extends BIO3ImplicitPuns10 {
//    @inline implicit final def BIOGuarantee3[FR[-_, +_, +_]: Guarantee3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOGuarantee3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOGuarantee3Ops[FR, R, E, A](self)
//    @inline final def BIOGuarantee3[FR[-_, +_, +_]: Guarantee3]: Guarantee3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns10 extends BIO3ImplicitPuns11 {
//    @inline implicit final def BIOMonad3[FR[-_, +_, +_]: Monad3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOMonad3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOMonad3Ops[FR, R, E, A](self)
//    @inline final def BIOMonad3[FR[-_, +_, +_]: Monad3]: Monad3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns11 extends BIO3ImplicitPuns12 {
//    @inline implicit final def BIOApplicative3[FR[-_, +_, +_]: Applicative3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOApplicative3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOApplicative3Ops[FR, R, E, A](self)
//    @inline final def BIOApplicative3[FR[-_, +_, +_]: Applicative3]: Applicative3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns12 extends BIO3ImplicitPuns13 {
//    @inline implicit final def BIOBifunctor3[FR[-_, +_, +_]: Bifunctor3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOBifunctor3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOBifunctor3Ops[FR, R, E, A](self)
//    @inline implicit final def BIOBifunctor3[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOFunctor3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOFunctor3Ops[FR, R, E, A](self)
//    @inline final def BIOBifunctor3[FR[-_, +_, +_]: Bifunctor3]: Bifunctor3[FR] = implicitly
//  }
//  trait BIO3ImplicitPuns13 extends BIOImplicitPuns14 {
//    @inline implicit final def BIOFunctor3[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOFunctor3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOFunctor3Ops[FR, R, E, A](self)
//    @inline final def BIOFunctor3[FR[-_, +_, +_]: Functor3]: Functor3[FR] = implicitly
//  }
//  trait BIOImplicitPuns14 extends BIOImplicitPuns15 {
//  // Note, as long as these auxilary conversions to BIOMonad/Applicative/Functor syntaxes etc.
//  // have the same output type as BIOMonad3/etc conversions above, they will avoid the specificity rule
//  // and _will not_ clash (because the outputs are equal, not <:<).
//  // If you merge them into `BIOLocalSyntax with BIOMonad3`, they _will_ start clashing
////
//    @inline implicit final def BIOLocal[FR[-_, +_, +_]: Local3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOLocalOps[FR, R, E, A] =
//    new BIO3Syntax.BIOLocalOps[FR, R, E, A](self)
//    @inline implicit final def BIOLocal[FR[-_, +_, +_]: Monad3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOMonad3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOMonad3Ops[FR, R, E, A](self)
//    @inline implicit final def BIOLocal[FR[-_, +_, +_]: Local3, R, E, A](
//    self: FR[R, E, A]
//  )(implicit d1: DummyImplicit
//  ): BIO3Syntax.BIOLocalOpsKleisliSyntax[FR, R, E, A] = new BIO3Syntax.BIOLocalOpsKleisliSyntax[FR, R, E, A](self)
//    @inline final def BIOLocal[FR[-_, +_, +_]: Local3]: Local3[FR] = implicitly
//  }
//  trait BIOImplicitPuns15 extends BIOImplicitPuns16 {
//    @inline implicit final def BIOMonadAsk[FR[-_, +_, +_]: Monad3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOMonad3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOMonad3Ops[FR, R, E, A](self)
//    @inline final def BIOMonadAsk[FR[-_, +_, +_]: Ask3]: Ask3[FR] = implicitly
//  }
//  trait BIOImplicitPuns16 extends BIOImplicitPuns17 {
//    @inline implicit final def BIOAsk[FR[-_, +_, +_]: Applicative3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOApplicative3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOApplicative3Ops[FR, R, E, A](self)
//    @inline final def BIOAsk[FR[-_, +_, +_]: Ask3]: Ask3[FR] = implicitly
//  }
//  trait BIOImplicitPuns17 extends BIOImplicitPuns18 {
//    @inline implicit final def BIOArrowChoice[FR[-_, +_, +_]: ArrowChoice3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOArrowChoiceOps[FR, R, E, A] =
//    new BIO3Syntax.BIOArrowChoiceOps[FR, R, E, A](self)
//    @inline implicit final def BIOArrowChoice[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOFunctor3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOFunctor3Ops[FR, R, E, A](self)
//    @inline final def BIOArrowChoice[FR[-_, +_, +_]: ArrowChoice3]: ArrowChoice3[FR] = implicitly
//  }
//  trait BIOImplicitPuns18 extends BIOImplicitPuns19 {
//    @inline implicit final def BIOArrow[FR[-_, +_, +_]: Arrow3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOArrowOps[FR, R, E, A] =
//    new BIO3Syntax.BIOArrowOps[FR, R, E, A](self)
//    @inline implicit final def BIOArrow[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOFunctor3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOFunctor3Ops[FR, R, E, A](self)
//    @inline final def BIOArrow[FR[-_, +_, +_]: Arrow3]: Arrow3[FR] = implicitly
//  }
//  trait BIOImplicitPuns19 extends BIOImplicitPuns20 {
//    @inline implicit final def BIOProfunctor[FR[-_, +_, +_]: Profunctor3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOProfunctorOps[FR, R, E, A] =
//    new BIO3Syntax.BIOProfunctorOps[FR, R, E, A](self)
//    @inline implicit final def BIOProfunctor[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOFunctor3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOFunctor3Ops[FR, R, E, A](self)
//    @inline final def BIOProfunctor[FR[-_, +_, +_]: Profunctor3]: Profunctor3[FR] = implicitly
//  }
//  trait BIOImplicitPuns20 {
//    @deprecated("Use Error3", "0.11")
//    @inline implicit final def BIOMonadError3[FR[-_, +_, +_]: Error3, R, E, A](self: FR[R, E, A]): BIO3Syntax.BIOError3Ops[FR, R, E, A] =
//    new BIO3Syntax.BIOError3Ops[FR, R, E, A](self)
//    @deprecated("Use Error3", "0.11")
//    @inline final def BIOMonadError3[FR[-_, +_, +_]: Error3]: Error3[FR] = implicitly
//  }
//
//}
