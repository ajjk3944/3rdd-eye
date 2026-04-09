package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class CA {

    /* renamed from: a, reason: collision with root package name */
    public final int f7546a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7547b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7548c;

    public CA(int i, int i3, String str) {
        this.f7546a = i;
        this.f7547b = str;
        this.f7548c = i3;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CA) {
            CA ca = (CA) obj;
            int i = ca.f7546a;
            String str2 = ca.f7547b;
            if (this.f7546a == i && ((str = this.f7547b) != null ? str.equals(str2) : str2 == null) && this.f7548c == ca.f7548c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7547b;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.f7546a ^ 1000003) * 1000003)) * 1000003) ^ this.f7548c;
    }

    public final String toString() {
        int i = this.f7546a;
        int length = String.valueOf(i).length();
        String str = this.f7547b;
        int length2 = String.valueOf(str).length();
        int i3 = this.f7548c;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i3).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i);
        sb.append(", sessionToken=");
        sb.append(str);
        return A.f.n(sb, ", uiMode=", i3, "}");
    }
}
