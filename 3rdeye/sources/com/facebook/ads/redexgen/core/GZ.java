package com.facebook.ads.redexgen.core;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: assets/audience_network.dex */
public abstract class GZ {
    public static String[] A00 = {"", "JBqvX3ouZOOCqox6TCkHsUUnq79xKaTL", "x", "BIUpfUNI3eVa3mY8ect95XlwPu2Ofuw", "eTPSYv4hujFcnfJKGeeHsnhQxUvQ5rkD", "uOymuGwhHDkcqDuJ17", "MFseKYUy643KM5DvrPXxmzbMJL0nMbh3", "ti0zz4"};

    public static int A00(InterfaceC3738lN interfaceC3738lN, byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int totalBytesPeeked = i10 - i11;
            int iAG8 = interfaceC3738lN.AG8(bArr, i + i11, totalBytesPeeked);
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[4];
            int iCharAt = str.charAt(19);
            int totalBytesPeeked2 = str2.charAt(19);
            if (iCharAt != totalBytesPeeked2) {
                throw new RuntimeException();
            }
            A00[6] = "xnIrdLQGczxEK23FHKuSo6llrjoojLCP";
            if (iAG8 == -1) {
                break;
            }
            i11 += iAG8;
        }
        return i11;
    }

    @Pure
    public static void A01(boolean z10, String str) throws C22172i {
        if (z10) {
        } else {
            throw C22172i.A01(str, null);
        }
    }

    public static boolean A02(InterfaceC3738lN interfaceC3738lN, int i) throws IOException {
        try {
            interfaceC3738lN.AJJ(i);
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[3] = "SfDhdqvr0QmEID8ZIpBFjoMfbavps9";
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean A03(InterfaceC3738lN interfaceC3738lN, byte[] bArr, int i, int i10) throws IOException {
        try {
            interfaceC3738lN.readFully(bArr, i, i10);
            return true;
        } catch (EOFException unused) {
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[6] = "fFP2kzBTuIshDEJva9vOOxjFjEDNGXev";
            return false;
        }
    }

    public static boolean A04(InterfaceC3738lN interfaceC3738lN, byte[] bArr, int i, int i10, boolean z10) throws IOException {
        try {
            return interfaceC3738lN.AGA(bArr, i, i10, z10);
        } catch (EOFException e4) {
            if (!z10) {
                throw e4;
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
