package izumi.functional.bio.copy

import izumi.functional.bio.{Applicative3, ApplicativeError3, Arrow3, ArrowChoice3, Ask3, Async3, Bifunctor3, Bracket3, Concurrent3, Error3, Fork3, Functor3, Guarantee3, IO3, Local3, Monad3, MonadAsk3, Panic3, Parallel3, Profunctor3, Temporal3}

import scala.language.implicitConversions

// This trait is necessary to reproduce the hang,
// even though it's not used anywhere!
trait Syntax3 extends Syntax3.ImplicitPuns

// In addition, inheriting from library version of `Syntax3.ImplicitPuns` causes native-image exception:
// ```
//   should not reach here: Deadlock creating new types
// ```
//trait Syntax3 extends izumi.functional.bio.syntax.Syntax3.ImplicitPuns

object Syntax3 {

  trait ImplicitPuns extends ImplicitPuns1 {
    implicit final def Temporal3[FR[-_, +_, +_]: Error3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Temporal3[FR[-_, +_, +_]: Temporal3]: Temporal3[FR] = implicitly

    implicit final def Fork3[FR[-_, +_, +_]: Fork3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Fork3[FR[-_, +_, +_]: Fork3]: Fork3[FR] = implicitly
  }
  trait ImplicitPuns1 extends ImplicitPuns2 {
    implicit final def Async3[FR[-_, +_, +_]: Async3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Async3[FR[-_, +_, +_]: Async3]: Async3[FR] = implicitly
  }
  trait ImplicitPuns2 extends ImplicitPuns3 {
    implicit final def Concurrent3[FR[-_, +_, +_]: Panic3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Concurrent3[FR[-_, +_, +_]: Concurrent3]: Concurrent3[FR] = implicitly
  }
  trait ImplicitPuns3 extends ImplicitPuns4 {
    implicit final def Parallel3[F[-_, +_, +_]: Monad3, R, E, A](self: F[R, E, A]): Unit = ()
    final def Parallel3[FR[-_, +_, +_]: Parallel3]: Parallel3[FR] = implicitly
  }
  trait ImplicitPuns4 extends ImplicitPuns5 {
    implicit final def IO3[FR[-_, +_, +_]: IO3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def IO3[FR[-_, +_, +_]: IO3]: IO3[FR] = implicitly
  }
  trait ImplicitPuns5 extends ImplicitPuns6 {
    implicit final def Panic3[FR[-_, +_, +_]: Panic3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Panic3[FR[-_, +_, +_]: Panic3]: Panic3[FR] = implicitly
  }
  trait ImplicitPuns6 extends ImplicitPuns7 {
    implicit final def Bracket3[FR[-_, +_, +_]: Bracket3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Bracket3[FR[-_, +_, +_]: Bracket3]: Bracket3[FR] = implicitly
  }
  trait ImplicitPuns7 extends ImplicitPuns8 {
    implicit final def Error3[FR[-_, +_, +_]: Error3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Error3[FR[-_, +_, +_]: Error3]: Error3[FR] = implicitly
  }
  trait ImplicitPuns8 extends ImplicitPuns9 {
    implicit final def ApplicativeError3[FR[-_, +_, +_]: ApplicativeError3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def ApplicativeError3[FR[-_, +_, +_]: ApplicativeError3]: ApplicativeError3[FR] = implicitly
  }
  trait ImplicitPuns9 extends ImplicitPuns10 {
    implicit final def Guarantee3[FR[-_, +_, +_]: Guarantee3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Guarantee3[FR[-_, +_, +_]: Guarantee3]: Guarantee3[FR] = implicitly
  }
  trait ImplicitPuns10 extends ImplicitPuns11 {
    implicit final def Monad3[FR[-_, +_, +_]: Monad3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Monad3[FR[-_, +_, +_]: Monad3]: Monad3[FR] = implicitly
  }
  trait ImplicitPuns11 extends ImplicitPuns12 {
    implicit final def Applicative3[FR[-_, +_, +_]: Applicative3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Applicative3[FR[-_, +_, +_]: Applicative3]: Applicative3[FR] = implicitly
  }
  trait ImplicitPuns12 extends ImplicitPuns13 {
    implicit final def Bifunctor3[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Bifunctor3[FR[-_, +_, +_]: Bifunctor3]: Bifunctor3[FR] = implicitly
  }
  trait ImplicitPuns13 extends ImplicitPuns14 {
    implicit final def Functor3[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Functor3[FR[-_, +_, +_]: Functor3]: Functor3[FR] = implicitly
  }
  trait ImplicitPuns14 extends ImplicitPuns15 {
    implicit final def Local3[FR[-_, +_, +_]: Local3, R, E, A](self: FR[R, E, A])(implicit d: DummyImplicit): Unit = ()
    final def Local3[FR[-_, +_, +_]: Local3]: Local3[FR] = implicitly
  }
  trait ImplicitPuns15 extends ImplicitPuns16 {
    implicit final def MonadAsk3[FR[-_, +_, +_]: Monad3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def MonadAsk3[FR[-_, +_, +_]: MonadAsk3]: MonadAsk3[FR] = implicitly
  }
  trait ImplicitPuns16 extends ImplicitPuns17 {
    implicit final def Ask3[FR[-_, +_, +_]: Applicative3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Ask3[FR[-_, +_, +_]: Ask3]: Ask3[FR] = implicitly
  }
  trait ImplicitPuns17 extends ImplicitPuns18 {
    implicit final def ArrowChoice3[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def ArrowChoice3[FR[-_, +_, +_]: ArrowChoice3]: ArrowChoice3[FR] = implicitly
  }
  trait ImplicitPuns18 extends ImplicitPuns19 {
    implicit final def Arrow3[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Arrow3[FR[-_, +_, +_]: Arrow3]: Arrow3[FR] = implicitly
  }
  trait ImplicitPuns19 extends BIO3Syntax.BIO3ImplicitPuns {
    implicit final def Profunctor3[FR[-_, +_, +_]: Functor3, R, E, A](self: FR[R, E, A]): Unit = ()
    final def Profunctor3[FR[-_, +_, +_]: Profunctor3]: Profunctor3[FR] = implicitly
  }

}
