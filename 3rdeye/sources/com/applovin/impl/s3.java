package com.applovin.impl;

import N7.G8;
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
public abstract class s3 {

    /* renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f20927a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f20928b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f20929c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f20930d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f20931e;

    /* renamed from: f, reason: collision with root package name */
    protected AdSession f20932f;

    /* renamed from: g, reason: collision with root package name */
    protected AdEvents f20933g;

    public s3(AppLovinAdBase appLovinAdBase) {
        this.f20927a = appLovinAdBase;
        this.f20928b = appLovinAdBase.getSdk();
        this.f20929c = appLovinAdBase.getSdk().O();
        String string = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder sbV = G8.v(string, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
            sbV.append(appLovinAdBase.getDspName());
            string = sbV.toString();
        }
        this.f20930d = string;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new C2.h(this, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f20927a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20929c.d(this.f20930d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f20932f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20929c.k(this.f20930d, "Attempting to start session again for ad: " + this.f20927a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f20929c.a(this.f20930d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f20932f = adSessionCreateAdSession;
            try {
                this.f20933g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f20932f);
                this.f20932f.start();
                this.f20931e = true;
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20929c.a(this.f20930d, "Session started");
                }
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20929c.a(this.f20930d, "Failed to create ad events", th);
                }
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20929c.a(this.f20930d, "Failed to create session", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f20933g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new H0(7, this, webView));
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", new H(this, 3));
    }

    public void g() {
        b("track impression event", new L0(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f20933g.impressionOccurred();
    }

    public void a(View view) {
        b(view, Collections.EMPTY_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f20932f.registerAdView(view);
        this.f20932f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u3 u3Var = (u3) it.next();
            if (u3Var.c() != null) {
                try {
                    this.f20932f.addFriendlyObstruction(u3Var.c(), u3Var.b(), u3Var.a());
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f20929c.a(this.f20930d, "Failed to add friendly obstruction (" + u3Var + ")", th);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f20932f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f20931e) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20929c.a(this.f20930d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20929c.a(this.f20930d, "Failed to run operation: " + str, th);
            }
        }
    }

    public void b(View view, List list) {
        b("update main view: " + view, new J4.e(this, view, list, 9));
    }

    public void b(String str) {
        b("track error", new B.c(20, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f20931e = false;
        this.f20932f.finish();
        this.f20932f = null;
        this.f20933g = null;
    }

    public void b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new J4.e(this, str, runnable));
    }
}
