package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w40 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;

    /* renamed from: q, reason: collision with root package name */
    public static final String f17863q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f17864r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f17865s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f17866t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f17867u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f17868v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f17869w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f17870x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f17871y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f17872z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f17873a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f17874b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f17875c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f17876d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17877e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17878f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17879h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17880i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final float f17881k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17882l;

    /* renamed from: m, reason: collision with root package name */
    public final float f17883m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17884n;

    /* renamed from: o, reason: collision with root package name */
    public final float f17885o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17886p;

    static {
        Layout.Alignment alignment = null;
        float f10 = -3.4028235E38f;
        int i4 = LinearLayoutManager.INVALID_OFFSET;
        new w40("", alignment, alignment, null, f10, i4, i4, f10, i4, i4, f10, f10, f10, i4, 0.0f, 0);
        String str = bq0.f9768a;
        f17863q = Integer.toString(0, 36);
        f17864r = Integer.toString(17, 36);
        f17865s = Integer.toString(1, 36);
        f17866t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f17867u = Integer.toString(18, 36);
        f17868v = Integer.toString(4, 36);
        f17869w = Integer.toString(5, 36);
        f17870x = Integer.toString(6, 36);
        f17871y = Integer.toString(7, 36);
        f17872z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        F = Integer.toString(14, 36);
        G = Integer.toString(15, 36);
        H = Integer.toString(16, 36);
        I = Integer.toString(19, 36);
    }

    public /* synthetic */ w40(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i4, int i10, float f11, int i11, int i12, float f12, float f13, float f14, int i13, float f15, int i14) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            mq0.m(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f17873a = SpannedString.valueOf(charSequence);
        } else {
            this.f17873a = charSequence != null ? charSequence.toString() : null;
        }
        this.f17874b = alignment;
        this.f17875c = alignment2;
        this.f17876d = bitmap;
        this.f17877e = f10;
        this.f17878f = i4;
        this.g = i10;
        this.f17879h = f11;
        this.f17880i = i11;
        this.j = f13;
        this.f17881k = f14;
        this.f17882l = i12;
        this.f17883m = f12;
        this.f17884n = i13;
        this.f17885o = f15;
        this.f17886p = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w40.class != obj.getClass()) {
            return false;
        }
        w40 w40Var = (w40) obj;
        Bitmap bitmap = w40Var.f17876d;
        if (!TextUtils.equals(this.f17873a, w40Var.f17873a) || this.f17874b != w40Var.f17874b || this.f17875c != w40Var.f17875c) {
            return false;
        }
        Bitmap bitmap2 = this.f17876d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f17877e == w40Var.f17877e && this.f17878f == w40Var.f17878f && this.g == w40Var.g && this.f17879h == w40Var.f17879h && this.f17880i == w40Var.f17880i && this.j == w40Var.j && this.f17881k == w40Var.f17881k && this.f17882l == w40Var.f17882l && this.f17883m == w40Var.f17883m && this.f17884n == w40Var.f17884n && this.f17885o == w40Var.f17885o && this.f17886p == w40Var.f17886p;
    }

    public final int hashCode() {
        return Objects.hash(this.f17873a, this.f17874b, this.f17875c, this.f17876d, Float.valueOf(this.f17877e), Integer.valueOf(this.f17878f), Integer.valueOf(this.g), Float.valueOf(this.f17879h), Integer.valueOf(this.f17880i), Float.valueOf(this.j), Float.valueOf(this.f17881k), Boolean.FALSE, -16777216, Integer.valueOf(this.f17882l), Float.valueOf(this.f17883m), Integer.valueOf(this.f17884n), Float.valueOf(this.f17885o), Integer.valueOf(this.f17886p));
    }
}
