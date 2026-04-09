package S7;

import A9.C0583j;
import C.f0;
import F9.C0663f;
import I9.g;
import N7.H7;
import androidx.work.s;
import b9.j;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.zipoapps.ads.banner.b;
import com.zipoapps.premiumhelper.d;
import kotlin.jvm.internal.l;
import t8.c;
import va.a;

/* compiled from: AdMobBannerProvider.kt */
/* loaded from: classes3.dex */
public final class c extends g {

    /* renamed from: b, reason: collision with root package name */
    public final d f12003b;

    public c(C0663f c0663f, d dVar, l8.b bVar) {
        super(c0663f);
        this.f12003b = dVar;
    }

    @Override // I9.g
    public final int P(com.zipoapps.ads.banner.b bVar) {
        return i0(bVar).getHeightInPixels(this.f12003b);
    }

    @Override // I9.g
    public final Object X(String str, com.zipoapps.ads.banner.b bVar, R7.c cVar, R7.b bVar2) {
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(bVar2));
        c0583j.s();
        AdSize adSizeI0 = i0(bVar);
        AdView adView = new AdView(this.f12003b);
        adView.setAdSize(adSizeI0);
        adView.setAdUnitId(str);
        adView.setOnPaidEventListener(new f0(str, adView));
        adView.setAdListener(new b(cVar, adView, this, bVar, c0583j));
        va.a.f47104a.a(s.d("[BannerManager] AdMob start ad loading. AdUnitId=", str), new Object[0]);
        cVar.getClass();
        va.a.f47104a.a("[BannerManager] onLoadingStarted", new Object[0]);
        cVar.f11762a.f36970j = System.currentTimeMillis();
        t8.c.f46451c.getClass();
        c.a.a().f46453a++;
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        l.e(adRequestBuild, "build(...)");
        adView.loadAd(adRequestBuild);
        Object objR = c0583j.r();
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public final AdSize i0(com.zipoapps.ads.banner.b bVar) {
        AdSize currentOrientationAnchoredAdaptiveBannerAdSize;
        a.b bVar2 = va.a.f47104a;
        bVar2.a("[BannerManager] getAdSize:" + bVar, new Object[0]);
        boolean zB = l.b(bVar, b.c.f36977b);
        d dVar = this.f12003b;
        if (zB) {
            currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.BANNER;
        } else if (l.b(bVar, b.e.f36979b)) {
            currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.LARGE_BANNER;
        } else if (l.b(bVar, b.g.f36981b)) {
            currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.MEDIUM_RECTANGLE;
        } else if (l.b(bVar, b.d.f36978b)) {
            currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.FULL_BANNER;
        } else if (l.b(bVar, b.f.f36980b)) {
            currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.LEADERBOARD;
        } else if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            aVar.getClass();
            currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(dVar, aVar.f36975b);
        } else {
            if (!(bVar instanceof b.C0429b)) {
                throw new j();
            }
            currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(dVar, ((b.C0429b) bVar).f36976b);
        }
        l.c(currentOrientationAnchoredAdaptiveBannerAdSize);
        bVar2.a(H7.n(currentOrientationAnchoredAdaptiveBannerAdSize.getWidthInPixels(dVar), currentOrientationAnchoredAdaptiveBannerAdSize.getHeightInPixels(dVar), "[BannerManager] Banner Size:w=", ",h="), new Object[0]);
        return currentOrientationAnchoredAdaptiveBannerAdSize;
    }
}
