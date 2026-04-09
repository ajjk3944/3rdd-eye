package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Il, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2619Il implements InterfaceC3056Zo {
    public final WeakReference<C5Q> A00;

    public C2619Il(C5Q c5q) {
        this.A00 = new WeakReference<>(c5q);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3056Zo
    public final void ADT(C3055Zn c3055Zn) {
        C5Q c5q = this.A00.get();
        if (c5q != null) {
            c5q.A06 = c3055Zn.A00() != null;
            c5q.A02();
        }
    }
}
