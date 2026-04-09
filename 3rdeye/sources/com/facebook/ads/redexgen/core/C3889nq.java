package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.nq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3889nq implements InterfaceC22553u {
    public Message A00;
    public C3888np A01;

    public C3889nq() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C3888np.A01(this);
    }

    public final C3889nq A01(Message message, C3888np c3888np) {
        this.A00 = message;
        this.A01 = c3888np;
        return this;
    }

    public final void A02() {
        ((Message) C3M.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((Message) C3M.A01(this.A00));
        A00();
        return success;
    }
}
