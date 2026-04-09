package La;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11510a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11511b;

    public c(String appName, String appVersion) {
        AbstractC6492s.i(appName, "appName");
        AbstractC6492s.i(appVersion, "appVersion");
        this.f11510a = appName;
        this.f11511b = appVersion;
    }

    public final String a() {
        return this.f11510a;
    }

    public final String b() {
        return this.f11511b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f11510a, cVar.f11510a) && AbstractC6492s.d(this.f11511b, cVar.f11511b);
    }

    public int hashCode() {
        return (this.f11510a.hashCode() * 31) + this.f11511b.hashCode();
    }

    public String toString() {
        return "UiSpeedClientAppInfo(appName=" + this.f11510a + ", appVersion=" + this.f11511b + ")";
    }
}
