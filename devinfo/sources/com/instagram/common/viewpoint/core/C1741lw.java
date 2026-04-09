package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1741lw implements H9 {
    public static byte[] A03;
    public static String[] A04 = {"IFBRawCVF0AWJOiiVagp2bzm1iWWQKSj", "auHMqC8YUXWsvqiTg7", "x05hwyQceYKgfv4KdHsaZDzMFYGIFABO", "EiWauAjA92n8uYBsDF1eTop4V9uY", "nHLlm8XHOjaWHtwU5p4BIc0GM3UweWlu", "dBwF9hq9j3gGLabp", "n4a5QuSOEmxq5i2DA2", "Zy0ftHIbrTR5qGqkd"};
    public static final HD A05;
    public HA A00;
    public AbstractC0592Jb A01;
    public boolean A02;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[3].length() == 20) {
                throw new RuntimeException();
            }
            A04[3] = "IEdap1c7a0gADNuxefg";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 36);
            i12++;
        }
    }

    public static void A02() {
        A03 = new byte[]{96, 71, 79, 74, 67, 66, 6, 82, 73, 6, 66, 67, 82, 67, 84, 75, 79, 72, 67, 6, 68, 79, 82, 85, 82, 84, 67, 71, 75, 6, 82, 95, 86, 67};
    }

    static {
        A02();
        A05 = new HD() { // from class: com.facebook.ads.redexgen.X.lx
            @Override // com.instagram.common.viewpoint.core.HD
            public final H9[] A5N() {
                return C1741lw.A04();
            }

            @Override // com.instagram.common.viewpoint.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
    }

    public static C02434v A00(C02434v c02434v) {
        c02434v.A0f(0);
        return c02434v;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean A03(InterfaceC1787ms interfaceC1787ms) throws IOException {
        JX jx = new JX();
        if (!jx.A05(interfaceC1787ms, true) || (jx.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(jx.A00, 8);
        C02434v c02434v = new C02434v(length);
        interfaceC1787ms.AGt(c02434v.A0l(), 0, length);
        if (C1743ly.A01(A00(c02434v))) {
            this.A01 = new C1743ly();
        } else if (C1738lt.A06(A00(c02434v))) {
            this.A01 = new C1738lt();
        } else {
            if (!C1740lv.A02(A00(c02434v))) {
                return false;
            }
            this.A01 = new C1740lv();
        }
        return true;
    }

    public static /* synthetic */ H9[] A04() {
        return new H9[]{new C1741lw()};
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha2) {
        this.A00 = ha2;
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final int AHL(InterfaceC1787ms interfaceC1787ms, HV hv) throws IOException {
        AbstractC02203y.A02(this.A00);
        if (this.A01 == null) {
            if (A03(interfaceC1787ms)) {
                interfaceC1787ms.AIl();
            } else {
                throw C3K.A01(A01(0, 34, 2), null);
            }
        }
        boolean z3 = this.A02;
        if (A04[0].charAt(6) == 'U') {
            throw new RuntimeException();
        }
        A04[5] = "ISTJLhLpuA8o4P7J";
        if (!z3) {
            InterfaceC0543Hd interfaceC0543HdAKS = this.A00.AKS(0, 1);
            this.A00.A6O();
            this.A01.A08(this.A00, interfaceC0543HdAKS);
            this.A02 = true;
        }
        return this.A01.A04(interfaceC1787ms, hv);
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AJ6(long j, long j8) {
        if (this.A01 != null) {
            this.A01.A07(j, j8);
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC1787ms interfaceC1787ms) throws IOException {
        try {
            return A03(interfaceC1787ms);
        } catch (C3K unused) {
            return false;
        }
    }
}
