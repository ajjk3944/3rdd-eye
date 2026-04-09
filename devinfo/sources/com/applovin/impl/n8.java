package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class n8 {

    /* renamed from: a, reason: collision with root package name */
    private static String f4895a;

    /* renamed from: d, reason: collision with root package name */
    private static int f4898d;

    /* renamed from: e, reason: collision with root package name */
    private static String f4899e;

    /* renamed from: f, reason: collision with root package name */
    private static String f4900f;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f4896b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f4897c = new AtomicBoolean();
    private static final AtomicBoolean g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null && ((Boolean) kVar.a(x4.f6016d4)).booleanValue() && e()) {
            f4895a = (String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o());
        } else {
            f4895a = "";
            a5.b(z4.M, (Object) null, com.applovin.impl.sdk.k.o());
        }
    }

    public static void a(com.applovin.impl.sdk.k kVar) {
        if (f4897c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new p9(1, kVar));
    }

    public static String b() {
        return f4900f;
    }

    public static String c() {
        return f4899e;
    }

    public static int d() {
        return f4898d;
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(kVar);
        if (packageInfoC != null) {
            f4898d = packageInfoC.versionCode;
            f4899e = packageInfoC.versionName;
            f4900f = packageInfoC.packageName;
        } else {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.k kVar) {
        PackageManager packageManager = com.applovin.impl.sdk.k.o().getPackageManager();
        if (o0.g()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = kVar.c(x4.o4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.k kVar) {
        try {
            synchronized (f4896b) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.o());
                    if (!TextUtils.isEmpty(defaultUserAgent)) {
                        f4895a = defaultUserAgent;
                        a5.b(z4.M, f4895a, com.applovin.impl.sdk.k.o());
                    } else {
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().b("WebViewDataCollector", "Collected invalid user agent");
                        }
                        kVar.D().a(d2.f3874b1, "collectedInvalidUserAgent");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("WebViewDataCollector", "Failed to collect user agent", th3);
            }
            kVar.D().a("WebViewDataCollector", "collectUserAgent", th3);
        }
    }

    private static boolean e() {
        boolean zIsValidString;
        synchronized (f4896b) {
            zIsValidString = StringUtils.isValidString((String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o()));
        }
        return zIsValidString;
    }

    public static String a() {
        String str;
        synchronized (f4896b) {
            str = f4895a;
        }
        return str;
    }
}
