package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final z2.c f33408a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33409b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33410c;

    public n(z2.c cVar, int i4, int i10) {
        this.f33408a = cVar;
        this.f33409b = i4;
        this.f33410c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f33408a.equals(nVar.f33408a) && this.f33409b == nVar.f33409b && this.f33410c == nVar.f33410c;
    }

    public final int hashCode() {
        return (((this.f33408a.hashCode() * 31) + this.f33409b) * 31) + this.f33410c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f33408a);
        sb2.append(", startIndex=");
        sb2.append(this.f33409b);
        sb2.append(", endIndex=");
        return d.h.u(sb2, this.f33410c, ')');
    }
}
