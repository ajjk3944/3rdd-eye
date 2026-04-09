package e5;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f7837a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7838b;

    public j0(a aVar, int i10) {
        this.f7837a = aVar;
        this.f7838b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f7838b != j0Var.f7838b) {
            return false;
        }
        return this.f7837a.equals(j0Var.f7837a);
    }

    public final int hashCode() {
        return (this.f7837a.hashCode() * 31) + this.f7838b;
    }
}
