package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f9165a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9166b;

    /* renamed from: c, reason: collision with root package name */
    public w0 f9167c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9168d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f9169e;

    /* renamed from: f, reason: collision with root package name */
    public float f9170f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public float f9171h;

    /* renamed from: i, reason: collision with root package name */
    public float f9172i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f9173k;

    /* renamed from: l, reason: collision with root package name */
    public long f9174l;

    /* renamed from: m, reason: collision with root package name */
    public long f9175m;

    /* renamed from: n, reason: collision with root package name */
    public long f9176n;

    /* renamed from: o, reason: collision with root package name */
    public long f9177o;

    /* renamed from: p, reason: collision with root package name */
    public long f9178p;

    /* renamed from: q, reason: collision with root package name */
    public long f9179q;

    /* renamed from: r, reason: collision with root package name */
    public long f9180r;

    /* renamed from: s, reason: collision with root package name */
    public long f9181s;

    public a1(Context context) {
        this.f9166b = context;
        c0 c0Var = new c0();
        c0Var.f9887a = new b0();
        c0Var.f9888b = new b0();
        c0Var.f9890d = -9223372036854775807L;
        this.f9165a = c0Var;
        this.f9170f = -1.0f;
        this.f9172i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        this.f9175m = 0L;
        this.f9179q = -1L;
        this.f9176n = -1L;
        this.f9173k = 0L;
        this.f9174l = 0L;
    }

    public final void b() {
        float f10;
        if (Build.VERSION.SDK_INT < 30 || this.f9169e == null) {
            return;
        }
        c0 c0Var = this.f9165a;
        if (!c0Var.f9887a.b()) {
            f10 = this.f9170f;
        } else if (c0Var.f9887a.b()) {
            f10 = (float) (1.0E9d / (c0Var.f9887a.f9518e != 0 ? r2.f9519f / r4 : 0L));
        } else {
            f10 = -1.0f;
        }
        float f11 = this.g;
        if (f10 != f11) {
            if (f10 != -1.0f && f11 != -1.0f) {
                float f12 = 1.0f;
                if (c0Var.f9887a.b()) {
                    if ((c0Var.f9887a.b() ? c0Var.f9887a.f9519f : -9223372036854775807L) >= 5000000000L) {
                        f12 = 0.1f;
                    }
                }
                if (Math.abs(f10 - this.g) < f12) {
                    return;
                }
            } else if (f10 == -1.0f && c0Var.f9891e < 30) {
                return;
            }
            this.g = f10;
            c(false);
        }
    }

    public final void c(boolean z3) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f9169e) == null || this.j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f10 = 0.0f;
        if (this.f9168d) {
            float f11 = this.g;
            if (f11 != -1.0f) {
                f10 = this.f9172i * f11;
            }
        }
        if (z3 || this.f9171h != f10) {
            this.f9171h = f10;
            v0.a(this.f9169e, f10);
        }
    }

    public final void d() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f9169e) == null || this.j == Integer.MIN_VALUE || this.f9171h == 0.0f || !surface.isValid()) {
            return;
        }
        this.f9171h = 0.0f;
        v0.a(this.f9169e, 0.0f);
    }
}
