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
import com.vungle.ads.AbstractC4059q;
import com.vungle.ads.C4045c;
import com.vungle.ads.D;
import com.vungle.ads.F;
import com.vungle.ads.k0;
import kotlin.jvm.internal.l;
import q3.C5490a;

/* compiled from: VungleAppOpenAd.kt */
/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5521a implements MediationAppOpenAd, F {

    /* renamed from: b, reason: collision with root package name */
    public final MediationAppOpenAdConfiguration f45676b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> f45677c;

    /* renamed from: d, reason: collision with root package name */
    public final C5490a f45678d;

    /* renamed from: e, reason: collision with root package name */
    public D f45679e;

    /* renamed from: f, reason: collision with root package name */
    public MediationAppOpenAdCallback f45680f;

    /* compiled from: VungleAppOpenAd.kt */
    /* renamed from: r3.a$a, reason: collision with other inner class name */
    public static final class C0522a implements a.InterfaceC0332a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f45682b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f45683c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f45684d;

        public C0522a(Bundle bundle, Context context, String str) {
            this.f45682b = bundle;
            this.f45683c = context;
            this.f45684d = str;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void a(AdError error) {
            l.f(error, "error");
            Log.w(VungleMediationAdapter.TAG, error.toString());
            AbstractC5521a.this.f45677c.onFailure(error);
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void onInitializeSuccess() {
            AbstractC5521a abstractC5521a = AbstractC5521a.this;
            abstractC5521a.f45678d.getClass();
            C4045c c4045c = new C4045c();
            Bundle bundle = this.f45682b;
            if (bundle.containsKey("adOrientation")) {
                c4045c.setAdOrientation(bundle.getInt("adOrientation", 2));
            }
            MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = abstractC5521a.f45676b;
            abstractC5521a.b(c4045c, mediationAppOpenAdConfiguration);
            String str = this.f45684d;
            l.c(str);
            Context context = this.f45683c;
            abstractC5521a.f45678d.getClass();
            D d10 = new D(context, str, c4045c);
            abstractC5521a.f45679e = d10;
            d10.setAdListener(abstractC5521a);
            D d11 = abstractC5521a.f45679e;
            if (d11 != null) {
                d11.load(abstractC5521a.a(mediationAppOpenAdConfiguration));
            } else {
                l.l("appOpenAd");
                throw null;
            }
        }
    }

    public AbstractC5521a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, C5490a vungleFactory) {
        l.f(vungleFactory, "vungleFactory");
        this.f45676b = mediationAppOpenAdConfiguration;
        this.f45677c = mediationAdLoadCallback;
        this.f45678d = vungleFactory;
    }

    public abstract String a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void b(C4045c c4045c, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public final void c() {
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = this.f45676b;
        Bundle mediationExtras = mediationAppOpenAdConfiguration.getMediationExtras();
        l.e(mediationExtras, "mediationAppOpenAdConfiguration.mediationExtras");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        l.e(serverParameters, "mediationAppOpenAdConfiguration.serverParameters");
        String string = serverParameters.getString("appid");
        MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback = this.f45677c;
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (string2 == null || string2.length() == 0) {
            AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            Context context = mediationAppOpenAdConfiguration.getContext();
            l.e(context, "mediationAppOpenAdConfiguration.context");
            com.google.ads.mediation.vungle.a.f22436c.a(string, context, new C0522a(mediationExtras, context, string2));
        }
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdClicked(AbstractC4059q baseAd) {
        l.f(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f45680f;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdClicked();
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdEnd(AbstractC4059q baseAd) {
        l.f(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f45680f;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdFailedToLoad(AbstractC4059q baseAd, k0 adError) {
        l.f(baseAd, "baseAd");
        l.f(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        l.e(adError2, "getAdError(adError)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        this.f45677c.onFailure(adError2);
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdFailedToPlay(AbstractC4059q baseAd, k0 adError) {
        l.f(baseAd, "baseAd");
        l.f(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        l.e(adError2, "getAdError(adError)");
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f45680f;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdFailedToShow(adError2);
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdImpression(AbstractC4059q baseAd) {
        l.f(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f45680f;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdLeftApplication(AbstractC4059q baseAd) {
        l.f(baseAd, "baseAd");
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdLoaded(AbstractC4059q baseAd) {
        l.f(baseAd, "baseAd");
        this.f45680f = this.f45677c.onSuccess(this);
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdStart(AbstractC4059q baseAd) {
        l.f(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f45680f;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdOpened();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) throws Throwable {
        l.f(context, "context");
        D d10 = this.f45679e;
        if (d10 == null) {
            l.l("appOpenAd");
            throw null;
        }
        if (d10.canPlayAd().booleanValue()) {
            D d11 = this.f45679e;
            if (d11 != null) {
                d11.play(context);
                return;
            } else {
                l.l("appOpenAd");
                throw null;
            }
        }
        AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f45680f;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }
}
