package qr;

import com.google.android.gms.internal.measurement.i4;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import mq.y;
import p.l2;
import rr.f0;
import rr.i0;
import ur.a0;

/* loaded from: classes.dex */
public final class s implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final gt.l f21009a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f21010b;

    /* renamed from: c, reason: collision with root package name */
    public dt.k f21011c;

    /* renamed from: d, reason: collision with root package name */
    public final gt.j f21012d;

    public s(gt.l lVar, l2 l2Var, a0 a0Var) {
        this.f21009a = lVar;
        this.f21010b = a0Var;
        this.f21012d = lVar.c(new as.d(10, this));
    }

    @Override // rr.i0
    public final boolean a(qs.c cVar) {
        br.l.e(cVar, "fqName");
        gt.j jVar = this.f21012d;
        Object obj = ((ConcurrentHashMap) jVar.f9654g).get(cVar);
        return ((obj == null || obj == gt.k.COMPUTING) ? c(cVar) : (f0) jVar.a(cVar)) == null;
    }

    @Override // rr.i0
    public final void b(qs.c cVar, ArrayList arrayList) {
        br.l.e(cVar, "fqName");
        rt.k.a(arrayList, this.f21012d.a(cVar));
    }

    public final et.c c(qs.c cVar) {
        InputStream inputStreamM;
        br.l.e(cVar, "fqName");
        if (cVar.h(or.o.f19721i)) {
            et.a.f8347m.getClass();
            inputStreamM = et.d.m(et.a.a(cVar));
        } else {
            inputStreamM = null;
        }
        if (inputStreamM != null) {
            return i4.k(cVar, this.f21009a, this.f21010b, inputStreamM);
        }
        return null;
    }

    @Override // rr.i0
    public final Collection l(qs.c cVar, ar.k kVar) {
        br.l.e(cVar, "fqName");
        return y.f16947a;
    }
}
