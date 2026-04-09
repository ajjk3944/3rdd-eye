package gg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6467d;
import kg.InterfaceC6469f;
import mg.AbstractC6822a;
import ng.InterfaceC6941b;
import ng.InterfaceC6942c;
import ng.InterfaceC6943d;
import og.C7134d;
import org.snmp4j.mp.MPv3;
import qg.m0;
import ug.C8164A;
import ug.C8165B;
import ug.C8166a;
import ug.C8167b;
import ug.C8168c;
import ug.C8170e;
import ug.C8171f;
import ug.C8172g;

/* loaded from: classes4.dex */
public abstract class z<T> implements D {
    public static i B(D d10, D d11) {
        Objects.requireNonNull(d10, "source1 is null");
        Objects.requireNonNull(d11, "source2 is null");
        return i.z0(d10, d11).y0(AbstractC6822a.f(), false, MPv3.MAX_MESSAGE_ID);
    }

    public static i C(Iterable iterable) {
        return i.A0(iterable).x0(AbstractC6822a.f());
    }

    private z T(long j10, TimeUnit timeUnit, y yVar, D d10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.r(new ug.w(this, j10, timeUnit, yVar, d10));
    }

    public static z U(long j10, TimeUnit timeUnit) {
        return V(j10, timeUnit, Gg.a.a());
    }

    public static z V(long j10, TimeUnit timeUnit, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.r(new ug.x(j10, timeUnit, yVar));
    }

    private static z Z(i iVar) {
        return Eg.a.r(new m0(iVar, null));
    }

    public static z a0(D d10) {
        Objects.requireNonNull(d10, "source is null");
        return d10 instanceof z ? Eg.a.r((z) d10) : Eg.a.r(new ug.p(d10));
    }

    public static z b0(D d10, D d11, D d12, D d13, D d14, D d15, kg.j jVar) {
        Objects.requireNonNull(d10, "source1 is null");
        Objects.requireNonNull(d11, "source2 is null");
        Objects.requireNonNull(d12, "source3 is null");
        Objects.requireNonNull(d13, "source4 is null");
        Objects.requireNonNull(d14, "source5 is null");
        Objects.requireNonNull(d15, "source6 is null");
        Objects.requireNonNull(jVar, "zipper is null");
        return g0(AbstractC6822a.n(jVar), d10, d11, d12, d13, d14, d15);
    }

    public static z c0(D d10, D d11, D d12, D d13, D d14, kg.i iVar) {
        Objects.requireNonNull(d10, "source1 is null");
        Objects.requireNonNull(d11, "source2 is null");
        Objects.requireNonNull(d12, "source3 is null");
        Objects.requireNonNull(d13, "source4 is null");
        Objects.requireNonNull(d14, "source5 is null");
        Objects.requireNonNull(iVar, "zipper is null");
        return g0(AbstractC6822a.m(iVar), d10, d11, d12, d13, d14);
    }

    public static z d0(D d10, D d11, D d12, kg.g gVar) {
        Objects.requireNonNull(d10, "source1 is null");
        Objects.requireNonNull(d11, "source2 is null");
        Objects.requireNonNull(d12, "source3 is null");
        Objects.requireNonNull(gVar, "zipper is null");
        return g0(AbstractC6822a.k(gVar), d10, d11, d12);
    }

    public static z e0(D d10, D d11, InterfaceC6465b interfaceC6465b) {
        Objects.requireNonNull(d10, "source1 is null");
        Objects.requireNonNull(d11, "source2 is null");
        Objects.requireNonNull(interfaceC6465b, "zipper is null");
        return g0(AbstractC6822a.j(interfaceC6465b), d10, d11);
    }

