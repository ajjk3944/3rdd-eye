package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class V3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36233a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f36234b;

    V3(A3 a32, t7 t7Var) {
        this.f36233a = t7Var;
        this.f36234b = a32;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f36234b.f35772a.K0();
        return new C4917o(this.f36234b.f35772a.c(this.f36233a.f36748a));
    }
}
