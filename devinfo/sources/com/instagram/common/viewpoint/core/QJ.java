package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class QJ implements InterfaceC0961Xr {
    public static byte[] A03;
    public int A00;
    public String A01;
    public final InterfaceC0961Xr A02;

    static {
        A02();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-93, -93, -107, -104};
    }

    public QJ(InterfaceC0961Xr interfaceC0961Xr) {
        this.A02 = interfaceC0961Xr;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.AH8(this.A01 + A00(0, 4, 67) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Xr
    public final void AH8(String str) {
        if (AbstractC0963Xt.A0A(str)) {
            A01();
            this.A02.AH8(str);
            return;
        }
        String strA04 = AbstractC0963Xt.A04(str);
        String filtered = this.A01;
        if (strA04.equals(filtered)) {
            this.A00++;
            return;
        }
        A01();
        this.A01 = strA04;
        this.A00 = 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Xr
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
