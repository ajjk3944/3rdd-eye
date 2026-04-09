package dd;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f22179i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f22180k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f22181l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f22182a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f22183b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f22184c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22185d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22186e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22187f;
    public final Path g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f22188h;

    public a() {
        Paint paint = new Paint();
        this.f22188h = paint;
        Paint paint2 = new Paint();
        this.f22182a = paint2;
        this.f22185d = v3.a.d(-16777216, 68);
        this.f22186e = v3.a.d(-16777216, 20);
        this.f22187f = v3.a.d(-16777216, 0);
        paint2.setColor(this.f22185d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f22183b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f22184c = new Paint(paint3);
    }
}
