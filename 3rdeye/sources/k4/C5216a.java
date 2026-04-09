package k4;

import C0.d;
import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: ShadowRenderer.java */
/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5216a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f43377j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f43378k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f43379l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f43380a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f43381b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f43382c;

    /* renamed from: d, reason: collision with root package name */
    public int f43383d;

    /* renamed from: e, reason: collision with root package name */
    public int f43384e;

    /* renamed from: f, reason: collision with root package name */
    public int f43385f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f43386g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f43387h;

    public C5216a() {
        Paint paint = new Paint();
        this.f43387h = paint;
        this.f43380a = new Paint();
        this.f43383d = d.e(-16777216, 68);
        this.f43384e = d.e(-16777216, 20);
        this.f43385f = d.e(-16777216, 0);
        this.f43380a.setColor(this.f43383d);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f43381b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f43382c = new Paint(paint2);
    }
}
