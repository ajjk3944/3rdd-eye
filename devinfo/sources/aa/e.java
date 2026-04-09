package aa;

import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.pangle.PangleMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements z9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb.m f265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f269e;

    public e(f fVar, bb.m mVar, Context context, String str, String str2) {
        this.f269e = fVar;
        this.f265a = mVar;
        this.f266b = context;
        this.f267c = str;
        this.f268d = str2;
    }

    @Override // z9.b
    public final void a(pa.a aVar) {
        Log.w(PangleMediationAdapter.TAG, aVar.toString());
        this.f269e.f270a.i(aVar);
    }

    @Override // z9.b
    public final void onInitializeSuccess() {
        bb.m mVar = this.f265a;
        pa.h hVar = mVar.g;
        int i4 = hVar.f31531b;
        int i10 = hVar.f31530a;
        PAGBannerSize currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.BANNER_W_320_H_50;
        int width = currentOrientationAnchoredAdaptiveBannerAdSize.getWidth();
        Context context = this.f266b;
        if (i10 != width || i4 != currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) {
            currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.BANNER_W_300_H_250;
            if (i10 != currentOrientationAnchoredAdaptiveBannerAdSize.getWidth() || i4 != currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) {
                currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.BANNER_W_728_H_90;
                if (i10 != currentOrientationAnchoredAdaptiveBannerAdSize.getWidth() || i4 != currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) {
                    currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i10);
                    if (i10 != currentOrientationAnchoredAdaptiveBannerAdSize.getWidth() || i4 != currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) {
                        currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.getInlineAdaptiveBannerAdSize(i10, i4);
                    }
                }
            }
        }
        f fVar = this.f269e;
        if (currentOrientationAnchoredAdaptiveBannerAdSize == null) {
            pa.a aVarJ = wb.e.j(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, "Failed to request banner ad from Pangle. Invalid banner size.");
            Log.w(PangleMediationAdapter.TAG, aVarJ.toString());
            fVar.f270a.i(aVarJ);
            return;
        }
        fVar.f274e = new FrameLayout(context);
        fVar.f272c.getClass();
        PAGBannerRequest pAGBannerRequest = new PAGBannerRequest(currentOrientationAnchoredAdaptiveBannerAdSize);
        String str = this.f267c;
        pAGBannerRequest.setAdString(str);
        wd.b.S(pAGBannerRequest, str, mVar);
        z9.e eVar = fVar.f271b;
        d dVar = new d(this);
        eVar.getClass();
        PAGBannerAd.loadAd(this.f268d, pAGBannerRequest, dVar);
    }
}
