package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0831Sm {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C0832Sn A00;
    public final C0833So A01;
    public final C1432ge A02;
    public final InterfaceC1412gK A03;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, 71, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = C0831Sm.class.getSimpleName();
    }

    public C0831Sm(C1432ge c1432ge, CY cy, C0832Sn c0832Sn, C0833So c0833So) {
        this.A02 = c1432ge;
        this.A03 = cy.A5U(EnumC1413gL.A06);
        this.A00 = c0832Sn;
        this.A01 = c0833So;
        this.A03.A41(new C1444gq(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (!this.A03.AAe()) {
                this.A02.A05().AAO();
                return;
            }
            String btExtras = this.A03.A7i().optString(A00(0, 9, 7));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || C0886Up.A0j(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
