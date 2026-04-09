package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3978pb {
    public static C3978pb A03 = null;
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C3989pm A02;

    public C3978pb(ViewpointQeConfig viewpointQeConfig, AbstractC3994ps abstractC3994ps, C3989pm c3989pm, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c3989pm;
        abstractC3994ps.A03(new A4(c3989pm));
    }

    public static C3978pb A00(ViewpointQeConfig viewpointQeConfig, AbstractC3994ps abstractC3994ps, InterfaceC3999px interfaceC3999px, A6 a62) {
        C3978pb localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        return new C3978pb(viewpointQeConfig, abstractC3994ps, new C3989pm(viewpointQeConfig, interfaceC3999px, C2435Bg.A00, a62, viewpointRegistry, new Handler(Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(InterfaceC3993pr interfaceC3993pr) {
        this.A02.A0E(interfaceC3993pr);
    }

    public final void A02(InterfaceC3991pp interfaceC3991pp) {
        this.A02.A0F(interfaceC3991pp);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(DspViewableNode dspViewableNode, C4000q0 c4000q0) {
        if (this.A00.A00 && c4000q0 != null) {
            this.A01.A06(dspViewableNode, c4000q0);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A05(DspViewableNode dspViewableNode, C4000q0 c4000q0, C3996pu c3996pu) {
        if (this.A00.A00 && c4000q0 != null) {
            this.A01.A07(dspViewableNode, c4000q0, c3996pu);
        } else {
            this.A01.A08(dspViewableNode, c3996pu);
        }
    }

    public final void A06(DspViewableNode dspViewableNode, C3996pu c3996pu) {
        A05(dspViewableNode, null, c3996pu);
    }
}
