package pr;

import gt.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mq.o;
import mq.y;
import rr.a0;
import tt.s;
import ur.x;

/* loaded from: classes.dex */
public final class a implements tr.c {

    /* renamed from: a, reason: collision with root package name */
    public final l f20622a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f20623b;

    public a(l lVar, ur.a0 a0Var) {
        br.l.e(a0Var, "module");
        this.f20622a = lVar;
        this.f20623b = a0Var;
    }

    @Override // tr.c
    public final boolean a(qs.c cVar, qs.g gVar) {
        br.l.e(cVar, "packageFqName");
        br.l.e(gVar, "name");
        String strB = gVar.b();
        br.l.d(strB, "name.asString()");
        if (s.n0(strB, "Function", false) || s.n0(strB, "KFunction", false) || s.n0(strB, "SuspendFunction", false) || s.n0(strB, "KSuspendFunction", false)) {
            g.Companion.getClass();
            if (f.a(strB, cVar) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // tr.c
    public final rr.f b(qs.b bVar) {
        br.l.e(bVar, "classId");
        if (bVar.f21023c || !bVar.f21022b.e().d()) {
            return null;
        }
        String strB = bVar.h().b();
        if (!tt.l.q0(strB, "Function", false)) {
            return null;
        }
        qs.c cVarG = bVar.g();
        br.l.d(cVarG, "classId.packageFqName");
        g.Companion.getClass();
        e eVarA = f.a(strB, cVarG);
        if (eVarA == null) {
            return null;
        }
        g gVar = eVarA.f20628a;
        int i10 = eVarA.f20629b;
        List list = (List) io.sentry.config.a.Z(((x) this.f20623b.J0(cVarG)).f23680y, x.E[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof et.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (o.t0(arrayList2) != null) {
            throw new ClassCastException();
        }
        return new d(this.f20622a, (et.c) o.r0(arrayList), gVar, i10);
    }

    @Override // tr.c
    public final Collection c(qs.c cVar) {
        br.l.e(cVar, "packageFqName");
        return y.f16947a;
    }
}
