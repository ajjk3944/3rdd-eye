package androidx.camera.core;

import A2.l;
import C.S;
import C.c0;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.b;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ImageProcessingUtil {

    /* renamed from: a, reason: collision with root package name */
    public static int f14835a;

    public enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static c a(e eVar, byte[] bArr) {
        l.l(eVar.d() == 256);
        bArr.getClass();
        Surface surfaceA = eVar.a();
        surfaceA.getClass();
        if (nativeWriteJpegToSurface(bArr, surfaceA) != 0) {
            S.b("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        c cVarB = eVar.b();
        if (cVarB == null) {
            S.b("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return cVarB;
    }

    public static Bitmap b(c cVar) {
        if (cVar.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = cVar.getWidth();
        int height = cVar.getHeight();
        int iR = cVar.y()[0].r();
        int iR2 = cVar.y()[1].r();
        int iR3 = cVar.y()[2].r();
        int iS = cVar.y()[0].s();
        int iS2 = cVar.y()[1].s();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(cVar.getWidth(), cVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(cVar.y()[0].q(), iR, cVar.y()[1].q(), iR2, cVar.y()[2].q(), iR3, iS, iS2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static c0 c(final c cVar, e eVar, ByteBuffer byteBuffer, int i) {
        if (cVar.getFormat() != 35 || cVar.y().length != 3) {
            S.b("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            S.b("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if ((nativeConvertAndroid420ToABGR(cVar.y()[0].q(), cVar.y()[0].r(), cVar.y()[1].q(), cVar.y()[1].r(), cVar.y()[2].q(), cVar.y()[2].r(), cVar.y()[0].s(), cVar.y()[1].s(), eVar.a(), byteBuffer, cVar.getWidth(), cVar.getHeight(), 0, 0, 0, i) != 0 ? a.ERROR_CONVERSION : a.SUCCESS) == a.ERROR_CONVERSION) {
            S.b("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            S.a("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - jCurrentTimeMillis) + "], image count: " + f14835a);
            f14835a = f14835a + 1;
        }
        final c cVarB = eVar.b();
        if (cVarB == null) {
            S.b("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        c0 c0Var = new c0(cVarB);
        c0Var.a(new b.a() { // from class: C.M
            @Override // androidx.camera.core.b.a
            public final void c(androidx.camera.core.b bVar) throws Exception {
                int i10 = ImageProcessingUtil.f14835a;
                cVar.close();
            }
        });
        return c0Var;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void f(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            S.b("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, int i13, Surface surface, ByteBuffer byteBuffer4, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, int i13, Bitmap bitmap, int i14, int i15, int i16);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i10, int i11, int i12, boolean z10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
