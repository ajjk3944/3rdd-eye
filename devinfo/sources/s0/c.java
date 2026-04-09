package s0;

import c1.h;
import r0.o;
import r0.s0;
import s2.h0;
import s2.r;
import s2.s;
import u0.a0;
import u0.m1;
import u0.p;
import u0.q;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final s f33220a = new s(new r());

    public static final void a(final long j, final h0 h0Var, final h hVar, p pVar, final int i4) {
        pVar.X(-684938728);
        int i10 = (pVar.e(j) ? 4 : 2) | i4 | (pVar.f(h0Var) ? 32 : 16);
        if (pVar.O(i10 & 1, (i10 & 147) != 146)) {
            a0 a0Var = s0.f32654a;
            q.b(new p.r[]{o.f32614a.a(new p1.s(j)), a0Var.a(((h0) pVar.j(a0Var)).c(h0Var))}, hVar, pVar, 56);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e(j, h0Var, hVar, i4) { // from class: s0.f

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f33225a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h0 f33226b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h f33227c;

                @Override // mk.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iZ = q.z(385);
                    c.a(this.f33225a, this.f33226b, this.f33227c, (p) obj, iZ);
                    return u.f37649a;
                }
            };
        }
    }
}
