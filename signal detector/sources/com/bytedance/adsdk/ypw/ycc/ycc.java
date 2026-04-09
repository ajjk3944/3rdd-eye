package com.bytedance.adsdk.ypw.ycc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.bytedance.adsdk.ypw.emc.emc.ylm;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public final class ycc {
    private static final ThreadLocal<PathMeasure> emc = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.ypw.ycc.ycc.1
        @Override // java.lang.ThreadLocal
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> ypw = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.ypw.ycc.ycc.2
        @Override // java.lang.ThreadLocal
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> xq = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.ypw.ycc.ycc.3
        @Override // java.lang.ThreadLocal
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> dg = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.ypw.ycc.ycc.4
        @Override // java.lang.ThreadLocal
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float bw = (float) (Math.sqrt(2.0d) / 2.0d);

    public static int emc(float f2, float f5, float f6, float f7) {
        int i = f2 != 0.0f ? (int) (f2 * 527.0f) : 17;
        if (f5 != 0.0f) {
            i = (int) (i * 31 * f5);
        }
        if (f6 != 0.0f) {
            i = (int) (i * 31 * f6);
        }
        return f7 != 0.0f ? (int) (i * 31 * f7) : i;
    }

    public static boolean ypw(Matrix matrix) {
        float[] fArr = dg.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static boolean emc(int i, int i3, int i6, int i7, int i8, int i9) {
        if (i < i7) {
            return false;
        }
        if (i > i7) {
            return true;
        }
        if (i3 < i8) {
            return false;
        }
        return i3 > i8 || i6 >= i9;
    }

    public static Path emc(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f2 = pointF.x + pointF3.x;
            float f5 = pointF.y + pointF3.y;
            float f6 = pointF2.x;
            float f7 = f6 + pointF4.x;
            float f8 = pointF2.y;
            path.cubicTo(f2, f5, f7, f8 + pointF4.y, f6, f8);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static void emc(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    public static float emc(Matrix matrix) {
        float[] fArr = dg.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = bw;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void emc(Path path, ylm ylmVar) {
        if (ylmVar == null || ylmVar.ycc()) {
            return;
        }
        emc(path, ((com.bytedance.adsdk.ypw.emc.ypw.dg) ylmVar.xq()).zz() / 100.0f, ((com.bytedance.adsdk.ypw.emc.ypw.dg) ylmVar.dg()).zz() / 100.0f, ((com.bytedance.adsdk.ypw.emc.ypw.dg) ylmVar.bw()).zz() / 360.0f);
    }

    public static void emc(Path path, float f2, float f5, float f6) {
        com.bytedance.adsdk.ypw.bw.emc("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = emc.get();
        Path path2 = ypw.get();
        Path path3 = xq.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 == 1.0f && f5 == 0.0f) {
            com.bytedance.adsdk.ypw.bw.ypw("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f && Math.abs((f5 - f2) - 1.0f) >= 0.01d) {
            float f7 = f2 * length;
            float f8 = f5 * length;
            float f9 = f6 * length;
            float fMin = Math.min(f7, f8) + f9;
            float fMax = Math.max(f7, f8) + f9;
            if (fMin >= length && fMax >= length) {
                fMin = bw.emc(fMin, length);
                fMax = bw.emc(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = bw.emc(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = bw.emc(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                com.bytedance.adsdk.ypw.bw.ypw("applyTrimPathIfNeeded");
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
            com.bytedance.adsdk.ypw.bw.ypw("applyTrimPathIfNeeded");
            return;
        }
        com.bytedance.adsdk.ypw.bw.ypw("applyTrimPathIfNeeded");
    }

    public static float emc() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float emc(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap emc(Bitmap bitmap, int i, int i3) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i3, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean emc(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void emc(Canvas canvas, RectF rectF, Paint paint) {
        emc(canvas, rectF, paint, 31);
    }

    public static void emc(Canvas canvas, RectF rectF, Paint paint, int i) {
        com.bytedance.adsdk.ypw.bw.emc("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.ypw.bw.ypw("Utils#saveLayer");
    }
}
