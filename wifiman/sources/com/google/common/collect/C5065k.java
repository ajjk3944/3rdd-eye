package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import m4.AbstractC6769h;

/* renamed from: com.google.common.collect.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5065k extends G implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator f38383a;

    C5065k(Comparator comparator) {
        this.f38383a = (Comparator) AbstractC6769h.i(comparator);
    }

    @Override // com.google.common.collect.G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f38383a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5065k) {
            return this.f38383a.equals(((C5065k) obj).f38383a);
        }
        return false;
    }

    public int hashCode() {
        return this.f38383a.hashCode();
    }

    public String toString() {
        return this.f38383a.toString();
    }
}
