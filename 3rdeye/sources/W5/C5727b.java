package w5;

import android.os.Build;

/* compiled from: ApplicationInfo.kt */
/* renamed from: w5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5727b {

    /* renamed from: a, reason: collision with root package name */
    public final String f47382a;

    /* renamed from: b, reason: collision with root package name */
    public final p f47383b;

    /* renamed from: c, reason: collision with root package name */
    public final C5726a f47384c;

    public C5727b(String appId, p logEnvironment, C5726a c5726a) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.l.f(appId, "appId");
        kotlin.jvm.internal.l.f(deviceModel, "deviceModel");
        kotlin.jvm.internal.l.f(osVersion, "osVersion");
        kotlin.jvm.internal.l.f(logEnvironment, "logEnvironment");
        this.f47382a = appId;
        this.f47383b = logEnvironment;
        this.f47384c = c5726a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5727b)) {
            return false;
        }
        C5727b c5727b = (C5727b) obj;
        if (!kotlin.jvm.internal.l.b(this.f47382a, c5727b.f47382a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!kotlin.jvm.internal.l.b(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return kotlin.jvm.internal.l.b(str2, str2) && this.f47383b == c5727b.f47383b && this.f47384c.equals(c5727b.f47384c);
    }

    public final int hashCode() {
        return this.f47384c.hashCode() + ((this.f47383b.hashCode() + B4.g.n((((Build.MODEL.hashCode() + (this.f47382a.hashCode() * 31)) * 31) + 47594041) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f47382a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.0.3, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + this.f47383b + ", androidAppInfo=" + this.f47384c + ')';
    }
}
