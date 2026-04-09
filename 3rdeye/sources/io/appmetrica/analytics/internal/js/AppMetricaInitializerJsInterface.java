package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C4859p1;

/* loaded from: classes3.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C4859p1 f42226a;

    public AppMetricaInitializerJsInterface(C4859p1 c4859p1) {
        this.f42226a = c4859p1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f42226a.c(str);
    }
}
