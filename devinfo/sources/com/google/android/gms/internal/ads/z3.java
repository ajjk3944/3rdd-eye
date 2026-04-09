package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z3 extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f18979b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18980c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18981d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f18982e;

    public z3(String str, String str2, int i4, byte[] bArr) {
        super("APIC");
        this.f18979b = str;
        this.f18980c = str2;
        this.f18981d = i4;
        this.f18982e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.g4, com.google.android.gms.internal.ads.c8
    public final void a(o6 o6Var) {
        o6Var.a(this.f18981d, this.f18982e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z3.class == obj.getClass()) {
            z3 z3Var = (z3) obj;
            if (this.f18981d == z3Var.f18981d && Objects.equals(this.f18979b, z3Var.f18979b) && Objects.equals(this.f18980c, z3Var.f18980c) && Arrays.equals(this.f18982e, z3Var.f18982e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18979b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f18980c;
        return Arrays.hashCode(this.f18982e) + ((((((this.f18981d + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.g4
    public final String toString() {
        String str = this.f11366a;
        int length = String.valueOf(str).length();
        String str2 = this.f18979b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f18980c;
        StringBuilder sb2 = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        je.u.B(sb2, str, ": mimeType=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
