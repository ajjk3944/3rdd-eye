package c0;

import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.concurrent.atomic.AtomicInteger;
import u0.i1;
import u0.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class o {
    public static final void a(final u1.b bVar, final String str, final i1.n nVar, i1.e eVar, g2.h hVar, float f10, u0.p pVar, final int i4) {
        final i1.e eVar2;
        final g2.h hVar2;
        final float f11;
        i1.n bVar2;
        pVar.X(1142754848);
        int i10 = i4 | (pVar.h(bVar) ? 4 : 2) | (pVar.f(str) ? 32 : 16) | (pVar.f(nVar) ? 256 : 128) | 1797120;
        if (pVar.O(i10 & 1, (599187 & i10) != 599186)) {
            i1.e eVar3 = i1.b.f25535e;
            u0.e eVar4 = u0.l.f34851a;
            if (str != null) {
                pVar.W(1899222916);
                boolean z3 = (i10 & AppLovinMediationAdapter.ERROR_CHILD_USER) == 32;
                Object objL = pVar.L();
                if (z3 || objL == eVar4) {
                    objL = new b7.c(str, 15);
                    pVar.g0(objL);
                }
                AtomicInteger atomicInteger = p2.n.f31099a;
                bVar2 = new p2.b((mk.c) objL, false);
                pVar.p(false);
            } else {
                pVar.W(1899381698);
                pVar.p(false);
                bVar2 = i1.k.f25553a;
            }
            i1.n nVarB = m1.f.b(p1.z.n(nVar.b(bVar2), null, 520191), bVar, 1.0f);
            Object objL2 = pVar.L();
            if (objL2 == eVar4) {
                objL2 = p0.f2480a;
                pVar.g0(objL2);
            }
            g2.j0 j0Var = (g2.j0) objL2;
            long j = pVar.T;
            int i11 = (int) ((j >>> 32) ^ j);
            i1.n nVarW = com.bumptech.glide.d.w(nVarB, pVar);
            i1 i1VarL = pVar.l();
            i2.g.R8.getClass();
            i2.x xVar = i2.f.f25653b;
            pVar.Z();
            if (pVar.S) {
                pVar.k(xVar);
            } else {
                pVar.j0();
            }
            u0.q.x(j0Var, i2.f.f25656e, pVar);
            u0.q.x(i1VarL, i2.f.f25655d, pVar);
            u0.q.t(pVar, i2.f.g);
            u0.q.x(nVarW, i2.f.f25654c, pVar);
            u0.q.p(pVar, Integer.valueOf(i11), i2.f.f25657f);
            pVar.p(true);
            hVar2 = g2.i.f24358a;
            eVar2 = eVar3;
            f11 = 1.0f;
        } else {
            pVar.R();
            eVar2 = eVar;
            hVar2 = hVar;
            f11 = f10;
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e(str, nVar, eVar2, hVar2, f11, i4) { // from class: c0.o0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f2472b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i1.n f2473c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ i1.e f2474d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ g2.h f2475e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f2476f;

                @Override // mk.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iZ = u0.q.z(9);
                    o.a(this.f2471a, this.f2472b, this.f2473c, this.f2474d, this.f2475e, this.f2476f, (u0.p) obj, iZ);
                    return yj.u.f37649a;
                }
            };
        }
    }

    public static float b(EdgeEffect edgeEffect, float f10, float f11, d3.c cVar) {
        float f12 = f0.f2413a;
        double dA = cVar.a() * 386.0878f * 160.0f * 0.84f;
        double d10 = f0.f2413a * dA;
        float fExp = (float) (Math.exp((f0.f2414b / f0.f2415c) * Math.log((Math.abs(f10) * 0.35f) / d10)) * d10);
        int i4 = Build.VERSION.SDK_INT;
        if (fExp > (i4 >= 31 ? m.b(edgeEffect) : 0.0f) * f11) {
            return 0.0f;
        }
        int iS = pk.a.s(f10);
        if (i4 >= 31) {
            edgeEffect.onAbsorb(iS);
            return f10;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iS);
        }
        return f10;
    }

    public static final i1.n c(i1.n nVar, long j, p1.j0 j0Var) {
        return nVar.b(new n(j, j0Var));
    }

    public static i1.n d(i1.n nVar, e0.i iVar, r0.e0 e0Var, boolean z3, mk.a aVar) {
        i1.n nVarB;
        if (e0Var != null) {
            nVarB = new y(iVar, e0Var, z3, aVar);
        } else if (e0Var == null) {
            nVarB = new y(iVar, null, z3, aVar);
        } else {
            i1.k kVar = i1.k.f25553a;
            nVarB = iVar != null ? q0.a(kVar, iVar, e0Var).b(new y(iVar, null, z3, aVar)) : com.bumptech.glide.d.k(kVar, new z(e0Var, z3, aVar));
        }
        return nVar.b(nVarB);
    }

    public static final boolean e(KeyEvent keyEvent) {
        long jA = ci.b.a(keyEvent.getKeyCode());
        return a2.a.a(jA, a2.a.f175h) || a2.a.a(jA, a2.a.f177k) || a2.a.a(jA, a2.a.f181o) || a2.a.a(jA, a2.a.j);
    }

    public static i1.n f(i1.n nVar, i0.u uVar, d0.a1 a1Var, j jVar, boolean z3, d0.k kVar, e0.i iVar) {
        float f10 = c0.f2378a;
        d0.a1 a1Var2 = d0.a1.f21662a;
        i1.k kVar2 = i1.k.f25553a;
        return nVar.b(a1Var == a1Var2 ? p1.z.n(kVar2, n0.f2469c, 518143) : p1.z.n(kVar2, n0.f2468b, 518143)).b(new d1(jVar, kVar, a1Var, uVar, iVar, z3));
    }

    public static final long g(long j, float f10) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f10);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f10);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }
}
