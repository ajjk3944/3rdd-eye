package com.liuzh.deviceinfo.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class StarAnimView extends View {
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f21360a;

    /* renamed from: b, reason: collision with root package name */
    public int f21361b;

    /* renamed from: c, reason: collision with root package name */
    public int f21362c;

    /* renamed from: d, reason: collision with root package name */
    public int f21363d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f21364e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21365f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public int f21366h;

    /* renamed from: i, reason: collision with root package name */
    public int f21367i;

    public StarAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f21360a = paint;
        paint.setColor(getResources().getColor(R.color.colorPrimary));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f21365f = d.p(6.0f, getResources().getDisplayMetrics());
        this.g = d.p(4.0f, getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i4 = this.f21367i + this.f21361b;
        int i10 = this.f21365f;
        int i11 = i4 + i10;
        for (int i12 = 0; i12 < 8; i12++) {
            canvas.save();
            canvas.rotate(45.0f * i12, this.f21366h, this.f21367i);
            float f10 = this.g;
            Paint paint = this.f21360a;
            paint.setStrokeWidth(f10);
            paint.setAlpha(this.f21363d);
            canvas.drawPoint(this.f21366h, i4, paint);
            canvas.rotate(-9.0f, this.f21366h, this.f21367i);
            paint.setStrokeWidth(i10);
            paint.setAlpha(this.f21362c);
            canvas.drawPoint(this.f21366h, i11, paint);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        this.f21366h = i4 / 2;
        this.f21367i = i10 / 2;
    }
}
