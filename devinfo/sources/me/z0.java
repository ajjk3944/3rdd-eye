package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z0 extends c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29361a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29362b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29363c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29364d;

    public z0(String str, int i4, int i10, boolean z3) {
        this.f29361a = str;
        this.f29362b = i4;
        this.f29363c = i10;
        this.f29364d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            z0 z0Var = (z0) ((c2) obj);
            if (this.f29361a.equals(z0Var.f29361a) && this.f29362b == z0Var.f29362b && this.f29363c == z0Var.f29363c && this.f29364d == z0Var.f29364d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f29361a.hashCode() ^ 1000003) * 1000003) ^ this.f29362b) * 1000003) ^ this.f29363c) * 1000003) ^ (this.f29364d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f29361a + ", pid=" + this.f29362b + ", importance=" + this.f29363c + ", defaultProcess=" + this.f29364d + "}";
    }
}
