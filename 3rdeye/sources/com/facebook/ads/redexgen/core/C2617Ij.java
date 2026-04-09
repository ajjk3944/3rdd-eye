package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ij, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2617Ij {
    public static byte[] A03;
    public static String[] A04 = {"1LFyGIpszZgsQUUW5R18ay4ATJEAL43c", "dt6orGbglcsjMqs", "9FFDgagoC1", "foXErnBO9GEWWKnhx2CBLj59I1mQsasl", "8wc6iy8fDBcca8zNmQv", "", "jjxV28nHyp6my1wOvIi", "qfRjwVGa5Ot2KmC8yJE9Z4CCjcQdKZvd"};
    public static final C3621jH A05;
    public static final C3621jH A06;
    public int A01;
    public final List<C2614Ig> A02 = new ArrayList();
    public int A00 = 0;

    public static String A02(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            byte b10 = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 58);
            if (A04[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A04[1] = "QzkInJPgctLD5w2";
            bArrCopyOfRange[i12] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{45, 10, 18, 5, 8, 13, 0, 68, 55, 33, 34, 68, 10, 5, 9, 1, 56, 7, 4, 28, 38, 4, 31, 2, 4, 5, 52, 47, 10, 31, 10, 93, 123, 126, 107, 124, 81, 93, 98, 97, 121, 67, 97, 122, 103, 97, 96, 81, 76, 73, 67, 94, 120, 125, 104, 127, 82, 94, 97, 98, 122, 64, 98, 121, 100, 98, 99, 82, 73, 108, 121, 108, 50, 20, 17, 4, 19, 62, 50, 13, 14, 22, 44, 14, 21, 8, 14, 15, 62, 37, 4, 7, 13, 8, 2, 10, 4, 19, 8, 15, 6, 62, 46, 15, 65, 103, 98, 119, 96, 77, 65, 126, 125, 101, 95, 125, 102, 123, 125, 124, 77, 87, 118, 123, 102, 77, 86, 115, 102, 115};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(InterfaceC3738lN interfaceC3738lN, List<Metadata.Entry> list) throws IOException {
        long jA8f = interfaceC3738lN.A8f();
        int iA8G = (int) ((interfaceC3738lN.A8G() - interfaceC3738lN.A8f()) - this.A01);
        C4J c4j = new C4J(iA8G);
        interfaceC3738lN.readFully(c4j.A0l(), 0, iA8G);
        for (int i = 0; i < this.A02.size(); i++) {
            C2614Ig c2614Ig = this.A02.get(i);
            c4j.A0f((int) (c2614Ig.A02 - jA8f));
            c4j.A0g(4);
            int iA0E = c4j.A0E();
            String[] strArr = A04;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A04[7] = "1HViS9NC9rn2qgqFvoB7LQiD1FLq6ChH";
            int iA00 = A00(c4j.A0W(iA0E));
            int i10 = c2614Ig.A01 - (iA0E + 8);
            switch (iA00) {
                case 2192:
                    list.add(A01(c4j, i10));
                    break;
                case 2816:
                case 2817:
                case 2819:
                case 2820:
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    static {
        A03();
        A06 = C3621jH.A02(':');
        A05 = C3621jH.A02('*');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(java.lang.String r3) throws com.facebook.ads.redexgen.core.C22172i {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case -1711564334: goto L62;
                case -1332107749: goto L50;
                case -1251387154: goto L3e;
                case -830665521: goto L2c;
                case 1760745220: goto L1a;
                default: goto L7;
            }
        L7:
            r0 = -1
        L8:
            switch(r0) {
                case 0: goto L80;
                case 1: goto L7d;
                case 2: goto L7a;
                case 3: goto L77;
                case 4: goto L74;
                default: goto Lb;
            }
        Lb:
            r2 = 0
            r1 = 16
            r0 = 94
            java.lang.String r1 = A02(r2, r1, r0)
            r0 = 0
            com.facebook.ads.redexgen.X.2i r0 = com.facebook.ads.redexgen.core.C22172i.A01(r1, r0)
            throw r0
        L1a:
            r2 = 31
            r1 = 20
            r0 = 52
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2
            goto L8
        L2c:
            r2 = 72
            r1 = 32
            r0 = 91
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 4
            goto L8
        L3e:
            r2 = 51
            r1 = 21
            r0 = 55
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L50:
            r2 = 104(0x68, float:1.46E-43)
            r1 = 26
            r0 = 40
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 3
            goto L8
        L62:
            r2 = 16
            r1 = 15
            r0 = 81
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 0
            goto L8
        L74:
            r0 = 2820(0xb04, float:3.952E-42)
            return r0
        L77:
            r0 = 2819(0xb03, float:3.95E-42)
            return r0
        L7a:
            r0 = 2817(0xb01, float:3.947E-42)
            return r0
        L7d:
            r0 = 2816(0xb00, float:3.946E-42)
            return r0
        L80:
            r0 = 2192(0x890, float:3.072E-42)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2617Ij.A00(java.lang.String):int");
    }

    public static SlowMotionData A01(C4J c4j, int i) throws C22172i, NumberFormatException {
        List<SlowMotionData.Segment> segments = new ArrayList<>();
        String dataString = c4j.A0W(i);
        List<String> listA06 = A05.A06(dataString);
        for (int i10 = 0; i10 < listA06.size(); i10++) {
            List<String> listA062 = A06.A06(listA06.get(i10));
            if (listA062.size() == 3) {
                try {
                    long j4 = Long.parseLong(listA062.get(0));
                    long startTimeMs = Long.parseLong(listA062.get(1));
                    segments.add(new SlowMotionData.Segment(j4, startTimeMs, 1 << (Integer.parseInt(listA062.get(2)) - 1)));
                } catch (NumberFormatException e4) {
                    throw C22172i.A01(null, e4);
                }
            } else {
                throw C22172i.A01(null, null);
            }
        }
        return new SlowMotionData(segments);
    }

    private void A04(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt) throws IOException {
        C4J c4j = new C4J(8);
        interfaceC3738lN.readFully(c4j.A0l(), 0, 8);
        this.A01 = c4j.A0E() + 8;
        if (c4j.A0C() != 1397048916) {
            c2576Gt.A00 = 0L;
        } else {
            c2576Gt.A00 = interfaceC3738lN.A8f() - (this.A01 - 12);
            this.A00 = 2;
        }
    }

    private void A05(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt) throws IOException {
        long jA8G = interfaceC3738lN.A8G();
        int i = (this.A01 - 12) - 8;
        C4J c4j = new C4J(i);
        interfaceC3738lN.readFully(c4j.A0l(), 0, i);
        for (int i10 = 0; i10 < i / 12; i10++) {
            c4j.A0g(2);
            int i11 = c4j.A0a();
            switch (i11) {
                case 2192:
                case 2816:
                case 2817:
                case 2819:
                case 2820:
                    long streamLength = this.A01;
                    long j4 = jA8G - streamLength;
                    long streamLength2 = c4j.A0E();
                    int size = c4j.A0E();
                    this.A02.add(new C2614Ig(i11, j4 - streamLength2, size));
                    break;
                default:
                    c4j.A0g(8);
                    break;
            }
        }
        if (this.A02.isEmpty()) {
            c2576Gt.A00 = 0L;
            return;
        }
        this.A00 = 3;
        long streamLength3 = this.A02.get(0).A02;
        c2576Gt.A00 = streamLength3;
    }

    public final int A07(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt, List<Metadata.Entry> slowMotionMetadataEntries) throws IOException {
        long j4 = 0;
        switch (this.A00) {
            case 0:
                long jA8G = interfaceC3738lN.A8G();
                if (jA8G != -1 && jA8G >= 8) {
                    j4 = jA8G - 8;
                }
                c2576Gt.A00 = j4;
                this.A00 = 1;
                return 1;
            case 1:
                A04(interfaceC3738lN, c2576Gt);
                return 1;
            case 2:
                A05(interfaceC3738lN, c2576Gt);
                return 1;
            case 3:
                A06(interfaceC3738lN, slowMotionMetadataEntries);
                c2576Gt.A00 = 0L;
                return 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final void A08() {
        this.A02.clear();
        this.A00 = 0;
    }
}
