package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f4 {

    /* renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f5988a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f5989b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f5990c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f5991d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f5992e;

    /* renamed from: f, reason: collision with root package name */
    protected AdSession f5993f;

    /* renamed from: g, reason: collision with root package name */
    protected AdEvents f5994g;

    public f4(AppLovinAdBase appLovinAdBase) {
        this.f5988a = appLovinAdBase;
        this.f5989b = appLovinAdBase.getSdk();
        this.f5990c = appLovinAdBase.getSdk().O();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.f5991d = str;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.oa
            @Override // java.lang.Runnable
            public final void run() {
                this.f7190a.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f5988a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5990c.d(this.f5991d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f5993f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5990c.k(this.f5991d, "Attempting to start session again for ad: " + this.f5988a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f5990c.a(this.f5991d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f5993f = adSessionCreateAdSession;
            try {
                this.f5994g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f5993f);
                this.f5993f.start();
                this.f5992e = true;
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5990c.a(this.f5991d, "Session started");
                }
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5990c.a(this.f5991d, "Failed to create ad events", th);
                }
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5990c.a(this.f5991d, "Failed to create session", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f5994g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void c(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ma
            @Override // java.lang.Runnable
            public final void run() {
                this.f6493a.b(webView);
            }
        });
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", new Runnable() { // from class: com.applovin.impl.qa
            @Override // java.lang.Runnable
            public final void run() {
                this.f7397a.b();
            }
        });
    }

    public void g() {
        b("track impression event", new Runnable() { // from class: com.applovin.impl.pa
            @Override // java.lang.Runnable
            public final void run() {
                this.f7272a.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f5994g.impressionOccurred();
    }

    public void a(View view) {
        b(view, Collections.EMPTY_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f5993f.registerAdView(view);
        this.f5993f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h4 h4Var = (h4) it.next();
            if (h4Var.c() != null) {
                try {
                    this.f5993f.addFriendlyObstruction(h4Var.c(), h4Var.b(), h4Var.a());
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f5990c.a(this.f5991d, "Failed to add friendly obstruction (" + h4Var + ")", th);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f5993f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f5992e) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f5990c.a(this.f5991d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5990c.a(this.f5991d, "Failed to run operation: " + str, th);
            }
        }
    }

    public void b(final View view, final List list) {
        b("update main view: " + view, new Runnable() { // from class: com.applovin.impl.na
            @Override // java.lang.Runnable
            public final void run() {
                this.f7050a.a(view, list);
            }
        });
    }

    public void b(final String str) {
        b("track error", new Runnable() { // from class: com.applovin.impl.ka
            @Override // java.lang.Runnable
            public final void run() {
                this.f6335a.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f5992e = false;
        this.f5993f.finish();
        this.f5993f = null;
        this.f5994g = null;
    }

    public void b(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.la
            @Override // java.lang.Runnable
            public final void run() {
                this.f6427a.a(str, runnable);
            }
        });
    }
}
