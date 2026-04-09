package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f14513a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14514b;

    /* renamed from: c, reason: collision with root package name */
    public final x41 f14515c;

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public o2(Uri uri, x41 x41Var) {
        List list = Collections.EMPTY_LIST;
        this.f14513a = uri;
        ArrayList arrayList = ia.f12181a;
        this.f14514b = list;
        this.f14515c = x41Var;
        v41 v41Var = x41.f18307b;
        yr1.u(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (x41Var.size() <= 0) {
            x41.s(objArr, 0);
        } else {
            x41Var.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.f14513a.equals(o2Var.f14513a) && this.f14514b.equals(o2Var.f14514b) && this.f14515c.equals(o2Var.f14515c);
    }

    public final int hashCode() {
        return (int) ((((this.f14515c.hashCode() + ((this.f14514b.hashCode() + (this.f14513a.hashCode() * 923521)) * 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
