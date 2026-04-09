package com.yandex.mobile.ads.impl;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class d10 implements em {

    /* renamed from: b, reason: collision with root package name */
    public final int f25915b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25916c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25917d;

    public d10(int i, int i10, int i11) {
        this.f25915b = i;
        this.f25916c = i10;
        this.f25917d = i11;
    }

    private static d10 a(Bundle bundle) {
        return new d10(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d10)) {
            return false;
        }
        d10 d10Var = (d10) obj;
        return this.f25915b == d10Var.f25915b && this.f25916c == d10Var.f25916c && this.f25917d == d10Var.f25917d;
    }

    public final int hashCode() {
        return ((((this.f25915b + 527) * 31) + this.f25916c) * 31) + this.f25917d;
    }
}
