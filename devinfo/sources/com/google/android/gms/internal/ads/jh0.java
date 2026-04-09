package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jh0 {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f12746a;

    /* renamed from: b, reason: collision with root package name */
    public final xa.i f12747b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12748c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12749d;

    public jh0(Activity activity, xa.i iVar, String str, String str2) {
        this.f12746a = activity;
        this.f12747b = iVar;
        this.f12748c = str;
        this.f12749d = str2;
    }

    public final boolean equals(Object obj) {
        xa.i iVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jh0) {
            jh0 jh0Var = (jh0) obj;
            String str3 = jh0Var.f12749d;
            String str4 = jh0Var.f12748c;
            xa.i iVar2 = jh0Var.f12747b;
            if (this.f12746a.equals(jh0Var.f12746a) && ((iVar = this.f12747b) != null ? iVar.equals(iVar2) : iVar2 == null) && ((str = this.f12748c) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f12749d) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f12746a.hashCode() ^ 1000003;
        xa.i iVar = this.f12747b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003;
        String str = this.f12748c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12749d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.f12746a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f12747b);
        int length2 = strValueOf.length();
        String str = this.f12748c;
        int length3 = String.valueOf(str).length();
        String str2 = this.f12749d;
        StringBuilder sb2 = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        je.u.B(sb2, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        je.u.B(sb2, ", gwsQueryId=", str, ", uri=", str2);
        sb2.append("}");
        return sb2.toString();
    }
}
