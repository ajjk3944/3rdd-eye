package bh;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final long f2758a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2759b;

    public j(long j, String str) {
        this.f2758a = j;
        this.f2759b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f2758a == jVar.f2758a && br.l.a(this.f2759b, jVar.f2759b);
    }

    public final int hashCode() {
        return this.f2759b.hashCode() + (Long.hashCode(this.f2758a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NoIssues(durationInMillis=");
        sb2.append(this.f2758a);
        sb2.append(", entityId=");
        return h0.b.r(sb2, this.f2759b, ')');
    }
}
