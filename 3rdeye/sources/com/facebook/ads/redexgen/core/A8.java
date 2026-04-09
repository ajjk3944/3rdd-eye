package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: assets/audience_network.dex */
public final class A8 implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public static String[] A09 = {"BoSaZzMMCoBoab6kFzr2tWGVTni5", "Vk9jbaVPkS6rtGXBWv67wEIKcLe3GnXQ", "GJsVZyBqNYZRU43kGmqANe", "Uv9MZIJr", "GbPwVrzkFOEMxWNTB1P9oG5CUgrItJXy", "gWutc4DO", "1FOrRj10jdO8", "rnakDij4LZYpzXru71B"};
    public InterfaceC4002q2 A00;
    public InterfaceC3991pp A01;
    public C3978pb A02;
    public final InterfaceC3992pq A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC3991pp A03 = new A9(this);

    public static String A02(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i10);
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

    public A8(ViewpointQeConfig viewpointQeConfig, InterfaceC4002q2 interfaceC4002q2, InterfaceC3992pq interfaceC3992pq) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC4002q2;
        this.A04 = interfaceC3992pq;
    }

    public static A8 A01() {
        return new A8(new ViewpointQeConfig(), new AC(), null);
    }

    private void A05(AbstractC3994ps abstractC3994ps, InterfaceC3999px interfaceC3999px, A6 a62) {
        this.A02 = C3978pb.A00(this.A05, abstractC3994ps, interfaceC3999px, a62);
        if (0 != 0) {
            this.A02.A01(null);
        }
        this.A02.A02(this.A03);
        String[] strArr = A09;
        if (strArr[4].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        A09[7] = "2MhPhimmgHBptxasGUILH2";
    }

    private void A06(DspViewableNode dspViewableNode, C4000q0 c4000q0) {
        C3978pb c3978pb = this.A02;
        if (c3978pb != null && dspViewableNode != null) {
            if (this.A05.A00 && c4000q0 != null) {
                c3978pb.A04(dspViewableNode, c4000q0);
            } else {
                c3978pb.A03(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C4000q0 c4000q0, C3996pu c3996pu) {
        C3978pb c3978pb = this.A02;
        if (c3978pb != null && dspViewableNode != null && c3996pu != null) {
            if (this.A05.A00 && c4000q0 != null) {
                c3996pu.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c3996pu.A08 + c4000q0;
                c3978pb.A05(dspViewableNode, c4000q0, c3996pu);
            } else {
                c3978pb.A06(dspViewableNode, c3996pu);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C3996pu<?, ?> c3996pu) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c3996pu);
    }

    public final void A0A(AbstractC3994ps abstractC3994ps, View view) {
        if (abstractC3994ps != null && view != null) {
            A05(abstractC3994ps, new AA(view, this.A00), new C1H(null));
        }
    }
}
