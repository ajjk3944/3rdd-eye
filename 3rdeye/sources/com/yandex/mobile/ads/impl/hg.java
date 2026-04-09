package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class hg {

    /* renamed from: a, reason: collision with root package name */
    private final List<ag<?>> f28201a;

    /* renamed from: b, reason: collision with root package name */
    private final C4210u2 f28202b;

    /* renamed from: c, reason: collision with root package name */
    private final qo1 f28203c;

    /* renamed from: d, reason: collision with root package name */
    private final ck0 f28204d;

    /* renamed from: e, reason: collision with root package name */
    private final ir0 f28205e;

    /* JADX WARN: Multi-variable type inference failed */
    public hg(List<? extends ag<?>> assets, C4210u2 adClickHandler, qo1 renderedTimer, ck0 impressionEventsObservable, ir0 ir0Var) {
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(adClickHandler, "adClickHandler");
        kotlin.jvm.internal.l.f(renderedTimer, "renderedTimer");
        kotlin.jvm.internal.l.f(impressionEventsObservable, "impressionEventsObservable");
        this.f28201a = assets;
        this.f28202b = adClickHandler;
        this.f28203c = renderedTimer;
        this.f28204d = impressionEventsObservable;
        this.f28205e = ir0Var;
    }

    public final gg a(xo clickListenerFactory, x61 viewAdapter) {
        kotlin.jvm.internal.l.f(clickListenerFactory, "clickListenerFactory");
        kotlin.jvm.internal.l.f(viewAdapter, "viewAdapter");
        return new gg(clickListenerFactory, this.f28201a, this.f28202b, viewAdapter, this.f28203c, this.f28204d, this.f28205e);
    }
}
