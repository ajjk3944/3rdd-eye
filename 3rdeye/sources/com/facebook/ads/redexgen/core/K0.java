package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class K0 implements InterfaceC3056Zo {
    public final WeakReference<C22945h> A00;

    public K0(C22945h c22945h) {
        this.A00 = new WeakReference<>(c22945h);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3056Zo
    public final void ADT(C3055Zn c3055Zn) {
        C22945h c22945h = this.A00.get();
        if (c22945h != null) {
            c22945h.A04 = c3055Zn.A00() != null;
            c22945h.A02();
        }
    }
}
