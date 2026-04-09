package i2;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import j2.C2545a;

/* loaded from: classes.dex */
public final class d implements PAGBannerAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f20554a;

    public d(e eVar) {
        this.f20554a = eVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGBannerAd pAGBannerAd) {
        PAGBannerAd pAGBannerAd2 = pAGBannerAd;
        f fVar = this.f20554a.f20559e;
        pAGBannerAd2.setAdInteractionListener(fVar);
        fVar.f20564e.addView(pAGBannerAd2.getBannerView());
        fVar.f20563d = (w2.j) fVar.f20560a.onSuccess(fVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
    public final void onError(int i, String str) {
        C2545a c2545aG = R3.b.g(i, str);
        Log.w(PangleMediationAdapter.TAG, c2545aG.toString());
        this.f20554a.f20559e.f20560a.k(c2545aG);
    }
}
