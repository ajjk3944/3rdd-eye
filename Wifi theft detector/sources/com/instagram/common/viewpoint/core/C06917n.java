package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06917n extends AbstractC1979jd implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"", "DwBpRdjhynFrlzLsBFrR", "QSeBoONoLaQYOKTzvkglRPiKzJDmlw8V", "7gQnCJoaPerIMpa6ilCeIjK7d9DzDLkx", "0G82UgBGsFbmab2LaOSe1R1N", "BET7yFkEMT8u6XlB2K", "", "QGCw11GNV2Lw2F7bA4MSMYlzIGOyIq"};
    public static final long serialVersionUID = 5751287062553772011L;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 54);
            if (A01[5].length() != 18) {
                throw new RuntimeException();
            }
            A01[4] = "xBe8M";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83};
    }

    static {
        A02();
    }

    public C06917n(List<NR> list) {
        super(list);
    }

    public static C06917n A00(JSONObject jSONObject, C1814gi c1814gi) {
        C06917n c06917n = new C06917n(AbstractC1979jd.A08(jSONObject, c1814gi, new C1972jS()));
        c06917n.A2I(jSONObject);
        c06917n.A1N(A01(0, 12, 9));
        return c06917n;
    }

    @Override // com.instagram.common.viewpoint.core.NQ
    public final int A0o() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.NQ
    public final int A0p() {
        return 0;
    }
}
