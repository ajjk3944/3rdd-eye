package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.lX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2094lX implements H9 {
    public static String[] A03 = {"omX6mlrNbYq0LGa8KWDQoDOxuY4Jaqsm", "5vCbKZ7gcP1deFubK5J3aMrnVGjcBeMu", "ozZJ4UCdXiLAsxGuZMu8vrfsyQyOy2Qr", "457YRIf4cJgVa", "48ELt3GeP9QgscGCGAyy0GBjQnf8y1ot", "nP9Rki4V9hDzJun2MpMPW2v7tMuO22BO", "splStgYzXsMDywgFYcc1GmuRRae3j1Zq", "jQwA1XKYR4HrKvDtyQbVDHffCNmVjAZf"};
    public static final HD A04 = new HD() { // from class: com.facebook.ads.redexgen.X.lY
        @Override // com.instagram.common.viewpoint.core.HD
        public final H9[] A5N() {
            return C2094lX.A00();
        }

        @Override // com.instagram.common.viewpoint.core.HD
        public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
            return HC.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C2093lW A02 = new C2093lW();
    public final C06214v A01 = new C06214v(2786);

    public static /* synthetic */ H9[] A00() {
        return new H9[]{new C2094lX()};
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha) {
        this.A02.A5c(ha, new LG(0, 1));
        ha.A6O();
        ha.AJ7(new C2160mn(C.TIME_UNSET));
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final int AHL(InterfaceC2165ms interfaceC2165ms, HV hv) throws IOException {
        int i10 = interfaceC2165ms.read(this.A01.A0l(), 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(i10);
        if (!this.A00) {
            this.A02.AGq(0L, 4);
            this.A00 = true;
        }
        this.A02.A5A(this.A01);
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AJ6(long j10, long j11) {
        this.A00 = false;
        this.A02.AJ5();
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC2165ms interfaceC2165ms) throws IOException {
        C06214v c06214v = new C06214v(10);
        int i10 = 0;
        while (true) {
            interfaceC2165ms.AGt(c06214v.A0l(), 0, 10);
            c06214v.A0f(0);
            if (c06214v.A0K() != 4801587) {
                interfaceC2165ms.AIl();
                interfaceC2165ms.A47(i10);
                int i11 = i10;
                int startPosition = 0;
                while (true) {
                    interfaceC2165ms.AGt(c06214v.A0l(), 0, 6);
                    c06214v.A0f(0);
                    int headerPosition = c06214v.A0M();
                    if (headerPosition != 2935) {
                        startPosition = 0;
                        interfaceC2165ms.AIl();
                        i11++;
                        int headerPosition2 = i11 - i10;
                        if (headerPosition2 >= 8192) {
                            return false;
                        }
                        interfaceC2165ms.A47(i11);
                    } else {
                        startPosition++;
                        if (startPosition >= 4) {
                            return true;
                        }
                        int headerPosition3 = AbstractC0909Gr.A05(c06214v.A0l());
                        if (headerPosition3 == -1) {
                            return false;
                        }
                        interfaceC2165ms.A47(headerPosition3 - 6);
                    }
                }
            } else {
                c06214v.A0g(3);
                int length = c06214v.A0H();
                i10 += length + 10;
                String[] strArr = A03;
                if (strArr[2].charAt(6) == strArr[0].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[2] = "eBRvK0YAHsHMNfInXbOwvDfd4dSG53RM";
                strArr2[0] = "womotRNroMOUij9xAXX8qTzQtzDZBBtc";
                interfaceC2165ms.A47(length);
            }
        }
    }
}
