package com.google.android.gms.internal.ads;

import android.os.Trace;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cx1 f10628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f10630c;

    public e0(i0 i0Var, cx1 cx1Var, int i4, long j) {
        this.f10628a = cx1Var;
        this.f10629b = i4;
        this.f10630c = i0Var;
    }

    public final void a() {
        i0 i0Var = this.f10630c;
        i0Var.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.f10628a.p(this.f10629b);
        Trace.endSection();
        i0Var.r0(0, 1);
    }
}
