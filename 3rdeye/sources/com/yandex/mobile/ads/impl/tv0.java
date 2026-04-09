package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class tv0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f33777a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33778b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33779c;

    public tv0(int i, int i10, int i11) {
        this.f33777a = i;
        this.f33778b = i10;
        this.f33779c = i11;
    }

    public final int a() {
        return this.f33779c;
    }

    public final int b() {
        return this.f33778b;
    }

    public final int c() {
        return this.f33777a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv0)) {
            return false;
        }
        tv0 tv0Var = (tv0) obj;
        return this.f33777a == tv0Var.f33777a && this.f33778b == tv0Var.f33778b && this.f33779c == tv0Var.f33779c;
    }

    public final int hashCode() {
        return this.f33779c + sx1.a(this.f33778b, this.f33777a * 31, 31);
    }

    public final String toString() {
        int i = this.f33777a;
        int i10 = this.f33778b;
        return B4.i.j(androidx.work.s.i("MediaFileInfo(width=", i, ", height=", i10, ", bitrate="), this.f33779c, ")");
    }
}
