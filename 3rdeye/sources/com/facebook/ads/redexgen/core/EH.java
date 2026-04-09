package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class EH {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3904o6 A01(EC ec, List<? extends EE>[] listArr) {
        C21921h c21921h = new C21921h();
        int i = 0;
        loop0: while (true) {
            boolean z10 = false;
            if (i >= ec.A02()) {
                C3786mA c3786mAA06 = ec.A06();
                for (int i10 = 0; i10 < c3786mAA06.A01; i10++) {
                    C3915oH c3915oHA05 = c3786mAA06.A05(i10);
                    int[] iArr = new int[c3915oHA05.A01];
                    Arrays.fill(iArr, 0);
                    c21921h.A04(new C3905o7(c3915oHA05, false, iArr, new boolean[c3915oHA05.A01]));
                }
                return new C3904o6(c21921h.A05());
            }
            C3786mA c3786mAA07 = ec.A07(i);
            List<? extends EE> list = listArr[i];
            int i11 = 0;
            while (i11 < c3786mAA07.A01) {
                C3915oH c3915oHA052 = c3786mAA07.A05(i11);
                int iA05 = ec.A05(i, i11, z10);
                String[] strArr = A00;
                if (strArr[7].charAt(11) != strArr[0].charAt(11)) {
                    break loop0;
                }
                String[] strArr2 = A00;
                strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                boolean z11 = iA05 != 0;
                int[] iArr2 = new int[c3915oHA052.A01];
                boolean[] zArr = new boolean[c3915oHA052.A01];
                for (int i12 = 0; i12 < c3915oHA052.A01; i12++) {
                    iArr2[i12] = ec.A04(i, i11, i12);
                    boolean z12 = false;
                    if (A00[5].length() != 9) {
                        break loop0;
                    }
                    String[] strArr3 = A00;
                    strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                    strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                    int i13 = 0;
                    while (true) {
                        if (i13 < list.size()) {
                            EE ee = list.get(i13);
                            if (ee.A9D().equals(c3915oHA052) && ee.A9y(i12) != -1) {
                                z12 = true;
                                break;
                            }
                            i13++;
                        }
                    }
                    zArr[i12] = z12;
                }
                c21921h.A04(new C3905o7(c3915oHA052, z11, iArr2, zArr));
                i11++;
                z10 = false;
            }
            i++;
        }
        throw new RuntimeException();
    }

    public static C3904o6 A00(EC ec, EE[] eeArr) {
        List listA01;
        List[] listArr = new List[eeArr.length];
        for (int i = 0; i < eeArr.length; i++) {
            EE ee = eeArr[i];
            if (ee != null) {
                listA01 = AbstractC2416Am.A04(ee);
            } else {
                listA01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i] = listA01;
        }
        return A01(ec, listArr);
    }
}
