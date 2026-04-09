package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class th2 implements pc2 {

    /* renamed from: a, reason: collision with root package name */
    private final jc2<?> f33611a;

    /* renamed from: b, reason: collision with root package name */
    private final gd2 f33612b;

    public /* synthetic */ th2(ka1 ka1Var, sb1 sb1Var) {
        this(ka1Var, sb1Var, new v21(), v21.a(sb1Var));
    }

    @Override // com.yandex.mobile.ads.impl.pc2
    public final void a(long j4, long j10) {
        if (this.f33612b.a()) {
            if (this.f33611a.isPlayingAd()) {
                return;
            }
            this.f33611a.resumeAd();
        } else if (this.f33611a.isPlayingAd()) {
            this.f33611a.pauseAd();
        }
    }

    public th2(ka1 videoAdPlayer, sb1 videoViewProvider, v21 mrcVideoAdViewValidatorFactory, gd2 videoAdVisibilityValidator) {
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        kotlin.jvm.internal.l.f(mrcVideoAdViewValidatorFactory, "mrcVideoAdViewValidatorFactory");
        kotlin.jvm.internal.l.f(videoAdVisibilityValidator, "videoAdVisibilityValidator");
        this.f33611a = videoAdPlayer;
        this.f33612b = videoAdVisibilityValidator;
    }
}
