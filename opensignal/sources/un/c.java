package un;

/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f23598a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23599b;

    public c(long j, String str) {
        this.f23598a = j;
        this.f23599b = str;
    }

    @Override // un.j
    public final long a() {
        return this.f23598a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23598a == cVar.f23598a && br.l.a(this.f23599b, cVar.f23599b);
    }

    public final int hashCode() {
        return this.f23599b.hashCode() + (Long.hashCode(this.f23598a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Date(pointId=");
        sb2.append(this.f23598a);
        sb2.append(", answer=");
        return h0.b.r(sb2, this.f23599b, ')');
    }
}
