package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0486Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C1951pY A01;
    public final Object A02;
    public final C03187s[] A03;
    public final InterfaceC1808nE[] A04;

    public C0486Ex(C03187s[] c03187sArr, InterfaceC1808nE[] interfaceC1808nEArr, C1951pY c1951pY, Object obj) {
        this.A03 = c03187sArr;
        this.A04 = (InterfaceC1808nE[]) interfaceC1808nEArr.clone();
        this.A01 = c1951pY;
        this.A02 = obj;
        this.A00 = c03187sArr.length;
    }

    public final boolean A00(int i4) {
        return this.A03[i4] != null;
    }

    public final boolean A01(C0486Ex c0486Ex, int i4) {
        if (c0486Ex == null) {
            return false;
        }
        C03187s[] c03187sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c03187sArr[i4], c0486Ex.A03[i4])) {
                return false;
            }
            InterfaceC1808nE interfaceC1808nE = this.A04[i4];
            InterfaceC1808nE interfaceC1808nE2 = c0486Ex.A04[i4];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC1808nE, interfaceC1808nE2);
            }
        }
        throw new RuntimeException();
    }
}
