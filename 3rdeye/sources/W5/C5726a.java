package w5;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: ApplicationInfo.kt */
/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5726a {

    /* renamed from: a, reason: collision with root package name */
    public final String f47377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47378b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47379c;

    /* renamed from: d, reason: collision with root package name */
    public final q f47380d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f47381e;

    public C5726a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.l.f(versionName, "versionName");
        kotlin.jvm.internal.l.f(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.l.f(deviceManufacturer, "deviceManufacturer");
        this.f47377a = str;
        this.f47378b = versionName;
        this.f47379c = appBuildVersion;
        this.f47380d = qVar;
        this.f47381e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5726a)) {
            return false;
        }
        C5726a c5726a = (C5726a) obj;
        if (!this.f47377a.equals(c5726a.f47377a) || !kotlin.jvm.internal.l.b(this.f47378b, c5726a.f47378b) || !kotlin.jvm.internal.l.b(this.f47379c, c5726a.f47379c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return kotlin.jvm.internal.l.b(str, str) && this.f47380d.equals(c5726a.f47380d) && this.f47381e.equals(c5726a.f47381e);
    }

    public final int hashCode() {
        return this.f47381e.hashCode() + ((this.f47380d.hashCode() + B4.g.n(B4.g.n(B4.g.n(this.f47377a.hashCode() * 31, 31, this.f47378b), 31, this.f47379c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f47377a + ", versionName=" + this.f47378b + ", appBuildVersion=" + this.f47379c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f47380d + ", appProcessDetails=" + this.f47381e + ')';
    }
}
