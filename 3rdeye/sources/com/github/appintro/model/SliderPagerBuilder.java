package com.github.appintro.model;

import kotlin.jvm.internal.l;

/* compiled from: SliderPagerBuilder.kt */
/* loaded from: classes.dex */
public final class SliderPagerBuilder {
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

    public final SliderPagerBuilder backgroundColor(int i) {
        this.backgroundColor = i;
        return this;
    }

    public final SliderPagerBuilder backgroundColorRes(int i) {
        this.backgroundColorRes = i;
        return this;
    }

    public final SliderPagerBuilder backgroundDrawable(int i) {
        this.backgroundDrawable = i;
        return this;
    }

    public final SliderPage build() {
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = this.description;
        int i = this.imageDrawable;
        int i10 = this.backgroundColor;
        int i11 = this.backgroundColorRes;
        int i12 = this.titleColor;
        int i13 = this.titleColorRes;
        int i14 = this.descriptionColor;
        int i15 = this.descriptionColorRes;
        int i16 = this.titleTypefaceFontRes;
        String str = this.descriptionTypeface;
        return new SliderPage(charSequence, charSequence2, i, i10, i12, i14, i11, i13, i15, i16, this.descriptionTypefaceFontRes, this.titleTypeface, str, this.backgroundDrawable);
    }

    public final SliderPagerBuilder description(CharSequence description) {
        l.f(description, "description");
        this.description = description;
        return this;
    }

    public final SliderPagerBuilder descriptionColor(int i) {
        this.descriptionColor = i;
        return this;
    }

    public final SliderPagerBuilder descriptionColorRes(int i) {
        this.descriptionColorRes = i;
        return this;
    }

    public final SliderPagerBuilder descriptionTypeface(String descriptionTypeface) {
        l.f(descriptionTypeface, "descriptionTypeface");
        this.descriptionTypeface = descriptionTypeface;
        return this;
    }

    public final SliderPagerBuilder descriptionTypefaceFontRes(int i) {
        this.descriptionTypefaceFontRes = i;
        return this;
    }

    public final SliderPagerBuilder imageDrawable(int i) {
        this.imageDrawable = i;
        return this;
    }

    public final SliderPagerBuilder title(CharSequence title) {
        l.f(title, "title");
        this.title = title;
        return this;
    }

    public final SliderPagerBuilder titleColor(int i) {
        this.titleColor = i;
        return this;
    }

    public final SliderPagerBuilder titleColorRes(int i) {
        this.titleColorRes = i;
        return this;
    }

    public final SliderPagerBuilder titleTypeface(String titleTypeface) {
        l.f(titleTypeface, "titleTypeface");
        this.titleTypeface = titleTypeface;
        return this;
    }

    public final SliderPagerBuilder titleTypefaceFontRes(int i) {
        this.titleTypefaceFontRes = i;
        return this;
    }
}
