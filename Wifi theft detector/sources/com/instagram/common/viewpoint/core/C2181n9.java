package com.instagram.common.viewpoint.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.n9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2181n9 implements FF {
    public final int A00;

    public C2181n9() {
        this(-1);
    }

    public C2181n9(int i10) {
        this.A00 = i10;
    }

    @Override // com.instagram.common.viewpoint.core.FF
    public final int A8Z(int i10) {
        if (this.A00 == -1) {
            if (i10 == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.FF
    public final long A8u(FE fe) {
        IOException iOException = fe.A03;
        if ((iOException instanceof C3K) || (iOException instanceof FileNotFoundException) || (iOException instanceof AM) || (iOException instanceof FP) || C06275b.A00(iOException)) {
            return C.TIME_UNSET;
        }
        return Math.min((fe.A00 - 1) * 1000, 5000);
    }
}
