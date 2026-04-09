package com.google.android.gms.internal.ads;

import android.text.Layout;

/* renamed from: com.google.android.gms.internal.ads.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1672p3 {

    /* renamed from: a, reason: collision with root package name */
    public String f16110a;

    /* renamed from: b, reason: collision with root package name */
    public int f16111b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16112c;

    /* renamed from: d, reason: collision with root package name */
    public int f16113d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16114e;

    /* renamed from: k, reason: collision with root package name */
    public float f16119k;

    /* renamed from: l, reason: collision with root package name */
    public String f16120l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f16123o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f16124p;

    /* renamed from: r, reason: collision with root package name */
    public C1456l3 f16126r;

    /* renamed from: t, reason: collision with root package name */
    public String f16128t;

    /* renamed from: u, reason: collision with root package name */
    public String f16129u;

    /* renamed from: f, reason: collision with root package name */
    public int f16115f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f16116g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f16117h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f16118j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f16121m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f16122n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f16125q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f16127s = Float.MAX_VALUE;

    public final String a() {
        return this.f16128t;
    }

    public final String b() {
        return this.f16129u;
    }

    public final void c(C1672p3 c1672p3) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c1672p3 != null) {
            if (!this.f16112c && c1672p3.f16112c) {
                this.f16111b = c1672p3.f16111b;
                this.f16112c = true;
            }
            if (this.f16117h == -1) {
                this.f16117h = c1672p3.f16117h;
            }
            if (this.i == -1) {
                this.i = c1672p3.i;
            }
            if (this.f16110a == null && (str = c1672p3.f16110a) != null) {
                this.f16110a = str;
            }
            if (this.f16115f == -1) {
                this.f16115f = c1672p3.f16115f;
            }
            if (this.f16116g == -1) {
                this.f16116g = c1672p3.f16116g;
            }
            if (this.f16122n == -1) {
                this.f16122n = c1672p3.f16122n;
            }
            if (this.f16123o == null && (alignment2 = c1672p3.f16123o) != null) {
                this.f16123o = alignment2;
            }
            if (this.f16124p == null && (alignment = c1672p3.f16124p) != null) {
                this.f16124p = alignment;
            }
            if (this.f16125q == -1) {
                this.f16125q = c1672p3.f16125q;
            }
            if (this.f16118j == -1) {
                this.f16118j = c1672p3.f16118j;
                this.f16119k = c1672p3.f16119k;
            }
            if (this.f16126r == null) {
                this.f16126r = c1672p3.f16126r;
            }
            if (this.f16127s == Float.MAX_VALUE) {
                this.f16127s = c1672p3.f16127s;
            }
            if (this.f16128t == null) {
                this.f16128t = c1672p3.f16128t;
            }
            if (this.f16129u == null) {
                this.f16129u = c1672p3.f16129u;
            }
            if (!this.f16114e && c1672p3.f16114e) {
                this.f16113d = c1672p3.f16113d;
                this.f16114e = true;
            }
            if (this.f16121m != -1 || (i = c1672p3.f16121m) == -1) {
                return;
            }
            this.f16121m = i;
        }
    }

    public final String d() {
        return this.f16120l;
    }
}
