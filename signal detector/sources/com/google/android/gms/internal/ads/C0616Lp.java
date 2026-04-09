package com.google.android.gms.internal.ads;

import android.app.Activity;
import s2.BinderC2894d;

/* renamed from: com.google.android.gms.internal.ads.Lp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616Lp {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f9766a;

    /* renamed from: b, reason: collision with root package name */
    public final BinderC2894d f9767b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9768c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9769d;

    public C0616Lp(Activity activity, BinderC2894d binderC2894d, String str, String str2) {
        this.f9766a = activity;
        this.f9767b = binderC2894d;
        this.f9768c = str;
        this.f9769d = str2;
    }

    public final boolean equals(Object obj) {
        BinderC2894d binderC2894d;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0616Lp) {
            C0616Lp c0616Lp = (C0616Lp) obj;
            Activity activity = c0616Lp.f9766a;
            String str3 = c0616Lp.f9769d;
            String str4 = c0616Lp.f9768c;
            BinderC2894d binderC2894d2 = c0616Lp.f9767b;
            if (this.f9766a.equals(activity) && ((binderC2894d = this.f9767b) != null ? binderC2894d.equals(binderC2894d2) : binderC2894d2 == null) && ((str = this.f9768c) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f9769d) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9766a.hashCode() ^ 1000003;
        BinderC2894d binderC2894d = this.f9767b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (binderC2894d == null ? 0 : binderC2894d.hashCode())) * 1000003;
        String str = this.f9768c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f9769d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.f9766a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f9767b);
        int length2 = strValueOf.length();
        String str = this.f9768c;
        int length3 = String.valueOf(str).length();
        String str2 = this.f9769d;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        A.f.w(sb, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        A.f.w(sb, ", gwsQueryId=", str, ", uri=", str2);
        sb.append("}");
        return sb.toString();
    }
}
