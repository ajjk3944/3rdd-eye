package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import c9.C2091l;
import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class og1 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f31362a = C2092m.W("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");

    public static void a(Context context) throws PackageManager.NameNotFoundException, oo0 {
        kotlin.jvm.internal.l.f(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            ArrayList arrayListI0 = C2097r.I0(f31362a);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                arrayListI0.removeAll(C2091l.t(strArr));
                if (arrayListI0.size() <= 0) {
                    return;
                }
                String str = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{arrayListI0}, 1));
                throw new oo0(str, str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
