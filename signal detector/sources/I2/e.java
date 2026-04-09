package i2;

import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import j2.C2545a;
import j2.C2552h;

/* loaded from: classes.dex */
public final class e implements h2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.k f20555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f20556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20557c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f20559e;

    public e(f fVar, w2.k kVar, Context context, String str, String str2) {
        this.f20559e = fVar;
        this.f20555a = kVar;
        this.f20556b = context;
        this.f20557c = str;
        this.f20558d = str2;
    }

    @Override // h2.b
    public final void a() {
        w2.k kVar = this.f20555a;
        C2552h c2552h = kVar.f23951e;
        int i = c2552h.f21341b;
        int i3 = c2552h.f21340a;
        PAGBannerSize currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.BANNER_W_320_H_50;
        int width = currentOrientationAnchoredAdaptiveBannerAdSize.getWidth();
        Context context = this.f20556b;
        if (i3 != width || i != currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) {
            currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.BANNER_W_300_H_250;
            if (i3 != currentOrientationAnchoredAdaptiveBannerAdSize.getWidth() || i != currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) {
                currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.BANNER_W_728_H_90;
                if (i3 != currentOrientationAnchoredAdaptiveBannerAdSize.getWidth() || i != currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) {
                    currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i3);
                    if (i3 != currentOrientationAnchoredAdaptiveBannerAdSize.getWidth() || i != currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) {
                        currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.getInlineAdaptiveBannerAdSize(i3, i);
                    }
                }
            }
        }
        f fVar = this.f20559e;
        if (currentOrientationAnchoredAdaptiveBannerAdSize == null) {
            C2545a c2545aE = R3.b.e(102, "Failed to request banner ad from Pangle. Invalid banner size.");
            Log.w(PangleMediationAdapter.TAG, c2545aE.toString());
            fVar.f20560a.k(c2545aE);
            return;
        }
        fVar.f20564e = new FrameLayout(context);
        fVar.f20562c.getClass();
        PAGBannerRequest pAGBannerRequest = new PAGBannerRequest(currentOrientationAnchoredAdaptiveBannerAdSize);
        String str = this.f20557c;
        pAGBannerRequest.setAdString(str);
        T2.g.K(pAGBannerRequest, str, kVar);
        h2.f fVar2 = fVar.f20561b;
        d dVar = new d(this);
        fVar2.getClass();
        PAGBannerAd.loadAd(this.f20558d, pAGBannerRequest, dVar);
    }

    @Override // h2.b
    public final void b(C2545a c2545a) {
        Log.w(PangleMediationAdapter.TAG, c2545a.toString());
        this.f20559e.f20560a.k(c2545a);
    }
}
