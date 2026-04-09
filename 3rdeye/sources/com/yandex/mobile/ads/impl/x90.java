package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class x90 extends ha0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f35224a;

    /* renamed from: b, reason: collision with root package name */
    private final k90 f35225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(C4072a3 adConfiguration, ViewGroup nativeAdView, lt adEventListener, de2 videoEventController, k90 feedItemBinder) {
        super(nativeAdView, 0);
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
        kotlin.jvm.internal.l.f(adEventListener, "adEventListener");
        kotlin.jvm.internal.l.f(videoEventController, "videoEventController");
        kotlin.jvm.internal.l.f(feedItemBinder, "feedItemBinder");
        this.f35224a = nativeAdView;
        this.f35225b = feedItemBinder;
    }

    public final void a(i90 feedItem) {
        kotlin.jvm.internal.l.f(feedItem, "feedItem");
        k90 k90Var = this.f35225b;
        Context context = this.f35224a.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        k90Var.a(context, feedItem.a(), feedItem.c(), feedItem.b());
    }

    public final void a() {
        this.f35225b.b();
    }
}
