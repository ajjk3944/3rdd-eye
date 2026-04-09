package o3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes.dex */
public class b implements MediationBannerAd, PAGBannerAdInteractionListener {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f23590a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f23591b;

    /* renamed from: c, reason: collision with root package name */
    public final n3.c f23592c;

    /* renamed from: d, reason: collision with root package name */
    public final n3.a f23593d;

    /* renamed from: e, reason: collision with root package name */
    public MediationBannerAdCallback f23594e;

    /* renamed from: f, reason: collision with root package name */
    public FrameLayout f23595f;

    public class a implements a.InterfaceC0193a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f23596a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f23597b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f23598c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f23599d;

        /* renamed from: o3.b$a$a, reason: collision with other inner class name */
        public class C0443a implements PAGBannerAdLoadListener {
            public C0443a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGBannerAd pAGBannerAd) {
                pAGBannerAd.setAdInteractionListener(b.this);
                b.this.f23595f.addView(pAGBannerAd.getBannerView());
                b bVar = b.this;
                bVar.f23594e = (MediationBannerAdCallback) bVar.f23590a.onSuccess(b.this);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
            public void onError(int i10, String str) {
                AdError adErrorC = PangleConstants.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                b.this.f23590a.onFailure(adErrorC);
            }
        }

        public a(MediationBannerAdConfiguration mediationBannerAdConfiguration, Context context, String str, String str2) {
            this.f23596a = mediationBannerAdConfiguration;
            this.f23597b = context;
            this.f23598c = str;
            this.f23599d = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            b.this.f23590a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void onInitializeSuccess() {
            PAGBannerSize pAGBannerSizeE = b.e(this.f23597b, this.f23596a.getAdSize());
            if (pAGBannerSizeE == null) {
                AdError adErrorA = PangleConstants.a(102, "Failed to request banner ad from Pangle. Invalid banner size.");
                Log.w(PangleMediationAdapter.TAG, adErrorA.toString());
                b.this.f23590a.onFailure(adErrorA);
            } else {
                b.this.f23595f = new FrameLayout(this.f23597b);
                PAGBannerRequest pAGBannerRequestC = b.this.f23593d.c(pAGBannerSizeE);
                pAGBannerRequestC.setAdString(this.f23598c);
                n3.b.a(pAGBannerRequestC, this.f23598c, this.f23596a);
                b.this.f23592c.f(this.f23599d, pAGBannerRequestC, new C0443a());
            }
        }
    }

    public b(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.a aVar, n3.c cVar, n3.a aVar2) {
        this.f23590a = mediationAdLoadCallback;
        this.f23591b = aVar;
        this.f23592c = cVar;
        this.f23593d = aVar2;
    }

    public static PAGBannerSize e(Context context, AdSize adSize) {
        if (adSize == null) {
            return null;
        }
        int width = adSize.getWidth();
        PAGBannerSize pAGBannerSize = PAGBannerSize.BANNER_W_320_H_50;
        if (width == pAGBannerSize.getWidth() && adSize.getHeight() == pAGBannerSize.getHeight()) {
            return pAGBannerSize;
        }
        int width2 = adSize.getWidth();
        PAGBannerSize pAGBannerSize2 = PAGBannerSize.BANNER_W_300_H_250;
        if (width2 == pAGBannerSize2.getWidth() && adSize.getHeight() == pAGBannerSize2.getHeight()) {
            return pAGBannerSize2;
        }
        int width3 = adSize.getWidth();
        PAGBannerSize pAGBannerSize3 = PAGBannerSize.BANNER_W_728_H_90;
        if (width3 == pAGBannerSize3.getWidth() && adSize.getHeight() == pAGBannerSize3.getHeight()) {
            return pAGBannerSize3;
        }
        PAGBannerSize currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adSize.getWidth());
        return (adSize.getWidth() == currentOrientationAnchoredAdaptiveBannerAdSize.getWidth() && adSize.getHeight() == currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) ? currentOrientationAnchoredAdaptiveBannerAdSize : PAGBannerSize.getInlineAdaptiveBannerAdSize(adSize.getWidth(), adSize.getHeight());
    }

    public void f(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = PangleConstants.a(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f23590a.onFailure(adErrorA);
        } else {
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            Context context = mediationBannerAdConfiguration.getContext();
            this.f23591b.b(context, serverParameters.getString("appid"), new a(mediationBannerAdConfiguration, context, bidResponse, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f23595f;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f23594e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f23594e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }
}
