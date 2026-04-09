package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;

/* loaded from: classes3.dex */
public final class nv0 {

    /* renamed from: a, reason: collision with root package name */
    private final mv0 f31022a;

    /* renamed from: b, reason: collision with root package name */
    private final at1<CorePlaybackControlsContainer> f31023b;

    public /* synthetic */ nv0() {
        this(new mv0(), new at1());
    }

    public final ov0 a(Context context, int i, ov0 customControls) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(customControls, "customControls");
        this.f31022a.getClass();
        if (customControls.getMuteControl() != null || customControls.getVideoProgress() != null || customControls.getCountDownProgress() != null) {
            return new iv(customControls.getMuteControl(), customControls.getVideoProgress(), customControls.getCountDownProgress());
        }
        this.f31023b.getClass();
        return (ov0) at1.a(context, CorePlaybackControlsContainer.class, i, null);
    }

    public nv0(mv0 controlsAvailabilityChecker, at1<CorePlaybackControlsContainer> safeLayoutInflater) {
        kotlin.jvm.internal.l.f(controlsAvailabilityChecker, "controlsAvailabilityChecker");
        kotlin.jvm.internal.l.f(safeLayoutInflater, "safeLayoutInflater");
        this.f31022a = controlsAvailabilityChecker;
        this.f31023b = safeLayoutInflater;
    }
}
