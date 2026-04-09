package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1670p1 implements InterfaceC1992v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16096a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1992v0 f16097b;

    public C1670p1(int i) {
        this.f16096a = i;
        switch (i) {
            case 1:
                this.f16097b = new C1724q1();
                break;
            default:
                this.f16097b = new C1616o1();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) {
        switch (this.f16096a) {
            case 0:
                return ((C1616o1) this.f16097b).b(interfaceC2046w0);
            default:
                return ((C1724q1) this.f16097b).b(interfaceC2046w0);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final List c() {
        switch (this.f16096a) {
        }
        JB jb = LB.f9635b;
        return C1197gC.f14227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
        switch (this.f16096a) {
            case 0:
                ((C1616o1) this.f16097b).d();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        switch (this.f16096a) {
            case 0:
                ((C1616o1) this.f16097b).f15877b = interfaceC2100x0;
                break;
            default:
                ((C1724q1) this.f16097b).f16266b = interfaceC2100x0;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        switch (this.f16096a) {
            case 0:
                ((C1616o1) this.f16097b).f(j6, j7);
                break;
            default:
                ((C1724q1) this.f16097b).f(j6, j7);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final int g(InterfaceC2046w0 interfaceC2046w0, A0 a02) {
        switch (this.f16096a) {
            case 0:
                return ((C1616o1) this.f16097b).g(interfaceC2046w0, a02);
            default:
                return ((C1724q1) this.f16097b).g(interfaceC2046w0, a02);
        }
    }

    private final void a() {
    }
}
