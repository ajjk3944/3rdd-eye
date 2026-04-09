package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import g0.C4356c;

/* loaded from: classes3.dex */
public final class he {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28187a;

    /* renamed from: b, reason: collision with root package name */
    private final e10 f28188b;

    public he(Context context, e10 deviceInfoProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(deviceInfoProvider, "deviceInfoProvider");
        this.f28187a = context;
        this.f28188b = deviceInfoProvider;
    }

    public final sw a() {
        PackageManager packageManager = this.f28187a.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        PackageInfo packageInfo = i >= 33 ? packageManager.getPackageInfo(this.f28187a.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(this.f28187a.getPackageName(), 0);
        this.f28188b.getClass();
        String strB = e10.b();
        if (strB == null) {
            strB = "Undefined";
        }
        String strConcat = "Android ".concat(strB);
        String strH = C4356c.h(i, "API ");
        String packageName = packageInfo.packageName;
        kotlin.jvm.internal.l.e(packageName, "packageName");
        String versionName = packageInfo.versionName;
        kotlin.jvm.internal.l.e(versionName, "versionName");
        return new sw(packageName, versionName, strConcat, strH);
    }
}
