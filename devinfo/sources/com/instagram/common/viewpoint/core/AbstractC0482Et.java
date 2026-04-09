package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0482Et {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1951pY A01(C0477Eo c0477Eo, List<? extends InterfaceC0479Eq>[] listArr) {
        C2K c2k = new C2K();
        int i4 = 0;
        loop0: while (true) {
            boolean z3 = false;
            if (i4 >= c0477Eo.A02()) {
                C1826nW c1826nWA06 = c0477Eo.A06();
                for (int i10 = 0; i10 < c1826nWA06.A01; i10++) {
                    C1959pg c1959pgA05 = c1826nWA06.A05(i10);
                    int[] iArr = new int[c1959pgA05.A01];
                    Arrays.fill(iArr, 0);
                    c2k.A04(new C1952pZ(c1959pgA05, false, iArr, new boolean[c1959pgA05.A01]));
                }
                return new C1951pY(c2k.A05());
            }
            C1826nW c1826nWA07 = c0477Eo.A07(i4);
            List<? extends InterfaceC0479Eq> list = listArr[i4];
            int i11 = 0;
            while (i11 < c1826nWA07.A01) {
                C1959pg c1959pgA052 = c1826nWA07.A05(i11);
                int iA05 = c0477Eo.A05(i4, i11, z3);
                String[] strArr = A00;
                if (strArr[7].charAt(11) != strArr[0].charAt(11)) {
                    break loop0;
                }
                String[] strArr2 = A00;
                strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                boolean z10 = iA05 != 0;
                int[] iArr2 = new int[c1959pgA052.A01];
                boolean[] zArr = new boolean[c1959pgA052.A01];
                for (int i12 = 0; i12 < c1959pgA052.A01; i12++) {
                    iArr2[i12] = c0477Eo.A04(i4, i11, i12);
                    boolean z11 = false;
                    if (A00[5].length() != 9) {
                        break loop0;
                    }
                    String[] strArr3 = A00;
                    strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                    strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                    int i13 = 0;
                    while (true) {
                        if (i13 < list.size()) {
                            InterfaceC0479Eq interfaceC0479Eq = list.get(i13);
                            if (interfaceC0479Eq.A9L().equals(c1959pgA052) && interfaceC0479Eq.AA6(i12) != -1) {
                                z11 = true;
                                break;
                            }
                            i13++;
                        }
                    }
                    zArr[i12] = z11;
                }
                c2k.A04(new C1952pZ(c1959pgA052, z10, iArr2, zArr));
                i11++;
                z3 = false;
            }
            i4++;
        }
        throw new RuntimeException();
    }

    public static C1951pY A00(C0477Eo c0477Eo, InterfaceC0479Eq[] interfaceC0479EqArr) {
        List listA01;
        List[] listArr = new List[interfaceC0479EqArr.length];
        for (int i4 = 0; i4 < interfaceC0479EqArr.length; i4++) {
            InterfaceC0479Eq interfaceC0479Eq = interfaceC0479EqArr[i4];
            if (interfaceC0479Eq != null) {
                listA01 = BP.A04(interfaceC0479Eq);
            } else {
                listA01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i4] = listA01;
        }
        return A01(c0477Eo, listArr);
    }
}
