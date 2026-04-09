package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* renamed from: com.yandex.mobile.ads.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4130i5 {

    /* renamed from: a, reason: collision with root package name */
    private final d9 f28487a;

    /* renamed from: b, reason: collision with root package name */
    private final C4081b5 f28488b;

    /* renamed from: c, reason: collision with root package name */
    private final pi1 f28489c;

    /* renamed from: d, reason: collision with root package name */
    private final ti1 f28490d;

    /* renamed from: com.yandex.mobile.ads.impl.i5$a */
    public interface a {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.i5$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f28491b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f28492c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f28493d;

        static {
            b bVar = new b(0, "SINGLE_AD");
            f28491b = bVar;
            b bVar2 = new b(1, "AD_GROUP");
            f28492c = bVar2;
            b[] bVarArr = {bVar, bVar2};
            f28493d = bVarArr;
            com.google.gson.internal.c.l(bVarArr);
        }

        private b(int i, String str) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f28493d.clone();
        }
    }

    public /* synthetic */ C4130i5(b9 b9Var, ni1 ni1Var) {
        this(b9Var, ni1Var, b9Var.b(), b9Var.c(), ni1Var.d(), ni1Var.e());
    }

    public final void a(C4122h4 adInfo, b adDiscardType, a adDiscardListener) {
        kotlin.jvm.internal.l.f(adInfo, "adInfo");
        kotlin.jvm.internal.l.f(adDiscardType, "adDiscardType");
        kotlin.jvm.internal.l.f(adDiscardListener, "adDiscardListener");
        int iA = adInfo.a();
        int iB = adInfo.b();
        AdPlaybackState adPlaybackStateA = this.f28488b.a();
        if (adPlaybackStateA.isAdInErrorState(iA, iB)) {
            return;
        }
        if (b.f28492c == adDiscardType) {
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
        this.f28488b.a(adPlaybackStateA);
        this.f28490d.b();
        adDiscardListener.a();
        if (this.f28489c.c()) {
            return;
        }
        this.f28487a.a((wi1) null);
    }

    public C4130i5(b9 adStateDataController, ni1 playerStateController, d9 adStateHolder, C4081b5 adPlaybackStateController, pi1 playerStateHolder, ti1 playerVolumeController) {
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(playerVolumeController, "playerVolumeController");
        this.f28487a = adStateHolder;
        this.f28488b = adPlaybackStateController;
        this.f28489c = playerStateHolder;
        this.f28490d = playerVolumeController;
    }
}
