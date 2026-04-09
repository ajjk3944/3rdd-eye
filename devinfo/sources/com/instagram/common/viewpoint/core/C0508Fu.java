package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Fu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0508Fu implements InterfaceC0804Rk {
    public final /* synthetic */ C0798Re A00;
    public final /* synthetic */ C4U A01;

    public C0508Fu(C4U c4u, C0798Re c0798Re) {
        this.A01 = c4u;
        this.A00 = c0798Re;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0804Rk
    public final boolean AAI() {
        if (!this.A01.A0i()) {
            if (this.A01.A0j()) {
                return true;
            }
            return this.A01.A0k();
        }
        this.A01.A0h(this.A00);
        return true;
    }
}
