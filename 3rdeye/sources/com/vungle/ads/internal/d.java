package com.vungle.ads.internal;

import a6.C1653b;
import a6.C1661j;
import android.content.Context;
import com.vungle.ads.C4055m;
import com.vungle.ads.i0;
import com.vungle.ads.internal.a;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.k0;

/* compiled from: BannerAdImpl.kt */
/* loaded from: classes2.dex */
public final class d extends com.vungle.ads.internal.a {
    private final i0 adSize;
    private i0 updatedAdSize;

    /* compiled from: BannerAdImpl.kt */
    public static final class a extends com.vungle.ads.internal.presenter.c {
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.vungle.ads.internal.presenter.b bVar, d dVar) {
            super(bVar);
            this.this$0 = dVar;
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdEnd(String str) {
            this.this$0.setAdState(a.EnumC0369a.FINISHED);
            super.onAdEnd(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdStart(String str) {
            this.this$0.setAdState(a.EnumC0369a.PLAYING);
            super.onAdStart(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onFailure(k0 error) {
            kotlin.jvm.internal.l.f(error, "error");
            this.this$0.setAdState(a.EnumC0369a.ERROR);
            super.onFailure(error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, i0 adSize) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adSize, "adSize");
        this.adSize = adSize;
    }

    @Override // com.vungle.ads.internal.a
    public void adLoadedAndUpdateConfigure$vungle_ads_release(C1653b advertisement) {
        kotlin.jvm.internal.l.f(advertisement, "advertisement");
        super.adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        if (this.adSize.isAdaptiveWidth$vungle_ads_release() || this.adSize.isAdaptiveHeight$vungle_ads_release()) {
            b9.l<Integer, Integer> deviceWidthAndHeightWithOrientation = s.INSTANCE.getDeviceWidthAndHeightWithOrientation(getContext(), 0);
            int iIntValue = deviceWidthAndHeightWithOrientation.f18083b.intValue();
            int iIntValue2 = deviceWidthAndHeightWithOrientation.f18084c.intValue();
            int iAdWidth = this.adSize.isAdaptiveWidth$vungle_ads_release() ? advertisement.adWidth() : this.adSize.getWidth();
            int iAdHeight = this.adSize.isAdaptiveHeight$vungle_ads_release() ? advertisement.adHeight() : this.adSize.getHeight();
            int iMin = Math.min(iIntValue, iAdWidth);
            int iMin2 = Math.min(iIntValue2, iAdHeight);
            if (this.adSize.isAdaptiveHeight$vungle_ads_release() && this.adSize.getHeight() > 0) {
                iMin2 = Math.min(this.adSize.getHeight(), iMin2);
            }
            this.updatedAdSize = new i0(iMin, iMin2);
        }
    }

    @Override // com.vungle.ads.internal.a
    public i0 getAdSizeForAdRequest() {
        return this.adSize;
    }

    public final i0 getUpdatedAdSize$vungle_ads_release() {
        return this.updatedAdSize;
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdSize(i0 i0Var) {
        boolean zIsValidSize$vungle_ads_release = i0Var != null ? i0Var.isValidSize$vungle_ads_release() : false;
        if (!zIsValidSize$vungle_ads_release) {
            C4055m c4055m = C4055m.INSTANCE;
            String str = "Invalidate size " + i0Var + " for banner ad";
            C1661j placement = getPlacement();
            String referenceId = placement != null ? placement.getReferenceId() : null;
            C1653b advertisement = getAdvertisement();
            C4055m.logError$vungle_ads_release$default(c4055m, 500, str, referenceId, (String) null, advertisement != null ? advertisement.eventId() : null, 8, (Object) null);
        }
        return zIsValidSize$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(C1661j placement) {
        kotlin.jvm.internal.l.f(placement, "placement");
        return placement.isBanner() || placement.isMREC() || placement.isInline();
    }

    public final void setUpdatedAdSize$vungle_ads_release(i0 i0Var) {
        this.updatedAdSize = i0Var;
    }

    public final com.vungle.ads.internal.presenter.c wrapCallback$vungle_ads_release(com.vungle.ads.internal.presenter.b adPlayCallback) {
        kotlin.jvm.internal.l.f(adPlayCallback, "adPlayCallback");
        return new a(adPlayCallback, this);
    }
}
