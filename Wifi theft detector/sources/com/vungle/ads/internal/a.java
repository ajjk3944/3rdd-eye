package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.VungleError;
import com.vungle.ads.a0;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.util.x;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a extends AdInternal {

    @NotNull
    private final a0 adSize;

    @Nullable
    private a0 updatedAdSize;

    /* renamed from: com.vungle.ads.internal.a$a, reason: collision with other inner class name */
    public static final class C0365a extends com.vungle.ads.internal.presenter.c {
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0365a(com.vungle.ads.internal.presenter.b bVar, a aVar) {
            super(bVar);
            this.this$0 = aVar;
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdEnd(@Nullable String str) {
            this.this$0.setAdState(AdInternal.AdState.FINISHED);
            super.onAdEnd(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdStart(@Nullable String str) {
            this.this$0.setAdState(AdInternal.AdState.PLAYING);
            super.onAdStart(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onFailure(@NotNull VungleError error) {
            p.e(error, "error");
            this.this$0.setAdState(AdInternal.AdState.ERROR);
            super.onFailure(error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull a0 adSize) {
        super(context);
        p.e(context, "context");
        p.e(adSize, "adSize");
        this.adSize = adSize;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void adLoadedAndUpdateConfigure$vungle_ads_release(@NotNull q7.a advertisement) {
        p.e(advertisement, "advertisement");
        super.adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        if (this.adSize.isAdaptiveWidth$vungle_ads_release() || this.adSize.isAdaptiveHeight$vungle_ads_release()) {
            Pair<Integer, Integer> deviceWidthAndHeightWithOrientation = x.INSTANCE.getDeviceWidthAndHeightWithOrientation(getContext(), 0);
            int iIntValue = ((Number) deviceWidthAndHeightWithOrientation.getFirst()).intValue();
            int iIntValue2 = ((Number) deviceWidthAndHeightWithOrientation.getSecond()).intValue();
            int iAdWidth = this.adSize.isAdaptiveWidth$vungle_ads_release() ? advertisement.adWidth() : this.adSize.getWidth();
            int iAdHeight = this.adSize.isAdaptiveHeight$vungle_ads_release() ? advertisement.adHeight() : this.adSize.getHeight();
            int iMin = Math.min(iIntValue, iAdWidth);
            int iMin2 = Math.min(iIntValue2, iAdHeight);
            if (this.adSize.isAdaptiveHeight$vungle_ads_release() && this.adSize.getHeight() > 0) {
                iMin2 = Math.min(this.adSize.getHeight(), iMin2);
            }
            this.updatedAdSize = new a0(iMin, iMin2);
        }
    }

    @Override // com.vungle.ads.internal.AdInternal
    @NotNull
    public a0 getAdSizeForAdRequest() {
        return this.adSize;
    }

    @Nullable
    public final a0 getUpdatedAdSize$vungle_ads_release() {
        return this.updatedAdSize;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(@Nullable a0 a0Var) {
        if (a0Var != null) {
            return a0Var.isValidSize$vungle_ads_release();
        }
        return false;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(@NotNull q7.h placement) {
        p.e(placement, "placement");
        return placement.isBanner() || placement.isMREC() || placement.isInline();
    }

    public final void setUpdatedAdSize$vungle_ads_release(@Nullable a0 a0Var) {
        this.updatedAdSize = a0Var;
    }

    @NotNull
    public final com.vungle.ads.internal.presenter.c wrapCallback$vungle_ads_release(@NotNull com.vungle.ads.internal.presenter.b adPlayCallback) {
        p.e(adPlayCallback, "adPlayCallback");
        return new C0365a(adPlayCallback, this);
    }
}
