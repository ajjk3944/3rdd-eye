package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class aj1 {

    /* renamed from: a, reason: collision with root package name */
    private final te2 f24708a;

    /* renamed from: b, reason: collision with root package name */
    private final C4148l2 f24709b;

    public aj1(te2 videoPlayerController, C4148l2 adBreakStatusController) {
        kotlin.jvm.internal.l.f(videoPlayerController, "videoPlayerController");
        kotlin.jvm.internal.l.f(adBreakStatusController, "adBreakStatusController");
        this.f24708a = videoPlayerController;
        this.f24709b = adBreakStatusController;
    }

    public final zi1 a(bm0 instreamAdPlaylist, bj1 listener) {
        kotlin.jvm.internal.l.f(instreamAdPlaylist, "instreamAdPlaylist");
        kotlin.jvm.internal.l.f(listener, "listener");
        ef2 ef2Var = new ef2(this.f24708a, new Handler(Looper.getMainLooper()));
        it1 it1Var = new it1(instreamAdPlaylist);
        return new zi1(ef2Var, new sn1(it1Var, this.f24709b), new rn1(it1Var, this.f24709b), listener);
    }
}
