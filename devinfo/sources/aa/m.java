package aa;

import android.util.Log;
import bb.x;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m implements PAGRewardedAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f291a;

    public m(b bVar) {
        this.f291a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
        n nVar = (n) this.f291a.f258e;
        nVar.f295d = (x) nVar.f292a.onSuccess(nVar);
        nVar.f296e = pAGRewardedAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i4, String str) {
        pa.a aVarM = wb.e.m(i4, str);
        Log.w(PangleMediationAdapter.TAG, aVarM.toString());
        ((n) this.f291a.f258e).f292a.i(aVarM);
    }
}
