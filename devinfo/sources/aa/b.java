package aa;

import android.util.Log;
import bb.r;
import bb.u;
import bb.y;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements z9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb.d f257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f258e;

    public /* synthetic */ b(Object obj, String str, bb.d dVar, String str2, int i4) {
        this.f254a = i4;
        this.f258e = obj;
        this.f255b = str;
        this.f257d = dVar;
        this.f256c = str2;
    }

    @Override // z9.b
    public final void a(pa.a aVar) {
        switch (this.f254a) {
            case 0:
                Log.w(PangleMediationAdapter.TAG, aVar.toString());
                ((c) this.f258e).f259a.i(aVar);
                break;
            case 1:
                Log.w(PangleMediationAdapter.TAG, aVar.toString());
                ((h) this.f258e).f276a.i(aVar);
                break;
            case 2:
                Log.w(PangleMediationAdapter.TAG, aVar.toString());
                ((l) this.f258e).f285r.i(aVar);
                break;
            default:
                Log.w(PangleMediationAdapter.TAG, aVar.toString());
                ((n) this.f258e).f292a.i(aVar);
                break;
        }
    }

    @Override // z9.b
    public final void onInitializeSuccess() {
        switch (this.f254a) {
            case 0:
                c cVar = (c) this.f258e;
                cVar.f261c.getClass();
                PAGAppOpenRequest pAGAppOpenRequest = new PAGAppOpenRequest();
                String str = this.f255b;
                pAGAppOpenRequest.setAdString(str);
                wd.b.S(pAGAppOpenRequest, str, (bb.j) this.f257d);
                z9.e eVar = cVar.f260b;
                a aVar = new a(this);
                eVar.getClass();
                PAGAppOpenAd.loadAd(this.f256c, pAGAppOpenRequest, aVar);
                break;
            case 1:
                h hVar = (h) this.f258e;
                hVar.f278c.getClass();
                PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
                String str2 = this.f255b;
                pAGInterstitialRequest.setAdString(str2);
                wd.b.S(pAGInterstitialRequest, str2, (r) this.f257d);
                z9.e eVar2 = hVar.f277b;
                g gVar = new g(this);
                eVar2.getClass();
                PAGInterstitialAd.loadAd(this.f256c, pAGInterstitialRequest, gVar);
                break;
            case 2:
                l lVar = (l) this.f258e;
                lVar.f288u.getClass();
                PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
                String str3 = this.f255b;
                pAGNativeRequest.setAdString(str3);
                wd.b.S(pAGNativeRequest, str3, (u) this.f257d);
                z9.e eVar3 = lVar.f287t;
                i iVar = new i(this);
                eVar3.getClass();
                PAGNativeAd.loadAd(this.f256c, pAGNativeRequest, iVar);
                break;
            default:
                n nVar = (n) this.f258e;
                nVar.f294c.getClass();
                PAGRewardedRequest pAGRewardedRequest = new PAGRewardedRequest();
                String str4 = this.f255b;
                pAGRewardedRequest.setAdString(str4);
                wd.b.S(pAGRewardedRequest, str4, (y) this.f257d);
                z9.e eVar4 = nVar.f293b;
                m mVar = new m(this);
                eVar4.getClass();
                PAGRewardedAd.loadAd(this.f256c, pAGRewardedRequest, mVar);
                break;
        }
    }
}
