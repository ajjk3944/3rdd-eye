package com.facebook.ads;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class NativeAdViewAttributes {
    private final NativeAdViewAttributesApi mNativeAdViewAttributesApi;

    public NativeAdViewAttributes(Context context) {
        this.mNativeAdViewAttributesApi = DynamicLoaderFactory.makeLoader(context).createNativeAdViewAttributesApi();
    }

    @Deprecated
    public boolean getAutoplay() {
        return AdSettings.isVideoAutoplay();
    }

    @Deprecated
    public boolean getAutoplayOnMobile() {
        return AdSettings.isVideoAutoplayOnMobile();
    }

    @Deprecated
    public int getBackgroundColor() {
        return 0;
    }

    @Deprecated
    public int getButtonBorderColor() {
        return 0;
    }

    @Deprecated
    public int getButtonColor() {
        return 0;
    }

    @Deprecated
    public int getButtonTextColor() {
        return 0;
    }

    @Deprecated
    public int getDescriptionTextColor() {
        return 0;
    }

    @Deprecated
    public int getDescriptionTextSize() {
        return 0;
    }

    public NativeAdViewAttributesApi getInternalAttributes() {
        return this.mNativeAdViewAttributesApi;
    }

    @Deprecated
    public int getTitleTextColor() {
        return 0;
    }

    @Deprecated
    public int getTitleTextSize() {
        return 0;
    }

    @Deprecated
    public Typeface getTypeface() {
        return null;
    }

    public NativeAdViewAttributes setBackgroundColor(int i4) {
        this.mNativeAdViewAttributesApi.setBackgroundColor(i4);
        return this;
    }

    public NativeAdViewAttributes setButtonBorderColor(int i4) {
        this.mNativeAdViewAttributesApi.setCTABorderColor(i4);
        return this;
    }

    public NativeAdViewAttributes setButtonColor(int i4) {
        this.mNativeAdViewAttributesApi.setCTABackgroundColor(i4);
        return this;
    }

    public NativeAdViewAttributes setButtonTextColor(int i4) {
        this.mNativeAdViewAttributesApi.setCTATextColor(i4);
        return this;
    }

    public NativeAdViewAttributes setDescriptionTextColor(int i4) {
        this.mNativeAdViewAttributesApi.setSecondaryTextColor(i4);
        return this;
    }

    public NativeAdViewAttributes setTitleTextColor(int i4) {
        this.mNativeAdViewAttributesApi.setPrimaryTextColor(i4);
        return this;
    }

    public NativeAdViewAttributes setTypeface(Typeface typeface) {
        this.mNativeAdViewAttributesApi.setTypeface(typeface);
        return this;
    }

    @Deprecated
    public NativeAdViewAttributes() {
        this.mNativeAdViewAttributesApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewAttributesApi();
    }

    @Deprecated
    public NativeAdViewAttributes setAutoplay(boolean z3) {
        return this;
    }

    @Deprecated
    public NativeAdViewAttributes setAutoplayOnMobile(boolean z3) {
        return this;
    }
}
