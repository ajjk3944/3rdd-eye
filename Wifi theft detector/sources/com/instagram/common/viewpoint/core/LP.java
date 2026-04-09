package com.instagram.common.viewpoint.core;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import org.xbill.DNS.Flags;
import org.xbill.DNS.TTL;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class LP {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static LN A02(InterfaceC2165ms interfaceC2165ms) throws IOException {
        byte[] bArr;
        C06214v c06214v = new C06214v(16);
        LO loA03 = A03(1718449184, interfaceC2165ms, c06214v);
        AbstractC05983y.A08(loA03.A01 >= 16);
        interfaceC2165ms.AGt(c06214v.A0l(), 0, 16);
        c06214v.A0f(0);
        int iA0G = c06214v.A0G();
        int iA0G2 = c06214v.A0G();
        int iA0F = c06214v.A0F();
        int iA0F2 = c06214v.A0F();
        int iA0G3 = c06214v.A0G();
        int iA0G4 = c06214v.A0G();
        int i10 = ((int) loA03.A01) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            interfaceC2165ms.AGt(bArr, 0, i10);
        } else {
            bArr = C5C.A07;
        }
        interfaceC2165ms.AK3((int) (interfaceC2165ms.A8i() - interfaceC2165ms.A8n()));
        return new LN(iA0G, iA0G2, iA0F, iA0F2, iA0G3, iA0G4, bArr);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, 16, 13, 22, 19, 88, 17, Flags.CD, 88, 12, 23, 23, 88, 20, 25, 10, 31, 29, 88, 80, 6, 74, 63, 58, 83, 81, 88, 12, 23, 88, Flags.CD, 19, 17, 8, 67, 88, 17, 28, 66, 88, 45, 3, 10, Flags.CD, 22, 13, 10, 3, 68, 17, 10, 15, 10, Flags.CD, 19, 10, 68, 51, 37, 50, 68, 7, 12, 17, 10, 15, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, 28, 90, 83, 78, 81, 28, 72, 69, 76, 89, 6, 28, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC2165ms interfaceC2165ms) throws IOException {
        C06214v c06214v = new C06214v(8);
        LO chunkHeader = LO.A00(interfaceC2165ms, c06214v);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC2165ms.AIl();
            return -1L;
        }
        interfaceC2165ms.A47(8);
        c06214v.A0f(0);
        interfaceC2165ms.AGt(c06214v.A0l(), 0, 8);
        long sampleDataSize = c06214v.A0N();
        interfaceC2165ms.AK3(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC2165ms interfaceC2165ms) throws IOException {
        interfaceC2165ms.AIl();
        LO loA03 = A03(1684108385, interfaceC2165ms, new C06214v(8));
        interfaceC2165ms.AK3(8);
        return Pair.create(Long.valueOf(interfaceC2165ms.A8n()), Long.valueOf(loA03.A01));
    }

    public static LO A03(int i10, InterfaceC2165ms interfaceC2165ms, C06214v c06214v) throws IOException {
        LO loA00 = LO.A00(interfaceC2165ms, c06214v);
        while (loA00.A00 != i10) {
            AbstractC06064g.A07(A04(91, 15, 125), A04(40, 28, 39) + loA00.A00);
            long j10 = loA00.A01 + 8;
            if (j10 <= TTL.MAX_VALUE) {
                interfaceC2165ms.AK3((int) j10);
                loA00 = LO.A00(interfaceC2165ms, c06214v);
            } else {
                throw C3K.A00(A04(0, 40, 59) + loA00.A00);
            }
        }
        return loA00;
    }

    public static boolean A06(InterfaceC2165ms interfaceC2165ms) throws IOException {
        C06214v c06214v = new C06214v(8);
        LO loA00 = LO.A00(interfaceC2165ms, c06214v);
        if (loA00.A00 != 1380533830) {
            int i10 = loA00.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i10 != 1380333108) {
                return false;
            }
        }
        interfaceC2165ms.AGt(c06214v.A0l(), 0, 4);
        c06214v.A0f(0);
        int iA0C = c06214v.A0C();
        if (iA0C != 1463899717) {
            AbstractC06064g.A05(A04(91, 15, 125), A04(68, 23, 127) + iA0C);
            return false;
        }
        return true;
    }
}
