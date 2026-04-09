package o5;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: o5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7084e {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC7083d f55416a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC7083d f55417b;

    /* renamed from: c, reason: collision with root package name */
    private final double f55418c;

    public C7084e(EnumC7083d performance, EnumC7083d crashlytics, double d10) {
        AbstractC6492s.i(performance, "performance");
        AbstractC6492s.i(crashlytics, "crashlytics");
        this.f55416a = performance;
        this.f55417b = crashlytics;
        this.f55418c = d10;
    }

    public final EnumC7083d a() {
        return this.f55417b;
    }

    public final EnumC7083d b() {
        return this.f55416a;
    }

    public final double c() {
        return this.f55418c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7084e)) {
            return false;
        }
        C7084e c7084e = (C7084e) obj;
        return this.f55416a == c7084e.f55416a && this.f55417b == c7084e.f55417b && Double.compare(this.f55418c, c7084e.f55418c) == 0;
    }

    public int hashCode() {
        return (((this.f55416a.hashCode() * 31) + this.f55417b.hashCode()) * 31) + Double.hashCode(this.f55418c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f55416a + ", crashlytics=" + this.f55417b + ", sessionSamplingRate=" + this.f55418c + ')';
    }
}
