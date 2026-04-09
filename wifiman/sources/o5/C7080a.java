package o5;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7080a {

    /* renamed from: a, reason: collision with root package name */
    private final String f55368a;

    /* renamed from: b, reason: collision with root package name */
    private final String f55369b;

    /* renamed from: c, reason: collision with root package name */
    private final String f55370c;

    /* renamed from: d, reason: collision with root package name */
    private final String f55371d;

    /* renamed from: e, reason: collision with root package name */
    private final u f55372e;

    /* renamed from: f, reason: collision with root package name */
    private final List f55373f;

    public C7080a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, u currentProcessDetails, List appProcessDetails) {
        AbstractC6492s.i(packageName, "packageName");
        AbstractC6492s.i(versionName, "versionName");
        AbstractC6492s.i(appBuildVersion, "appBuildVersion");
        AbstractC6492s.i(deviceManufacturer, "deviceManufacturer");
        AbstractC6492s.i(currentProcessDetails, "currentProcessDetails");
        AbstractC6492s.i(appProcessDetails, "appProcessDetails");
        this.f55368a = packageName;
        this.f55369b = versionName;
        this.f55370c = appBuildVersion;
        this.f55371d = deviceManufacturer;
        this.f55372e = currentProcessDetails;
        this.f55373f = appProcessDetails;
    }

    public final String a() {
        return this.f55370c;
    }

    public final List b() {
        return this.f55373f;
    }

    public final u c() {
        return this.f55372e;
    }

    public final String d() {
        return this.f55371d;
    }

    public final String e() {
        return this.f55368a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7080a)) {
            return false;
        }
        C7080a c7080a = (C7080a) obj;
        return AbstractC6492s.d(this.f55368a, c7080a.f55368a) && AbstractC6492s.d(this.f55369b, c7080a.f55369b) && AbstractC6492s.d(this.f55370c, c7080a.f55370c) && AbstractC6492s.d(this.f55371d, c7080a.f55371d) && AbstractC6492s.d(this.f55372e, c7080a.f55372e) && AbstractC6492s.d(this.f55373f, c7080a.f55373f);
    }

    public final String f() {
        return this.f55369b;
    }

    public int hashCode() {
        return (((((((((this.f55368a.hashCode() * 31) + this.f55369b.hashCode()) * 31) + this.f55370c.hashCode()) * 31) + this.f55371d.hashCode()) * 31) + this.f55372e.hashCode()) * 31) + this.f55373f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f55368a + ", versionName=" + this.f55369b + ", appBuildVersion=" + this.f55370c + ", deviceManufacturer=" + this.f55371d + ", currentProcessDetails=" + this.f55372e + ", appProcessDetails=" + this.f55373f + ')';
    }
}
