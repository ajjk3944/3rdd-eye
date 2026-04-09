package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f33375a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f33376b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f33377c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f33378d;

    public f0(a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4) {
        this.f33375a = a0Var;
        this.f33376b = a0Var2;
        this.f33377c = a0Var3;
        this.f33378d = a0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return nk.k.a(this.f33375a, f0Var.f33375a) && nk.k.a(this.f33376b, f0Var.f33376b) && nk.k.a(this.f33377c, f0Var.f33377c) && nk.k.a(this.f33378d, f0Var.f33378d);
    }

    public final int hashCode() {
        a0 a0Var = this.f33375a;
        int iHashCode = (a0Var != null ? a0Var.hashCode() : 0) * 31;
        a0 a0Var2 = this.f33376b;
        int iHashCode2 = (iHashCode + (a0Var2 != null ? a0Var2.hashCode() : 0)) * 31;
        a0 a0Var3 = this.f33377c;
        int iHashCode3 = (iHashCode2 + (a0Var3 != null ? a0Var3.hashCode() : 0)) * 31;
        a0 a0Var4 = this.f33378d;
        return iHashCode3 + (a0Var4 != null ? a0Var4.hashCode() : 0);
    }
}
