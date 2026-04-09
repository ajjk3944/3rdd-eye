package lg;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.measurement.d5;
import com.liuzh.deviceinfo.DeviceInfoApp;
import java.util.Locale;
import vk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public PackageInfo f28808b;

    /* renamed from: c, reason: collision with root package name */
    public final PackageManager f28809c = DeviceInfoApp.f21145f.getPackageManager();

    @Override // lg.e
    public final boolean a(aj.b bVar) {
        this.f28808b = null;
        if (!bVar.f409d) {
            String str = bVar.f410e;
            nk.k.d(str, "getNodeName(...)");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            nk.k.d(lowerCase, "toLowerCase(...)");
            if (p.p0(lowerCase, ".apk", false)) {
                try {
                    this.f28808b = this.f28809c.getPackageArchiveInfo(bVar.c(), 1);
                    return true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // lg.e
    public final kg.d b(aj.b bVar) throws PackageManager.NameNotFoundException {
        CharSequence charSequenceLoadLabel;
        PackageInfo packageInfo;
        PackageInfo packageInfo2 = this.f28808b;
        if (packageInfo2 == null) {
            String strC = bVar.c();
            nk.k.d(strC, "getPath(...)");
            return new kg.a(strC, null, null, null, -1L, -1L, bVar);
        }
        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
        PackageManager packageManager = this.f28809c;
        if (applicationInfo != null) {
            applicationInfo.sourceDir = bVar.c();
            applicationInfo.publicSourceDir = bVar.c();
            charSequenceLoadLabel = applicationInfo.loadLabel(packageManager);
        } else {
            charSequenceLoadLabel = null;
        }
        CharSequence charSequence = charSequenceLoadLabel;
        long j = d5.j(packageInfo2);
        try {
            packageInfo = packageManager.getPackageInfo(packageInfo2.packageName, 1);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        long j8 = packageInfo != null ? d5.j(packageInfo) : -1L;
        long j9 = j8;
        String strC2 = bVar.c();
        nk.k.d(strC2, "getPath(...)");
        return new kg.a(strC2, packageInfo2.applicationInfo, charSequence, packageInfo2.versionName, j9, j, bVar);
    }
}
