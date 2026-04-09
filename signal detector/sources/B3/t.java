package B3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final e f657a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f658b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f659c;

    /* renamed from: d, reason: collision with root package name */
    public final PathMeasure f660d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f661e;

    public t(e eVar) {
        Path path = new Path();
        this.f658b = path;
        this.f659c = new Path();
        this.f660d = new PathMeasure(path, false);
        this.f657a = eVar;
        this.f661e = new Matrix();
    }

    public static float h(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void a(Canvas canvas, Rect rect, float f2, boolean z6, boolean z7);

    public abstract void b(int i, int i3, Canvas canvas, Paint paint);

    public abstract void c(Canvas canvas, Paint paint, r rVar, int i);

    public abstract void d(Canvas canvas, Paint paint, float f2, float f5, int i, int i3, int i6);

    public abstract int e();

    public abstract int f();

    public abstract void g();
}
