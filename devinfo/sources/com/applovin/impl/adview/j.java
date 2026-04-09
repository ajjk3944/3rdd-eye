package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends e {

    /* renamed from: e, reason: collision with root package name */
    private static final Paint f3696e = new Paint(1);

    /* renamed from: f, reason: collision with root package name */
    private static final Paint f3697f = new Paint(1);

    /* renamed from: c, reason: collision with root package name */
    private final float[] f3698c;

    /* renamed from: d, reason: collision with root package name */
    private Path f3699d;

    public j(Context context) {
        super(context);
        this.f3698c = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f3696e.setARGB(80, 0, 0, 0);
        Paint paint = f3697f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.e
    public void a(int i4) {
        setViewScale(i4 / 30.0f);
        a();
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getStrokeWidth() {
        return this.f3677a * 2.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f3696e);
        Paint paint = f3697f;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f3699d, paint);
    }

    private void a() {
        int i4 = 0;
        while (true) {
            float[] fArr = this.f3698c;
            if (i4 < fArr.length) {
                fArr[i4] = fArr[i4] * 0.3f * this.f3677a;
                i4++;
            } else {
                Path path = new Path();
                this.f3699d = path;
                float[] fArr2 = this.f3698c;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f3699d;
                float[] fArr3 = this.f3698c;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f3699d;
                float[] fArr4 = this.f3698c;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f3699d;
                float[] fArr5 = this.f3698c;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f3699d;
                float[] fArr6 = this.f3698c;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f3699d;
                float[] fArr7 = this.f3698c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }
}
