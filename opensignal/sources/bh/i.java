package bh;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final List f2755a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2756b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2757c;

    public i(long j, String str, ArrayList arrayList) {
        br.l.e(arrayList, "issues");
        this.f2755a = arrayList;
        this.f2756b = j;
        this.f2757c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return br.l.a(this.f2755a, iVar.f2755a) && this.f2756b == iVar.f2756b && br.l.a(this.f2757c, iVar.f2757c);
    }

    public final int hashCode() {
        return this.f2757c.hashCode() + h0.b.b(this.f2755a.hashCode() * 31, 31, this.f2756b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IssuesFound(issues=");
        sb2.append(this.f2755a);
        sb2.append(", durationInMillis=");
        sb2.append(this.f2756b);
        sb2.append(", entityId=");
        return h0.b.r(sb2, this.f2757c, ')');
    }
}
