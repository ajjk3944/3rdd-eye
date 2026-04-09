package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f551a;

    /* renamed from: b, reason: collision with root package name */
    public final List f552b;

    public i1(String str, List list) {
        this.f551a = str;
        this.f552b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return br.l.a(this.f551a, i1Var.f551a) && br.l.a(this.f552b, i1Var.f552b);
    }

    public final int hashCode() {
        return this.f552b.hashCode() + (this.f551a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UploadJobData(dataEndpoint=");
        sb2.append(this.f551a);
        sb2.append(", jobResults=");
        return h0.b.t(sb2, this.f552b, ')');
    }
}
