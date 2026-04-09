package gg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import jg.AbstractC6327a;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6466c;
import kg.InterfaceC6467d;
import kg.InterfaceC6469f;
import mg.AbstractC6822a;
import mg.AbstractC6823b;
import org.snmp4j.mp.MPv3;
import qg.A0;
import qg.C7479A;
import qg.C7480B;
import qg.C7483a0;
import qg.C7485c;
import qg.C7486d;
import qg.C7487e;
import qg.C7488f;
import qg.C7489g;
import qg.C7490h;
import qg.C7491i;
import qg.C7492j;
import qg.C7493k;
import qg.C7494l;
import qg.C7495m;
import qg.C7496n;
import qg.C7497o;
import qg.C7498p;
import qg.C7500s;
import qg.C7501t;
import qg.C7502u;
import qg.C7503v;
import qg.C7504w;
import qg.C7506y;
import qg.C7507z;
import qg.F;
import qg.G;
import qg.I;
import qg.J;
import qg.K;
import qg.L;
import qg.M;
import qg.N;
import qg.O;
import qg.P;
import qg.Q;
import qg.S;
import qg.T;
import qg.U;
import qg.V;
import qg.X;
import qg.Y;
import qg.Z;
import qg.b0;
import qg.d0;
import qg.e0;
import qg.f0;
import qg.g0;
import qg.h0;
import qg.i0;
import qg.j0;
import qg.k0;
import qg.n0;
import qg.o0;
import qg.p0;
import qg.q0;
import qg.r0;
import qg.s0;
import qg.t0;
import qg.u0;
import qg.v0;
import qg.w0;
import qg.x0;
import qg.y0;
import qg.z0;
import sg.C7958d;
import sg.C7959e;
import sg.C7960f;
import sg.C7961g;
import sg.C7962h;
import sg.C7963i;
import zg.EnumC8749b;
import zg.EnumC8754g;

/* loaded from: classes4.dex */
public abstract class i implements Dj.a {

    /* renamed from: a, reason: collision with root package name */
    static final int f47900a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public static i A(Dj.a... aVarArr) {
        Objects.requireNonNull(aVarArr, "sources is null");
        return aVarArr.length == 0 ? j0() : aVarArr.length == 1 ? B0(aVarArr[0]) : Eg.a.o(new C7488f(aVarArr, false));
    }

    public static i A0(Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return Eg.a.o(new qg.D(iterable));
    }

    public static i B0(Dj.a aVar) {
        if (aVar instanceof i) {
            return Eg.a.o((i) aVar);
        }
        Objects.requireNonNull(aVar, "publisher is null");
        return Eg.a.o(new F(aVar));
    }

    public static i C0(InterfaceC6469f interfaceC6469f) {
        Objects.requireNonNull(interfaceC6469f, "generator is null");
        return D0(AbstractC6822a.i(), J.a(interfaceC6469f), AbstractC6822a.e());
    }

    public static i D0(kg.q qVar, InterfaceC6465b interfaceC6465b, InterfaceC6469f interfaceC6469f) {
        Objects.requireNonNull(qVar, "initialState is null");
        Objects.requireNonNull(interfaceC6465b, "generator is null");
        Objects.requireNonNull(interfaceC6469f, "disposeState is null");
        return Eg.a.o(new G(qVar, interfaceC6465b, interfaceC6469f));
    }

    public static i F0(long j10, long j11, TimeUnit timeUnit) {
        return G0(j10, j11, timeUnit, Gg.a.a());
    }

    public static i G0(long j10, long j11, TimeUnit timeUnit, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.o(new K(Math.max(0L, j10), Math.max(0L, j11), timeUnit, yVar));
    }

    public static i H0(long j10, TimeUnit timeUnit, y yVar) {
        return G0(j10, j10, timeUnit, yVar);
    }

    public static i I0(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return J0(j10, j11, j12, j13, timeUnit, Gg.a.a());
    }

