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

/* loaded from: classes.dex */
public abstract class n8 {

    /* renamed from: a, reason: collision with root package name */
    private static String f7043a;

    /* renamed from: d, reason: collision with root package name */
    private static int f7046d;

    /* renamed from: e, reason: collision with root package name */
    private static String f7047e;

    /* renamed from: f, reason: collision with root package name */
    private static String f7048f;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f7044b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f7045c = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f7049g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null && ((Boolean) kVar.a(x4.f8446d4)).booleanValue() && e()) {
            f7043a = (String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o());
        } else {
            f7043a = "";
            a5.b(z4.M, (Object) null, com.applovin.impl.sdk.k.o());
        }
    }

    public static void a(final com.applovin.impl.sdk.k kVar) {
        if (f7045c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.yc
            @Override // java.lang.Runnable
            public final void run() {
                n8.d(kVar);
            }
        });
    }

    public static String b() {
        return f7048f;
    }

    public static String c() {
        return f7047e;
    }

    public static int d() {
        return f7046d;
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (f7049g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(kVar);
        if (packageInfoC != null) {
            f7046d = packageInfoC.versionCode;
            f7047e = packageInfoC.versionName;
            f7048f = packageInfoC.packageName;
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
        Iterator it = kVar.c(x4.f8543o4).iterator();
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
            synchronized (f7044b) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.o());
                    if (!TextUtils.isEmpty(defaultUserAgent)) {
                        f7043a = defaultUserAgent;
                        a5.b(z4.M, f7043a, com.applovin.impl.sdk.k.o());
                    } else {
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().b("WebViewDataCollector", "Collected invalid user agent");
                        }
                        kVar.D().a(d2.f5718b1, "collectedInvalidUserAgent");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("WebViewDataCollector", "Failed to collect user agent", th2);
            }
            kVar.D().a("WebViewDataCollector", "collectUserAgent", th2);
        }
    }

    private static boolean e() {
        boolean zIsValidString;
        synchronized (f7044b) {
            zIsValidString = StringUtils.isValidString((String) a5.a(z4.M, "", com.applovin.impl.sdk.k.o()));
        }
        return zIsValidString;
    }

    public static String a() {
        String str;
        synchronized (f7044b) {
            str = f7043a;
        }
        return str;
    }
}
