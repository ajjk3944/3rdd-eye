package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.C4072a3;
import com.yandex.mobile.ads.impl.C4198s4;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.de2;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.fl2;
import com.yandex.mobile.ads.impl.jl2;
import com.yandex.mobile.ads.impl.ns;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.si;
import com.yandex.mobile.ads.impl.ti;
import com.yandex.mobile.ads.impl.ts;
import com.yandex.mobile.ads.impl.ui;
import com.yandex.mobile.ads.impl.uo0;
import com.yandex.mobile.ads.impl.vi;
import com.yandex.mobile.ads.impl.zk2;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class BannerAdView extends ap0 {

    /* renamed from: j, reason: collision with root package name */
    private final zk2 f23946j;

    /* renamed from: k, reason: collision with root package name */
    private String f23947k;

    /* renamed from: l, reason: collision with root package name */
    private final VideoController f23948l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerAdView(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    @Override // com.yandex.mobile.ads.impl.ap0
    public final ti a(Context context, si bannerAdListener, C4198s4 phasesManager) {
        l.f(context, "context");
        l.f(bannerAdListener, "bannerAdListener");
        l.f(phasesManager, "phasesManager");
        return new ti(context, this, bannerAdListener, phasesManager, new de2(), new vi(), new ui(getAdConfiguration$mobileads_externalRelease().q()), new dg0());
    }

    @Override // com.yandex.mobile.ads.impl.ap0
    public void destroy() {
        super.destroy();
    }

    public final BannerAdSize getAdSize() {
        ts tsVarB = b();
        if (tsVarB != null) {
            return new BannerAdSize(tsVarB.a());
        }
        return null;
    }

    public final String getInfo() {
        return c();
    }

    public final VideoController getVideoController() {
        return this.f23948l;
    }

    public final void loadAd(AdRequest adRequest) {
        l.f(adRequest, "adRequest");
        String str = this.f23947k;
        if (str == null || str.length() <= 0) {
            uo0.a("Failed to load ad with empty ad unit id", new Object[0]);
        } else {
            a(this.f23946j.a(str, adRequest));
        }
    }

    public final void setAdSize(BannerAdSize adSize) {
        l.f(adSize, "adSize");
        a(a.a(adSize));
    }

    @Override // com.yandex.mobile.ads.impl.ap0
    public void setAdUnitId(String str) {
        this.f23947k = str;
        super.setAdUnitId(str);
    }

    public final void setBannerAdEventListener(BannerAdEventListener bannerAdEventListener) {
        a(bannerAdEventListener instanceof ClosableBannerAdEventListener ? new jl2((ClosableBannerAdEventListener) bannerAdEventListener) : bannerAdEventListener != null ? new fl2(bannerAdEventListener) : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, new C4072a3(ns.f30988d, new rm2(context)), null, null, null, null, null, 496, null);
        l.f(context, "context");
        this.f23946j = new zk2();
        this.f23948l = new VideoController(d());
    }
}
