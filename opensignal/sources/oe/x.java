package oe;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class x extends t0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f19399a;

    public x(Comparator comparator) {
        this.f19399a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f19399a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return this.f19399a.equals(((x) obj).f19399a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19399a.hashCode();
    }

    public final String toString() {
        return this.f19399a.toString();
    }
}
