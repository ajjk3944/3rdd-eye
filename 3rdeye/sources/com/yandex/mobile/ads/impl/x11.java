package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class x11 implements to {

    /* renamed from: a, reason: collision with root package name */
    private final ir0 f35148a;

    /* renamed from: b, reason: collision with root package name */
    private final wo f35149b;

    public x11(ir0 link, wo clickListenerCreator) {
        kotlin.jvm.internal.l.f(link, "link");
        kotlin.jvm.internal.l.f(clickListenerCreator, "clickListenerCreator");
        this.f35148a = link;
        this.f35149b = clickListenerCreator;
    }

    @Override // com.yandex.mobile.ads.impl.to
    public final void a(m21 view, String url) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(url, "url");
        this.f35149b.a(new ir0(this.f35148a.a(), this.f35148a.c(), this.f35148a.d(), url, this.f35148a.b())).onClick(view);
    }
}
