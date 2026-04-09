package com.facebook.ads.redexgen.core;

import android.util.Log;

/* renamed from: com.facebook.ads.redexgen.X.Bb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2430Bb implements InterfaceC3448gE {
    public int A00;

    @Override // com.facebook.ads.redexgen.core.InterfaceC3448gE
    public final void A9l(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3448gE
    public final void A9m(String str, String str2, Throwable th) {
        Log.i(str, str2, th);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3448gE
    public final boolean AAP(int i) {
        return this.A00 <= i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3448gE
    public final void AIo(int i) {
        this.A00 = i;
    }
}
