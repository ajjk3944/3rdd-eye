package i0;

import bl.z;
import d0.t1;
import i2.e0;
import j0.g0;
import j0.j0;
import j0.l0;
import j0.m0;
import j0.o0;
import j0.y;
import nk.x;
import u0.a1;
import u0.d1;
import u0.u0;
import xk.a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u implements t1 {

    /* renamed from: x, reason: collision with root package name */
    public static final yb.i f25507x;

    /* renamed from: a, reason: collision with root package name */
    public final a f25508a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25509b;

    /* renamed from: c, reason: collision with root package name */
    public p f25510c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25511d;

    /* renamed from: e, reason: collision with root package name */
    public final c2.s f25512e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f25513f;
    public final e0.i g;

    /* renamed from: h, reason: collision with root package name */
    public float f25514h;

    /* renamed from: i, reason: collision with root package name */
    public final va.o f25515i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public e0 f25516k;

    /* renamed from: l, reason: collision with root package name */
    public final r f25517l;

    /* renamed from: m, reason: collision with root package name */
    public final j0.d f25518m;

    /* renamed from: n, reason: collision with root package name */
    public final y f25519n;

    /* renamed from: o, reason: collision with root package name */
    public final jf.c f25520o;

    /* renamed from: p, reason: collision with root package name */
    public final m0 f25521p;

    /* renamed from: q, reason: collision with root package name */
    public final jf.c f25522q;

    /* renamed from: r, reason: collision with root package name */
    public final j0 f25523r;

    /* renamed from: s, reason: collision with root package name */
    public final u0 f25524s;

    /* renamed from: t, reason: collision with root package name */
    public final d1 f25525t;

    /* renamed from: u, reason: collision with root package name */
    public final d1 f25526u;

    /* renamed from: v, reason: collision with root package name */
    public final u0 f25527v;

    /* renamed from: w, reason: collision with root package name */
    public final y4.a f25528w;

    static {
        bl.v vVar = new bl.v(8);
        b7.w wVar = new b7.w(12);
        z zVar = new z(2, vVar);
        x.d(1, wVar);
        f25507x = new yb.i(zVar, false, wVar, 16);
    }

    public u(int i4, int i10) {
        a aVar = new a();
        aVar.f25397a = -1;
        aVar.f25400d = -1;
        this.f25508a = aVar;
        c2.s sVar = new c2.s();
        sVar.f2684b = new a1(i4);
        sVar.f2685c = new a1(i10);
        sVar.f2687e = new g0(i4);
        this.f25512e = sVar;
        p pVar = w.f25529a;
        u0.e eVar = u0.e.f34769d;
        this.f25513f = new d1(pVar, eVar);
        this.g = new e0.i();
        this.f25515i = new va.o(new b7.u(9, this));
        this.j = true;
        this.f25517l = new r(this);
        this.f25518m = new j0.d();
        this.f25519n = new y();
        this.f25520o = new jf.c(23);
        this.f25521p = new m0(new b7.s(this, i4));
        this.f25522q = new jf.c(22, this);
        this.f25523r = new j0();
        yj.u uVar = yj.u.f37649a;
        this.f25524s = new d1(uVar, eVar);
        Boolean bool = Boolean.FALSE;
        this.f25525t = u0.q.r(bool);
        this.f25526u = u0.q.r(bool);
        this.f25527v = new d1(uVar, eVar);
        y4.a aVar2 = new y4.a();
        y4.a aVar3 = a0.f.j;
        Float fValueOf = Float.valueOf(0.0f);
        aVar2.f37324b = new a0.m(aVar3, fValueOf, (a0.r) ((mk.c) aVar3.f37323a).invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.f25528w = aVar2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void a(p pVar, boolean z3, boolean z10) {
        String str;
        long j;
        g1.g gVarF;
        mk.c cVarE;
        g1.g gVarK;
        y4.a aVar = a0.f.j;
        ?? r32 = pVar.f25472k;
        int i4 = pVar.f25475n;
        int i10 = pVar.f25465b;
        q qVar = pVar.f25464a;
        this.f25521p.f26931e = r32.size();
        y4.a aVar2 = this.f25528w;
        c2.s sVar = this.f25512e;
        ck.c cVar = null;
        if (!z3 && this.f25509b) {
            this.f25510c = pVar;
            gVarF = g1.r.f();
            cVarE = gVarF != null ? gVarF.e() : null;
            gVarK = g1.r.k(gVarF);
            try {
                if (((Number) ((a0.m) aVar2.f37324b).f81b.getValue()).floatValue() != 0.0f && qVar != null && qVar.f25479a == ((a1) sVar.f2684b).g() && i10 == ((a1) sVar.f2685c).g()) {
                    a0 a0Var = (a0) aVar2.f37323a;
                    if (a0Var != null) {
                        a0Var.e(null);
                    }
                    aVar2.f37324b = new a0.m(aVar, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                g1.r.o(gVarF, gVarK, cVarE);
            }
        }
        if (z3) {
            this.f25509b = true;
        }
        this.f25526u.setValue(Boolean.valueOf(((qVar != null ? qVar.f25479a : 0) == 0 && i10 == 0) ? false : true));
        this.f25525t.setValue(Boolean.valueOf(pVar.f25466c));
        this.f25514h -= pVar.f25467d;
        this.f25513f.setValue(pVar);
        if (z10) {
            sVar.getClass();
            if (!(((float) i10) >= 0.0f)) {
                f0.a.c("scrollOffset should be non-negative");
            }
            ((a1) sVar.f2685c).h(i10);
        } else {
            q qVar2 = (q) zj.n.d0(r32);
            q qVar3 = (q) zj.n.i0(r32);
            if (qVar2 != null) {
                str = "scrollOffset should be non-negative";
                j = qVar2.f25479a;
            } else {
                str = "scrollOffset should be non-negative";
                j = -1;
            }
            a4.l.o(j, "firstVisibleItem:index");
            a4.l.o(qVar3 != null ? qVar3.f25479a : -1L, "lastVisibleItem:index");
            sVar.getClass();
            sVar.f2686d = qVar != null ? qVar.f25486i : null;
            if (sVar.f2683a || i4 > 0) {
                sVar.f2683a = true;
                if (!(((float) i10) >= 0.0f)) {
                    f0.a.c(str);
                }
                sVar.b(qVar != null ? qVar.f25479a : 0, i10);
            }
            if (this.j) {
                a aVar3 = this.f25508a;
                int i11 = aVar3.f25397a;
                boolean z11 = aVar3.f25399c;
                if (i11 != -1 && !r32.isEmpty() && i11 != a.a(pVar, z11)) {
                    aVar3.f25397a = -1;
                    l0 l0Var = aVar3.f25398b;
                    if (l0Var != null) {
                        l0Var.cancel();
                    }
                    aVar3.f25398b = null;
                }
                int i12 = aVar3.f25400d;
                if (i12 != -1 && aVar3.f25401e != 0.0f && i12 != i4 && !r32.isEmpty()) {
                    int iA = a.a(pVar, aVar3.f25401e < 0.0f);
                    if (iA >= 0 && iA < i4) {
                        aVar3.f25397a = iA;
                        aVar3.f25398b = d.h.F(this.f25522q, iA);
                    }
                }
                aVar3.f25400d = i4;
            }
        }
        if (z3) {
            float f10 = pVar.f25469f;
            d3.c cVar2 = pVar.f25471i;
            xk.v vVar = pVar.f25470h;
            aVar2.getClass();
            if (f10 <= cVar2.I(o0.f26937a)) {
                return;
            }
            gVarF = g1.r.f();
            cVarE = gVarF != null ? gVarF.e() : null;
            gVarK = g1.r.k(gVarF);
            try {
                float fFloatValue = ((Number) ((a0.m) aVar2.f37324b).f81b.getValue()).floatValue();
                a0 a0Var2 = (a0) aVar2.f37323a;
                if (a0Var2 != null) {
                    a0Var2.e(null);
                }
                a0.m mVar = (a0.m) aVar2.f37324b;
                if (mVar.f85f) {
                    aVar2.f37324b = a0.f.h(mVar, fFloatValue - f10);
                } else {
                    aVar2.f37324b = new a0.m(aVar, Float.valueOf(-f10), null, 60);
                }
                aVar2.f37323a = xk.x.v(vVar, null, null, new al.k(aVar2, cVar, 9), 3);
            } finally {
            }
        }
    }

    @Override // d0.t1
    public final boolean b() {
        return this.f25515i.b();
    }

    @Override // d0.t1
    public final boolean c() {
        return ((Boolean) this.f25526u.getValue()).booleanValue();
    }

    @Override // d0.t1
    public final boolean d() {
        return ((Boolean) this.f25525t.getValue()).booleanValue();
    }

    @Override // d0.t1
    public final float e(float f10) {
        return this.f25515i.e(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d0.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(c0.v0 r7, mk.e r8, ek.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof i0.t
            if (r0 == 0) goto L13
            r0 = r9
            i0.t r0 = (i0.t) r0
            int r1 = r0.f25506e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25506e = r1
            goto L18
        L13:
            i0.t r0 = new i0.t
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f25504c
            int r1 = r0.f25506e
            yj.u r2 = yj.u.f37649a
            r3 = 2
            r4 = 1
            dk.a r5 = dk.a.f22275a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2c
            ci.b.D(r9)
            return r2
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            ek.j r7 = r0.f25503b
            r8 = r7
            mk.e r8 = (mk.e) r8
            c0.v0 r7 = r0.f25502a
            ci.b.D(r9)
            goto L77
        L3f:
            ci.b.D(r9)
            u0.d1 r9 = r6.f25513f
            java.lang.Object r9 = r9.getValue()
            i0.p r1 = i0.w.f25529a
            if (r9 != r1) goto L77
            r0.f25502a = r7
            r9 = r8
            ek.j r9 = (ek.j) r9
            r0.f25503b = r9
            r0.f25506e = r4
            j0.d r9 = r6.f25518m
            xk.n r1 = r9.f26880b
            if (r1 != 0) goto L6c
            xk.n r1 = xk.x.a()
            r9.f26880b = r1
            j0.c r9 = r9.f26879a
            if (r9 == 0) goto L6c
            boolean r4 = r9.f25565n
            if (r4 == 0) goto L6c
            r9.p0()
        L6c:
            java.lang.Object r9 = r1.g0(r0)
            if (r9 != r5) goto L73
            goto L74
        L73:
            r9 = r2
        L74:
            if (r9 != r5) goto L77
            goto L86
        L77:
            r9 = 0
            r0.f25502a = r9
            r0.f25503b = r9
            r0.f25506e = r3
            va.o r9 = r6.f25515i
            java.lang.Object r7 = r9.f(r7, r8, r0)
            if (r7 != r5) goto L87
        L86:
            return r5
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.u.f(c0.v0, mk.e, ek.c):java.lang.Object");
    }

    public final p g() {
        return (p) this.f25513f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f10, p pVar) {
        l0 l0Var;
        l0 l0Var2;
        if (this.j) {
            ?? r02 = pVar.f25472k;
            ?? r12 = pVar.f25472k;
            boolean zIsEmpty = r02.isEmpty();
            a aVar = this.f25508a;
            if (!zIsEmpty) {
                boolean z3 = f10 < 0.0f;
                int iA = a.a(pVar, z3);
                if (iA >= 0 && iA < pVar.f25475n) {
                    if (iA != aVar.f25397a) {
                        if (aVar.f25399c != z3) {
                            aVar.f25397a = -1;
                            l0 l0Var3 = aVar.f25398b;
                            if (l0Var3 != null) {
                                l0Var3.cancel();
                            }
                            aVar.f25398b = null;
                        }
                        aVar.f25399c = z3;
                        aVar.f25397a = iA;
                        aVar.f25398b = d.h.F(this.f25522q, iA);
                    }
                    if (z3) {
                        q qVar = (q) zj.n.h0(r12);
                        if (((qVar.f25489m + qVar.f25490n) + pVar.f25478q) - pVar.f25474m < (-f10) && (l0Var2 = aVar.f25398b) != null) {
                            l0Var2.a();
                        }
                    } else if (pVar.f25473l - ((q) zj.n.c0(r12)).f25489m < f10 && (l0Var = aVar.f25398b) != null) {
                        l0Var.a();
                    }
                }
            }
            aVar.f25401e = f10;
        }
    }

    public final void i(int i4, int i10, boolean z3) {
        c2.s sVar = this.f25512e;
        if (((a1) sVar.f2684b).g() != i4 || ((a1) sVar.f2685c).g() != i10) {
            y yVar = this.f25519n;
            yVar.d();
            yVar.f27025b = null;
            yVar.f27026c = -1;
        }
        sVar.b(i4, i10);
        sVar.f2686d = null;
        if (!z3) {
            this.f25524s.setValue(yj.u.f37649a);
            return;
        }
        e0 e0Var = this.f25516k;
        if (e0Var != null) {
            e0Var.l();
        }
    }
}
