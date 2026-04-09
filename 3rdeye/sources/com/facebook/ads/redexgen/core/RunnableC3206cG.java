package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3206cG implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C22624b A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 113, 124, 125, 119, 72, 116, 121, 97, 122, 121, 123, 115, 93, 106, 106, 119, 106};
    }

    public RunnableC3206cG(C22624b c22624b) {
        this.A00 = c22624b;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0Z.AFg(A00(0, 18, 75));
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
