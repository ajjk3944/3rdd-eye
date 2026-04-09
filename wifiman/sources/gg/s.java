package gg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6466c;
import kg.InterfaceC6469f;
import mg.AbstractC6822a;
import mg.AbstractC6823b;
import org.snmp4j.mp.MPv3;
import qg.W;
import sg.C7964j;
import tg.C8086A;
import tg.C8087B;
import tg.C8089D;
import tg.C8091b;
import tg.C8093d;
import tg.C8095f;
import tg.C8096g;
import tg.C8097h;
import tg.C8098i;
import tg.C8099j;
import tg.C8100k;
import tg.C8101l;
import tg.C8102m;
import tg.C8103n;
import tg.C8104o;
import tg.C8106q;
import tg.C8107s;
import tg.C8108t;
import tg.C8109u;
import tg.C8110v;
import tg.C8112x;
import tg.C8113y;
import tg.C8114z;
import tg.F;
import tg.G;
import tg.I;
import tg.J;
import tg.K;
import tg.L;
import tg.M;
import tg.N;
import tg.O;
import tg.P;
import tg.Q;
import tg.S;
import tg.T;
import tg.V;
import tg.X;
import tg.Y;
import tg.Z;
import tg.a0;
import tg.b0;
import tg.c0;
import tg.d0;
import tg.e0;
import tg.f0;
import tg.g0;
import tg.h0;
import tg.i0;
import tg.j0;
import tg.k0;
import tg.l0;
import tg.m0;
import tg.n0;
import tg.o0;
import tg.p0;
import zg.EnumC8754g;

/* loaded from: classes4.dex */
public abstract class s implements v {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47901a;

