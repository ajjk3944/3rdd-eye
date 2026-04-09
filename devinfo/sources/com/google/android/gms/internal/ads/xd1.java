package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xd1 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f18376a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f18377b;

    public /* synthetic */ xd1(Class cls, Class cls2) {
        this.f18376a = cls;
        this.f18377b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xd1)) {
            return false;
        }
        xd1 xd1Var = (xd1) obj;
        return xd1Var.f18376a.equals(this.f18376a) && xd1Var.f18377b.equals(this.f18377b);
    }

    public final int hashCode() {
        return Objects.hash(this.f18376a, this.f18377b);
    }

    public final String toString() {
        String simpleName = this.f18376a.getSimpleName();
        String simpleName2 = this.f18377b.getSimpleName();
        return r5.c.m(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
