package w5;

/* compiled from: SessionGenerator.kt */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f47470a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47472c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47473d;

    public v(String sessionId, String firstSessionId, int i, long j4) {
        kotlin.jvm.internal.l.f(sessionId, "sessionId");
        kotlin.jvm.internal.l.f(firstSessionId, "firstSessionId");
        this.f47470a = sessionId;
        this.f47471b = firstSessionId;
        this.f47472c = i;
        this.f47473d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.l.b(this.f47470a, vVar.f47470a) && kotlin.jvm.internal.l.b(this.f47471b, vVar.f47471b) && this.f47472c == vVar.f47472c && this.f47473d == vVar.f47473d;
    }

    public final int hashCode() {
        int iN = (B4.g.n(this.f47470a.hashCode() * 31, 31, this.f47471b) + this.f47472c) * 31;
        long j4 = this.f47473d;
        return iN + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.f47470a);
        sb.append(", firstSessionId=");
        sb.append(this.f47471b);
        sb.append(", sessionIndex=");
        sb.append(this.f47472c);
        sb.append(", sessionStartTimestampUs=");
        return androidx.work.s.f(sb, this.f47473d, ')');
    }
}
