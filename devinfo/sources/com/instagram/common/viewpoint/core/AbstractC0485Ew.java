package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0485Ew {
    public InterfaceC0484Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C0486Ex A0b(InterfaceC03157p[] interfaceC03157pArr, C1826nW c1826nW, C1844no c1844no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC02203y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC0484Ev interfaceC0484Ev, F6 f62) {
        this.A00 = interfaceC0484Ev;
        this.A01 = f62;
    }
}
