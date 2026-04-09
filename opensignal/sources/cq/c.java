package cq;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f6612a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6613b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6614c;

    public c(a aVar, String str, long j) {
        br.l.e(str, "surveyId");
        this.f6612a = aVar;
        this.f6613b = str;
        this.f6614c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return br.l.a(this.f6612a, cVar.f6612a) && br.l.a(this.f6613b, cVar.f6613b) && this.f6614c == cVar.f6614c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6614c) + c7.a.g(this.f6613b, this.f6612a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DelayedEvent(activeEvent=");
        sb2.append(this.f6612a);
        sb2.append(", surveyId=");
        sb2.append(this.f6613b);
        sb2.append(", expectedDelayMs=");
        return w.g.h(sb2, this.f6614c, ')');
    }
}
