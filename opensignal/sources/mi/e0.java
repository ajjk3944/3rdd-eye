package mi;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16809a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16810b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16811c;

    public e0(String str, int i10, int i11) {
        br.l.e(str, "encodedBytes");
        this.f16809a = i10;
        this.f16810b = i11;
        this.f16811c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f16809a == e0Var.f16809a && this.f16810b == e0Var.f16810b && br.l.a(this.f16811c, e0Var.f16811c);
    }

    public final int hashCode() {
        return this.f16811c.hashCode() + c7.a.C(this.f16810b, Integer.hashCode(this.f16809a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WifiInformationElementItem(id=");
        sb2.append(this.f16809a);
        sb2.append(", ext=");
        sb2.append(this.f16810b);
        sb2.append(", encodedBytes=");
        return h0.b.r(sb2, this.f16811c, ')');
    }
}
