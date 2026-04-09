package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1885t1 implements B3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f16837a;

    public C1885t1(long j6) {
        this.f16837a = j6;
    }

    @Override // com.google.android.gms.internal.ads.B3
    public final /* synthetic */ void a(O2 o22) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1885t1.class == obj.getClass() && this.f16837a == ((C1885t1) obj).f16837a;
    }

    public final int hashCode() {
        long j6 = this.f16837a;
        return ((int) (j6 ^ (j6 >>> 32))) + 527;
    }

    public final String toString() {
        long j6 = this.f16837a;
        StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 38);
        sb.append("ThumbnailMetadata: presentationTimeUs=");
        sb.append(j6);
        return sb.toString();
    }
}
