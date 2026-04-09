package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f7713b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7714c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7715d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7716e;

    public D1(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f7713b = str;
        this.f7714c = str2;
        this.f7715d = str3;
        this.f7716e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && D1.class == obj.getClass()) {
            D1 d12 = (D1) obj;
            if (Objects.equals(this.f7713b, d12.f7713b) && Objects.equals(this.f7714c, d12.f7714c) && Objects.equals(this.f7715d, d12.f7715d) && Arrays.equals(this.f7716e, d12.f7716e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7713b;
        return Arrays.hashCode(this.f7716e) + ((this.f7715d.hashCode() + ((this.f7714c.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.F1
    public final String toString() {
        String str = this.f8061a;
        int length = String.valueOf(str).length();
        String str2 = this.f7713b;
        int length2 = length + 11 + String.valueOf(str2).length() + 11;
        String str3 = this.f7714c;
        int length3 = str3.length() + length2 + 14;
        String str4 = this.f7715d;
        StringBuilder sb = new StringBuilder(str4.length() + length3);
        A.f.w(sb, str, ": mimeType=", str2, ", filename=");
        return AbstractC1135f5.n(sb, str3, ", description=", str4);
    }
}
