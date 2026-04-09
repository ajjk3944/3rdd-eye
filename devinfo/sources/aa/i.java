package aa;

import android.net.Uri;
import android.util.Log;
import bb.t;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements PAGNativeAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f281a;

    public i(b bVar) {
        this.f281a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        l lVar = (l) this.f281a.f258e;
        lVar.f290w = pAGNativeAd2;
        PAGNativeAdData nativeAdData = pAGNativeAd2.getNativeAdData();
        lVar.f2094a = nativeAdData.getTitle();
        lVar.f2096c = nativeAdData.getDescription();
        lVar.f2098e = nativeAdData.getButtonText();
        if (nativeAdData.getIcon() != null) {
            lVar.f2097d = new k(Uri.parse(nativeAdData.getIcon().getImageUrl()));
        }
        lVar.f2108q = true;
        lVar.f2104m = nativeAdData.getMediaView();
        lVar.f2103l = nativeAdData.getAdLogoView();
        lVar.f289v = (t) lVar.f285r.onSuccess(lVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i4, String str) {
        pa.a aVarM = wb.e.m(i4, str);
        Log.w(PangleMediationAdapter.TAG, aVarM.toString());
        ((l) this.f281a.f258e).f285r.i(aVarM);
    }
}
