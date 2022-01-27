package izumi.functional.bio.copy

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
    final def Temporal3(self: Object): Unit = ()
    final def Temporal3(implicit dummy: DummyImplicit): DummyImplicit = dummy

    final def Fork3(self: Object): Unit = ()
    final def Fork3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns1 extends ImplicitPuns2 {
    final def Async3(self: Object): Unit = ()
    final def Async3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns2 extends ImplicitPuns3 {
    final def Concurrent3(self: Object): Unit = ()
    final def Concurrent3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns3 extends ImplicitPuns4 {
    final def Parallel3(self: Object): Unit = ()
    final def Parallel3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns4 extends ImplicitPuns5 {
    final def IO3(self: Object): Unit = ()
    final def IO3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns5 extends ImplicitPuns6 {
    final def Panic3(self: Object): Unit = ()
    final def Panic3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns6 extends ImplicitPuns7 {
    final def Bracket3(self: Object): Unit = ()
    final def Bracket3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns7 extends ImplicitPuns8 {
    final def Error3(self: Object): Unit = ()
    final def Error3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns8 extends ImplicitPuns9 {
    final def ApplicativeError3(self: Object): Unit = ()
    final def ApplicativeError3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns9 extends ImplicitPuns10 {
    final def Guarantee3(self: Object): Unit = ()
    final def Guarantee3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns10 extends ImplicitPuns11 {
    final def Monad3(self: Object): Unit = ()
    final def Monad3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns11 extends ImplicitPuns12 {
    final def Applicative3(self: Object): Unit = ()
    final def Applicative3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns12 extends ImplicitPuns13 {
    final def Bifunctor3(self: Object): Unit = ()
    final def Bifunctor3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns13 extends ImplicitPuns14 {
    final def Functor3(self: Object): Unit = ()
    final def Functor3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns14 extends ImplicitPuns15 {
    final def Local3(self: Object)(implicit d: DummyImplicit): Unit = ()
    final def Local3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns15 extends ImplicitPuns16 {
    final def MonadAsk3(self: Object): Unit = ()
    final def MonadAsk3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns16 extends ImplicitPuns17 {
    final def Ask3(self: Object): Unit = ()
    final def Ask3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns17 extends ImplicitPuns18 {
    final def ArrowChoice3(self: Object): Unit = ()
    final def ArrowChoice3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns18 extends ImplicitPuns19 {
    final def Arrow3(self: Object): Unit = ()
    final def Arrow3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait ImplicitPuns19 extends BIO3Syntax.BIO3ImplicitPuns {
    final def Profunctor3(self: Object): Unit = ()
    final def Profunctor3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }

}
