package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j81 extends z71 {

    /* renamed from: p, reason: collision with root package name */
    public i81 f12674p;

    @Override // com.google.android.gms.internal.ads.m71
    public final void l() {
        i81 i81Var = this.f12674p;
        if (i81Var != null) {
            i81Var.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void s(int i4) {
        this.f19034l = null;
        if (i4 == 1) {
            this.f12674p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void y() {
        i81 i81Var = this.f12674p;
        if (i81Var != null) {
            try {
                i81Var.f12171c.execute(i81Var);
            } catch (RejectedExecutionException e2) {
                i81Var.f12172d.f(e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void x(int i4, Object obj) {
    }
}
