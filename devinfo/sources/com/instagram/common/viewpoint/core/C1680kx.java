package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.kx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1680kx implements LU<Bitmap> {
    public static byte[] A06;
    public final int A00;
    public final int A01;
    public final String A02 = C1680kx.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    static {
        A02();
    }

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-110, -40, -47, -44, 3, 42, 53, 46, 34, 49, -31, 42, 52, -31, 47, 54, 45, 45, -55, -4, -25, -23, -12, -8, -19, -13, -14, -92, -24, -7, -10, -19, -14, -21, -92, -22, -19, -16, -23, -92, -25, -13, -15, -12, -10, -23, -9, -9, -19, -13, -14};
    }

    public C1680kx(int i4, int i10, boolean z3, boolean z10, boolean z11) {
        this.A01 = i4;
        this.A00 = i10;
        this.A05 = z3;
        this.A03 = z10;
        this.A04 = z11;
    }

    public static LT<Bitmap> A00(Throwable th2) {
        return new LT<>(false, null, th2);
    }

    private void A03(File file, Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ByteArrayOutputStream compressedBitmapOS = new ByteArrayOutputStream();
            byteArrayOutputStream = compressedBitmapOS;
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(0, 4, 25);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[Segment.SHARE_MINIMUM];
            while (true) {
                int i4 = fileInputStream.read(bArr);
                if (i4 > 0) {
                    fileOutputStream2.write(bArr, 0, i4);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            AbstractC0656Ln.A07(byteArrayOutputStream);
            AbstractC0656Ln.A07(fileOutputStream);
            AbstractC0656Ln.A07(fileInputStream);
            AbstractC0656Ln.A07(fileOutputStream2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.LU
    public final LT<Bitmap> A3x(File file, InterfaceC0655Lm interfaceC0655Lm) {
        if (!this.A04) {
            return new LT<>(true, null);
        }
        try {
            Bitmap bitmapA03 = AbstractC0656Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (bitmapA03 != null) {
                return new LT<>(true, bitmapA03);
            }
            interfaceC0655Lm.AB4(new C1671kn(A01(4, 14, 118)));
            return A00(null);
        } catch (Throwable t10) {
            file.delete();
            interfaceC0655Lm.AB4(t10);
            return A00(t10);
        }
    }

    @Override // com.instagram.common.viewpoint.core.LU
    public final void A5D(File file, InterfaceC0655Lm interfaceC0655Lm) throws Throwable {
        if (this.A03) {
            try {
                Bitmap bitmap = AbstractC0656Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmap != null) {
                    A03(file, bitmap);
                } else {
                    file.delete();
                    throw new C1671kn(A01(4, 14, 118));
                }
            } catch (C1671kn e2) {
                interfaceC0655Lm.ABI(e2);
                throw e2;
            } catch (Throwable th2) {
                interfaceC0655Lm.ABI(th2);
                Throwable t10 = new C1671kn(A01(18, 33, 57), th2);
                throw t10;
            }
        }
    }
}
