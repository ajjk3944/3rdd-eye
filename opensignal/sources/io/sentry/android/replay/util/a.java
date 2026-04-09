package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import br.l;
import mq.w;

/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: d, reason: collision with root package name */
    public static final int f11992d = Color.argb(32, 255, 20, 20);

    /* renamed from: e, reason: collision with root package name */
    public static final int f11993e = Color.argb(128, 255, 20, 20);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f11994a = new Paint(1);

    /* renamed from: b, reason: collision with root package name */
    public final Rect f11995b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Object f11996c = w.f16945a;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l.e(canvas, "canvas");
        Paint paint = this.f11994a;
        paint.setTextSize(32.0f);
        paint.setColor(-16777216);
        paint.setStrokeWidth(6.0f);
        for (Rect rect : this.f11996c) {
            paint.setColor(f11992d);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            canvas.drawRect(rect, paint);
            paint.setColor(f11993e);
            Paint.Style style2 = Paint.Style.STROKE;
            paint.setStyle(style2);
            canvas.drawRect(rect, paint);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.left);
            sb2.append('/');
            sb2.append(rect.top);
            String string = sb2.toString();
            int length = string.length();
            Rect rect2 = this.f11995b;
            paint.getTextBounds(string, 0, length, rect2);
            float f10 = rect.left;
            float f11 = rect.top;
            paint.setColor(-1);
            paint.setStyle(style2);
            canvas.drawText(string, f10, f11, paint);
            paint.setColor(-16777216);
            paint.setStyle(style);
            canvas.drawText(string, f10, f11, paint);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(rect.right);
            sb3.append('/');
            sb3.append(rect.bottom);
            String string2 = sb3.toString();
            paint.getTextBounds(string2, 0, string2.length(), rect2);
            float fWidth = rect.right - rect2.width();
            float fHeight = rect.bottom + rect2.height();
            paint.setColor(-1);
            paint.setStyle(style2);
            canvas.drawText(string2, fWidth, fHeight, paint);
            paint.setColor(-16777216);
            paint.setStyle(style);
            canvas.drawText(string2, fWidth, fHeight, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
