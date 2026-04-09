package com.google.android.gms.internal.ads;

import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1226go {

    /* renamed from: a, reason: collision with root package name */
    public final long f14376a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14377b;

    public C1226go(int i, long j6) {
        this.f14376a = j6;
        this.f14377b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1226go) {
            C1226go c1226go = (C1226go) obj;
            if (this.f14376a == c1226go.f14376a && this.f14377b == c1226go.f14377b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f14376a;
        return ((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f14377b;
    }

    public final String toString() {
        long j6 = this.f14376a;
        int length = String.valueOf(j6).length();
        int i = this.f14377b;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        A.f.v(sb, "OnDeviceStorageKey{id=", j6, ", eventType=");
        return AbstractC2763b.d(i, "}", sb);
    }
}
