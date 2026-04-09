package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.gm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1440gm implements InterfaceC0655Lm {
    public static byte[] A01;
    public static String[] A02 = {"DkadTd3hzRbbbOHMxE7l2HcIgF77c2Wg", "0ZuZJmAU8cZIcQf3szyGmXM5AilOTJtQ", "s7OtZpyonCiYFMYFU1WCjmQvHXym6FPj", "3vySfQzjuhiXchKud6RTPthf0ulaYdWV", "CDvhYqwZm7dYJUP65EPDHmFcAmisUun7", "F", "FueLju8lXT0mR7zmJE5", "4fFvsSsvSh6WJapTHyxRGbQ9SIVR6447"};
    public final /* synthetic */ C1432ge A00;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-89, -85, -97, -91, -93};
        String[] strArr = A02;
        if (strArr[4].charAt(11) == strArr[0].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "8YVOAkqjlCZIfPO923uAjm7vB9HJVDjx";
        strArr2[0] = "zjuPMStvlm1D7VGZIKzQB2odE0473uv0";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1440gm(C1432ge c1432ge) {
        this.A00 = c1432ge;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0655Lm
    public final void AB4(Throwable th2) {
        this.A00.A08().ABC(A00(0, 5, 39), AbstractC0848Td.A1e, new C0849Te(th2));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0655Lm
    public final void ABI(Throwable th2) {
        this.A00.A08().ABC(A00(0, 5, 39), AbstractC0848Td.A1g, new C0849Te(th2));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0655Lm
    public final void AHU(String str, int i4, String str2, Long l10, Long l11, LX lx) {
        T0.A05(this.A00, lx.A06, lx.A08, lx.A09, lx.A07, lx.A03, i4, str2, l10, l11, null);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0655Lm
    public final void AHV(String str, boolean z3, LX lx) {
        T0.A04(this.A00, new C0844Sz(lx.A06, lx.A08, lx.A07, lx.A03, str), z3);
    }
}
