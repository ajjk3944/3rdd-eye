package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class J1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f9215b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9216c;

    public J1(String str, byte[] bArr) {
        super("PRIV");
        this.f9215b = str;
        this.f9216c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J1.class == obj.getClass()) {
            J1 j12 = (J1) obj;
            if (Objects.equals(this.f9215b, j12.f9215b) && Arrays.equals(this.f9216c, j12.f9216c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9216c) + ((this.f9215b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.F1
    public final String toString() {
        String str = this.f8061a;
        int length = String.valueOf(str).length() + 8;
        String str2 = this.f9215b;
        return AbstractC1135f5.n(new StringBuilder(str2.length() + length), str, ": owner=", str2);
    }
}
