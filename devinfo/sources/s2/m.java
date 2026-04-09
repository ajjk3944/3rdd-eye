package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final a f33402a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33403b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33404c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33405d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33406e;

    /* renamed from: f, reason: collision with root package name */
    public final float f33407f;
    public final float g;

    public m(a aVar, int i4, int i10, int i11, int i12, float f10, float f11) {
        this.f33402a = aVar;
        this.f33403b = i4;
        this.f33404c = i10;
        this.f33405d = i11;
        this.f33406e = i12;
        this.f33407f = f10;
        this.g = f11;
    }

    public final int a(int i4) {
        int i10 = this.f33404c;
        int i11 = this.f33403b;
        return ci.b.e(i4, i11, i10) - i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f33402a.equals(mVar.f33402a) && this.f33403b == mVar.f33403b && this.f33404c == mVar.f33404c && this.f33405d == mVar.f33405d && this.f33406e == mVar.f33406e && Float.compare(this.f33407f, mVar.f33407f) == 0 && Float.compare(this.g, mVar.g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.g) + r5.c.d(this.f33407f, ((((((((this.f33402a.hashCode() * 31) + this.f33403b) * 31) + this.f33404c) * 31) + this.f33405d) * 31) + this.f33406e) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f33402a);
        sb2.append(", startIndex=");
        sb2.append(this.f33403b);
        sb2.append(", endIndex=");
        sb2.append(this.f33404c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f33405d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f33406e);
        sb2.append(", top=");
        sb2.append(this.f33407f);
        sb2.append(", bottom=");
        return r5.c.k(sb2, this.g, ')');
    }
}
