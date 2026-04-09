package o5;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f19003a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19004b;

    public o0(int i10, boolean z10) {
        this.f19003a = i10;
        this.f19004b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f19003a == o0Var.f19003a && this.f19004b == o0Var.f19004b;
    }

    public final int hashCode() {
        return (this.f19003a * 31) + (this.f19004b ? 1 : 0);
    }
}
