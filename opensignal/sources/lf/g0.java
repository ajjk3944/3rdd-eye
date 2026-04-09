package lf;

import java.util.List;

/* loaded from: classes.dex */
public final class g0 extends s1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f15251a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15252b;

    public g0(List list, String str) {
        this.f15251a = list;
        this.f15252b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            g0 g0Var = (g0) ((s1) obj);
            String str2 = g0Var.f15252b;
            if (this.f15251a.equals(g0Var.f15251a) && ((str = this.f15252b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f15251a.hashCode() ^ 1000003) * 1000003;
        String str = this.f15252b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f15251a);
        sb2.append(", orgId=");
        return w.g.j(sb2, this.f15252b, "}");
    }
}
