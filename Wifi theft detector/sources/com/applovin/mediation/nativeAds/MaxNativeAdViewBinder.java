package com.applovin.mediation.nativeAds;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;

/* loaded from: classes.dex */
public class MaxNativeAdViewBinder {

    @IdRes
    protected final int advertiserTextViewId;

    @IdRes
    protected final int bodyTextViewId;

    @IdRes
    protected final int callToActionButtonId;

    @IdRes
    protected final int iconContentViewId;

    @IdRes
    protected final int iconImageViewId;

    @LayoutRes
    protected final int layoutResourceId;
    protected final View mainView;

    @IdRes
    protected final int mediaContentFrameLayoutId;

    @IdRes
    protected final int mediaContentViewGroupId;

    @IdRes
    protected final int optionsContentFrameLayoutId;

    @IdRes
    protected final int optionsContentViewGroupId;

    @IdRes
    protected final int starRatingContentViewGroupId;
    protected final String templateType;

    @IdRes
    protected final int titleTextViewId;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final View f8876a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8877b;

        /* renamed from: c, reason: collision with root package name */
        private int f8878c;

        /* renamed from: d, reason: collision with root package name */
        private int f8879d;

        /* renamed from: e, reason: collision with root package name */
        private int f8880e;

        /* renamed from: f, reason: collision with root package name */
        private int f8881f;

        /* renamed from: g, reason: collision with root package name */
        private int f8882g;

        /* renamed from: h, reason: collision with root package name */
        private int f8883h;

        /* renamed from: i, reason: collision with root package name */
        private int f8884i;

        /* renamed from: j, reason: collision with root package name */
        private int f8885j;

        /* renamed from: k, reason: collision with root package name */
        private int f8886k;

        /* renamed from: l, reason: collision with root package name */
        private int f8887l;

        /* renamed from: m, reason: collision with root package name */
        private int f8888m;

        /* renamed from: n, reason: collision with root package name */
        private String f8889n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f8876a, this.f8877b, this.f8878c, this.f8879d, this.f8880e, this.f8881f, this.f8882g, this.f8885j, this.f8883h, this.f8884i, this.f8886k, this.f8887l, this.f8888m, this.f8889n);
        }

        public Builder setAdvertiserTextViewId(@IdRes int i10) {
            this.f8879d = i10;
            return this;
        }

        public Builder setBodyTextViewId(@IdRes int i10) {
            this.f8880e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(@IdRes int i10) {
            this.f8888m = i10;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(@IdRes int i10) {
            this.f8882g = i10;
            return this;
        }

        public Builder setIconImageViewId(@IdRes int i10) {
            this.f8881f = i10;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(@IdRes int i10) {
            this.f8887l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(@IdRes int i10) {
            this.f8886k = i10;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(@IdRes int i10) {
            this.f8884i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(@IdRes int i10) {
            this.f8883h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(@IdRes int i10) {
            this.f8885j = i10;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f8889n = str;
            return this;
        }

        public Builder setTitleTextViewId(@IdRes int i10) {
            this.f8878c = i10;
            return this;
        }

        public Builder(@LayoutRes int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f8878c = -1;
            this.f8879d = -1;
            this.f8880e = -1;
            this.f8881f = -1;
            this.f8882g = -1;
            this.f8883h = -1;
            this.f8884i = -1;
            this.f8885j = -1;
            this.f8886k = -1;
            this.f8887l = -1;
            this.f8888m = -1;
            this.f8877b = i10;
            this.f8876a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
