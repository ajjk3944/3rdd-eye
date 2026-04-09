package o5;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7081b {

    /* renamed from: a, reason: collision with root package name */
    private final String f55374a;

    /* renamed from: b, reason: collision with root package name */
    private final String f55375b;

    /* renamed from: c, reason: collision with root package name */
    private final String f55376c;

    /* renamed from: d, reason: collision with root package name */
    private final String f55377d;

    /* renamed from: e, reason: collision with root package name */
    private final t f55378e;

    /* renamed from: f, reason: collision with root package name */
    private final C7080a f55379f;

    public C7081b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, t logEnvironment, C7080a androidAppInfo) {
        AbstractC6492s.i(appId, "appId");
        AbstractC6492s.i(deviceModel, "deviceModel");
        AbstractC6492s.i(sessionSdkVersion, "sessionSdkVersion");
        AbstractC6492s.i(osVersion, "osVersion");
        AbstractC6492s.i(logEnvironment, "logEnvironment");
        AbstractC6492s.i(androidAppInfo, "androidAppInfo");
        this.f55374a = appId;
        this.f55375b = deviceModel;
        this.f55376c = sessionSdkVersion;
        this.f55377d = osVersion;
        this.f55378e = logEnvironment;
        this.f55379f = androidAppInfo;
    }

    public final C7080a a() {
        return this.f55379f;
    }

    public final String b() {
        return this.f55374a;
    }

    public final String c() {
        return this.f55375b;
    }

    public final t d() {
        return this.f55378e;
    }

    public final String e() {
        return this.f55377d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7081b)) {
            return false;
        }
        C7081b c7081b = (C7081b) obj;
        return AbstractC6492s.d(this.f55374a, c7081b.f55374a) && AbstractC6492s.d(this.f55375b, c7081b.f55375b) && AbstractC6492s.d(this.f55376c, c7081b.f55376c) && AbstractC6492s.d(this.f55377d, c7081b.f55377d) && this.f55378e == c7081b.f55378e && AbstractC6492s.d(this.f55379f, c7081b.f55379f);
    }

    public final String f() {
        return this.f55376c;
    }

    public int hashCode() {
        return (((((((((this.f55374a.hashCode() * 31) + this.f55375b.hashCode()) * 31) + this.f55376c.hashCode()) * 31) + this.f55377d.hashCode()) * 31) + this.f55378e.hashCode()) * 31) + this.f55379f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f55374a + ", deviceModel=" + this.f55375b + ", sessionSdkVersion=" + this.f55376c + ", osVersion=" + this.f55377d + ", logEnvironment=" + this.f55378e + ", androidAppInfo=" + this.f55379f + ')';
    }
}
