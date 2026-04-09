package com.vungle.ads;

import a6.C1656e;
import a6.C1661j;
import android.content.Context;
import java.util.List;

/* compiled from: NativeAd.kt */
/* loaded from: classes2.dex */
public final class N extends com.vungle.ads.internal.a implements com.vungle.ads.internal.presenter.i {
    public static final a Companion = new a(null);
    public static final String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";
    public static final String TOKEN_APP_ICON = "APP_ICON";
    public static final String TOKEN_APP_NAME = "APP_NAME";
    public static final String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";
    public static final String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";
    public static final String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";
    public static final String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";
    public static final String TOKEN_OM_SDK_DATA = "OM_SDK_DATA";
    public static final String TOKEN_SPONSORED_BY = "SPONSORED_BY";
    public static final String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";
    public static final String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";

    /* compiled from: NativeAd.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
    }

    @Override // com.vungle.ads.internal.a
    public i0 getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.i
    public List<String> getImpressionUrls() {
        C1656e bidPayload = getBidPayload();
        if (bidPayload != null) {
            return bidPayload.getImpression();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.i
    public String getPlacementRefId() {
        C1661j placement = getPlacement();
        if (placement != null) {
            return placement.getReferenceId();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdSize(i0 i0Var) {
        return true;
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(C1661j placement) {
        kotlin.jvm.internal.l.f(placement, "placement");
        return placement.isNative();
    }
}
