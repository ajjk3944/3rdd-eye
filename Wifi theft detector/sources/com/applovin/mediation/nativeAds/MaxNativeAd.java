package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

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

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdFormat f8845a;

        /* renamed from: b, reason: collision with root package name */
        private String f8846b;

        /* renamed from: c, reason: collision with root package name */
        private String f8847c;

        /* renamed from: d, reason: collision with root package name */
        private String f8848d;

        /* renamed from: e, reason: collision with root package name */
        private String f8849e;

        /* renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f8850f;

        /* renamed from: g, reason: collision with root package name */
        private View f8851g;

        /* renamed from: h, reason: collision with root package name */
        private View f8852h;

        /* renamed from: i, reason: collision with root package name */
        private View f8853i;

        /* renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f8854j;

        /* renamed from: k, reason: collision with root package name */
        private float f8855k;

        /* renamed from: l, reason: collision with root package name */
        private Double f8856l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f8845a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f8847c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f8848d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f8849e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f8850f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f8851g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f8854j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f8855k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f8853i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f8852h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.f8856l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f8846b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f8845a;
        this.title = builder.f8846b;
        this.advertiser = builder.f8847c;
        this.body = builder.f8848d;
        this.callToAction = builder.f8849e;
        this.icon = builder.f8850f;
        this.iconView = builder.f8851g;
        this.optionsView = builder.f8852h;
        this.mediaView = builder.f8853i;
        this.mainImage = builder.f8854j;
        this.mediaContentAspectRatio = builder.f8855k;
        Double d10 = builder.f8856l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }

    @Nullable
    public final String getAdvertiser() {
        return this.advertiser;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final String getCallToAction() {
        return this.callToAction;
    }

    @NonNull
    public final MaxAdFormat getFormat() {
        return this.format;
    }

    @Nullable
    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    @Nullable
    public final View getIconView() {
        return this.iconView;
    }

    @Nullable
    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    @Nullable
    public final View getMediaView() {
        return this.mediaView;
    }

    @Nullable
    public final View getOptionsView() {
        return this.optionsView;
    }

    @Nullable
    public final Double getStarRating() {
        return this.starRating;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    @UiThread
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

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
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

    public static class MaxNativeAdImage {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f8857a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f8858b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f8857a = drawable;
        }

        @Nullable
        public Drawable getDrawable() {
            return this.f8857a;
        }

        @Nullable
        public Uri getUri() {
            return this.f8858b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f8858b = uri;
        }
    }
}
