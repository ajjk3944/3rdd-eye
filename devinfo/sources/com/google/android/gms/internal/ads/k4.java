package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k4 extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f13011b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13012c;

    public k4(String str, byte[] bArr) {
        super("PRIV");
        this.f13011b = str;
        this.f13012c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k4.class == obj.getClass()) {
            k4 k4Var = (k4) obj;
            if (Objects.equals(this.f13011b, k4Var.f13011b) && Arrays.equals(this.f13012c, k4Var.f13012c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13012c) + ((this.f13011b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.g4
    public final String toString() {
        String str = this.f11366a;
        int length = String.valueOf(str).length() + 8;
        String str2 = this.f13011b;
        return r5.c.m(new StringBuilder(str2.length() + length), str, ": owner=", str2);
    }
}
