package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QF implements InterfaceC0961Xr {
    public final C0960Xq A00;
    public final InterfaceC0961Xr A01;

    public QF(InterfaceC0961Xr interfaceC0961Xr, int i4, int i10) {
        this.A01 = interfaceC0961Xr;
        this.A00 = new C0960Xq(i4, i10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Xr
    public final void AH8(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && AbstractC0963Xt.A08(this.A00)) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Xr
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (AbstractC0963Xt.A08(this.A00)) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
