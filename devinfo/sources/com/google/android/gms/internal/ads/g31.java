package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g31 extends c31 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11365a;

    public g31(Object obj) {
        this.f11365a = obj;
    }

    @Override // com.google.android.gms.internal.ads.c31
    public final Object a() {
        return this.f11365a;
    }

    @Override // com.google.android.gms.internal.ads.c31
    public final c31 b(z21 z21Var) {
        Object objApply = z21Var.apply(this.f11365a);
        mq0.e0(objApply, "the Function passed to Optional.transform() must not return null.");
        return new g31(objApply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g31) {
            return this.f11365a.equals(((g31) obj).f11365a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11365a.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.f11365a.toString();
        return r5.c.m(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }
}
