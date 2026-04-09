package com.google.android.gms.internal.ads;

import android.text.Layout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q7 {

    /* renamed from: a, reason: collision with root package name */
    public String f15227a;

    /* renamed from: b, reason: collision with root package name */
    public int f15228b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15229c;

    /* renamed from: d, reason: collision with root package name */
    public int f15230d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15231e;

    /* renamed from: k, reason: collision with root package name */
    public float f15235k;

    /* renamed from: l, reason: collision with root package name */
    public String f15236l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f15239o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f15240p;

    /* renamed from: r, reason: collision with root package name */
    public l7 f15242r;

    /* renamed from: t, reason: collision with root package name */
    public String f15244t;

    /* renamed from: u, reason: collision with root package name */
    public String f15245u;

    /* renamed from: f, reason: collision with root package name */
    public int f15232f = -1;
    public int g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f15233h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f15234i = -1;
    public int j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f15237m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f15238n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f15241q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f15243s = Float.MAX_VALUE;

    public final String a() {
        return this.f15244t;
    }

    public final String b() {
        return this.f15245u;
    }

    public final void c(q7 q7Var) {
        int i4;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (q7Var != null) {
            if (!this.f15229c && q7Var.f15229c) {
                this.f15228b = q7Var.f15228b;
                this.f15229c = true;
            }
            if (this.f15233h == -1) {
                this.f15233h = q7Var.f15233h;
            }
            if (this.f15234i == -1) {
                this.f15234i = q7Var.f15234i;
            }
            if (this.f15227a == null && (str = q7Var.f15227a) != null) {
                this.f15227a = str;
            }
            if (this.f15232f == -1) {
                this.f15232f = q7Var.f15232f;
            }
            if (this.g == -1) {
                this.g = q7Var.g;
            }
            if (this.f15238n == -1) {
                this.f15238n = q7Var.f15238n;
            }
            if (this.f15239o == null && (alignment2 = q7Var.f15239o) != null) {
                this.f15239o = alignment2;
            }
            if (this.f15240p == null && (alignment = q7Var.f15240p) != null) {
                this.f15240p = alignment;
            }
            if (this.f15241q == -1) {
                this.f15241q = q7Var.f15241q;
            }
            if (this.j == -1) {
                this.j = q7Var.j;
                this.f15235k = q7Var.f15235k;
            }
            if (this.f15242r == null) {
                this.f15242r = q7Var.f15242r;
            }
            if (this.f15243s == Float.MAX_VALUE) {
                this.f15243s = q7Var.f15243s;
            }
            if (this.f15244t == null) {
                this.f15244t = q7Var.f15244t;
            }
            if (this.f15245u == null) {
                this.f15245u = q7Var.f15245u;
            }
            if (!this.f15231e && q7Var.f15231e) {
                this.f15230d = q7Var.f15230d;
                this.f15231e = true;
            }
            if (this.f15237m != -1 || (i4 = q7Var.f15237m) == -1) {
                return;
            }
            this.f15237m = i4;
        }
    }

    public final String d() {
        return this.f15236l;
    }
}
