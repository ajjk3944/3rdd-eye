package aa;

import android.util.Log;
import bb.q;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements PAGInterstitialAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f275a;

    public g(b bVar) {
        this.f275a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
        h hVar = (h) this.f275a.f258e;
        hVar.f279d = (q) hVar.f276a.onSuccess(hVar);
        hVar.f280e = pAGInterstitialAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i4, String str) {
        pa.a aVarM = wb.e.m(i4, str);
        Log.w(PangleMediationAdapter.TAG, aVarM.toString());
        ((h) this.f275a.f258e).f276a.i(aVarM);
    }
}
