package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.api.NativeAdViewApi;

/* loaded from: assets/audience_network.dex */
public final class RM implements NativeAdViewApi {
    public static View A00(C3272dL c3272dL, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C2932Ur c2932Ur = (C2932Ur) nativeAdViewAttributes.getInternalAttributes();
        C2815Qc internalNativeAd = C2815Qc.A0L(nativeAd.getInternalNativeAd());
        internalNativeAd.A1a(EnumC2933Us.A00(type.getEnumCode()));
        internalNativeAd.A1Z(c2932Ur);
        C6Q c6q = new C6Q();
        NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c3272dL, c6q);
        c6q.A06(mediumRectTemplateLayout, c3272dL, nativeAd, c2932Ur);
        mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (AbstractC2975Wl.A02 * type.getHeight())));
        return mediumRectTemplateLayout;
    }

    public static View A01(C3272dL c3272dL, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C2815Qc c2815QcA0L = C2815Qc.A0L(nativeAd.getInternalNativeAd());
        C2932Ur c2932Ur = (C2932Ur) nativeAdViewAttributes.getInternalAttributes();
        c2815QcA0L.A1a(EnumC2933Us.A0B);
        c2815QcA0L.A1Z(c2932Ur);
        C6Q c6q = new C6Q();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c3272dL, c6q);
        c6q.A06(nativeAdLayout, c3272dL, nativeAd, c2932Ur);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd) {
        return render(context, nativeAd, (NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(RB.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (Throwable th) {
            return YB.A00(RB.A03(context), th);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        C3272dL contextWrapper;
        try {
            if (context instanceof C3272dL) {
                contextWrapper = (C3272dL) context;
            } else {
                contextWrapper = RB.A03(context);
            }
            return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
        } catch (Throwable th) {
            return YB.A00(RB.A03(context), th);
        }
    }
}
