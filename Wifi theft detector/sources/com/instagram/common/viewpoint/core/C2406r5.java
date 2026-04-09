package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2406r5 {
    public static C2406r5 A03;
    public static InterfaceC2429rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2416rF A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C2406r5(ViewpointQeConfig viewpointQeConfig, AbstractC2421rL abstractC2421rL, C2416rF c2416rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2416rF;
        abstractC2421rL.A03(new C0751Aj(c2416rF));
    }

    public static ScanDelayController A00(int i10) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C2406r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC2421rL abstractC2421rL, InterfaceC2426rQ interfaceC2426rQ, InterfaceC0752Al interfaceC0752Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C2406r5 c2406r5 = A03;
        if (c2406r5 != null) {
            return c2406r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        CK ck = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C2406r5(viewpointQeConfig, abstractC2421rL, new C2416rF(viewpointQeConfig, interfaceC2426rQ, ck, interfaceC0752Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC2420rK interfaceC2420rK) {
        this.A02.A0H(interfaceC2420rK);
    }

    public final void A05(InterfaceC2418rI interfaceC2418rI) {
        this.A02.A0I(interfaceC2418rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C2427rU c2427rU) {
        if (this.A00.A00 && c2427rU != null) {
            this.A01.A06(dspViewableNode, c2427rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C2427rU c2427rU, C2423rN c2423rN) {
        if (this.A00.A00 && c2427rU != null) {
            this.A01.A07(dspViewableNode, c2427rU, c2423rN);
        } else {
            this.A01.A08(dspViewableNode, c2423rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C2423rN c2423rN) {
        A08(dspViewableNode, null, c2423rN);
    }
}
