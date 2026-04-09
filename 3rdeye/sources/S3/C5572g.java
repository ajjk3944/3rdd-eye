package s3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.ads.AbstractC4059q;
import com.vungle.ads.C4045c;
import com.vungle.ads.Z;
import com.vungle.ads.b0;
import com.vungle.ads.k0;
import kotlin.jvm.internal.l;
import q3.C5490a;

/* compiled from: VungleRtbRewardedAd.java */
/* renamed from: s3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5572g implements MediationRewardedAd, b0 {

    /* renamed from: b, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f46052b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f46053c;

    /* renamed from: d, reason: collision with root package name */
    public MediationRewardedAdCallback f46054d;

    /* renamed from: e, reason: collision with root package name */
    public Z f46055e;

    /* renamed from: f, reason: collision with root package name */
    public final C5490a f46056f;

    /* compiled from: VungleRtbRewardedAd.java */
    /* renamed from: s3.g$a */
    public class a implements a.InterfaceC0332a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f46057a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f46058b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4045c f46059c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f46060d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f46061e;

        public a(Context context, String str, C4045c c4045c, String str2, String str3) {
            this.f46057a = context;
            this.f46058b = str;
            this.f46059c = c4045c;
            this.f46060d = str2;
            this.f46061e = str3;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            C5572g.this.f46053c.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void onInitializeSuccess() {
            C5572g c5572g = C5572g.this;
            C5490a c5490a = c5572g.f46056f;
            C4045c c4045c = this.f46059c;
            c5490a.getClass();
            Context context = this.f46057a;
            l.f(context, "context");
            String placementId = this.f46058b;
            l.f(placementId, "placementId");
            Z z10 = new Z(context, placementId, c4045c);
            c5572g.f46055e = z10;
            z10.setAdListener(c5572g);
            String str = this.f46060d;
            if (!TextUtils.isEmpty(str)) {
                c5572g.f46055e.setUserId(str);
            }
            c5572g.f46055e.load(this.f46061e);
        }
    }

    public C5572g(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, C5490a c5490a) {
        this.f46052b = mediationRewardedAdConfiguration;
        this.f46053c = mediationAdLoadCallback;
        this.f46056f = c5490a;
    }

    public final void a() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f46052b;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = mediationExtras.getString("userId");
        String string2 = serverParameters.getString("appid");
        boolean zIsEmpty = TextUtils.isEmpty(string2);
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f46053c;
        if (zIsEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string3 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string3)) {
            AdError adError2 = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        this.f46056f.getClass();
        C4045c c4045c = new C4045c();
        if (mediationExtras.containsKey("adOrientation")) {
            c4045c.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            c4045c.setWatermark(watermark);
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        com.google.ads.mediation.vungle.a.f22436c.a(string2, context, new a(context, string3, c4045c, string, bidResponse));
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdClicked(AbstractC4059q abstractC4059q) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46054d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdEnd(AbstractC4059q abstractC4059q) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46054d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdFailedToLoad(AbstractC4059q abstractC4059q, k0 k0Var) {
        AdError adError = VungleMediationAdapter.getAdError(k0Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f46053c.onFailure(adError);
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdFailedToPlay(AbstractC4059q abstractC4059q, k0 k0Var) {
        AdError adError = VungleMediationAdapter.getAdError(k0Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46054d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdImpression(AbstractC4059q abstractC4059q) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46054d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.f46054d.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdLoaded(AbstractC4059q abstractC4059q) {
        this.f46054d = this.f46053c.onSuccess(this);
    }

    @Override // com.vungle.ads.b0
    public final void onAdRewarded(AbstractC4059q abstractC4059q) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46054d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.f46054d.onUserEarnedReward(new VungleMediationAdapter.c());
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdStart(AbstractC4059q abstractC4059q) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f46054d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) throws Throwable {
        Z z10 = this.f46055e;
        if (z10 != null) {
            z10.play(context);
        } else if (this.f46054d != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f46054d.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdLeftApplication(AbstractC4059q abstractC4059q) {
    }
}
