package bh;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final long f2753a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2754b;

    public h(long j, String str) {
        this.f2753a = j;
        this.f2754b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2753a == hVar.f2753a && br.l.a(this.f2754b, hVar.f2754b);
    }

    public final int hashCode() {
        return this.f2754b.hashCode() + (Long.hashCode(this.f2753a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Error(durationInMillis=");
        sb2.append(this.f2753a);
        sb2.append(", entityId=");
        return h0.b.r(sb2, this.f2754b, ')');
    }
}
