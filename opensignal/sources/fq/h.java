package fq;

import br.l;
import io.sentry.android.core.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.p;

/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final List f9041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9042b;

    /* renamed from: c, reason: collision with root package name */
    public final g1.f f9043c;

    /* renamed from: d, reason: collision with root package name */
    public final iq.f f9044d;

    public h(List list, int i10, g1.f fVar, iq.f fVar2) {
        l.e(list, "screens");
        l.e(fVar, "activeScreenProvider");
        l.e(fVar2, "timestampProvider");
        this.f9041a = list;
        this.f9042b = i10;
        this.f9043c = fVar;
        this.f9044d = fVar2;
    }

    @Override // yn.a
    public final boolean a() {
        Object next;
        List list = this.f9041a;
        if (!list.isEmpty()) {
            Object obj = this.f9043c.f9210g;
            ArrayList arrayList = new ArrayList(p.a0(list, 10));
            Iterator it = list.iterator();
            while (true) {
                boolean z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                Iterator it2 = ((Iterable) obj).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((cq.b) next).f6610a.equals(str)) {
                        break;
                    }
                }
                cq.b bVar = (cq.b) next;
                if (bVar != null) {
                    boolean z11 = this.f9042b == 0;
                    long j = bVar.f6611b + (r4 * 1000);
                    ((u0) this.f9044d).getClass();
                    boolean z12 = j < System.currentTimeMillis();
                    if (z11 || z12) {
                        z10 = true;
                    }
                }
                arrayList.add(Boolean.valueOf(z10));
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((Boolean) it3.next()).booleanValue()) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
