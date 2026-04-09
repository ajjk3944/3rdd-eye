package com.instagram.common.viewpoint.core;

import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.Utf8;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.kh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1665kh implements InterfaceC0654Ll {
    public static String A07;
    public static byte[] A08;
    public static String[] A09 = {"76RHNajjOom", "Mjpn3pRzDJalybdRDXibpwNEIm", "yniKdbkjQS3x88FVx9CeVftqblxxQhpu", "Bjsdcl6Zd1aHs", "xxeVE5WeJXBB6h2Smwfm1cLqVC", "jWBIYbGBA8wTLtSAwtOQxldoJ8", "SNbZ6FPeFicMqudBak9DrYkQXr", "PSBHzZzFGATU6u0TdgIgliGoBbccT2bp"};
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;
    public volatile String A06;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{43, 98, 120, 43, 98, 101, 127, 110, 121, 121, 126, 123, 127, 110, 111, 33, 117, 110, 33, 102, 49, 47, 50, 46, 102, 41, 32, 32, 53, 35, 50, 102, 108, 96, 35, 47, 46, 52, 37, 46, 52, 109, 44, 37, 46, 39, 52, 40, 122, 96, 5, 20, 14, 77, 65, 64, 64, 75, 77, 90, 71, 65, 64, 14, 71, 93, 14, 79, 76, 93, 75, 64, 90, 15, 20, 56, 57, 35, 50, 57, 35, 119, 62, 57, 49, 56, 119, 49, 56, 37, 119, 55, 24, 47, 47, 50, 47, 125, 57, 52, 46, 62, 50, 51, 51, 56, 62, 41, 52, 51, 58, 125, 21, 41, 41, 45, 8, 47, 49, 30, 50, 51, 51, 56, 62, 41, 52, 50, 51, 21, 34, 34, Utf8.REPLACEMENT_BYTE, 34, 112, 54, 53, 36, 51, 56, 57, 62, 55, 112, 57, 62, 54, Utf8.REPLACEMENT_BYTE, 112, 54, 34, Utf8.REPLACEMENT_BYTE, 61, 112, 27, 44, 44, 49, 44, 126, 49, 46, 59, 48, 55, 48, 57, 126, 61, 49, 48, 48, 59, 61, 42, 55, 49, 48, 126, 56, 49, 44, 126, 35, 20, 20, 9, 20, 70, 20, 3, 7, 2, 15, 8, 1, 70, 2, 7, 18, 7, 70, 0, 20, 9, 11, 70, 92, 96, 96, 100, 65, 102, 120, 71, 123, 97, 102, 119, 113, 111, 97, 102, 120, 41, 51, 101, 70, 74, 72, 93, 64, 70, 71, 0, Utf8.REPLACEMENT_BYTE, 42, 33, 111, 44, 32, 33, 33, 42, 44, 59, 38, 32, 33, 111, 85, 102, 105, 96, 98, 109, 90, 94, 91, 31, 92, 80, 81, 75, 90, 81, 75, 31, 86, 81, 89, 80, 31, 89, 77, 80, 82, 31, 106, 93, 89, 92, 81, 86, 95, 24, 75, 87, 77, 74, 91, 93, 24, 33, 26, 26, 85, 24, 20, 27, 12, 85, 7, 16, 17, 28, 7, 16, 22, 1, 6, 79, 85, 92, 6, 28, 81, 85, 81, 89, 6, 28, 30, 5, 8, 25, 15, 65, 99};
    }

    static {
        A04();
        A07 = C1665kh.class.getSimpleName();
    }

    public C1665kh(String str) {
        this(str, C0652Lj.A01(str));
    }

    public C1665kh(String str, int i4) {
        this(str);
        this.A00 = i4;
    }

    public C1665kh(String str, String str2) {
        this.A05 = LinearLayoutManager.INVALID_OFFSET;
        this.A00 = -1;
        this.A03 = (String) AbstractC0653Lk.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i4, int i10) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i10 == 200 ? contentLength : i10 == 206 ? contentLength + i4 : this.A05;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection A02(int r9, int r10) throws com.instagram.common.viewpoint.core.C1671kn, java.io.IOException {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1665kh.A02(int, int):java.net.HttpURLConnection");
    }

    private void A03() throws C1671kn, IOException {
        String str = A01(255, 23, 59) + this.A03;
        HttpURLConnection httpURLConnectionA02 = null;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnectionA02 = A02(0, 10000);
                this.A05 = httpURLConnectionA02.getContentLength();
                this.A06 = httpURLConnectionA02.getContentType();
                inputStream = httpURLConnectionA02.getInputStream();
                Log.i(A07, A01(74, 18, 83) + this.A03 + A01(313, 9, 56) + this.A06 + A01(32, 18, 68) + this.A05);
                C0652Lj.A05(inputStream);
            } catch (IOException e2) {
                Log.e(A07, A01(129, 25, 84) + this.A03, e2);
                C0652Lj.A05(inputStream);
                if (httpURLConnectionA02 != null) {
                }
            }
            if (httpURLConnectionA02 != null) {
                httpURLConnectionA02.disconnect();
            }
        } catch (Throwable th2) {
            C0652Lj.A05(inputStream);
            if (httpURLConnectionA02 != null) {
                httpURLConnectionA02.disconnect();
            }
            throw th2;
        }
    }

    private final void A05(int i4, int i10) throws C1671kn {
        try {
            this.A02 = A02(i4, i10);
            this.A06 = this.A02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), Segment.SIZE);
            this.A05 = A00(this.A02, i4, this.A02.getResponseCode());
        } catch (IOException e2) {
            throw new C1671kn(A01(154, 29, 90) + this.A03 + A01(19, 13, 66) + i4, e2);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0654Ll
    public final void AGj(int i4) throws C1671kn {
        A05(i4, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0654Ll
    public final void close() throws C1671kn {
        if (this.A02 != null) {
            try {
                this.A02.disconnect();
            } catch (NullPointerException e2) {
                throw new C1671kn(A01(92, 37, 89), e2);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0654Ll
    public final synchronized int length() throws C1671kn {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0654Ll
    public final int read(byte[] bArr) throws C1671kn {
        InputStream inputStream = this.A01;
        String strA01 = A01(183, 24, 98);
        if (inputStream != null) {
            try {
                return this.A01.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e2) {
                final String str = A01(278, 15, 60) + this.A03 + A01(0, 15, 15);
                throw new C1671kn(str, e2) { // from class: com.facebook.ads.redexgen.X.8K
                };
            } catch (IOException e10) {
                throw new C1671kn(strA01 + this.A03, e10);
            }
        }
        throw new C1671kn(strA01 + this.A03 + A01(51, 23, 42));
    }

    public final String toString() {
        return A01(207, 19, 16) + this.A03 + A01(328, 1, 26);
    }
}
