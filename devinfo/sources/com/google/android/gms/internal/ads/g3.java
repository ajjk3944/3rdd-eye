package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g3 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11359a;

    /* renamed from: b, reason: collision with root package name */
    public final sk0 f11360b;

    /* renamed from: c, reason: collision with root package name */
    public final p2 f11361c;

    public g3(int i4) {
        this.f11359a = i4;
        switch (i4) {
            case 1:
                this.f11360b = new sk0(4);
                this.f11361c = new p2(-1, -1, "image/webp");
                break;
            default:
                this.f11360b = new sk0(4);
                this.f11361c = new p2(-1, -1, "image/avif");
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        switch (this.f11359a) {
        }
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) throws EOFException, InterruptedIOException {
        switch (this.f11359a) {
            case 0:
                t1 t1Var = (t1) y1Var;
                t1Var.e(4, false);
                sk0 sk0Var = this.f11360b;
                sk0Var.y(4);
                t1Var.O1(sk0Var.f16446a, 0, 4, false);
                if (sk0Var.P() == 1718909296) {
                    sk0Var.y(4);
                    t1Var.O1(sk0Var.f16446a, 0, 4, false);
                    if (sk0Var.P() == 1635150182) {
                    }
                }
                break;
            default:
                sk0 sk0Var2 = this.f11360b;
                sk0Var2.y(4);
                t1 t1Var2 = (t1) y1Var;
                t1Var2.O1(sk0Var2.f16446a, 0, 4, false);
                if (sk0Var2.P() == 1380533830) {
                    t1Var2.e(4, false);
                    sk0Var2.y(4);
                    t1Var2.O1(sk0Var2.f16446a, 0, 4, false);
                    if (sk0Var2.P() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
        int i4 = this.f11359a;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        switch (this.f11359a) {
            case 0:
                this.f11361c.e(z1Var);
                break;
            default:
                this.f11361c.e(z1Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        switch (this.f11359a) {
            case 0:
                this.f11361c.f(j, j8);
                break;
            default:
                this.f11361c.f(j, j8);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final int g(y1 y1Var, c2 c2Var) {
        switch (this.f11359a) {
        }
        return this.f11361c.g(y1Var, c2Var);
    }

    private final void b() {
    }

    private final void h() {
    }
}
