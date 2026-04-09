package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C4859p1;

/* loaded from: classes3.dex */
public class AppMetricaJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C4859p1 f42227a;

    public AppMetricaJsInterface(C4859p1 c4859p1) {
        this.f42227a = c4859p1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f42227a.d(str, str2);
    }
}
