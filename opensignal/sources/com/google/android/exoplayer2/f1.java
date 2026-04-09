package com.google.android.exoplayer2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4129b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4130c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4131d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4132e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4133f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4134g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4135h;

    public f1(Object obj, int i10, Object obj2, int i11, long j, long j7, int i12, int i13) {
        this.f4128a = obj;
        this.f4129b = i10;
        this.f4130c = obj2;
        this.f4131d = i11;
        this.f4132e = j;
        this.f4133f = j7;
        this.f4134g = i12;
        this.f4135h = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f4129b == f1Var.f4129b && this.f4131d == f1Var.f4131d && this.f4132e == f1Var.f4132e && this.f4133f == f1Var.f4133f && this.f4134g == f1Var.f4134g && this.f4135h == f1Var.f4135h && a.a.k(this.f4128a, f1Var.f4128a) && a.a.k(this.f4130c, f1Var.f4130c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f4129b;
        return Arrays.hashCode(new Object[]{this.f4128a, Integer.valueOf(i10), this.f4130c, Integer.valueOf(this.f4131d), Integer.valueOf(i10), Long.valueOf(this.f4132e), Long.valueOf(this.f4133f), Integer.valueOf(this.f4134g), Integer.valueOf(this.f4135h)});
    }
}
