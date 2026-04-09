package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ih0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12334a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12335b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f12336c;

    public ih0(String str, String str2, Drawable drawable) {
        this.f12334a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f12335b = str2;
        this.f12336c = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ih0) {
            ih0 ih0Var = (ih0) obj;
            Drawable drawable2 = ih0Var.f12336c;
            String str = ih0Var.f12334a;
            String str2 = this.f12334a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f12335b.equals(ih0Var.f12335b) && ((drawable = this.f12336c) != null ? drawable.equals(drawable2) : drawable2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12334a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f12335b.hashCode();
        Drawable drawable = this.f12336c;
        return (drawable != null ? drawable.hashCode() : 0) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12336c);
        String str = this.f12334a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.f12335b;
        StringBuilder sb2 = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        je.u.B(sb2, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return r5.c.m(sb2, ", icon=", strValueOf, "}");
    }
}
