package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class p61 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14904a = 0;

    static {
        new o61();
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(Segment.SIZE, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i4 = 0;
        while (i4 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i4);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < iMin2) {
                int i11 = inputStream.read(bArr, i10, iMin2 - i10);
                if (i11 == -1) {
                    return b(arrayDeque, i4);
                }
                i10 += i11;
                i4 += i11;
            }
            iMin = al0.s(iMin * (iMin < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] b(ArrayDeque arrayDeque, int i4) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        int length = bArr.length;
        if (length == i4) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i4);
        int i10 = i4 - length;
        while (i10 > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(i10, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i4 - i10, iMin);
            i10 -= iMin;
        }
        return bArrCopyOf;
    }
}
