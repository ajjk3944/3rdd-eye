package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC0980Yk implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC02976x A00;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-106, -108, -122, -109, -128, -125, -106, -121, -121, -122, -109, -122, -123, -128, -124, -115, -118, -124, -116, -128, -126, -121, -107, -122, -109, -128, -123, -122, -115, -126, -102};
    }

    public RunnableC0980Yk(ViewOnClickListenerC02976x viewOnClickListenerC02976x) {
        this.A00 = viewOnClickListenerC02976x;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0I(A00(0, 31, 20));
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
