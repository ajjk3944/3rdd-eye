package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.k1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3666k1 implements GX {
    public static String[] A03 = {"omX6mlrNbYq0LGa8KWDQoDOxuY4Jaqsm", "5vCbKZ7gcP1deFubK5J3aMrnVGjcBeMu", "ozZJ4UCdXiLAsxGuZMu8vrfsyQyOy2Qr", "457YRIf4cJgVa", "48ELt3GeP9QgscGCGAyy0GBjQnf8y1ot", "nP9Rki4V9hDzJun2MpMPW2v7tMuO22BO", "splStgYzXsMDywgFYcc1GmuRRae3j1Zq", "jQwA1XKYR4HrKvDtyQbVDHffCNmVjAZf"};
    public static final InterfaceC2558Gb A04 = new InterfaceC2558Gb() { // from class: com.facebook.ads.redexgen.X.k2
        @Override // com.facebook.ads.redexgen.core.InterfaceC2558Gb
        public final GX[] A5F() {
            return C3666k1.A00();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC2558Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC2557Ga.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C3665k0 A02 = new C3665k0();
    public final C4J A01 = new C4J(2786);

    public static /* synthetic */ GX[] A00() {
        return new GX[]{new C3666k1()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A02.A5U(gy, new C2664Ke(0, 1));
        gy.A6G();
        gy.AIN(new C3733lI(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt) throws IOException {
        int i = interfaceC3738lN.read(this.A01.A0l(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(i);
        if (!this.A00) {
            this.A02.AG6(0L, 4);
            this.A00 = true;
        }
        this.A02.A52(this.A01);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j4, long j10) {
        this.A00 = false;
        this.A02.AIL();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC3738lN interfaceC3738lN) throws IOException {
        C4J c4j = new C4J(10);
        int i = 0;
        while (true) {
            interfaceC3738lN.AG9(c4j.A0l(), 0, 10);
            c4j.A0f(0);
            if (c4j.A0K() != 4801587) {
                interfaceC3738lN.AI1();
                interfaceC3738lN.A3z(i);
                int i10 = i;
                int startPosition = 0;
                while (true) {
                    interfaceC3738lN.AG9(c4j.A0l(), 0, 6);
                    c4j.A0f(0);
                    int headerPosition = c4j.A0M();
                    if (headerPosition != 2935) {
                        startPosition = 0;
                        interfaceC3738lN.AI1();
                        i10++;
                        int headerPosition2 = i10 - i;
                        if (headerPosition2 >= 8192) {
                            return false;
                        }
                        interfaceC3738lN.A3z(i10);
                    } else {
                        startPosition++;
                        if (startPosition >= 4) {
                            return true;
                        }
                        int headerPosition3 = GF.A05(c4j.A0l());
                        if (headerPosition3 == -1) {
                            return false;
                        }
                        interfaceC3738lN.A3z(headerPosition3 - 6);
                    }
                }
            } else {
                c4j.A0g(3);
                int length = c4j.A0H();
                i += length + 10;
                String[] strArr = A03;
                if (strArr[2].charAt(6) == strArr[0].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[2] = "eBRvK0YAHsHMNfInXbOwvDfd4dSG53RM";
                strArr2[0] = "womotRNroMOUij9xAXX8qTzQtzDZBBtc";
                interfaceC3738lN.A3z(length);
            }
        }
    }
}
