package com.google.gson;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o extends l {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.m f20893a = new com.google.gson.internal.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof o) && ((o) obj).f20893a.equals(this.f20893a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f20893a.hashCode();
    }
}
