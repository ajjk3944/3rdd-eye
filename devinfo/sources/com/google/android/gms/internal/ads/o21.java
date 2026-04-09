package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o21 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14516a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14517b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14518c;

    public o21(int i4, int i10, String str) {
        this.f14516a = i4;
        this.f14517b = str;
        this.f14518c = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o21) {
            o21 o21Var = (o21) obj;
            String str2 = o21Var.f14517b;
            if (this.f14516a == o21Var.f14516a && ((str = this.f14517b) != null ? str.equals(str2) : str2 == null) && this.f14518c == o21Var.f14518c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14517b;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.f14516a ^ 1000003) * 1000003)) * 1000003) ^ this.f14518c;
    }

    public final String toString() {
        int i4 = this.f14516a;
        int length = String.valueOf(i4).length();
        String str = this.f14517b;
        int length2 = String.valueOf(str).length();
        int i10 = this.f14518c;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i10).length() + 1);
        sb2.append("OverlayDisplayState{statusCode=");
        sb2.append(i4);
        sb2.append(", sessionToken=");
        sb2.append(str);
        return je.u.v(sb2, ", uiMode=", i10, "}");
    }
}
