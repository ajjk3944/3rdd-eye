package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u3 implements c8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f17041a;

    public u3(long j) {
        this.f17041a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && u3.class == obj.getClass() && this.f17041a == ((u3) obj).f17041a;
    }

    public final int hashCode() {
        long j = this.f17041a;
        return ((int) (j ^ (j >>> 32))) + 527;
    }

    public final String toString() {
        long j = this.f17041a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 38);
        sb2.append("ThumbnailMetadata: presentationTimeUs=");
        sb2.append(j);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final /* synthetic */ void a(o6 o6Var) {
    }
}
