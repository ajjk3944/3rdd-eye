package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11705a;

    /* renamed from: b, reason: collision with root package name */
    public final o2 f11706b;

    /* renamed from: c, reason: collision with root package name */
    public final a2 f11707c;

    /* renamed from: d, reason: collision with root package name */
    public final j7 f11708d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f11709e;

    static {
        v41 v41Var = x41.f18307b;
        u51 u51Var = u51.f17096e;
        List list = Collections.EMPTY_LIST;
        w3 w3Var = w3.f17852a;
        new g0();
        j7 j7Var = j7.B;
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ h5(String str, g0 g0Var, o2 o2Var, a2 a2Var, j7 j7Var) {
        w3 w3Var = w3.f17852a;
        this.f11705a = str;
        this.f11706b = o2Var;
        this.f11707c = a2Var;
        this.f11708d = j7Var;
        this.f11709e = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        if (!this.f11705a.equals(h5Var.f11705a) || !this.f11709e.equals(h5Var.f11709e) || !Objects.equals(this.f11706b, h5Var.f11706b) || !this.f11707c.equals(h5Var.f11707c) || !Objects.equals(this.f11708d, h5Var.f11708d)) {
            return false;
        }
        w3 w3Var = w3.f17852a;
        return w3Var.equals(w3Var);
    }

    public final int hashCode() {
        int iHashCode = this.f11705a.hashCode() * 31;
        o2 o2Var = this.f11706b;
        return (this.f11708d.hashCode() + ((this.f11709e.hashCode() + ((this.f11707c.hashCode() + ((iHashCode + (o2Var != null ? o2Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
