package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q3 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15194a;

    /* renamed from: b, reason: collision with root package name */
    public final x1 f15195b;

    public q3(int i4) {
        this.f15194a = i4;
        switch (i4) {
            case 1:
                this.f15195b = new r3();
                break;
            default:
                this.f15195b = new p3();
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        switch (this.f15194a) {
        }
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) {
        switch (this.f15194a) {
            case 0:
                return ((p3) this.f15195b).c(y1Var);
            default:
                return ((r3) this.f15195b).c(y1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
        switch (this.f15194a) {
            case 0:
                ((p3) this.f15195b).d();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        switch (this.f15194a) {
            case 0:
                ((p3) this.f15195b).f14870b = z1Var;
                break;
            default:
                ((r3) this.f15195b).f15511b = z1Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        switch (this.f15194a) {
            case 0:
                ((p3) this.f15195b).f(j, j8);
                break;
            default:
                ((r3) this.f15195b).f(j, j8);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final int g(y1 y1Var, c2 c2Var) {
        switch (this.f15194a) {
            case 0:
                return ((p3) this.f15195b).g(y1Var, c2Var);
            default:
                return ((r3) this.f15195b).g(y1Var, c2Var);
        }
    }

    private final void b() {
    }
}
