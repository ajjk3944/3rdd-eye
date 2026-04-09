package com.yandex.mobile.ads.nativeads.template.appearance;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.yt;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class NativeTemplateAppearance implements Parcelable, yt {
    public static final Parcelable.Creator<NativeTemplateAppearance> CREATOR = new a();

    /* renamed from: n, reason: collision with root package name */
    private static final int f36898n = Color.parseColor("#7f7f7f");

    /* renamed from: o, reason: collision with root package name */
    private static final int f36899o = Color.parseColor("#ffd200");

    /* renamed from: p, reason: collision with root package name */
    private static final int f36900p = Color.parseColor("#ffd200");

    /* renamed from: q, reason: collision with root package name */
    private static final int f36901q = Color.parseColor("#f4c900");

    /* renamed from: b, reason: collision with root package name */
    private final BannerAppearance f36902b;

    /* renamed from: c, reason: collision with root package name */
    private final TextAppearance f36903c;

    /* renamed from: d, reason: collision with root package name */
    private final TextAppearance f36904d;

    /* renamed from: e, reason: collision with root package name */
    private final TextAppearance f36905e;

    /* renamed from: f, reason: collision with root package name */
    private final TextAppearance f36906f;

    /* renamed from: g, reason: collision with root package name */
    private final TextAppearance f36907g;

    /* renamed from: h, reason: collision with root package name */
    private final TextAppearance f36908h;
    private final TextAppearance i;

    /* renamed from: j, reason: collision with root package name */
    private final ImageAppearance f36909j;

    /* renamed from: k, reason: collision with root package name */
    private final ImageAppearance f36910k;

    /* renamed from: l, reason: collision with root package name */
    private final ButtonAppearance f36911l;

    /* renamed from: m, reason: collision with root package name */
    private final RatingAppearance f36912m;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private BannerAppearance f36913a = b();

        /* renamed from: k, reason: collision with root package name */
        private ButtonAppearance f36922k = d();
        private ImageAppearance i = g();

        /* renamed from: j, reason: collision with root package name */
        private ImageAppearance f36921j = f();

        /* renamed from: l, reason: collision with root package name */
        private RatingAppearance f36923l = h();

        /* renamed from: b, reason: collision with root package name */
        private TextAppearance f36914b = a();

        /* renamed from: c, reason: collision with root package name */
        private TextAppearance f36915c = c();

        /* renamed from: d, reason: collision with root package name */
        private TextAppearance f36916d = e();

        /* renamed from: e, reason: collision with root package name */
        private TextAppearance f36917e = i();

        /* renamed from: f, reason: collision with root package name */
        private TextAppearance f36918f = j();

        /* renamed from: g, reason: collision with root package name */
        private TextAppearance f36919g = k();

        /* renamed from: h, reason: collision with root package name */
        private TextAppearance f36920h = l();

        private static TextAppearance a() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f36898n).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static BannerAppearance b() {
            return new BannerAppearance.Builder().setBackgroundColor(-1).setBorderColor(jh2.a(-16777216, 90.0f)).setBorderWidth(1.0f).setContentPadding(new HorizontalOffset(10.0f, 10.0f)).setImageMargins(new HorizontalOffset(0.0f, 10.0f)).build();
        }

        private static TextAppearance c() {
            return new TextAppearance.Builder().setTextColor(-16777216).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static ButtonAppearance d() {
            return new ButtonAppearance.Builder().setBorderColor(NativeTemplateAppearance.f36899o).setBorderWidth(1.0f).setNormalColor(-1).setPressedColor(NativeTemplateAppearance.f36900p).setTextAppearance(new TextAppearance.Builder().setTextColor(-16777216).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build()).build();
        }

        private static TextAppearance e() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f36898n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static ImageAppearance f() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.FIXED, 16.0f)).build();
        }

        private static ImageAppearance g() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.PREFERRED_RATIO, 0.3f)).build();
        }

        private static RatingAppearance h() {
            return new RatingAppearance.Builder().setBackgroundStarColor(-3355444).setProgressStarColor(NativeTemplateAppearance.f36901q).build();
        }

        private static TextAppearance i() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f36898n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static TextAppearance j() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f36898n).setTextSize(11.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static TextAppearance k() {
            return new TextAppearance.Builder().setTextColor(-16777216).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(1).build();
        }

        private static TextAppearance l() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f36898n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        public final NativeTemplateAppearance build() {
            return new NativeTemplateAppearance(this.f36913a, this.f36914b, this.f36915c, this.f36916d, this.f36917e, this.f36918f, this.f36919g, this.f36920h, this.f36921j, this.i, this.f36922k, this.f36923l, null);
        }

        public final Builder withAgeAppearance(TextAppearance ageAppearance) {
            l.f(ageAppearance, "ageAppearance");
            TextAppearance textAppearance = this.f36914b;
            l.f(textAppearance, "textAppearance");
            if (!textAppearance.equals(ageAppearance)) {
                int textColor = ageAppearance.getTextColor();
                float textSize = ageAppearance.getTextSize();
                String fontFamilyName = ageAppearance.getFontFamilyName();
                int fontStyle = ageAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f36914b = textAppearance;
            return this;
        }

        public final Builder withBannerAppearance(BannerAppearance bannerAppearance) {
            l.f(bannerAppearance, "bannerAppearance");
            BannerAppearance bannerAppearance2 = this.f36913a;
            l.f(bannerAppearance2, "bannerAppearance");
            if (!bannerAppearance2.equals(bannerAppearance)) {
                int backgroundColor = bannerAppearance.getBackgroundColor();
                if (backgroundColor == 0) {
                    backgroundColor = bannerAppearance2.getBackgroundColor();
                }
                int borderColor = bannerAppearance.getBorderColor();
                if (borderColor == 0) {
                    borderColor = bannerAppearance2.getBorderColor();
                }
                float borderWidth = bannerAppearance.getBorderWidth();
                if (borderWidth < 0.0f) {
                    borderWidth = bannerAppearance2.getBorderWidth();
                }
                HorizontalOffset contentPadding = bannerAppearance2.getContentPadding();
                if (contentPadding != null) {
                    HorizontalOffset contentPadding2 = bannerAppearance.getContentPadding();
                    if (contentPadding2 != null && !contentPadding.equals(contentPadding2)) {
                        contentPadding = new HorizontalOffset(contentPadding2.getLeft() >= 0.0f ? contentPadding2.getLeft() : 0.0f, contentPadding2.getRight() >= 0.0f ? contentPadding2.getRight() : 0.0f);
                    }
                } else {
                    contentPadding = null;
                }
                HorizontalOffset imageMargins = bannerAppearance.getImageMargins();
                if (imageMargins == null) {
                    imageMargins = bannerAppearance2.getImageMargins();
                }
                BannerAppearance.Builder builder = new BannerAppearance.Builder();
                builder.setBackgroundColor(backgroundColor);
                builder.setBorderColor(borderColor);
                builder.setBorderWidth(borderWidth);
                if (contentPadding != null) {
                    builder.setContentPadding(contentPadding);
                }
                if (imageMargins != null) {
                    builder.setImageMargins(imageMargins);
                }
                bannerAppearance2 = builder.build();
            }
            this.f36913a = bannerAppearance2;
            return this;
        }

        public final Builder withBodyAppearance(TextAppearance bodyAppearance) {
            l.f(bodyAppearance, "bodyAppearance");
            TextAppearance textAppearance = this.f36915c;
            l.f(textAppearance, "textAppearance");
            if (!textAppearance.equals(bodyAppearance)) {
                int textColor = bodyAppearance.getTextColor();
                float textSize = bodyAppearance.getTextSize();
                String fontFamilyName = bodyAppearance.getFontFamilyName();
                int fontStyle = bodyAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f36915c = textAppearance;
            return this;
        }

        public final Builder withCallToActionAppearance(ButtonAppearance appearance) {
            l.f(appearance, "appearance");
            ButtonAppearance buttonAppearance = this.f36922k;
            l.f(buttonAppearance, "buttonAppearance");
            if (!buttonAppearance.equals(appearance)) {
                TextAppearance textAppearance = buttonAppearance.getTextAppearance();
                if (textAppearance != null) {
                    TextAppearance textAppearance2 = appearance.getTextAppearance();
                    if (textAppearance2 != null && !textAppearance.equals(textAppearance2)) {
                        int textColor = textAppearance2.getTextColor();
                        float textSize = textAppearance2.getTextSize();
                        String fontFamilyName = textAppearance2.getFontFamilyName();
                        int fontStyle = textAppearance2.getFontStyle();
                        if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                            fontFamilyName = textAppearance.getFontFamilyName();
                        }
                        TextAppearance.Builder builder = new TextAppearance.Builder();
                        if (textColor == 0) {
                            textColor = textAppearance.getTextColor();
                        }
                        TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                        if (textSize < 1.0f) {
                            textSize = textAppearance.getTextSize();
                        }
                        textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
                    }
                } else {
                    textAppearance = null;
                }
                int borderColor = appearance.getBorderColor();
                float borderWidth = appearance.getBorderWidth();
                int normalColor = appearance.getNormalColor();
                int pressedColor = appearance.getPressedColor();
                ButtonAppearance.Builder builder2 = new ButtonAppearance.Builder();
                if (textAppearance != null) {
                    builder2.setTextAppearance(textAppearance);
                }
                if (borderColor == 0) {
                    borderColor = buttonAppearance.getBorderColor();
                }
                builder2.setBorderColor(borderColor);
                if (borderWidth < 0.0f) {
                    borderWidth = buttonAppearance.getBorderWidth();
                }
                builder2.setBorderWidth(borderWidth);
                if (normalColor == 0) {
                    normalColor = buttonAppearance.getNormalColor();
                }
                builder2.setNormalColor(normalColor);
                if (pressedColor == 0) {
                    pressedColor = buttonAppearance.getPressedColor();
                }
                builder2.setPressedColor(pressedColor);
                buttonAppearance = builder2.build();
            }
            this.f36922k = buttonAppearance;
            return this;
        }

        public final Builder withDomainAppearance(TextAppearance domainAppearance) {
            l.f(domainAppearance, "domainAppearance");
            TextAppearance textAppearance = this.f36916d;
            l.f(textAppearance, "textAppearance");
            if (!textAppearance.equals(domainAppearance)) {
                int textColor = domainAppearance.getTextColor();
                float textSize = domainAppearance.getTextSize();
                String fontFamilyName = domainAppearance.getFontFamilyName();
                int fontStyle = domainAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f36916d = textAppearance;
            return this;
        }

        public final Builder withFaviconAppearance(ImageAppearance faviconAppearance) {
            l.f(faviconAppearance, "faviconAppearance");
            ImageAppearance imageAppearance = this.f36921j;
            l.f(imageAppearance, "imageAppearance");
            if (!imageAppearance.equals(faviconAppearance)) {
                SizeConstraint widthConstraint = faviconAppearance.getWidthConstraint();
                if (widthConstraint == null) {
                    widthConstraint = imageAppearance.getWidthConstraint();
                }
                ImageAppearance.Builder builder = new ImageAppearance.Builder();
                if (widthConstraint != null) {
                    builder.setWidthConstraint(widthConstraint);
                }
                imageAppearance = builder.build();
            }
            this.f36921j = imageAppearance;
            return this;
        }

        public final Builder withImageAppearance(ImageAppearance imageAppearance) {
            l.f(imageAppearance, "imageAppearance");
            ImageAppearance imageAppearance2 = this.i;
            l.f(imageAppearance2, "imageAppearance");
            if (!imageAppearance2.equals(imageAppearance)) {
                SizeConstraint widthConstraint = imageAppearance.getWidthConstraint();
                if (widthConstraint == null) {
                    widthConstraint = imageAppearance2.getWidthConstraint();
                }
                ImageAppearance.Builder builder = new ImageAppearance.Builder();
                if (widthConstraint != null) {
                    builder.setWidthConstraint(widthConstraint);
                }
                imageAppearance2 = builder.build();
            }
            this.i = imageAppearance2;
            return this;
        }

        public final Builder withRatingAppearance(RatingAppearance ratingAppearance) {
            l.f(ratingAppearance, "ratingAppearance");
            RatingAppearance ratingAppearance2 = this.f36923l;
            l.f(ratingAppearance2, "ratingAppearance");
            if (!ratingAppearance2.equals(ratingAppearance)) {
                int backgroundStarColor = ratingAppearance.getBackgroundStarColor();
                int progressStarColor = ratingAppearance.getProgressStarColor();
                if (backgroundStarColor == 0) {
                    backgroundStarColor = ratingAppearance2.getBackgroundStarColor();
                }
                if (progressStarColor == 0) {
                    progressStarColor = ratingAppearance2.getProgressStarColor();
                }
                ratingAppearance2 = new RatingAppearance.Builder().setBackgroundStarColor(backgroundStarColor).setProgressStarColor(progressStarColor).build();
            }
            this.f36923l = ratingAppearance2;
            return this;
        }

        public final Builder withReviewCountAppearance(TextAppearance reviewCountAppearance) {
            l.f(reviewCountAppearance, "reviewCountAppearance");
            TextAppearance textAppearance = this.f36917e;
            l.f(textAppearance, "textAppearance");
            if (!textAppearance.equals(reviewCountAppearance)) {
                int textColor = reviewCountAppearance.getTextColor();
                float textSize = reviewCountAppearance.getTextSize();
                String fontFamilyName = reviewCountAppearance.getFontFamilyName();
                int fontStyle = reviewCountAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f36917e = textAppearance;
            return this;
        }

        public final Builder withSponsoredAppearance(TextAppearance sponsoredAppearance) {
            l.f(sponsoredAppearance, "sponsoredAppearance");
            TextAppearance textAppearance = this.f36918f;
            l.f(textAppearance, "textAppearance");
            if (!textAppearance.equals(sponsoredAppearance)) {
                int textColor = sponsoredAppearance.getTextColor();
                float textSize = sponsoredAppearance.getTextSize();
                String fontFamilyName = sponsoredAppearance.getFontFamilyName();
                int fontStyle = sponsoredAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f36918f = textAppearance;
            return this;
        }

        public final Builder withTitleAppearance(TextAppearance titleAppearance) {
            l.f(titleAppearance, "titleAppearance");
            TextAppearance textAppearance = this.f36919g;
            l.f(textAppearance, "textAppearance");
            if (!textAppearance.equals(titleAppearance)) {
                int textColor = titleAppearance.getTextColor();
                float textSize = titleAppearance.getTextSize();
                String fontFamilyName = titleAppearance.getFontFamilyName();
                int fontStyle = titleAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f36919g = textAppearance;
            return this;
        }

        public final Builder withWarningAppearance(TextAppearance warningAppearance) {
            l.f(warningAppearance, "warningAppearance");
            TextAppearance textAppearance = this.f36920h;
            l.f(textAppearance, "textAppearance");
            if (!textAppearance.equals(warningAppearance)) {
                int textColor = warningAppearance.getTextColor();
                float textSize = warningAppearance.getTextSize();
                String fontFamilyName = warningAppearance.getFontFamilyName();
                int fontStyle = warningAppearance.getFontStyle();
                if (fontFamilyName == null || fontFamilyName.length() <= 0) {
                    fontFamilyName = textAppearance.getFontFamilyName();
                }
                TextAppearance.Builder builder = new TextAppearance.Builder();
                if (textColor == 0) {
                    textColor = textAppearance.getTextColor();
                }
                TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
                if (textSize < 1.0f) {
                    textSize = textAppearance.getTextSize();
                }
                textAppearance = textColor2.setTextSize(textSize).setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
            }
            this.f36920h = textAppearance;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<NativeTemplateAppearance> {
        @Override // android.os.Parcelable.Creator
        public final NativeTemplateAppearance createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            BannerAppearance bannerAppearanceCreateFromParcel = BannerAppearance.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<TextAppearance> creator = TextAppearance.CREATOR;
            TextAppearance textAppearanceCreateFromParcel = creator.createFromParcel(parcel);
            TextAppearance textAppearanceCreateFromParcel2 = creator.createFromParcel(parcel);
            TextAppearance textAppearanceCreateFromParcel3 = creator.createFromParcel(parcel);
            TextAppearance textAppearanceCreateFromParcel4 = creator.createFromParcel(parcel);
            TextAppearance textAppearanceCreateFromParcel5 = creator.createFromParcel(parcel);
            TextAppearance textAppearanceCreateFromParcel6 = creator.createFromParcel(parcel);
            TextAppearance textAppearanceCreateFromParcel7 = creator.createFromParcel(parcel);
            Parcelable.Creator<ImageAppearance> creator2 = ImageAppearance.CREATOR;
            return new NativeTemplateAppearance(bannerAppearanceCreateFromParcel, textAppearanceCreateFromParcel, textAppearanceCreateFromParcel2, textAppearanceCreateFromParcel3, textAppearanceCreateFromParcel4, textAppearanceCreateFromParcel5, textAppearanceCreateFromParcel6, textAppearanceCreateFromParcel7, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), ButtonAppearance.CREATOR.createFromParcel(parcel), RatingAppearance.CREATOR.createFromParcel(parcel), null);
        }

        @Override // android.os.Parcelable.Creator
        public final NativeTemplateAppearance[] newArray(int i) {
            return new NativeTemplateAppearance[i];
        }
    }

    public /* synthetic */ NativeTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, TextAppearance textAppearance4, TextAppearance textAppearance5, TextAppearance textAppearance6, TextAppearance textAppearance7, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, RatingAppearance ratingAppearance, g gVar) {
        this(bannerAppearance, textAppearance, textAppearance2, textAppearance3, textAppearance4, textAppearance5, textAppearance6, textAppearance7, imageAppearance, imageAppearance2, buttonAppearance, ratingAppearance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NativeTemplateAppearance.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance");
        NativeTemplateAppearance nativeTemplateAppearance = (NativeTemplateAppearance) obj;
        if (l.b(getBannerAppearance(), nativeTemplateAppearance.getBannerAppearance()) && l.b(getAgeAppearance(), nativeTemplateAppearance.getAgeAppearance()) && l.b(getBodyAppearance(), nativeTemplateAppearance.getBodyAppearance()) && l.b(getDomainAppearance(), nativeTemplateAppearance.getDomainAppearance()) && l.b(getReviewCountAppearance(), nativeTemplateAppearance.getReviewCountAppearance()) && l.b(getSponsoredAppearance(), nativeTemplateAppearance.getSponsoredAppearance()) && l.b(getTitleAppearance(), nativeTemplateAppearance.getTitleAppearance()) && l.b(getWarningAppearance(), nativeTemplateAppearance.getWarningAppearance()) && l.b(getFaviconAppearance(), nativeTemplateAppearance.getFaviconAppearance()) && l.b(getImageAppearance(), nativeTemplateAppearance.getImageAppearance()) && l.b(getCallToActionAppearance(), nativeTemplateAppearance.getCallToActionAppearance())) {
            return l.b(getRatingAppearance(), nativeTemplateAppearance.getRatingAppearance());
        }
        return false;
    }

    public int hashCode() {
        return getRatingAppearance().hashCode() + ((getCallToActionAppearance().hashCode() + ((getImageAppearance().hashCode() + ((getFaviconAppearance().hashCode() + ((getWarningAppearance().hashCode() + ((getTitleAppearance().hashCode() + ((getSponsoredAppearance().hashCode() + ((getReviewCountAppearance().hashCode() + ((getDomainAppearance().hashCode() + ((getBodyAppearance().hashCode() + ((getAgeAppearance().hashCode() + (getBannerAppearance().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        l.f(out, "out");
        this.f36902b.writeToParcel(out, i);
        this.f36903c.writeToParcel(out, i);
        this.f36904d.writeToParcel(out, i);
        this.f36905e.writeToParcel(out, i);
        this.f36906f.writeToParcel(out, i);
        this.f36907g.writeToParcel(out, i);
        this.f36908h.writeToParcel(out, i);
        this.i.writeToParcel(out, i);
        this.f36909j.writeToParcel(out, i);
        this.f36910k.writeToParcel(out, i);
        this.f36911l.writeToParcel(out, i);
        this.f36912m.writeToParcel(out, i);
    }

    private NativeTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, TextAppearance textAppearance4, TextAppearance textAppearance5, TextAppearance textAppearance6, TextAppearance textAppearance7, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, RatingAppearance ratingAppearance) {
        this.f36902b = bannerAppearance;
        this.f36903c = textAppearance;
        this.f36904d = textAppearance2;
        this.f36905e = textAppearance3;
        this.f36906f = textAppearance4;
        this.f36907g = textAppearance5;
        this.f36908h = textAppearance6;
        this.i = textAppearance7;
        this.f36909j = imageAppearance;
        this.f36910k = imageAppearance2;
        this.f36911l = buttonAppearance;
        this.f36912m = ratingAppearance;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public TextAppearance getAgeAppearance() {
        return this.f36903c;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public BannerAppearance getBannerAppearance() {
        return this.f36902b;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public TextAppearance getBodyAppearance() {
        return this.f36904d;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public ButtonAppearance getCallToActionAppearance() {
        return this.f36911l;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public TextAppearance getDomainAppearance() {
        return this.f36905e;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public ImageAppearance getFaviconAppearance() {
        return this.f36909j;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public ImageAppearance getImageAppearance() {
        return this.f36910k;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public RatingAppearance getRatingAppearance() {
        return this.f36912m;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public TextAppearance getReviewCountAppearance() {
        return this.f36906f;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public TextAppearance getSponsoredAppearance() {
        return this.f36907g;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public TextAppearance getTitleAppearance() {
        return this.f36908h;
    }

    @Override // com.yandex.mobile.ads.impl.yt
    public TextAppearance getWarningAppearance() {
        return this.i;
    }
}
