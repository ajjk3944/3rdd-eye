package r7;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.google.android.gms.internal.ads.wa;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Matrix f32892a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public static final wa f32893b = new wa(9);

    /* renamed from: c, reason: collision with root package name */
    public static final wa f32894c = new wa(10);

    /* renamed from: d, reason: collision with root package name */
    public static final wa f32895d = new wa(11);

    /* renamed from: e, reason: collision with root package name */
    public static final wa f32896e = new wa(12);

    /* renamed from: f, reason: collision with root package name */
    public static final float f32897f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f10, float f11, float f12) {
        PathMeasure pathMeasure = (PathMeasure) f32893b.get();
        Path path2 = (Path) f32894c.get();
        Path path3 = (Path) f32895d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f10 == 1.0f && f11 == 0.0f) && length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float fMin = Math.min(f13, f14) + f15;
            float fMax = Math.max(f13, f14) + f15;
            if (fMin >= length && fMax >= length) {
                fMin = h.d(fMin, length);
                fMax = h.d(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = h.d(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = h.d(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int i4, int i10) {
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i10, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
