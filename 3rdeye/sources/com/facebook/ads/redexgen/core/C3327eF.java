package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3327eF {
    public static byte[] A02;
    public final C9V A00;
    public final C3755lf A01 = new C3755lf();

    static {
        A02();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C3327eF(C3272dL c3272dL) {
        EA trackSelectionFactory = new C3781m5(this.A01);
        AnonymousClass92 anonymousClass92 = new AnonymousClass92(trackSelectionFactory);
        C6S loadControl = new C3868nV();
        this.A00 = AbstractC23125z.A00(new C3865nS(c3272dL), anonymousClass92, loadControl, this.A01);
    }

    public static String A01(C3935od c3935od) {
        boolean z10 = c3935od instanceof C9Y;
        String strA00 = A00(36, 2, 118);
        String strA002 = A00(0, 14, 108);
        if (z10) {
            C9Y c9y = (C9Y) c3935od;
            return A00(55, 11, 8) + c9y.A03 + A00(14, 22, 98) + c9y.A02 + strA002 + c9y.getCause() + strA00;
        }
        return A00(41, 14, 99) + c3935od.getMessage() + strA002 + c3935od.getCause() + strA00;
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
        return this.A00.A7W();
    }

    public final long A07() {
        return this.A00.A7k();
    }

    public final C3325eD A08() {
        C3949or vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C3325eD(vf.A0L, vf.A0A);
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

    public final void A0D(long j4) {
        this.A00.A04(j4);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C3246cu c3246cu, Uri uri) {
        if (U7.A2r(c3246cu, A03())) {
            C3331eJ cacheManager = C3331eJ.A06(c3246cu);
            InterfaceC22834w cachedDataSourceFactory = cacheManager.A0H(c3246cu);
            this.A00.A0Q(new AnonymousClass99(cachedDataSourceFactory).A04(uri));
            return;
        }
        CL mediaSource = new AnonymousClass99(new C3883nk(c3246cu, AbstractC22614a.A0j(c3246cu, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC3324eC interfaceC3324eC) {
        this.A00.A0O(new CR(this, interfaceC3324eC));
    }

    public final void A0H(final InterfaceC3326eE interfaceC3326eE) {
        this.A00.A0P(new InterfaceC3854nH() { // from class: com.facebook.ads.redexgen.X.27
            @Override // com.facebook.ads.redexgen.core.InterfaceC22704j
            public final void AFq(int i, int i10, int i11, float f10) {
                interfaceC3326eE.AFq(i, i10, i11, f10);
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
