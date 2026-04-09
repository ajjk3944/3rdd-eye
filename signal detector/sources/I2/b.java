package i2;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import j2.C2545a;
import w2.AbstractC2972d;
import w2.o;
import w2.r;
import w2.u;

/* loaded from: classes.dex */
public final class b implements h2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20546c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2972d f20547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20548e;

    public /* synthetic */ b(Object obj, String str, AbstractC2972d abstractC2972d, String str2, int i) {
        this.f20544a = i;
        this.f20548e = obj;
        this.f20545b = str;
        this.f20547d = abstractC2972d;
        this.f20546c = str2;
    }

    @Override // h2.b
    public final void a() {
        switch (this.f20544a) {
            case 0:
                c cVar = (c) this.f20548e;
                cVar.f20551c.getClass();
                PAGAppOpenRequest pAGAppOpenRequest = new PAGAppOpenRequest();
                String str = this.f20545b;
                pAGAppOpenRequest.setAdString(str);
                T2.g.K(pAGAppOpenRequest, str, (w2.i) this.f20547d);
                h2.f fVar = cVar.f20550b;
                C2378a c2378a = new C2378a(this);
                fVar.getClass();
                PAGAppOpenAd.loadAd(this.f20546c, pAGAppOpenRequest, c2378a);
                break;
            case 1:
                h hVar = (h) this.f20548e;
                hVar.f20568c.getClass();
                PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
                String str2 = this.f20545b;
                pAGInterstitialRequest.setAdString(str2);
                T2.g.K(pAGInterstitialRequest, str2, (o) this.f20547d);
                h2.f fVar2 = hVar.f20567b;
                g gVar = new g(this);
                fVar2.getClass();
                PAGInterstitialAd.loadAd(this.f20546c, pAGInterstitialRequest, gVar);
                break;
            case 2:
                k kVar = (k) this.f20548e;
                kVar.f20576t.getClass();
                PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
                String str3 = this.f20545b;
                pAGNativeRequest.setAdString(str3);
                T2.g.K(pAGNativeRequest, str3, (r) this.f20547d);
                h2.f fVar3 = kVar.f20575s;
                i iVar = new i(this);
                fVar3.getClass();
                PAGNativeAd.loadAd(this.f20546c, pAGNativeRequest, iVar);
                break;
            default:
                m mVar = (m) this.f20548e;
                mVar.f20582c.getClass();
                PAGRewardedRequest pAGRewardedRequest = new PAGRewardedRequest();
                String str4 = this.f20545b;
                pAGRewardedRequest.setAdString(str4);
                T2.g.K(pAGRewardedRequest, str4, (u) this.f20547d);
                h2.f fVar4 = mVar.f20581b;
                l lVar = new l(this);
                fVar4.getClass();
                PAGRewardedAd.loadAd(this.f20546c, pAGRewardedRequest, lVar);
                break;
        }
    }

    @Override // h2.b
    public final void b(C2545a c2545a) {
        switch (this.f20544a) {
            case 0:
                Log.w(PangleMediationAdapter.TAG, c2545a.toString());
                ((c) this.f20548e).f20549a.k(c2545a);
                break;
            case 1:
                Log.w(PangleMediationAdapter.TAG, c2545a.toString());
                ((h) this.f20548e).f20566a.k(c2545a);
                break;
            case 2:
                Log.w(PangleMediationAdapter.TAG, c2545a.toString());
                ((k) this.f20548e).f20573q.k(c2545a);
                break;
            default:
                Log.w(PangleMediationAdapter.TAG, c2545a.toString());
                ((m) this.f20548e).f20580a.k(c2545a);
                break;
        }
    }
}
