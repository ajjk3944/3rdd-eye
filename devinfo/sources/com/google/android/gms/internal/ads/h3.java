package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h3 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11688a;

    /* renamed from: b, reason: collision with root package name */
    public final p2 f11689b;

    public h3(int i4) {
        this.f11688a = i4;
        switch (i4) {
            case 1:
                this.f11689b = new p2(35152, 2, "image/png");
                break;
            default:
                this.f11689b = new p2(16973, 2, "image/bmp");
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        switch (this.f11688a) {
        }
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) {
        switch (this.f11688a) {
        }
        return this.f11689b.c(y1Var);
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
        int i4 = this.f11688a;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        switch (this.f11688a) {
            case 0:
                this.f11689b.e(z1Var);
                break;
            default:
                this.f11689b.e(z1Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        switch (this.f11688a) {
            case 0:
                this.f11689b.f(j, j8);
                break;
            default:
                this.f11689b.f(j, j8);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final int g(y1 y1Var, c2 c2Var) {
        switch (this.f11688a) {
        }
        return this.f11689b.g(y1Var, c2Var);
    }

    private final void b() {
    }

    private final void h() {
    }
}
