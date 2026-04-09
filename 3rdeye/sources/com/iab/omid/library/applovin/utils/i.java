package com.iab.omid.library.applovin.utils;

import R1.d;
import S1.k;
import android.webkit.WebView;
import java.util.Set;

/* loaded from: classes2.dex */
public class i {
    public void a(WebView webView, String str, Set<String> set, d.a aVar) {
        R1.d.a(webView, str, set, aVar);
    }

    public void a(WebView webView, String str) {
        int i = R1.d.f11635a;
        if (!k.f11859d.d()) {
            throw k.a();
        }
        R1.d.c(webView).f11864a.removeWebMessageListener(str);
    }
}
