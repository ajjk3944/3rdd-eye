package com.bumptech.glide.load;

import x7.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF("GIF"),
    JPEG("JPEG"),
    RAW("RAW"),
    PNG_A("PNG_A"),
    PNG("PNG"),
    WEBP_A("WEBP_A"),
    WEBP("WEBP"),
    ANIMATED_WEBP("ANIMATED_WEBP"),
    AVIF("AVIF"),
    ANIMATED_AVIF("ANIMATED_AVIF"),
    UNKNOWN("UNKNOWN");


    /* renamed from: a, reason: collision with root package name */
    public final boolean f6513a;

    ImageHeaderParser$ImageType(String str) {
        this.f6513a = z;
    }

    public boolean hasAlpha() {
        return this.f6513a;
    }

    public boolean isWebp() {
        int i4 = c.f36997a[ordinal()];
        return i4 == 1 || i4 == 2 || i4 == 3;
    }
}
