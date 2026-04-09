package pf;

import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f31764a;

    /* renamed from: b, reason: collision with root package name */
    public final a f31765b;

    public b(String str, a aVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        nk.k.e(str, "appId");
        nk.k.e(str2, "deviceModel");
        nk.k.e(str3, "osVersion");
        this.f31764a = str;
        this.f31765b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!nk.k.a(this.f31764a, bVar.f31764a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!nk.k.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return nk.k.a(str2, str2) && this.f31765b.equals(bVar.f31765b);
    }

    public final int hashCode() {
        return this.f31765b.hashCode() + ((y.LOG_ENVIRONMENT_PROD.hashCode() + je.u.m((((Build.MODEL.hashCode() + (this.f31764a.hashCode() * 31)) * 31) + 48517562) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f31764a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.3, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + y.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f31765b + ')';
    }
}
