package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.internal.common.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5099a {

    /* renamed from: a, reason: collision with root package name */
    public final String f38752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38753b;

    /* renamed from: c, reason: collision with root package name */
    public final List f38754c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38755d;

    /* renamed from: e, reason: collision with root package name */
    public final String f38756e;

    /* renamed from: f, reason: collision with root package name */
    public final String f38757f;

    /* renamed from: g, reason: collision with root package name */
    public final String f38758g;

    /* renamed from: h, reason: collision with root package name */
    public final I4.f f38759h;

    public C5099a(String str, String str2, List list, String str3, String str4, String str5, String str6, I4.f fVar) {
        this.f38752a = str;
        this.f38753b = str2;
        this.f38754c = list;
        this.f38755d = str3;
        this.f38756e = str4;
        this.f38757f = str5;
        this.f38758g = str6;
        this.f38759h = fVar;
    }

    public static C5099a a(Context context, L l10, String str, String str2, List list, I4.f fVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = l10.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C5099a(str, str2, list, strG, packageName, strB, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
