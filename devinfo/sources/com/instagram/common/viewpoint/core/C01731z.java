package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C01731z {
    public final AudioAttributes A00;

    public C01731z(C2002qQ c2002qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2002qQ.A02).setFlags(c2002qQ.A03).setUsage(c2002qQ.A05);
        if (C5C.A02 >= 29) {
            C01711x.A00(usage, c2002qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C01721y.A00(usage, c2002qQ.A04);
        }
        this.A00 = usage.build();
    }
}
