package lf;

/* loaded from: classes.dex */
public final class f0 extends q1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15239a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15240b;

    public f0(String str, String str2) {
        this.f15239a = str;
        this.f15240b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            f0 f0Var = (f0) ((q1) obj);
            if (this.f15239a.equals(f0Var.f15239a) && this.f15240b.equals(f0Var.f15240b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15239a.hashCode() ^ 1000003) * 1000003) ^ this.f15240b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f15239a);
        sb2.append(", value=");
        return w.g.j(sb2, this.f15240b, "}");
    }
}
