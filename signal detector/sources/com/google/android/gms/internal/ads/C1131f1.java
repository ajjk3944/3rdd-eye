package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1131f1 implements InterfaceC1992v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14007a;

    /* renamed from: b, reason: collision with root package name */
    public final C2036vr f14008b;

    /* renamed from: c, reason: collision with root package name */
    public final O0 f14009c;

    public C1131f1(int i) {
        this.f14007a = i;
        switch (i) {
            case 1:
                this.f14008b = new C2036vr(4);
                this.f14009c = new O0(-1, -1, "image/webp");
                break;
            default:
                this.f14008b = new C2036vr(4);
                this.f14009c = new O0(-1, -1, "image/avif");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) throws EOFException, InterruptedIOException {
        switch (this.f14007a) {
            case 0:
                ((C1776r0) interfaceC2046w0).e(4, false);
                C1776r0 c1776r0 = (C1776r0) interfaceC2046w0;
                C2036vr c2036vr = this.f14008b;
                c2036vr.y(4);
                c1776r0.y(c2036vr.f17354a, 0, 4, false);
                if (c2036vr.P() == 1718909296) {
                    c2036vr.y(4);
                    c1776r0.y(c2036vr.f17354a, 0, 4, false);
                    if (c2036vr.P() == 1635150182) {
                    }
                }
                break;
            default:
                C2036vr c2036vr2 = this.f14008b;
                c2036vr2.y(4);
                C1776r0 c1776r02 = (C1776r0) interfaceC2046w0;
                c1776r02.y(c2036vr2.f17354a, 0, 4, false);
                if (c2036vr2.P() == 1380533830) {
                    c1776r02.e(4, false);
                    c2036vr2.y(4);
                    c1776r02.y(c2036vr2.f17354a, 0, 4, false);
                    if (c2036vr2.P() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final List c() {
        switch (this.f14007a) {
        }
        JB jb = LB.f9635b;
        return C1197gC.f14227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
        int i = this.f14007a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        switch (this.f14007a) {
            case 0:
                this.f14009c.e(interfaceC2100x0);
                break;
            default:
                this.f14009c.e(interfaceC2100x0);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        switch (this.f14007a) {
            case 0:
                this.f14009c.f(j6, j7);
                break;
            default:
                this.f14009c.f(j6, j7);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final int g(InterfaceC2046w0 interfaceC2046w0, A0 a02) {
        switch (this.f14007a) {
        }
        return this.f14009c.g(interfaceC2046w0, a02);
    }

    private final void a() {
    }

    private final void h() {
    }
}
