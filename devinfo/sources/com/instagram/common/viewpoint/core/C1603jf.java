package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.jf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1603jf implements InterfaceC1092b8 {
    public static String[] A03 = {"JSPFN54Hhto2krin5AXlvtsoUga8f3VN", "TJUa2zQB5Sn7m4BW7AASunbvdXy8BM9T", "6VrbDJWlH8cGoKCi2T6pLfOeL4USL1Zo", "WDYRHsse8CkpPKHQRRahwXj8yQt26EEK", "k2HMJqY12uG3JOOYcYA0rukTMokxTs2q", "JFWFpGWs655aVrqtTe7kn6NDgYp0Sw9v", "lGCVru2Pt3eCAyGNCmn4MueAiTs1TFsk", "y56t9BBTSrVMdPLNMlUp"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1602je A01;
    public final /* synthetic */ UK A02;

    public C1603jf(AbstractC1602je abstractC1602je, int i4, UK uk2) {
        this.A01 = abstractC1602je;
        this.A00 = i4;
        this.A02 = uk2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1092b8
    public final void AE7(C1091b7 c1091b7) {
        if (this.A00 == 0) {
            this.A02.A1k(this.A01.A04);
        }
        this.A02.A1o(c1091b7.A00() != null, true);
        if (A03[0].charAt(15) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "iRqOIqAZ6TOb0gQaJ743l8NrEMVcYXI5";
        strArr[4] = "jzrwvLgYYMFr4hfD5uj52ory38hy0fYg";
    }
}
