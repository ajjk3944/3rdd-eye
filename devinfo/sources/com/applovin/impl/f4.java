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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f4 {

    /* renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f4106a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f4107b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f4108c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f4109d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f4110e;

    /* renamed from: f, reason: collision with root package name */
    protected AdSession f4111f;
    protected AdEvents g;

    public f4(AppLovinAdBase appLovinAdBase) {
        this.f4106a = appLovinAdBase;
        this.f4107b = appLovinAdBase.getSdk();
        this.f4108c = appLovinAdBase.getSdk().O();
        String string = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder sbB = i3.e.b(string, ":");
            sbB.append(appLovinAdBase.getDspName());
            string = sbB.toString();
        }
        this.f4109d = string;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new i9(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f4106a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4108c.d(this.f4109d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f4111f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4108c.k(this.f4109d, "Attempting to start session again for ad: " + this.f4106a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4108c.a(this.f4109d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f4111f = adSessionCreateAdSession;
            try {
                this.g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f4111f);
                this.f4111f.start();
                this.f4110e = true;
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4108c.a(this.f4109d, "Session started");
                }
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4108c.a(this.f4109d, "Failed to create ad events", th2);
                }
            }
        } catch (Throwable th3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4108c.a(this.f4109d, "Failed to create session", th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new w8(6, this, webView));
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", new i9(this, 2));
    }

    public void g() {
        b("track impression event", new i9(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.g.impressionOccurred();
    }

    public void a(View view) {
        b(view, Collections.EMPTY_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f4111f.registerAdView(view);
        this.f4111f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h4 h4Var = (h4) it.next();
            if (h4Var.c() != null) {
                try {
                    this.f4111f.addFriendlyObstruction(h4Var.c(), h4Var.b(), h4Var.a());
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f4108c.a(this.f4109d, "Failed to add friendly obstruction (" + h4Var + ")", th2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f4111f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f4110e) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4108c.a(this.f4109d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4108c.a(this.f4109d, "Failed to run operation: " + str, th2);
            }
        }
    }

    public void b(View view, List list) {
        b("update main view: " + view, new b5.e(this, view, list, 7));
    }

    public void b(String str) {
        b("track error", new w8(5, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f4110e = false;
        this.f4111f.finish();
        this.f4111f = null;
        this.g = null;
    }

    public void b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new b5.e(this, str, runnable, 6));
    }
}
