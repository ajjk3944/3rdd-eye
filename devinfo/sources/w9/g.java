package w9;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static DisplayMetrics f36555a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f36556b = 50;

    /* renamed from: c, reason: collision with root package name */
    public static int f36557c = 8000;

    /* renamed from: d, reason: collision with root package name */
    public static final float f36558d;

    /* renamed from: e, reason: collision with root package name */
    public static final Rect f36559e;

    /* renamed from: f, reason: collision with root package name */
    public static final Paint.FontMetrics f36560f;
    public static final Rect g;

    /* renamed from: h, reason: collision with root package name */
    public static final p9.b f36561h;

    /* renamed from: i, reason: collision with root package name */
    public static final Rect f36562i;
    public static final Paint.FontMetrics j;

    static {
        Double.longBitsToDouble(1L);
        f36558d = Float.intBitsToFloat(1);
        f36559e = new Rect();
        f36560f = new Paint.FontMetrics();
        g = new Rect();
        f36561h = new p9.b(1);
        new Rect();
        f36562i = new Rect();
        j = new Paint.FontMetrics();
    }

    public static int a(Paint paint, String str) {
        Rect rect = f36559e;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static b b(Paint paint, String str) {
        b bVar = (b) b.f36539d.b();
        bVar.f36540b = 0.0f;
        bVar.f36541c = 0.0f;
        Rect rect = g;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        bVar.f36540b = rect.width();
        bVar.f36541c = rect.height();
        return bVar;
    }

    public static float c(float f10) {
        DisplayMetrics displayMetrics = f36555a;
        if (displayMetrics != null) {
            return f10 * displayMetrics.density;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return f10;
    }

    public static float d(double d10) {
        if (Double.isInfinite(d10) || Double.isNaN(d10) || d10 == 0.0d) {
            return 0.0f;
        }
        return Math.round(d10 * r0) / ((float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d10 < 0.0d ? -d10 : d10)))));
    }
}
