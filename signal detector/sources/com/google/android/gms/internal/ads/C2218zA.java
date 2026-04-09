package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2218zA {

    /* renamed from: a, reason: collision with root package name */
    public final String f17832a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17833b;

    public C2218zA(String str, String str2) {
        this.f17832a = str;
        this.f17833b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2218zA) {
            C2218zA c2218zA = (C2218zA) obj;
            String str = this.f17832a;
            if (str != null ? str.equals(c2218zA.f17832a) : c2218zA.f17832a == null) {
                String str2 = this.f17833b;
                if (str2 != null ? str2.equals(c2218zA.f17833b) : c2218zA.f17833b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f17832a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f17833b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f17832a;
        int length = String.valueOf(str).length();
        String str2 = this.f17833b;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        A.f.w(sb, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
