package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import com.lefan.ads.banner.BannerView;
import com.lefan.signal.MyApplication;
import j$.util.Objects;
import j2.AbstractC2547c;
import j2.C2556l;

/* renamed from: com.google.android.gms.internal.ads.Ro, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717Ro extends AbstractC2547c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11044a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11045b;

    public C0717Ro(BinderC0751To binderC0751To) {
        Objects.requireNonNull(binderC0751To);
        this.f11045b = binderC0751To;
    }

    @Override // j2.AbstractC2547c
    public void b(C2556l c2556l) {
        switch (this.f11044a) {
            case 0:
                ((BinderC0751To) this.f11045b).M3(BinderC0751To.P3(c2556l));
                break;
        }
    }

    @Override // j2.AbstractC2547c
    public void c() {
        switch (this.f11044a) {
            case 1:
                AbstractC0241a.n(((BannerView) this.f11045b).getContext(), "Banner_ad_pair");
                break;
        }
    }

    @Override // j2.AbstractC2547c, q2.InterfaceC2806a
    public void onAdClicked() {
        switch (this.f11044a) {
            case 1:
                MyApplication.f18812d = true;
                BannerView bannerView = (BannerView) this.f11045b;
                int i = BannerView.f18749c;
                AbstractC0241a.m(bannerView.getContext(), "Banner_ad_pair");
                break;
        }
    }

    public C0717Ro(BannerView bannerView) {
        this.f11045b = bannerView;
    }
}
