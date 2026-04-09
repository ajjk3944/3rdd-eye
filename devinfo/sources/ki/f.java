package ki;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f28309a;

    /* renamed from: b, reason: collision with root package name */
    public int f28310b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f28311c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f28312d;

    /* renamed from: e, reason: collision with root package name */
    public int f28313e;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i4;
        int i10;
        f fVar = this;
        Paint paint = fVar.f28312d;
        Paint paint2 = fVar.f28311c;
        canvas.drawColor(fVar.f28313e);
        int i11 = fVar.f28309a - 60;
        int i12 = fVar.f28310b - 60;
        if (i11 > i12) {
            i10 = 7;
            i4 = 4;
        } else {
            i4 = 7;
            i10 = 4;
        }
        int i13 = i11 / i10;
        int i14 = i12 / i4;
        int iMin = (int) (Math.min(i13, i14) * 0.6d);
        int i15 = (i13 - iMin) / 2;
        int i16 = (i14 - iMin) / 2;
        paint.setTextSize(iMin / 7);
        int textSize = (int) ((paint.getTextSize() / 2.0f) + ((iMin * 6) / 5));
        int i17 = 0;
        int i18 = 0;
        while (i17 < i4) {
            int i19 = 0;
            while (i19 < i10) {
                int i20 = (i19 * i13) + 30 + i15;
                int i21 = i10;
                int i22 = (i17 * i14) + 30 + i16;
                int i23 = fVar.f28313e == -1 ? (255 - (i19 * i17)) - i18 : (i19 * i17) + i18;
                paint2.setColor(Color.rgb(i23, i23, i23));
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeWidth(iMin / 5);
                int i24 = textSize;
                float f10 = i20;
                int i25 = i17;
                int i26 = i19;
                canvas.drawRect(f10, i22, i20 + iMin, i22 + iMin, paint2);
                paint2.setStyle(Paint.Style.FILL);
                int i27 = iMin / 4;
                float f11 = i20 + i27;
                float f12 = i27 + i22;
                int i28 = (iMin * 3) / 4;
                canvas.drawRect(f11, f12, i20 + i28, i28 + i22, paint2);
                String strValueOf = String.valueOf((i25 * i21) + i26 + 1);
                canvas.drawText(strValueOf, ((iMin - paint.measureText(strValueOf)) / 2.0f) + f10, i22 + i24, paint);
                i19 = i26 + 1;
                textSize = i24;
                i18 += 3;
                i10 = i21;
                i17 = i25;
                fVar = this;
            }
            i17++;
            fVar = this;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        this.f28309a = i4;
        this.f28310b = i10;
    }
}
