package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public class fw0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27472c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27473d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27474e;

    public fw0(int i, long j4, Object obj) {
        this(obj, -1, -1, j4, i);
    }

    public final fw0 a(Object obj) {
        return this.f27470a.equals(obj) ? this : new fw0(obj, this.f27471b, this.f27472c, this.f27473d, this.f27474e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw0)) {
            return false;
        }
        fw0 fw0Var = (fw0) obj;
        return this.f27470a.equals(fw0Var.f27470a) && this.f27471b == fw0Var.f27471b && this.f27472c == fw0Var.f27472c && this.f27473d == fw0Var.f27473d && this.f27474e == fw0Var.f27474e;
    }

    public final int hashCode() {
        return ((((((((this.f27470a.hashCode() + 527) * 31) + this.f27471b) * 31) + this.f27472c) * 31) + ((int) this.f27473d)) * 31) + this.f27474e;
    }

    public fw0(fw0 fw0Var) {
        this.f27470a = fw0Var.f27470a;
        this.f27471b = fw0Var.f27471b;
        this.f27472c = fw0Var.f27472c;
        this.f27473d = fw0Var.f27473d;
        this.f27474e = fw0Var.f27474e;
    }

    public final boolean a() {
        return this.f27471b != -1;
    }

    public fw0(Object obj) {
        this(obj, -1L);
    }

    public fw0(Object obj, int i, int i10, long j4) {
        this(obj, i, i10, j4, -1);
    }

    private fw0(Object obj, int i, int i10, long j4, int i11) {
        this.f27470a = obj;
        this.f27471b = i;
        this.f27472c = i10;
        this.f27473d = j4;
        this.f27474e = i11;
    }

    public fw0(Object obj, long j4) {
        this(obj, -1, -1, j4, -1);
    }
}
