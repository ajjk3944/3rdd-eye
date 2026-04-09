package R7;

import androidx.recyclerview.widget.RecyclerView;
import com.zipoapps.ads.banner.PhShimmerBannerAdView;

/* compiled from: PhShimmerBannerAdView.kt */
@h9.e(c = "com.zipoapps.ads.banner.PhShimmerBannerAdView", f = "PhShimmerBannerAdView.kt", l = {68}, m = "loadAdViewInfo")
/* loaded from: classes3.dex */
public final class f extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public PhShimmerBannerAdView f11767l;

    /* renamed from: m, reason: collision with root package name */
    public PhShimmerBannerAdView f11768m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f11769n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PhShimmerBannerAdView f11770o;

    /* renamed from: p, reason: collision with root package name */
    public int f11771p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PhShimmerBannerAdView phShimmerBannerAdView, h9.c cVar) {
        super(cVar);
        this.f11770o = phShimmerBannerAdView;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f11769n = obj;
        this.f11771p |= RecyclerView.UNDEFINED_DURATION;
        return this.f11770o.f(this);
    }
}
