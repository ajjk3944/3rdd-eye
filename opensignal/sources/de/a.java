package de;

import android.graphics.Paint;
import android.graphics.Path;
import k3.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f7326i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f7327l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f7328a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f7329b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f7330c;

    /* renamed from: d, reason: collision with root package name */
    public int f7331d;

    /* renamed from: e, reason: collision with root package name */
    public int f7332e;

    /* renamed from: f, reason: collision with root package name */
    public int f7333f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f7334g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f7335h;

    public a() {
        Paint paint = new Paint();
        this.f7335h = paint;
        this.f7328a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f7329b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f7330c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.f7331d = c.d(i10, 68);
        this.f7332e = c.d(i10, 20);
        this.f7333f = c.d(i10, 0);
        this.f7328a.setColor(this.f7331d);
    }
}
