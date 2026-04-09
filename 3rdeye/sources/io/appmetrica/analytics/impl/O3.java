package io.appmetrica.analytics.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class O3 implements InterfaceC4633g8 {

    /* renamed from: a, reason: collision with root package name */
    public final N3 f39919a;

    /* renamed from: b, reason: collision with root package name */
    public final List f39920b;

    public O3(N3 n32, List<N3> list) {
        this.f39919a = n32;
        this.f39920b = list;
    }

    public final O3 a(N3 n32, List<N3> list) {
        return new O3(n32, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4633g8
    public final Object b() {
        return this.f39919a;
    }

    public final N3 c() {
        return this.f39919a;
    }

    public final List<N3> d() {
        return this.f39920b;
    }

    public final N3 e() {
        return this.f39919a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O3)) {
            return false;
        }
        O3 o32 = (O3) obj;
        return kotlin.jvm.internal.l.b(this.f39919a, o32.f39919a) && kotlin.jvm.internal.l.b(this.f39920b, o32.f39920b);
    }

    public final int hashCode() {
        return this.f39920b.hashCode() + (this.f39919a.hashCode() * 31);
    }

    public final String toString() {
        return "ClidsInfo(chosen=" + this.f39919a + ", candidates=" + this.f39920b + ')';
    }

    public static O3 a(O3 o32, N3 n32, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            n32 = o32.f39919a;
        }
        if ((i & 2) != 0) {
            list = o32.f39920b;
        }
        o32.getClass();
        return new O3(n32, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4633g8
    public final List<N3> a() {
        return this.f39920b;
    }
}
