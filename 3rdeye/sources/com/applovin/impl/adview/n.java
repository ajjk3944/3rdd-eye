package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.e;

/* loaded from: classes.dex */
public final class n extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f19066c = new Paint(1);

    /* renamed from: d, reason: collision with root package name */
    private static final Paint f19067d = new Paint(1);

    /* renamed from: e, reason: collision with root package name */
    private static final Paint f19068e = new Paint(1);

    public n(Context context) {
        super(context);
        f19066c.setColor(-1);
        f19067d.setColor(-16777216);
        Paint paint = f19068e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f19038a * 10.0f;
    }

    public float getInnerCircleOffset() {
        return this.f19038a * 2.0f;
    }

    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    public float getStrokeWidth() {
        return this.f19038a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f19066c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f19067d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f19068e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
