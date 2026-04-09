package ft;

import com.google.android.gms.internal.measurement.e5;
import dt.x;
import h7.h0;
import ht.d1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ls.q0;
import ls.u0;
import ls.v0;
import p.v2;
import rr.p0;

/* loaded from: classes.dex */
public final class v extends ur.c {
    public final al.b H;
    public final v0 I;
    public final a J;

    /* JADX WARN: Illegal instructions before constructor call */
    public v(al.b bVar, v0 v0Var, int i10) {
        d1 d1Var;
        dt.k kVar = (dt.k) bVar.f810b;
        gt.l lVar = kVar.f7493a;
        rr.l lVar2 = (rr.l) bVar.f812d;
        qs.g gVarY = io.sentry.config.a.Y((ns.f) bVar.f811c, v0Var.f15895x);
        u0 u0Var = v0Var.B;
        br.l.d(u0Var, "proto.variance");
        int i11 = x.f7552c[u0Var.ordinal()];
        if (i11 == 1) {
            d1Var = d1.IN_VARIANCE;
        } else if (i11 == 2) {
            d1Var = d1.OUT_VARIANCE;
        } else {
            if (i11 != 3) {
                throw new bf.n();
            }
            d1Var = d1.INVARIANT;
        }
        d1 d1Var2 = d1Var;
        super(lVar, lVar2, sr.g.f22217a, gVarY, d1Var2, v0Var.f15896y, i10, p0.f21711g);
        this.H = bVar;
        this.I = v0Var;
        this.J = new a(kVar.f7493a, new as.x(25, this));
    }

    @Override // androidx.lifecycle.o, sr.a
    public final sr.h getAnnotations() {
        return this.J;
    }

    @Override // ur.i
    public final List w1() {
        al.b bVar = this.H;
        h0 h0Var = (h0) bVar.f813e;
        v0 v0Var = this.I;
        br.l.e(v0Var, "<this>");
        List list = v0Var.D;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = v0Var.E;
            br.l.d(list2, "upperBoundIdList");
            ArrayList arrayList = new ArrayList(mq.p.a0(list2, 10));
            for (Integer num : list2) {
                br.l.d(num, "it");
                arrayList.add(h0Var.x(num.intValue()));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return e5.H(xs.d.e(this).m());
        }
        v2 v2Var = (v2) bVar.f809a;
        ArrayList arrayList2 = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(v2Var.m((q0) it.next()));
        }
        return arrayList2;
    }
}
