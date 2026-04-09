package dc;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: dc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5341a {

    /* renamed from: a, reason: collision with root package name */
    private final String f45981a;

    /* renamed from: b, reason: collision with root package name */
    private final String f45982b;

    /* renamed from: c, reason: collision with root package name */
    private final String f45983c;

    /* renamed from: d, reason: collision with root package name */
    private final int f45984d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f45985e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f45986f;

    public C5341a(String applicationId, String applicationName, String versionName, int i10, boolean z10, boolean z11) {
        AbstractC6492s.i(applicationId, "applicationId");
        AbstractC6492s.i(applicationName, "applicationName");
        AbstractC6492s.i(versionName, "versionName");
        this.f45981a = applicationId;
        this.f45982b = applicationName;
        this.f45983c = versionName;
        this.f45984d = i10;
        this.f45985e = z10;
        this.f45986f = z11;
    }

    public final String a() {
        return this.f45981a;
    }

    public final String b() {
        return this.f45982b;
    }

    public final int c() {
        return this.f45984d;
    }

    public final String d() {
        return this.f45983c;
    }

    public final boolean e() {
        return this.f45985e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5341a)) {
            return false;
        }
        C5341a c5341a = (C5341a) obj;
        return AbstractC6492s.d(this.f45981a, c5341a.f45981a) && AbstractC6492s.d(this.f45982b, c5341a.f45982b) && AbstractC6492s.d(this.f45983c, c5341a.f45983c) && this.f45984d == c5341a.f45984d && this.f45985e == c5341a.f45985e && this.f45986f == c5341a.f45986f;
    }

    public int hashCode() {
        return (((((((((this.f45981a.hashCode() * 31) + this.f45982b.hashCode()) * 31) + this.f45983c.hashCode()) * 31) + Integer.hashCode(this.f45984d)) * 31) + Boolean.hashCode(this.f45985e)) * 31) + Boolean.hashCode(this.f45986f);
    }

    public String toString() {
        return "AppBuildConfiguration(applicationId=" + this.f45981a + ", applicationName=" + this.f45982b + ", versionName=" + this.f45983c + ", versionCode=" + this.f45984d + ", isDebug=" + this.f45985e + ", isInternal=" + this.f45986f + ")";
    }
}
