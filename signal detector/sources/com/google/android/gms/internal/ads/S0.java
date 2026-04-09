package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11101a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11102b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11103c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11104d;

    public S0(int i, byte[] bArr, int i3, int i6) {
        this.f11101a = i;
        this.f11102b = bArr;
        this.f11103c = i3;
        this.f11104d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S0.class == obj.getClass()) {
            S0 s02 = (S0) obj;
            if (this.f11101a == s02.f11101a && this.f11103c == s02.f11103c && this.f11104d == s02.f11104d && Arrays.equals(this.f11102b, s02.f11102b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11102b) + (this.f11101a * 31)) * 31) + this.f11103c) * 31) + this.f11104d;
    }
}
