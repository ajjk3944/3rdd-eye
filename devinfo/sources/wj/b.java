package wj;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f36769a;

    /* renamed from: b, reason: collision with root package name */
    public String f36770b;

    /* renamed from: c, reason: collision with root package name */
    public String f36771c;

    /* renamed from: d, reason: collision with root package name */
    public ApplicationInfo f36772d;

    public static b a(Context context, String str) throws PackageManager.NameNotFoundException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            String string = packageInfo.applicationInfo.loadLabel(context.getPackageManager()).toString();
            String str2 = packageInfo.applicationInfo.packageName;
            long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
            StringBuilder sbB = i3.e.b(context.getString(R.string.appa_version), ": ");
            sbB.append(packageInfo.versionName);
            sbB.append("(");
            sbB.append(longVersionCode);
            sbB.append(")");
            String string2 = sbB.toString();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str3 = applicationInfo.sourceDir;
            b bVar = new b();
            bVar.f36772d = applicationInfo;
            bVar.f36769a = string;
            bVar.f36771c = str2;
            bVar.f36770b = string2;
            return bVar;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
