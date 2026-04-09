package cq;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f6619a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6620b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6621c;

    public f(long j, String str, String str2) {
        br.l.e(str, "eventName");
        br.l.e(str2, "surveyId");
        this.f6619a = str;
        this.f6620b = str2;
        this.f6621c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return br.l.a(this.f6619a, fVar.f6619a) && br.l.a(this.f6620b, fVar.f6620b) && this.f6621c == fVar.f6621c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6621c) + c7.a.g(this.f6620b, this.f6619a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventDelayTrigger(eventName=");
        sb2.append(this.f6619a);
        sb2.append(", surveyId=");
        sb2.append(this.f6620b);
        sb2.append(", delayMs=");
        return w.g.h(sb2, this.f6621c, ')');
    }
}
