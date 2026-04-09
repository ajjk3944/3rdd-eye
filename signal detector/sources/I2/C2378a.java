package i2;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import j2.C2545a;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2378a implements PAGAppOpenAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f20543a;

    public C2378a(b bVar) {
        this.f20543a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
        c cVar = (c) this.f20543a.f20548e;
        cVar.f20552d = (w2.h) cVar.f20549a.onSuccess(cVar);
        cVar.f20553e = pAGAppOpenAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
    public final void onError(int i, String str) {
        C2545a c2545aG = R3.b.g(i, str);
        Log.w(PangleMediationAdapter.TAG, c2545aG.toString());
        ((c) this.f20543a.f20548e).f20549a.k(c2545aG);
    }
}
