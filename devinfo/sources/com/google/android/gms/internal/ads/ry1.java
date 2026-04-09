package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ry1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15790a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15791b;

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public ry1(String str, String str2) {
        this.f15790a = bq0.o(str);
        this.f15791b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ry1.class == obj.getClass()) {
            ry1 ry1Var = (ry1) obj;
            if (Objects.equals(this.f15790a, ry1Var.f15790a) && Objects.equals(this.f15791b, ry1Var.f15791b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f15791b.hashCode() * 31;
        String str = this.f15790a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
