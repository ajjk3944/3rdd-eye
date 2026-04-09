package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f3704c = new Paint(1);

    /* renamed from: d, reason: collision with root package name */
    private static final Paint f3705d = new Paint(1);

    /* renamed from: e, reason: collision with root package name */
    private static final Paint f3706e = new Paint(1);

    public n(Context context) {
        super(context);
        f3704c.setColor(-1);
        f3705d.setColor(-16777216);
        Paint paint = f3706e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f3677a * 10.0f;
    }

    public float getInnerCircleOffset() {
        return this.f3677a * 2.0f;
    }

    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    public float getStrokeWidth() {
        return this.f3677a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f3704c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f3705d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f3706e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
