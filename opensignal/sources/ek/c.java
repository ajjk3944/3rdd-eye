package ek;

import br.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.p;
import mq.w;
import xj.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final qj.a f8192a;

    /* renamed from: b, reason: collision with root package name */
    public final hi.a f8193b;

    /* renamed from: c, reason: collision with root package name */
    public final i f8194c;

    public c(qj.a aVar, gi.a aVar2, hi.a aVar3) {
        l.e(aVar2, "mapper");
        this.f8192a = aVar;
        this.f8194c = aVar2;
        this.f8193b = aVar3;
    }

    public ArrayList a(List list) {
        ArrayList arrayList;
        l.e(list, "taskIds");
        synchronized (this.f8192a) {
            try {
                qj.a aVar = this.f8192a;
                hi.a aVar2 = this.f8193b;
                ArrayList arrayList2 = new ArrayList(p.a0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Number) it.next()).longValue();
                    arrayList2.add("task_id");
                }
                ArrayList arrayList3 = new ArrayList(p.a0(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(String.valueOf(((Number) it2.next()).longValue()));
                }
                ArrayList arrayListJ = aVar.j(aVar2, arrayList2, arrayList3);
                arrayList = new ArrayList();
                Iterator it3 = arrayListJ.iterator();
                while (it3.hasNext()) {
                    vj.c cVar = (vj.c) this.f8194c.a((rj.b) it3.next());
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public ArrayList b() {
        hi.a aVar = this.f8193b;
        w wVar = w.f16945a;
        ArrayList arrayListJ = this.f8192a.j(aVar, wVar, wVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListJ.iterator();
        while (it.hasNext()) {
            bj.a aVar2 = (bj.a) this.f8194c.a((rj.e) it.next());
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        return arrayList;
    }

    public c(qj.a aVar, hi.a aVar2, gi.a aVar3) {
        l.e(aVar3, "mapper");
        this.f8192a = aVar;
        this.f8193b = aVar2;
        this.f8194c = aVar3;
    }

    public c(qj.a aVar, gi.c cVar, hi.a aVar2, df.c cVar2) {
        l.e(cVar, "mapper");
        this.f8192a = aVar;
        this.f8194c = cVar;
        this.f8193b = aVar2;
    }
}
