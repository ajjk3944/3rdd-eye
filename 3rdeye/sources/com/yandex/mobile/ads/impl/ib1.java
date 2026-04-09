package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public final class ib1 {

    /* renamed from: a, reason: collision with root package name */
    private final jv f28629a;

    public /* synthetic */ ib1() {
        this(new jv());
    }

    public final lf2 a(CustomizableMediaView mediaView) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        this.f28629a.getClass();
        lf2 videoScaleType = mediaView.getVideoScaleType();
        return videoScaleType == null ? lf2.f29990b : videoScaleType;
    }

    public ib1(jv customizableMediaViewManager) {
        kotlin.jvm.internal.l.f(customizableMediaViewManager, "customizableMediaViewManager");
        this.f28629a = customizableMediaViewManager;
    }
}
