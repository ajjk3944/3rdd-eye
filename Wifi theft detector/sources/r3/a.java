package r3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleError;
import com.vungle.ads.m;
import com.vungle.ads.n;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class a implements MediationAppOpenAd, n {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f24141a;

    /* renamed from: b, reason: collision with root package name */
    public final q3.b f24142b;

    /* renamed from: c, reason: collision with root package name */
    public m f24143c;

    /* renamed from: d, reason: collision with root package name */
    public MediationAppOpenAdCallback f24144d;

    /* renamed from: r3.a$a, reason: collision with other inner class name */
    public static final class C0475a implements a.InterfaceC0194a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f24146b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediationAppOpenAdConfiguration f24147c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f24148d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f24149e;

        public C0475a(Bundle bundle, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, Context context, String str) {
            this.f24146b = bundle;
            this.f24147c = mediationAppOpenAdConfiguration;
            this.f24148d = context;
            this.f24149e = str;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void a(AdError error) {
            p.e(error, "error");
            Log.w(VungleMediationAdapter.TAG, error.toString());
            a.this.f24141a.onFailure(error);
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void onInitializeSuccess() {
            AdConfig adConfigA = a.this.f24142b.a();
            if (this.f24146b.containsKey("adOrientation")) {
                adConfigA.setAdOrientation(this.f24146b.getInt("adOrientation", 2));
            }
            a.this.f(adConfigA, this.f24147c);
            a aVar = a.this;
            q3.b bVar = aVar.f24142b;
            Context context = this.f24148d;
            String str = this.f24149e;
            p.b(str);
            aVar.f24143c = bVar.c(context, str, adConfigA);
            m mVar = a.this.f24143c;
            m mVar2 = null;
            if (mVar == null) {
                p.t("appOpenAd");
                mVar = null;
            }
            mVar.setAdListener(a.this);
            m mVar3 = a.this.f24143c;
            if (mVar3 == null) {
                p.t("appOpenAd");
            } else {
                mVar2 = mVar3;
            }
            mVar2.load(a.this.e(this.f24147c));
        }
    }

    public a(MediationAdLoadCallback mediationAdLoadCallback, q3.b vungleFactory) {
        p.e(mediationAdLoadCallback, "mediationAdLoadCallback");
        p.e(vungleFactory, "vungleFactory");
        this.f24141a = mediationAdLoadCallback;
        this.f24142b = vungleFactory;
    }

    public abstract String e(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void f(AdConfig adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public final void g(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        p.e(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        Bundle mediationExtras = mediationAppOpenAdConfiguration.getMediationExtras();
        p.d(mediationExtras, "getMediationExtras(...)");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        p.d(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString("appid");
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f24141a.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (string2 == null || string2.length() == 0) {
            AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f24141a.onFailure(adError2);
        } else {
            Context context = mediationAppOpenAdConfiguration.getContext();
            p.d(context, "getContext(...)");
            com.google.ads.mediation.vungle.a aVarA = com.google.ads.mediation.vungle.a.a();
            p.b(string);
            aVarA.b(string, context, new C0475a(mediationExtras, mediationAppOpenAdConfiguration, context, string2));
        }
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdClicked(BaseAd baseAd) {
        p.e(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f24144d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdClicked();
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdEnd(BaseAd baseAd) {
        p.e(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f24144d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdFailedToLoad(BaseAd baseAd, VungleError adError) {
        p.e(baseAd, "baseAd");
        p.e(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        p.d(adError2, "getAdError(...)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        this.f24141a.onFailure(adError2);
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdFailedToPlay(BaseAd baseAd, VungleError adError) {
        p.e(baseAd, "baseAd");
        p.e(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        p.d(adError2, "getAdError(...)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f24144d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdFailedToShow(adError2);
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdImpression(BaseAd baseAd) {
        p.e(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f24144d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdLeftApplication(BaseAd baseAd) {
        p.e(baseAd, "baseAd");
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdLoaded(BaseAd baseAd) {
        p.e(baseAd, "baseAd");
        this.f24144d = (MediationAppOpenAdCallback) this.f24141a.onSuccess(this);
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdStart(BaseAd baseAd) {
        p.e(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f24144d;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdOpened();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        p.e(context, "context");
        m mVar = this.f24143c;
        m mVar2 = null;
        if (mVar == null) {
            p.t("appOpenAd");
            mVar = null;
        }
        if (mVar.canPlayAd().booleanValue()) {
            m mVar3 = this.f24143c;
            if (mVar3 == null) {
                p.t("appOpenAd");
            } else {
                mVar2 = mVar3;
            }
            mVar2.play(context);
            return;
        }
        AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f24144d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }
}
