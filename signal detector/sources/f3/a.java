package F3;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f1442j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f1443k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f1444l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1445a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1446b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f1447c;

    /* renamed from: d, reason: collision with root package name */
    public int f1448d;

    /* renamed from: e, reason: collision with root package name */
    public int f1449e;

    /* renamed from: f, reason: collision with root package name */
    public int f1450f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f1451g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f1452h;

    public a() {
        Paint paint = new Paint();
        this.f1452h = paint;
        this.f1445a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f1446b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f1447c = new Paint(paint2);
    }

    public final void a(int i3) {
        this.f1448d = J.a.e(i3, 68);
        this.f1449e = J.a.e(i3, 20);
        this.f1450f = J.a.e(i3, 0);
        this.f1445a.setColor(this.f1448d);
    }
}