    public static i J0(long j10, long j11, long j12, long j13, TimeUnit timeUnit, y yVar) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return j0().S(j12, timeUnit, yVar);
        }
        long j14 = j10 + (j11 - 1);
        if (j10 > 0 && j14 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.o(new L(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, yVar));
    }

    public static i K0(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return Eg.a.o(new M(obj));
    }

    public static i L0(Object obj, Object obj2) {
        Objects.requireNonNull(obj, "item1 is null");
        Objects.requireNonNull(obj2, "item2 is null");
        return z0(obj, obj2);
    }

    public static i N(k kVar, EnumC5911a enumC5911a) {
        Objects.requireNonNull(kVar, "source is null");
        Objects.requireNonNull(enumC5911a, "mode is null");
        return Eg.a.o(new C7491i(kVar, enumC5911a));
    }

    public static i O0(Dj.a aVar) {
        return P0(aVar, i());
    }

    public static i P0(Dj.a aVar, int i10) {
        return B0(aVar).q0(AbstractC6822a.f(), i10);
    }

    public static i Q0(Dj.a aVar, Dj.a aVar2) {
        Objects.requireNonNull(aVar, "source1 is null");
        Objects.requireNonNull(aVar2, "source2 is null");
        return z0(aVar, aVar2).r0(AbstractC6822a.f(), false, 2);
    }

    public static i R0(Dj.a aVar, Dj.a aVar2, Dj.a aVar3) {
        Objects.requireNonNull(aVar, "source1 is null");
        Objects.requireNonNull(aVar2, "source2 is null");
        Objects.requireNonNull(aVar3, "source3 is null");
        return z0(aVar, aVar2, aVar3).r0(AbstractC6822a.f(), false, 3);
    }

    public static i S0(Iterable iterable) {
        return A0(iterable).p0(AbstractC6822a.f());
    }

    public static i W0() {
        return Eg.a.o(S.f58778b);
    }

    private i b2(long j10, TimeUnit timeUnit, Dj.a aVar, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.o(new y0(this, j10, timeUnit, yVar, aVar));
    }

    private i c0(InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, InterfaceC6464a interfaceC6464a2) {
        Objects.requireNonNull(interfaceC6469f, "onNext is null");
        Objects.requireNonNull(interfaceC6469f2, "onError is null");
        Objects.requireNonNull(interfaceC6464a, "onComplete is null");
        Objects.requireNonNull(interfaceC6464a2, "onAfterTerminate is null");
        return Eg.a.o(new C7497o(this, interfaceC6469f, interfaceC6469f2, interfaceC6464a, interfaceC6464a2));
    }

    private i c2(Dj.a aVar, kg.n nVar, Dj.a aVar2) {
        Objects.requireNonNull(nVar, "itemTimeoutIndicator is null");
        return Eg.a.o(new x0(this, aVar, nVar, aVar2));
    }

    public static i d2(long j10, TimeUnit timeUnit) {
        return e2(j10, timeUnit, Gg.a.a());
    }

    public static i e2(long j10, TimeUnit timeUnit, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.o(new z0(Math.max(0L, j10), timeUnit, yVar));
    }

    public static int i() {
        return f47900a;
    }

    public static i j0() {
        return Eg.a.o(C7501t.f59253b);
    }

    public static i j1(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i11);
        }
        if (i11 == 0) {
            return j0();
        }
        if (i11 == 1) {
            return K0(Integer.valueOf(i10));
        }
        if (i10 + (i11 - 1) <= 2147483647L) {
            return Eg.a.o(new b0(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static i k0(Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return l0(AbstractC6822a.h(th2));
    }

    public static i l0(kg.q qVar) {
        Objects.requireNonNull(qVar, "supplier is null");
        return Eg.a.o(new C7502u(qVar));
    }

    public static i o(Dj.a aVar, Dj.a aVar2, Dj.a aVar3, Dj.a aVar4, Dj.a aVar5, Dj.a aVar6, Dj.a aVar7, Dj.a aVar8, Dj.a aVar9, kg.m mVar) {
        Objects.requireNonNull(aVar, "source1 is null");
        Objects.requireNonNull(aVar2, "source2 is null");
        Objects.requireNonNull(aVar3, "source3 is null");
        Objects.requireNonNull(aVar4, "source4 is null");
        Objects.requireNonNull(aVar5, "source5 is null");
        Objects.requireNonNull(aVar6, "source6 is null");
        Objects.requireNonNull(aVar7, "source7 is null");
        Objects.requireNonNull(aVar8, "source8 is null");
        Objects.requireNonNull(aVar9, "source9 is null");
        Objects.requireNonNull(mVar, "combiner is null");
        return w(new Dj.a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9}, AbstractC6822a.q(mVar), i());
    }

    public static i p(Dj.a aVar, Dj.a aVar2, Dj.a aVar3, Dj.a aVar4, Dj.a aVar5, Dj.a aVar6, Dj.a aVar7, Dj.a aVar8, kg.l lVar) {
        Objects.requireNonNull(aVar, "source1 is null");
        Objects.requireNonNull(aVar2, "source2 is null");
        Objects.requireNonNull(aVar3, "source3 is null");
        Objects.requireNonNull(aVar4, "source4 is null");
        Objects.requireNonNull(aVar5, "source5 is null");
        Objects.requireNonNull(aVar6, "source6 is null");
        Objects.requireNonNull(aVar7, "source7 is null");
        Objects.requireNonNull(aVar8, "source8 is null");
        Objects.requireNonNull(lVar, "combiner is null");
        return w(new Dj.a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8}, AbstractC6822a.p(lVar), i());
    }

    public static i q(Dj.a aVar, Dj.a aVar2, Dj.a aVar3, Dj.a aVar4, Dj.a aVar5, Dj.a aVar6, Dj.a aVar7, kg.k kVar) {
        Objects.requireNonNull(aVar, "source1 is null");
        Objects.requireNonNull(aVar2, "source2 is null");
        Objects.requireNonNull(aVar3, "source3 is null");
        Objects.requireNonNull(aVar4, "source4 is null");
        Objects.requireNonNull(aVar5, "source5 is null");
        Objects.requireNonNull(aVar6, "source6 is null");
        Objects.requireNonNull(aVar7, "source7 is null");
        Objects.requireNonNull(kVar, "combiner is null");
        return w(new Dj.a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7}, AbstractC6822a.o(kVar), i());
    }

    public static i r(Dj.a aVar, Dj.a aVar2, Dj.a aVar3, Dj.a aVar4, Dj.a aVar5, Dj.a aVar6, kg.j jVar) {
        Objects.requireNonNull(aVar, "source1 is null");
        Objects.requireNonNull(aVar2, "source2 is null");
        Objects.requireNonNull(aVar3, "source3 is null");
        Objects.requireNonNull(aVar4, "source4 is null");
        Objects.requireNonNull(aVar5, "source5 is null");
        Objects.requireNonNull(aVar6, "source6 is null");
        Objects.requireNonNull(jVar, "combiner is null");
        return w(new Dj.a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6}, AbstractC6822a.n(jVar), i());
    }

    public static i s(Dj.a aVar, Dj.a aVar2, Dj.a aVar3, Dj.a aVar4, Dj.a aVar5, kg.i iVar) {
        Objects.requireNonNull(aVar, "source1 is null");
        Objects.requireNonNull(aVar2, "source2 is null");
        Objects.requireNonNull(aVar3, "source3 is null");
        Objects.requireNonNull(aVar4, "source4 is null");
        Objects.requireNonNull(aVar5, "source5 is null");
        Objects.requireNonNull(iVar, "combiner is null");
        return w(new Dj.a[]{aVar, aVar2, aVar3, aVar4, aVar5}, AbstractC6822a.m(iVar), i());
    }

    public static i t(Dj.a aVar, Dj.a aVar2, Dj.a aVar3, Dj.a aVar4, kg.h hVar) {
        Objects.requireNonNull(aVar, "source1 is null");
        Objects.requireNonNull(aVar2, "source2 is null");
        Objects.requireNonNull(aVar3, "source3 is null");
        Objects.requireNonNull(aVar4, "source4 is null");
        Objects.requireNonNull(hVar, "combiner is null");
        return w(new Dj.a[]{aVar, aVar2, aVar3, aVar4}, AbstractC6822a.l(hVar), i());
    }

    public static i u(Dj.a aVar, Dj.a aVar2, Dj.a aVar3, kg.g gVar) {
        Objects.requireNonNull(aVar, "source1 is null");
        Objects.requireNonNull(aVar2, "source2 is null");
        Objects.requireNonNull(aVar3, "source3 is null");
        Objects.requireNonNull(gVar, "combiner is null");
        return w(new Dj.a[]{aVar, aVar2, aVar3}, AbstractC6822a.k(gVar), i());
    }

    public static i v(Dj.a aVar, Dj.a aVar2, InterfaceC6465b interfaceC6465b) {
        Objects.requireNonNull(aVar, "source1 is null");
        Objects.requireNonNull(aVar2, "source2 is null");
        Objects.requireNonNull(interfaceC6465b, "combiner is null");
        return w(new Dj.a[]{aVar, aVar2}, AbstractC6822a.j(interfaceC6465b), i());
    }

    public static i w(Dj.a[] aVarArr, kg.n nVar, int i10) {
        Objects.requireNonNull(aVarArr, "sources is null");
        if (aVarArr.length == 0) {
            return j0();
        }
        Objects.requireNonNull(nVar, "combiner is null");
        AbstractC6823b.b(i10, "bufferSize");
        return Eg.a.o(new C7487e(aVarArr, nVar, i10, false));
    }

    public static i y(Dj.a aVar, Dj.a aVar2) {
        Objects.requireNonNull(aVar, "source1 is null");
        Objects.requireNonNull(aVar2, "source2 is null");
        return A(aVar, aVar2);
    }

    public static i z(Iterable iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return A0(iterable).H(AbstractC6822a.f(), false, 2);
    }

    public static i z0(Object... objArr) {
        Objects.requireNonNull(objArr, "items is null");
        return objArr.length == 0 ? j0() : objArr.length == 1 ? K0(objArr[0]) : Eg.a.o(new C7480B(objArr));
    }

    public final InterfaceC6043c A1() {
        return C1(AbstractC6822a.e(), AbstractC6822a.f54019f, AbstractC6822a.f54016c);
    }

    public final i B(kg.n nVar) {
        return C(nVar, 2);
    }

    public final InterfaceC6043c B1(InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2) {
        return C1(interfaceC6469f, interfaceC6469f2, AbstractC6822a.f54016c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i C(kg.n nVar, int i10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "prefetch");
        if (!(this instanceof Dg.e)) {
            return Eg.a.o(new C7489g(this, nVar, i10, EnumC8754g.IMMEDIATE));
        }
        Object obj = ((Dg.e) this).get();
        return obj == null ? j0() : i0.a(obj, nVar);
    }

    public final InterfaceC6043c C1(InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a) {
        Objects.requireNonNull(interfaceC6469f, "onNext is null");
        Objects.requireNonNull(interfaceC6469f2, "onError is null");
        Objects.requireNonNull(interfaceC6464a, "onComplete is null");
        xg.c cVar = new xg.c(interfaceC6469f, interfaceC6469f2, interfaceC6464a, J.a.INSTANCE);
        D1(cVar);
        return cVar;
    }

    public final AbstractC5912b D(kg.n nVar) {
        return E(nVar, 2);
    }

    public final void D1(l lVar) {
        Objects.requireNonNull(lVar, "subscriber is null");
        try {
            Dj.b bVarZ = Eg.a.z(this, lVar);
            Objects.requireNonNull(bVarZ, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            E1(bVarZ);
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

    public final AbstractC5912b E(kg.n nVar, int i10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "prefetch");
        return Eg.a.n(new C7958d(this, nVar, EnumC8754g.IMMEDIATE, i10));
    }

    public final AbstractC5912b E0() {
        return Eg.a.n(new I(this));
    }

    protected abstract void E1(Dj.b bVar);

    public final AbstractC5912b F(kg.n nVar) {
        return G(nVar, true, 2);
    }

    public final i F1(y yVar) {
        Objects.requireNonNull(yVar, "scheduler is null");
        return G1(yVar, !(this instanceof C7491i));
    }

    public final AbstractC5912b G(kg.n nVar, boolean z10, int i10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "prefetch");
        return Eg.a.n(new C7958d(this, nVar, z10 ? EnumC8754g.END : EnumC8754g.BOUNDARY, i10));
    }

    public final i G1(y yVar, boolean z10) {
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.o(new p0(this, yVar, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i H(kg.n nVar, boolean z10, int i10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "prefetch");
        if (!(this instanceof Dg.e)) {
            return Eg.a.o(new C7489g(this, nVar, i10, z10 ? EnumC8754g.END : EnumC8754g.BOUNDARY));
        }
        Object obj = ((Dg.e) this).get();
        return obj == null ? j0() : i0.a(obj, nVar);
    }

    public final i H1(Dj.a aVar) {
        Objects.requireNonNull(aVar, "other is null");
        return Eg.a.o(new q0(this, aVar));
    }

    public final i I(kg.n nVar) {
        return J(nVar, 2);
    }

    public final i I1(kg.n nVar) {
        return J1(nVar, i());
    }

    public final i J(kg.n nVar, int i10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "prefetch");
        return Eg.a.o(new C7959e(this, nVar, EnumC8754g.IMMEDIATE, i10));
    }

    public final i J1(kg.n nVar, int i10) {
        return K1(nVar, i10, false);
    }

    public final i K(kg.n nVar) {
        return L(nVar, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    i K1(kg.n nVar, int i10, boolean z10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "bufferSize");
        if (!(this instanceof Dg.e)) {
            return Eg.a.o(new r0(this, nVar, i10, z10));
        }
        Object obj = ((Dg.e) this).get();
        return obj == null ? j0() : i0.a(obj, nVar);
    }

    public final i L(kg.n nVar, int i10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "prefetch");
        return Eg.a.o(new C7960f(this, nVar, EnumC8754g.IMMEDIATE, i10));
    }

    public final AbstractC5912b L1(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.n(new C7961g(this, nVar, false));
    }

    public final i M(D d10) {
        Objects.requireNonNull(d10, "other is null");
        return Eg.a.o(new C7490h(this, d10));
    }

    public final n M0() {
        return Eg.a.p(new N(this));
    }

    public final i M1(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.o(new C7962h(this, nVar, false));
    }

    public final i N0(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.o(new O(this, nVar));
    }

    public final i N1(kg.n nVar) {
        Objects.requireNonNull(nVar, "mapper is null");
        return Eg.a.o(new C7963i(this, nVar, false));
    }

    public final i O(long j10, TimeUnit timeUnit) {
        return P(j10, timeUnit, Gg.a.a());
    }

    public final i O1(long j10) {
        if (j10 >= 0) {
            return Eg.a.o(new s0(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    public final i P(long j10, TimeUnit timeUnit, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.o(new C7492j(this, j10, timeUnit, yVar, null));
    }

    public final i P1(long j10, TimeUnit timeUnit) {
        return Q1(d2(j10, timeUnit));
    }

    public final i Q(Object obj) {
        Objects.requireNonNull(obj, "defaultItem is null");
        return H1(K0(obj));
    }

    public final i Q1(Dj.a aVar) {
        Objects.requireNonNull(aVar, "other is null");
        return Eg.a.o(new t0(this, aVar));
    }

    public final i R(long j10, TimeUnit timeUnit) {
        return T(j10, timeUnit, Gg.a.a(), false);
    }

    public final i R1(kg.p pVar) {
        Objects.requireNonNull(pVar, "stopPredicate is null");
        return Eg.a.o(new u0(this, pVar));
    }

    public final i S(long j10, TimeUnit timeUnit, y yVar) {
        return T(j10, timeUnit, yVar, false);
    }

    public final i S1(long j10, TimeUnit timeUnit) {
        return T1(j10, timeUnit, Gg.a.a());
    }

    public final i T(long j10, TimeUnit timeUnit, y yVar, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.o(new C7493k(this, Math.max(0L, j10), timeUnit, yVar, z10));
    }

    public final i T0(Dj.a aVar) {
        Objects.requireNonNull(aVar, "other is null");
        return Q0(this, aVar);
    }

    public final i T1(long j10, TimeUnit timeUnit, y yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.o(new v0(this, j10, timeUnit, yVar, null));
    }

    public final i U() {
        return V(AbstractC6822a.f(), AbstractC6822a.d());
    }

    public final i U0(f fVar) {
        Objects.requireNonNull(fVar, "other is null");
        return Eg.a.o(new P(this, fVar));
    }

    public final i U1(long j10, TimeUnit timeUnit) {
        return W1(j10, timeUnit, Gg.a.a(), false);
    }

    public final i V(kg.n nVar, kg.q qVar) {
        Objects.requireNonNull(nVar, "keySelector is null");
        Objects.requireNonNull(qVar, "collectionSupplier is null");
        return Eg.a.o(new C7494l(this, nVar, qVar));
    }

    public final i V0(r rVar) {
        Objects.requireNonNull(rVar, "other is null");
        return Eg.a.o(new Q(this, rVar));
    }

    public final i V1(long j10, TimeUnit timeUnit, y yVar) {
        return W1(j10, timeUnit, yVar, false);
    }

    public final i W() {
        return Y(AbstractC6822a.f());
    }

    public final i W1(long j10, TimeUnit timeUnit, y yVar, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.o(new w0(this, j10, timeUnit, yVar, z10, null));
    }

    public final i X(InterfaceC6466c interfaceC6466c) {
        Objects.requireNonNull(interfaceC6466c, "comparer is null");
        return Eg.a.o(new C7495m(this, AbstractC6822a.f(), interfaceC6466c));
    }

    public final i X0(y yVar) {
        return Y0(yVar, false, i());
    }

    public final i X1(long j10, TimeUnit timeUnit, boolean z10) {
        return W1(j10, timeUnit, Gg.a.a(), z10);
    }

    public final i Y(kg.n nVar) {
        Objects.requireNonNull(nVar, "keySelector is null");
        return Eg.a.o(new C7495m(this, nVar, AbstractC6823b.a()));
    }

    public final i Y0(y yVar, boolean z10, int i10) {
        Objects.requireNonNull(yVar, "scheduler is null");
        AbstractC6823b.b(i10, "bufferSize");
        return Eg.a.o(new T(this, yVar, z10, i10));
    }

    public final i Y1(long j10, TimeUnit timeUnit) {
        return O(j10, timeUnit);
    }

    public final i Z(InterfaceC6464a interfaceC6464a) {
        Objects.requireNonNull(interfaceC6464a, "onFinally is null");
        return Eg.a.o(new C7496n(this, interfaceC6464a));
    }

    public final i Z0(Class cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return m0(AbstractC6822a.g(cls)).n(cls);
    }

    public final i Z1(long j10, TimeUnit timeUnit) {
        return b2(j10, timeUnit, null, Gg.a.a());
    }

    public final i a0(InterfaceC6464a interfaceC6464a) {
        return c0(AbstractC6822a.e(), AbstractC6822a.e(), interfaceC6464a, AbstractC6822a.f54016c);
    }

    public final i a1() {
        return b1(i(), false, true);
    }

    public final i a2(Dj.a aVar, kg.n nVar) {
        Objects.requireNonNull(aVar, "firstTimeoutIndicator is null");
        return c2(aVar, nVar, null);
    }

    @Override // Dj.a
    public final void b(Dj.b bVar) {
        if (bVar instanceof l) {
            D1((l) bVar);
        } else {
            Objects.requireNonNull(bVar, "subscriber is null");
            D1(new xg.k(bVar));
        }
    }

    public final i b0(Dj.b bVar) {
        Objects.requireNonNull(bVar, "subscriber is null");
        return c0(J.d(bVar), J.c(bVar), J.b(bVar), AbstractC6822a.f54016c);
    }

    public final i b1(int i10, boolean z10, boolean z11) {
        AbstractC6823b.b(i10, "capacity");
        return Eg.a.o(new U(this, i10, z11, z10, AbstractC6822a.f54016c, AbstractC6822a.e()));
    }

    public final i c(long j10, long j11, TimeUnit timeUnit, y yVar, kg.q qVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        Objects.requireNonNull(qVar, "bufferSupplier is null");
        return Eg.a.o(new C7485c(this, j10, j11, timeUnit, yVar, qVar, MPv3.MAX_MESSAGE_ID, false));
    }

    public final i c1() {
        return Eg.a.o(new V(this));
    }

    public final i d(long j10, TimeUnit timeUnit) {
        return f(j10, timeUnit, Gg.a.a(), MPv3.MAX_MESSAGE_ID);
    }

    public final i d0(InterfaceC6469f interfaceC6469f) {
        InterfaceC6469f interfaceC6469fE = AbstractC6822a.e();
        InterfaceC6464a interfaceC6464a = AbstractC6822a.f54016c;
        return c0(interfaceC6469fE, interfaceC6469f, interfaceC6464a, interfaceC6464a);
    }

    public final i d1(InterfaceC6469f interfaceC6469f) {
        Objects.requireNonNull(interfaceC6469f, "onDrop is null");
        return Eg.a.o(new V(this, interfaceC6469f));
    }

    public final i e(long j10, TimeUnit timeUnit, y yVar) {
        return g(j10, timeUnit, yVar, MPv3.MAX_MESSAGE_ID, EnumC8749b.asSupplier(), false);
    }

    public final i e0(InterfaceC6469f interfaceC6469f, kg.o oVar, InterfaceC6464a interfaceC6464a) {
        Objects.requireNonNull(interfaceC6469f, "onSubscribe is null");
        Objects.requireNonNull(oVar, "onRequest is null");
        Objects.requireNonNull(interfaceC6464a, "onCancel is null");
        return Eg.a.o(new C7498p(this, interfaceC6469f, oVar, interfaceC6464a));
    }

    public final i e1() {
        return Eg.a.o(new X(this, null));
    }

    public final i f(long j10, TimeUnit timeUnit, y yVar, int i10) {
        return g(j10, timeUnit, yVar, i10, EnumC8749b.asSupplier(), false);
    }

    public final i f0(InterfaceC6469f interfaceC6469f) {
        InterfaceC6469f interfaceC6469fE = AbstractC6822a.e();
        InterfaceC6464a interfaceC6464a = AbstractC6822a.f54016c;
        return c0(interfaceC6469f, interfaceC6469fE, interfaceC6464a, interfaceC6464a);
    }

    public final i f1(kg.n nVar) {
        Objects.requireNonNull(nVar, "fallbackSupplier is null");
        return Eg.a.o(new Y(this, nVar));
    }

    public final s f2() {
        return Eg.a.q(new tg.E(this));
    }

    public final i g(long j10, TimeUnit timeUnit, y yVar, int i10, kg.q qVar, boolean z10) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(yVar, "scheduler is null");
        Objects.requireNonNull(qVar, "bufferSupplier is null");
        AbstractC6823b.b(i10, "count");
        return Eg.a.o(new C7485c(this, j10, j10, timeUnit, yVar, qVar, i10, z10));
    }

    public final i g0(InterfaceC6469f interfaceC6469f) {
        return e0(interfaceC6469f, AbstractC6822a.f54020g, AbstractC6822a.f54016c);
    }

    public final i g1(kg.n nVar) {
        Objects.requireNonNull(nVar, "itemSupplier is null");
        return Eg.a.o(new Z(this, nVar));
    }

    public final i g2(y yVar) {
        Objects.requireNonNull(yVar, "scheduler is null");
        return Eg.a.o(new A0(this, yVar));
    }

    public final n h0(long j10) {
        if (j10 >= 0) {
            return Eg.a.p(new qg.r(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final AbstractC6327a h1() {
        return i1(i());
    }

    public final z i0(long j10) {
        if (j10 >= 0) {
            return Eg.a.r(new C7500s(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    public final AbstractC6327a i1(int i10) {
        AbstractC6823b.b(i10, "bufferSize");
        return Eg.a.s(new C7483a0(this, i10));
    }

    public final i k() {
        return l(16);
    }

    public final i k1() {
        return l1(Long.MAX_VALUE);
    }

    public final i l(int i10) {
        AbstractC6823b.b(i10, "initialCapacity");
        return Eg.a.o(new C7486d(this, i10));
    }

    public final i l1(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? j0() : Eg.a.o(new d0(this, j10));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    public final i m0(kg.p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return Eg.a.o(new C7503v(this, pVar));
    }

    public final i m1(InterfaceC6467d interfaceC6467d) {
        Objects.requireNonNull(interfaceC6467d, "stop is null");
        return Eg.a.o(new e0(this, interfaceC6467d));
    }

    public final i n(Class cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return N0(AbstractC6822a.c(cls));
    }

    public final n n0() {
        return h0(0L);
    }

    public final i n1(kg.n nVar) {
        Objects.requireNonNull(nVar, "handler is null");
        return Eg.a.o(new f0(this, nVar));
    }

    public final z o0() {
        return i0(0L);
    }

    public final AbstractC6327a o1(int i10) {
        AbstractC6823b.b(i10, "bufferSize");
        return g0.m2(this, i10, false);
    }

    public final i p0(kg.n nVar) {
        return s0(nVar, false, i(), i());
    }

    public final i p1(kg.n nVar) {
        Objects.requireNonNull(nVar, "handler is null");
        return Eg.a.o(new h0(this, nVar));
    }

    public final i q0(kg.n nVar, int i10) {
        return s0(nVar, false, i10, i());
    }

    public final i q1(Object obj, InterfaceC6465b interfaceC6465b) {
        Objects.requireNonNull(obj, "initialValue is null");
        return s1(AbstractC6822a.h(obj), interfaceC6465b);
    }

    public final i r0(kg.n nVar, boolean z10, int i10) {
        return s0(nVar, z10, i10, i());
    }

    public final i r1(InterfaceC6465b interfaceC6465b) {
        Objects.requireNonNull(interfaceC6465b, "accumulator is null");
        return Eg.a.o(new j0(this, interfaceC6465b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i s0(kg.n nVar, boolean z10, int i10, int i11) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "maxConcurrency");
        AbstractC6823b.b(i11, "bufferSize");
        if (!(this instanceof Dg.e)) {
            return Eg.a.o(new C7504w(this, nVar, z10, i10, i11));
        }
        Object obj = ((Dg.e) this).get();
        return obj == null ? j0() : i0.a(obj, nVar);
    }

    public final i s1(kg.q qVar, InterfaceC6465b interfaceC6465b) {
        Objects.requireNonNull(qVar, "seedSupplier is null");
        Objects.requireNonNull(interfaceC6465b, "accumulator is null");
        return Eg.a.o(new k0(this, qVar, interfaceC6465b));
    }

    public final AbstractC5912b t0(kg.n nVar) {
        return u0(nVar, false, MPv3.MAX_MESSAGE_ID);
    }

    public final i t1() {
        return h1().i2();
    }

    public final AbstractC5912b u0(kg.n nVar, boolean z10, int i10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "maxConcurrency");
        return Eg.a.n(new C7506y(this, nVar, z10, i10));
    }

    public final i u1(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? Eg.a.o(this) : Eg.a.o(new n0(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 expected but it was " + j10);
    }

    public final i v0(kg.n nVar) {
        return w0(nVar, false, MPv3.MAX_MESSAGE_ID);
    }

    public final i v1(long j10, TimeUnit timeUnit) {
        return w1(d2(j10, timeUnit));
    }

    public final i w0(kg.n nVar, boolean z10, int i10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "maxConcurrency");
        return Eg.a.o(new C7507z(this, nVar, z10, i10));
    }

    public final i w1(Dj.a aVar) {
        Objects.requireNonNull(aVar, "other is null");
        return Eg.a.o(new o0(this, aVar));
    }

    public final i x(m mVar) {
        Objects.requireNonNull(mVar, "composer is null");
        return B0(mVar.a(this));
    }

    public final i x0(kg.n nVar) {
        return y0(nVar, false, MPv3.MAX_MESSAGE_ID);
    }

    public final i x1(Dj.a aVar) {
        Objects.requireNonNull(aVar, "other is null");
        return A(aVar, this);
    }

    public final i y0(kg.n nVar, boolean z10, int i10) {
        Objects.requireNonNull(nVar, "mapper is null");
        AbstractC6823b.b(i10, "maxConcurrency");
        return Eg.a.o(new C7479A(this, nVar, z10, i10));
    }

    public final i y1(D d10) {
        Objects.requireNonNull(d10, "other is null");
        return y(z.a0(d10).W(), this);
    }

    public final i z1(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return A(K0(obj), this);
    }
}
