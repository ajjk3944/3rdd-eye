package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.lh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class PAGBannerSize {

    /* renamed from: lh, reason: collision with root package name */
    private int f7816lh = 1;
    private int ouw;
    private int vt;
    private int yu;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i4, int i10) {
        this.ouw = i4;
        this.vt = i10;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i4) {
        int iOuw = lh.ouw(context, i4);
        if (iOuw == lh.ouw) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i4, iOuw);
        pAGBannerSize.f7816lh = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i4) {
        int iOuw = lh.ouw(context);
        if (iOuw == lh.ouw) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i4, 0);
        pAGBannerSize.yu = iOuw;
        pAGBannerSize.f7816lh = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i4, int i10) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i4, 0);
        pAGBannerSize.yu = i10;
        pAGBannerSize.f7816lh = 3;
        return pAGBannerSize;
    }

    public final int getHeight() {
        return this.vt;
    }

    public final int getMaxHeight() {
        return this.yu;
    }

    public final int getType() {
        return this.f7816lh;
    }

    public final int getWidth() {
        return this.ouw;
    }
}
