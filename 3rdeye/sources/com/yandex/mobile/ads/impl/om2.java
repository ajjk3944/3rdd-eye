package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;

/* loaded from: classes3.dex */
public final class om2 implements RewardedAd {

    /* renamed from: a, reason: collision with root package name */
    private final zt f31441a;

    /* renamed from: b, reason: collision with root package name */
    private final wk2 f31442b;

    public om2(zt coreRewardedAd, wk2 adInfoConverter) {
        kotlin.jvm.internal.l.f(coreRewardedAd, "coreRewardedAd");
        kotlin.jvm.internal.l.f(adInfoConverter, "adInfoConverter");
        this.f31441a = coreRewardedAd;
        this.f31442b = adInfoConverter;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof om2) && kotlin.jvm.internal.l.b(((om2) obj).f31441a, this.f31441a);
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final AdInfo getInfo() {
        wk2 wk2Var = this.f31442b;
        ms info = this.f31441a.getInfo();
        wk2Var.getClass();
        return wk2.a(info);
    }

    public final int hashCode() {
        return this.f31441a.hashCode();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void setAdEventListener(RewardedAdEventListener rewardedAdEventListener) {
        this.f31441a.a(new pm2(rewardedAdEventListener));
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void show(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        this.f31441a.show(activity);
    }
}
