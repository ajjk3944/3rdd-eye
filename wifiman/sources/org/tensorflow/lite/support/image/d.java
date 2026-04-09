package org.tensorflow.lite.support.image;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
abstract class d {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57154a;

        static {
            int[] iArr = new int[org.tensorflow.lite.a.values().length];
            f57154a = iArr;
            try {
                iArr[org.tensorflow.lite.a.UINT8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57154a[org.tensorflow.lite.a.FLOAT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static void a(Bitmap bitmap, Jj.a aVar) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i11 = i10 * 3;
        int[] iArr2 = {height, width, 3};
        int i12 = a.f57154a[aVar.h().ordinal()];
        int i13 = 0;
        if (i12 == 1) {
            byte[] bArr = new byte[i11];
            int i14 = 0;
            while (i13 < i10) {
                int i15 = iArr[i13];
                bArr[i14] = (byte) ((i15 >> 16) & 255);
                int i16 = i14 + 2;
                bArr[i14 + 1] = (byte) ((i15 >> 8) & 255);
                i14 += 3;
                bArr[i16] = (byte) (i15 & 255);
                i13++;
            }
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i11);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            byteBufferAllocateDirect.put(bArr);
            aVar.q(byteBufferAllocateDirect, iArr2);
            return;
        }
        if (i12 != 2) {
            throw new IllegalStateException("The type of TensorBuffer, " + aVar.g() + ", is unsupported.");
        }
        float[] fArr = new float[i11];
        int i17 = 0;
        while (i13 < i10) {
            int i18 = iArr[i13];
            fArr[i17] = (i18 >> 16) & 255;
            int i19 = i17 + 2;
            fArr[i17 + 1] = (i18 >> 8) & 255;
            i17 += 3;
            fArr[i19] = i18 & 255;
            i13++;
        }
        aVar.o(fArr, iArr2);
    }

    static Bitmap b(Jj.a aVar) {
        org.tensorflow.lite.a aVarH = aVar.h();
        org.tensorflow.lite.a aVar2 = org.tensorflow.lite.a.UINT8;
        if (aVarH != aVar2) {
            aVar = Jj.a.f(aVar, aVar2);
        }
        int[] iArrK = aVar.k();
        b bVar = b.GRAYSCALE;
        bVar.assertShape(iArrK);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.getWidth(iArrK), bVar.getHeight(iArrK), bVar.toBitmapConfig());
        aVar.g().rewind();
        bitmapCreateBitmap.copyPixelsFromBuffer(aVar.g());
        return bitmapCreateBitmap;
    }

    static Bitmap c(Jj.a aVar) {
        int[] iArrK = aVar.k();
        b bVar = b.RGB;
        bVar.assertShape(iArrK);
        int height = bVar.getHeight(iArrK);
        int width = bVar.getWidth(iArrK);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bVar.toBitmapConfig());
        int i10 = width * height;
        int[] iArr = new int[i10];
        int[] iArrJ = aVar.j();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArrJ[i11];
            int i14 = i11 + 2;
            int i15 = iArrJ[i11 + 1];
            i11 += 3;
            iArr[i12] = Color.rgb(i13, i15, iArrJ[i14]);
        }
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }
}
