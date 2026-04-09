package un;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f23610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23611b;

    public i(long j, String str) {
        this.f23610a = j;
        this.f23611b = str;
    }

    @Override // un.j
    public final long a() {
        return this.f23610a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f23610a == iVar.f23610a && br.l.a(this.f23611b, iVar.f23611b);
    }

    public final int hashCode() {
        return this.f23611b.hashCode() + (Long.hashCode(this.f23610a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Text(pointId=");
        sb2.append(this.f23610a);
        sb2.append(", answer=");
        return h0.b.r(sb2, this.f23611b, ')');
    }
}
