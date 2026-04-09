package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.lE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3729lE implements GP {
    public static String[] A03 = {"Qzrb2NyX11iip4M0Dun9HjrVhDBjGiaF", "S4lxERGEQHczdoRlIRLlXReEKfWFWSGc", "txU8e6wljbe290bqTydjfEMDFUDvEmx5", "ZB68ibpDVF3DEFIIdRwQIG37zRUG2jhG", "NKfzuQ6LKFKezVni40AKhLW9Qs", "gUOm4cnsv29C5J2bDVOWEpGrIAhYUn7e", "xRx4EoAOCCZ90h8tA3pJ1YmFxzetviZR", "6LlO7okteSZZNTbDPWq3J1SHLhykMwkf"};
    public final int A00;
    public final C2559Gc A01;
    public final C2564Gh A02;

    @Override // com.facebook.ads.redexgen.core.GP
    public final /* synthetic */ void AFA() {
    }

    public C3729lE(C2564Gh c2564Gh, int i) {
        this.A02 = c2564Gh;
        this.A00 = i;
        this.A01 = new C2559Gc();
    }

    private long A00(InterfaceC3738lN interfaceC3738lN) throws IOException {
        while (interfaceC3738lN.A8a() < interfaceC3738lN.A8G() - 6 && !AbstractC2560Gd.A09(interfaceC3738lN, this.A02, this.A00, this.A01)) {
            String[] strArr = A03;
            if (strArr[1].charAt(7) == strArr[7].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "MdA2mB0qiCN7NKRKcBY3aVGEnEzRIKP4";
            strArr2[3] = "Kp5wPJFyOGMB7tBJUi3Fl7WX9iQtExSk";
            interfaceC3738lN.A3z(1);
        }
        if (interfaceC3738lN.A8a() >= interfaceC3738lN.A8G() - 6) {
            interfaceC3738lN.A3z((int) (interfaceC3738lN.A8G() - interfaceC3738lN.A8a()));
            return this.A02.A09;
        }
        return this.A01.A00;
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final GN AIC(InterfaceC3738lN interfaceC3738lN, long j4) throws IOException {
        long rightFrameFirstSampleNumber = interfaceC3738lN.A8f();
        long leftFrameFirstSampleNumber = A00(interfaceC3738lN);
        long jA8a = interfaceC3738lN.A8a();
        interfaceC3738lN.A3z(Math.max(6, this.A02.A06));
        long searchPosition = A00(interfaceC3738lN);
        long leftFramePosition = interfaceC3738lN.A8a();
        if (leftFrameFirstSampleNumber <= j4 && searchPosition > j4) {
            return GN.A03(jA8a);
        }
        if (searchPosition <= j4) {
            return GN.A05(searchPosition, leftFramePosition);
        }
        return GN.A04(leftFrameFirstSampleNumber, rightFrameFirstSampleNumber);
    }
}
