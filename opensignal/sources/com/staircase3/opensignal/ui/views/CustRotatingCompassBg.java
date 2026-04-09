package com.staircase3.opensignal.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import br.l;
import com.staircase3.opensignal.utils.u;
import kotlin.Metadata;
import lq.q;
import qk.d;
import qk.f;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/staircase3/opensignal/ui/views/CustRotatingCompassBg;", "Landroid/view/View;", "", "visible", "Llq/b0;", "setAntennaVisibility", "(Z)V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CustRotatingCompassBg extends View {
    public Bitmap B;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f6150a;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f6151d;

    /* renamed from: g, reason: collision with root package name */
    public final float f6152g;

    /* renamed from: r, reason: collision with root package name */
    public float f6153r;

    /* renamed from: x, reason: collision with root package name */
    public float f6154x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6155y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustRotatingCompassBg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        float f10 = getResources().getDisplayMetrics().density;
        this.f6152g = (25 * f10) / 2.0f;
        this.f6155y = true;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f10 * 3.0f);
        paint.setColor(context.getColor(d.primary_2));
        this.f6150a = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(context.getColor(d.primary_2));
        this.f6151d = paint2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        l.e(canvas, "canvas");
        double d6 = this.f6153r;
        q qVar = u.f6195a;
        double d10 = (d6 * 3.141592653589793d) / 180.0d;
        Paint paint = this.f6150a;
        float width = (getWidth() / 2.0f) - (paint.getStrokeWidth() / 2.0f);
        float f10 = this.f6152g;
        this.f6154x = width - f10;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.f6154x, paint);
        if (this.f6155y) {
            int i10 = (int) f10;
            Bitmap bitmap = this.B;
            if (bitmap == null) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), f.ic_cell_large);
                l.b(bitmapDecodeResource);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, i10, i10, false);
                bitmapDecodeResource.recycle();
                this.B = bitmapCreateScaledBitmap;
                bitmap = bitmapCreateScaledBitmap;
            }
            float width2 = (getWidth() / 2.0f) + ((float) (Math.cos(d10) * this.f6154x));
            float height = (getHeight() / 2.0f) + ((float) (Math.sin(d10) * this.f6154x));
            canvas.drawCircle(width2, height, f10, this.f6151d);
            canvas.drawBitmap(bitmap, width2 - (bitmap.getWidth() / 2.0f), height - (bitmap.getHeight() / 2.0f), (Paint) null);
        }
    }

    public final void setAntennaVisibility(boolean visible) {
        this.f6155y = visible;
    }
}
