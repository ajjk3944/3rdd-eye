package com.facebook.ads.redexgen.core;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Tx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2912Tx {
    public static int A03;
    public static byte[] A04;
    public static String[] A05 = {"60vC7Tqxq", "iit", "yZ8WhL2SKbyHWFuqrbqyqX6q9YBqbSbq", "zou4kHpYoYqOWULjtQgwmQsgY48o5sQE", "Jj1CAbkpCkmlTw2dBaB6fKsG", "LIdASrcH6z6LtpFKNKqsX", "9qyYxkloNYGFw4rMCbrwSMHZV85hWfZp", "eAI5s54jDPvvLg6GHfi1"};
    public C2911Tw A00;
    public boolean A01;
    public final File A02;

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-29, -2, 6, 9, 2, 1, -67, 17, 12, -67, 1, 2, 9, 2, 17, 2, -67, 3, 6, 9, 2, -67, -60, -62, 16, -119, -84, -81, -88, 99, 106, 104, -74, 106, 99, -84, -74, 99, -79, -78, -73, 99, -92, 99, -75, -88, -92, -89, -92, -91, -81, -88, 99, -87, -84, -81, -88, -97, -60, -52, -73, -62, -65, -70, 118, -68, -69, -54, -71, -66, 118, -55, -54, -73, -56, -54, 118, -65, -60, -70, -69, -50, -112, 118, 123, -70, -75, -56, -58, -46, -43, -57, -125, -55, -52, -49, -56, -125, -60, -49, -43, -56, -60, -57, -36, -125, -57, -52, -42, -45, -46, -42, -56, -57};
        String[] strArr = A05;
        if (strArr[2].charAt(17) != strArr[6].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "hp8";
        strArr2[4] = "JPe8szfYYKMd1bH3O09b0bU9";
        A04 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A05() throws IOException {
        return A00().A00;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized C2903To A06(int i, byte[] bArr, int i10, int[] iArr, int i11) throws IOException {
        C2911Tw c2911TwA00 = A00();
        int i12 = 1;
        if (i < 0) {
            throw new IOException(String.format(Locale.US, A01(57, 29, 21), Integer.valueOf(i)));
        }
        int i13 = i;
        int i14 = 0;
        long j4 = -1;
        boolean z10 = false;
        while (true) {
            if (i13 >= c2911TwA00.A00) {
                break;
            }
            if ((i13 - i) + i11 >= iArr.length) {
                z10 = true;
                break;
            }
            long j10 = c2911TwA00.A03[i13];
            long j11 = (i13 == c2911TwA00.A00 - i12 ? c2911TwA00.A01 : c2911TwA00.A03[i13 + 1]) - j10;
            if (j4 == -1) {
                j4 = j10;
            }
            if (((int) j11) + i14 + i10 > bArr.length) {
                z10 = true;
                break;
            }
            i14 += (int) j11;
            iArr[(i13 - i) + i11] = (int) j11;
            i13++;
            i12 = 1;
        }
        if (i13 <= i) {
            return new C2903To(z10 ? EnumC2902Tn.A04 : EnumC2902Tn.A05, i, i, 0);
        }
        c2911TwA00.A02.seek(j4);
        c2911TwA00.A02.read(bArr, i10, i14);
        return new C2903To(EnumC2902Tn.A03, i, i13, i14);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A09(byte[] bArr) throws IOException {
        C2911Tw c2911TwA00 = A00();
        if (A05() == A03) {
            return false;
        }
        A03(c2911TwA00.A00, c2911TwA00.A01);
        A04(c2911TwA00.A01, bArr);
        c2911TwA00.A02.getFD().sync();
        c2911TwA00.A00++;
        c2911TwA00.A01 += bArr.length;
        return true;
    }

    static {
        A02();
        A03 = 1000;
    }

    public C2912Tx(File file) throws IOException {
        this.A02 = file;
        if (!file.exists()) {
            this.A00 = C2911Tw.A03(file);
        } else if (!file.isFile()) {
            throw new IOException(String.format(Locale.US, A01(25, 32, 2), file.getCanonicalPath()));
        }
    }

    private C2911Tw A00() throws IOException {
        if (!this.A01) {
            if (this.A00 == null) {
                this.A00 = C2911Tw.A04(this.A02);
            }
            return this.A00;
        }
        throw new IOException(A01(86, 28, 34));
    }

    private void A03(int i, long j4) throws IOException {
        this.A00.A03[i] = j4;
        this.A00.A02.seek(C2911Tw.A02(i));
        this.A00.A02.writeLong(j4);
    }

    private void A04(long j4, byte[] bArr) throws IOException {
        this.A00.A02.seek(j4);
        this.A00.A02.write(bArr);
    }

    public final synchronized void A07() throws IOException {
        this.A01 = true;
        if (this.A00 == null) {
            return;
        }
        RandomAccessFile randomAccessFile = this.A00.A02;
        this.A00 = null;
        randomAccessFile.close();
    }

    public final synchronized void A08() throws IOException {
        if (!this.A01) {
            A07();
            if (!this.A02.delete()) {
                throw new IOException(String.format(Locale.US, A01(0, 25, 92), this.A02.getCanonicalPath()));
            }
        } else {
            throw new IOException(A01(86, 28, 34));
        }
    }
}
