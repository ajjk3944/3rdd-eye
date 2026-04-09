package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class GQ {

    /* renamed from: a, reason: collision with root package name */
    public final int f8386a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8387b;

    public GQ(int i, boolean z6) {
        this.f8386a = i;
        this.f8387b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GQ.class != obj.getClass()) {
            return false;
        }
        GQ gq = (GQ) obj;
        return this.f8386a == gq.f8386a && this.f8387b == gq.f8387b;
    }

    public final int hashCode() {
        return (this.f8386a * 31) + (this.f8387b ? 1 : 0);
    }
}
