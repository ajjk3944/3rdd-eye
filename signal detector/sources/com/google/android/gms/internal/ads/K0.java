package com.google.android.gms.internal.ads;

import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    public final M0 f9416a;

    /* renamed from: b, reason: collision with root package name */
    public final M0 f9417b;

    public K0(M0 m02, M0 m03) {
        this.f9416a = m02;
        this.f9417b = m03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K0.class == obj.getClass()) {
            K0 k02 = (K0) obj;
            if (this.f9416a.equals(k02.f9416a) && this.f9417b.equals(k02.f9417b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9417b.hashCode() + (this.f9416a.hashCode() * 31);
    }

    public final String toString() {
        M0 m02 = this.f9416a;
        String string = m02.toString();
        M0 m03 = this.f9417b;
        String strConcat = m02.equals(m03) ? "" : ", ".concat(m03.toString());
        return AbstractC1135f5.o(new StringBuilder(AbstractC2763b.b(string.length() + 1, 1, strConcat)), "[", string, strConcat, "]");
    }
}
