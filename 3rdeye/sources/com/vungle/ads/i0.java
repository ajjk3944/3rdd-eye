package com.vungle.ads;

import N7.H7;
import a6.C1661j;
import android.content.Context;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: AdSize.kt */
/* loaded from: classes2.dex */
public final class i0 {
    private final int height;
    private boolean isAdaptiveHeight;
    private boolean isAdaptiveWidth;
    private final int width;
    public static final a Companion = new a(null);
    public static final i0 BANNER = new i0(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 50);
    public static final i0 BANNER_SHORT = new i0(300, 50);
    public static final i0 BANNER_LEADERBOARD = new i0(728, 90);
    public static final i0 MREC = new i0(300, 250);

    /* compiled from: AdSize.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final i0 getAdSizeWithWidth(Context context, int i) {
            kotlin.jvm.internal.l.f(context, "context");
            int iIntValue = com.vungle.ads.internal.util.s.INSTANCE.getDeviceWidthAndHeightWithOrientation(context, 0).f18084c.intValue();
            if (i < 0) {
                i = 0;
            }
            i0 i0Var = new i0(i, iIntValue);
            if (i0Var.getWidth() == 0) {
                i0Var.setAdaptiveWidth$vungle_ads_release(true);
            }
            i0Var.setAdaptiveHeight$vungle_ads_release(true);
            return i0Var;
        }

        public final i0 getAdSizeWithWidthAndHeight(int i, int i10) {
            if (i < 0) {
                i = 0;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            i0 i0Var = new i0(i, i10);
            if (i0Var.getWidth() == 0) {
                i0Var.setAdaptiveWidth$vungle_ads_release(true);
            }
            if (i0Var.getHeight() == 0) {
                i0Var.setAdaptiveHeight$vungle_ads_release(true);
            }
            return i0Var;
        }

        public final i0 getAdSizeWithWidthAndMaxHeight(int i, int i10) {
            if (i < 0) {
                i = 0;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            i0 i0Var = new i0(i, i10);
            if (i0Var.getWidth() == 0) {
                i0Var.setAdaptiveWidth$vungle_ads_release(true);
            }
            i0Var.setAdaptiveHeight$vungle_ads_release(true);
            return i0Var;
        }

        public final i0 getValidAdSizeFromSize(int i, int i10, String placementId) {
            kotlin.jvm.internal.l.f(placementId, "placementId");
            C1661j placement = com.vungle.ads.internal.f.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                if (!placement.isInline()) {
                    placement = null;
                }
                if (placement != null) {
                    return i0.Companion.getAdSizeWithWidthAndHeight(i, i10);
                }
            }
            i0 i0Var = i0.MREC;
            if (i >= i0Var.getWidth() && i10 >= i0Var.getHeight()) {
                return i0Var;
            }
            i0 i0Var2 = i0.BANNER_LEADERBOARD;
            if (i >= i0Var2.getWidth() && i10 >= i0Var2.getHeight()) {
                return i0Var2;
            }
            i0 i0Var3 = i0.BANNER;
            if (i >= i0Var3.getWidth() && i10 >= i0Var3.getHeight()) {
                return i0Var3;
            }
            i0 i0Var4 = i0.BANNER_SHORT;
            return (i < i0Var4.getWidth() || i10 < i0Var4.getHeight()) ? getAdSizeWithWidthAndHeight(i, i10) : i0Var4;
        }

        private a() {
        }
    }

    public i0(int i, int i10) {
        this.width = i;
        this.height = i10;
    }

    public static final i0 getAdSizeWithWidth(Context context, int i) {
        return Companion.getAdSizeWithWidth(context, i);
    }

    public static final i0 getAdSizeWithWidthAndHeight(int i, int i10) {
        return Companion.getAdSizeWithWidthAndHeight(i, i10);
    }

    public static final i0 getAdSizeWithWidthAndMaxHeight(int i, int i10) {
        return Companion.getAdSizeWithWidthAndMaxHeight(i, i10);
    }

    public static final i0 getValidAdSizeFromSize(int i, int i10, String str) {
        return Companion.getValidAdSizeFromSize(i, i10, str);
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

    public String toString() {
        StringBuilder sb = new StringBuilder("VungleAdSize(width=");
        sb.append(this.width);
        sb.append(", height=");
        return H7.p(sb, this.height, ')');
    }
}
