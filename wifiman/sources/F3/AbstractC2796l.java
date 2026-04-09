package F3;

import java.util.Set;

/* renamed from: F3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2796l extends AbstractC2788d implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC2792h f5926b;

    AbstractC2796l() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC2803t.a(this);
    }

    public final AbstractC2792h s() {
        AbstractC2792h abstractC2792h = this.f5926b;
        if (abstractC2792h != null) {
            return abstractC2792h;
        }
        AbstractC2792h abstractC2792hV = v();
        this.f5926b = abstractC2792hV;
        return abstractC2792hV;
    }

    AbstractC2792h v() {
        Object[] array = toArray();
        int i10 = AbstractC2792h.f5916c;
        return AbstractC2792h.v(array, array.length);
    }
}
