package com.instagram.common.viewpoint.core;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class HB {
    public static String[] A00 = {"", "JBqvX3ouZOOCqox6TCkHsUUnq79xKaTL", "x", "BIUpfUNI3eVa3mY8ect95XlwPu2Ofuw", "eTPSYv4hujFcnfJKGeeHsnhQxUvQ5rkD", "uOymuGwhHDkcqDuJ17", "MFseKYUy643KM5DvrPXxmzbMJL0nMbh3", "ti0zz4"};

    public static int A00(InterfaceC1787ms interfaceC1787ms, byte[] bArr, int i4, int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int totalBytesPeeked = i10 - i11;
            int iAGs = interfaceC1787ms.AGs(bArr, i4 + i11, totalBytesPeeked);
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[4];
            int iCharAt = str.charAt(19);
            int totalBytesPeeked2 = str2.charAt(19);
            if (iCharAt != totalBytesPeeked2) {
                throw new RuntimeException();
            }
            A00[6] = "xnIrdLQGczxEK23FHKuSo6llrjoojLCP";
            if (iAGs == -1) {
                break;
            }
            i11 += iAGs;
        }
        return i11;
    }

    @Pure
    public static void A01(boolean z3, String str) throws C3K {
        if (z3) {
        } else {
            throw C3K.A01(str, null);
        }
    }

    public static boolean A02(InterfaceC1787ms interfaceC1787ms, int i4) throws IOException {
        try {
            interfaceC1787ms.AK3(i4);
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[3] = "SfDhdqvr0QmEID8ZIpBFjoMfbavps9";
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean A03(InterfaceC1787ms interfaceC1787ms, byte[] bArr, int i4, int i10) throws IOException {
        try {
            interfaceC1787ms.readFully(bArr, i4, i10);
            return true;
        } catch (EOFException unused) {
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[6] = "fFP2kzBTuIshDEJva9vOOxjFjEDNGXev";
            return false;
        }
    }

    public static boolean A04(InterfaceC1787ms interfaceC1787ms, byte[] bArr, int i4, int i10, boolean z3) throws IOException {
        try {
            return interfaceC1787ms.AGu(bArr, i4, i10, z3);
        } catch (EOFException e2) {
            if (!z3) {
                throw e2;
            }
            if (A00[3].length() == 20) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "24rmiB";
            strArr[5] = "kHyj46IkHv9Sbvkaop";
            return false;
        }
    }
}
