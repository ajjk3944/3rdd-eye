package W7;

import A9.C0583j;
import P7.t;
import android.app.Activity;
import androidx.work.s;
import b9.C1992A;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import kotlin.jvm.internal.l;

/* compiled from: ApplovinInterstitialProvider.kt */
/* loaded from: classes3.dex */
public final class a implements MaxAdListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0583j f13346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U7.c f13347c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f13348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f13349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaxInterstitialAd f13350f;

    public a(C0583j c0583j, U7.c cVar, Activity activity, d dVar, MaxInterstitialAd maxInterstitialAd) {
        this.f13346b = c0583j;
        this.f13347c = cVar;
        this.f13348d = activity;
        this.f13349e = dVar;
        this.f13350f = maxInterstitialAd;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd ad) {
        l.f(ad, "ad");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd ad, MaxError error) {
        l.f(ad, "ad");
        l.f(error, "error");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd ad) {
        l.f(ad, "ad");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd ad) {
        l.f(ad, "ad");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String adUnit, MaxError error) {
        l.f(adUnit, "adUnit");
        l.f(error, "error");
        C0583j c0583j = this.f13346b;
        boolean zIsActive = c0583j.isActive();
        Activity activity = this.f13348d;
        U7.c cVar = this.f13347c;
        if (!zIsActive) {
            va.a.f47104a.a("[InterstitialManager] onAdFailedToLoad. Job not active. Return", new Object[0]);
            cVar.b(activity, new t.h("Loading scope isn't active"));
        } else {
            va.a.f47104a.c(s.d("[InterstitialManager] Applovin interstitial loading failed. Error - ", error.getMessage()), new Object[0]);
            this.f13349e.d(null);
            cVar.b(activity, new t.h(error.getMessage()));
            c0583j.resumeWith(C1992A.f18074a);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd ad) {
        l.f(ad, "ad");
        C0583j c0583j = this.f13346b;
        boolean zIsActive = c0583j.isActive();
        U7.c cVar = this.f13347c;
        if (!zIsActive) {
            va.a.f47104a.l("[InterstitialManager] onAdLoaded. Job not active. Return", new Object[0]);
            cVar.b(this.f13348d, new t.h("Loading scope isn't active"));
        } else {
            va.a.f47104a.a(s.d("[InterstitialManager] Applovin interstitial loaded. AdUnitId=", ad.getAdUnitId()), new Object[0]);
            this.f13349e.d(this.f13350f);
            cVar.c();
            c0583j.resumeWith(C1992A.f18074a);
        }
    }
}
