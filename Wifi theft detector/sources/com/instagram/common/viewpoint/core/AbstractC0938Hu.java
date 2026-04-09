package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0938Hu {
    public final InterfaceC0921Hd A00;

    public abstract boolean A0B(C06214v c06214v) throws C3K;

    public abstract boolean A0C(C06214v c06214v, long j10) throws C3K;

    public AbstractC0938Hu(InterfaceC0921Hd interfaceC0921Hd) {
        this.A00 = interfaceC0921Hd;
    }

    public final boolean A00(C06214v c06214v, long j10) throws C3K {
        return A0B(c06214v) && A0C(c06214v, j10);
    }
}
