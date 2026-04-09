package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class NativeAdScrollView extends LinearLayout {
    public static final int DEFAULT_INSET = 20;
    public static final int DEFAULT_MAX_ADS = 10;
    private final NativeAdScrollViewApi mNativeAdScrollViewApi;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    @Keep
    public interface AdViewProvider {
        View createView(NativeAd nativeAd, int i4);

        void destroyView(NativeAd nativeAd, View view);
    }

    private NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i4, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i10) {
        super(context);
        this.mNativeAdScrollViewApi = DynamicLoaderFactory.makeLoader(context).createNativeAdScrollViewApi(this, context, nativeAdsManager, adViewProvider, i4, type, nativeAdViewAttributes, i10);
    }

    public void setInset(int i4) {
        this.mNativeAdScrollViewApi.setInset(i4);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider) {
        this(context, nativeAdsManager, adViewProvider, 0, null, null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i4) {
        this(context, nativeAdsManager, adViewProvider, 0, null, null, i4);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i4) {
        this(context, nativeAdsManager, null, i4, null, null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i4, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, i4, null, nativeAdViewAttributes, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i4, NativeAdViewAttributes nativeAdViewAttributes, int i10) {
        this(context, nativeAdsManager, null, i4, null, nativeAdViewAttributes, i10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type) {
        this(context, nativeAdsManager, null, 0, type, null, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, 0, type, nativeAdViewAttributes, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i4) {
        this(context, nativeAdsManager, null, 0, type, nativeAdViewAttributes, i4);
    }
}
