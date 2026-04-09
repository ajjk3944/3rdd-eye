package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class mm0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final mb2<tn0> f30438a;

    /* renamed from: b, reason: collision with root package name */
    private final zf2 f30439b;

    /* renamed from: c, reason: collision with root package name */
    private final yn0 f30440c;

    /* renamed from: d, reason: collision with root package name */
    private final ud2 f30441d;

    /* renamed from: e, reason: collision with root package name */
    private final f82 f30442e;

    /* renamed from: f, reason: collision with root package name */
    private final ze1 f30443f;

    public /* synthetic */ mm0(Context context, vu1 vu1Var, zs zsVar, mb2 mb2Var, zf2 zf2Var, yn0 yn0Var, ud2 ud2Var) {
        this(context, vu1Var, zsVar, mb2Var, zf2Var, yn0Var, ud2Var, new ln0(context, vu1Var, zsVar, mb2Var), new f82(context));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        this.f30439b.m();
        this.f30440c.i(this.f30438a.d());
        String strA = this.f30441d.a();
        if (strA == null || strA.length() == 0) {
            return;
        }
        this.f30443f.a(this.f30442e.a(strA));
    }

    public mm0(Context context, vu1 sdkEnvironmentModule, zs coreInstreamAdBreak, mb2<tn0> videoAdInfo, zf2 videoTracker, yn0 playbackListener, ud2 videoClicks, ln0 openUrlHandlerProvider, f82 urlModifier) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(playbackListener, "playbackListener");
        kotlin.jvm.internal.l.f(videoClicks, "videoClicks");
        kotlin.jvm.internal.l.f(openUrlHandlerProvider, "openUrlHandlerProvider");
        kotlin.jvm.internal.l.f(urlModifier, "urlModifier");
        this.f30438a = videoAdInfo;
        this.f30439b = videoTracker;
        this.f30440c = playbackListener;
        this.f30441d = videoClicks;
        this.f30442e = urlModifier;
        this.f30443f = openUrlHandlerProvider.a();
    }
}
