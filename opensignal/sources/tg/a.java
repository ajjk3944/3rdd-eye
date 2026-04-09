package tg;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22714a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22715b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22716c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f22717d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f22718e;

    public a(String str, String str2, String str3, c0 c0Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        br.l.e(str2, "versionName");
        br.l.e(str3, "appBuildVersion");
        br.l.e(str4, "deviceManufacturer");
        this.f22714a = str;
        this.f22715b = str2;
        this.f22716c = str3;
        this.f22717d = c0Var;
        this.f22718e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f22714a.equals(aVar.f22714a) || !br.l.a(this.f22715b, aVar.f22715b) || !br.l.a(this.f22716c, aVar.f22716c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return br.l.a(str, str) && this.f22717d.equals(aVar.f22717d) && this.f22718e.equals(aVar.f22718e);
    }

    public final int hashCode() {
        return this.f22718e.hashCode() + ((this.f22717d.hashCode() + c7.a.g(Build.MANUFACTURER, c7.a.g(this.f22716c, c7.a.g(this.f22715b, this.f22714a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f22714a + ", versionName=" + this.f22715b + ", appBuildVersion=" + this.f22716c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f22717d + ", appProcessDetails=" + this.f22718e + ')';
    }
}
