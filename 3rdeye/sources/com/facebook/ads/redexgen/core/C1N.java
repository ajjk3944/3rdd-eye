package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1N {
    public final AudioAttributes A00;

    public C1N(C3955oy c3955oy) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c3955oy.A02).setFlags(c3955oy.A03).setUsage(c3955oy.A05);
        if (AbstractC22614a.A02 >= 29) {
            C1L.A00(usage, c3955oy.A01);
        }
        if (AbstractC22614a.A02 >= 32) {
            C1M.A00(usage, c3955oy.A04);
        }
        this.A00 = usage.build();
    }
}
