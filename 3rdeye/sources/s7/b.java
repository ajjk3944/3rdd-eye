package S7;

import A9.C0583j;
import K9.d;
import androidx.work.s;
import b9.n;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import kotlin.jvm.internal.l;
import t8.C5613a;
import t8.c;
import t8.e;

/* compiled from: AdMobBannerProvider.kt */
/* loaded from: classes3.dex */
public final class b extends AdListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R7.c f11998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdView f11999c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f12000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.ads.banner.b f12001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0583j f12002f;

    public b(R7.c cVar, AdView adView, c cVar2, com.zipoapps.ads.banner.b bVar, C0583j c0583j) {
        this.f11998b = cVar;
        this.f11999c = adView;
        this.f12000d = cVar2;
        this.f12001e = bVar;
        this.f12002f = c0583j;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        va.a.f47104a.a("[BannerManager] AdMob onAdClicked", new Object[0]);
        this.f11998b.d();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        va.a.f47104a.a("[BannerManager] AdMob onAdClosed", new Object[0]);
        this.f11998b.a();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError error) {
        l.f(error, "error");
        va.a.f47104a.c(s.d("[BannerManager] AdMob banner loading failed. Error - ", error.getMessage()), new Object[0]);
        R7.c cVar = this.f11998b;
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
        C0583j c0583j = this.f12002f;
        if (!c0583j.isActive()) {
            c0583j = null;
        }
        if (c0583j != null) {
            c0583j.resumeWith(n.a(new RuntimeException(error.getMessage())));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        va.a.f47104a.a("[BannerManager] AdMob onAdImpression", new Object[0]);
        this.f11998b.b();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        va.a.f47104a.a("[BannerManager] AdMob banner loaded.", new Object[0]);
        AdView adView = this.f11999c;
        AdSize adSize = adView.getAdSize();
        c cVar = this.f12000d;
        Integer numValueOf = adSize != null ? Integer.valueOf(adSize.getWidthInPixels(cVar.f12003b)) : null;
        AdSize adSize2 = adView.getAdSize();
        a aVar = new a(adView, numValueOf, adSize2 != null ? Integer.valueOf(adSize2.getHeightInPixels(cVar.f12003b)) : null, this.f12001e);
        this.f11998b.e(aVar);
        C0583j c0583j = this.f12002f;
        C0583j c0583j2 = c0583j.isActive() ? c0583j : null;
        if (c0583j2 != null) {
            c0583j2.resumeWith(aVar);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        va.a.f47104a.a("[BannerManager] AdMob onAdOpened", new Object[0]);
        this.f11998b.c();
    }
}
