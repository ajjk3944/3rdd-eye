package lf;

/* loaded from: classes.dex */
public final class z0 extends c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15482a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15483b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15484c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15485d;

    public z0(String str, int i10, int i11, boolean z10) {
        this.f15482a = str;
        this.f15483b = i10;
        this.f15484c = i11;
        this.f15485d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            z0 z0Var = (z0) ((c2) obj);
            if (this.f15482a.equals(z0Var.f15482a) && this.f15483b == z0Var.f15483b && this.f15484c == z0Var.f15484c && this.f15485d == z0Var.f15485d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f15482a.hashCode() ^ 1000003) * 1000003) ^ this.f15483b) * 1000003) ^ this.f15484c) * 1000003) ^ (this.f15485d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f15482a + ", pid=" + this.f15483b + ", importance=" + this.f15484c + ", defaultProcess=" + this.f15485d + "}";
    }
}
