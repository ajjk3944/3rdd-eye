package com.yandex.mobile.ads.impl;

import N7.C1094a9;

/* loaded from: classes3.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    private final jz1 f36202a;

    /* renamed from: b, reason: collision with root package name */
    private final lz1 f36203b;

    /* renamed from: c, reason: collision with root package name */
    private final long f36204c;

    public z5(jz1 jz1Var, lz1 lz1Var, long j4) {
        this.f36202a = jz1Var;
        this.f36203b = lz1Var;
        this.f36204c = j4;
    }

    public final long a() {
        return this.f36204c;
    }

    public final jz1 b() {
        return this.f36202a;
    }

    public final lz1 c() {
        return this.f36203b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5)) {
            return false;
        }
        z5 z5Var = (z5) obj;
        return this.f36202a == z5Var.f36202a && this.f36203b == z5Var.f36203b && this.f36204c == z5Var.f36204c;
    }

    public final int hashCode() {
        jz1 jz1Var = this.f36202a;
        int iHashCode = (jz1Var == null ? 0 : jz1Var.hashCode()) * 31;
        lz1 lz1Var = this.f36203b;
        int iHashCode2 = (iHashCode + (lz1Var != null ? lz1Var.hashCode() : 0)) * 31;
        long j4 = this.f36204c;
        return ((int) (j4 ^ (j4 >>> 32))) + iHashCode2;
    }

    public final String toString() {
        jz1 jz1Var = this.f36202a;
        lz1 lz1Var = this.f36203b;
        long j4 = this.f36204c;
        StringBuilder sb = new StringBuilder("AdPodSkip(transitionStrategy=");
        sb.append(jz1Var);
        sb.append(", visibility=");
        sb.append(lz1Var);
        sb.append(", delay=");
        return C1094a9.f(sb, j4, ")");
    }
}
