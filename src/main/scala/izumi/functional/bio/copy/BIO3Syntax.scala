package izumi.functional.bio.copy

import izumi.functional.bio.{Applicative3, ApplicativeError3, Arrow3, ArrowChoice3, Ask3, Async3, Bifunctor3, Bracket3, Concurrent3, Error3, Fork3, Functor3, Guarantee3, IO3, Local3, Monad3, Panic3, Parallel3, Profunctor3, Temporal3}

import scala.language.implicitConversions

object BIO3Syntax {

  trait BIO3ImplicitPuns extends BIO3ImplicitPuns1 {
    implicit final def BIOTemporal3[FR[-_, +_, +_]: Error3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOTemporal3[FR[-_, +_, +_]: Temporal3]: Temporal3[FR] = implicitly

    implicit final def BIOFork3[FR[-_, +_, +_]: Fork3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOFork3[FR[-_, +_, +_]: Fork3]: Fork3[FR] = implicitly
  }
  trait BIO3ImplicitPuns1 extends BIO3ImplicitPuns2 {
    implicit final def BIOAsync3[FR[-_, +_, +_]: Async3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOAsync3[FR[-_, +_, +_]: Async3]: Async3[FR] = implicitly
  }
  trait BIO3ImplicitPuns2 extends BIO3ImplicitPuns3 {
    implicit final def BIOConcurrent3[FR[-_, +_, +_]: Panic3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOConcurrent3[FR[-_, +_, +_]: Concurrent3]: Concurrent3[FR] = implicitly
  }
  trait BIO3ImplicitPuns3 extends BIO3ImplicitPuns4 {
    implicit final def BIOParallel3[F[-_, +_, +_]: Monad3, R, E, A](self: F[R, E, A]): Unit = ()
    final def BIOParallel3[FR[-_, +_, +_]: Parallel3]: Parallel3[FR] = implicitly
  }
  trait BIO3ImplicitPuns4 extends BIO3ImplicitPuns5 {
    implicit final def BIO3[FR[-_, +_, +_]: IO3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIO3[FR[-_, +_, +_]: IO3]: IO3[FR] = implicitly
  }
  trait BIO3ImplicitPuns5 extends BIO3ImplicitPuns6 {
    implicit final def BIOPanic3[FR[-_, +_, +_]: Panic3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOPanic3[FR[-_, +_, +_]: Panic3]: Panic3[FR] = implicitly
  }
  trait BIO3ImplicitPuns6 extends BIO3ImplicitPuns7 {
    implicit final def BIOBracket3[FR[-_, +_, +_]: Bracket3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOBracket3[FR[-_, +_, +_]: Bracket3]: Bracket3[FR] = implicitly
  }
  trait BIO3ImplicitPuns7 extends BIO3ImplicitPuns8 {
    implicit final def BIOError3[FR[-_, +_, +_]: Error3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOError3[FR[-_, +_, +_]: Error3]: Error3[FR] = implicitly
  }
  trait BIO3ImplicitPuns8 extends BIO3ImplicitPuns9 {
    implicit final def BIOApplicativeError3[FR[-_, +_, +_]: ApplicativeError3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOApplicativeError3[FR[-_, +_, +_]: ApplicativeError3]: ApplicativeError3[FR] = implicitly
  }
  trait BIO3ImplicitPuns9 extends BIO3ImplicitPuns10 {
    implicit final def BIOGuarantee3[FR[-_, +_, +_]: Guarantee3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOGuarantee3[FR[-_, +_, +_]: Guarantee3]: Guarantee3[FR] = implicitly
  }
  trait BIO3ImplicitPuns10 extends BIO3ImplicitPuns11 {
    implicit final def BIOMonad3[FR[-_, +_, +_]: Monad3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOMonad3[FR[-_, +_, +_]: Monad3]: Monad3[FR] = implicitly
  }
  trait BIO3ImplicitPuns11 extends BIO3ImplicitPuns12 {
    implicit final def BIOApplicative3[FR[-_, +_, +_]: Applicative3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOApplicative3[FR[-_, +_, +_]: Applicative3]: Applicative3[FR] = implicitly
  }
  trait BIO3ImplicitPuns12 extends BIO3ImplicitPuns13 {
    implicit final def BIOBifunctor3[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOBifunctor3[FR[-_, +_, +_]: Bifunctor3]: Bifunctor3[FR] = implicitly
  }
  trait BIO3ImplicitPuns13 extends BIOImplicitPuns14 {
    implicit final def BIOFunctor3[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOFunctor3[FR[-_, +_, +_]: Functor3]: Functor3[FR] = implicitly
  }
  trait BIOImplicitPuns14 extends BIOImplicitPuns15 {
    // Note, as long as these auxilary conversions to BIOMonad/Applicative/Functor syntaxes etc.
    // have the same output type as BIOMonad3/etc conversions above, they will avoid the specificity rule
    // and _will not_ clash (because the outputs are equal, not <:<).
    // If you merge them into `BIOLocalSyntax with BIOMonad3`, they _will_ start clashing

    implicit final def BIOLocal[FR[-_, +_, +_]: Local3, R, E, A](self: FR[R, E, A])(implicit d1: DummyImplicit): Unit = ()
    final def BIOLocal[FR[-_, +_, +_]: Local3]: Local3[FR] = implicitly
  }
  trait BIOImplicitPuns15 extends BIOImplicitPuns16 {
    implicit final def BIOMonadAsk[FR[-_, +_, +_]: Monad3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOMonadAsk[FR[-_, +_, +_]: Ask3]: Ask3[FR] = implicitly
  }
  trait BIOImplicitPuns16 extends BIOImplicitPuns17 {
    implicit final def BIOAsk[FR[-_, +_, +_]: Applicative3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOAsk[FR[-_, +_, +_]: Ask3]: Ask3[FR] = implicitly
  }
  trait BIOImplicitPuns17 extends BIOImplicitPuns18 {
    implicit final def BIOArrowChoice[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOArrowChoice[FR[-_, +_, +_]: ArrowChoice3]: ArrowChoice3[FR] = implicitly
  }
  trait BIOImplicitPuns18 extends BIOImplicitPuns19 {
    implicit final def BIOArrow[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOArrow[FR[-_, +_, +_]: Arrow3]: Arrow3[FR] = implicitly
  }
  trait BIOImplicitPuns19 extends BIOImplicitPuns20 {
    implicit final def BIOProfunctor[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def BIOProfunctor[FR[-_, +_, +_]: Profunctor3]: Profunctor3[FR] = implicitly
  }
  trait BIOImplicitPuns20 {
    @deprecated("Use Error3", "0.11")
    implicit final def BIOMonadError3[FR[-_, +_, +_]: Error3, R, E, A](self: FR[R, E, A]): Unit = ()
    @deprecated("Use Error3", "0.11")
    final def BIOMonadError3[FR[-_, +_, +_]: Error3]: Error3[FR] = implicitly
  }

}
