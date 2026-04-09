package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1831s1 implements B3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f16655a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16656b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16657c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16658d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16659e;

    public C1831s1(long j6, long j7, long j8, long j9, long j10) {
        this.f16655a = j6;
        this.f16656b = j7;
        this.f16657c = j8;
        this.f16658d = j9;
        this.f16659e = j10;
    }

    @Override // com.google.android.gms.internal.ads.B3
    public final /* synthetic */ void a(O2 o22) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1831s1.class == obj.getClass()) {
            C1831s1 c1831s1 = (C1831s1) obj;
            if (this.f16655a == c1831s1.f16655a && this.f16656b == c1831s1.f16656b && this.f16657c == c1831s1.f16657c && this.f16658d == c1831s1.f16658d && this.f16659e == c1831s1.f16659e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f16655a;
        long j7 = this.f16656b;
        int i = (((((int) (j6 ^ (j6 >>> 32))) + 527) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f16657c;
        int i3 = (i + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f16658d;
        int i6 = (i3 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f16659e;
        return i6 + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        long j6 = this.f16655a;
        int length = String.valueOf(j6).length();
        long j7 = this.f16656b;
        int length2 = String.valueOf(j7).length();
        long j8 = this.f16657c;
        int length3 = String.valueOf(j8).length();
        long j9 = this.f16658d;
        int length4 = String.valueOf(j9).length();
        long j10 = this.f16659e;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j10).length());
        A.f.v(sb, "Motion photo metadata: photoStartPosition=", j6, ", photoSize=");
        sb.append(j7);
        A.f.v(sb, ", photoPresentationTimestampUs=", j8, ", videoStartPosition=");
        sb.append(j9);
        sb.append(", videoSize=");
        sb.append(j10);
        return sb.toString();
    }
}
