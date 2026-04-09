package lf;

import java.util.List;

/* loaded from: classes.dex */
public final class r0 extends b2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f15413a;

    /* renamed from: b, reason: collision with root package name */
    public final x1 f15414b;

    /* renamed from: c, reason: collision with root package name */
    public final p1 f15415c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f15416d;

    /* renamed from: e, reason: collision with root package name */
    public final List f15417e;

    public r0(List list, t0 t0Var, p1 p1Var, u0 u0Var, List list2) {
        this.f15413a = list;
        this.f15414b = t0Var;
        this.f15415c = p1Var;
        this.f15416d = u0Var;
        this.f15417e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        List list = this.f15413a;
        if (list == null) {
            if (((r0) b2Var).f15413a != null) {
                return false;
            }
        } else if (!list.equals(((r0) b2Var).f15413a)) {
            return false;
        }
        x1 x1Var = this.f15414b;
        if (x1Var == null) {
            if (((r0) b2Var).f15414b != null) {
                return false;
            }
        } else if (!x1Var.equals(((r0) b2Var).f15414b)) {
            return false;
        }
        p1 p1Var = this.f15415c;
        if (p1Var == null) {
            if (((r0) b2Var).f15415c != null) {
                return false;
            }
        } else if (!p1Var.equals(((r0) b2Var).f15415c)) {
            return false;
        }
        r0 r0Var = (r0) b2Var;
        return this.f15416d.equals(r0Var.f15416d) && this.f15417e.equals(r0Var.f15417e);
    }

    public final int hashCode() {
        List list = this.f15413a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        x1 x1Var = this.f15414b;
        int iHashCode2 = (iHashCode ^ (x1Var == null ? 0 : x1Var.hashCode())) * 1000003;
        p1 p1Var = this.f15415c;
        return (((((p1Var != null ? p1Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f15416d.hashCode()) * 1000003) ^ this.f15417e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f15413a + ", exception=" + this.f15414b + ", appExitInfo=" + this.f15415c + ", signal=" + this.f15416d + ", binaries=" + this.f15417e + "}";
    }
}
