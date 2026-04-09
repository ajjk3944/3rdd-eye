package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.rG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2039rG implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2038rF A01;
    public final /* synthetic */ Exception A02;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{58, 56, 41, 25, 56, 49, 60, 36};
    }

    public RunnableC2039rG(C2038rF c2038rF, int i4, Exception exc) {
        this.A01 = c2038rF;
        this.A00 = i4;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A01.A01) {
                    if (!C0376Ao.A07 || !this.A01.A0B()) {
                        this.A01.A08(this.A01.A05.ACf());
                        C2038rF.A03(this.A01);
                        if (0 == 0) {
                            int delay = this.A00;
                            this.A01.A04.postDelayed(this.A01.A0C, delay);
                            return;
                        } else {
                            C2038rF.A03(this.A01);
                            throw new NullPointerException(A00(0, 8, 12));
                        }
                    }
                    this.A01.A0F();
                }
            } catch (Exception ex) {
                ex.initCause(this.A02);
                throw ex;
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
