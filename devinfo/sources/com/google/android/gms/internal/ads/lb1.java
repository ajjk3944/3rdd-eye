package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lb1 extends aa1 {

    /* renamed from: a, reason: collision with root package name */
    public final ja1 f13450a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13451b;

    public lb1(int i4, ja1 ja1Var) {
        this.f13450a = ja1Var;
        this.f13451b = i4;
    }

    public static lb1 b(int i4, ja1 ja1Var) throws GeneralSecurityException {
        if (i4 < 8 || i4 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new lb1(i4, ja1Var);
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f13450a != ja1.f12702n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lb1)) {
            return false;
        }
        lb1 lb1Var = (lb1) obj;
        return lb1Var.f13450a == this.f13450a && lb1Var.f13451b == this.f13451b;
    }

    public final int hashCode() {
        return Objects.hash(lb1.class, this.f13450a, Integer.valueOf(this.f13451b));
    }

    public final String toString() {
        String str = this.f13450a.f12707b;
        int length = str.length();
        int i4 = this.f13451b;
        StringBuilder sb2 = new StringBuilder(length + 48 + String.valueOf(i4).length() + 1);
        sb2.append("X-AES-GCM Parameters (variant: ");
        sb2.append(str);
        sb2.append("salt_size_bytes: ");
        sb2.append(i4);
        sb2.append(")");
        return sb2.toString();
    }
}
