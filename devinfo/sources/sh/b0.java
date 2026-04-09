package sh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33647a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33648b;

    public b0(String str, boolean z3) {
        nk.k.e(str, "key");
        this.f33647a = str;
        this.f33648b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return nk.k.a(this.f33647a, b0Var.f33647a) && this.f33648b == b0Var.f33648b;
    }

    public final int hashCode() {
        return (this.f33647a.hashCode() * 31) + (this.f33648b ? 1231 : 1237);
    }

    public final String toString() {
        return "Config(key=" + this.f33647a + ", enabled=" + this.f33648b + ")";
    }
}
