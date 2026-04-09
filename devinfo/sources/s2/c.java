package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f33350a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33351b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33352c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33353d;

    public c(String str, int i4, int i10, Object obj) {
        this.f33350a = obj;
        this.f33351b = i4;
        this.f33352c = i10;
        this.f33353d = str;
        if (i4 <= i10) {
            return;
        }
        x2.a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return nk.k.a(this.f33350a, cVar.f33350a) && this.f33351b == cVar.f33351b && this.f33352c == cVar.f33352c && nk.k.a(this.f33353d, cVar.f33353d);
    }

    public final int hashCode() {
        Object obj = this.f33350a;
        return this.f33353d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f33351b) * 31) + this.f33352c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f33350a);
        sb2.append(", start=");
        sb2.append(this.f33351b);
        sb2.append(", end=");
        sb2.append(this.f33352c);
        sb2.append(", tag=");
        return r5.c.l(sb2, this.f33353d, ')');
    }

    public c(Object obj, int i4, int i10) {
        this("", i4, i10, obj);
    }
}
