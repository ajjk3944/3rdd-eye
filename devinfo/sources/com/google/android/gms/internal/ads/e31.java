package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e31 implements Serializable, d31 {

    /* renamed from: a, reason: collision with root package name */
    public final List f10692a;

    @Override // com.google.android.gms.internal.ads.d31
    public final boolean c(Object obj) {
        int i4 = 0;
        while (true) {
            List list = this.f10692a;
            if (i4 >= list.size()) {
                return true;
            }
            if (!((d31) list.get(i4)).c(obj)) {
                return false;
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e31) {
            return this.f10692a.equals(((e31) obj).f10692a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10692a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z3 = true;
        for (Object obj : this.f10692a) {
            if (!z3) {
                sb2.append(',');
            }
            sb2.append(obj);
            z3 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
