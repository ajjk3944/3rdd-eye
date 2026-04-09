package M;

import G.h;
import G.i;
import G.j;
import G.k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.c;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: ImageUtil.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: ImageUtil.java */
    public static final class a extends Exception {

        /* compiled from: ImageUtil.java */
        /* renamed from: M.b$a$a, reason: collision with other inner class name */
        public enum EnumC0072a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }
    }

    public static Bitmap a(androidx.camera.core.c cVar) {
        int format = cVar.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(cVar.getWidth(), cVar.getHeight(), Bitmap.Config.ARGB_8888);
            cVar.y()[0].q().rewind();
            ImageProcessingUtil.e(bitmapCreateBitmap, cVar.y()[0].q(), cVar.y()[0].r());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.b(cVar);
        }
        if (format != 256 && format != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + cVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!b(cVar.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + cVar.getFormat());
        }
        ByteBuffer byteBufferQ = cVar.y()[0].q();
        int iCapacity = byteBufferQ.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferQ.rewind();
        byteBufferQ.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static boolean b(int i) {
        return i == 256 || i == 4101;
    }

    public static byte[] c(androidx.camera.core.c cVar, Rect rect, int i, int i10) throws NumberFormatException, a {
        int i11 = 2;
        if (cVar.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + cVar.getFormat());
        }
        c.a aVar = cVar.y()[0];
        c.a aVar2 = cVar.y()[1];
        c.a aVar3 = cVar.y()[2];
        ByteBuffer byteBufferQ = aVar.q();
        ByteBuffer byteBufferQ2 = aVar2.q();
        ByteBuffer byteBufferQ3 = aVar3.q();
        byteBufferQ.rewind();
        byteBufferQ2.rewind();
        byteBufferQ3.rewind();
        int iRemaining = byteBufferQ.remaining();
        byte[] bArr = new byte[((cVar.getHeight() * cVar.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i12 = 0; i12 < cVar.getHeight(); i12++) {
            byteBufferQ.get(bArr, width, cVar.getWidth());
            width += cVar.getWidth();
            byteBufferQ.position(Math.min(iRemaining, aVar.r() + (byteBufferQ.position() - cVar.getWidth())));
        }
        int height = cVar.getHeight() / 2;
        int width2 = cVar.getWidth() / 2;
        int iR = aVar3.r();
        int iR2 = aVar2.r();
        int iS = aVar3.s();
        int iS2 = aVar2.s();
        byte[] bArr2 = new byte[iR];
        byte[] bArr3 = new byte[iR2];
        int i13 = 0;
        while (i13 < height) {
            int i14 = i11;
            byteBufferQ3.get(bArr2, 0, Math.min(iR, byteBufferQ3.remaining()));
            byteBufferQ2.get(bArr3, 0, Math.min(iR2, byteBufferQ2.remaining()));
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < width2; i17++) {
                int i18 = width + 1;
                bArr[width] = bArr2[i15];
                width += 2;
                bArr[i18] = bArr3[i16];
                i15 += iS;
                i16 += iS2;
            }
            i13++;
            i11 = i14;
        }
        int i19 = i11;
        YuvImage yuvImage = new YuvImage(bArr, 17, cVar.getWidth(), cVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k[] kVarArr = h.f1814c;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        h.b bVar = new h.b();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = bVar.f1824a;
        bVar.c("Orientation", strValueOf, arrayList);
        bVar.c("XResolution", "72/1", arrayList);
        bVar.c("YResolution", "72/1", arrayList);
        bVar.c("ResolutionUnit", String.valueOf(i19), arrayList);
        bVar.c("YCbCrPositioning", String.valueOf(1), arrayList);
        bVar.c("Make", Build.MANUFACTURER, arrayList);
        bVar.c("Model", Build.MODEL, arrayList);
        if (cVar.i0() != null) {
            cVar.i0().b(bVar);
        }
        bVar.e(i10);
        bVar.c("ImageWidth", String.valueOf(cVar.getWidth()), arrayList);
        bVar.c("ImageLength", String.valueOf(cVar.getHeight()), arrayList);
        ArrayList list = Collections.list(new i(bVar));
        if (!((Map) list.get(1)).isEmpty()) {
            bVar.b("ExposureProgram", String.valueOf(0), list);
            bVar.b("ExifVersion", "0230", list);
            bVar.b("ComponentsConfiguration", "1,2,3,0", list);
            bVar.b("MeteringMode", String.valueOf(0), list);
            bVar.b("LightSource", String.valueOf(0), list);
            bVar.b("FlashpixVersion", "0100", list);
            bVar.b("FocalPlaneResolutionUnit", String.valueOf(i19), list);
            bVar.b("FileSource", String.valueOf(3), list);
            bVar.b("SceneType", String.valueOf(1), list);
            bVar.b("CustomRendered", String.valueOf(0), list);
            bVar.b("SceneCaptureType", String.valueOf(0), list);
            bVar.b("Contrast", String.valueOf(0), list);
            bVar.b("Saturation", String.valueOf(0), list);
            bVar.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i19)).isEmpty()) {
            bVar.b("GPSVersionID", "2300", list);
            bVar.b("GPSSpeedRef", "K", list);
            bVar.b("GPSTrackRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            bVar.b("GPSImgDirectionRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            bVar.b("GPSDestBearingRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
            bVar.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, cVar.getWidth(), cVar.getHeight()) : rect, i, new j(byteArrayOutputStream, new h(bVar.f1825b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        a.EnumC0072a enumC0072a = a.EnumC0072a.ENCODE_FAILED;
        throw new a("YuvImage failed to encode jpeg.");
    }
}
