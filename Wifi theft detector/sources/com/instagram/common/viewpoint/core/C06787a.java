package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06787a extends AbstractC1949j0 {
    public static byte[] A00;
    public static String[] A01 = {"vV6RQP0QGAizSnvHrhrEiTJKYqnkk7vR", "gVueu7WJkm8gI", "", "raAPQvYZN3qaAVuN8G4E0NVfm2Y0LRUe", "w5hc", "", "RHGb3VvP2c2qxldOqnFEpaAIYmVmOJg8", "ZdfM9COnhESAyQW1NqvAdN1Ku5n51qre"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-43, -45, -32, -110, -31, -32, -34, -21, -110, -27, -41, -26, -110, -31, -32, -110, -28, -41, -23, -45, -28, -42, -41, -42, -110, -24, -37, -42, -41, -31, -110, -45, -42, -27, -80, -79, 98, -93, -90, -93, -78, -74, -89, -76, 98, -76, -89, -93, -90, -69, 98, -74, -79, 98, -75, -89, -74, 98, -76, -89, -71, -93, -76, -90, 98, -79, -80};
    }

    static {
        A02();
    }

    public C06787a(C1814gi c1814gi, O7 o72) {
        super(c1814gi, o72);
    }

    private C1938ip A00(Runnable runnable) {
        return new C1938ip(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1949j0
    public final void A0P() {
        AbstractC1983jh abstractC1983jh = (AbstractC1983jh) this.A01;
        abstractC1983jh.A00(this.A08.A00);
        abstractC1983jh.A01(this.A08.A01);
        abstractC1983jh.A0J();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1949j0
    public final void A0R(N1 n12, C1245Tw c1245Tw, C1243Tu c1243Tu, O8 o82) {
        C07007w c07007w = (C07007w) n12;
        C1942it c1942it = new C1942it(this, o82, c07007w);
        if (C1264Up.A2f(this.A0B)) {
            Handler handlerA0H = A0H();
            C1246Tx c1246TxA05 = c1245Tw.A05();
            String[] strArr = A01;
            if (strArr[3].charAt(31) != strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "";
            strArr2[2] = "";
            handlerA0H.postDelayed(c1942it, c1246TxA05.A05());
        }
        c07007w.A0K(this.A0B, A00(c1942it), o82, this.A08.A06, this.A08.A04, this.A08.A05);
    }

    public final void A0a(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A8k() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC1983jh rewardedVideoAdapter = (AbstractC1983jh) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 82));
        }
        throw new IllegalStateException(A01(34, 33, 34));
    }
}
