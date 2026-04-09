package com.facebook.ads.redexgen.core;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2673Kn {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2671Kl A02(InterfaceC3738lN interfaceC3738lN) throws IOException {
        byte[] bArr;
        C4J c4j = new C4J(16);
        C2672Km c2672KmA03 = A03(1718449184, interfaceC3738lN, c4j);
        C3M.A08(c2672KmA03.A01 >= 16);
        interfaceC3738lN.AG9(c4j.A0l(), 0, 16);
        c4j.A0f(0);
        int iA0G = c4j.A0G();
        int iA0G2 = c4j.A0G();
        int iA0F = c4j.A0F();
        int iA0F2 = c4j.A0F();
        int iA0G3 = c4j.A0G();
        int iA0G4 = c4j.A0G();
        int i = ((int) c2672KmA03.A01) - 16;
        if (i > 0) {
            bArr = new byte[i];
            interfaceC3738lN.AG9(bArr, 0, i);
        } else {
            bArr = AbstractC22614a.A07;
        }
        interfaceC3738lN.AJJ((int) (interfaceC3738lN.A8a() - interfaceC3738lN.A8f()));
        return new C2671Kl(iA0G, iA0G2, iA0F, iA0F2, iA0G3, iA0G4, bArr);
    }

    public static String A04(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, 16, 13, 22, 19, 88, 17, 11, 88, 12, 23, 23, 88, 20, 25, 10, 31, 29, 88, 80, 6, 74, 63, 58, 83, 81, 88, 12, 23, 88, 11, 19, 17, 8, 67, 88, 17, 28, 66, 88, 45, 3, 10, 11, 22, 13, 10, 3, 68, 17, 10, 15, 10, 11, 19, 10, 68, 51, 37, 50, 68, 7, 12, 17, 10, 15, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, 28, 90, 83, 78, 81, 28, 72, 69, 76, 89, 6, 28, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC3738lN interfaceC3738lN) throws IOException {
        C4J c4j = new C4J(8);
        C2672Km chunkHeader = C2672Km.A00(interfaceC3738lN, c4j);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC3738lN.AI1();
            return -1L;
        }
        interfaceC3738lN.A3z(8);
        c4j.A0f(0);
        interfaceC3738lN.AG9(c4j.A0l(), 0, 8);
        long sampleDataSize = c4j.A0N();
        interfaceC3738lN.AJJ(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC3738lN interfaceC3738lN) throws IOException {
        interfaceC3738lN.AI1();
        C2672Km c2672KmA03 = A03(1684108385, interfaceC3738lN, new C4J(8));
        interfaceC3738lN.AJJ(8);
        return Pair.create(Long.valueOf(interfaceC3738lN.A8f()), Long.valueOf(c2672KmA03.A01));
    }

    public static C2672Km A03(int i, InterfaceC3738lN interfaceC3738lN, C4J c4j) throws IOException {
        C2672Km c2672KmA00 = C2672Km.A00(interfaceC3738lN, c4j);
        while (c2672KmA00.A00 != i) {
            AnonymousClass44.A07(A04(91, 15, 125), A04(40, 28, 39) + c2672KmA00.A00);
            long j4 = c2672KmA00.A01 + 8;
            if (j4 <= 2147483647L) {
                interfaceC3738lN.AJJ((int) j4);
                c2672KmA00 = C2672Km.A00(interfaceC3738lN, c4j);
            } else {
                throw C22172i.A00(A04(0, 40, 59) + c2672KmA00.A00);
            }
        }
        return c2672KmA00;
    }

    public static boolean A06(InterfaceC3738lN interfaceC3738lN) throws IOException {
        C4J c4j = new C4J(8);
        C2672Km c2672KmA00 = C2672Km.A00(interfaceC3738lN, c4j);
        if (c2672KmA00.A00 != 1380533830) {
            int i = c2672KmA00.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i != 1380333108) {
                return false;
            }
        }
        interfaceC3738lN.AG9(c4j.A0l(), 0, 4);
        c4j.A0f(0);
        int iA0C = c4j.A0C();
        if (iA0C != 1463899717) {
            AnonymousClass44.A05(A04(91, 15, 125), A04(68, 23, 127) + iA0C);
            return false;
        }
        return true;
    }
}
