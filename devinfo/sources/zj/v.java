package zj;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f38320a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38321b;

    public v(int i4, Object obj) {
        this.f38320a = i4;
        this.f38321b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f38320a == vVar.f38320a && nk.k.a(this.f38321b, vVar.f38321b);
    }

    public final int hashCode() {
        int i4 = this.f38320a * 31;
        Object obj = this.f38321b;
        return i4 + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f38320a + ", value=" + this.f38321b + ')';
    }
}
