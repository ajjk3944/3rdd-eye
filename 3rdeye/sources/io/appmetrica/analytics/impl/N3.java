package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class N3 implements InterfaceC4710j8 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f39888a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC4685i8 f39889b;

    public N3(Map<String, String> map, EnumC4685i8 enumC4685i8) {
        this.f39888a = map;
        this.f39889b = enumC4685i8;
    }

    public final N3 a(Map<String, String> map, EnumC4685i8 enumC4685i8) {
        return new N3(map, enumC4685i8);
    }

    public final Map<String, String> b() {
        return this.f39888a;
    }

    public final EnumC4685i8 c() {
        return this.f39889b;
    }

    public final Map<String, String> d() {
        return this.f39888a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N3)) {
            return false;
        }
        N3 n32 = (N3) obj;
        return kotlin.jvm.internal.l.b(this.f39888a, n32.f39888a) && this.f39889b == n32.f39889b;
    }

    public final int hashCode() {
        Map map = this.f39888a;
        return this.f39889b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.f39888a + ", source=" + this.f39889b + ')';
    }

    public static N3 a(N3 n32, Map map, EnumC4685i8 enumC4685i8, int i, Object obj) {
        if ((i & 1) != 0) {
            map = n32.f39888a;
        }
        if ((i & 2) != 0) {
            enumC4685i8 = n32.f39889b;
        }
        n32.getClass();
        return new N3(map, enumC4685i8);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4710j8
    public final EnumC4685i8 a() {
        return this.f39889b;
    }
}
