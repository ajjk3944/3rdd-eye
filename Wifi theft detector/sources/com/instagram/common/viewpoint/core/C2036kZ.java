package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2036kZ implements InterfaceC1044Lx {
    public final InterfaceC1041Lu A00;

    public C2036kZ(InterfaceC1041Lu interfaceC1041Lu) {
        this.A00 = interfaceC1041Lu;
    }

    public final InterfaceC1041Lu A00() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1044Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1044Lx
    public final C2040kd ACM() {
        return new C2040kd(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1044Lx
    public final C2040kd ACN(String str) {
        return new C2040kd(this, str);
    }
}
