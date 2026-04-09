package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0376Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC2052rY A00;
    public InterfaceC2040rI A01;
    public C2028r5 A02;
    public final InterfaceC2041rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2040rI A03 = new C0377Ap(this);

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C0376Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC2052rY interfaceC2052rY, InterfaceC2041rJ interfaceC2041rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2052rY;
        this.A04 = interfaceC2041rJ;
    }

    public static C0376Ao A01() {
        return new C0376Ao(new ViewpointQeConfig(), new C0379Ar(), null);
    }

    private void A05(AbstractC2043rL abstractC2043rL, InterfaceC2048rQ interfaceC2048rQ, InterfaceC0374Al interfaceC0374Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C2028r5.A01(this.A05, abstractC2043rL, interfaceC2048rQ, interfaceC0374Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C2049rU c2049rU) {
        C2028r5 c2028r5 = this.A02;
        if (c2028r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c2049rU != null) {
                c2028r5.A07(dspViewableNode, c2049rU);
            } else {
                c2028r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2049rU c2049rU, C2045rN c2045rN) {
        C2028r5 c2028r5 = this.A02;
        if (c2028r5 != null && dspViewableNode != null && c2045rN != null) {
            if (this.A05.A00 && c2049rU != null) {
                c2045rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2045rN.A08 + c2049rU;
                c2028r5.A08(dspViewableNode, c2049rU, c2045rN);
            } else {
                c2028r5.A09(dspViewableNode, c2045rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2045rN<?, ?> c2045rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2045rN);
    }

    public final void A0A(AbstractC2043rL abstractC2043rL, View view) {
        if (abstractC2043rL != null && view != null) {
            A05(abstractC2043rL, new C0378Aq(view, this.A00), new C01681u(null), null);
        }
    }
}
