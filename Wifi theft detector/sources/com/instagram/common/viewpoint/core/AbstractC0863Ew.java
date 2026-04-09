package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0863Ew {
    public InterfaceC0862Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C0864Ex A0b(InterfaceC06937p[] interfaceC06937pArr, C2204nW c2204nW, C2222no c2222no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC05983y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC0862Ev interfaceC0862Ev, F6 f62) {
        this.A00 = interfaceC0862Ev;
        this.A01 = f62;
    }
}
