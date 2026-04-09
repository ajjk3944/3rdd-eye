package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public class yf1 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35782b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35783c;

    public yf1(String str, Exception exc, boolean z10, int i) {
        super(str, exc);
        this.f35782b = z10;
        this.f35783c = i;
    }

    public static yf1 a(String str, IllegalArgumentException illegalArgumentException) {
        return new yf1(str, illegalArgumentException, true, 0);
    }

    public static yf1 a(String str, Exception exc) {
        return new yf1(str, exc, true, 1);
    }

    public static yf1 a(String str) {
        return new yf1(str, null, false, 1);
    }
}
