package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QI implements InterfaceC0961Xr {
    public int A00;
    public final InterfaceC0961Xr A01;

    public QI(InterfaceC0961Xr interfaceC0961Xr, int i4) {
        this.A01 = interfaceC0961Xr;
        this.A00 = i4;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Xr
    public final void flush() {
        this.A01.flush();
    }
}
