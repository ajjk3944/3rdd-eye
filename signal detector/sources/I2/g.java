package i2;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import j2.C2545a;
import w2.n;

/* loaded from: classes.dex */
public final class g implements PAGInterstitialAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f20565a;

    public g(b bVar) {
        this.f20565a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
        h hVar = (h) this.f20565a.f20548e;
        hVar.f20569d = (n) hVar.f20566a.onSuccess(hVar);
        hVar.f20570e = pAGInterstitialAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
    public final void onError(int i, String str) {
        C2545a c2545aG = R3.b.g(i, str);
        Log.w(PangleMediationAdapter.TAG, c2545aG.toString());
        ((h) this.f20565a.f20548e).f20566a.k(c2545aG);
    }
}
