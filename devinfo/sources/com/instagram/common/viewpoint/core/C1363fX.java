package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.fX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1363fX {
    public static byte[] A02;
    public final AA A00;
    public final C1804nA A01 = new C1804nA();

    static {
        A02();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C1363fX(C1436gi c1436gi) {
        InterfaceC0475Em trackSelectionFactory = new C1821nR(this.A01);
        C03539h c03539h = new C03539h(trackSelectionFactory);
        AnonymousClass74 loadControl = new C1914ox();
        this.A00 = AbstractC02756b.A00(new C1911ou(c1436gi), c03539h, loadControl, this.A01);
    }

    public static String A01(C1977pz c1977pz) {
        boolean z3 = c1977pz instanceof AD;
        String strA00 = A00(36, 2, 118);
        String strA002 = A00(0, 14, 108);
        if (z3) {
            AD ad2 = (AD) c1977pz;
            return A00(55, 11, 8) + ad2.A03 + A00(14, 22, 98) + ad2.A02 + strA002 + ad2.getCause() + strA00;
        }
        return A00(41, 14, 99) + c1977pz.getMessage() + strA002 + c1977pz.getCause() + strA00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7e();
    }

    public final long A07() {
        return this.A00.A7s();
    }

    public final C1361fV A08() {
        C1996qI vf2 = this.A00.A0K();
        if (vf2 == null) {
            return null;
        }
        return new C1361fV(vf2.A0L, vf2.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f10) {
        this.A00.A0M(f10);
    }

    public final void A0D(long j) {
        this.A00.A04(j);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C1432ge c1432ge, Uri uri) {
        if (C0886Up.A2z(c1432ge, A03())) {
            C1367fb cacheManager = C1367fb.A06(c1432ge);
            C5Y cachedDataSourceFactory = cacheManager.A0H(c1432ge);
            this.A00.A0Q(new C03589o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC0434Cx mediaSource = new C03589o(new C1931pE(c1432ge, C5C.A0j(c1432ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC1360fU interfaceC1360fU) {
        this.A00.A0O(new D6(this, interfaceC1360fU));
    }

    public final void A0H(final InterfaceC1362fW interfaceC1362fW) {
        this.A00.A0P(new InterfaceC1902ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.instagram.common.viewpoint.core.C5L
            public final void AGa(int i4, int i10, int i11, float f10) {
                interfaceC1362fW.AGa(i4, i10, i11, f10);
            }
        });
    }

    public final void A0I(boolean z3) {
        this.A00.A0S(z3);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
