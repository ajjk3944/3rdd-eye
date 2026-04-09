package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class DA {

    /* renamed from: a, reason: collision with root package name */
    public final String f7731a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7732b;

    public DA(String str, String str2) {
        this.f7731a = str;
        this.f7732b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DA) {
            DA da = (DA) obj;
            String str = this.f7731a;
            if (str != null ? str.equals(da.f7731a) : da.f7731a == null) {
                String str2 = this.f7732b;
                if (str2 != null ? str2.equals(da.f7732b) : da.f7732b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7731a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f7732b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f7731a;
        int length = String.valueOf(str).length();
        String str2 = this.f7732b;
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        A.f.w(sb, "OverlayDisplayUpdateRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
