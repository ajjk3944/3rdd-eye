package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0560Hu {
    public final InterfaceC0543Hd A00;

    public abstract boolean A0B(C02434v c02434v) throws C3K;

    public abstract boolean A0C(C02434v c02434v, long j) throws C3K;

    public AbstractC0560Hu(InterfaceC0543Hd interfaceC0543Hd) {
        this.A00 = interfaceC0543Hd;
    }

    public final boolean A00(C02434v c02434v, long j) throws C3K {
        return A0B(c02434v) && A0C(c02434v, j);
    }
}
