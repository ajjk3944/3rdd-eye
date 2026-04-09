package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* renamed from: com.google.android.gms.internal.ads.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242h3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14419a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14420b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14421c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f14422d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14423e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14424f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14425g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14426h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14427j;

    public C1242h3(String str, int i, Integer num, Integer num2, float f2, boolean z6, boolean z7, boolean z8, boolean z9, int i3) {
        this.f14419a = str;
        this.f14420b = i;
        this.f14421c = num;
        this.f14422d = num2;
        this.f14423e = f2;
        this.f14424f = z6;
        this.f14425g = z7;
        this.f14426h = z8;
        this.i = z9;
        this.f14427j = i3;
    }

    public static Integer a(String str) {
        try {
            long j6 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC0582Jp.m(j6 <= 4294967295L);
            return Integer.valueOf(Color.argb(Cr.b(((j6 >> 24) & 255) ^ 255), Cr.b(j6 & 255), Cr.b((j6 >> 8) & 255), Cr.b((j6 >> 16) & 255)));
        } catch (IllegalArgumentException e6) {
            AbstractC2022vd.z("SsaStyle", AbstractC1135f5.n(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e6);
            return null;
        }
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e6) {
            AbstractC2022vd.z("SsaStyle", AbstractC1135f5.n(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e6);
            return false;
        }
    }
}
