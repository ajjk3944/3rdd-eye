package ht;

import java.util.List;

/* loaded from: classes.dex */
public abstract class x implements sr.a, lt.d {

    /* renamed from: a, reason: collision with root package name */
    public int f10953a;

    public abstract List L();

    public abstract at.n W();

    public abstract i0 X();

    public abstract m0 Z();

    public abstract boolean c0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (c0() == xVar.c0()) {
            return c.t(jt.e.f13842d, k0(), xVar.k0());
        }
        return false;
    }

    @Override // sr.a
    public final sr.h getAnnotations() {
        return j.a(X());
    }

    public abstract x h0(jt.f fVar);

    public final int hashCode() {
        int iHashCode;
        int i10 = this.f10953a;
        if (i10 != 0) {
            return i10;
        }
        if (c.i(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (c0() ? 1 : 0) + ((L().hashCode() + (Z().hashCode() * 31)) * 31);
        }
        this.f10953a = iHashCode;
        return iHashCode;
    }

    public abstract c1 k0();
}
