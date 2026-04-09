package g3;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.a0;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import ec.y;
import i2.e0;
import j2.a1;
import j2.h0;
import u0.i1;
import u0.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final y f24502a = new y(25);

    public static final void a(mk.c cVar, i1.n nVar, mk.c cVar2, mk.c cVar3, mk.c cVar4, u0.p pVar, int i4) {
        pVar.X(-180024211);
        int i10 = i4 | (pVar.h(cVar) ? 4 : 2) | (pVar.h(cVar4) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE);
        if (pVar.O(i10 & 1, (i10 & 9363) != 9362)) {
            long j = pVar.T;
            int i11 = (int) (j ^ (j >>> 32));
            i1.n nVarW = com.bumptech.glide.d.w(nVar.b(q.f24526a).b(n1.r.f29548a).b(v.f24536a).b(t.f24533a), pVar);
            d3.c cVar5 = (d3.c) pVar.j(a1.f27074h);
            d3.l lVar = (d3.l) pVar.j(a1.f27079n);
            i1 i1VarL = pVar.l();
            a0 a0Var = (a0) pVar.j(f5.a.f23655a);
            a6.f fVar = (a6.f) pVar.j(b6.b.f1967a);
            if (cVar2 != null) {
                pVar.W(1313917368);
                mk.a aVarE = e(cVar, pVar, i10 & 14);
                pVar.Z();
                if (pVar.S) {
                    pVar.k(aVarE);
                } else {
                    pVar.j0();
                }
                f(pVar, nVarW, i11, cVar5, a0Var, fVar, lVar, i1VarL);
                u0.q.x(cVar2, l.f24503b, pVar);
                u0.q.x(cVar4, l.f24504c, pVar);
                u0.q.x(cVar3, l.f24505d, pVar);
                pVar.p(true);
                pVar.p(false);
            } else {
                pVar.W(1314774735);
                mk.a aVarE2 = e(cVar, pVar, i10 & 14);
                pVar.S(125, null, 1, null);
                pVar.f34913r = true;
                if (pVar.S) {
                    pVar.k(aVarE2);
                } else {
                    pVar.j0();
                }
                f(pVar, nVarW, i11, cVar5, a0Var, fVar, lVar, i1VarL);
                u0.q.x(cVar4, l.f24506e, pVar);
                u0.q.x(cVar3, l.f24507f, pVar);
                pVar.p(true);
                pVar.p(false);
            }
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new m(cVar, nVar, cVar2, cVar3, cVar4, i4);
        }
    }

    public static final View b(i1.m mVar) {
        x xVar = i2.k.s(mVar.f25554a).f25640p;
        View interopView = xVar != null ? xVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void c(x xVar, e0 e0Var) {
        long jE = ((i2.q) e0Var.G.f19257d).E(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jE >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jE & 4294967295L)));
        xVar.layout(iRound, iRound2, xVar.getMeasuredWidth() + iRound, xVar.getMeasuredHeight() + iRound2);
    }

    public static final x d(e0 e0Var) {
        x xVar = e0Var.f25640p;
        if (xVar != null) {
            return xVar;
        }
        throw d.h.o("Required value was null.");
    }

    public static final mk.a e(mk.c cVar, u0.p pVar, int i4) {
        long j = pVar.T;
        int i10 = (int) (j ^ (j >>> 32));
        Context context = (Context) pVar.j(h0.f27170b);
        u0.o oVarU = u0.q.u(pVar);
        f1.g gVar = (f1.g) pVar.j(f1.i.f23623a);
        View view = (View) pVar.j(h0.f27174f);
        boolean zH = ((((i4 & 14) ^ 6) > 4 && pVar.f(cVar)) || (i4 & 6) == 4) | pVar.h(context) | pVar.h(oVarU) | pVar.h(gVar) | pVar.d(i10) | pVar.h(view);
        Object objL = pVar.L();
        if (zH || objL == u0.l.f34851a) {
            Object nVar = new n(context, cVar, oVarU, gVar, i10, view);
            pVar.g0(nVar);
            objL = nVar;
        }
        return (mk.a) objL;
    }

    public static final void f(u0.p pVar, i1.n nVar, int i4, d3.c cVar, a0 a0Var, a6.f fVar, d3.l lVar, i1 i1Var) {
        i2.g.R8.getClass();
        u0.q.x(i1Var, i2.f.f25655d, pVar);
        u0.q.x(nVar, l.g, pVar);
        u0.q.x(cVar, l.f24508h, pVar);
        u0.q.x(a0Var, l.f24509i, pVar);
        u0.q.x(fVar, l.j, pVar);
        u0.q.x(lVar, l.f24510k, pVar);
        u0.q.p(pVar, Integer.valueOf(i4), i2.f.f25657f);
    }
}
