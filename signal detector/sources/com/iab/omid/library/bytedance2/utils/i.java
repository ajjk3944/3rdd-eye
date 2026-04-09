package com.iab.omid.library.bytedance2.utils;

import U0.m;
import android.webkit.WebView;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public class i {
    public void a(WebView webView, String str, Set<String> set, T0.e eVar) {
        T0.f.a(webView, str, set, eVar);
    }

    public void a(WebView webView, String str) {
        int i = T0.f.f3557a;
        if (!m.f3682d.b()) {
            throw m.a();
        }
        ((WebViewProviderBoundaryInterface) T0.f.c(webView).f73b).removeWebMessageListener(str);
    }
}
