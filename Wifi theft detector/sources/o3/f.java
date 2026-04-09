package o3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* loaded from: classes.dex */
public class f implements MediationRewardedAd {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f23631a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f23632b;

    /* renamed from: c, reason: collision with root package name */
    public final n3.c f23633c;

    /* renamed from: d, reason: collision with root package name */
    public final n3.a f23634d;

    /* renamed from: e, reason: collision with root package name */
    public MediationRewardedAdCallback f23635e;

    /* renamed from: f, reason: collision with root package name */
    public PAGRewardedAd f23636f;

    public class a implements a.InterfaceC0193a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23637a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationRewardedAdConfiguration f23638b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f23639c;

        /* renamed from: o3.f$a$a, reason: collision with other inner class name */
        public class C0447a implements PAGRewardedAdLoadListener {
            public C0447a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
                f fVar = f.this;
                fVar.f23635e = (MediationRewardedAdCallback) fVar.f23631a.onSuccess(f.this);
                f.this.f23636f = pAGRewardedAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
            public void onError(int i10, String str) {
                AdError adErrorC = PangleConstants.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                f.this.f23631a.onFailure(adErrorC);
            }
        }

        public a(String str, MediationRewardedAdConfiguration mediationRewardedAdConfiguration, String str2) {
            this.f23637a = str;
            this.f23638b = mediationRewardedAdConfiguration;
            this.f23639c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            f.this.f23631a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void onInitializeSuccess() {
            PAGRewardedRequest pAGRewardedRequestF = f.this.f23634d.f();
            pAGRewardedRequestF.setAdString(this.f23637a);
            n3.b.a(pAGRewardedRequestF, this.f23637a, this.f23638b);
            f.this.f23633c.i(this.f23639c, pAGRewardedRequestF, new C0447a());
        }
    }

    public class b implements PAGRewardedAdInteractionListener {
        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (f.this.f23635e != null) {
                f.this.f23635e.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (f.this.f23635e != null) {
                f.this.f23635e.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (f.this.f23635e != null) {
                f.this.f23635e.onAdOpened();
                f.this.f23635e.reportAdImpression();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
            if (f.this.f23635e != null) {
                f.this.f23635e.onUserEarnedReward();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedRewardFail(int i10, String str) {
            Log.d(PangleMediationAdapter.TAG, PangleConstants.c(i10, String.format("Failed to reward user: %s", str)).toString());
        }
    }

    public f(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.a aVar, n3.c cVar, n3.a aVar2) {
        this.f23631a = mediationAdLoadCallback;
        this.f23632b = aVar;
        this.f23633c = cVar;
        this.f23634d = aVar2;
    }

    public void g(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = PangleConstants.a(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f23631a.onFailure(adErrorA);
        } else {
            String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
            this.f23632b.b(mediationRewardedAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationRewardedAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f23636f.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f23636f.show((Activity) context);
        } else {
            this.f23636f.show(null);
        }
    }
}
