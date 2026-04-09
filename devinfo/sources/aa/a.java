package aa;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements PAGAppOpenAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f253a;

    public a(b bVar) {
        this.f253a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
        c cVar = (c) this.f253a.f258e;
        cVar.f262d = (bb.i) cVar.f259a.onSuccess(cVar);
        cVar.f263e = pAGAppOpenAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i4, String str) {
        pa.a aVarM = wb.e.m(i4, str);
        Log.w(PangleMediationAdapter.TAG, aVarM.toString());
        ((c) this.f253a.f258e).f259a.i(aVarM);
    }
}
