package W7;

import P7.t;
import U7.h;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import g0.C4356c;
import kotlin.jvm.internal.l;

/* compiled from: ApplovinInterstitialProvider.kt */
/* loaded from: classes3.dex */
public final class b implements MaxAdListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f13351b;

    public b(h hVar) {
        this.f13351b = hVar;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd ad) {
        l.f(ad, "ad");
        va.a.f47104a.a("[InterstitialManager] Applovin onAdClicked", new Object[0]);
        this.f13351b.a();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayFailed(MaxAd ad, MaxError error) {
        l.f(ad, "ad");
        l.f(error, "error");
        va.a.f47104a.a(C4356c.h(error.getCode(), "[InterstitialManager] Applovin onAdDisplayFailed. Error code="), new Object[0]);
        int code = error.getCode();
        this.f13351b.c(code != -5001 ? code != -1009 ? code != -1 ? code != 204 ? code != -1001 ? code != -1000 ? code != -24 ? code != -23 ? new t.o(error.getCode()) : t.c.f10799b : t.d.f10800b : t.i.f10805b : t.j.f10806b : t.m.f10809b : t.p.f10812b : t.n.f10810b : new t.h(error.getMessage()));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdDisplayed(MaxAd ad) {
        l.f(ad, "ad");
        va.a.f47104a.a("[InterstitialManager] Applovin onAdDisplayed", new Object[0]);
        h hVar = this.f13351b;
        hVar.e();
        hVar.d();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd ad) {
        l.f(ad, "ad");
        va.a.f47104a.a("[InterstitialManager] Applovin onAdHidden", new Object[0]);
        this.f13351b.b();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String adUnit, MaxError error) {
        l.f(adUnit, "adUnit");
        l.f(error, "error");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd ad) {
        l.f(ad, "ad");
    }
}
