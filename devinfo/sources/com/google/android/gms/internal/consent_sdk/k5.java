package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k5 {

    /* renamed from: a, reason: collision with root package name */
    public final v4 f19388a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f19389b;

    /* renamed from: c, reason: collision with root package name */
    public final ConsentDebugSettings f19390c;

    /* renamed from: d, reason: collision with root package name */
    public final ConsentRequestParameters f19391d;

    public /* synthetic */ k5(v4 v4Var, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters) {
        this.f19388a = v4Var;
        this.f19389b = activity;
        this.f19390c = consentDebugSettings;
        this.f19391d = consentRequestParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    public static a0 a(k5 k5Var) throws PackageManager.NameNotFoundException, r1 {
        Bundle bundle;
        List list;
        PackageInfo packageInfo;
        a0 a0Var = new a0(0);
        a0Var.g = Collections.EMPTY_MAP;
        a0Var.f19262k = Collections.EMPTY_LIST;
        ConsentRequestParameters consentRequestParameters = k5Var.f19391d;
        v4 v4Var = k5Var.f19388a;
        Application application = v4Var.f19543a;
        String strZza = consentRequestParameters.zza();
        if (TextUtils.isEmpty(strZza)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strZza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(strZza)) {
                throw new r1(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        a0Var.f19255b = strZza;
        ConsentDebugSettings consentDebugSettings = k5Var.f19390c;
        if (consentDebugSettings.isTestDevice()) {
            ArrayList arrayList = new ArrayList();
            int debugGeography = consentDebugSettings.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(y.f19568a);
            } else if (debugGeography == 2) {
                arrayList.add(y.f19571d);
            } else if (debugGeography == 3) {
                arrayList.add(y.f19569b);
            } else if (debugGeography == 4) {
                arrayList.add(y.f19570c);
            }
            arrayList.add(y.f19572e);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        a0Var.f19262k = list;
        a0Var.g = v4Var.f19544b.a();
        a0Var.f19259f = Boolean.valueOf(consentRequestParameters.isTagForUnderAgeOfConsent());
        a0Var.f19257d = Locale.getDefault().toLanguageTag();
        com.google.android.gms.common.api.internal.a0 a0Var2 = new com.google.android.gms.common.api.internal.a0((char) 0, 1);
        a0Var2.f9069b = 1;
        int i4 = Build.VERSION.SDK_INT;
        a0Var2.f9071d = Integer.valueOf(i4);
        a0Var2.f9070c = Build.MODEL;
        a0Var2.f9069b = 2;
        a0Var.f19258e = a0Var2;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        a0.x0 x0Var = new a0.x0(7, false);
        Object arrayList2 = Collections.EMPTY_LIST;
        x0Var.f147d = arrayList2;
        x0Var.f148e = Integer.valueOf(configuration.screenWidthDp);
        x0Var.f145b = Integer.valueOf(configuration.screenHeightDp);
        x0Var.f146c = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i4 >= 28) {
            Activity activity = k5Var.f19389b;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        z zVar = new z();
                        zVar.f19599b = Integer.valueOf(rect.left);
                        zVar.f19600c = Integer.valueOf(rect.right);
                        zVar.f19598a = Integer.valueOf(rect.top);
                        zVar.f19601d = Integer.valueOf(rect.bottom);
                        arrayList2.add(zVar);
                    }
                }
            }
        }
        x0Var.f147d = arrayList2;
        a0Var.f19260h = x0Var;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        yb.e eVar = new yb.e(7, false);
        eVar.f37509b = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        eVar.f37510c = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            eVar.f37511d = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        a0Var.f19261i = eVar;
        a0Var.j = new q4(23);
        a0Var.f19256c = consentRequestParameters.getConsentSyncId();
        return a0Var;
    }
}
