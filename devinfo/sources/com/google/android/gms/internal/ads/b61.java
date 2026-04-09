package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b61 extends s51 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return b.f9505k.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b61)) {
            return false;
        }
        n41 n41Var = b.f9505k;
        return n41Var.equals(n41Var);
    }

    public final int hashCode() {
        return -b.f9505k.hashCode();
    }

    public final String toString() {
        return b.f9505k.toString().concat(".reverse()");
    }
}
