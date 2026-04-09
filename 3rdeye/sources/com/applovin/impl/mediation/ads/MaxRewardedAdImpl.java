package com.applovin.impl.mediation.ads;

import N7.C1094a9;
import android.content.Context;
import com.applovin.impl.l2;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t2;
import com.applovin.impl.y1;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* loaded from: classes.dex */
public class MaxRewardedAdImpl extends MaxFullscreenAdImpl {

    public class b extends MaxFullscreenAdImpl.b implements MaxRewardedAdListener {
        private b() {
            super();
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            t2 t2Var = (t2) maxAd;
            if (!t2Var.m0().get()) {
                o oVar = MaxRewardedAdImpl.this.logger;
                if (o.a()) {
                    MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                    maxRewardedAdImpl.logger.a(maxRewardedAdImpl.tag, "User not rewarded for ad: " + maxAd);
                }
                MaxRewardedAdImpl.this.sdk.P().a(y1.f21797h0, t2Var);
            }
            super.onAdHidden(maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            o oVar = MaxRewardedAdImpl.this.logger;
            if (o.a()) {
                MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                o oVar2 = maxRewardedAdImpl.logger;
                String str = maxRewardedAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxRewardedAdListener.onUserRewarded(ad=");
                sb.append(maxAd);
                sb.append(", reward=");
                sb.append(maxReward);
                sb.append("), listener=");
                C1094a9.l(sb, MaxRewardedAdImpl.this.adListener, oVar2, str);
            }
            l2.a(MaxRewardedAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    public MaxRewardedAdImpl(String str, MaxAdFormat maxAdFormat, MaxFullscreenAdImpl.a aVar, String str2, k kVar, Context context) {
        super(str, maxAdFormat, aVar, str2, kVar, context);
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl
    public MaxFullscreenAdImpl.b createAdListenerWrapper() {
        return new b();
    }
}
