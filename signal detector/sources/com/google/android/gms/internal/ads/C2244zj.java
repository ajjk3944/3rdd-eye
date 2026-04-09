package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.zj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2244zj {

    /* renamed from: A, reason: collision with root package name */
    public static final String f17904A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f17905B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f17906C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f17907D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f17908E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f17909F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f17910G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f17911H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f17912I;

    /* renamed from: q, reason: collision with root package name */
    public static final String f17913q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f17914r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f17915s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f17916t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f17917u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f17918v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f17919w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f17920x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f17921y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f17922z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f17923a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f17924b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f17925c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f17926d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17927e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17928f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17929g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17930h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f17931j;

    /* renamed from: k, reason: collision with root package name */
    public final float f17932k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17933l;

    /* renamed from: m, reason: collision with root package name */
    public final float f17934m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17935n;

    /* renamed from: o, reason: collision with root package name */
    public final float f17936o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17937p;

    static {
        Layout.Alignment alignment = null;
        float f2 = -3.4028235E38f;
        int i = LinearLayoutManager.INVALID_OFFSET;
        new C2244zj("", alignment, alignment, null, f2, i, i, f2, i, i, f2, f2, f2, i, 0.0f, 0);
        String str = Vt.f12096a;
        f17913q = Integer.toString(0, 36);
        f17914r = Integer.toString(17, 36);
        f17915s = Integer.toString(1, 36);
        f17916t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f17917u = Integer.toString(18, 36);
        f17918v = Integer.toString(4, 36);
        f17919w = Integer.toString(5, 36);
        f17920x = Integer.toString(6, 36);
        f17921y = Integer.toString(7, 36);
        f17922z = Integer.toString(8, 36);
        f17904A = Integer.toString(9, 36);
        f17905B = Integer.toString(10, 36);
        f17906C = Integer.toString(11, 36);
        f17907D = Integer.toString(12, 36);
        f17908E = Integer.toString(13, 36);
        f17909F = Integer.toString(14, 36);
        f17910G = Integer.toString(15, 36);
        f17911H = Integer.toString(16, 36);
        f17912I = Integer.toString(19, 36);
    }

    public /* synthetic */ C2244zj(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i, int i3, float f5, int i6, int i7, float f6, float f7, float f8, int i8, float f9, int i9) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC0582Jp.m(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f17923a = SpannedString.valueOf(charSequence);
        } else {
            this.f17923a = charSequence != null ? charSequence.toString() : null;
        }
        this.f17924b = alignment;
        this.f17925c = alignment2;
        this.f17926d = bitmap;
        this.f17927e = f2;
        this.f17928f = i;
        this.f17929g = i3;
        this.f17930h = f5;
        this.i = i6;
        this.f17931j = f7;
        this.f17932k = f8;
        this.f17933l = i7;
        this.f17934m = f6;
        this.f17935n = i8;
        this.f17936o = f9;
        this.f17937p = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2244zj.class != obj.getClass()) {
            return false;
        }
        C2244zj c2244zj = (C2244zj) obj;
        Bitmap bitmap = c2244zj.f17926d;
        if (!TextUtils.equals(this.f17923a, c2244zj.f17923a) || this.f17924b != c2244zj.f17924b || this.f17925c != c2244zj.f17925c) {
            return false;
        }
        Bitmap bitmap2 = this.f17926d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f17927e == c2244zj.f17927e && this.f17928f == c2244zj.f17928f && this.f17929g == c2244zj.f17929g && this.f17930h == c2244zj.f17930h && this.i == c2244zj.i && this.f17931j == c2244zj.f17931j && this.f17932k == c2244zj.f17932k && this.f17933l == c2244zj.f17933l && this.f17934m == c2244zj.f17934m && this.f17935n == c2244zj.f17935n && this.f17936o == c2244zj.f17936o && this.f17937p == c2244zj.f17937p;
    }

    public final int hashCode() {
        return Objects.hash(this.f17923a, this.f17924b, this.f17925c, this.f17926d, Float.valueOf(this.f17927e), Integer.valueOf(this.f17928f), Integer.valueOf(this.f17929g), Float.valueOf(this.f17930h), Integer.valueOf(this.i), Float.valueOf(this.f17931j), Float.valueOf(this.f17932k), Boolean.FALSE, -16777216, Integer.valueOf(this.f17933l), Float.valueOf(this.f17934m), Integer.valueOf(this.f17935n), Float.valueOf(this.f17936o), Integer.valueOf(this.f17937p));
    }
}
