package com.github.appintro.model;

import N7.H7;
import android.os.Bundle;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: SliderPage.kt */
/* loaded from: classes.dex */
public final class SliderPage {
    private int backgroundColor;
    private int backgroundColorRes;
    private int backgroundDrawable;
    private CharSequence description;
    private int descriptionColor;
    private int descriptionColorRes;
    private String descriptionTypeface;
    private int descriptionTypefaceFontRes;
    private int imageDrawable;
    private CharSequence title;
    private int titleColor;
    private int titleColorRes;
    private String titleTypeface;
    private int titleTypefaceFontRes;

    public SliderPage() {
        this(null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 16383, null);
    }

    public final CharSequence component1() {
        return this.title;
    }

    public final int component10() {
        return this.titleTypefaceFontRes;
    }

    public final int component11() {
        return this.descriptionTypefaceFontRes;
    }

    public final String component12() {
        return this.titleTypeface;
    }

    public final String component13() {
        return this.descriptionTypeface;
    }

    public final int component14() {
        return this.backgroundDrawable;
    }

    public final CharSequence component2() {
        return this.description;
    }

    public final int component3() {
        return this.imageDrawable;
    }

    public final int component4() {
        return this.backgroundColor;
    }

    public final int component5() {
        return this.titleColor;
    }

    public final int component6() {
        return this.descriptionColor;
    }

    public final int component7() {
        return this.backgroundColorRes;
    }

    public final int component8() {
        return this.titleColorRes;
    }

    public final int component9() {
        return this.descriptionColorRes;
    }

    public final SliderPage copy(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, String str2, int i18) {
        return new SliderPage(charSequence, charSequence2, i, i10, i11, i12, i13, i14, i15, i16, i17, str, str2, i18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderPage)) {
            return false;
        }
        SliderPage sliderPage = (SliderPage) obj;
        return l.b(this.title, sliderPage.title) && l.b(this.description, sliderPage.description) && this.imageDrawable == sliderPage.imageDrawable && this.backgroundColor == sliderPage.backgroundColor && this.titleColor == sliderPage.titleColor && this.descriptionColor == sliderPage.descriptionColor && this.backgroundColorRes == sliderPage.backgroundColorRes && this.titleColorRes == sliderPage.titleColorRes && this.descriptionColorRes == sliderPage.descriptionColorRes && this.titleTypefaceFontRes == sliderPage.titleTypefaceFontRes && this.descriptionTypefaceFontRes == sliderPage.descriptionTypefaceFontRes && l.b(this.titleTypeface, sliderPage.titleTypeface) && l.b(this.descriptionTypeface, sliderPage.descriptionTypeface) && this.backgroundDrawable == sliderPage.backgroundDrawable;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBackgroundColorRes() {
        return this.backgroundColorRes;
    }

    public final int getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    public final CharSequence getDescription() {
        return this.description;
    }

    public final int getDescriptionColor() {
        return this.descriptionColor;
    }

    public final int getDescriptionColorRes() {
        return this.descriptionColorRes;
    }

