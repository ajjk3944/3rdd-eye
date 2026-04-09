package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ge1 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11508a;

    /* renamed from: b, reason: collision with root package name */
    public final vl1 f11509b;

    public /* synthetic */ ge1(Class cls, vl1 vl1Var) {
        this.f11508a = cls;
        this.f11509b = vl1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ge1)) {
            return false;
        }
        ge1 ge1Var = (ge1) obj;
        return ge1Var.f11508a.equals(this.f11508a) && ge1Var.f11509b.equals(this.f11509b);
    }

    public final int hashCode() {
        return Objects.hash(this.f11508a, this.f11509b);
    }

    public final String toString() {
        String simpleName = this.f11508a.getSimpleName();
        String strValueOf = String.valueOf(this.f11509b);
        return r5.c.m(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
