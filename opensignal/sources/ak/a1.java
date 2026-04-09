package ak;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f425a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f426b;

    public a1(ArrayList arrayList, ArrayList arrayList2) {
        br.l.e(arrayList, "throughputDownloadTestConfigs");
        br.l.e(arrayList2, "throughputUploadTestConfigs");
        this.f425a = arrayList;
        this.f426b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return br.l.a(this.f425a, a1Var.f425a) && br.l.a(this.f426b, a1Var.f426b);
    }

    public final int hashCode() {
        return this.f426b.hashCode() + (this.f425a.hashCode() * 31);
    }

    public final String toString() {
        return "ThroughputTestConfig(throughputDownloadTestConfigs=" + this.f425a + ", throughputUploadTestConfigs=" + this.f426b + ')';
    }
}
