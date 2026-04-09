package com.monetization.ads.mediation.nativeads;

import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class MediatedNativeAdAssets {

    /* renamed from: a, reason: collision with root package name */
    private final String f23726a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23727b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23728c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23729d;

    /* renamed from: e, reason: collision with root package name */
    private final MediatedNativeAdImage f23730e;

    /* renamed from: f, reason: collision with root package name */
    private final MediatedNativeAdImage f23731f;

    /* renamed from: g, reason: collision with root package name */
    private final MediatedNativeAdImage f23732g;

    /* renamed from: h, reason: collision with root package name */
    private final MediatedNativeAdMedia f23733h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final String f23734j;

    /* renamed from: k, reason: collision with root package name */
    private final String f23735k;

    /* renamed from: l, reason: collision with root package name */
    private final String f23736l;

    /* renamed from: m, reason: collision with root package name */
    private final String f23737m;

    /* renamed from: n, reason: collision with root package name */
    private final String f23738n;

    /* renamed from: o, reason: collision with root package name */
    private final MediatedNativeAdImage f23739o;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f23740a;

        /* renamed from: b, reason: collision with root package name */
        private String f23741b;

        /* renamed from: c, reason: collision with root package name */
        private String f23742c;

        /* renamed from: d, reason: collision with root package name */
        private String f23743d;

        /* renamed from: e, reason: collision with root package name */
        private MediatedNativeAdImage f23744e;

        /* renamed from: f, reason: collision with root package name */
        private MediatedNativeAdImage f23745f;

        /* renamed from: g, reason: collision with root package name */
        private MediatedNativeAdImage f23746g;

        /* renamed from: h, reason: collision with root package name */
        private MediatedNativeAdMedia f23747h;
        private String i;

        /* renamed from: j, reason: collision with root package name */
        private String f23748j;

        /* renamed from: k, reason: collision with root package name */
        private String f23749k;

        /* renamed from: l, reason: collision with root package name */
        private String f23750l;

        /* renamed from: m, reason: collision with root package name */
        private String f23751m;

        /* renamed from: n, reason: collision with root package name */
        private String f23752n;

        /* renamed from: o, reason: collision with root package name */
        private MediatedNativeAdImage f23753o;

        public final MediatedNativeAdAssets build() {
            return new MediatedNativeAdAssets(this.f23740a, this.f23741b, this.f23742c, this.f23743d, this.f23744e, this.f23745f, this.f23746g, this.f23747h, this.i, this.f23748j, this.f23749k, this.f23750l, this.f23751m, this.f23752n, this.f23753o, null);
        }

        public final Builder setAge(String str) {
            this.f23740a = str;
            return this;
        }

        public final Builder setBody(String str) {
            this.f23741b = str;
            return this;
        }

        public final Builder setCallToAction(String str) {
            this.f23742c = str;
            return this;
        }

        public final Builder setDomain(String str) {
            this.f23743d = str;
            return this;
        }

        public final Builder setFavicon(MediatedNativeAdImage mediatedNativeAdImage) {
            this.f23744e = mediatedNativeAdImage;
            return this;
        }

        public final Builder setFeedback(MediatedNativeAdImage mediatedNativeAdImage) {
            this.f23753o = mediatedNativeAdImage;
            return this;
        }

        public final Builder setIcon(MediatedNativeAdImage mediatedNativeAdImage) {
            this.f23745f = mediatedNativeAdImage;
            return this;
        }

        public final Builder setImage(MediatedNativeAdImage mediatedNativeAdImage) {
            this.f23746g = mediatedNativeAdImage;
            return this;
        }

        public final Builder setMedia(MediatedNativeAdMedia mediatedNativeAdMedia) {
            this.f23747h = mediatedNativeAdMedia;
            return this;
        }

        public final Builder setPrice(String str) {
            this.i = str;
            return this;
        }

        public final Builder setRating(String str) {
            this.f23748j = str;
            return this;
        }

        public final Builder setReviewCount(String str) {
            this.f23749k = str;
            return this;
        }

        public final Builder setSponsored(String str) {
            this.f23750l = str;
            return this;
        }

        public final Builder setTitle(String str) {
            this.f23751m = str;
            return this;
        }

        public final Builder setWarning(String str) {
            this.f23752n = str;
            return this;
        }
    }

    public /* synthetic */ MediatedNativeAdAssets(String str, String str2, String str3, String str4, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdImage mediatedNativeAdImage2, MediatedNativeAdImage mediatedNativeAdImage3, MediatedNativeAdMedia mediatedNativeAdMedia, String str5, String str6, String str7, String str8, String str9, String str10, MediatedNativeAdImage mediatedNativeAdImage4, g gVar) {
        this(str, str2, str3, str4, mediatedNativeAdImage, mediatedNativeAdImage2, mediatedNativeAdImage3, mediatedNativeAdMedia, str5, str6, str7, str8, str9, str10, mediatedNativeAdImage4);
    }

    public final String getAge() {
        return this.f23726a;
    }

    public final String getBody() {
        return this.f23727b;
    }

    public final String getCallToAction() {
        return this.f23728c;
    }

    public final String getDomain() {
        return this.f23729d;
    }

    public final MediatedNativeAdImage getFavicon() {
        return this.f23730e;
    }

    public final MediatedNativeAdImage getFeedback() {
        return this.f23739o;
    }

    public final MediatedNativeAdImage getIcon() {
        return this.f23731f;
    }

    public final MediatedNativeAdImage getImage() {
        return this.f23732g;
    }

    public final MediatedNativeAdMedia getMedia() {
        return this.f23733h;
    }

    public final String getPrice() {
        return this.i;
    }

    public final String getRating() {
        return this.f23734j;
    }

    public final String getReviewCount() {
        return this.f23735k;
    }

    public final String getSponsored() {
        return this.f23736l;
    }

    public final String getTitle() {
        return this.f23737m;
    }

    public final String getWarning() {
        return this.f23738n;
    }

    private MediatedNativeAdAssets(String str, String str2, String str3, String str4, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdImage mediatedNativeAdImage2, MediatedNativeAdImage mediatedNativeAdImage3, MediatedNativeAdMedia mediatedNativeAdMedia, String str5, String str6, String str7, String str8, String str9, String str10, MediatedNativeAdImage mediatedNativeAdImage4) {
        this.f23726a = str;
        this.f23727b = str2;
        this.f23728c = str3;
        this.f23729d = str4;
        this.f23730e = mediatedNativeAdImage;
        this.f23731f = mediatedNativeAdImage2;
        this.f23732g = mediatedNativeAdImage3;
        this.f23733h = mediatedNativeAdMedia;
        this.i = str5;
        this.f23734j = str6;
        this.f23735k = str7;
        this.f23736l = str8;
        this.f23737m = str9;
        this.f23738n = str10;
        this.f23739o = mediatedNativeAdImage4;
    }
}
