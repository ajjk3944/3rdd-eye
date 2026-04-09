package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.xq;

/* loaded from: classes.dex */
public final class PAGBannerSize {
    private int dg;
    private int emc;
    private int xq = 1;
    private int ypw;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i, int i3) {
        this.emc = i;
        this.ypw = i3;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        int iEmc = xq.emc(context, i, 0);
        if (iEmc == xq.emc) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, iEmc);
        pAGBannerSize.xq = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int iEmc = xq.emc(context, 0);
        if (iEmc == xq.emc) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.dg = iEmc;
        pAGBannerSize.xq = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i, int i3) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.dg = i3;
        pAGBannerSize.xq = 3;
        return pAGBannerSize;
    }

    public int getHeight() {
        return this.ypw;
    }

    public int getMaxHeight() {
        return this.dg;
    }

    public int getType() {
        return this.xq;
    }

    public int getWidth() {
        return this.emc;
    }
}
