package i2;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import j2.C2545a;
import w2.t;

/* loaded from: classes.dex */
public final class l implements PAGRewardedAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f20579a;

    public l(b bVar) {
        this.f20579a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
        m mVar = (m) this.f20579a.f20548e;
        mVar.f20583d = (t) mVar.f20580a.onSuccess(mVar);
        mVar.f20584e = pAGRewardedAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
    public final void onError(int i, String str) {
        C2545a c2545aG = R3.b.g(i, str);
        Log.w(PangleMediationAdapter.TAG, c2545aG.toString());
        ((m) this.f20579a.f20548e).f20580a.k(c2545aG);
    }
}
