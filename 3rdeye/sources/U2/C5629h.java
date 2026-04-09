package u2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import i2.C4444d;
import i2.EnumC4441a;
import java.io.Closeable;

/* compiled from: Utils.java */
/* renamed from: u2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5629h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f46557a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f46558b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final c f46559c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final d f46560d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final float f46561e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* compiled from: Utils.java */
    /* renamed from: u2.h$a */
    public class a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: u2.h$b */
    public class b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: u2.h$c */
    public class c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* renamed from: u2.h$d */
    public class d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f10, float f11, float f12) {
        EnumC4441a enumC4441a = C4444d.f38338a;
        PathMeasure pathMeasure = f46557a.get();
        Path path2 = f46558b.get();
        Path path3 = f46559c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f10 == 1.0f && f11 == 0.0f) && length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float fMin = Math.min(f13, f14) + f15;
            float fMax = Math.max(f13, f14) + f15;
            if (fMin >= length && fMax >= length) {
                fMin = C5628g.c(fMin, length);
                fMax = C5628g.c(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = C5628g.c(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = C5628g.c(fMax, length);
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

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = f46560d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f46561e;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Bitmap e(Bitmap bitmap, int i, int i10) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i10, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void f(Canvas canvas, RectF rectF, Paint paint) {
        EnumC4441a enumC4441a = C4444d.f38338a;
        canvas.saveLayer(rectF, paint);
    }
}
