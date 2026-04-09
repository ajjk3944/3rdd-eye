package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0754Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC2430rY A00;
    public InterfaceC2418rI A01;
    public C2406r5 A02;
    public final InterfaceC2419rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2418rI A03 = new C0755Ap(this);

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 106);
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

    public C0754Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC2430rY interfaceC2430rY, InterfaceC2419rJ interfaceC2419rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2430rY;
        this.A04 = interfaceC2419rJ;
    }

    public static C0754Ao A01() {
        return new C0754Ao(new ViewpointQeConfig(), new C0757Ar(), null);
    }

    private void A05(AbstractC2421rL abstractC2421rL, InterfaceC2426rQ interfaceC2426rQ, InterfaceC0752Al interfaceC0752Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C2406r5.A01(this.A05, abstractC2421rL, interfaceC2426rQ, interfaceC0752Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C2427rU c2427rU) {
        C2406r5 c2406r5 = this.A02;
        if (c2406r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c2427rU != null) {
                c2406r5.A07(dspViewableNode, c2427rU);
            } else {
                c2406r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2427rU c2427rU, C2423rN c2423rN) {
        C2406r5 c2406r5 = this.A02;
        if (c2406r5 != null && dspViewableNode != null && c2423rN != null) {
            if (this.A05.A00 && c2427rU != null) {
                c2423rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2423rN.A08 + c2427rU;
                c2406r5.A08(dspViewableNode, c2427rU, c2423rN);
            } else {
                c2406r5.A09(dspViewableNode, c2423rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2423rN<?, ?> c2423rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2423rN);
    }

    public final void A0A(AbstractC2421rL abstractC2421rL, View view) {
        if (abstractC2421rL != null && view != null) {
            A05(abstractC2421rL, new C0756Aq(view, this.A00), new C05461u(null), null);
        }
    }
}
