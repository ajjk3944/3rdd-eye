package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.ox, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3954ox implements InterfaceC22342z {
    public final C3918oL A00 = new C3918oL();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i, long j4);

    public final int A00() {
        long jA6z = A6z();
        long jA7k = A7k();
        if (jA6z == -9223372036854775807L || jA7k == -9223372036854775807L) {
            return 0;
        }
        if (jA7k == 0) {
            return 100;
        }
        return AbstractC22614a.A07((int) ((100 * jA6z) / jA7k), 0, 100);
    }

    public void A01() {
        AJV(false);
    }

    public final void A02() {
        A03(A7Z());
    }

    public final void A03(int i) {
        A0H(i, -9223372036854775807L);
    }

    public final void A04(long j4) {
        A0H(A7Z(), j4);
    }
}
