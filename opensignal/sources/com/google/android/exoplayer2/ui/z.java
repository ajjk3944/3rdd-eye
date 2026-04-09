package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class z {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a, reason: collision with root package name */
    public final float f4708a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4709b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4710c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4711d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4712e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f4713f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f4714g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f4715h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f4716i;
    public Layout.Alignment j;
    public Bitmap k;

    /* renamed from: l, reason: collision with root package name */
    public float f4717l;

    /* renamed from: m, reason: collision with root package name */
    public int f4718m;

    /* renamed from: n, reason: collision with root package name */
    public int f4719n;

    /* renamed from: o, reason: collision with root package name */
    public float f4720o;

    /* renamed from: p, reason: collision with root package name */
    public int f4721p;

    /* renamed from: q, reason: collision with root package name */
    public float f4722q;

    /* renamed from: r, reason: collision with root package name */
    public float f4723r;

    /* renamed from: s, reason: collision with root package name */
    public int f4724s;

    /* renamed from: t, reason: collision with root package name */
    public int f4725t;

    /* renamed from: u, reason: collision with root package name */
    public int f4726u;

    /* renamed from: v, reason: collision with root package name */
    public int f4727v;

    /* renamed from: w, reason: collision with root package name */
    public int f4728w;

    /* renamed from: x, reason: collision with root package name */
    public float f4729x;

    /* renamed from: y, reason: collision with root package name */
    public float f4730y;

    /* renamed from: z, reason: collision with root package name */
    public float f4731z;

    public z(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f4712e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f4711d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f4708a = fRound;
        this.f4709b = fRound;
        this.f4710c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f4713f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f4714g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f4715h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        Canvas canvas2;
        if (!z10) {
            this.J.getClass();
            this.k.getClass();
            canvas.drawBitmap(this.k, (Rect) null, this.J, this.f4715h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f4726u) > 0) {
            int i10 = this.f4726u;
            Paint paint = this.f4714g;
            paint.setColor(i10);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f4728w;
        TextPaint textPaint = this.f4713f;
        if (i11 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f4708a);
            textPaint.setColor(this.f4727v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f10 = this.f4709b;
            if (i11 == 2) {
                float f11 = this.f4710c;
                textPaint.setShadowLayer(f10, f11, f11, this.f4727v);
            } else if (i11 == 3 || i11 == 4) {
                boolean z11 = i11 == 3;
                int i12 = z11 ? -1 : this.f4727v;
                int i13 = z11 ? this.f4727v : -1;
                float f12 = f10 / 2.0f;
                textPaint.setColor(this.f4724s);
                textPaint.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                textPaint.setShadowLayer(f10, f13, f13, i12);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f10, f12, f12, i13);
            }
        }
        textPaint.setColor(this.f4724s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
