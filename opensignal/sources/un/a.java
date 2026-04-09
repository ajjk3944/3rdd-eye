package un;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f23594a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23595b;

    public a(long j, String str) {
        br.l.e(str, "answer");
        this.f23594a = j;
        this.f23595b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23594a == aVar.f23594a && br.l.a(this.f23595b, aVar.f23595b);
    }

    public final int hashCode() {
        return this.f23595b.hashCode() + (Long.hashCode(this.f23594a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FormAnswer(fieldId=");
        sb2.append(this.f23594a);
        sb2.append(", answer=");
        return h0.b.r(sb2, this.f23595b, ')');
    }
}
