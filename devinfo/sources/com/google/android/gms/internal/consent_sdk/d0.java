package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f19303a;

    /* renamed from: b, reason: collision with root package name */
    public h2 f19304b;

    /* renamed from: d, reason: collision with root package name */
    public c2 f19306d;

    /* renamed from: c, reason: collision with root package name */
    public z1 f19305c = null;

    /* renamed from: e, reason: collision with root package name */
    public String f19307e = null;

    public d0(Application application) {
        this.f19303a = application;
    }

    public final w2 a(int i4, long j, String str) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        v2 v2VarM = w2.m();
        a2 a2VarM = i2.m();
        d2 d2VarM = e2.m();
        d2VarM.d();
        e2.p((e2) d2VarM.f19546b, i4);
        if (str != null) {
            d2VarM.d();
            e2.n((e2) d2VarM.f19546b, str);
        }
        if (j > 0) {
            d2VarM.d();
            e2.o((e2) d2VarM.f19546b, j);
        }
        e2 e2Var = (e2) d2VarM.a();
        a2VarM.d();
        i2.r((i2) a2VarM.f19546b, e2Var);
        String str2 = this.f19307e;
        PackageInfo packageInfo = null;
        Application application = this.f19303a;
        if (str2 == null) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                this.f19307e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(this.f19307e)) {
                Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
            str2 = this.f19307e;
        }
        if (str2 != null) {
            a2VarM.d();
            i2.o((i2) a2VarM.f19546b, str2);
        }
        h2 h2Var = this.f19304b;
        if (h2Var == null) {
            f2 f2VarM = h2.m();
            f2VarM.d();
            h2.n((h2) f2VarM.f19546b);
            h2Var = (h2) f2VarM.a();
            this.f19304b = h2Var;
        }
        a2VarM.d();
        i2.s((i2) a2VarM.f19546b, h2Var);
        c2 c2Var = this.f19306d;
        if (c2Var == null) {
            b2 b2VarM = c2.m();
            int i10 = Build.VERSION.SDK_INT;
            b2VarM.d();
            c2.n((c2) b2VarM.f19546b, i10);
            String str3 = Build.MODEL;
            b2VarM.d();
            c2.o((c2) b2VarM.f19546b);
            b2VarM.d();
            c2.q((c2) b2VarM.f19546b);
            String str4 = Build.VERSION.RELEASE;
            b2VarM.d();
            c2.p((c2) b2VarM.f19546b);
            c2Var = (c2) b2VarM.a();
            this.f19306d = c2Var;
        }
        a2VarM.d();
        i2.q((i2) a2VarM.f19546b, c2Var);
        z1 z1Var = this.f19305c;
        if (z1Var == null) {
            String packageName = application.getPackageName();
            try {
                packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (packageInfo != null) {
                y1 y1VarM = z1.m();
                String string = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
                y1VarM.d();
                z1.o((z1) y1VarM.f19546b, string);
                y1VarM.d();
                z1.n((z1) y1VarM.f19546b, packageName);
                this.f19305c = (z1) y1VarM.a();
            }
            z1Var = this.f19305c;
        }
        if (z1Var != null) {
            a2VarM.d();
            i2.p((i2) a2VarM.f19546b, z1Var);
        }
        String string2 = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
        if (string2 != null && !string2.isEmpty()) {
            m0 m0Var = new m0(string2);
            while (m0Var.hasNext()) {
                String str5 = (String) m0Var.next();
                a2VarM.d();
                i2.n((i2) a2VarM.f19546b, str5);
            }
        }
        i2 i2Var = (i2) a2VarM.a();
        v2VarM.d();
        w2.n((w2) v2VarM.f19546b, i2Var);
        long jCurrentTimeMillis = System.currentTimeMillis();
        v2VarM.d();
        w2.o((w2) v2VarM.f19546b, jCurrentTimeMillis);
        return (w2) v2VarM.a();
    }
}
