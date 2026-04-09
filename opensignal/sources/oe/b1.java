package oe;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class b1 extends t0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f19302a;

    public b1(t0 t0Var) {
        this.f19302a = t0Var;
    }

    @Override // oe.t0
    public final t0 b() {
        return this.f19302a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f19302a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            return this.f19302a.equals(((b1) obj).f19302a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f19302a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19302a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 10);
        sb2.append(strValueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
