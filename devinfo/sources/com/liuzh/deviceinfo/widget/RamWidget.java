package com.liuzh.deviceinfo.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.liuzh.deviceinfo.utilities.d;
import com.liuzh.deviceinfo.utilities.f;
import oi.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class RamWidget extends AppWidgetProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21395a = 0;

    public static void a(Canvas canvas, Paint paint, int i4) {
        float strokeWidth = paint.getStrokeWidth();
        float height = canvas.getHeight() - strokeWidth;
        canvas.drawArc(strokeWidth, strokeWidth, height, height, 130.0f, ((i4 * 1.0f) / 100.0f) * 280.0f, false, paint);
    }

    public static void b(Context context, Bitmap bitmap, int i4, int i10, int i11, boolean z3) {
        boolean zH;
        if (z3) {
            zH = d.m();
        } else {
            f fVar = f.f21256b;
            zH = f.h();
        }
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(zH ? -5460820 : -9671572);
        paint.setTextSize(d.q(i10, context.getResources().getDisplayMetrics()));
        float fMeasureText = paint.measureText("RAM");
        int iP = d.p(i10 < 12 ? 2.0f : 3.3f, context.getResources().getDisplayMetrics());
        canvas.drawText("RAM", (bitmap.getWidth() / 2.0f) - (fMeasureText / 2.0f), bitmap.getHeight() - (iP * 2), paint);
        paint.setStrokeWidth(iP);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(1717986918);
        a(canvas, paint, 100);
        paint.setColor(i11);
        a(canvas, paint, i4);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        bi.d.c(new a(iArr, context, appWidgetManager, 4));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
    }
}
