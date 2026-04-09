package com.applovin.mediation.nativeAds;

import android.view.View;

/* loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final View f21967a;

        /* renamed from: b, reason: collision with root package name */
        private final int f21968b;

        /* renamed from: c, reason: collision with root package name */
        private int f21969c;

        /* renamed from: d, reason: collision with root package name */
        private int f21970d;

        /* renamed from: e, reason: collision with root package name */
        private int f21971e;

        /* renamed from: f, reason: collision with root package name */
        private int f21972f;

        /* renamed from: g, reason: collision with root package name */
        private int f21973g;

        /* renamed from: h, reason: collision with root package name */
        private int f21974h;
        private int i;

        /* renamed from: j, reason: collision with root package name */
        private int f21975j;

        /* renamed from: k, reason: collision with root package name */
        private int f21976k;

        /* renamed from: l, reason: collision with root package name */
        private int f21977l;

        /* renamed from: m, reason: collision with root package name */
        private int f21978m;

        /* renamed from: n, reason: collision with root package name */
        private String f21979n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f21967a, this.f21968b, this.f21969c, this.f21970d, this.f21971e, this.f21972f, this.f21973g, this.f21975j, this.f21974h, this.i, this.f21976k, this.f21977l, this.f21978m, this.f21979n);
        }

        public Builder setAdvertiserTextViewId(int i) {
            this.f21970d = i;
            return this;
        }

        public Builder setBodyTextViewId(int i) {
            this.f21971e = i;
            return this;
        }

        public Builder setCallToActionButtonId(int i) {
            this.f21978m = i;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(int i) {
            this.f21973g = i;
            return this;
        }

        public Builder setIconImageViewId(int i) {
            this.f21972f = i;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i) {
            this.f21977l = i;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i) {
            this.f21976k = i;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i) {
            this.i = i;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i) {
            this.f21974h = i;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i) {
            this.f21975j = i;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f21979n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i) {
            this.f21969c = i;
            return this;
        }

        public Builder(int i) {
            this(i, null);
        }

        private Builder(int i, View view) {
            this.f21969c = -1;
            this.f21970d = -1;
            this.f21971e = -1;
            this.f21972f = -1;
            this.f21973g = -1;
            this.f21974h = -1;
            this.i = -1;
            this.f21975j = -1;
            this.f21976k = -1;
            this.f21977l = -1;
            this.f21978m = -1;
            this.f21968b = i;
            this.f21967a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, String str) {
        this.mainView = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i10;
        this.advertiserTextViewId = i11;
        this.bodyTextViewId = i12;
        this.iconImageViewId = i13;
        this.iconContentViewId = i14;
        this.starRatingContentViewGroupId = i15;
        this.optionsContentViewGroupId = i16;
        this.optionsContentFrameLayoutId = i17;
        this.mediaContentViewGroupId = i18;
        this.mediaContentFrameLayoutId = i19;
        this.callToActionButtonId = i20;
        this.templateType = str;
    }
}
