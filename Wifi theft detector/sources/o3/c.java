package o3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* loaded from: classes.dex */
public class c implements MediationInterstitialAd {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f23602a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f23603b;

    /* renamed from: c, reason: collision with root package name */
    public final n3.c f23604c;

    /* renamed from: d, reason: collision with root package name */
    public final n3.a f23605d;

    /* renamed from: e, reason: collision with root package name */
    public MediationInterstitialAdCallback f23606e;

    /* renamed from: f, reason: collision with root package name */
    public PAGInterstitialAd f23607f;

    public class a implements a.InterfaceC0193a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23608a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationInterstitialAdConfiguration f23609b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f23610c;

        /* renamed from: o3.c$a$a, reason: collision with other inner class name */
        public class C0444a implements PAGInterstitialAdLoadListener {
            public C0444a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
                c cVar = c.this;
                cVar.f23606e = (MediationInterstitialAdCallback) cVar.f23602a.onSuccess(c.this);
                c.this.f23607f = pAGInterstitialAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
            public void onError(int i10, String str) {
                AdError adErrorC = PangleConstants.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                c.this.f23602a.onFailure(adErrorC);
            }
        }

        public a(String str, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, String str2) {
            this.f23608a = str;
            this.f23609b = mediationInterstitialAdConfiguration;
            this.f23610c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            c.this.f23602a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void onInitializeSuccess() {
            PAGInterstitialRequest pAGInterstitialRequestD = c.this.f23605d.d();
            pAGInterstitialRequestD.setAdString(this.f23608a);
            n3.b.a(pAGInterstitialRequestD, this.f23608a, this.f23609b);
            c.this.f23604c.g(this.f23610c, pAGInterstitialRequestD, new C0444a());
        }
    }

    public class b implements PAGInterstitialAdInteractionListener {
        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (c.this.f23606e != null) {
                c.this.f23606e.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (c.this.f23606e != null) {
                c.this.f23606e.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (c.this.f23606e != null) {
                c.this.f23606e.onAdOpened();
                c.this.f23606e.reportAdImpression();
            }
        }
    }

    public c(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.a aVar, n3.c cVar, n3.a aVar2) {
        this.f23602a = mediationAdLoadCallback;
        this.f23603b = aVar;
        this.f23604c = cVar;
        this.f23605d = aVar2;
    }

    public void g(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = PangleConstants.a(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f23602a.onFailure(adErrorA);
        } else {
            String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
            this.f23603b.b(mediationInterstitialAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationInterstitialAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f23607f.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f23607f.show((Activity) context);
        } else {
            this.f23607f.show(null);
        }
    }
}
