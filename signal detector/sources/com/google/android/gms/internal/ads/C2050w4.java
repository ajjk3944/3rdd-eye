package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.w4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2050w4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17404a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17405b;

    public C2050w4(String str, String str2) {
        this.f17404a = str;
        this.f17405b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2050w4.class == obj.getClass()) {
            C2050w4 c2050w4 = (C2050w4) obj;
            if (TextUtils.equals(this.f17404a, c2050w4.f17404a) && TextUtils.equals(this.f17405b, c2050w4.f17405b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17405b.hashCode() + (this.f17404a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f17404a;
        int length = String.valueOf(str).length();
        String str2 = this.f17405b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        A.f.w(sb, "Header[name=", str, ",value=", str2);
        sb.append("]");
        return sb.toString();
    }
}
