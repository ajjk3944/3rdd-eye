package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdFormat f6368a;

        /* renamed from: b, reason: collision with root package name */
        private String f6369b;

        /* renamed from: c, reason: collision with root package name */
        private String f6370c;

        /* renamed from: d, reason: collision with root package name */
        private String f6371d;

        /* renamed from: e, reason: collision with root package name */
        private String f6372e;

        /* renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f6373f;
        private View g;

        /* renamed from: h, reason: collision with root package name */
        private View f6374h;

        /* renamed from: i, reason: collision with root package name */
        private View f6375i;
        private MaxNativeAdImage j;

        /* renamed from: k, reason: collision with root package name */
        private float f6376k;

        /* renamed from: l, reason: collision with root package name */
        private Double f6377l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f6368a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f6370c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f6371d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f6372e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f6373f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f6376k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f6375i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f6374h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.f6377l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f6369b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f6368a;
        this.title = builder.f6369b;
        this.advertiser = builder.f6370c;
        this.body = builder.f6371d;
        this.callToAction = builder.f6372e;
        this.icon = builder.f6373f;
        this.iconView = builder.g;
        this.optionsView = builder.f6374h;
        this.mediaView = builder.f6375i;
        this.mainImage = builder.j;
        this.mediaContentAspectRatio = builder.f6376k;
        Double d10 = builder.f6377l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final Double getStarRating() {
        return this.starRating;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class MaxNativeAdImage {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f6378a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f6379b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f6378a = drawable;
        }

        public Drawable getDrawable() {
            return this.f6378a;
        }

        public Uri getUri() {
            return this.f6379b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f6379b = uri;
        }
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }
}
