package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class qo {

    /* renamed from: a, reason: collision with root package name */
    private final mb2<tn0> f32301a;

    /* renamed from: b, reason: collision with root package name */
    private final View.OnClickListener f32302b;

    /* renamed from: c, reason: collision with root package name */
    private final g10 f32303c;

    public qo(Context context, vu1 sdkEnvironmentModule, zs coreInstreamAdBreak, mb2<tn0> videoAdInfo, zf2 videoTracker, yn0 playbackListener, ud2 videoClicks, View.OnClickListener clickListener, g10 deviceTypeProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(playbackListener, "playbackListener");
        kotlin.jvm.internal.l.f(videoClicks, "videoClicks");
        kotlin.jvm.internal.l.f(clickListener, "clickListener");
        kotlin.jvm.internal.l.f(deviceTypeProvider, "deviceTypeProvider");
        this.f32301a = videoAdInfo;
        this.f32302b = clickListener;
        this.f32303c = deviceTypeProvider;
    }

    public final void a(View clickControl) {
        kotlin.jvm.internal.l.f(clickControl, "clickControl");
        g10 g10Var = this.f32303c;
        Context context = clickControl.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        f10 f10VarA = g10Var.a(context);
        String strC = this.f32301a.b().c();
        if ((strC == null || strC.length() == 0) || f10VarA == f10.f27168d) {
            clickControl.setVisibility(8);
        } else {
            clickControl.setOnClickListener(this.f32302b);
        }
    }
}
