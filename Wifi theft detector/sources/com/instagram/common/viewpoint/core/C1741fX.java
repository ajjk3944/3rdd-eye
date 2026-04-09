package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.fX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1741fX {
    public static byte[] A02;
    public final AA A00;
    public final C2182nA A01 = new C2182nA();

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C1741fX(C1814gi c1814gi) {
        InterfaceC0853Em trackSelectionFactory = new C2199nR(this.A01);
        C07319h c07319h = new C07319h(trackSelectionFactory);
        AnonymousClass74 loadControl = new C2292ox();
        this.A00 = AbstractC06536b.A00(new C2289ou(c1814gi), c07319h, loadControl, this.A01);
    }

    public static String A01(C2355pz c2355pz) {
        boolean z10 = c2355pz instanceof AD;
        String strA00 = A00(36, 2, 118);
        String strA002 = A00(0, 14, 108);
        if (z10) {
            AD ad = (AD) c2355pz;
            return A00(55, 11, 8) + ad.A03 + A00(14, 22, 98) + ad.A02 + strA002 + ad.getCause() + strA00;
        }
        return A00(41, 14, 99) + c2355pz.getMessage() + strA002 + c2355pz.getCause() + strA00;
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

    public final C1739fV A08() {
        C2374qI vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C1739fV(vf.A0L, vf.A0A);
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

    public final void A0D(long j10) {
        this.A00.A04(j10);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C1810ge c1810ge, Uri uri) {
        if (C1264Up.A2z(c1810ge, A03())) {
            C1745fb cacheManager = C1745fb.A06(c1810ge);
            C5Y cachedDataSourceFactory = cacheManager.A0H(c1810ge);
            this.A00.A0Q(new C07369o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC0812Cx mediaSource = new C07369o(new C2309pE(c1810ge, C5C.A0j(c1810ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC1738fU interfaceC1738fU) {
        this.A00.A0O(new D6(this, interfaceC1738fU));
    }

    public final void A0H(final InterfaceC1740fW interfaceC1740fW) {
        this.A00.A0P(new InterfaceC2280ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.instagram.common.viewpoint.core.C5L
            public final void AGa(int i10, int i11, int i12, float f10) {
                interfaceC1740fW.AGa(i10, i11, i12, f10);
            }
        });
    }

    public final void A0I(boolean z10) {
        this.A00.A0S(z10);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
