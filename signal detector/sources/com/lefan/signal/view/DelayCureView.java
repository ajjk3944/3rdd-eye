package com.lefan.signal.view;

import F4.e;
import R2.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.apm.insight.R;
import d5.AbstractC2283k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o4.AbstractC2763b;
import q5.i;

/* loaded from: classes.dex */
public final class DelayCureView extends View {

    /* renamed from: C, reason: collision with root package name */
    public final Paint f19509C;

    /* renamed from: D, reason: collision with root package name */
    public final Paint f19510D;

    /* renamed from: E, reason: collision with root package name */
    public final Paint f19511E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f19512F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f19513G;

    /* renamed from: H, reason: collision with root package name */
    public final Path f19514H;

    /* renamed from: a, reason: collision with root package name */
    public float f19515a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19516b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19517c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19518d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19519e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19520f;

    /* renamed from: g, reason: collision with root package name */
    public float f19521g;

    /* renamed from: h, reason: collision with root package name */
    public float f19522h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f19523j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f19524k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f19525l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f19526m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f19527n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelayCureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f19515a = 8.0f;
        this.f19516b = 4;
        this.f19517c = a(30);
        this.f19518d = a(32);
        this.f19519e = a(18);
        this.f19520f = a(20);
        this.f19521g = a(30);
        this.f19522h = 16.0f;
        this.i = 10;
        Paint paint = new Paint();
        this.f19523j = paint;
        Paint paint2 = new Paint();
        this.f19524k = paint2;
        Paint paint3 = new Paint();
        this.f19525l = paint3;
        Paint paint4 = new Paint();
        this.f19526m = paint4;
        Paint paint5 = new Paint();
        this.f19527n = paint5;
        Paint paint6 = new Paint();
        this.f19509C = paint6;
        Paint paint7 = new Paint();
        this.f19510D = paint7;
        Paint paint8 = new Paint();
        this.f19511E = paint8;
        ArrayList arrayList = new ArrayList();
        this.f19512F = arrayList;
        this.f19513G = new ArrayList();
        paint.setPathEffect(new DashPathEffect(new float[]{20.0f, 10.0f}, 0.0f));
        paint.setColor(Color.parseColor("#ffdb5157"));
        paint2.setAntiAlias(true);
        paint2.setColor(paint.getColor());
        paint2.setTextSize(a(8));
        Paint.Align align = Paint.Align.RIGHT;
        paint2.setTextAlign(align);
        paint3.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setStrokeWidth(2.0f);
        paint3.setColor(Color.parseColor("#336f6f7b"));
        paint4.setAntiAlias(true);
        paint4.setColor(getContext().getColor(R.color.text_color));
        paint4.setTextAlign(align);
        paint4.setTextSize(a(8));
        paint4.getTextBounds("1000ms", 0, 6, new Rect());
        this.f19517c = r0.width() * 1.0f;
        paint5.setAntiAlias(true);
        paint5.setColor(getContext().getColor(R.color.text_color));
        paint5.setTextAlign(Paint.Align.LEFT);
        paint5.setTextSize(a(10));
        paint6.setAntiAlias(true);
        paint6.setColor(getContext().getColor(R.color.text_color));
        paint6.setTextAlign(Paint.Align.CENTER);
        paint6.setTextSize(a(10));
        paint7.setAntiAlias(true);
        paint7.setColor(Color.parseColor("#ff919dff"));
        paint7.setStrokeWidth(16.0f);
        paint8.setColor(Color.parseColor("#ff919dff"));
        paint8.setAntiAlias(true);
        paint8.setStrokeWidth(4.0f);
        paint8.setStyle(style);
        arrayList.clear();
        for (int i = 1; i < 10; i++) {
            this.f19512F.add(Integer.valueOf(i));
        }
        this.f19514H = new Path();
    }

    public final float a(int i) {
        return (i * getResources().getDisplayMetrics().density) + 0.5f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        Paint paint;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight();
        float f2 = this.f19519e;
        float f5 = f2 * 2.0f;
        float f6 = this.f19522h;
        float f7 = this.f19518d;
        float f8 = (height - f5) - ((f7 / f6) * 20.0f);
        float f9 = this.f19515a * 29.0f;
        float f10 = this.f19517c;
        canvas.drawLine(f10, f8, f9 + f10, f8, this.f19523j);
        String string = getContext().getString(R.string.delay_limit_120);
        i.d(string, "getString(...)");
        int i = 0;
        if (a.f3390d) {
            Locale locale = e.f1457a;
            str = String.format(e.b(), string, Arrays.copyOf(new Object[]{20}, 1));
        } else {
            str = String.format(Locale.ENGLISH, string, Arrays.copyOf(new Object[]{20}, 1));
        }
        float f11 = this.f19515a * 29.0f;
        float f12 = this.f19517c;
        float f13 = 10.0f;
        canvas.drawText(str, f11 + f12, ((getHeight() - f5) - ((f7 / this.f19522h) * 20.0f)) - 10.0f, this.f19524k);
        Paint paint2 = this.f19525l;
        paint2.setStrokeWidth(4.0f);
        canvas.drawLine(this.f19517c, getHeight() - f5, getWidth(), getHeight() - f5, paint2);
        paint2.setStrokeWidth(2.0f);
        int i3 = 0;
        while (i3 < this.f19516b) {
            int i6 = i3 + 1;
            float f14 = (i6 * f7) + f5;
            canvas.drawLine(this.f19517c, getHeight() - f14, getWidth(), getHeight() - f14, paint2);
            i3 = i6;
        }
        int i7 = 0;
        while (i7 < 5) {
            StringBuilder sb = new StringBuilder();
            float f15 = i7;
            float height2 = (getHeight() - f5) - (f15 * f7);
            String string2 = sb.toString();
            i.d(string2, "toString(...)");
            Paint paint3 = this.f19526m;
            i.e(paint3, "paint");
            paint3.getTextBounds(string2, 0, string2.length(), new Rect());
            canvas.drawText(AbstractC2763b.d((int) (this.f19522h * f15), "ms", sb), f12 - f13, (r4.height() * 0.5f) + height2, paint3);
            i7++;
            f13 = 10.0f;
        }
        float f16 = this.f19520f;
        float f17 = f16;
        int i8 = 0;
        while (true) {
            int size = this.f19512F.size();
            paint = this.f19527n;
            if (i8 >= size) {
                break;
            }
            i8++;
            f17 += this.f19521g;
            canvas.drawText(String.valueOf(i8), f17, getHeight() - f2, paint);
        }
        canvas.drawText(getContext().getString(R.string.tools_traceroute_hop_count), getWidth() - a(20), getHeight() - f2, paint);
        ArrayList arrayList = this.f19513G;
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj = arrayList.get(i9);
            i9++;
            float f18 = (r6.x * this.f19521g) + f16 + 8.0f;
            float height3 = (getHeight() - f5) - ((f7 / this.f19522h) * r6.y);
            canvas.drawCircle(f18, height3, 8.0f, this.f19510D);
            canvas.drawText(String.valueOf(((Point) obj).y), f18, height3 - a(8), this.f19509C);
        }
        Path path = this.f19514H;
        path.reset();
        int size3 = arrayList.size();
        int i10 = 0;
        while (i10 < size3) {
            Object obj2 = arrayList.get(i10);
            i10++;
            int i11 = i + 1;
            if (i < 0) {
                AbstractC2283k.O();
                throw null;
            }
            Point point = (Point) obj2;
            if (i == 0) {
                path.moveTo((point.x * this.f19521g) + a(3) + f16, (getHeight() - f5) - ((f7 / this.f19522h) * point.y));
            } else {
                path.lineTo((point.x * this.f19521g) + a(3) + f16, (getHeight() - f5) - ((f7 / this.f19522h) * point.y));
            }
            i = i11;
        }
        canvas.drawPath(path, this.f19511E);
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        this.f19515a = (getWidth() - this.f19517c) / 30.0f;
    }

    public final void setYMaxCoordinate(int i) {
        this.i = i;
    }
}
