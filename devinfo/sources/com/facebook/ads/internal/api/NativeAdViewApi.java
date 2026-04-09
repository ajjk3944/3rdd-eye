package com.facebook.ads.internal.api;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes.dex */
public interface NativeAdViewApi {
    View render(Context context, NativeAd nativeAd);

    @Deprecated
    View render(Context context, NativeAd nativeAd, NativeAdView.Type type);

    @Deprecated
    View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes);

    View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes);
}
