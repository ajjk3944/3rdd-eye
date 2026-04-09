package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0864Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C2329pY A01;
    public final Object A02;
    public final C06967s[] A03;
    public final InterfaceC2186nE[] A04;

    public C0864Ex(C06967s[] c06967sArr, InterfaceC2186nE[] interfaceC2186nEArr, C2329pY c2329pY, Object obj) {
        this.A03 = c06967sArr;
        this.A04 = (InterfaceC2186nE[]) interfaceC2186nEArr.clone();
        this.A01 = c2329pY;
        this.A02 = obj;
        this.A00 = c06967sArr.length;
    }

    public final boolean A00(int i10) {
        return this.A03[i10] != null;
    }

    public final boolean A01(C0864Ex c0864Ex, int i10) {
        if (c0864Ex == null) {
            return false;
        }
        C06967s[] c06967sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c06967sArr[i10], c0864Ex.A03[i10])) {
                return false;
            }
            InterfaceC2186nE interfaceC2186nE = this.A04[i10];
            InterfaceC2186nE interfaceC2186nE2 = c0864Ex.A04[i10];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC2186nE, interfaceC2186nE2);
            }
        }
        throw new RuntimeException();
    }
}
