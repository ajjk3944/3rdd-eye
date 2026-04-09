package com.instagram.common.viewpoint.core;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.n9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1803n9 implements FF {
    public final int A00;

    public C1803n9() {
        this(-1);
    }

    public C1803n9(int i4) {
        this.A00 = i4;
    }

    @Override // com.instagram.common.viewpoint.core.FF
    public final int A8Z(int i4) {
        if (this.A00 == -1) {
            if (i4 == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.FF
    public final long A8u(FE fe2) {
        IOException iOException = fe2.A03;
        if ((iOException instanceof C3K) || (iOException instanceof FileNotFoundException) || (iOException instanceof AM) || (iOException instanceof FP) || C02495b.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((fe2.A00 - 1) * 1000, PAGErrorCode.LOAD_FACTORY_NULL_CODE);
    }
}
