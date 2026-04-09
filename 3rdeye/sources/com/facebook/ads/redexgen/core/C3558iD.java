package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.iD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3558iD extends MR {
    public static byte[] A02;

    @Nullable
    public final C3556iB A00;
    public final US A01;

    static {
        A02();
    }

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C3558iD(C3272dL c3272dL, MS ms, C3345eX c3345eX, US us, C3556iB c3556iB) {
        super(c3272dL, ms, c3345eX);
        this.A01 = us;
        this.A00 = c3556iB;
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public final void A08(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7G())) {
            this.A02.A0F().A3D();
            AbstractC2759Nw.A02(this.A00.A0X(), X0.A00(A01(0, 6, 62)));
            this.A01.AB5(this.A00.A7G(), map);
            if (U7.A19(this.A02)) {
                String string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                W2 w2A00 = W2.A00(this.A02);
                String placementType = this.A00.A7G();
                w2A00.A0E(string, placementType);
            }
        }
    }
}