        static {
            int[] iArr = new int[EnumC5911a.values().length];
            f47901a = iArr;
            try {
                iArr[EnumC5911a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47901a[EnumC5911a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47901a[EnumC5911a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47901a[EnumC5911a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private s C(InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, InterfaceC6464a interfaceC6464a2) {
        Objects.requireNonNull(interfaceC6469f, "onNext is null");
        Objects.requireNonNull(interfaceC6469f2, "onError is null");
        Objects.requireNonNull(interfaceC6464a, "onComplete is null");
        Objects.requireNonNull(interfaceC6464a2, "onAfterTerminate is null");
        return Eg.a.q(new C8103n(this, interfaceC6469f, interfaceC6469f2, interfaceC6464a, interfaceC6464a2));
    }

    public static s K() {
        return Eg.a.q(C8107s.f62565a);
    }

    public static s L(Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return M(AbstractC6822a.h(th2));
    }

    public static s M(kg.q qVar) {
        Objects.requireNonNull(qVar, "supplier is null");
        return Eg.a.q(new C8108t(qVar));
    }

    private s Z0(long j10, TimeUnit timeUnit, v vVar, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.q(new m0(this, j10, timeUnit, yVar, vVar));
    }

    public static s a0(Object... objArr) {
        Objects.requireNonNull(objArr, "items is null");
        return objArr.length == 0 ? K() : objArr.length == 1 ? h0(objArr[0]) : Eg.a.q(new C8086A(objArr));
    }

    private s a1(v vVar, kg.n nVar, v vVar2) {
        Objects.requireNonNull(nVar, "itemTimeoutIndicator is null");
        return Eg.a.q(new l0(this, vVar, nVar, vVar2));
    }

    public static s b(Iterable iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return Eg.a.q(new C8091b(null, iterable));
    }

    public static s b0(Callable callable) {
        Objects.requireNonNull(callable, "callable is null");
        return Eg.a.q(new C8087B(callable));
    }

    public static s b1(long j10, TimeUnit timeUnit) {
        return c1(j10, timeUnit, Gg.a.a());
    }

    public static s c0(Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return Eg.a.q(new C8089D(iterable));
    }

    public static s c1(long j10, TimeUnit timeUnit, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.q(new n0(Math.max(j10, 0L), timeUnit, yVar));
    }

    public static int e() {
        return i.i();
    }

    public static s g0(long j10, long j11, TimeUnit timeUnit, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.q(new K(Math.max(0L, j10), Math.max(0L, j11), timeUnit, yVar));
    }

    public static s h0(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return Eg.a.q(new L(obj));
    }

    public static s h1(v vVar) {
        Objects.requireNonNull(vVar, "source is null");
        return vVar instanceof s ? Eg.a.q((s) vVar) : Eg.a.q(new F(vVar));
    }

    public static s i(v vVar, v vVar2) {
        Objects.requireNonNull(vVar, "source1 is null");
        Objects.requireNonNull(vVar2, "source2 is null");
        return k(vVar, vVar2);
    }

    public static s j(Iterable iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return c0(iterable).l(AbstractC6822a.f(), false, e());
    }

    public static s j0(v vVar, v vVar2) {
        Objects.requireNonNull(vVar, "source1 is null");
        Objects.requireNonNull(vVar2, "source2 is null");
        return a0(vVar, vVar2).S(AbstractC6822a.f(), false, 2);
    }

    public static s k(v... vVarArr) {
        Objects.requireNonNull(vVarArr, "sources is null");
        return vVarArr.length == 0 ? K() : vVarArr.length == 1 ? h1(vVarArr[0]) : Eg.a.q(new C8093d(a0(vVarArr), AbstractC6822a.f(), e(), EnumC8754g.BOUNDARY));
    }

    public static s k0(v vVar, v vVar2, v vVar3) {
        Objects.requireNonNull(vVar, "source1 is null");
        Objects.requireNonNull(vVar2, "source2 is null");
        Objects.requireNonNull(vVar3, "source3 is null");
        return a0(vVar, vVar2, vVar3).S(AbstractC6822a.f(), false, 3);
    }

    public static s n0() {
        return Eg.a.q(O.f62179a);
    }

    public static s o(u uVar) {
        Objects.requireNonNull(uVar, "source is null");
        return Eg.a.q(new C8096g(uVar));
    }

    public static s r(kg.q qVar) {
        Objects.requireNonNull(qVar, "supplier is null");
        return Eg.a.q(new C8098i(qVar));
    }

    public final s A(InterfaceC6464a interfaceC6464a) {
        return E(AbstractC6822a.e(), interfaceC6464a);
    }

    public final s A0(kg.n nVar) {
        Objects.requireNonNull(nVar, "handler is null");
        return Eg.a.q(new Z(this, nVar));
    }

    public final s B(x xVar) {
        Objects.requireNonNull(xVar, "observer is null");
        return C(J.c(xVar), J.b(xVar), J.a(xVar), AbstractC6822a.f54016c);
    }

    public final s B0(Object obj, InterfaceC6465b interfaceC6465b) {
        Objects.requireNonNull(obj, "initialValue is null");
        return C0(AbstractC6822a.h(obj), interfaceC6465b);
    }

    public final s C0(kg.q qVar, InterfaceC6465b interfaceC6465b) {
        Objects.requireNonNull(qVar, "seedSupplier is null");
        Objects.requireNonNull(interfaceC6465b, "accumulator is null");
        return Eg.a.q(new b0(this, qVar, interfaceC6465b));
    }

    public final s D(InterfaceC6469f interfaceC6469f) {
        InterfaceC6469f interfaceC6469fE = AbstractC6822a.e();
        InterfaceC6464a interfaceC6464a = AbstractC6822a.f54016c;
        return C(interfaceC6469fE, interfaceC6469f, interfaceC6464a, interfaceC6464a);
    }

    public final s D0() {
        return r0().l1();
    }

    public final s E(InterfaceC6469f interfaceC6469f, InterfaceC6464a interfaceC6464a) {
        Objects.requireNonNull(interfaceC6469f, "onSubscribe is null");
        Objects.requireNonNull(interfaceC6464a, "onDispose is null");
        return Eg.a.q(new C8104o(this, interfaceC6469f, interfaceC6464a));
    }

    public final n E0() {
        return Eg.a.p(new c0(this));
    }

    public final s F(InterfaceC6469f interfaceC6469f) {
        InterfaceC6469f interfaceC6469fE = AbstractC6822a.e();
        InterfaceC6464a interfaceC6464a = AbstractC6822a.f54016c;
        return C(interfaceC6469f, interfaceC6469fE, interfaceC6464a, interfaceC6464a);
    }

    public final z F0() {
        return Eg.a.r(new d0(this, null));
    }

    public final s G(InterfaceC6469f interfaceC6469f) {
        return E(interfaceC6469f, AbstractC6822a.f54016c);
    }

    public final s G0(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? Eg.a.q(this) : Eg.a.q(new e0(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 expected but it was " + j10);
    }

    public final s H(InterfaceC6464a interfaceC6464a) {
        Objects.requireNonNull(interfaceC6464a, "onTerminate is null");
        return C(AbstractC6822a.e(), AbstractC6822a.a(interfaceC6464a), interfaceC6464a, AbstractC6822a.f54016c);
    }

    public final s H0(D d10) {
        Objects.requireNonNull(d10, "other is null");
        return i(z.a0(d10).Y(), this);
    }

    public final n I(long j10) {
        if (j10 >= 0) {
            return Eg.a.p(new C8106q(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final s I0(Object obj) {
        return k(h0(obj), this);
    }

    public final z J(long j10) {
        if (j10 >= 0) {
            return Eg.a.r(new tg.r(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final InterfaceC6043c J0(InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2) {
        return K0(interfaceC6469f, interfaceC6469f2, AbstractC6822a.f54016c);
    }

    public final InterfaceC6043c K0(InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a) {
        Objects.requireNonNull(interfaceC6469f, "onNext is null");
        Objects.requireNonNull(interfaceC6469f2, "onError is null");
        Objects.requireNonNull(interfaceC6464a, "onComplete is null");
        og.j jVar = new og.j(interfaceC6469f, interfaceC6469f2, interfaceC6464a, AbstractC6822a.e());
        d(jVar);
        return jVar;
    }

    protected abstract void L0(x xVar);

    public final s M0(y yVar) {
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.q(new f0(this, yVar));
    }

    public final s N(kg.p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return Eg.a.q(new C8109u(this, pVar));
    }

    public final x N0(x xVar) {
        d(xVar);
        return xVar;
    }

    public final n O() {
        return I(0L);
    }

    public final s O0(kg.n nVar) {
        return P0(nVar, e());
    }

    public final z P() {
        return J(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s P0(kg.n nVar, int i10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "bufferSize");
        if (!(this instanceof Dg.e)) {
            return Eg.a.q(new g0(this, nVar, i10, false));
        }
        Object obj = ((Dg.e) this).get();
        return obj == null ? K() : a0.a(obj, nVar);
    }

    public final s Q(kg.n nVar) {
        return R(nVar, false);
    }

    public final AbstractC5912b Q0(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.n(new C7964j(this, nVar, false));
    }

    public final s R(kg.n nVar, boolean z10) {
        return S(nVar, z10, MPv3.MAX_MESSAGE_ID);
    }

    public final s R0(long j10) {
        if (j10 >= 0) {
            return Eg.a.q(new h0(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    public final s S(kg.n nVar, boolean z10, int i10) {
        return T(nVar, z10, i10, e());
    }

    public final s S0(long j10, TimeUnit timeUnit, y yVar) {
        return T0(c1(j10, timeUnit, yVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s T(kg.n nVar, boolean z10, int i10, int i11) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "maxConcurrency");
        AbstractC6823b.b(i11, "bufferSize");
        if (!(this instanceof Dg.e)) {
            return Eg.a.q(new C8110v(this, nVar, z10, i10, i11));
        }
        Object obj = ((Dg.e) this).get();
        return obj == null ? K() : a0.a(obj, nVar);
    }

    public final s T0(v vVar) {
        Objects.requireNonNull(vVar, "other is null");
        return Eg.a.q(new i0(this, vVar));
    }

    public final AbstractC5912b U(kg.n nVar) {
        return V(nVar, false);
    }

    public final s U0(kg.p pVar) {
        Objects.requireNonNull(pVar, "stopPredicate is null");
        return Eg.a.q(new j0(this, pVar));
    }

    public final AbstractC5912b V(kg.n nVar, boolean z10) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.n(new C8112x(this, nVar, z10));
    }

    public final s V0(kg.p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return Eg.a.q(new k0(this, pVar));
    }

    public final s W(kg.n nVar) {
        return X(nVar, false);
    }

    public final s W0(long j10, TimeUnit timeUnit) {
        return Z0(j10, timeUnit, null, Gg.a.a());
    }

    public final s X(kg.n nVar, boolean z10) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.q(new C8113y(this, nVar, z10));
    }

    public final s X0(long j10, TimeUnit timeUnit, y yVar, v vVar) {
        Objects.requireNonNull(vVar, "fallback is null");
        return Z0(j10, timeUnit, vVar, yVar);
    }

    public final s Y(kg.n nVar) {
        return Z(nVar, false);
    }

    public final s Y0(v vVar, kg.n nVar) {
        Objects.requireNonNull(vVar, "firstTimeoutIndicator is null");
        return a1(vVar, nVar, null);
    }

    public final s Z(kg.n nVar, boolean z10) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.q(new C8114z(this, nVar, z10));
    }

    @Override // gg.v
    public final void d(x xVar) {
        Objects.requireNonNull(xVar, "observer is null");
        try {
            x xVarC = Eg.a.C(this, xVar);
            Objects.requireNonNull(xVarC, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            L0(xVarC);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            Eg.a.v(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final s d0(kg.n nVar) {
        return e0(nVar, AbstractC6822a.f(), false, e());
    }

    public final i d1(EnumC5911a enumC5911a) {
        Objects.requireNonNull(enumC5911a, "strategy is null");
        qg.E e10 = new qg.E(this);
        int i10 = a.f47901a[enumC5911a.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? e10.a1() : Eg.a.o(new W(e10)) : e10 : e10.e1() : e10.c1();
    }

    public final s e0(kg.n nVar, kg.n nVar2, boolean z10, int i10) {
        Objects.requireNonNull(nVar, "keySelector is null");
        Objects.requireNonNull(nVar2, "valueSelector is null");
        AbstractC6823b.b(i10, "bufferSize");
        return Eg.a.q(new G(this, nVar, nVar2, i10, z10));
    }

    public final s e1(y yVar) {
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.q(new o0(this, yVar));
    }

    public final s f(Class cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return i0(AbstractC6822a.c(cls));
    }

    public final AbstractC5912b f0() {
        return Eg.a.n(new I(this));
    }

    public final s f1(v vVar) {
        return g1(vVar, e());
    }

    public final s g(w wVar) {
        Objects.requireNonNull(wVar, "composer is null");
        return h1(wVar.b(this));
    }

    public final s g1(v vVar, int i10) {
        Objects.requireNonNull(vVar, "boundaryIndicator is null");
        AbstractC6823b.b(i10, "bufferSize");
        return Eg.a.q(new p0(this, vVar, i10));
    }

    public final s i0(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.q(new M(this, nVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s l(kg.n nVar, boolean z10, int i10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "bufferSize");
        if (!(this instanceof Dg.e)) {
            return Eg.a.q(new C8093d(this, nVar, i10, z10 ? EnumC8754g.END : EnumC8754g.BOUNDARY));
        }
        Object obj = ((Dg.e) this).get();
        return obj == null ? K() : a0.a(obj, nVar);
    }

    public final s l0(f fVar) {
        Objects.requireNonNull(fVar, "other is null");
        return Eg.a.q(new N(this, fVar));
    }

    public final s m(v vVar) {
        Objects.requireNonNull(vVar, "other is null");
        return i(this, vVar);
    }

    public final s m0(v vVar) {
        Objects.requireNonNull(vVar, "other is null");
        return j0(this, vVar);
    }

    public final z n() {
        return Eg.a.r(new C8095f(this));
    }

    public final s o0(y yVar) {
        return p0(yVar, false, e());
    }

    public final s p(long j10, TimeUnit timeUnit) {
        return q(j10, timeUnit, Gg.a.a());
    }

    public final s p0(y yVar, boolean z10, int i10) {
        Objects.requireNonNull(yVar, "scheduler is null");
        AbstractC6823b.b(i10, "bufferSize");
        return Eg.a.q(new P(this, yVar, z10, i10));
    }

    public final s q(long j10, TimeUnit timeUnit, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.q(new C8097h(this, j10, timeUnit, yVar, null));
    }

    public final s q0(kg.n nVar) {
        Objects.requireNonNull(nVar, "fallbackSupplier is null");
        return Eg.a.q(new Q(this, nVar));
    }

    public final Bg.a r0() {
        return Eg.a.m(new S(this));
    }

    public final s s(long j10, TimeUnit timeUnit, y yVar) {
        return t(j10, timeUnit, yVar, false);
    }

    public final s s0(kg.n nVar) {
        Objects.requireNonNull(nVar, "selector is null");
        return Eg.a.q(new T(this, nVar));
    }

    public final s t(long j10, TimeUnit timeUnit, y yVar, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.q(new C8099j(this, j10, timeUnit, yVar, z10));
    }

    public final s t0() {
        return u0(Long.MAX_VALUE);
    }

    public final s u(v vVar) {
        Objects.requireNonNull(vVar, "subscriptionIndicator is null");
        return Eg.a.q(new C8100k(this, vVar));
    }

    public final s u0(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? K() : Eg.a.q(new V(this, j10));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final s v() {
        return x(AbstractC6822a.f());
    }

    public final s v0(kg.n nVar) {
        Objects.requireNonNull(nVar, "handler is null");
        return Eg.a.q(new tg.W(this, nVar));
    }

    public final s w(InterfaceC6466c interfaceC6466c) {
        Objects.requireNonNull(interfaceC6466c, "comparer is null");
        return Eg.a.q(new C8101l(this, AbstractC6822a.f(), interfaceC6466c));
    }

    public final Bg.a w0() {
        return X.r1(this);
    }

    public final s x(kg.n nVar) {
        Objects.requireNonNull(nVar, "keySelector is null");
        return Eg.a.q(new C8101l(this, nVar, AbstractC6823b.a()));
    }

    public final Bg.a x0(int i10) {
        AbstractC6823b.b(i10, "bufferSize");
        return X.p1(this, i10, false);
    }

    public final s y(InterfaceC6464a interfaceC6464a) {
        Objects.requireNonNull(interfaceC6464a, "onFinally is null");
        return Eg.a.q(new C8102m(this, interfaceC6464a));
    }

    public final s y0(long j10, kg.p pVar) {
        if (j10 >= 0) {
            Objects.requireNonNull(pVar, "predicate is null");
            return Eg.a.q(new Y(this, j10, pVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final s z(InterfaceC6464a interfaceC6464a) {
        return C(AbstractC6822a.e(), AbstractC6822a.e(), interfaceC6464a, AbstractC6822a.f54016c);
    }

    public final s z0(kg.p pVar) {
        return y0(Long.MAX_VALUE, pVar);
    }
}
