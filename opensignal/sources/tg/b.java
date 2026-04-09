package tg;

import android.os.Build;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22734a;

    /* renamed from: b, reason: collision with root package name */
    public final v f22735b;

    /* renamed from: c, reason: collision with root package name */
    public final a f22736c;

    public b(String str, v vVar, a aVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        br.l.e(str, "appId");
        br.l.e(str2, "deviceModel");
        br.l.e(str3, "osVersion");
        br.l.e(vVar, "logEnvironment");
        this.f22734a = str;
        this.f22735b = vVar;
        this.f22736c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!br.l.a(this.f22734a, bVar.f22734a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!br.l.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return br.l.a(str2, str2) && this.f22735b == bVar.f22735b && this.f22736c.equals(bVar.f22736c);
    }

    public final int hashCode() {
        return this.f22736c.hashCode() + ((this.f22735b.hashCode() + c7.a.g(Build.VERSION.RELEASE, (((Build.MODEL.hashCode() + (this.f22734a.hashCode() * 31)) * 31) + 48517562) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f22734a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.3, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + this.f22735b + ", androidAppInfo=" + this.f22736c + ')';
    }
}
