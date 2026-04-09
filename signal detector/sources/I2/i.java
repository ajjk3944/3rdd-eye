package i2;

import android.net.Uri;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import j2.C2545a;
import w2.q;

/* loaded from: classes.dex */
public final class i implements PAGNativeAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f20571a;

    public i(b bVar) {
        this.f20571a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        k kVar = (k) this.f20571a.f20548e;
        kVar.f20578v = pAGNativeAd2;
        PAGNativeAdData nativeAdData = pAGNativeAd2.getNativeAdData();
        kVar.f23953a = nativeAdData.getTitle();
        kVar.f23955c = nativeAdData.getDescription();
        kVar.f23957e = nativeAdData.getButtonText();
        if (nativeAdData.getIcon() != null) {
            kVar.f23956d = new j(Uri.parse(nativeAdData.getIcon().getImageUrl()));
        }
        kVar.f23967p = true;
        kVar.f23963l = nativeAdData.getMediaView();
        kVar.f23962k = nativeAdData.getAdLogoView();
        kVar.f20577u = (q) kVar.f20573q.onSuccess(kVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
    public final void onError(int i, String str) {
        C2545a c2545aG = R3.b.g(i, str);
        Log.w(PangleMediationAdapter.TAG, c2545aG.toString());
        ((k) this.f20571a.f20548e).f20573q.k(c2545aG);
    }
}
