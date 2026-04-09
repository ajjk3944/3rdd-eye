package pf;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f31756a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31757b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31758c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f31759d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f31760e;

    public a(String str, String str2, String str3, f0 f0Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        nk.k.e(str2, "versionName");
        nk.k.e(str3, "appBuildVersion");
        nk.k.e(str4, "deviceManufacturer");
        this.f31756a = str;
        this.f31757b = str2;
        this.f31758c = str3;
        this.f31759d = f0Var;
        this.f31760e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f31756a.equals(aVar.f31756a) || !nk.k.a(this.f31757b, aVar.f31757b) || !nk.k.a(this.f31758c, aVar.f31758c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return nk.k.a(str, str) && this.f31759d.equals(aVar.f31759d) && this.f31760e.equals(aVar.f31760e);
    }

    public final int hashCode() {
        return this.f31760e.hashCode() + ((this.f31759d.hashCode() + je.u.m(je.u.m(je.u.m(this.f31756a.hashCode() * 31, 31, this.f31757b), 31, this.f31758c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f31756a + ", versionName=" + this.f31757b + ", appBuildVersion=" + this.f31758c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f31759d + ", appProcessDetails=" + this.f31760e + ')';
    }
}
