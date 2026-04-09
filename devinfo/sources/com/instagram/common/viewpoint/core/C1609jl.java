package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1609jl extends N3 {
    public static byte[] A06;
    public static final String A07;
    public C1611jn A00;
    public EnumC0910Vp A01;
    public boolean A02;
    public final C1436gi A03;
    public final VA A04;
    public final AbstractC1082ay A05;

    public static String A04(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C1609jl.class.getSimpleName();
    }

    public C1609jl(C1436gi c1436gi, VA va2, AbstractC1082ay abstractC1082ay, C1381fp c1381fp, N4 n42, EnumC0910Vp enumC0910Vp) {
        super(c1436gi, n42, c1381fp);
        this.A04 = va2;
        this.A05 = abstractC1082ay;
        this.A03 = c1436gi;
        this.A01 = enumC0910Vp;
    }

    @Override // com.instagram.common.viewpoint.core.N3
    public final void A08(Map<String, String> map) {
        String string;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A03.A0F().A3L();
            AbstractC0720Oa.A02(this.A00.A05(), AbstractC0956Xm.A00(A04(0, 6, 50)));
            this.A04.ABJ(this.A00.A7O(), map);
            if (C0886Up.A1A(this.A03)) {
                if (this.A01 == EnumC0910Vp.A09) {
                    string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    string = AdPlacementType.BANNER.toString();
                }
                C0932Wl c0932WlA00 = C0932Wl.A00(this.A03);
                String placementType = this.A00.A7O();
                c0932WlA00.A0E(string, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                Y4.A00(new C1610jm(this));
            }
        }
    }

    public final void A0A(C1611jn c1611jn) {
        this.A00 = c1611jn;
    }
}
