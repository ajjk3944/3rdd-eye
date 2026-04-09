package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pv1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15119a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15120b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15121c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15122d;

    /* renamed from: e, reason: collision with root package name */
    public final p50 f15123e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15124f;
    public final int g;

    public /* synthetic */ pv1(k2 k2Var) {
        this.f15119a = k2Var.f12983a;
        this.f15120b = k2Var.f12984b;
        this.f15121c = k2Var.f12985c;
        this.f15122d = k2Var.f12986d;
        this.f15123e = (p50) k2Var.g;
        this.f15124f = k2Var.f12987e;
        this.g = k2Var.f12988f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pv1.class == obj.getClass()) {
            pv1 pv1Var = (pv1) obj;
            if (this.f15119a == pv1Var.f15119a && this.f15120b == pv1Var.f15120b && this.f15121c == pv1Var.f15121c && this.f15122d == pv1Var.f15122d && this.f15124f == pv1Var.f15124f && this.g == pv1Var.g && this.f15123e.equals(pv1Var.f15123e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f15119a);
        Integer numValueOf2 = Integer.valueOf(this.f15120b);
        Integer numValueOf3 = Integer.valueOf(this.f15121c);
        Integer numValueOf4 = Integer.valueOf(this.f15122d);
        Integer numValueOf5 = Integer.valueOf(this.f15124f);
        Integer numValueOf6 = Integer.valueOf(this.g);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, numValueOf4, this.f15123e, numValueOf5, numValueOf6, bool, bool);
    }
}
