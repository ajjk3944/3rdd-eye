package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Fu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0886Fu implements InterfaceC1182Rk {
    public final /* synthetic */ C1176Re A00;
    public final /* synthetic */ C4U A01;

    public C0886Fu(C4U c4u, C1176Re c1176Re) {
        this.A01 = c4u;
        this.A00 = c1176Re;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1182Rk
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
