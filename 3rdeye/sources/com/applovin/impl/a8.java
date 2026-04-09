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
public abstract class a8 {

    /* renamed from: a, reason: collision with root package name */
    private static String f18952a;

    /* renamed from: d, reason: collision with root package name */
    private static int f18955d;

    /* renamed from: e, reason: collision with root package name */
    private static String f18956e;

    /* renamed from: f, reason: collision with root package name */
    private static String f18957f;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f18953b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f18954c = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f18958g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.f21161C0;
        if (kVar != null && ((Boolean) kVar.a(l4.f19836T3)).booleanValue() && e()) {
            f18952a = (String) o4.a(n4.f20564I, "", com.applovin.impl.sdk.k.o());
        } else {
            f18952a = "";
            o4.b(n4.f20564I, (Object) null, com.applovin.impl.sdk.k.o());
        }
    }

    public static void a(com.applovin.impl.sdk.k kVar) {
        if (f18954c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new A(0, kVar));
    }

    public static String b() {
        return f18957f;
    }

    public static String c() {
        return f18956e;
    }

    public static int d() {
        return f18955d;
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (f18958g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(kVar);
        if (packageInfoC != null) {
            f18955d = packageInfoC.versionCode;
            f18956e = packageInfoC.versionName;
            f18957f = packageInfoC.packageName;
        } else {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.k kVar) {
        PackageManager packageManager = com.applovin.impl.sdk.k.o().getPackageManager();
        if (AbstractC2128k0.g()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = kVar.c(l4.e4).iterator();
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
            synchronized (f18953b) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.o());
                    if (!TextUtils.isEmpty(defaultUserAgent)) {
                        f18952a = defaultUserAgent;
                        o4.b(n4.f20564I, f18952a, com.applovin.impl.sdk.k.o());
                    } else {
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().b("WebViewDataCollector", "Collected invalid user agent");
                        }
                        kVar.E().a(y1.F0, "collectedInvalidUserAgent");
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
            kVar.E().a("WebViewDataCollector", "collectUserAgent", th2);
        }
    }

    private static boolean e() {
        boolean zIsValidString;
        synchronized (f18953b) {
            zIsValidString = StringUtils.isValidString((String) o4.a(n4.f20564I, "", com.applovin.impl.sdk.k.o()));
        }
        return zIsValidString;
    }

    public static String a() {
        String str;
        synchronized (f18953b) {
            str = f18952a;
        }
        return str;
    }
}
