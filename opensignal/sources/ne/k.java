package ne;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements j, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f17528a;

    public k(List list) {
        this.f17528a = list;
    }

    @Override // ne.j
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f17528a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((j) list.get(i10)).apply(obj)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f17528a.equals(((k) obj).f17528a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17528a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f17528a) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
