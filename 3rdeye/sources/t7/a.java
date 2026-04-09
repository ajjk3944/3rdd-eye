package T7;

import android.view.View;
import com.applovin.mediation.ads.MaxAdView;
import kotlin.jvm.internal.l;

/* compiled from: ApplovinBanner.kt */
/* loaded from: classes3.dex */
public final class a implements R7.a {

    /* renamed from: a, reason: collision with root package name */
    public final MaxAdView f12323a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12324b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12325c;

    /* renamed from: d, reason: collision with root package name */
    public final com.zipoapps.ads.banner.b f12326d;

    public a(MaxAdView maxAdView, int i, int i10, com.zipoapps.ads.banner.b bannerSize) {
        l.f(bannerSize, "bannerSize");
        this.f12323a = maxAdView;
        this.f12324b = i;
        this.f12325c = i10;
        this.f12326d = bannerSize;
    }

    @Override // R7.a
    public final com.zipoapps.ads.banner.b a() {
        return this.f12326d;
    }

    @Override // R7.a
    public final void destroy() {
        this.f12323a.destroy();
    }

    @Override // R7.a
    public final Integer getHeight() {
        return Integer.valueOf(this.f12325c);
    }

    @Override // R7.a
    public final View getView() {
        return this.f12323a;
    }

    @Override // R7.a
    public final Integer getWidth() {
        return Integer.valueOf(this.f12324b);
    }
}
