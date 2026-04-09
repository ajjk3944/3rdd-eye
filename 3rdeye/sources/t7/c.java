package T7;

import A9.C0583j;
import F9.C0663f;
import I9.g;
import N7.C1154e9;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.ads.banner.b;
import com.zipoapps.premiumhelper.d;
import g0.C4356c;
import va.a;

/* compiled from: ApplovinBannerProvider.kt */
/* loaded from: classes3.dex */
public final class c extends g {

    /* renamed from: b, reason: collision with root package name */
    public final d f12332b;

    public c(C0663f c0663f, d dVar) {
        super(c0663f);
        this.f12332b = dVar;
    }

    @Override // I9.g
    public final int P(com.zipoapps.ads.banner.b bVar) {
        a.b bVar2 = va.a.f47104a;
        bVar2.a("[BannerManager] getBannerHeight:" + bVar, new Object[0]);
        boolean z10 = bVar instanceof b.a;
        d dVar = this.f12332b;
        int iDpToPx = z10 ? AppLovinSdkUtils.dpToPx(dVar, MaxAdFormat.BANNER.getAdaptiveSize(((b.a) bVar).f36975b, dVar).getHeight()) : bVar instanceof b.C0429b ? AppLovinSdkUtils.dpToPx(dVar, MaxAdFormat.BANNER.getAdaptiveSize(((b.C0429b) bVar).f36976b, dVar).getHeight()) : bVar.equals(b.g.f36981b) ? dVar.getResources().getDimensionPixelSize(R.dimen.max_mrec_height) : dVar.getResources().getDimensionPixelSize(R.dimen.max_banner_height);
        bVar2.a(C4356c.h(iDpToPx, "[BannerManager] getBannerHeight result=:"), new Object[0]);
        return iDpToPx;
    }

    @Override // I9.g
    public final Object X(String str, com.zipoapps.ads.banner.b bVar, R7.c cVar, R7.b bVar2) {
        MaxAdView maxAdView;
        MaxAdView maxAdView2;
        MaxAdView maxAdView3;
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(bVar2));
        c0583j.s();
        if (!(bVar instanceof b.g)) {
            if (bVar instanceof b.C0429b) {
                maxAdView2 = new MaxAdView(str, MaxAdViewConfiguration.builder().setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.ANCHORED).setAdaptiveWidth(((b.C0429b) bVar).f36976b).build());
            } else if (bVar instanceof b.a) {
                maxAdView2 = new MaxAdView(str, MaxAdViewConfiguration.builder().setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.INLINE).setAdaptiveWidth(((b.a) bVar).f36975b).build());
            } else {
                maxAdView = new MaxAdView(str, MaxAdFormat.BANNER);
            }
            maxAdView3 = maxAdView2;
            maxAdView3.setRevenueListener(new C1154e9(19));
            maxAdView3.setListener(new b(maxAdView3, this, bVar, cVar, c0583j));
            maxAdView3.loadAd();
            Object objR = c0583j.r();
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            return objR;
        }
        maxAdView = new MaxAdView(str, MaxAdFormat.MREC);
        maxAdView3 = maxAdView;
        maxAdView3.setRevenueListener(new C1154e9(19));
        maxAdView3.setListener(new b(maxAdView3, this, bVar, cVar, c0583j));
        maxAdView3.loadAd();
        Object objR2 = c0583j.r();
        g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
        return objR2;
    }
}
