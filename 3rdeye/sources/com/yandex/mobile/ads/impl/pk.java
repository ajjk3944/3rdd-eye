package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.singular.sdk.internal.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class pk extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f31799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        this.f31799a = new LinkedHashMap();
        g();
    }

    private final String a(String str) {
        return B4.g.o(str, c(), "<body style='margin:0; padding:0;'>");
    }

    private final void g() {
        WebSettings settings = getSettings();
        kotlin.jvm.internal.l.e(settings, "getSettings(...)");
        settings.setAllowFileAccess(false);
        if (ba.a(11)) {
            settings.setAllowContentAccess(false);
            if (ba.a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    @Override // android.webkit.WebView
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public final void addJavascriptInterface(Object any, String jsName) {
        kotlin.jvm.internal.l.f(any, "any");
        kotlin.jvm.internal.l.f(jsName, "jsName");
        super.addJavascriptInterface(any, jsName);
        this.f31799a.put(jsName, any);
    }

    public final void b(String sourcePageData) {
        kotlin.jvm.internal.l.f(sourcePageData, "sourcePageData");
        loadDataWithBaseURL("https://yandex.ru", a(sourcePageData), "text/html", Constants.ENCODING, null);
    }

    public String c() {
        return "";
    }

    public void d() {
        jh2.a((ViewGroup) this);
        Iterator it = this.f31799a.keySet().iterator();
        while (it.hasNext()) {
            removeJavascriptInterface((String) it.next());
        }
        this.f31799a.clear();
        destroy();
        fp0.f(getClass().toString());
    }

    public final void e() {
        int i = aa.f24578b;
        try {
            WebView.class.getDeclaredMethod("onPause", new Class[0]).invoke(this, new Object[0]);
        } catch (Exception unused) {
        }
        fp0.d(getClass().toString());
    }

    public final void f() {
        int i = aa.f24578b;
        try {
            WebView.class.getDeclaredMethod("onResume", new Class[0]).invoke(this, new Object[0]);
        } catch (Exception unused) {
        }
        fp0.d(getClass().toString());
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String jsName) {
        kotlin.jvm.internal.l.f(jsName, "jsName");
        if (ba.a(11)) {
            super.removeJavascriptInterface(jsName);
        }
    }

    public final void setDisplayZoomControls(boolean z10) {
        if (ba.a(11)) {
            getSettings().setDisplayZoomControls(z10);
        }
    }
}
