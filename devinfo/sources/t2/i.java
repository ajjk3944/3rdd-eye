package t2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f34127a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34128b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34129c;

    public i(int i4, int i10, boolean z3) {
        this.f34127a = i4;
        this.f34128b = i10;
        this.f34129c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f34127a == iVar.f34127a && this.f34128b == iVar.f34128b && this.f34129c == iVar.f34129c;
    }

    public final int hashCode() {
        return (((this.f34127a * 31) + this.f34128b) * 31) + (this.f34129c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BidiRun(start=");
        sb2.append(this.f34127a);
        sb2.append(", end=");
        sb2.append(this.f34128b);
        sb2.append(", isRtl=");
        return d.h.x(sb2, this.f34129c, ')');
    }
}
