package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11722a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11723b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f11724c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f11725d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11726e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11727f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11728h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11729i;
    public final int j;

    public h7(String str, int i4, Integer num, Integer num2, float f10, boolean z3, boolean z10, boolean z11, boolean z12, int i10) {
        this.f11722a = str;
        this.f11723b = i4;
        this.f11724c = num;
        this.f11725d = num2;
        this.f11726e = f10;
        this.f11727f = z3;
        this.g = z10;
        this.f11728h = z11;
        this.f11729i = z12;
        this.j = i10;
    }

    public static Integer a(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            mq0.m(j <= 4294967295L);
            return Integer.valueOf(Color.argb(al0.d(((j >> 24) & 255) ^ 255), al0.d(j & 255), al0.d((j >> 8) & 255), al0.d((j >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            ls.y("SsaStyle", r5.c.m(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e2);
            return null;
        }
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i4 = Integer.parseInt(str);
            return i4 == 1 || i4 == -1;
        } catch (NumberFormatException e2) {
            ls.y("SsaStyle", r5.c.m(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e2);
            return false;
        }
    }
}
