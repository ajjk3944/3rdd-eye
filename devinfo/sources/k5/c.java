package k5;

import java.util.List;
import je.u;
import nk.k;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f27937a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27938b;

    public c(int i4, List list) {
        this.f27937a = list;
        this.f27938b = i4;
        if (list.isEmpty() && i4 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i4 >= 0 && i4 < size) {
                return;
            }
        }
        StringBuilder sbW = u.w(i4, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        sbW.append(new sk.d(0, list.size() - 1, 1));
        sbW.append("'.");
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f27938b == cVar.f27938b && k.a(this.f27937a, cVar.f27937a);
    }

    public final int hashCode() {
        return this.f27937a.hashCode() + (this.f27938b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f27938b + ", mergedHistory=" + this.f27937a + ')';
    }

    public c() {
        this(-1, s.f38317a);
    }
}
