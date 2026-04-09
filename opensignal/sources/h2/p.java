package h2;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final b f9859a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9860b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9861c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9862d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9863e;

    /* renamed from: f, reason: collision with root package name */
    public final float f9864f;

    /* renamed from: g, reason: collision with root package name */
    public final float f9865g;

    public p(b bVar, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f9859a = bVar;
        this.f9860b = i10;
        this.f9861c = i11;
        this.f9862d = i12;
        this.f9863e = i13;
        this.f9864f = f10;
        this.f9865g = f11;
    }

    public final int a(int i10) {
        int i11 = this.f9861c;
        int i12 = this.f9860b;
        return vc.e.h(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f9859a.equals(pVar.f9859a) && this.f9860b == pVar.f9860b && this.f9861c == pVar.f9861c && this.f9862d == pVar.f9862d && this.f9863e == pVar.f9863e && Float.compare(this.f9864f, pVar.f9864f) == 0 && Float.compare(this.f9865g, pVar.f9865g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9865g) + w.g.a(c7.a.C(this.f9863e, c7.a.C(this.f9862d, c7.a.C(this.f9861c, c7.a.C(this.f9860b, this.f9859a.hashCode() * 31, 31), 31), 31), 31), this.f9864f, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f9859a);
        sb2.append(", startIndex=");
        sb2.append(this.f9860b);
        sb2.append(", endIndex=");
        sb2.append(this.f9861c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f9862d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f9863e);
        sb2.append(", top=");
        sb2.append(this.f9864f);
        sb2.append(", bottom=");
        return h0.b.q(sb2, this.f9865g, ')');
    }
}
