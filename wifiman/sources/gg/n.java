package gg;

import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import mg.AbstractC6822a;
import ng.InterfaceC6941b;
import ng.InterfaceC6943d;
import rg.C7608b;

/* loaded from: classes4.dex */
public abstract class n implements r {
    public static n c(q qVar) {
        Objects.requireNonNull(qVar, "onSubscribe is null");
        return Eg.a.p(new C7608b(qVar));
    }

    public static n h() {
        return Eg.a.p(rg.e.f60527a);
    }

    public static n i(Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return Eg.a.p(new rg.f(th2));
    }

    public static n m(Callable callable) {
        Objects.requireNonNull(callable, "callable is null");
        return Eg.a.p(new rg.k(callable));
    }

    public static n o(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return Eg.a.p(new rg.p(obj));
    }

    public static i q(r... rVarArr) {
        Objects.requireNonNull(rVarArr, "sources is null");
        return i.z0(rVarArr).w0(AbstractC6822a.f(), true, Math.max(1, rVarArr.length));
    }

    public static i r(r rVar, r rVar2) {
        Objects.requireNonNull(rVar, "source1 is null");
        Objects.requireNonNull(rVar2, "source2 is null");
        return q(rVar, rVar2);
    }

    public static n y(long j10, TimeUnit timeUnit) {
        return z(j10, timeUnit, Gg.a.a());
    }

    public static n z(long j10, TimeUnit timeUnit, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.p(new rg.v(Math.max(0L, j10), timeUnit, yVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i A() {
        return this instanceof InterfaceC6941b ? ((InterfaceC6941b) this).f() : Eg.a.o(new rg.w(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s B() {
        return this instanceof InterfaceC6943d ? ((InterfaceC6943d) this).b() : Eg.a.q(new rg.x(this));
    }

    @Override // gg.r
    public final void a(p pVar) {
        Objects.requireNonNull(pVar, "observer is null");
        p pVarB = Eg.a.B(this, pVar);
        Objects.requireNonNull(pVarB, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            v(pVarB);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final n d(long j10, TimeUnit timeUnit) {
        return e(j10, timeUnit, Gg.a.a(), false);
    }

    public final n e(long j10, TimeUnit timeUnit, y yVar, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.p(new rg.c(this, Math.max(0L, j10), timeUnit, yVar, z10));
    }

    public final n g(InterfaceC6469f interfaceC6469f) {
        InterfaceC6469f interfaceC6469fE = AbstractC6822a.e();
        Objects.requireNonNull(interfaceC6469f, "onSuccess is null");
        InterfaceC6469f interfaceC6469fE2 = AbstractC6822a.e();
        InterfaceC6464a interfaceC6464a = AbstractC6822a.f54016c;
        return Eg.a.p(new rg.s(this, interfaceC6469fE, interfaceC6469f, interfaceC6469fE2, interfaceC6464a, interfaceC6464a, interfaceC6464a));
    }

    public final n j(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.p(new rg.j(this, nVar));
    }

    public final AbstractC5912b k(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.n(new rg.h(this, nVar));
    }

    public final n l(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.p(new rg.i(this, nVar));
    }

    public final AbstractC5912b n() {
        return Eg.a.n(new rg.o(this));
    }

    public final n p(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.p(new rg.q(this, nVar));
    }

    public final n s(kg.n nVar) {
        Objects.requireNonNull(nVar, "fallbackSupplier is null");
        return Eg.a.p(new rg.r(this, nVar));
    }

    public final i t() {
        return u(Long.MAX_VALUE);
    }

    public final i u(long j10) {
        return A().l1(j10);
    }

    protected abstract void v(p pVar);

    public final n w(r rVar) {
        Objects.requireNonNull(rVar, "other is null");
        return Eg.a.p(new rg.t(this, rVar));
    }

    public final z x(D d10) {
        Objects.requireNonNull(d10, "other is null");
        return Eg.a.r(new rg.u(this, d10));
    }
}
