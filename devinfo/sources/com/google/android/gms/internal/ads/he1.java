package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class he1 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11847a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f11848b;

    public /* synthetic */ he1(Class cls, Class cls2) {
        this.f11847a = cls;
        this.f11848b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof he1)) {
            return false;
        }
        he1 he1Var = (he1) obj;
        return he1Var.f11847a.equals(this.f11847a) && he1Var.f11848b.equals(this.f11848b);
    }

    public final int hashCode() {
        return Objects.hash(this.f11847a, this.f11848b);
    }

    public final String toString() {
        String simpleName = this.f11847a.getSimpleName();
        String simpleName2 = this.f11848b.getSimpleName();
        return r5.c.m(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
