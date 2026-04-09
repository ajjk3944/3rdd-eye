package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class ub extends sf1 {

    /* renamed from: k, reason: collision with root package name */
    private final vb f34004k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ub(Context context) {
        this(context, new ot0());
        kotlin.jvm.internal.l.f(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.sf1, com.yandex.mobile.ads.impl.mg0
    public final void a(Context context, String url) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(url, "url");
        this.f34004k.a(url);
    }

    public final void setAdtuneWebViewListener(xb adtuneWebViewListener) {
        kotlin.jvm.internal.l.f(adtuneWebViewListener, "adtuneWebViewListener");
        this.f34004k.a(adtuneWebViewListener);
    }

    public final void setOptOutUrl(String str) {
        this.f34004k.b(str);
    }

    public /* synthetic */ ub(Context context, ot0 ot0Var) {
        nb nbVar = new nb(context);
        this(context, ot0Var, nbVar, new vb(nbVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(Context context, ot0 manufacturerChecker, nb optOutRenderer, vb adtuneWebViewController) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(manufacturerChecker, "manufacturerChecker");
        kotlin.jvm.internal.l.f(optOutRenderer, "optOutRenderer");
        kotlin.jvm.internal.l.f(adtuneWebViewController, "adtuneWebViewController");
        this.f34004k = adtuneWebViewController;
        if (manufacturerChecker.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(adtuneWebViewController);
    }

    @Override // com.yandex.mobile.ads.impl.sf1
    public final void h() {
    }
}
