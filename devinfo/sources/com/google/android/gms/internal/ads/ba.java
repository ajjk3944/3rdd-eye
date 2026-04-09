package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    public final String f9636a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9637b;

    public ba(String str, String str2) {
        this.f9636a = str;
        this.f9637b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ba.class == obj.getClass()) {
            ba baVar = (ba) obj;
            if (TextUtils.equals(this.f9636a, baVar.f9636a) && TextUtils.equals(this.f9637b, baVar.f9637b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9637b.hashCode() + (this.f9636a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f9636a;
        int length = String.valueOf(str).length();
        String str2 = this.f9637b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        je.u.B(sb2, "Header[name=", str, ",value=", str2);
        sb2.append("]");
        return sb2.toString();
    }
}
