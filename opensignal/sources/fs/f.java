package fs;

import at.n;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import ht.b0;
import ht.d1;
import ht.g0;
import ht.i0;
import ht.m0;
import ht.p0;
import ht.s0;
import ht.x;
import ht.y0;
import java.util.ArrayList;
import java.util.List;
import kt.j;
import kt.k;
import lq.l;
import mq.p;
import rr.i;
import rr.r0;

/* loaded from: classes.dex */
public final class f extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f9064c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f9065d;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f9066b = new io.sentry.internal.debugmeta.c(new et.d());

    static {
        y0 y0Var = y0.COMMON;
        f9064c = b4.f0(y0Var, false, null, 5).b(b.FLEXIBLE_LOWER_BOUND);
        f9065d = b4.f0(y0Var, false, null, 5).b(b.FLEXIBLE_UPPER_BOUND);
    }

    @Override // ht.s0
    public final p0 d(x xVar) {
        return new g0(h(xVar, new a(y0.COMMON, false, false, null, 62)));
    }

    public final l g(b0 b0Var, rr.f fVar, a aVar) {
        if (b0Var.Z().o().isEmpty()) {
            return new l(b0Var, Boolean.FALSE);
        }
        if (or.h.y(b0Var)) {
            p0 p0Var = (p0) b0Var.L().get(0);
            d1 d1VarA = p0Var.a();
            x xVarB = p0Var.b();
            br.l.d(xVarB, "componentTypeProjection.type");
            return new l(ht.e.r(b0Var.X(), b0Var.Z(), e5.H(new g0(h(xVarB, aVar), d1VarA)), b0Var.c0()), Boolean.FALSE);
        }
        if (ht.c.i(b0Var)) {
            return new l(k.c(j.ERROR_RAW_TYPE, b0Var.Z().toString()), Boolean.FALSE);
        }
        n nVarE0 = fVar.e0(this);
        br.l.d(nVarE0, "declaration.getMemberScope(this)");
        i0 i0VarX = b0Var.X();
        m0 m0VarV = fVar.v();
        br.l.d(m0VarV, "declaration.typeConstructor");
        List<r0> listO = fVar.v().o();
        br.l.d(listO, "declaration.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(p.a0(listO, 10));
        for (r0 r0Var : listO) {
            br.l.d(r0Var, "parameter");
            io.sentry.internal.debugmeta.c cVar = this.f9066b;
            arrayList.add(et.d.d(r0Var, aVar, cVar, cVar.k(r0Var, aVar)));
        }
        return new l(ht.e.t(i0VarX, m0VarV, arrayList, b0Var.c0(), nVarE0, new as.d(fVar, this, b0Var, aVar)), Boolean.TRUE);
    }

    public final x h(x xVar, a aVar) {
        i iVarP = xVar.Z().p();
        if (iVarP instanceof r0) {
            aVar.getClass();
            return h(this.f9066b.k((r0) iVarP, a.a(aVar, null, true, null, null, 59)), aVar);
        }
        if (!(iVarP instanceof rr.f)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + iVarP).toString());
        }
        i iVarP2 = ht.c.y(xVar).Z().p();
        if (iVarP2 instanceof rr.f) {
            l lVarG = g(ht.c.k(xVar), (rr.f) iVarP, f9064c);
            b0 b0Var = (b0) lVarG.f15571a;
            boolean zBooleanValue = ((Boolean) lVarG.f15572d).booleanValue();
            l lVarG2 = g(ht.c.y(xVar), (rr.f) iVarP2, f9065d);
            b0 b0Var2 = (b0) lVarG2.f15571a;
            return (zBooleanValue || ((Boolean) lVarG2.f15572d).booleanValue()) ? new h(b0Var, b0Var2) : ht.e.j(b0Var, b0Var2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + iVarP2 + "\" while for lower it's \"" + iVarP + '\"').toString());
    }
}
