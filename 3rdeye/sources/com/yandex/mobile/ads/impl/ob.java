package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class ob extends sf1 {

    /* renamed from: k, reason: collision with root package name */
    private final pb f31328k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ob(Context context) {
        this(context, new ot0());
        kotlin.jvm.internal.l.f(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.sf1, com.yandex.mobile.ads.impl.mg0
    public final void a(Context context, String url) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(url, "url");
        this.f31328k.a(url);
    }

    public final void setAdtuneWebViewListener(qb adtuneOptOutWebViewListener) {
        kotlin.jvm.internal.l.f(adtuneOptOutWebViewListener, "adtuneOptOutWebViewListener");
        this.f31328k.a(adtuneOptOutWebViewListener);
    }

    public /* synthetic */ ob(Context context, ot0 ot0Var) {
        af1 af1Var = new af1(context);
        this(context, ot0Var, af1Var, new pb(af1Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(Context context, ot0 manufacturerChecker, af1 optOutRepository, pb adtuneOptOutWebViewController) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(manufacturerChecker, "manufacturerChecker");
        kotlin.jvm.internal.l.f(optOutRepository, "optOutRepository");
        kotlin.jvm.internal.l.f(adtuneOptOutWebViewController, "adtuneOptOutWebViewController");
        this.f31328k = adtuneOptOutWebViewController;
        if (manufacturerChecker.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(adtuneOptOutWebViewController);
    }

    @Override // com.yandex.mobile.ads.impl.sf1
    public final void h() {
    }
}
