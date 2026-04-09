package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4625g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f40909a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40910b;

    public C4625g0(String str, long j4) {
        this.f40909a = str;
        this.f40910b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4625g0.class == obj.getClass()) {
            C4625g0 c4625g0 = (C4625g0) obj;
            if (this.f40910b != c4625g0.f40910b) {
                return false;
            }
            String str = this.f40909a;
            String str2 = c4625g0.f40909a;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f40909a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j4 = this.f40910b;
        return (iHashCode * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }
}
