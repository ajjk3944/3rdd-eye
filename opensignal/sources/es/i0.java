package es;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import ht.a1;
import ht.d1;
import ht.y0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends ur.c {
    public final cj.a H;
    public final xr.c0 I;

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(cj.a aVar, xr.c0 c0Var, int i10, rr.m mVar) {
        br.l.e(c0Var, "javaTypeParameter");
        ds.a aVar2 = (ds.a) aVar.f3974d;
        super(aVar2.f7446a, mVar, new ds.c(aVar, c0Var, false), qs.g.e(c0Var.f25492a.getName()), d1.INVARIANT, false, i10, aVar2.f7456m);
        this.H = aVar;
        this.I = c0Var;
    }

    @Override // ur.i
    public final List v1(List list) {
        is.c cVar;
        cj.a aVar = this.H;
        is.c cVar2 = ((ds.a) aVar.f3974d).f7461r;
        cVar2.getClass();
        ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ht.x xVarB = (ht.x) it.next();
            is.l lVar = is.l.f12969y;
            br.l.e(xVarB, "<this>");
            if (a1.c(xVarB, lVar, null)) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                xVarB = cVar.b(new is.n(this, false, aVar, as.a.TYPE_PARAMETER_BOUNDS, false), xVarB, mq.w.f16945a, null, false);
                if (xVarB == null) {
                    xVarB = xVarB;
                }
            }
            arrayList.add(xVarB);
            cVar2 = cVar;
        }
        return arrayList;
    }

    @Override // ur.i
    public final List w1() {
        Type[] bounds = this.I.f25492a.getBounds();
        br.l.d(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new xr.q(type));
        }
        xr.q qVar = (xr.q) mq.o.K0(arrayList);
        List list = arrayList;
        if (br.l.a(qVar != null ? qVar.f25511a : null, Object.class)) {
            list = mq.w.f16945a;
        }
        boolean zIsEmpty = list.isEmpty();
        cj.a aVar = this.H;
        if (zIsEmpty) {
            return e5.H(ht.e.j(((ds.a) aVar.f3974d).f7458o.n().e(), ((ds.a) aVar.f3974d).f7458o.n().o()));
        }
        ArrayList arrayList2 = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bm.d) aVar.f3978y).U((xr.q) it.next(), b4.f0(y0.COMMON, false, this, 3)));
        }
        return arrayList2;
    }
}
