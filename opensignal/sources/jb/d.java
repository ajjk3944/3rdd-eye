package jb;

import android.graphics.Color;
import g4.j;
import io.sentry.android.core.e0;
import lf.t1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f13575a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13576b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f13577c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13578d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13579e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13580f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13581g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13582h;

    public d(String str, int i10, Integer num, float f10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f13575a = str;
        this.f13576b = i10;
        this.f13577c = num;
        this.f13578d = f10;
        this.f13579e = z10;
        this.f13580f = z11;
        this.f13581g = z12;
        this.f13582h = z13;
    }

    public static int a(String str) throws NumberFormatException {
        int i10;
        try {
            i10 = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case j.STRING_FIELD_NUMBER /* 5 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
            case j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                return i10;
            default:
                String strValueOf = String.valueOf(str);
                e0.p("SsaStyle", strValueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(strValueOf) : new String("Ignoring unknown alignment: "));
                return -1;
        }
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e4) {
            qb.b.J("SsaStyle", c7.a.k(c7.a.d(33, str), "Failed to parse boolean value: '", str, "'"), e4);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            qb.b.g(j <= 4294967295L);
            return Integer.valueOf(Color.argb(t1.f(((j >> 24) & 255) ^ 255), t1.f(j & 255), t1.f((j >> 8) & 255), t1.f((j >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            qb.b.J("SsaStyle", c7.a.k(c7.a.d(36, str), "Failed to parse color expression: '", str, "'"), e4);
            return null;
        }
    }
}
