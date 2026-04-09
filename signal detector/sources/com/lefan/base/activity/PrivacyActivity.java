package com.lefan.base.activity;

import F4.d;
import F4.e;
import H4.c;
import R2.a;
import Y2.C0212n;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import c.AbstractC0391p;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.C0811Xg;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import d5.y;
import h.AbstractActivityC2349g;
import q5.i;
import q5.o;
import u4.ViewOnClickListenerC2957b;
import y5.l;

/* loaded from: classes.dex */
public final class PrivacyActivity extends AbstractActivityC2349g {

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f18764P = 0;

    /* renamed from: O, reason: collision with root package name */
    public LinearProgressIndicator f18765O;

    public final String C(String str) {
        if (!str.equals("privacy")) {
            return "https://www.yifanads.com/app/agreement";
        }
        String packageName = getPackageName();
        if (packageName == null) {
            return "https://www.yifanads.com";
        }
        switch (packageName.hashCode()) {
            case -2035594866:
                return !packageName.equals("com.lefan.area") ? "https://www.yifanads.com" : "https://www.yifanads.com/app/area/privacy_en.html";
            case -1941833075:
                return !packageName.equals("com.lefan.colour") ? "https://www.yifanads.com" : "https://www.yifanads.com/app/colour/privacy_en.html";
            case -1513635072:
                return !packageName.equals("com.lefan.imagebatch") ? "https://www.yifanads.com" : "https://www.yifanads.com/app/imagebatch/privacy_en.html";
            case -1489458327:
                return !packageName.equals("com.lefan.signal") ? "https://www.yifanads.com" : "https://www.yifanads.com/app/signal/privacy_en.html";
            case -1161199592:
                return !packageName.equals("com.lefan.signal.vip") ? "https://www.yifanads.com" : "https://www.yifanads.com/app/signal/privacy_vip";
            case -911853875:
                return !packageName.equals("com.lefan.bestscore") ? "https://www.yifanads.com" : "https://www.yifanads.com/app/2048/privacy_en.html";
            case -430708154:
                return !packageName.equals("com.lefan.apkanaly") ? "https://www.yifanads.com" : "https://www.yifanads.com/app/apkanaly/privacy_en.html";
            case 110106840:
                return !packageName.equals("com.lefan.current") ? "https://www.yifanads.com" : "https://www.yifanads.com/app/current/privacy_en.html";
            case 1317969212:
                return !packageName.equals("com.lefan.colour.vip") ? "https://www.yifanads.com" : "https://www.yifanads.com/app/colour/privacy_vip";
            case 1391979929:
                return !packageName.equals("com.lefan.colour.samsung") ? "https://www.yifanads.com" : "https://www.yifanads.com/app/colour/privacy_en.html";
            default:
                return "https://www.yifanads.com";
        }
    }

    public final String D() {
        String language = e.c(null).getLanguage();
        i.d(language, "getLanguage(...)");
        if (l.V(language, "zh", false)) {
            String packageName = getPackageName();
            i.d(packageName, "getPackageName(...)");
            return l.V(packageName, ".vip", false) ? "file:///android_asset/html/privacy_vip/privacy_zh.html" : "file:///android_asset/html/privacy_zh.html";
        }
        String language2 = e.c(null).getLanguage();
        i.d(language2, "getLanguage(...)");
        if (l.V(language2, "ru", false)) {
            String packageName2 = getPackageName();
            i.d(packageName2, "getPackageName(...)");
            return l.V(packageName2, ".vip", false) ? "file:///android_asset/html/privacy_vip/privacy_ru.html" : "file:///android_asset/html/privacy_ru.html";
        }
        String packageName3 = getPackageName();
        i.d(packageName3, "getPackageName(...)");
        return l.V(packageName3, ".vip", false) ? "file:///android_asset/html/privacy_vip/privacy_en.html" : "file:///android_asset/html/privacy_en.html";
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_privacy);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.privacy_web);
        View viewFindViewById = findViewById(R.id.appbar);
        i.d(viewFindViewById, "findViewById(...)");
        i.b(frameLayout);
        d.a(viewFindViewById, frameLayout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.privacy_toolbar);
        B(toolbar);
        com.bumptech.glide.d dVarR = r();
        if (dVarR != null) {
            dVarR.S(true);
        }
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC2957b(this, 3));
        String stringExtra = getIntent().getStringExtra("my_name");
        if (stringExtra == null) {
            stringExtra = "privacy";
        }
        o oVar = new o();
        try {
            oVar.f23299a = new WebView(this);
            frameLayout.removeAllViews();
            frameLayout.addView((View) oVar.f23299a);
        } catch (Throwable th) {
            a.d(th);
        }
        this.f18765O = (LinearProgressIndicator) findViewById(R.id.privacy_indicator);
        Object obj = oVar.f23299a;
        if (obj == null) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C(stringExtra))));
                return;
            } catch (ActivityNotFoundException unused) {
                d.b(this, getString(R.string.web_view_not_found));
                return;
            }
        }
        ((WebView) obj).setWebViewClient(new C0212n(3, this));
        ((WebView) oVar.f23299a).setWebChromeClient(new C0811Xg(this, 1));
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            ((WebView) oVar.f23299a).getSettings().setAlgorithmicDarkeningAllowed(true);
        } else if (i >= 29) {
            ((WebView) oVar.f23299a).getSettings().setForceDark(1);
        }
        if (stringExtra.equals("agreement")) {
            WebView webView = (WebView) oVar.f23299a;
            String language = e.c(null).getLanguage();
            i.d(language, "getLanguage(...)");
            if (l.V(language, "zh", false)) {
                str = "file:///android_asset/agree/agreement_zh.html";
            } else {
                String language2 = e.c(null).getLanguage();
                i.d(language2, "getLanguage(...)");
                str = l.V(language2, "ru", false) ? "file:///android_asset/agree/agreement_ru.html" : "file:///android_asset/agree/agreement_en.html";
            }
            webView.loadUrl(str);
            toolbar.setTitle(getString(R.string.privacy_agreement));
        } else if (stringExtra.equals("privacy")) {
            ((WebView) oVar.f23299a).loadUrl(D());
            toolbar.setTitle(getString(R.string.privacy_statement));
        } else {
            ((WebView) oVar.f23299a).loadUrl(D());
            toolbar.setTitle(getString(R.string.privacy_statement));
        }
        y.a(o(), new c(oVar, 8, this));
    }
}
