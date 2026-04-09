package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ta2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f33513a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33514b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33515c;

    public ta2(int i, int i10, int i11) {
        this.f33513a = i;
        this.f33514b = i10;
        this.f33515c = i11;
    }

    public final int a() {
        return this.f33513a;
    }

    public final int b() {
        return this.f33514b;
    }

    public final int c() {
        return this.f33515c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta2)) {
            return false;
        }
        ta2 ta2Var = (ta2) obj;
        return this.f33513a == ta2Var.f33513a && this.f33514b == ta2Var.f33514b && this.f33515c == ta2Var.f33515c;
    }

    public final int hashCode() {
        return this.f33515c + sx1.a(this.f33514b, this.f33513a * 31, 31);
    }

    public final String toString() {
        int i = this.f33513a;
        int i10 = this.f33514b;
        return B4.i.j(androidx.work.s.i("VersionInfo(majorVersion=", i, ", minorVersion=", i10, ", patchVersion="), this.f33515c, ")");
    }
}
