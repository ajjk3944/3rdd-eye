package D3;

import java.util.Set;

/* renamed from: D3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2568i extends AbstractC2561b implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC2564e f2861b;

    AbstractC2568i() {
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
        return AbstractC2576q.a(this);
    }

    public final AbstractC2564e s() {
        AbstractC2564e abstractC2564e = this.f2861b;
        if (abstractC2564e != null) {
            return abstractC2564e;
        }
        AbstractC2564e abstractC2564eV = v();
        this.f2861b = abstractC2564eV;
        return abstractC2564eV;
    }

    AbstractC2564e v() {
        Object[] array = toArray();
        int i10 = AbstractC2564e.f2854c;
        return AbstractC2564e.v(array, array.length);
    }
}
