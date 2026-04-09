package lf;

import java.util.List;

/* loaded from: classes.dex */
public final class q0 extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f15401a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15402b;

    /* renamed from: c, reason: collision with root package name */
    public final List f15403c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f15404d;

    /* renamed from: e, reason: collision with root package name */
    public final c2 f15405e;

    /* renamed from: f, reason: collision with root package name */
    public final List f15406f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15407g;

    public q0(r0 r0Var, List list, List list2, Boolean bool, c2 c2Var, List list3, int i10) {
        this.f15401a = r0Var;
        this.f15402b = list;
        this.f15403c = list2;
        this.f15404d = bool;
        this.f15405e = c2Var;
        this.f15406f = list3;
        this.f15407g = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        q0 q0Var = (q0) ((d2) obj);
        List list = q0Var.f15406f;
        c2 c2Var = q0Var.f15405e;
        Boolean bool = q0Var.f15404d;
        List list2 = q0Var.f15403c;
        List list3 = q0Var.f15402b;
        if (!this.f15401a.equals(q0Var.f15401a)) {
            return false;
        }
        List list4 = this.f15402b;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        List list5 = this.f15403c;
        if (list5 == null) {
            if (list2 != null) {
                return false;
            }
        } else if (!list5.equals(list2)) {
            return false;
        }
        Boolean bool2 = this.f15404d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        c2 c2Var2 = this.f15405e;
        if (c2Var2 == null) {
            if (c2Var != null) {
                return false;
            }
        } else if (!c2Var2.equals(c2Var)) {
            return false;
        }
        List list6 = this.f15406f;
        if (list6 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list6.equals(list)) {
            return false;
        }
        return this.f15407g == q0Var.f15407g;
    }

    public final int hashCode() {
        int iHashCode = (this.f15401a.hashCode() ^ 1000003) * 1000003;
        List list = this.f15402b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f15403c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f15404d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        c2 c2Var = this.f15405e;
        int iHashCode5 = (iHashCode4 ^ (c2Var == null ? 0 : c2Var.hashCode())) * 1000003;
        List list3 = this.f15406f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f15407g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f15401a);
        sb2.append(", customAttributes=");
        sb2.append(this.f15402b);
        sb2.append(", internalKeys=");
        sb2.append(this.f15403c);
        sb2.append(", background=");
        sb2.append(this.f15404d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f15405e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f15406f);
        sb2.append(", uiOrientation=");
        return h0.b.i(this.f15407g, "}", sb2);
    }
}
