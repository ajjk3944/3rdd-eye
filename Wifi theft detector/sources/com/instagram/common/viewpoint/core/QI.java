package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QI implements InterfaceC1339Xr {
    public int A00;
    public final InterfaceC1339Xr A01;

    public QI(InterfaceC1339Xr interfaceC1339Xr, int i10) {
        this.A01 = interfaceC1339Xr;
        this.A00 = i10;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1339Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1339Xr
    public final void flush() {
        this.A01.flush();
    }
}
