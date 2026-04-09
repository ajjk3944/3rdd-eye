package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QF implements InterfaceC1339Xr {
    public final C1338Xq A00;
    public final InterfaceC1339Xr A01;

    public QF(InterfaceC1339Xr interfaceC1339Xr, int i10, int i11) {
        this.A01 = interfaceC1339Xr;
        this.A00 = new C1338Xq(i10, i11);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1339Xr
    public final void AH8(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && AbstractC1341Xt.A08(this.A00)) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1339Xr
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (AbstractC1341Xt.A08(this.A00)) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
