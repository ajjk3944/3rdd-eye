package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ar0 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f24797a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f24798b;

    public ar0(Integer num, Integer num2) {
        this.f24797a = num;
        this.f24798b = num2;
    }

    public final Integer a() {
        return this.f24798b;
    }

    public final Integer b() {
        return this.f24797a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar0)) {
            return false;
        }
        ar0 ar0Var = (ar0) obj;
        return kotlin.jvm.internal.l.b(this.f24797a, ar0Var.f24797a) && kotlin.jvm.internal.l.b(this.f24798b, ar0Var.f24798b);
    }

    public final int hashCode() {
        Integer num = this.f24797a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f24798b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutParamsSize(width=" + this.f24797a + ", height=" + this.f24798b + ")";
    }
}
