package sh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f33652a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33653b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33654c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33655d;

    public c0(Class cls, int i4, String str, boolean z3) {
        this.f33652a = cls;
        this.f33653b = i4;
        this.f33654c = str;
        this.f33655d = z3;
    }

    public static c0 a(c0 c0Var, boolean z3) {
        Class cls = c0Var.f33652a;
        int i4 = c0Var.f33653b;
        String str = c0Var.f33654c;
        nk.k.e(cls, "cls");
        nk.k.e(str, "key");
        return new c0(cls, i4, str, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return nk.k.a(this.f33652a, c0Var.f33652a) && this.f33653b == c0Var.f33653b && nk.k.a(this.f33654c, c0Var.f33654c) && this.f33655d == c0Var.f33655d;
    }

    public final int hashCode() {
        return je.u.m(((this.f33652a.hashCode() * 31) + this.f33653b) * 31, 31, this.f33654c) + (this.f33655d ? 1231 : 1237);
    }

    public final String toString() {
        return "Tab(cls=" + this.f33652a + ", name=" + this.f33653b + ", key=" + this.f33654c + ", enabled=" + this.f33655d + ")";
    }
}
