package r0;

import g2.f1;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y extends i1.m implements i2.h, i2.u {

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap f32710o;

    @Override // i2.u
    public final /* synthetic */ int L(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.d(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int S(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.h(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final g2.k0 a0(g2.l0 l0Var, g2.i0 i0Var, long j) {
        float f10 = ((d3.f) i2.k.h(this, t.f32657c)).f21957a;
        float f11 = 0;
        if (f10 < f11) {
            f10 = f11;
        }
        g2.s0 s0VarV = i0Var.v(j);
        boolean z3 = this.f25565n && !Float.isNaN(f10) && d3.f.a(f10, f11) > 0;
        int iQ = !Float.isNaN(f10) ? l0Var.Q(f10) : 0;
        int iMax = z3 ? Math.max(s0VarV.f24408a, iQ) : s0VarV.f24408a;
        int iMax2 = z3 ? Math.max(s0VarV.f24409b, iQ) : s0VarV.f24409b;
        if (z3) {
            LinkedHashMap linkedHashMap = this.f32710o;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f32710o = linkedHashMap;
            }
            f1 f1Var = t.f32656b;
            int iRound = Math.round((iQ - s0VarV.f24408a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(f1Var, Integer.valueOf(iRound));
            g2.l lVar = t.f32655a;
            int iRound2 = Math.round((iQ - s0VarV.f24409b) / 2.0f);
            linkedHashMap.put(lVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.f32710o;
        if (map == null) {
            map = zj.t.f38318a;
        }
        return l0Var.O(iMax, iMax2, map, new g0.b0(iMax, s0VarV, iMax2));
    }

    @Override // i2.u
    public final /* synthetic */ int h(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.f(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int t(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.b(this, m0Var, i0Var, i4);
    }
}
