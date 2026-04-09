package h2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9800a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9801b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9802c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9803d;

    public d(Object obj, int i10, int i11, String str) {
        this.f9800a = obj;
        this.f9801b = i10;
        this.f9802c = i11;
        this.f9803d = str;
        if (i10 <= i11) {
            return;
        }
        m2.a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return br.l.a(this.f9800a, dVar.f9800a) && this.f9801b == dVar.f9801b && this.f9802c == dVar.f9802c && br.l.a(this.f9803d, dVar.f9803d);
    }

    public final int hashCode() {
        Object obj = this.f9800a;
        return this.f9803d.hashCode() + c7.a.C(this.f9802c, c7.a.C(this.f9801b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f9800a);
        sb2.append(", start=");
        sb2.append(this.f9801b);
        sb2.append(", end=");
        sb2.append(this.f9802c);
        sb2.append(", tag=");
        return h0.b.r(sb2, this.f9803d, ')');
    }

    public d(int i10, int i11, Object obj) {
        this(obj, i10, i11, "");
    }
}
