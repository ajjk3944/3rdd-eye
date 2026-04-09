package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.54, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass54 extends DV {
    public static byte[] A01;
    public final /* synthetic */ C3175bl A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 4, 4, 25, 4};
    }

    public AnonymousClass54(C3175bl c3175bl) {
        this.A00 = c3175bl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw) {
        new Handler(Looper.getMainLooper()).post(new RunnableC3173bj(this));
        this.A00.A0B.AFh(A00(0, 5, 126), this.A00.A03());
    }
}
