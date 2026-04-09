package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.net.URL;

/* loaded from: classes3.dex */
public final class ra2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f32575a;

    /* renamed from: b, reason: collision with root package name */
    private final URL f32576b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32577c;

    private ra2(String str, URL url, String str2) {
        this.f32575a = str;
        this.f32576b = url;
        this.f32577c = str2;
    }

    public static ra2 a(String str, URL url, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("VendorKey is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("VerificationParameters is null or empty");
        }
        return new ra2(str, url, str2);
    }

    public final String b() {
        return this.f32575a;
    }

    public final String c() {
        return this.f32577c;
    }

    public static ra2 a(URL url) {
        return new ra2(null, url, null);
    }

    public final URL a() {
        return this.f32576b;
    }
}
