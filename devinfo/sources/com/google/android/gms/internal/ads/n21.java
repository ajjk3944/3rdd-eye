package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n21 {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f14134a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14135b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14136c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14137d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14138e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14139f;

    public n21(IBinder iBinder, String str, int i4, float f10, int i10, String str2) {
        this.f14134a = iBinder;
        this.f14135b = str;
        this.f14136c = i4;
        this.f14137d = f10;
        this.f14138e = i10;
        this.f14139f = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n21) {
            n21 n21Var = (n21) obj;
            String str3 = n21Var.f14139f;
            String str4 = n21Var.f14135b;
            if (this.f14134a.equals(n21Var.f14134a) && ((str = this.f14135b) != null ? str.equals(str4) : str4 == null) && this.f14136c == n21Var.f14136c && Float.floatToIntBits(this.f14137d) == Float.floatToIntBits(n21Var.f14137d) && this.f14138e == n21Var.f14138e && ((str2 = this.f14139f) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f14134a.hashCode() ^ 1000003;
        String str = this.f14135b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f14136c) * 1000003) ^ Float.floatToIntBits(this.f14137d);
        String str2 = this.f14139f;
        return ((((iHashCode2 * 1525764945) ^ this.f14138e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.f14134a.toString();
        int length = string.length();
        String str = this.f14135b;
        int length2 = String.valueOf(str).length();
        int i4 = this.f14136c;
        int length3 = String.valueOf(i4).length();
        float f10 = this.f14137d;
        int length4 = String.valueOf(f10).length();
        int i10 = this.f14138e;
        int length5 = String.valueOf(i10).length();
        String str2 = this.f14139f;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        je.u.B(sb2, "OverlayDisplayShowRequest{windowToken=", string, ", appId=", str);
        sb2.append(", layoutGravity=");
        sb2.append(i4);
        sb2.append(", layoutVerticalMargin=");
        sb2.append(f10);
        sb2.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb2.append(i10);
        sb2.append(", deeplinkUrl=null, adFieldEnifd=");
        sb2.append(str2);
        sb2.append(", thirdPartyAuthCallerId=null}");
        return sb2.toString();
    }
}
