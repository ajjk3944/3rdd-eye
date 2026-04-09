package sr;

import ht.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f22225a;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f22226d;

    public l(h hVar, t0 t0Var) {
        this.f22225a = hVar;
        this.f22226d = t0Var;
    }

    @Override // sr.h
    public final boolean G(qs.c cVar) {
        br.l.e(cVar, "fqName");
        if (((Boolean) this.f22226d.a(cVar)).booleanValue()) {
            return this.f22225a.G(cVar);
        }
        return false;
    }

    @Override // sr.h
    public final boolean isEmpty() {
        h hVar = this.f22225a;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            return false;
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            qs.c cVarA = ((b) it.next()).a();
            if (cVarA != null && ((Boolean) this.f22226d.a(cVarA)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f22225a) {
            qs.c cVarA = ((b) obj).a();
            if (cVarA != null && ((Boolean) this.f22226d.a(cVarA)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // sr.h
    public final b w(qs.c cVar) {
        br.l.e(cVar, "fqName");
        if (((Boolean) this.f22226d.a(cVar)).booleanValue()) {
            return this.f22225a.w(cVar);
        }
        return null;
    }
}
