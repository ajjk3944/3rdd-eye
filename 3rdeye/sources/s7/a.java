package S7;

import android.view.View;
import com.google.android.gms.ads.AdView;
import kotlin.jvm.internal.l;

/* compiled from: AdMobBanner.kt */
/* loaded from: classes3.dex */
public final class a implements R7.a {

    /* renamed from: a, reason: collision with root package name */
    public final AdView f11994a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f11995b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f11996c;

    /* renamed from: d, reason: collision with root package name */
    public final com.zipoapps.ads.banner.b f11997d;

    public a(AdView adView, Integer num, Integer num2, com.zipoapps.ads.banner.b bannerSize) {
        l.f(bannerSize, "bannerSize");
        this.f11994a = adView;
        this.f11995b = num;
        this.f11996c = num2;
        this.f11997d = bannerSize;
    }

    @Override // R7.a
    public final com.zipoapps.ads.banner.b a() {
        return this.f11997d;
    }

    @Override // R7.a
    public final void destroy() {
        this.f11994a.destroy();
    }

    @Override // R7.a
    public final Integer getHeight() {
        return this.f11996c;
    }

    @Override // R7.a
    public final View getView() {
        return this.f11994a;
    }

    @Override // R7.a
    public final Integer getWidth() {
        return this.f11995b;
    }
}
