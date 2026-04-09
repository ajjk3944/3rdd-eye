package o5;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: o5.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7078C {

    /* renamed from: a, reason: collision with root package name */
    private final String f55342a;

    /* renamed from: b, reason: collision with root package name */
    private final String f55343b;

    /* renamed from: c, reason: collision with root package name */
    private final int f55344c;

    /* renamed from: d, reason: collision with root package name */
    private final long f55345d;

    /* renamed from: e, reason: collision with root package name */
    private final C7084e f55346e;

    /* renamed from: f, reason: collision with root package name */
    private final String f55347f;

    /* renamed from: g, reason: collision with root package name */
    private final String f55348g;

    public C7078C(String sessionId, String firstSessionId, int i10, long j10, C7084e dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        AbstractC6492s.i(sessionId, "sessionId");
        AbstractC6492s.i(firstSessionId, "firstSessionId");
        AbstractC6492s.i(dataCollectionStatus, "dataCollectionStatus");
        AbstractC6492s.i(firebaseInstallationId, "firebaseInstallationId");
        AbstractC6492s.i(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f55342a = sessionId;
        this.f55343b = firstSessionId;
        this.f55344c = i10;
        this.f55345d = j10;
        this.f55346e = dataCollectionStatus;
        this.f55347f = firebaseInstallationId;
        this.f55348g = firebaseAuthenticationToken;
    }

    public final C7084e a() {
        return this.f55346e;
    }

    public final long b() {
        return this.f55345d;
    }

    public final String c() {
        return this.f55348g;
    }

    public final String d() {
        return this.f55347f;
    }

    public final String e() {
        return this.f55343b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7078C)) {
            return false;
        }
        C7078C c7078c = (C7078C) obj;
        return AbstractC6492s.d(this.f55342a, c7078c.f55342a) && AbstractC6492s.d(this.f55343b, c7078c.f55343b) && this.f55344c == c7078c.f55344c && this.f55345d == c7078c.f55345d && AbstractC6492s.d(this.f55346e, c7078c.f55346e) && AbstractC6492s.d(this.f55347f, c7078c.f55347f) && AbstractC6492s.d(this.f55348g, c7078c.f55348g);
    }

    public final String f() {
        return this.f55342a;
    }

    public final int g() {
        return this.f55344c;
    }

    public int hashCode() {
        return (((((((((((this.f55342a.hashCode() * 31) + this.f55343b.hashCode()) * 31) + Integer.hashCode(this.f55344c)) * 31) + Long.hashCode(this.f55345d)) * 31) + this.f55346e.hashCode()) * 31) + this.f55347f.hashCode()) * 31) + this.f55348g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f55342a + ", firstSessionId=" + this.f55343b + ", sessionIndex=" + this.f55344c + ", eventTimestampUs=" + this.f55345d + ", dataCollectionStatus=" + this.f55346e + ", firebaseInstallationId=" + this.f55347f + ", firebaseAuthenticationToken=" + this.f55348g + ')';
    }
}
