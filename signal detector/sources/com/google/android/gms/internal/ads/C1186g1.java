package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1186g1 implements InterfaceC1992v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14184a;

    /* renamed from: b, reason: collision with root package name */
    public final O0 f14185b;

    public C1186g1(int i) {
        this.f14184a = i;
        switch (i) {
            case 1:
                this.f14185b = new O0(35152, 2, "image/png");
                break;
            default:
                this.f14185b = new O0(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) {
        switch (this.f14184a) {
        }
        return this.f14185b.b(interfaceC2046w0);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final List c() {
        switch (this.f14184a) {
        }
        JB jb = LB.f9635b;
        return C1197gC.f14227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
        int i = this.f14184a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        switch (this.f14184a) {
            case 0:
                this.f14185b.e(interfaceC2100x0);
                break;
            default:
                this.f14185b.e(interfaceC2100x0);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        switch (this.f14184a) {
            case 0:
                this.f14185b.f(j6, j7);
                break;
            default:
                this.f14185b.f(j6, j7);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final int g(InterfaceC2046w0 interfaceC2046w0, A0 a02) {
        switch (this.f14184a) {
        }
        return this.f14185b.g(interfaceC2046w0, a02);
    }

    private final void a() {
    }

    private final void h() {
    }
}
