package zn;

import br.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.p;
import on.k;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final List f27463a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27464b;

    /* renamed from: c, reason: collision with root package name */
    public final bo.a f27465c;

    public b(List list, boolean z10, bo.a aVar) {
        l.e(list, "values");
        this.f27463a = list;
        this.f27464b = z10;
        this.f27465c = aVar;
    }

    @Override // yn.a
    public final boolean a() {
        boolean z10;
        List<hq.c> listA = ((k) this.f27465c).a();
        ArrayList arrayList = new ArrayList(p.a0(listA, 10));
        for (hq.c cVar : listA) {
            l.e(cVar, "<this>");
            arrayList.add(new co.a(cVar.key, cVar.value));
        }
        if (arrayList.isEmpty()) {
            z10 = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                co.a aVar = (co.a) it.next();
                if (l.a(aVar.f3997a, hq.c.USER_ID) && !tt.l.D0(aVar.f3998b)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        boolean z11 = z10 == ((Boolean) this.f27463a.get(0)).booleanValue();
        return this.f27464b ? !z11 : z11;
    }
}
