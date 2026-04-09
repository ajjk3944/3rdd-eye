package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.e;

/* loaded from: classes.dex */
public final class j extends e {

    /* renamed from: e, reason: collision with root package name */
    private static final Paint f19058e = new Paint(1);

    /* renamed from: f, reason: collision with root package name */
    private static final Paint f19059f = new Paint(1);

    /* renamed from: c, reason: collision with root package name */
    private final float[] f19060c;

    /* renamed from: d, reason: collision with root package name */
    private Path f19061d;

    public j(Context context) {
        super(context);
        this.f19060c = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f19058e.setARGB(80, 0, 0, 0);
        Paint paint = f19059f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.e
    public void a(int i) {
        setViewScale(i / 30.0f);
        a();
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getStrokeWidth() {
        return this.f19038a * 2.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f19058e);
        Paint paint = f19059f;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f19061d, paint);
    }

    private void a() {
        int i = 0;
        while (true) {
            float[] fArr = this.f19060c;
            if (i < fArr.length) {
                fArr[i] = fArr[i] * 0.3f * this.f19038a;
                i++;
            } else {
                Path path = new Path();
                this.f19061d = path;
                float[] fArr2 = this.f19060c;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f19061d;
                float[] fArr3 = this.f19060c;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f19061d;
                float[] fArr4 = this.f19060c;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f19061d;
                float[] fArr5 = this.f19060c;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f19061d;
                float[] fArr6 = this.f19060c;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f19061d;
                float[] fArr7 = this.f19060c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }
}
