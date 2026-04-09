package T7;

import A9.C0583j;
import K9.d;
import N7.H7;
import androidx.work.s;
import b9.n;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import kotlin.jvm.internal.l;
import t8.C5613a;
import t8.c;
import t8.e;

/* compiled from: ApplovinBannerProvider.kt */
/* loaded from: classes3.dex */
public final class b implements MaxAdViewAdListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxAdView f12327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f12328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.ads.banner.b f12329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R7.c f12330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0583j f12331f;

    public b(MaxAdView maxAdView, c cVar, com.zipoapps.ads.banner.b bVar, R7.c cVar2, C0583j c0583j) {
        this.f12327b = maxAdView;
        this.f12328c = cVar;
        this.f12329d = bVar;
        this.f12330e = cVar2;
        this.f12331f = c0583j;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd ad) {
        l.f(ad, "ad");
        va.a.f47104a.a("[BannerManager] Applovin onAdClicked", new Object[0]);
        this.f12330e.d();
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdCollapsed(MaxAd ad) {
        l.f(ad, "ad");
        va.a.f47104a.a("[BannerManager] Applovin onAdCollapsed", new Object[0]);
        this.f12330e.a();
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

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public final void onAdExpanded(MaxAd ad) {
        l.f(ad, "ad");
        va.a.f47104a.a("[BannerManager] Applovin onAdExpanded", new Object[0]);
        this.f12330e.c();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdHidden(MaxAd ad) {
        l.f(ad, "ad");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoadFailed(String adUnitId, MaxError error) {
        l.f(adUnitId, "adUnitId");
        l.f(error, "error");
        va.a.f47104a.c(s.d("[BannerManager] Applovin banner loading failed. Error - ", error.getMessage()), new Object[0]);
        R7.c cVar = this.f12330e;
        String message = error.getMessage();
        if (message == null) {
            message = "Failed to load AD";
        }
        va.a.f47104a.l("[BannerManager] onLoadingFailed", new Object[0]);
        com.zipoapps.ads.banner.a aVar = cVar.f11762a;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - aVar.f36970j;
        t8.c.f46451c.getClass();
        e.a(new C5613a(jCurrentTimeMillis, c.a.a()));
        d dVar = Z7.a.f14051a;
        Z7.a.a(aVar.f36963b, "banner", message);
        C0583j c0583j = this.f12331f;
        if (!c0583j.isActive()) {
            c0583j = null;
        }
        if (c0583j != null) {
            c0583j.resumeWith(n.a(new RuntimeException(error.getMessage())));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdLoaded(MaxAd ad) {
        l.f(ad, "ad");
        va.a.f47104a.a(H7.n(ad.getSize().getWidth(), ad.getSize().getHeight(), "[BannerManager] Applovin banner loaded. Size:w=", "h="), new Object[0]);
        c cVar = this.f12328c;
        a aVar = new a(this.f12327b, AppLovinSdkUtils.dpToPx(cVar.f12332b, ad.getSize().getWidth()), AppLovinSdkUtils.dpToPx(cVar.f12332b, ad.getSize().getHeight()), this.f12329d);
        R7.c cVar2 = this.f12330e;
        cVar2.b();
        cVar2.e(aVar);
        C0583j c0583j = this.f12331f;
        if (!c0583j.isActive()) {
            c0583j = null;
        }
        if (c0583j != null) {
            c0583j.resumeWith(aVar);
        }
    }
}
