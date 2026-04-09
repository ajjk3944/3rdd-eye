package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Z7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12792a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12794c;

    public Z7(int i, long j6, String str) {
        this.f12792a = j6;
        this.f12793b = str;
        this.f12794c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z7)) {
            return false;
        }
        Z7 z7 = (Z7) obj;
        return z7.f12792a == this.f12792a && z7.f12794c == this.f12794c;
    }

    public final int hashCode() {
        return (int) this.f12792a;
    }
}
