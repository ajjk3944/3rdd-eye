package lq;

/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public static final g f15565x = new g(2, 2, 21);

    /* renamed from: a, reason: collision with root package name */
    public final int f15566a;

    /* renamed from: d, reason: collision with root package name */
    public final int f15567d;

    /* renamed from: g, reason: collision with root package name */
    public final int f15568g;

    /* renamed from: r, reason: collision with root package name */
    public final int f15569r;

    public g(int i10, int i11, int i12) {
        this.f15566a = i10;
        this.f15567d = i11;
        this.f15568g = i12;
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            this.f15569r = (i10 << 16) + (i11 << 8) + i12;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        br.l.e(gVar, "other");
        return this.f15569r - gVar.f15569r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.f15569r == gVar.f15569r;
    }

    public final int hashCode() {
        return this.f15569r;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15566a);
        sb2.append('.');
        sb2.append(this.f15567d);
        sb2.append('.');
        sb2.append(this.f15568g);
        return sb2.toString();
    }
}
