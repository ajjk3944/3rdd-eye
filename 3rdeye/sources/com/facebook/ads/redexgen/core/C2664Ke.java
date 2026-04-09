package com.facebook.ads.redexgen.core;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2664Ke {
    public static byte[] A05;
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    static {
        A02();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-81, 126, 124, -123, 124, -119, 120, -117, 124, 101, 124, -114, 96, 123, 63, 64, 55, -124, -116, -118, -117, 55, 121, 124, 55, 122, 120, -125, -125, 124, 123, 55, 121, 124, 125, -122, -119, 124, 55, -119, 124, -117, -119, -128, 124, -115, -128, -123, 126, 55, -128, 123, -118, 69};
    }

    public C2664Ke(int i, int i10) {
        this(RecyclerView.UNDEFINED_DURATION, i, i10);
    }

    public C2664Ke(int i, int i10, int i11) {
        String strA00 = A00(0, 0, 0);
        this.A04 = i != Integer.MIN_VALUE ? i + A00(0, 1, 112) : strA00;
        this.A02 = i10;
        this.A03 = i11;
        this.A00 = RecyclerView.UNDEFINED_DURATION;
        this.A01 = strA00;
    }

    private void A01() {
        if (this.A00 != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException(A00(1, 53, 7));
        }
    }

    public final int A03() {
        A01();
        return this.A00;
    }

    public final String A04() {
        A01();
        return this.A01;
    }

    public final void A05() {
        this.A00 = this.A00 == Integer.MIN_VALUE ? this.A02 : this.A00 + this.A03;
        this.A01 = this.A04 + this.A00;
    }
}
