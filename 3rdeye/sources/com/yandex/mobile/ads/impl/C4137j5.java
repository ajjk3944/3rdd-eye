package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;

/* renamed from: com.yandex.mobile.ads.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4137j5 {

    /* renamed from: a, reason: collision with root package name */
    private final c9 f28955a;

    /* renamed from: b, reason: collision with root package name */
    private final C4074a5 f28956b;

    /* renamed from: c, reason: collision with root package name */
    private final oi1 f28957c;

    /* renamed from: d, reason: collision with root package name */
    private final si1 f28958d;

    /* renamed from: com.yandex.mobile.ads.impl.j5$a */
    public interface a {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.j5$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f28959b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f28960c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f28961d;

        static {
            b bVar = new b(0, "SINGLE_AD");
            f28959b = bVar;
            b bVar2 = new b(1, "AD_GROUP");
            f28960c = bVar2;
            b[] bVarArr = {bVar, bVar2};
            f28961d = bVarArr;
            com.google.gson.internal.c.l(bVarArr);
        }

        private b(int i, String str) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f28961d.clone();
        }
    }

    public /* synthetic */ C4137j5(a9 a9Var, mi1 mi1Var) {
        this(a9Var, mi1Var, a9Var.b(), a9Var.c(), mi1Var.d(), mi1Var.e());
    }

    public final void a(C4115g4 adInfo, b adDiscardType, a adDiscardListener) {
        kotlin.jvm.internal.l.f(adInfo, "adInfo");
        kotlin.jvm.internal.l.f(adDiscardType, "adDiscardType");
        kotlin.jvm.internal.l.f(adDiscardListener, "adDiscardListener");
        int iA = adInfo.a();
        int iB = adInfo.b();
        AdPlaybackState adPlaybackStateA = this.f28956b.a();
        if (adPlaybackStateA.isAdInErrorState(iA, iB)) {
            return;
        }
        if (b.f28960c == adDiscardType) {
            int i = adPlaybackStateA.getAdGroup(iA).count;
            while (iB < i) {
                if (!adPlaybackStateA.isAdInErrorState(iA, iB)) {
                    adPlaybackStateA = adPlaybackStateA.withSkippedAd(iA, iB).withAdResumePositionUs(0L);
                    kotlin.jvm.internal.l.c(adPlaybackStateA);
                }
                iB++;
            }
        } else if (!adPlaybackStateA.isAdInErrorState(iA, iB)) {
            adPlaybackStateA = adPlaybackStateA.withSkippedAd(iA, iB).withAdResumePositionUs(0L);
            kotlin.jvm.internal.l.c(adPlaybackStateA);
        }
        this.f28956b.a(adPlaybackStateA);
        this.f28958d.b();
        adDiscardListener.a();
        if (this.f28957c.c()) {
            return;
        }
        this.f28955a.a((vi1) null);
    }

    public C4137j5(a9 adStateDataController, mi1 playerStateController, c9 adStateHolder, C4074a5 adPlaybackStateController, oi1 playerStateHolder, si1 playerVolumeController) {
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(playerVolumeController, "playerVolumeController");
        this.f28955a = adStateHolder;
        this.f28956b = adPlaybackStateController;
        this.f28957c = playerStateHolder;
        this.f28958d = playerVolumeController;
    }
}
