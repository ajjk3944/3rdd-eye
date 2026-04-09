package ya;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26085a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26086b;

    public k0(int i10, boolean z10) {
        this.f26085a = i10;
        this.f26086b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f26085a == k0Var.f26085a && this.f26086b == k0Var.f26086b;
    }

    public final int hashCode() {
        return (this.f26085a * 31) + (this.f26086b ? 1 : 0);
    }
}
