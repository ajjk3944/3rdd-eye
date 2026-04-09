package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0870Fd implements InterfaceC1182Rk {
    public final /* synthetic */ C1176Re A00;
    public final /* synthetic */ C4T A01;

    public C0870Fd(C4T c4t, C1176Re c1176Re) {
        this.A01 = c4t;
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