    public static z f0(Iterable iterable, kg.n nVar) {
        Objects.requireNonNull(nVar, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return Eg.a.r(new C8165B(iterable, nVar));
    }

    public static z g0(kg.n nVar, D... dArr) {
        Objects.requireNonNull(nVar, "zipper is null");
        Objects.requireNonNull(dArr, "sources is null");
        return dArr.length == 0 ? p(new NoSuchElementException()) : Eg.a.r(new C8164A(dArr, nVar));
    }

    public static z i(C c10) {
        Objects.requireNonNull(c10, "source is null");
        return Eg.a.r(new C8167b(c10));
    }

    public static z j(kg.q qVar) {
        Objects.requireNonNull(qVar, "supplier is null");
        return Eg.a.r(new C8168c(qVar));
    }

    public static z p(Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return q(AbstractC6822a.h(th2));
    }

    public static z q(kg.q qVar) {
        Objects.requireNonNull(qVar, "supplier is null");
        return Eg.a.r(new ug.j(qVar));
    }

    public static z x(Callable callable) {
        Objects.requireNonNull(callable, "callable is null");
        return Eg.a.r(new ug.o(callable));
    }

    public static z z(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return Eg.a.r(new ug.q(obj));
    }

    public final z A(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.r(new ug.r(this, nVar));
    }

    public final i D(D d10) {
        return B(this, d10);
    }

    public final z E(y yVar) {
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.r(new ug.s(this, yVar));
    }

    public final z F(kg.n nVar) {
        Objects.requireNonNull(nVar, "fallbackSupplier is null");
        return Eg.a.r(new ug.u(this, nVar));
    }

    public final z G(kg.n nVar) {
        Objects.requireNonNull(nVar, "itemSupplier is null");
        return Eg.a.r(new ug.t(this, nVar, null));
    }

    public final z H(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return Eg.a.r(new ug.t(this, null, obj));
    }

    public final i I() {
        return W().k1();
    }

    public final i J(InterfaceC6467d interfaceC6467d) {
        return W().m1(interfaceC6467d);
    }

    public final i K(kg.n nVar) {
        return W().n1(nVar);
    }

    public final z L(kg.n nVar) {
        return Z(W().p1(nVar));
    }

    public final InterfaceC6043c M(InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2) {
        Objects.requireNonNull(interfaceC6469f, "onSuccess is null");
        Objects.requireNonNull(interfaceC6469f2, "onError is null");
        og.f fVar = new og.f(interfaceC6469f, interfaceC6469f2);
        a(fVar);
        return fVar;
    }

    protected abstract void N(B b10);

    public final z O(y yVar) {
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.r(new ug.v(this, yVar));
    }

    public final B P(B b10) {
        a(b10);
        return b10;
    }

    public final z Q(long j10, TimeUnit timeUnit) {
        return T(j10, timeUnit, Gg.a.a(), null);
    }

    public final z R(long j10, TimeUnit timeUnit, y yVar, D d10) {
        Objects.requireNonNull(d10, "fallback is null");
        return T(j10, timeUnit, yVar, d10);
    }

    public final z S(long j10, TimeUnit timeUnit, D d10) {
        Objects.requireNonNull(d10, "fallback is null");
        return T(j10, timeUnit, Gg.a.a(), d10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i W() {
        return this instanceof InterfaceC6941b ? ((InterfaceC6941b) this).f() : Eg.a.o(new ug.y(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n X() {
        return this instanceof InterfaceC6942c ? ((InterfaceC6942c) this).d() : Eg.a.p(new rg.m(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s Y() {
        return this instanceof InterfaceC6943d ? ((InterfaceC6943d) this).b() : Eg.a.q(new ug.z(this));
    }

    @Override // gg.D
    public final void a(B b10) {
        Objects.requireNonNull(b10, "observer is null");
        B bD = Eg.a.D(this, b10);
        Objects.requireNonNull(bD, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            N(bD);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final Object d() {
        C7134d c7134d = new C7134d();
        a(c7134d);
        return c7134d.b();
    }

    public final z e() {
        return Eg.a.r(new C8166a(this));
    }

    public final z g(Class cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return A(AbstractC6822a.c(cls));
    }

    public final z h(E e10) {
        Objects.requireNonNull(e10, "transformer is null");
        return a0(e10.a(this));
    }

    public final z k(v vVar) {
        Objects.requireNonNull(vVar, "subscriptionIndicator is null");
        return Eg.a.r(new C8170e(this, vVar));
    }

    public final z l(InterfaceC6464a interfaceC6464a) {
        Objects.requireNonNull(interfaceC6464a, "onFinally is null");
        return Eg.a.r(new C8171f(this, interfaceC6464a));
    }

    public final z m(InterfaceC6469f interfaceC6469f) {
        Objects.requireNonNull(interfaceC6469f, "onError is null");
        return Eg.a.r(new C8172g(this, interfaceC6469f));
    }

    public final z n(InterfaceC6469f interfaceC6469f) {
        Objects.requireNonNull(interfaceC6469f, "onSubscribe is null");
        return Eg.a.r(new ug.h(this, interfaceC6469f));
    }

    public final z o(InterfaceC6469f interfaceC6469f) {
        Objects.requireNonNull(interfaceC6469f, "onSuccess is null");
        return Eg.a.r(new ug.i(this, interfaceC6469f));
    }

    public final n r(kg.p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return Eg.a.p(new rg.g(this, pVar));
    }

    public final z s(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.r(new ug.k(this, nVar));
    }

    public final AbstractC5912b t(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.n(new ug.l(this, nVar));
    }

    public final n u(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.p(new ug.m(this, nVar));
    }

    public final s v(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.q(new sg.l(this, nVar));
    }

    public final i w(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.o(new ug.n(this, nVar));
    }

    public final AbstractC5912b y() {
        return Eg.a.n(new pg.o(this));
    }
}
