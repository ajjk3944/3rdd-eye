package u1;

import g0.C4356c;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: Encoding.java */
/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5620c {
    public static byte[] a(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i10 = 0;
        while (i10 < i) {
            int i11 = inputStream.read(bArr, i10, i - i10);
            if (i11 < 0) {
                throw new IllegalStateException(C4356c.h(i, "Not enough bytes to read: "));
            }
            i10 += i11;
        }
        return bArr;
    }

    public static byte[] c(FileInputStream fileInputStream, int i, int i10) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i) {
                int i12 = fileInputStream.read(bArr2);
                if (i12 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i12);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i10 - iInflate);
                    i11 += i12;
                } catch (DataFormatException e4) {
                    throw new IllegalStateException(e4.getMessage());
                }
            }
            if (i11 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i11);
        } finally {
            inflater.end();
        }
    }

    public static long d(InputStream inputStream, int i) throws IOException {
        byte[] bArrB = b(inputStream, i);
        long j4 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            j4 += (bArrB[i10] & 255) << (i10 * 8);
        }
        return j4;
    }

    public static void e(ByteArrayOutputStream byteArrayOutputStream, long j4, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i10 = 0; i10 < i; i10++) {
            bArr[i10] = (byte) ((j4 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void f(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        e(byteArrayOutputStream, i, 2);
    }
}
