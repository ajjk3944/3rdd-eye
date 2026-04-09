package com.bumptech.glide.load;

import l1.AbstractC2637c;

/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* renamed from: a, reason: collision with root package name */
    public final boolean f6535a;

    ImageHeaderParser$ImageType(boolean z6) {
        this.f6535a = z6;
    }

    public boolean hasAlpha() {
        return this.f6535a;
    }

    public boolean isWebp() {
        int i = AbstractC2637c.f21816a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
