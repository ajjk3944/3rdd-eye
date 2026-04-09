package com.google.common.collect;

import java.io.Serializable;
import m4.AbstractC6767f;
import m4.AbstractC6769h;
import m4.InterfaceC6764c;

/* renamed from: com.google.common.collect.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5060f extends G implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6764c f38358a;

    /* renamed from: b, reason: collision with root package name */
    final G f38359b;

    C5060f(InterfaceC6764c interfaceC6764c, G g10) {
        this.f38358a = (InterfaceC6764c) AbstractC6769h.i(interfaceC6764c);
        this.f38359b = (G) AbstractC6769h.i(g10);
    }

    @Override // com.google.common.collect.G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f38359b.compare(this.f38358a.apply(obj), this.f38358a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5060f)) {
            return false;
        }
        C5060f c5060f = (C5060f) obj;
        return this.f38358a.equals(c5060f.f38358a) && this.f38359b.equals(c5060f.f38359b);
    }

    public int hashCode() {
        return AbstractC6767f.b(this.f38358a, this.f38359b);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f38359b);
        String strValueOf2 = String.valueOf(this.f38358a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(".onResultOf(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
