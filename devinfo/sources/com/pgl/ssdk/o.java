package com.pgl.ssdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final A f21539a;

    /* renamed from: b, reason: collision with root package name */
    private final B f21540b;

    public o(A a10, B b10) {
        this.f21539a = a10;
        this.f21540b = b10;
    }

    public static <A, B> o<A, B> a(A a10, B b10) {
        return new o<>(a10, b10);
    }

    public final B b() {
        return this.f21540b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a10 = this.f21539a;
        if (a10 == null) {
            if (oVar.f21539a != null) {
                return false;
            }
        } else if (!a10.equals(oVar.f21539a)) {
            return false;
        }
        B b10 = this.f21540b;
        if (b10 == null) {
            if (oVar.f21540b != null) {
                return false;
            }
        } else if (!b10.equals(oVar.f21540b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        A a10 = this.f21539a;
        int iHashCode = ((a10 == null ? 0 : a10.hashCode()) + 31) * 31;
        B b10 = this.f21540b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public final A a() {
        return this.f21539a;
    }
}
