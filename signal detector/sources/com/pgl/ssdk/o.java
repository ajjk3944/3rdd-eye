package com.pgl.ssdk;

/* loaded from: classes.dex */
public final class o<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final A f19668a;

    /* renamed from: b, reason: collision with root package name */
    private final B f19669b;

    public o(A a6, B b5) {
        this.f19668a = a6;
        this.f19669b = b5;
    }

    public static <A, B> o<A, B> a(A a6, B b5) {
        return new o<>(a6, b5);
    }

    public B b() {
        return this.f19669b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a6 = this.f19668a;
        if (a6 == null) {
            if (oVar.f19668a != null) {
                return false;
            }
        } else if (!a6.equals(oVar.f19668a)) {
            return false;
        }
        B b5 = this.f19669b;
        if (b5 == null) {
            if (oVar.f19669b != null) {
                return false;
            }
        } else if (!b5.equals(oVar.f19669b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a6 = this.f19668a;
        int iHashCode = ((a6 == null ? 0 : a6.hashCode()) + 31) * 31;
        B b5 = this.f19669b;
        return iHashCode + (b5 != null ? b5.hashCode() : 0);
    }

    public A a() {
        return this.f19668a;
    }
}
