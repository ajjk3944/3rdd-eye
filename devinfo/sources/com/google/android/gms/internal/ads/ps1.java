package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ps1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15099a;

    /* renamed from: b, reason: collision with root package name */
    public final mx1 f15100b;

    /* renamed from: c, reason: collision with root package name */
    public final mx1 f15101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15102d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15103e;

    public ps1(String str, mx1 mx1Var, mx1 mx1Var2, int i4, int i10) {
        boolean z3;
        if (i4 != 0) {
            z3 = false;
            if (i10 == 0) {
                i10 = 0;
                z3 = true;
            }
        } else {
            z3 = true;
        }
        mq0.m(z3);
        mq0.m(true ^ TextUtils.isEmpty(str));
        this.f15099a = str;
        this.f15100b = mx1Var;
        mx1Var2.getClass();
        this.f15101c = mx1Var2;
        this.f15102d = i4;
        this.f15103e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ps1.class == obj.getClass()) {
            ps1 ps1Var = (ps1) obj;
            if (this.f15102d == ps1Var.f15102d && this.f15103e == ps1Var.f15103e && this.f15099a.equals(ps1Var.f15099a) && this.f15100b.equals(ps1Var.f15100b) && this.f15101c.equals(ps1Var.f15101c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15101c.hashCode() + ((this.f15100b.hashCode() + ((this.f15099a.hashCode() + ((((this.f15102d + 527) * 31) + this.f15103e) * 31)) * 31)) * 31);
    }
}
