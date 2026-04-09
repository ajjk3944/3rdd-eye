package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2028r5 {
    public static C2028r5 A03;
    public static InterfaceC2051rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2038rF A02;

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            byte b10 = bArrCopyOfRange[i12];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            bArrCopyOfRange[i12] = (byte) ((b10 - i11) - 7);
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

    public C2028r5(ViewpointQeConfig viewpointQeConfig, AbstractC2043rL abstractC2043rL, C2038rF c2038rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2038rF;
        abstractC2043rL.A03(new C0373Aj(c2038rF));
    }

    public static ScanDelayController A00(int i4) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C2028r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC2043rL abstractC2043rL, InterfaceC2048rQ interfaceC2048rQ, InterfaceC0374Al interfaceC0374Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C2028r5 c2028r5 = A03;
        if (c2028r5 != null) {
            return c2028r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        CK ck2 = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C2028r5(viewpointQeConfig, abstractC2043rL, new C2038rF(viewpointQeConfig, interfaceC2048rQ, ck2, interfaceC0374Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC2042rK interfaceC2042rK) {
        this.A02.A0H(interfaceC2042rK);
    }

    public final void A05(InterfaceC2040rI interfaceC2040rI) {
        this.A02.A0I(interfaceC2040rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C2049rU c2049rU) {
        if (this.A00.A00 && c2049rU != null) {
            this.A01.A06(dspViewableNode, c2049rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C2049rU c2049rU, C2045rN c2045rN) {
        if (this.A00.A00 && c2049rU != null) {
            this.A01.A07(dspViewableNode, c2049rU, c2045rN);
        } else {
            this.A01.A08(dspViewableNode, c2045rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C2045rN c2045rN) {
        A08(dspViewableNode, null, c2045rN);
    }
}
