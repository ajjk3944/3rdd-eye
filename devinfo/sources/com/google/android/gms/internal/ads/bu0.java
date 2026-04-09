package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bu0 implements c8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9805a;

    public bu0(int i4) {
        this.f9805a = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu0) && this.f9805a == ((bu0) obj).f9805a;
    }

    public final int hashCode() {
        return this.f9805a;
    }

    public final String toString() {
        int i4 = this.f9805a;
        return d.h.q(i4, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i4).length() + 19));
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final /* synthetic */ void a(o6 o6Var) {
    }
}
