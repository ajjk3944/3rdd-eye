package androidx.camera.core.impl;

import C.Z;

/* compiled from: TimeoutRetryPolicy.java */
/* loaded from: classes.dex */
public final class R0 implements C.Z {

    /* renamed from: b, reason: collision with root package name */
    public final long f14936b;

    /* renamed from: c, reason: collision with root package name */
    public final C.Z f14937c;

    public R0(long j4, C.Z z10) {
        A2.l.k("Timeout must be non-negative.", j4 >= 0);
        this.f14936b = j4;
        this.f14937c = z10;
    }

    @Override // C.Z
    public final long a() {
        return this.f14936b;
    }

    @Override // C.Z
    public final Z.a c(K k10) {
        Z.a aVarC = this.f14937c.c(k10);
        long j4 = this.f14936b;
        if (j4 > 0) {
            if (k10.f14900b >= j4 - aVarC.f675a) {
                return Z.a.f672d;
            }
        }
        return aVarC;
    }
}
