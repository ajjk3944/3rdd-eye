package st;

import androidx.lifecycle.p0;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lu.u;
import mq.w;

/* loaded from: classes.dex */
public abstract class l extends m {
    public static int X(j jVar) {
        Iterator it = jVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                e5.P();
                throw null;
            }
        }
        return i10;
    }

    public static j Y(j jVar, int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? jVar : jVar instanceof c ? ((c) jVar).a(i10) : new b(jVar, i10);
        }
        throw new IllegalArgumentException(h0.b.m("Requested element count ", i10, " is less than zero.").toString());
    }

    public static final g Z(j jVar) {
        u uVar = new u(1);
        if (!(jVar instanceof p)) {
            return new g(jVar, new u(2), uVar);
        }
        p pVar = (p) jVar;
        return new g(pVar.f22304a, pVar.f22305b, uVar);
    }

    public static j a0(Object obj, ar.k kVar) {
        return obj == null ? d.f22279a : new i(new p0(17, obj), kVar);
    }

    public static p b0(j jVar, ar.k kVar) {
        br.l.e(kVar, "transform");
        return new p(jVar, kVar);
    }

    public static f c0(j jVar, ar.k kVar) {
        return new f(new p(jVar, kVar), false, new u(3));
    }

    public static List d0(j jVar) {
        Iterator it = jVar.iterator();
        if (!it.hasNext()) {
            return w.f16945a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return e5.H(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
