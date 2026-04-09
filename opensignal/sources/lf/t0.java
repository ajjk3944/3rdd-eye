package lf;

import java.util.List;

/* loaded from: classes.dex */
public final class t0 extends x1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15436a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15437b;

    /* renamed from: c, reason: collision with root package name */
    public final List f15438c;

    /* renamed from: d, reason: collision with root package name */
    public final x1 f15439d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15440e;

    public t0(String str, String str2, List list, x1 x1Var, int i10) {
        this.f15436a = str;
        this.f15437b = str2;
        this.f15438c = list;
        this.f15439d = x1Var;
        this.f15440e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        x1 x1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            t0 t0Var = (t0) ((x1) obj);
            x1 x1Var2 = t0Var.f15439d;
            String str2 = t0Var.f15437b;
            if (this.f15436a.equals(t0Var.f15436a) && ((str = this.f15437b) != null ? str.equals(str2) : str2 == null) && this.f15438c.equals(t0Var.f15438c) && ((x1Var = this.f15439d) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && this.f15440e == t0Var.f15440e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f15436a.hashCode() ^ 1000003) * 1000003;
        String str = this.f15437b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f15438c.hashCode()) * 1000003;
        x1 x1Var = this.f15439d;
        return ((iHashCode2 ^ (x1Var != null ? x1Var.hashCode() : 0)) * 1000003) ^ this.f15440e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f15436a);
        sb2.append(", reason=");
        sb2.append(this.f15437b);
        sb2.append(", frames=");
        sb2.append(this.f15438c);
        sb2.append(", causedBy=");
        sb2.append(this.f15439d);
        sb2.append(", overflowCount=");
        return h0.b.i(this.f15440e, "}", sb2);
    }
}
