package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.impl.cu;
import com.yandex.mobile.ads.impl.qm2;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.yk2;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class RewardedAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final cu f36936a;

    /* renamed from: b, reason: collision with root package name */
    private final yk2 f36937b;

    public RewardedAdLoader(Context context) {
        l.f(context, "context");
        this.f36936a = new cu(context, new rm2(context));
        this.f36937b = new yk2();
    }

    public final void cancelLoading() {
        this.f36936a.a();
    }

    public final void loadAd(AdRequestConfiguration adRequestConfiguration) {
        l.f(adRequestConfiguration, "adRequestConfiguration");
        this.f36936a.a(this.f36937b.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(RewardedAdLoadListener rewardedAdLoadListener) {
        this.f36936a.a(rewardedAdLoadListener != null ? new qm2(rewardedAdLoadListener) : null);
    }
}
