package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a0 {
    private final int height;
    private boolean isAdaptiveHeight;
    private boolean isAdaptiveWidth;
    private final int width;

    @NotNull
    public static final a Companion = new a(null);

    @JvmField
    @NotNull
    public static final a0 BANNER = new a0(Sdk$SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);

    @JvmField
    @NotNull
    public static final a0 BANNER_SHORT = new a0(300, 50);

    @JvmField
    @NotNull
    public static final a0 BANNER_LEADERBOARD = new a0(728, 90);

    @JvmField
    @NotNull
    public static final a0 MREC = new a0(300, 250);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        @JvmStatic
        @NotNull
        public final a0 getAdSizeWithWidth(@NotNull Context context, int i10) {
            kotlin.jvm.internal.p.e(context, "context");
            int iIntValue = ((Number) com.vungle.ads.internal.util.x.INSTANCE.getDeviceWidthAndHeightWithOrientation(context, 0).getSecond()).intValue();
            if (i10 < 0) {
                i10 = 0;
            }
            a0 a0Var = new a0(i10, iIntValue);
            if (a0Var.getWidth() == 0) {
                a0Var.setAdaptiveWidth$vungle_ads_release(true);
            }
            a0Var.setAdaptiveHeight$vungle_ads_release(true);
            return a0Var;
        }

        @JvmStatic
        @NotNull
        public final a0 getAdSizeWithWidthAndHeight(int i10, int i11) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            a0 a0Var = new a0(i10, i11);
            if (a0Var.getWidth() == 0) {
                a0Var.setAdaptiveWidth$vungle_ads_release(true);
            }
            if (a0Var.getHeight() == 0) {
                a0Var.setAdaptiveHeight$vungle_ads_release(true);
            }
            return a0Var;
        }

        @JvmStatic
        @NotNull
        public final a0 getValidAdSizeFromSize(int i10, int i11, @NotNull String placementId) {
            kotlin.jvm.internal.p.e(placementId, "placementId");
            q7.h placement = ConfigManager.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                if (!placement.isInline()) {
                    placement = null;
                }
                if (placement != null) {
                    return a0.Companion.getAdSizeWithWidthAndHeight(i10, i11);
                }
            }
            a0 a0Var = a0.MREC;
            if (i10 >= a0Var.getWidth() && i11 >= a0Var.getHeight()) {
                return a0Var;
            }
            a0 a0Var2 = a0.BANNER_LEADERBOARD;
            if (i10 >= a0Var2.getWidth() && i11 >= a0Var2.getHeight()) {
                return a0Var2;
            }
            a0 a0Var3 = a0.BANNER;
            if (i10 >= a0Var3.getWidth() && i11 >= a0Var3.getHeight()) {
                return a0Var3;
            }
            a0 a0Var4 = a0.BANNER_SHORT;
            return (i10 < a0Var4.getWidth() || i11 < a0Var4.getHeight()) ? getAdSizeWithWidthAndHeight(i10, i11) : a0Var4;
        }

        private a() {
        }
    }

    public a0(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    @JvmStatic
    @NotNull
    public static final a0 getAdSizeWithWidth(@NotNull Context context, int i10) {
        return Companion.getAdSizeWithWidth(context, i10);
    }

    @JvmStatic
    @NotNull
    public static final a0 getAdSizeWithWidthAndHeight(int i10, int i11) {
        return Companion.getAdSizeWithWidthAndHeight(i10, i11);
    }

    @JvmStatic
    @NotNull
    public static final a0 getValidAdSizeFromSize(int i10, int i11, @NotNull String str) {
        return Companion.getValidAdSizeFromSize(i10, i11, str);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isAdaptiveHeight$vungle_ads_release() {
        return this.isAdaptiveHeight;
    }

    public final boolean isAdaptiveWidth$vungle_ads_release() {
        return this.isAdaptiveWidth;
    }

    public final boolean isValidSize$vungle_ads_release() {
        return this.width >= 0 && this.height >= 0;
    }

    public final void setAdaptiveHeight$vungle_ads_release(boolean z10) {
        this.isAdaptiveHeight = z10;
    }

    public final void setAdaptiveWidth$vungle_ads_release(boolean z10) {
        this.isAdaptiveWidth = z10;
    }

    @NotNull
    public String toString() {
        return "VungleAdSize(width=" + this.width + ", height=" + this.height + ')';
    }
}
