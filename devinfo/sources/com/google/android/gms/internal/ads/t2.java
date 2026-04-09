package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16666a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16668c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16669d;

    public t2(int i4, byte[] bArr, int i10, int i11) {
        this.f16666a = i4;
        this.f16667b = bArr;
        this.f16668c = i10;
        this.f16669d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t2.class == obj.getClass()) {
            t2 t2Var = (t2) obj;
            if (this.f16666a == t2Var.f16666a && this.f16668c == t2Var.f16668c && this.f16669d == t2Var.f16669d && Arrays.equals(this.f16667b, t2Var.f16667b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f16667b) + (this.f16666a * 31)) * 31) + this.f16668c) * 31) + this.f16669d;
    }
}
