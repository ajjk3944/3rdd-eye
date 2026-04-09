package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class SA implements Serializable, RA {

    /* renamed from: a, reason: collision with root package name */
    public final List f11150a;

    @Override // com.google.android.gms.internal.ads.RA
    public final boolean b(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f11150a;
            if (i >= list.size()) {
                return true;
            }
            if (!((RA) list.get(i)).b(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SA) {
            return this.f11150a.equals(((SA) obj).f11150a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11150a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z6 = true;
        for (Object obj : this.f11150a) {
            if (!z6) {
                sb.append(',');
            }
            sb.append(obj);
            z6 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
