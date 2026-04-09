package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public final class hl {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f28248a;

    /* renamed from: b, reason: collision with root package name */
    private final ct f28249b;

    /* renamed from: c, reason: collision with root package name */
    private final fu f28250c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f28251d;

    public hl(Context context, vu1 sdkEnvironmentModule, d60 adPlayer, ow1 videoPlayer, Context applicationContext) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adPlayer, "adPlayer");
        kotlin.jvm.internal.l.f(videoPlayer, "videoPlayer");
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        this.f28248a = sdkEnvironmentModule;
        this.f28249b = adPlayer;
        this.f28250c = videoPlayer;
        this.f28251d = applicationContext;
    }

    public final fl a(ViewGroup adViewGroup, List<kb2> friendlyOverlays, xs instreamAd) {
        kotlin.jvm.internal.l.f(adViewGroup, "adViewGroup");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
        kotlin.jvm.internal.l.f(instreamAd, "instreamAd");
        ys ysVar = new ys(this.f28251d, this.f28248a, instreamAd, this.f28249b, this.f28250c);
        return new fl(adViewGroup, friendlyOverlays, ysVar, new WeakReference(adViewGroup), new gl0(ysVar), null);
    }
}
