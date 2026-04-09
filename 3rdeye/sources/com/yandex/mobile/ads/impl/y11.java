package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class y11 implements uo {

    /* renamed from: a, reason: collision with root package name */
    private final m21 f35590a;

    public y11(m21 mraidWebView) {
        kotlin.jvm.internal.l.f(mraidWebView, "mraidWebView");
        this.f35590a = mraidWebView;
    }

    @Override // com.yandex.mobile.ads.impl.uo
    public final void a(ir0 link, wo clickListenerCreator) {
        kotlin.jvm.internal.l.f(link, "link");
        kotlin.jvm.internal.l.f(clickListenerCreator, "clickListenerCreator");
        this.f35590a.setClickListener(new x11(link, clickListenerCreator));
    }
}
