package w5;

import N7.B8;

/* compiled from: SessionEvent.kt */
/* renamed from: w5.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5724D {

    /* renamed from: a, reason: collision with root package name */
    public final String f47354a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47355b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47356c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47357d;

    /* renamed from: e, reason: collision with root package name */
    public final C5735j f47358e;

    /* renamed from: f, reason: collision with root package name */
    public final String f47359f;

    /* renamed from: g, reason: collision with root package name */
    public final String f47360g;

    public C5724D(String sessionId, String firstSessionId, int i, long j4, C5735j c5735j, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.l.f(sessionId, "sessionId");
        kotlin.jvm.internal.l.f(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.l.f(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f47354a = sessionId;
        this.f47355b = firstSessionId;
        this.f47356c = i;
        this.f47357d = j4;
        this.f47358e = c5735j;
        this.f47359f = str;
        this.f47360g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5724D)) {
            return false;
        }
        C5724D c5724d = (C5724D) obj;
        return kotlin.jvm.internal.l.b(this.f47354a, c5724d.f47354a) && kotlin.jvm.internal.l.b(this.f47355b, c5724d.f47355b) && this.f47356c == c5724d.f47356c && this.f47357d == c5724d.f47357d && kotlin.jvm.internal.l.b(this.f47358e, c5724d.f47358e) && kotlin.jvm.internal.l.b(this.f47359f, c5724d.f47359f) && kotlin.jvm.internal.l.b(this.f47360g, c5724d.f47360g);
    }

    public final int hashCode() {
        int iN = (B4.g.n(this.f47354a.hashCode() * 31, 31, this.f47355b) + this.f47356c) * 31;
        long j4 = this.f47357d;
        return this.f47360g.hashCode() + B4.g.n((this.f47358e.hashCode() + ((iN + ((int) (j4 ^ (j4 >>> 32)))) * 31)) * 31, 31, this.f47359f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f47354a);
        sb.append(", firstSessionId=");
        sb.append(this.f47355b);
        sb.append(", sessionIndex=");
        sb.append(this.f47356c);
        sb.append(", eventTimestampUs=");
        sb.append(this.f47357d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f47358e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f47359f);
        sb.append(", firebaseAuthenticationToken=");
        return B8.j(sb, this.f47360g, ')');
    }
}
