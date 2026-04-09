package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public final class C6 implements InterfaceC3386fD {
    @Override // com.facebook.ads.redexgen.core.InterfaceC3386fD
    public final long A5e() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3386fD
    public final void AJK(Object obj, long j4) throws InterruptedException {
        obj.wait(j4);
    }
}
