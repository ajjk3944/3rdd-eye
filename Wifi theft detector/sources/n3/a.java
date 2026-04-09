package n3;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import o3.d;
import o3.f;

/* loaded from: classes.dex */
public class a {
    public PAGConfig.Builder a() {
        return new PAGConfig.Builder();
    }

    public PAGAppOpenRequest b() {
        return new PAGAppOpenRequest();
    }

    public PAGBannerRequest c(PAGBannerSize pAGBannerSize) {
        return new PAGBannerRequest(pAGBannerSize);
    }

    public PAGInterstitialRequest d() {
        return new PAGInterstitialRequest();
    }

    public PAGNativeRequest e() {
        return new PAGNativeRequest();
    }

    public PAGRewardedRequest f() {
        return new PAGRewardedRequest();
    }

    public o3.a g(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.a aVar, c cVar) {
        return new o3.a(mediationAdLoadCallback, aVar, cVar, this);
    }

    public o3.b h(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.a aVar, c cVar) {
        return new o3.b(mediationAdLoadCallback, aVar, cVar, this);
    }

    public o3.c i(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.a aVar, c cVar) {
        return new o3.c(mediationAdLoadCallback, aVar, cVar, this);
    }

    public d j(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.a aVar, c cVar) {
        return new d(mediationAdLoadCallback, aVar, cVar, this);
    }

    public f k(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.a aVar, c cVar) {
        return new f(mediationAdLoadCallback, aVar, cVar, this);
    }
}
