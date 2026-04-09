package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.a0;
import com.vungle.ads.internal.model.BidPayload;
import java.util.List;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class g extends AdInternal implements com.vungle.ads.internal.presenter.i {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";

    @NotNull
    public static final String TOKEN_APP_ICON = "APP_ICON";

    @NotNull
    public static final String TOKEN_APP_NAME = "APP_NAME";

    @NotNull
    public static final String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";

    @NotNull
    public static final String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";

    @NotNull
    public static final String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";

    @NotNull
    public static final String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";

    @NotNull
    public static final String TOKEN_OM_SDK_DATA = "OM_SDK_DATA";

    @NotNull
    public static final String TOKEN_SPONSORED_BY = "SPONSORED_BY";

    @NotNull
    public static final String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";

    @NotNull
    public static final String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Context context) {
        super(context);
        p.e(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    @Nullable
    public a0 getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.i
    @Nullable
    public List<String> getImpressionUrls() {
        BidPayload bidPayload = getBidPayload();
        if (bidPayload != null) {
            return bidPayload.getImpression();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.i
    @Nullable
    public String getPlacementRefId() {
        q7.h placement = getPlacement();
        if (placement != null) {
            return placement.getReferenceId();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(@Nullable a0 a0Var) {
        return true;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(@NotNull q7.h placement) {
        p.e(placement, "placement");
        return placement.isNative();
    }
}
