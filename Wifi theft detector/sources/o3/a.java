package o3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;

/* loaded from: classes.dex */
public class a implements MediationAppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f23578a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f23579b;

    /* renamed from: c, reason: collision with root package name */
    public final n3.c f23580c;

    /* renamed from: d, reason: collision with root package name */
    public final n3.a f23581d;

    /* renamed from: e, reason: collision with root package name */
    public MediationAppOpenAdCallback f23582e;

    /* renamed from: f, reason: collision with root package name */
    public PAGAppOpenAd f23583f;

    /* renamed from: o3.a$a, reason: collision with other inner class name */
    public class C0441a implements a.InterfaceC0193a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23584a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationAppOpenAdConfiguration f23585b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f23586c;

        /* renamed from: o3.a$a$a, reason: collision with other inner class name */
        public class C0442a implements PAGAppOpenAdLoadListener {
            public C0442a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
                a aVar = a.this;
                aVar.f23582e = (MediationAppOpenAdCallback) aVar.f23578a.onSuccess(a.this);
                a.this.f23583f = pAGAppOpenAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
            public void onError(int i10, String str) {
                AdError adErrorC = PangleConstants.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                a.this.f23578a.onFailure(adErrorC);
            }
        }

        public C0441a(String str, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, String str2) {
            this.f23584a = str;
            this.f23585b = mediationAppOpenAdConfiguration;
            this.f23586c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            a.this.f23578a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void onInitializeSuccess() {
            PAGAppOpenRequest pAGAppOpenRequestB = a.this.f23581d.b();
            pAGAppOpenRequestB.setAdString(this.f23584a);
            n3.b.a(pAGAppOpenRequestB, this.f23584a, this.f23585b);
            a.this.f23580c.e(this.f23586c, pAGAppOpenRequestB, new C0442a());
        }
    }

    public class b implements PAGAppOpenAdInteractionListener {
        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (a.this.f23582e != null) {
                a.this.f23582e.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (a.this.f23582e != null) {
                a.this.f23582e.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (a.this.f23582e != null) {
                a.this.f23582e.onAdOpened();
                a.this.f23582e.reportAdImpression();
            }
        }
    }

    public a(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.a aVar, n3.c cVar, n3.a aVar2) {
        this.f23578a = mediationAdLoadCallback;
        this.f23579b = aVar;
        this.f23580c = cVar;
        this.f23581d = aVar2;
    }

    public void g(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = PangleConstants.a(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f23578a.onFailure(adErrorA);
        } else {
            String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
            this.f23579b.b(mediationAppOpenAdConfiguration.getContext(), serverParameters.getString("appid"), new C0441a(bidResponse, mediationAppOpenAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        this.f23583f.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f23583f.show((Activity) context);
        } else {
            this.f23583f.show(null);
        }
    }
}
