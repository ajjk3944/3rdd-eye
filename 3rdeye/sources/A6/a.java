package A6;

import H6.C0675l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: DivTimerEventDispatcher.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Q6.c f37a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f38b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f39c = new LinkedHashSet();

    public a(Q6.c cVar) {
        this.f37a = cVar;
    }

    public final void a(C0675l c0675l) {
        Iterator it = this.f39c.iterator();
        while (it.hasNext()) {
            l lVar = (l) this.f38b.get((String) it.next());
            if (lVar != null && !c0675l.equals(lVar.f79e)) {
                lVar.f79e = c0675l;
                if (lVar.i) {
                    lVar.f83j.g();
                    lVar.i = false;
                }
            }
        }
    }

    public final void b(C0675l c0675l) {
        for (l lVar : this.f38b.values()) {
            if (c0675l.equals(lVar.f79e)) {
                lVar.f79e = null;
                lVar.f83j.h();
                lVar.i = true;
            }
        }
    }
}
