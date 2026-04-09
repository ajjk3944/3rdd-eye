package V7;

import A9.C0583j;
import P7.t;
import android.app.Activity;
import androidx.work.s;
import b9.C1992A;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import kotlin.jvm.internal.l;

/* compiled from: AdMobInterstitialProvider.kt */
/* loaded from: classes3.dex */
public final class b extends InterstitialAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0583j f13038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U7.c f13039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f13040c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f13041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f13042e;

    public b(C0583j c0583j, U7.c cVar, Activity activity, e eVar, String str) {
        this.f13038a = c0583j;
        this.f13039b = cVar;
        this.f13040c = activity;
        this.f13041d = eVar;
        this.f13042e = str;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError error) {
        l.f(error, "error");
        C0583j c0583j = this.f13038a;
        boolean zIsActive = c0583j.isActive();
        Activity activity = this.f13040c;
        U7.c cVar = this.f13039b;
        if (!zIsActive) {
            va.a.f47104a.a("[InterstitialManager] onAdFailedToLoad. Job not active. Return", new Object[0]);
            cVar.b(activity, new t.h("Loading scope isn't active"));
        } else {
            va.a.f47104a.c(s.d("[InterstitialManager] AdMob interstitial loading failed. Error - ", error.getMessage()), new Object[0]);
            this.f13041d.d(null);
            cVar.b(activity, new t.h(error.getMessage()));
            c0583j.resumeWith(C1992A.f18074a);
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd ad = interstitialAd;
        l.f(ad, "ad");
        C0583j c0583j = this.f13038a;
        boolean zIsActive = c0583j.isActive();
        U7.c cVar = this.f13039b;
        if (!zIsActive) {
            va.a.f47104a.l("[InterstitialManager] onAdLoaded. Job not active. Return", new Object[0]);
            cVar.b(this.f13040c, new t.h("Loading scope isn't active"));
        } else {
            va.a.f47104a.a(s.d("[InterstitialManager] AdMob interstitial loaded. AdUnitId=", ad.getAdUnitId()), new Object[0]);
            e eVar = this.f13041d;
            ad.setOnPaidEventListener(new a(eVar, this.f13042e, ad, 0));
            eVar.d(ad);
            cVar.c();
            c0583j.resumeWith(C1992A.f18074a);
        }
    }
}
