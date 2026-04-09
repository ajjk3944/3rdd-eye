package t2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f22388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22389b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22390c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22391d;

    public h(int i10, int i11, int i12, int i13) {
        this.f22388a = i10;
        this.f22389b = i11;
        this.f22390c = i12;
        this.f22391d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f22388a == hVar.f22388a && this.f22389b == hVar.f22389b && this.f22390c == hVar.f22390c && this.f22391d == hVar.f22391d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22391d) + c7.a.C(this.f22390c, c7.a.C(this.f22389b, Integer.hashCode(this.f22388a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f22388a);
        sb2.append(", ");
        sb2.append(this.f22389b);
        sb2.append(", ");
        sb2.append(this.f22390c);
        sb2.append(", ");
        return c7.a.q(sb2, this.f22391d, ')');
    }
}
