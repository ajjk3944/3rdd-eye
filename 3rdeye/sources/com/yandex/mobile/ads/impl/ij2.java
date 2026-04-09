package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ij2 {

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f28713a;

    /* renamed from: b, reason: collision with root package name */
    private final sy1 f28714b;

    public ij2(sf1 parentHtmlWebView) {
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        this.f28713a = parentHtmlWebView;
        this.f28714b = new sy1();
    }

    public final void a(Map<String, String> trackingParameters) {
        kotlin.jvm.internal.l.f(trackingParameters, "trackingParameters");
        this.f28714b.a(new V1(7, this, trackingParameters));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ij2 this$0, Map trackingParameters) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(trackingParameters, "$trackingParameters");
        this$0.f28713a.setVisibility(0);
        fp0.d(new Object[0]);
        og0 og0VarJ = this$0.f28713a.j();
        if (og0VarJ != null) {
            og0VarJ.a(this$0.f28713a, trackingParameters);
        }
    }
}
