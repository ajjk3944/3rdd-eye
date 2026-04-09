package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AH implements InterfaceC1932pF {
    public static byte[] A03;
    public final int A00;
    public final AbstractC02013d A01;
    public final InterfaceC1932pF A02;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public AH(InterfaceC1932pF interfaceC1932pF, AbstractC02013d abstractC02013d, int i4) {
        this.A02 = (InterfaceC1932pF) AbstractC02203y.A01(interfaceC1932pF);
        AbstractC02203y.A01(abstractC02013d);
        this.A01 = null;
        this.A00 = i4;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final void A43(InterfaceC02675t interfaceC02675t) {
        AbstractC02203y.A01(interfaceC02675t);
        this.A02.A43(interfaceC02675t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final Map<String, List<String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final long AGi(C02565i c02565i) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01762c
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }
}
