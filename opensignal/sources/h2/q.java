package h2;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final o2.d f9866a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9868c;

    public q(o2.d dVar, int i10, int i11) {
        this.f9866a = dVar;
        this.f9867b = i10;
        this.f9868c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f9866a.equals(qVar.f9866a) && this.f9867b == qVar.f9867b && this.f9868c == qVar.f9868c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9868c) + c7.a.C(this.f9867b, this.f9866a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f9866a);
        sb2.append(", startIndex=");
        sb2.append(this.f9867b);
        sb2.append(", endIndex=");
        return c7.a.q(sb2, this.f9868c, ')');
    }
}
