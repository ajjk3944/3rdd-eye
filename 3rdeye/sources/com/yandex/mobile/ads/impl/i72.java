package com.yandex.mobile.ads.impl;

import android.text.Layout;

/* loaded from: classes3.dex */
final class i72 {

    /* renamed from: a, reason: collision with root package name */
    private String f28558a;

    /* renamed from: b, reason: collision with root package name */
    private int f28559b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28560c;

    /* renamed from: d, reason: collision with root package name */
    private int f28561d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28562e;

    /* renamed from: k, reason: collision with root package name */
    private float f28567k;

    /* renamed from: l, reason: collision with root package name */
    private String f28568l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f28571o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f28572p;

    /* renamed from: r, reason: collision with root package name */
    private e42 f28574r;

    /* renamed from: f, reason: collision with root package name */
    private int f28563f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f28564g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f28565h = -1;
    private int i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f28566j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f28569m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f28570n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f28573q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f28575s = Float.MAX_VALUE;

    public final i72 a(i72 i72Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (i72Var != null) {
            if (!this.f28560c && i72Var.f28560c) {
                this.f28559b = i72Var.f28559b;
                this.f28560c = true;
            }
            if (this.f28565h == -1) {
                this.f28565h = i72Var.f28565h;
            }
            if (this.i == -1) {
                this.i = i72Var.i;
            }
            if (this.f28558a == null && (str = i72Var.f28558a) != null) {
                this.f28558a = str;
            }
            if (this.f28563f == -1) {
                this.f28563f = i72Var.f28563f;
            }
            if (this.f28564g == -1) {
                this.f28564g = i72Var.f28564g;
            }
            if (this.f28570n == -1) {
                this.f28570n = i72Var.f28570n;
            }
            if (this.f28571o == null && (alignment2 = i72Var.f28571o) != null) {
                this.f28571o = alignment2;
            }
            if (this.f28572p == null && (alignment = i72Var.f28572p) != null) {
                this.f28572p = alignment;
            }
            if (this.f28573q == -1) {
                this.f28573q = i72Var.f28573q;
            }
            if (this.f28566j == -1) {
                this.f28566j = i72Var.f28566j;
                this.f28567k = i72Var.f28567k;
            }
            if (this.f28574r == null) {
                this.f28574r = i72Var.f28574r;
            }
            if (this.f28575s == Float.MAX_VALUE) {
                this.f28575s = i72Var.f28575s;
            }
            if (!this.f28562e && i72Var.f28562e) {
                this.f28561d = i72Var.f28561d;
                this.f28562e = true;
            }
            if (this.f28569m == -1 && (i = i72Var.f28569m) != -1) {
                this.f28569m = i;
            }
        }
        return this;
    }

    public final int b() {
        if (this.f28560c) {
            return this.f28559b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final String c() {
        return this.f28558a;
    }

    public final float d() {
        return this.f28567k;
    }

    public final int e() {
        return this.f28566j;
    }

    public final String f() {
        return this.f28568l;
    }

    public final Layout.Alignment g() {
        return this.f28572p;
    }

    public final int h() {
        return this.f28570n;
    }

    public final int i() {
        return this.f28569m;
    }

    public final float j() {
        return this.f28575s;
    }

    public final int k() {
        int i = this.f28565h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    public final Layout.Alignment l() {
        return this.f28571o;
    }

    public final boolean m() {
        return this.f28573q == 1;
    }

    public final e42 n() {
        return this.f28574r;
    }

    public final boolean o() {
        return this.f28562e;
    }

    public final boolean p() {
        return this.f28560c;
    }

    public final boolean q() {
        return this.f28563f == 1;
    }

    public final boolean r() {
        return this.f28564g == 1;
    }

    public final void c(int i) {
        this.f28566j = i;
    }

    public final i72 d(int i) {
        this.f28570n = i;
        return this;
    }

    public final i72 e(int i) {
        this.f28569m = i;
        return this;
    }

    public final i72 c(boolean z10) {
        this.f28563f = z10 ? 1 : 0;
        return this;
    }

    public final i72 d(boolean z10) {
        this.f28573q = z10 ? 1 : 0;
        return this;
    }

    public final i72 e(boolean z10) {
        this.f28564g = z10 ? 1 : 0;
        return this;
    }

    public final void b(int i) {
        this.f28559b = i;
        this.f28560c = true;
    }

    public final i72 b(String str) {
        this.f28568l = str;
        return this;
    }

    public final i72 b(boolean z10) {
        this.i = z10 ? 1 : 0;
        return this;
    }

    public final i72 b(float f10) {
        this.f28575s = f10;
        return this;
    }

    public final i72 b(Layout.Alignment alignment) {
        this.f28571o = alignment;
        return this;
    }

    public final int a() {
        if (this.f28562e) {
            return this.f28561d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final void a(int i) {
        this.f28561d = i;
        this.f28562e = true;
    }

    public final i72 a(boolean z10) {
        this.f28565h = z10 ? 1 : 0;
        return this;
    }

    public final i72 a(String str) {
        this.f28558a = str;
        return this;
    }

    public final void a(float f10) {
        this.f28567k = f10;
    }

    public final i72 a(Layout.Alignment alignment) {
        this.f28572p = alignment;
        return this;
    }

    public final i72 a(e42 e42Var) {
        this.f28574r = e42Var;
        return this;
    }
}
