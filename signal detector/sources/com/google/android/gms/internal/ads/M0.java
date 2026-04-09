package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: c, reason: collision with root package name */
    public static final M0 f9790c = new M0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f9791a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9792b;

    public M0(long j6, long j7) {
        this.f9791a = j6;
        this.f9792b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M0.class == obj.getClass()) {
            M0 m02 = (M0) obj;
            if (this.f9791a == m02.f9791a && this.f9792b == m02.f9792b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9791a) * 31) + ((int) this.f9792b);
    }

    public final String toString() {
        long j6 = this.f9791a;
        int length = String.valueOf(j6).length();
        long j7 = this.f9792b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j7).length() + 1);
        A.f.v(sb, "[timeUs=", j6, ", position=");
        sb.append(j7);
        sb.append("]");
        return sb.toString();
    }
}
