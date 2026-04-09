package com.google.android.gms.ads.mediation.rtb;

import defpackage.ad0;
import defpackage.aw0;
import defpackage.dd0;
import defpackage.ed0;
import defpackage.f3;
import defpackage.gd0;
import defpackage.id0;
import defpackage.kd0;
import defpackage.kr0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class RtbAdapter extends f3 {
    public abstract void collectSignals(kr0 kr0Var, aw0 aw0Var);

    public void loadRtbAppOpenAd(dd0 dd0Var, ad0 ad0Var) {
        loadAppOpenAd(dd0Var, ad0Var);
    }

    public void loadRtbBannerAd(ed0 ed0Var, ad0 ad0Var) {
        loadBannerAd(ed0Var, ad0Var);
    }

    public void loadRtbInterstitialAd(gd0 gd0Var, ad0 ad0Var) {
        loadInterstitialAd(gd0Var, ad0Var);
    }

    @Deprecated
    public void loadRtbNativeAd(id0 id0Var, ad0 ad0Var) {
        loadNativeAd(id0Var, ad0Var);
    }

    public void loadRtbNativeAdMapper(id0 id0Var, ad0 ad0Var) {
        loadNativeAdMapper(id0Var, ad0Var);
    }

    public void loadRtbRewardedAd(kd0 kd0Var, ad0 ad0Var) {
        loadRewardedAd(kd0Var, ad0Var);
    }

    public void loadRtbRewardedInterstitialAd(kd0 kd0Var, ad0 ad0Var) {
        loadRewardedInterstitialAd(kd0Var, ad0Var);
    }
}
