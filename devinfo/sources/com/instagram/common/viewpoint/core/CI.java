package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class CI implements InterfaceC1486hW {
    public static byte[] A02;
    public static final CI A03;
    public String A01 = A01(1, 7, 98);
    public int A00 = 5;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{-33, 1, -6, -9, -6, -5, 3, -6};
    }

    static {
        A05();
        A03 = new CI();
    }

    public static CI A00() {
        return A03;
    }

    private String A02(String str) {
        if (this.A01 != null) {
            return this.A01 + A01(0, 1, 123) + str;
        }
        return str;
    }

    public static String A03(String str, Throwable th2) {
        return str + '\n' + A04(th2);
    }

    public static String A04(Throwable th2) {
        if (th2 == null) {
            return A01(0, 0, 21);
        }
        return Log.getStackTraceString(th2);
    }

    private void A06(int i4, String str, String str2) {
        Log.println(i4, A02(str), str2);
    }

    private void A07(int i4, String str, String str2, Throwable th2) {
        Log.println(i4, A02(str), A03(str2, th2));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1486hW
    public final void A9t(String str, String str2) {
        A06(4, str, str2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1486hW
    public final void A9u(String str, String str2, Throwable th2) {
        A07(4, str, str2, th2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1486hW
    public final boolean AAY(int i4) {
        return this.A00 <= i4;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1486hW
    public final void AJY(int i4) {
        this.A00 = i4;
    }
}
