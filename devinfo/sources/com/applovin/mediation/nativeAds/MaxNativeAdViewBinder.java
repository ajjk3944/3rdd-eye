package com.applovin.mediation.nativeAds;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
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

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final View f6395a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6396b;

        /* renamed from: c, reason: collision with root package name */
        private int f6397c;

        /* renamed from: d, reason: collision with root package name */
        private int f6398d;

        /* renamed from: e, reason: collision with root package name */
        private int f6399e;

        /* renamed from: f, reason: collision with root package name */
        private int f6400f;
        private int g;

        /* renamed from: h, reason: collision with root package name */
        private int f6401h;

        /* renamed from: i, reason: collision with root package name */
        private int f6402i;
        private int j;

        /* renamed from: k, reason: collision with root package name */
        private int f6403k;

        /* renamed from: l, reason: collision with root package name */
        private int f6404l;

        /* renamed from: m, reason: collision with root package name */
        private int f6405m;

        /* renamed from: n, reason: collision with root package name */
        private String f6406n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f6395a, this.f6396b, this.f6397c, this.f6398d, this.f6399e, this.f6400f, this.g, this.j, this.f6401h, this.f6402i, this.f6403k, this.f6404l, this.f6405m, this.f6406n);
        }

        public Builder setAdvertiserTextViewId(int i4) {
            this.f6398d = i4;
            return this;
        }

        public Builder setBodyTextViewId(int i4) {
            this.f6399e = i4;
            return this;
        }

        public Builder setCallToActionButtonId(int i4) {
            this.f6405m = i4;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(int i4) {
            this.g = i4;
            return this;
        }

        public Builder setIconImageViewId(int i4) {
            this.f6400f = i4;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i4) {
            this.f6404l = i4;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i4) {
            this.f6403k = i4;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i4) {
            this.f6402i = i4;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i4) {
            this.f6401h = i4;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i4) {
            this.j = i4;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f6406n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i4) {
            this.f6397c = i4;
            return this;
        }

        public Builder(int i4) {
            this(i4, null);
        }

        private Builder(int i4, View view) {
            this.f6397c = -1;
            this.f6398d = -1;
            this.f6399e = -1;
            this.f6400f = -1;
            this.g = -1;
            this.f6401h = -1;
            this.f6402i = -1;
            this.j = -1;
            this.f6403k = -1;
            this.f6404l = -1;
            this.f6405m = -1;
            this.f6396b = i4;
            this.f6395a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i4, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, String str) {
        this.mainView = view;
        this.layoutResourceId = i4;
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
