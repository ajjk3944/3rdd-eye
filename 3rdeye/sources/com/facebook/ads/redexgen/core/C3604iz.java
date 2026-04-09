package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3604iz implements InterfaceC22804t {
    public InterfaceC2699Ln A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C3604iz A00(InterfaceC2699Ln interfaceC2699Ln) {
        this.A02 = interfaceC2699Ln;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC22804t
    public final C3603iy A59() {
        return new C3603iy((InterfaceC2699Ln) C3M.A01(this.A02), this.A01, this.A00);
    }
}
