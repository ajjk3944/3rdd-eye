package com.yandex.mobile.ads.impl;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class pf2 implements em {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31729f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f31730b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31731c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31732d;

    /* renamed from: e, reason: collision with root package name */
    public final float f31733e;

    public pf2(int i, int i10, int i11, float f10) {
        this.f31730b = i;
        this.f31731c = i10;
        this.f31732d = i11;
        this.f31733e = f10;
    }

    private static pf2 a(Bundle bundle) {
        return new pf2(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pf2) {
            pf2 pf2Var = (pf2) obj;
            if (this.f31730b == pf2Var.f31730b && this.f31731c == pf2Var.f31731c && this.f31732d == pf2Var.f31732d && this.f31733e == pf2Var.f31733e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f31733e) + ((((((this.f31730b + 217) * 31) + this.f31731c) * 31) + this.f31732d) * 31);
    }
}
