package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05511z {
    public final AudioAttributes A00;

    public C05511z(C2380qQ c2380qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2380qQ.A02).setFlags(c2380qQ.A03).setUsage(c2380qQ.A05);
        if (C5C.A02 >= 29) {
            C05491x.A00(usage, c2380qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C05501y.A00(usage, c2380qQ.A04);
        }
        this.A00 = usage.build();
    }
}
