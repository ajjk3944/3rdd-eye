package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public final class il {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f28728a;

    /* renamed from: b, reason: collision with root package name */
    private final ct f28729b;

    /* renamed from: c, reason: collision with root package name */
    private final fu f28730c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f28731d;

    public il(Context context, vu1 sdkEnvironmentModule, e60 adPlayer, pw1 videoPlayer, Context applicationContext) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adPlayer, "adPlayer");
        kotlin.jvm.internal.l.f(videoPlayer, "videoPlayer");
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        this.f28728a = sdkEnvironmentModule;
        this.f28729b = adPlayer;
        this.f28730c = videoPlayer;
        this.f28731d = applicationContext;
    }

    public final gl a(ViewGroup adViewGroup, List<kb2> friendlyOverlays, xs instreamAd) {
        kotlin.jvm.internal.l.f(adViewGroup, "adViewGroup");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
        kotlin.jvm.internal.l.f(instreamAd, "instreamAd");
        ys ysVar = new ys(this.f28731d, this.f28728a, instreamAd, this.f28729b, this.f28730c);
        return new gl(adViewGroup, friendlyOverlays, ysVar, new WeakReference(adViewGroup), new gl0(ysVar), null);
    }
}
