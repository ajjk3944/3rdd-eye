package r0;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import u0.m1;
import u0.o2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final o2 f32683a;

    static {
        a.a.u(new b6.a(26));
        f32683a = new o2(new b6.a(27));
    }

    public static final void a(final l lVar, final a0 a0Var, final g0 g0Var, final w0 w0Var, final c1.h hVar, u0.p pVar, final int i4) {
        int i10;
        char c9;
        char c10;
        pVar.X(904511636);
        if ((i4 & 6) == 0) {
            i10 = (pVar.f(lVar) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= pVar.f(a0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= pVar.f(g0Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= pVar.f(w0Var) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i4 & 24576) == 0) {
            i10 |= pVar.h(hVar) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        int i11 = 1;
        if (pVar.O(i10 & 1, (i10 & 9363) != 9362)) {
            pVar.T();
            if ((i4 & 1) != 0 && !pVar.y()) {
                pVar.R();
            }
            pVar.q();
            e0 e0VarA = d0.a(7, 0.0f);
            long j = lVar.f32564a;
            boolean zE = pVar.e(j);
            Object objL = pVar.L();
            if (zE || objL == u0.l.f34851a) {
                c9 = 2;
                c10 = 4;
                objL = new p0.b(j, p1.s.b(j, 0.4f));
                pVar.g0(objL);
            } else {
                c9 = 2;
                c10 = 4;
            }
            p.r rVarA = m.f32596a.a(lVar);
            p.r rVarA2 = f32683a.a(a0Var);
            p.r rVarA3 = c0.q0.f2488a.a(e0VarA);
            p.r rVarA4 = h0.f32544a.a(g0Var);
            p.r rVarA5 = p0.c.f30945a.a((p0.b) objL);
            p.r rVarA6 = x0.f32709a.a(w0Var);
            p.r[] rVarArr = new p.r[6];
            rVarArr[0] = rVarA;
            rVarArr[1] = rVarA2;
            rVarArr[c9] = rVarA3;
            rVarArr[3] = rVarA4;
            rVarArr[c10] = rVarA5;
            rVarArr[5] = rVarA6;
            u0.q.b(rVarArr, c1.n.c(-1750539308, new f(w0Var, hVar, i11), pVar), pVar, 56);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e() { // from class: r0.v
                @Override // mk.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w.a(lVar, a0Var, g0Var, w0Var, hVar, (u0.p) obj, u0.q.z(i4 | 1));
                    return yj.u.f37649a;
                }
            };
        }
    }

    public static final void b(l lVar, g0 g0Var, w0 w0Var, c1.h hVar, u0.p pVar, final int i4) {
        u0.p pVar2;
        final c1.h hVar2;
        final w0 w0Var2;
        final g0 g0Var2;
        final l lVar2;
        pVar.X(-449719819);
        int i10 = (pVar.f(lVar) ? 4 : 2) | i4 | (pVar.f(g0Var) ? 32 : 16) | (pVar.h(hVar) ? 2048 : Segment.SHARE_MINIMUM);
        if (pVar.O(i10 & 1, (i10 & 1171) != 1170)) {
            pVar.T();
            if ((i4 & 1) != 0 && !pVar.y()) {
                pVar.R();
            }
            pVar.q();
            int i11 = i10 & 14;
            int i12 = i10 << 3;
            pVar2 = pVar;
            a(lVar, (a0) pVar.j(f32683a), g0Var, w0Var, hVar, pVar2, i11 | (i12 & 896) | 3072 | (i12 & 57344));
            lVar2 = lVar;
            g0Var2 = g0Var;
            w0Var2 = w0Var;
            hVar2 = hVar;
        } else {
            pVar2 = pVar;
            hVar2 = hVar;
            w0Var2 = w0Var;
            g0Var2 = g0Var;
            lVar2 = lVar;
            pVar2.R();
        }
        m1 m1VarR = pVar2.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e(g0Var2, w0Var2, hVar2, i4) { // from class: r0.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g0 f32662b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w0 f32663c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ c1.h f32664d;

                @Override // mk.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iZ = u0.q.z(385);
                    w.b(this.f32661a, this.f32662b, this.f32663c, this.f32664d, (u0.p) obj, iZ);
                    return yj.u.f37649a;
                }
            };
        }
    }
}
