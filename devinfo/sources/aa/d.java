package aa;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements PAGBannerAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f264a;

    public d(e eVar) {
        this.f264a = eVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGBannerAd pAGBannerAd) {
        PAGBannerAd pAGBannerAd2 = pAGBannerAd;
        f fVar = this.f264a.f269e;
        pAGBannerAd2.setAdInteractionListener(fVar);
        fVar.f274e.addView(pAGBannerAd2.getBannerView());
        fVar.f273d = (bb.l) fVar.f270a.onSuccess(fVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i4, String str) {
        pa.a aVarM = wb.e.m(i4, str);
        Log.w(PangleMediationAdapter.TAG, aVarM.toString());
        this.f264a.f269e.f270a.i(aVarM);
    }
}
