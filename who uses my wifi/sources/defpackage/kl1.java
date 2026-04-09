package defpackage;

import android.text.Layout;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kl1 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public fl1 r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final String a() {
        return this.t;
    }

    public final String b() {
        return this.u;
    }

    public final void c(kl1 kl1Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (kl1Var != null) {
            if (!this.c && kl1Var.c) {
                this.b = kl1Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = kl1Var.h;
            }
            if (this.i == -1) {
                this.i = kl1Var.i;
            }
            if (this.a == null && (str = kl1Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = kl1Var.f;
            }
            if (this.g == -1) {
                this.g = kl1Var.g;
            }
            if (this.n == -1) {
                this.n = kl1Var.n;
            }
            if (this.o == null && (alignment2 = kl1Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = kl1Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = kl1Var.q;
            }
            if (this.j == -1) {
                this.j = kl1Var.j;
                this.k = kl1Var.k;
            }
            if (this.r == null) {
                this.r = kl1Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = kl1Var.s;
            }
            if (this.t == null) {
                this.t = kl1Var.t;
            }
            if (this.u == null) {
                this.u = kl1Var.u;
            }
            if (!this.e && kl1Var.e) {
                this.d = kl1Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = kl1Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }

    public final String d() {
        return this.l;
    }
}
