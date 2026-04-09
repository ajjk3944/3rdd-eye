package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.e;

/* loaded from: classes.dex */
public final class n extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f5516c = new Paint(1);

    /* renamed from: d, reason: collision with root package name */
    private static final Paint f5517d = new Paint(1);

    /* renamed from: e, reason: collision with root package name */
    private static final Paint f5518e = new Paint(1);

    public n(Context context) {
        super(context);
        f5516c.setColor(-1);
        f5517d.setColor(-16777216);
        Paint paint = f5518e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f5483a * 10.0f;
    }

    public float getInnerCircleOffset() {
        return this.f5483a * 2.0f;
    }

    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    public float getStrokeWidth() {
        return this.f5483a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f5516c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f5517d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f5518e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
