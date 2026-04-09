package c0;

import i2.h1;
import i2.u1;
import i2.w1;
import i2.z1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j0 extends i2.j implements u1, i2.m, i2.h, h1, z1 {

    /* renamed from: w, reason: collision with root package name */
    public static final e0 f2447w = new e0(2);

    /* renamed from: q, reason: collision with root package name */
    public e0.i f2448q;

    /* renamed from: r, reason: collision with root package name */
    public final a f2449r;

    /* renamed from: s, reason: collision with root package name */
    public e0.d f2450s;

    /* renamed from: t, reason: collision with root package name */
    public j0.h0 f2451t;

    /* renamed from: u, reason: collision with root package name */
    public i2.d1 f2452u;

    /* renamed from: v, reason: collision with root package name */
    public final n1.s f2453v;

    public j0(e0.i iVar, a aVar) {
        this.f2448q = iVar;
        this.f2449r = aVar;
        n1.s sVar = new n1.s(0, new i0(2, this, j0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 0), 10);
        p0(sVar);
        this.f2453v = sVar;
    }

    @Override // i2.h1
    public final void P() {
        nk.u uVar = new nk.u();
        i2.k.p(this, new p(1, uVar, this));
        j0.h0 h0Var = (j0.h0) uVar.f29986a;
        if (this.f2453v.u0().a()) {
            j0.h0 h0Var2 = this.f2451t;
            if (h0Var2 != null) {
                h0Var2.b();
            }
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.f2451t = h0Var;
        }
    }

    @Override // i2.u1
    public final /* synthetic */ boolean Y() {
        return false;
    }

    @Override // i2.u1
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // i1.m
    public final boolean c0() {
        return false;
    }

    @Override // i2.z1
    public final Object e() {
        return f2447w;
    }

    @Override // i1.m
    public final void j0() {
        j0.h0 h0Var = this.f2451t;
        if (h0Var != null) {
            h0Var.b();
        }
        this.f2451t = null;
    }

    @Override // i2.u1
    public final void l(p2.x xVar) {
        boolean zA = this.f2453v.u0().a();
        tk.c[] cVarArr = p2.v.f31140a;
        p2.w wVar = p2.t.f31122k;
        tk.c cVar = p2.v.f31140a[4];
        xVar.a(wVar, Boolean.valueOf(zA));
        xVar.a(p2.k.f31090v, new p2.a(null, new h0(0, this, j0.class, "requestFocus", "requestFocus()Z", 0, 0, 0)));
    }

    @Override // i2.m
    public final void p(i2.d1 d1Var) {
        this.f2452u = d1Var;
        if (this.f2453v.u0().a()) {
            if (!d1Var.z0().f25565n) {
                t0();
                return;
            }
            i2.d1 d1Var2 = this.f2452u;
            if (d1Var2 == null || !d1Var2.z0().f25565n) {
                return;
            }
            t0();
        }
    }

    public final void s0(e0.i iVar, e0.h hVar) {
        if (!this.f25565n) {
            iVar.b(hVar);
            return;
        }
        xk.y0 y0Var = (xk.y0) ((cl.d) b0()).f2910a.O(xk.s.f37235b);
        xk.x.v(b0(), null, null, new bh.t(iVar, hVar, y0Var != null ? y0Var.m(new b7.b(11, iVar, hVar)) : null, null, 5), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void t0() {
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        if (this.f25565n) {
            if (!this.f25554a.f25565n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            i1.m mVar = this.f25554a.f25558e;
            i2.e0 e0VarS = i2.k.s(this);
            while (e0VarS != null) {
                if ((((i1.m) e0VarS.G.g).f25557d & 262144) != 0) {
                    while (mVar != null) {
                        if ((mVar.f25556c & 262144) != 0) {
                            i2.j jVarE = mVar;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof z1) {
                                    if (k0.f2458o.equals(((z1) jVarE).e())) {
                                        return;
                                    }
                                } else if ((jVarE.f25556c & 262144) != 0 && (jVarE instanceof i2.j)) {
                                    i1.m mVar2 = jVarE.f25691p;
                                    int i4 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (mVar2 != null) {
                                        if ((mVar2.f25556c & 262144) != 0) {
                                            i4++;
                                            eVar = eVar;
                                            if (i4 == 1) {
                                                jVarE = mVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new w0.e(new i1.m[16]);
                                                }
                                                if (jVarE != 0) {
                                                    eVar.b(jVarE);
                                                    jVarE = 0;
                                                }
                                                eVar.b(mVar2);
                                            }
                                        }
                                        mVar2 = mVar2.f25559f;
                                        jVarE = jVarE;
                                        eVar = eVar;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                jVarE = i2.k.e(eVar);
                            }
                        }
                        mVar = mVar.f25558e;
                    }
                }
                e0VarS = e0VarS.v();
                mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
            }
        }
    }

    public final void u0(e0.i iVar) {
        e0.d dVar;
        if (nk.k.a(this.f2448q, iVar)) {
            return;
        }
        e0.i iVar2 = this.f2448q;
        if (iVar2 != null && (dVar = this.f2450s) != null) {
            iVar2.b(new e0.e(dVar));
        }
        this.f2450s = null;
        this.f2448q = iVar;
    }

    @Override // i2.u1
    public final /* synthetic */ boolean v() {
        return false;
    }
}
