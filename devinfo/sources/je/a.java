package je;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f27528a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27529b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27530c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27531d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27532e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27533f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final yb.i f27534h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, yb.i iVar) {
        this.f27528a = str;
        this.f27529b = str2;
        this.f27530c = arrayList;
        this.f27531d = str3;
        this.f27532e = str4;
        this.f27533f = str5;
        this.g = str6;
        this.f27534h = iVar;
    }

    public static a a(Context context, x xVar, String str, String str2, ArrayList arrayList, yb.i iVar) {
        String packageName = context.getPackageName();
        String strD = xVar.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, arrayList, strD, packageName, string, str3, iVar);
    }
}
