package com.facebook.ads.redexgen.core;

import android.content.pm.PackageManager;
import android.os.RemoteException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2692Lg implements InterfaceC2968Wc {
    public static byte[] A01;
    public final /* synthetic */ C2688Lc A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{69, 81, 80, 75, 71, 72, 77, 71, 79};
    }

    public C2692Lg(C2688Lc c2688Lc) {
        this.A00 = c2688Lc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968Wc
    public final void ACp() throws PackageManager.NameNotFoundException, RemoteException {
        if (!this.A00.A0C && !this.A00.A0B) {
            this.A00.A0U(false, A00(0, 9, 80));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968Wc
    public final void AEn(float f10) {
    }
}
