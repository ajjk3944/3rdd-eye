package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f4228a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4229b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4230c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4231d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4232e;

    public l0(long j, long j7, long j10, float f10, float f11) {
        this.f4228a = j;
        this.f4229b = j7;
        this.f4230c = j10;
        this.f4231d = f10;
        this.f4232e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f4228a == l0Var.f4228a && this.f4229b == l0Var.f4229b && this.f4230c == l0Var.f4230c && this.f4231d == l0Var.f4231d && this.f4232e == l0Var.f4232e;
    }

    public final int hashCode() {
        long j = this.f4228a;
        long j7 = this.f4229b;
        int i10 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j10 = this.f4230c;
        int i11 = (i10 + ((int) ((j10 >>> 32) ^ j10))) * 31;
        float f10 = this.f4231d;
        int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f4232e;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
