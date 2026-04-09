package o5;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final String f55475a;

    /* renamed from: b, reason: collision with root package name */
    private final String f55476b;

    /* renamed from: c, reason: collision with root package name */
    private final int f55477c;

    /* renamed from: d, reason: collision with root package name */
    private final long f55478d;

    public y(String sessionId, String firstSessionId, int i10, long j10) {
        AbstractC6492s.i(sessionId, "sessionId");
        AbstractC6492s.i(firstSessionId, "firstSessionId");
        this.f55475a = sessionId;
        this.f55476b = firstSessionId;
        this.f55477c = i10;
        this.f55478d = j10;
    }

    public final String a() {
        return this.f55476b;
    }

    public final String b() {
        return this.f55475a;
    }

    public final int c() {
        return this.f55477c;
    }

    public final long d() {
        return this.f55478d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return AbstractC6492s.d(this.f55475a, yVar.f55475a) && AbstractC6492s.d(this.f55476b, yVar.f55476b) && this.f55477c == yVar.f55477c && this.f55478d == yVar.f55478d;
    }

    public int hashCode() {
        return (((((this.f55475a.hashCode() * 31) + this.f55476b.hashCode()) * 31) + Integer.hashCode(this.f55477c)) * 31) + Long.hashCode(this.f55478d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f55475a + ", firstSessionId=" + this.f55476b + ", sessionIndex=" + this.f55477c + ", sessionStartTimestampUs=" + this.f55478d + ')';
    }
}
