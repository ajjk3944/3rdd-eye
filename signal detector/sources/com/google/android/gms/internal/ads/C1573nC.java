package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.nC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1573nC extends AbstractC1087eC implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C0911b.f13269k.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1573nC)) {
            return false;
        }
        ((C1573nC) obj).getClass();
        BB bb = C0911b.f13269k;
        return bb.equals(bb);
    }

    public final int hashCode() {
        return -C0911b.f13269k.hashCode();
    }

    public final String toString() {
        return C0911b.f13269k.toString().concat(".reverse()");
    }
}
