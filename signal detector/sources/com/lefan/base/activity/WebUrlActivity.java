package com.lefan.base.activity;

import Q4.e;
import Y2.C0212n;
import a4.p;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import c1.g;
import com.apm.insight.R;
import com.bumptech.glide.d;
import com.google.android.gms.internal.ads.C0811Xg;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import d5.y;
import h.AbstractActivityC2349g;
import q5.i;
import u4.ViewOnClickListenerC2957b;

/* loaded from: classes.dex */
public final class WebUrlActivity extends AbstractActivityC2349g {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f18775R = 0;

    /* renamed from: O, reason: collision with root package name */
    public g f18776O;

    /* renamed from: P, reason: collision with root package name */
    public LinearProgressIndicator f18777P;

    /* renamed from: Q, reason: collision with root package name */
    public WebView f18778Q;

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_web_url, (ViewGroup) null, false);
        int i = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.appbar, viewInflate);
        if (appBarLayout != null) {
            i = R.id.web_indicator;
            if (((LinearProgressIndicator) p.e(R.id.web_indicator, viewInflate)) != null) {
                int i3 = R.id.web_toolbar;
                Toolbar toolbar = (Toolbar) p.e(R.id.web_toolbar, viewInflate);
                if (toolbar != null) {
                    i3 = R.id.web_view;
                    WebView webView = (WebView) p.e(R.id.web_view, viewInflate);
                    if (webView != null) {
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                        this.f18776O = new g(linearLayoutCompat, appBarLayout, toolbar, webView, 28);
                        setContentView(linearLayoutCompat);
                        g gVar = this.f18776O;
                        if (gVar == null) {
                            i.g("binding");
                            throw null;
                        }
                        Toolbar toolbar2 = (Toolbar) gVar.f5898d;
                        B(toolbar2);
                        d dVarR = r();
                        if (dVarR != null) {
                            dVarR.S(true);
                        }
                        toolbar2.setNavigationOnClickListener(new ViewOnClickListenerC2957b(this, 4));
                        this.f18777P = (LinearProgressIndicator) findViewById(R.id.web_indicator);
                        g gVar2 = this.f18776O;
                        if (gVar2 == null) {
                            i.g("binding");
                            throw null;
                        }
                        WebView webView2 = (WebView) gVar2.f5899e;
                        this.f18778Q = webView2;
                        F4.d.a((AppBarLayout) gVar2.f5897c, webView2);
                        WebView webView3 = this.f18778Q;
                        if (webView3 == null) {
                            i.g("webView");
                            throw null;
                        }
                        webView3.setWebViewClient(new C0212n(4, this));
                        WebView webView4 = this.f18778Q;
                        if (webView4 == null) {
                            i.g("webView");
                            throw null;
                        }
                        webView4.setWebChromeClient(new C0811Xg(this, 2));
                        WebView webView5 = this.f18778Q;
                        if (webView5 == null) {
                            i.g("webView");
                            throw null;
                        }
                        webView5.getSettings().setJavaScriptEnabled(getIntent().getBooleanExtra("script_enabled", true));
                        int i6 = Build.VERSION.SDK_INT;
                        if (i6 >= 33) {
                            WebView webView6 = this.f18778Q;
                            if (webView6 == null) {
                                i.g("webView");
                                throw null;
                            }
                            webView6.getSettings().setAlgorithmicDarkeningAllowed(true);
                        } else if (i6 >= 29) {
                            WebView webView7 = this.f18778Q;
                            if (webView7 == null) {
                                i.g("webView");
                                throw null;
                            }
                            webView7.getSettings().setForceDark(1);
                        }
                        String stringExtra = getIntent().getStringExtra("url");
                        if (stringExtra != null) {
                            WebView webView8 = this.f18778Q;
                            if (webView8 == null) {
                                i.g("webView");
                                throw null;
                            }
                            webView8.loadUrl(stringExtra);
                        }
                        y.a(o(), new e(8, this));
                        return;
                    }
                }
                i = i3;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
