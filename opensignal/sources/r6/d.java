package r6;

import android.graphics.Color;
import g4.j;
import lf.t1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f21290a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21291b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f21292c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f21293d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21294e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21295f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21296g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21297h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f21298i;
    public final int j;

    public d(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f21290a = str;
        this.f21291b = i10;
        this.f21292c = num;
        this.f21293d = num2;
        this.f21294e = f10;
        this.f21295f = z10;
        this.f21296g = z11;
        this.f21297h = z12;
        this.f21298i = z13;
        this.j = i11;
    }

    public static int a(String str) throws NumberFormatException {
        boolean z10;
        try {
            int i10 = Integer.parseInt(str.trim());
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
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        h0.b.B("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e4) {
            a5.a.C("SsaStyle", "Failed to parse boolean value: '" + str + "'", e4);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            a5.a.e(j <= 4294967295L);
            return Integer.valueOf(Color.argb(t1.f(((j >> 24) & 255) ^ 255), t1.f(j & 255), t1.f((j >> 8) & 255), t1.f((j >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            a5.a.C("SsaStyle", "Failed to parse color expression: '" + str + "'", e4);
            return null;
        }
    }
}
