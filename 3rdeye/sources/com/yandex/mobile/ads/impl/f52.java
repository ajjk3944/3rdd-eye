package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class f52 {

    /* renamed from: a, reason: collision with root package name */
    private final String f27205a;

    /* renamed from: b, reason: collision with root package name */
    private final bu1 f27206b;

    public f52(String str, bu1 bu1Var) {
        this.f27205a = str;
        this.f27206b = bu1Var;
    }

    public final String a() {
        return this.f27205a;
    }

    public final bu1 b() {
        return this.f27206b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f52)) {
            return false;
        }
        f52 f52Var = (f52) obj;
        return kotlin.jvm.internal.l.b(this.f27205a, f52Var.f27205a) && this.f27206b == f52Var.f27206b;
    }

    public final int hashCode() {
        String str = this.f27205a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        bu1 bu1Var = this.f27206b;
        return iHashCode + (bu1Var != null ? bu1Var.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult(bidderToken=" + this.f27205a + ", stubReason=" + this.f27206b + ")";
    }
}
