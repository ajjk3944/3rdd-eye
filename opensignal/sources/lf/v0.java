package lf;

import java.util.List;

/* loaded from: classes.dex */
public final class v0 extends a2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15451a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15452b;

    /* renamed from: c, reason: collision with root package name */
    public final List f15453c;

    public v0(String str, int i10, List list) {
        this.f15451a = str;
        this.f15452b = i10;
        this.f15453c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            v0 v0Var = (v0) ((a2) obj);
            if (this.f15451a.equals(v0Var.f15451a) && this.f15452b == v0Var.f15452b && this.f15453c.equals(v0Var.f15453c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15451a.hashCode() ^ 1000003) * 1000003) ^ this.f15452b) * 1000003) ^ this.f15453c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f15451a + ", importance=" + this.f15452b + ", frames=" + this.f15453c + "}";
    }
}
