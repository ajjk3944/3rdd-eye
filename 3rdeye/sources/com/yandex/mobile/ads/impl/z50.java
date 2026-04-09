package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class z50 {

    /* renamed from: a, reason: collision with root package name */
    private final a60 f36205a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36206b;

    public z50(a60 type, String value) {
        kotlin.jvm.internal.l.f(type, "type");
        kotlin.jvm.internal.l.f(value, "value");
        this.f36205a = type;
        this.f36206b = value;
    }

    public final a60 a() {
        return this.f36205a;
    }

    public final String b() {
        return this.f36206b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z50)) {
            return false;
        }
        z50 z50Var = (z50) obj;
        return this.f36205a == z50Var.f36205a && kotlin.jvm.internal.l.b(this.f36206b, z50Var.f36206b);
    }

    public final int hashCode() {
        return this.f36206b.hashCode() + (this.f36205a.hashCode() * 31);
    }

    public final String toString() {
        return "ExclusionRule(type=" + this.f36205a + ", value=" + this.f36206b + ")";
    }
}
