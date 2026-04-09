package r0;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import u0.i1;
import u0.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f32633a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f32634b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f32635c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f32636d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f32637e;

    /* renamed from: f, reason: collision with root package name */
    public static final a0.j0 f32638f;

    static {
        float f10 = t0.m.f34019p;
        f32633a = f10;
        f32634b = t0.m.f34029z;
        f32635c = t0.m.f34026w;
        float f11 = t0.m.f34023t;
        f32636d = f11;
        f32637e = (f11 - f10) / 2;
        f32638f = new a0.j0();
    }

    public static final void a(final boolean z3, final mk.c cVar, final i1.n nVar, boolean z10, final n0 n0Var, u0.p pVar, final int i4) {
        final boolean z11;
        boolean z12;
        i1.n nVarA;
        pVar.X(-263339167);
        int i10 = i4 | (pVar.g(z3) ? 4 : 2) | (pVar.h(cVar) ? 32 : 16) | 27648 | (pVar.f(n0Var) ? 131072 : 65536) | 1572864;
        boolean z13 = true;
        if (pVar.O(i10 & 1, (599187 & i10) != 599186)) {
            pVar.T();
            if ((i4 & 1) != 0 && !pVar.y()) {
                pVar.R();
                z13 = z10;
            }
            pVar.q();
            pVar.W(1768604058);
            Object objL = pVar.L();
            if (objL == u0.l.f34851a) {
                objL = new e0.i();
                pVar.g0(objL);
            }
            e0.i iVar = (e0.i) objL;
            pVar.p(false);
            if (cVar != null) {
                g2.l lVar = t.f32655a;
                boolean z14 = z13;
                nVarA = l0.b.a(x.f32708a, z3, iVar, z14, new p2.h(2), cVar);
                iVar = iVar;
                z12 = z14;
            } else {
                z12 = z13;
                nVarA = i1.k.f25553a;
            }
            b(g0.j0.c(g0.j0.h(nVar.b(nVarA)), f32635c, f32636d), z3, z12, n0Var, iVar, h0.a(t0.m.f34016m, pVar), pVar, ((i10 << 3) & AppLovinMediationAdapter.ERROR_CHILD_USER) | 384 | ((i10 >> 6) & 7168) | 24576);
            z11 = z12;
        } else {
            pVar.R();
            z11 = z10;
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e(z3, cVar, nVar, z11, n0Var, i4) { // from class: r0.o0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f32615a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ mk.c f32616b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i1.n f32617c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f32618d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ n0 f32619e;

                @Override // mk.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iZ = u0.q.z(385);
                    q0.a(this.f32615a, this.f32616b, this.f32617c, this.f32618d, this.f32619e, (u0.p) obj, iZ);
                    return yj.u.f37649a;
                }
            };
        }
    }

    public static final void b(final i1.n nVar, final boolean z3, final boolean z10, final n0 n0Var, final e0.i iVar, final p1.j0 j0Var, u0.p pVar, final int i4) {
        int i10;
        pVar.X(-670917213);
        if ((i4 & 6) == 0) {
            i10 = (pVar.f(nVar) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= pVar.g(z3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= pVar.g(z10) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= pVar.f(n0Var) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i4 & 24576) == 0) {
            i10 |= pVar.h(null) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        if ((196608 & i4) == 0) {
            i10 |= pVar.f(iVar) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i10 |= pVar.f(j0Var) ? 1048576 : 524288;
        }
        if (pVar.O(i10 & 1, (599187 & i10) != 599186)) {
            long j = z10 ? z3 ? n0Var.f32601b : n0Var.f32605f : z3 ? n0Var.j : n0Var.f32611n;
            long j8 = z10 ? z3 ? n0Var.f32600a : n0Var.f32604e : z3 ? n0Var.f32607i : n0Var.f32610m;
            p1.j0 j0VarA = h0.a(t0.m.f34025v, pVar);
            i1.n nVarC = c0.o.c(nVar.b(new c0.w(t0.m.f34024u, new p1.l0(z10 ? z3 ? n0Var.f32602c : n0Var.g : z3 ? n0Var.f32608k : n0Var.f32612o), j0VarA)), j, j0VarA);
            g2.j0 j0VarC = g0.h.c(i1.b.f25531a, false);
            int iN = u0.q.n(pVar);
            i1 i1VarL = pVar.l();
            i1.n nVarW = com.bumptech.glide.d.w(nVarC, pVar);
            i2.g.R8.getClass();
            i2.x xVar = i2.f.f25653b;
            pVar.Z();
            if (pVar.S) {
                pVar.k(xVar);
            } else {
                pVar.j0();
            }
            i2.e eVar = i2.f.f25656e;
            u0.q.x(j0VarC, eVar, pVar);
            i2.e eVar2 = i2.f.f25655d;
            u0.q.x(i1VarL, eVar2, pVar);
            i2.e eVar3 = i2.f.f25657f;
            if (pVar.S || !nk.k.a(pVar.L(), Integer.valueOf(iN))) {
                pVar.g0(Integer.valueOf(iN));
                pVar.b(Integer.valueOf(iN), eVar3);
            }
            i2.e eVar4 = i2.f.f25654c;
            u0.q.x(nVarW, eVar4, pVar);
            i1.n nVarD = g0.l.f24150b.d();
            ((z) ((a0) pVar.j(w.f32683a))).getClass();
            a0.l0 l0Var = z.f32712b;
            nk.k.c(l0Var, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            i1.n nVarC2 = c0.o.c(c0.q0.a(d.h.j((i2.v0) nVarD, new t0(iVar, z3, l0Var)), iVar, d0.a(4, t0.m.f34022s / 2)), j8, j0Var);
            g2.j0 j0VarC2 = g0.h.c(i1.b.f25535e, false);
            int iN2 = u0.q.n(pVar);
            i1 i1VarL2 = pVar.l();
            i1.n nVarW2 = com.bumptech.glide.d.w(nVarC2, pVar);
            pVar.Z();
            if (pVar.S) {
                pVar.k(xVar);
            } else {
                pVar.j0();
            }
            u0.q.x(j0VarC2, eVar, pVar);
            u0.q.x(i1VarL2, eVar2, pVar);
            if (pVar.S || !nk.k.a(pVar.L(), Integer.valueOf(iN2))) {
                pVar.g0(Integer.valueOf(iN2));
                pVar.b(Integer.valueOf(iN2), eVar3);
            }
            u0.q.x(nVarW2, eVar4, pVar);
            pVar.W(1236071411);
            pVar.p(false);
            pVar.p(true);
            pVar.p(true);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e() { // from class: r0.p0
                @Override // mk.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q0.b(nVar, z3, z10, n0Var, iVar, j0Var, (u0.p) obj, u0.q.z(i4 | 1));
                    return yj.u.f37649a;
                }
            };
        }
    }
}
