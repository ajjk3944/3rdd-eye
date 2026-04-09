package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public final class zw0 {

    /* renamed from: a, reason: collision with root package name */
    private final pw0 f36766a;

    /* renamed from: b, reason: collision with root package name */
    private final r21 f36767b;

    public /* synthetic */ zw0() {
        this(new pw0(), new r21());
    }

    public final pv1 a(CustomizableMediaView mediaView, ku0 media, ck0 impressionEventsObservable, yb1 nativeWebViewController, cx0 mediaViewRenderController) throws gj2 {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(media, "media");
        kotlin.jvm.internal.l.f(impressionEventsObservable, "impressionEventsObservable");
        kotlin.jvm.internal.l.f(nativeWebViewController, "nativeWebViewController");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        Context context = mediaView.getContext();
        r21 r21Var = this.f36767b;
        kotlin.jvm.internal.l.c(context);
        r21Var.getClass();
        m21 m21VarB = t21.f33379c.a(context).b(media);
        if (m21VarB == null) {
            m21VarB = new m21(context);
        }
        d21 d21VarK = m21VarB.k();
        d21VarK.a(impressionEventsObservable);
        d21VarK.a((i11) nativeWebViewController);
        d21VarK.a((te1) nativeWebViewController);
        this.f36766a.getClass();
        Context context2 = mediaView.getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        if (!s80.a(context2, r80.f32551e)) {
            mediaView.removeAllViews();
        }
        mediaView.addView(m21VarB, new FrameLayout.LayoutParams(-1, -1));
        o21 o21Var = new o21(m21VarB);
        return new pv1(mediaView, o21Var, mediaViewRenderController, new jg2(o21Var));
    }

    public zw0(pw0 mediaSubViewBinder, r21 mraidWebViewFactory) {
        kotlin.jvm.internal.l.f(mediaSubViewBinder, "mediaSubViewBinder");
        kotlin.jvm.internal.l.f(mraidWebViewFactory, "mraidWebViewFactory");
        this.f36766a = mediaSubViewBinder;
        this.f36767b = mraidWebViewFactory;
    }
}
