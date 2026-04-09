package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l21 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13335a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13336b;

    public l21(String str, String str2) {
        this.f13335a = str;
        this.f13336b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l21) {
            l21 l21Var = (l21) obj;
            String str = l21Var.f13336b;
            String str2 = l21Var.f13335a;
            String str3 = this.f13335a;
            if (str3 != null ? str3.equals(str2) : str2 == null) {
                String str4 = this.f13336b;
                if (str4 != null ? str4.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13335a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f13336b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f13335a;
        int length = String.valueOf(str).length();
        String str2 = this.f13336b;
        StringBuilder sb2 = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        je.u.B(sb2, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb2.append("}");
        return sb2.toString();
    }
}
