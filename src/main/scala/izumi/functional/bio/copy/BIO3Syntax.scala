package izumi.functional.bio.copy

object BIO3Syntax {

  trait BIO3ImplicitPuns extends BIO3ImplicitPuns1 {
    final def BIOTemporal3(self: Object): Unit = ()
    final def BIOTemporal3(implicit dummy: DummyImplicit): DummyImplicit = dummy

    final def BIOFork3(self: Object): Unit = ()
    final def BIOFork3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns1 extends BIO3ImplicitPuns2 {
    final def BIOAsync3(self: Object): Unit = ()
    final def BIOAsync3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns2 extends BIO3ImplicitPuns3 {
    final def BIOConcurrent3(self: Object): Unit = ()
    final def BIOConcurrent3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns3 extends BIO3ImplicitPuns4 {
    final def BIOParallel3(self: Object): Unit = ()
    final def BIOParallel3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns4 extends BIO3ImplicitPuns5 {
    final def BIO3(self: Object): Unit = ()
    final def BIO3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns5 extends BIO3ImplicitPuns6 {
    final def BIOPanic3(self: Object): Unit = ()
    final def BIOPanic3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns6 extends BIO3ImplicitPuns7 {
    final def BIOBracket3(self: Object): Unit = ()
    final def BIOBracket3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns7 extends BIO3ImplicitPuns8 {
    final def BIOError3(self: Object): Unit = ()
    final def BIOError3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns8 extends BIO3ImplicitPuns9 {
    final def BIOApplicativeError3(self: Object): Unit = ()
    final def BIOApplicativeError3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns9 extends BIO3ImplicitPuns10 {
    final def BIOGuarantee3(self: Object): Unit = ()
    final def BIOGuarantee3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns10 extends BIO3ImplicitPuns11 {
    final def BIOMonad3(self: Object): Unit = ()
    final def BIOMonad3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns11 extends BIO3ImplicitPuns12 {
    final def BIOApplicative3(self: Object): Unit = ()
    final def BIOApplicative3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns12 extends BIO3ImplicitPuns13 {
    final def BIOBifunctor3(self: Object): Unit = ()
    final def BIOBifunctor3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIO3ImplicitPuns13 extends BIOImplicitPuns14 {
    final def BIOFunctor3(self: Object): Unit = ()
    final def BIOFunctor3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIOImplicitPuns14 extends BIOImplicitPuns15 {
    // Note, as long as these auxilary conversions to BIOMonad/Applicative/Functor syntaxes etc.
    // have the same output type as BIOMonad3/etc conversions above, they will avoid the specificity rule
    // and _will not_ clash (because the outputs are equal, not <:<).
    // If you merge them into `BIOLocalSyntax with BIOMonad3`, they _will_ start clashing

    final def BIOLocal(self: Object)(implicit d1: DummyImplicit): Unit = ()
    final def BIOLocal(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIOImplicitPuns15 extends BIOImplicitPuns16 {
    final def BIOMonadAsk(self: Object): Unit = ()
    final def BIOMonadAsk(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIOImplicitPuns16 extends BIOImplicitPuns17 {
    final def BIOAsk(self: Object): Unit = ()
    final def BIOAsk(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIOImplicitPuns17 extends BIOImplicitPuns18 {
    final def BIOArrowChoice(self: Object): Unit = ()
    final def BIOArrowChoice(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIOImplicitPuns18 extends BIOImplicitPuns19 {
    final def BIOArrow(self: Object): Unit = ()
    final def BIOArrow(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIOImplicitPuns19 extends BIOImplicitPuns20 {
    final def BIOProfunctor(self: Object): Unit = ()
    final def BIOProfunctor(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }
  trait BIOImplicitPuns20 {
    @deprecated("Use Error3", "0.11")
    final def BIOMonadError3(self: Object): Unit = ()
    @deprecated("Use Error3", "0.11")
    final def BIOMonadError3(implicit dummy: DummyImplicit): DummyImplicit = dummy
  }

}