    public final String getDescriptionString() {
        CharSequence charSequence = this.description;
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public final String getDescriptionTypeface() {
        return this.descriptionTypeface;
    }

    public final int getDescriptionTypefaceFontRes() {
        return this.descriptionTypefaceFontRes;
    }

    public final int getImageDrawable() {
        return this.imageDrawable;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final int getTitleColor() {
        return this.titleColor;
    }

    public final int getTitleColorRes() {
        return this.titleColorRes;
    }

    public final String getTitleString() {
        CharSequence charSequence = this.title;
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public final String getTitleTypeface() {
        return this.titleTypeface;
    }

    public final int getTitleTypefaceFontRes() {
        return this.titleTypefaceFontRes;
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.description;
        int iHashCode2 = (((((((((((((((((((iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31) + this.imageDrawable) * 31) + this.backgroundColor) * 31) + this.titleColor) * 31) + this.descriptionColor) * 31) + this.backgroundColorRes) * 31) + this.titleColorRes) * 31) + this.descriptionColorRes) * 31) + this.titleTypefaceFontRes) * 31) + this.descriptionTypefaceFontRes) * 31;
        String str = this.titleTypeface;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.descriptionTypeface;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.backgroundDrawable;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setBackgroundColorRes(int i) {
        this.backgroundColorRes = i;
    }

    public final void setBackgroundDrawable(int i) {
        this.backgroundDrawable = i;
    }

    public final void setDescription(CharSequence charSequence) {
        this.description = charSequence;
    }

    public final void setDescriptionColor(int i) {
        this.descriptionColor = i;
    }

    public final void setDescriptionColorRes(int i) {
        this.descriptionColorRes = i;
    }

    public final void setDescriptionTypeface(String str) {
        this.descriptionTypeface = str;
    }

    public final void setDescriptionTypefaceFontRes(int i) {
        this.descriptionTypefaceFontRes = i;
    }

    public final void setImageDrawable(int i) {
        this.imageDrawable = i;
    }

    public final void setTitle(CharSequence charSequence) {
        this.title = charSequence;
    }

    public final void setTitleColor(int i) {
        this.titleColor = i;
    }

    public final void setTitleColorRes(int i) {
        this.titleColorRes = i;
    }

    public final void setTitleTypeface(String str) {
        this.titleTypeface = str;
    }

    public final void setTitleTypefaceFontRes(int i) {
        this.titleTypefaceFontRes = i;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(AppIntroBaseFragmentKt.ARG_TITLE, getTitleString());
        bundle.putString(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE, this.titleTypeface);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE_RES, this.titleTypefaceFontRes);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR, this.titleColor);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR_RES, this.titleColorRes);
        bundle.putString(AppIntroBaseFragmentKt.ARG_DESC, getDescriptionString());
        bundle.putString(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE, this.descriptionTypeface);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE_RES, this.descriptionTypefaceFontRes);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR, this.descriptionColor);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR_RES, this.descriptionColorRes);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_DRAWABLE, this.imageDrawable);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_BG_COLOR, this.backgroundColor);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_BG_COLOR_RES, this.backgroundColorRes);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_BG_DRAWABLE, this.backgroundDrawable);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SliderPage(title=");
        sb.append((Object) this.title);
        sb.append(", description=");
        sb.append((Object) this.description);
        sb.append(", imageDrawable=");
        sb.append(this.imageDrawable);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", titleColor=");
        sb.append(this.titleColor);
        sb.append(", descriptionColor=");
        sb.append(this.descriptionColor);
        sb.append(", backgroundColorRes=");
        sb.append(this.backgroundColorRes);
        sb.append(", titleColorRes=");
        sb.append(this.titleColorRes);
        sb.append(", descriptionColorRes=");
        sb.append(this.descriptionColorRes);
        sb.append(", titleTypefaceFontRes=");
        sb.append(this.titleTypefaceFontRes);
        sb.append(", descriptionTypefaceFontRes=");
        sb.append(this.descriptionTypefaceFontRes);
        sb.append(", titleTypeface=");
        sb.append((Object) this.titleTypeface);
        sb.append(", descriptionTypeface=");
        sb.append((Object) this.descriptionTypeface);
        sb.append(", backgroundDrawable=");
        return H7.p(sb, this.backgroundDrawable, ')');
    }

    public SliderPage(CharSequence charSequence) {
        this(charSequence, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 16382, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2) {
        this(charSequence, charSequence2, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 16380, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i) {
        this(charSequence, charSequence2, i, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 16376, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10) {
        this(charSequence, charSequence2, i, i10, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 16368, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11) {
        this(charSequence, charSequence2, i, i10, i11, 0, 0, 0, 0, 0, 0, null, null, 0, 16352, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12) {
        this(charSequence, charSequence2, i, i10, i11, i12, 0, 0, 0, 0, 0, null, null, 0, 16320, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13) {
        this(charSequence, charSequence2, i, i10, i11, i12, i13, 0, 0, 0, 0, null, null, 0, 16256, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14) {
        this(charSequence, charSequence2, i, i10, i11, i12, i13, i14, 0, 0, 0, null, null, 0, 16128, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15) {
        this(charSequence, charSequence2, i, i10, i11, i12, i13, i14, i15, 0, 0, null, null, 0, 15872, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this(charSequence, charSequence2, i, i10, i11, i12, i13, i14, i15, i16, 0, null, null, 0, 15360, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this(charSequence, charSequence2, i, i10, i11, i12, i13, i14, i15, i16, i17, null, null, 0, 14336, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str) {
        this(charSequence, charSequence2, i, i10, i11, i12, i13, i14, i15, i16, i17, str, null, 0, 12288, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, String str2) {
        this(charSequence, charSequence2, i, i10, i11, i12, i13, i14, i15, i16, i17, str, str2, 0, 8192, null);
    }

    public SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, String str2, int i18) {
        this.title = charSequence;
        this.description = charSequence2;
        this.imageDrawable = i;
        this.backgroundColor = i10;
        this.titleColor = i11;
        this.descriptionColor = i12;
        this.backgroundColorRes = i13;
        this.titleColorRes = i14;
        this.descriptionColorRes = i15;
        this.titleTypefaceFontRes = i16;
        this.descriptionTypefaceFontRes = i17;
        this.titleTypeface = str;
        this.descriptionTypeface = str2;
        this.backgroundDrawable = i18;
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getDescriptionColor$annotations() {
    }

    public static /* synthetic */ void getTitleColor$annotations() {
    }

    public /* synthetic */ SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, String str2, int i18, int i19, g gVar) {
        this((i19 & 1) != 0 ? null : charSequence, (i19 & 2) != 0 ? null : charSequence2, (i19 & 4) != 0 ? 0 : i, (i19 & 8) != 0 ? 0 : i10, (i19 & 16) != 0 ? 0 : i11, (i19 & 32) != 0 ? 0 : i12, (i19 & 64) != 0 ? 0 : i13, (i19 & 128) != 0 ? 0 : i14, (i19 & 256) != 0 ? 0 : i15, (i19 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 0 : i16, (i19 & 1024) != 0 ? 0 : i17, (i19 & 2048) != 0 ? null : str, (i19 & 4096) == 0 ? str2 : null, (i19 & 8192) != 0 ? 0 : i18);
    }
}
