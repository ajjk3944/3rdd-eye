package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f21960e = new j(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f21961a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21962b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21963c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21964d;

    public j(int i4, int i10, int i11, int i12) {
        this.f21961a = i4;
        this.f21962b = i10;
        this.f21963c = i11;
        this.f21964d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f21961a == jVar.f21961a && this.f21962b == jVar.f21962b && this.f21963c == jVar.f21963c && this.f21964d == jVar.f21964d;
    }

    public final int hashCode() {
        return (((((this.f21961a * 31) + this.f21962b) * 31) + this.f21963c) * 31) + this.f21964d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f21961a);
        sb2.append(", ");
        sb2.append(this.f21962b);
        sb2.append(", ");
        sb2.append(this.f21963c);
        sb2.append(", ");
        return d.h.u(sb2, this.f21964d, ')');
    }
}
