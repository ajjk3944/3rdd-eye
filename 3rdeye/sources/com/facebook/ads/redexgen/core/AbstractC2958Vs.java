package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Vs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2958Vs extends RelativeLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<InterfaceC2949Vj> A01 = new AtomicReference<>();

    public static void A00(boolean z10, InterfaceC2949Vj interfaceC2949Vj) {
        A00.set(z10);
        A01.set(interfaceC2949Vj);
    }
}
