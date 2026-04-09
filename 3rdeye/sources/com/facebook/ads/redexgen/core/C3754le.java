package com.facebook.ads.redexgen.core;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.le, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3754le implements InterfaceC2508Ed {
    public final int A00;

    public C3754le() {
        this(-1);
    }

    public C3754le(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2508Ed
    public final int A8R(int i) {
        if (this.A00 == -1) {
            if (i == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2508Ed
    public final long A8m(C2507Ec c2507Ec) {
        IOException iOException = c2507Ec.A03;
        if ((iOException instanceof C22172i) || (iOException instanceof FileNotFoundException) || (iOException instanceof C23859h) || (iOException instanceof C2518En) || C22864z.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c2507Ec.A00 - 1) * 1000, 5000);
    }
}
