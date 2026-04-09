package gg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import mg.AbstractC6822a;
import ng.InterfaceC6941b;
import ng.InterfaceC6942c;
import ng.InterfaceC6943d;
import og.C7135e;
import pg.C7325A;
import pg.C7326B;
import pg.C7327a;
import pg.C7328b;
import pg.C7329c;
import pg.C7330d;
import sg.C7955a;
import sg.C7956b;
import ug.C8169d;

/* renamed from: gg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5912b implements f {
    private AbstractC5912b A(InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, InterfaceC6464a interfaceC6464a2, InterfaceC6464a interfaceC6464a3, InterfaceC6464a interfaceC6464a4) {
        Objects.requireNonNull(interfaceC6469f, "onSubscribe is null");
        Objects.requireNonNull(interfaceC6469f2, "onError is null");
        Objects.requireNonNull(interfaceC6464a, "onComplete is null");
        Objects.requireNonNull(interfaceC6464a2, "onTerminate is null");
        Objects.requireNonNull(interfaceC6464a3, "onAfterTerminate is null");
        Objects.requireNonNull(interfaceC6464a4, "onDispose is null");
        return Eg.a.n(new pg.v(this, interfaceC6469f, interfaceC6469f2, interfaceC6464a, interfaceC6464a2, interfaceC6464a3, interfaceC6464a4));
    }

    public static AbstractC5912b D(Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return Eg.a.n(new pg.k(th2));
    }

    public static AbstractC5912b E(InterfaceC6464a interfaceC6464a) {
        Objects.requireNonNull(interfaceC6464a, "action is null");
        return Eg.a.n(new pg.l(interfaceC6464a));
    }

    public static AbstractC5912b F(Callable callable) {
        Objects.requireNonNull(callable, "callable is null");
        return Eg.a.n(new pg.m(callable));
    }

    public static AbstractC5912b G(Dj.a aVar) {
        Objects.requireNonNull(aVar, "publisher is null");
        return Eg.a.n(new pg.n(aVar));
    }

    public static AbstractC5912b H(Iterable iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return Eg.a.n(new pg.s(iterable));
    }

    public static AbstractC5912b I(f... fVarArr) {
        Objects.requireNonNull(fVarArr, "sources is null");
        return fVarArr.length == 0 ? m() : fVarArr.length == 1 ? j0(fVarArr[0]) : Eg.a.n(new pg.q(fVarArr));
    }

    public static AbstractC5912b J(f... fVarArr) {
        Objects.requireNonNull(fVarArr, "sources is null");
        return Eg.a.n(new pg.r(fVarArr));
    }

    private AbstractC5912b Z(long j10, TimeUnit timeUnit, y yVar, f fVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.n(new pg.z(this, j10, timeUnit, yVar, fVar));
    }

    public static AbstractC5912b a0(long j10, TimeUnit timeUnit) {
        return b0(j10, timeUnit, Gg.a.a());
    }

    public static AbstractC5912b b0(long j10, TimeUnit timeUnit, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.n(new C7325A(j10, timeUnit, yVar));
    }

    private static NullPointerException e0(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    public static AbstractC5912b j0(f fVar) {
        Objects.requireNonNull(fVar, "source is null");
        return fVar instanceof AbstractC5912b ? Eg.a.n((AbstractC5912b) fVar) : Eg.a.n(new pg.p(fVar));
    }

    public static AbstractC5912b m() {
        return Eg.a.n(pg.j.f57968a);
    }

    public static AbstractC5912b o(Iterable iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return Eg.a.n(new C7330d(iterable));
    }

    public static AbstractC5912b p(f... fVarArr) {
        Objects.requireNonNull(fVarArr, "sources is null");
        return fVarArr.length == 0 ? m() : fVarArr.length == 1 ? j0(fVarArr[0]) : Eg.a.n(new C7329c(fVarArr));
    }

    public static AbstractC5912b q(Iterable iterable) {
        return i.A0(iterable).F(AbstractC6822a.f());
    }

    public static AbstractC5912b r(InterfaceC5915e interfaceC5915e) {
        Objects.requireNonNull(interfaceC5915e, "source is null");
        return Eg.a.n(new pg.e(interfaceC5915e));
    }

    public static AbstractC5912b s(kg.q qVar) {
        Objects.requireNonNull(qVar, "supplier is null");
        return Eg.a.n(new pg.f(qVar));
    }

    public final AbstractC5912b B(InterfaceC6469f interfaceC6469f) {
        InterfaceC6469f interfaceC6469fE = AbstractC6822a.e();
        InterfaceC6464a interfaceC6464a = AbstractC6822a.f54016c;
        return A(interfaceC6469f, interfaceC6469fE, interfaceC6464a, interfaceC6464a, interfaceC6464a, interfaceC6464a);
    }

    public final AbstractC5912b C(InterfaceC6464a interfaceC6464a) {
        InterfaceC6469f interfaceC6469fE = AbstractC6822a.e();
        InterfaceC6469f interfaceC6469fE2 = AbstractC6822a.e();
        InterfaceC6464a interfaceC6464a2 = AbstractC6822a.f54016c;
        return A(interfaceC6469fE, interfaceC6469fE2, interfaceC6464a2, interfaceC6464a, interfaceC6464a2, interfaceC6464a2);
    }

    public final AbstractC5912b K(f fVar) {
        Objects.requireNonNull(fVar, "other is null");
        return I(this, fVar);
    }

    public final AbstractC5912b L(y yVar) {
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.n(new pg.t(this, yVar));
    }

    public final AbstractC5912b M() {
        return N(AbstractC6822a.b());
    }

    public final AbstractC5912b N(kg.p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return Eg.a.n(new pg.u(this, pVar));
    }

    public final AbstractC5912b O(kg.n nVar) {
        Objects.requireNonNull(nVar, "fallbackSupplier is null");
        return Eg.a.n(new pg.w(this, nVar));
    }

    public final AbstractC5912b P(kg.n nVar) {
        return G(c0().n1(nVar));
    }

    public final AbstractC5912b Q(kg.n nVar) {
        return G(c0().p1(nVar));
    }

    public final s R(v vVar) {
        Objects.requireNonNull(vVar, "other is null");
        return s.h1(vVar).m(f0());
    }

    public final InterfaceC6043c S() {
        og.i iVar = new og.i();
        e(iVar);
        return iVar;
    }

    public final InterfaceC6043c T(InterfaceC6464a interfaceC6464a) {
        return U(interfaceC6464a, AbstractC6822a.f54019f);
    }

    public final InterfaceC6043c U(InterfaceC6464a interfaceC6464a, InterfaceC6469f interfaceC6469f) {
        Objects.requireNonNull(interfaceC6469f, "onError is null");
        Objects.requireNonNull(interfaceC6464a, "onComplete is null");
        C7135e c7135e = new C7135e(interfaceC6469f, interfaceC6464a);
        e(c7135e);
        return c7135e;
    }

    protected abstract void V(InterfaceC5914d interfaceC5914d);

    public final AbstractC5912b W(y yVar) {
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.n(new pg.x(this, yVar));
    }

    public final AbstractC5912b X(f fVar) {
        Objects.requireNonNull(fVar, "other is null");
        return Eg.a.n(new pg.y(this, fVar));
    }

    public final AbstractC5912b Y(long j10, TimeUnit timeUnit) {
        return Z(j10, timeUnit, Gg.a.a(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i c0() {
        return this instanceof InterfaceC6941b ? ((InterfaceC6941b) this).f() : Eg.a.o(new C7326B(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n d0() {
        return this instanceof InterfaceC6942c ? ((InterfaceC6942c) this).d() : Eg.a.p(new rg.l(this));
    }

    @Override // gg.f
    public final void e(InterfaceC5914d interfaceC5914d) {
        Objects.requireNonNull(interfaceC5914d, "observer is null");
        try {
            InterfaceC5914d interfaceC5914dA = Eg.a.A(this, interfaceC5914d);
            Objects.requireNonNull(interfaceC5914dA, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            V(interfaceC5914dA);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            Eg.a.v(th2);
            throw e0(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s f0() {
        return this instanceof InterfaceC6943d ? ((InterfaceC6943d) this).b() : Eg.a.q(new pg.C(this));
    }

    public final AbstractC5912b g(f fVar) {
        Objects.requireNonNull(fVar, "next is null");
        return Eg.a.n(new C7327a(this, fVar));
    }

    public final z g0(kg.q qVar) {
        Objects.requireNonNull(qVar, "completionValueSupplier is null");
        return Eg.a.r(new pg.D(this, qVar, null));
    }

    public final i h(Dj.a aVar) {
        Objects.requireNonNull(aVar, "next is null");
        return Eg.a.o(new C7956b(this, aVar));
    }

    public final z h0(Object obj) {
        Objects.requireNonNull(obj, "completionValue is null");
        return Eg.a.r(new pg.D(this, null, obj));
    }

    public final n i(r rVar) {
        Objects.requireNonNull(rVar, "next is null");
        return Eg.a.p(new rg.d(rVar, this));
    }

    public final AbstractC5912b i0(y yVar) {
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.n(new pg.h(this, yVar));
    }

    public final s j(v vVar) {
        Objects.requireNonNull(vVar, "next is null");
        return Eg.a.q(new C7955a(this, vVar));
    }

    public final z k(D d10) {
        Objects.requireNonNull(d10, "next is null");
        return Eg.a.r(new C8169d(d10, this));
    }

    public final AbstractC5912b l() {
        return Eg.a.n(new C7328b(this));
    }

    public final AbstractC5912b n(g gVar) {
        Objects.requireNonNull(gVar, "transformer is null");
        return j0(gVar.a(this));
    }

    public final AbstractC5912b t(long j10, TimeUnit timeUnit) {
        return v(j10, timeUnit, Gg.a.a(), false);
    }

    public final AbstractC5912b u(long j10, TimeUnit timeUnit, y yVar) {
        return v(j10, timeUnit, yVar, false);
    }

    public final AbstractC5912b v(long j10, TimeUnit timeUnit, y yVar, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.n(new pg.g(this, j10, timeUnit, yVar, z10));
    }

    public final AbstractC5912b w(InterfaceC6464a interfaceC6464a) {
        Objects.requireNonNull(interfaceC6464a, "onFinally is null");
        return Eg.a.n(new pg.i(this, interfaceC6464a));
    }

    public final AbstractC5912b x(InterfaceC6464a interfaceC6464a) {
        InterfaceC6469f interfaceC6469fE = AbstractC6822a.e();
        InterfaceC6469f interfaceC6469fE2 = AbstractC6822a.e();
        InterfaceC6464a interfaceC6464a2 = AbstractC6822a.f54016c;
        return A(interfaceC6469fE, interfaceC6469fE2, interfaceC6464a, interfaceC6464a2, interfaceC6464a2, interfaceC6464a2);
    }

    public final AbstractC5912b y(InterfaceC6464a interfaceC6464a) {
        InterfaceC6469f interfaceC6469fE = AbstractC6822a.e();
        InterfaceC6469f interfaceC6469fE2 = AbstractC6822a.e();
        InterfaceC6464a interfaceC6464a2 = AbstractC6822a.f54016c;
        return A(interfaceC6469fE, interfaceC6469fE2, interfaceC6464a2, interfaceC6464a2, interfaceC6464a2, interfaceC6464a);
    }

    public final AbstractC5912b z(InterfaceC6469f interfaceC6469f) {
        InterfaceC6469f interfaceC6469fE = AbstractC6822a.e();
        InterfaceC6464a interfaceC6464a = AbstractC6822a.f54016c;
        return A(interfaceC6469fE, interfaceC6469f, interfaceC6464a, interfaceC6464a, interfaceC6464a, interfaceC6464a);
    }
}
