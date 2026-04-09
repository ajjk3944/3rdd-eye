package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2155y1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f17662b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17663c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17664d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f17665e;

    public C2155y1(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f17662b = str;
        this.f17663c = str2;
        this.f17664d = i;
        this.f17665e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.F1, com.google.android.gms.internal.ads.B3
    public final void a(O2 o22) {
        o22.a(this.f17664d, this.f17665e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2155y1.class == obj.getClass()) {
            C2155y1 c2155y1 = (C2155y1) obj;
            if (this.f17664d == c2155y1.f17664d && Objects.equals(this.f17662b, c2155y1.f17662b) && Objects.equals(this.f17663c, c2155y1.f17663c) && Arrays.equals(this.f17665e, c2155y1.f17665e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f17662b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f17663c;
        return Arrays.hashCode(this.f17665e) + ((((((this.f17664d + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.F1
    public final String toString() {
        String str = this.f8061a;
        int length = String.valueOf(str).length();
        String str2 = this.f17662b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f17663c;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        A.f.w(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
