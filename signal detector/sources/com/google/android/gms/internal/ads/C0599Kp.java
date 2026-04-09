package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.internal.ads.Kp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599Kp {

    /* renamed from: a, reason: collision with root package name */
    public final String f9540a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9541b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f9542c;

    public C0599Kp(String str, String str2, Drawable drawable) {
        this.f9540a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f9541b = str2;
        this.f9542c = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0599Kp) {
            C0599Kp c0599Kp = (C0599Kp) obj;
            String str = this.f9540a;
            if (str != null ? str.equals(c0599Kp.f9540a) : c0599Kp.f9540a == null) {
                String str2 = c0599Kp.f9541b;
                Drawable drawable2 = c0599Kp.f9542c;
                if (this.f9541b.equals(str2) && ((drawable = this.f9542c) != null ? drawable.equals(drawable2) : drawable2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9540a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f9541b.hashCode();
        Drawable drawable = this.f9542c;
        return (drawable != null ? drawable.hashCode() : 0) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f9542c);
        String str = this.f9540a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.f9541b;
        StringBuilder sb = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        A.f.w(sb, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return AbstractC1135f5.n(sb, ", icon=", strValueOf, "}");
    }
}
