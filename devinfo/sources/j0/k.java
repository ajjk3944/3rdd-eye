package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f26920a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26921b;

    public k(int i4, int i10) {
        this.f26920a = i4;
        this.f26921b = i10;
        if (!(i4 >= 0)) {
            f0.a.a("negative start index");
        }
        if (i10 >= i4) {
            return;
        }
        f0.a.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f26920a == kVar.f26920a && this.f26921b == kVar.f26921b;
    }

    public final int hashCode() {
        return (this.f26920a * 31) + this.f26921b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f26920a);
        sb2.append(", end=");
        return d.h.u(sb2, this.f26921b, ')');
    }
}
