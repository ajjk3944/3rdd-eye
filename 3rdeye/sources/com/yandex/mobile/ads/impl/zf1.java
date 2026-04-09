package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zf1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f36462a = "Yandex";

    /* renamed from: b, reason: collision with root package name */
    private final String f36463b = "7.14.0";

    private zf1() {
    }

    public static zf1 a() {
        if (TextUtils.isEmpty("Yandex")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty("7.14.0")) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new zf1();
    }

    public final String b() {
        return this.f36462a;
    }

    public final String c() {
        return this.f36463b;
    }
}
