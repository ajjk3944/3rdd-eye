package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QL implements InterfaceC0961Xr {
    public int A00;
    public final InterfaceC0961Xr A01;
    public final InterfaceC0961Xr A02;

    public QL(InterfaceC0961Xr interfaceC0961Xr, int i4, InterfaceC0961Xr interfaceC0961Xr2) {
        this.A01 = interfaceC0961Xr;
        this.A00 = i4;
        this.A02 = interfaceC0961Xr2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AH8(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Xr
    public final void flush() {
        this.A02.flush();
    }
}
