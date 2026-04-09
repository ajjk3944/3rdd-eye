package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1658kZ implements InterfaceC0666Lx {
    public final InterfaceC0663Lu A00;

    public C1658kZ(InterfaceC0663Lu interfaceC0663Lu) {
        this.A00 = interfaceC0663Lu;
    }

    public final InterfaceC0663Lu A00() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0666Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0666Lx
    public final C1662kd ACM() {
        return new C1662kd(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0666Lx
    public final C1662kd ACN(String str) {
        return new C1662kd(this, str);
    }
}
