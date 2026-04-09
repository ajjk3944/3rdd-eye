package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class y5 {

    /* renamed from: a, reason: collision with root package name */
    private final long f35627a;

    /* renamed from: b, reason: collision with root package name */
    private final z5 f35628b;

    /* renamed from: c, reason: collision with root package name */
    private final a6 f35629c;

    public y5(long j4, z5 z5Var, a6 a6Var) {
        this.f35627a = j4;
        this.f35628b = z5Var;
        this.f35629c = a6Var;
    }

    public final long a() {
        return this.f35627a;
    }

    public final z5 b() {
        return this.f35628b;
    }

    public final a6 c() {
        return this.f35629c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return this.f35627a == y5Var.f35627a && kotlin.jvm.internal.l.b(this.f35628b, y5Var.f35628b) && this.f35629c == y5Var.f35629c;
    }

    public final int hashCode() {
        long j4 = this.f35627a;
        int i = ((int) (j4 ^ (j4 >>> 32))) * 31;
        z5 z5Var = this.f35628b;
        int iHashCode = (i + (z5Var == null ? 0 : z5Var.hashCode())) * 31;
        a6 a6Var = this.f35629c;
        return iHashCode + (a6Var != null ? a6Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdPodItem(duration=" + this.f35627a + ", skip=" + this.f35628b + ", transitionPolicy=" + this.f35629c + ")";
    }
}
