package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3298dl implements LA {
    public static byte[] A01;
    public static String[] A02 = {"DkadTd3hzRbbbOHMxE7l2HcIgF77c2Wg", "0ZuZJmAU8cZIcQf3szyGmXM5AilOTJtQ", "s7OtZpyonCiYFMYFU1WCjmQvHXym6FPj", "3vySfQzjuhiXchKud6RTPthf0ulaYdWV", "CDvhYqwZm7dYJUP65EPDHmFcAmisUun7", "F", "FueLju8lXT0mR7zmJE5", "4fFvsSsvSh6WJapTHyxRGbQ9SIVR6447"};
    public final /* synthetic */ C3246cu A00;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
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

    public C3298dl(C3246cu c3246cu) {
        this.A00 = c3246cu;
    }

    @Override // com.facebook.ads.redexgen.core.LA
    public final void AAq(Throwable th) {
        this.A00.A08().AAy(A00(0, 5, 39), AbstractC2885Sv.A1e, new C2886Sw(th));
    }

    @Override // com.facebook.ads.redexgen.core.LA
    public final void AB4(Throwable th) {
        this.A00.A08().AAy(A00(0, 5, 39), AbstractC2885Sv.A1g, new C2886Sw(th));
    }

    @Override // com.facebook.ads.redexgen.core.LA
    public final void AGk(String str, int i, String str2, Long l5, Long l10, C2681Kv c2681Kv) {
        SI.A05(this.A00, c2681Kv.A06, c2681Kv.A08, c2681Kv.A09, c2681Kv.A07, c2681Kv.A03, i, str2, l5, l10, null);
    }

    @Override // com.facebook.ads.redexgen.core.LA
    public final void AGl(String str, boolean z10, C2681Kv c2681Kv) {
        SI.A04(this.A00, new SH(c2681Kv.A06, c2681Kv.A08, c2681Kv.A07, c2681Kv.A03, str), z10);
    }
}
