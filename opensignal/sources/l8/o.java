package l8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import mq.x;

/* loaded from: classes.dex */
public final class o implements Iterable, cr.a {

    /* renamed from: d, reason: collision with root package name */
    public static final o f14961d = new o(x.f16946a);

    /* renamed from: a, reason: collision with root package name */
    public final Map f14962a;

    public o(Map map) {
        this.f14962a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return br.l.a(this.f14962a, ((o) obj).f14962a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14962a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f14962a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new lq.l(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f14962a + ')';
    }
}
