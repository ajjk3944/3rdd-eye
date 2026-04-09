package ki;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f28305a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f28306b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f28307c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f28308d;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i4;
        int i10;
        int[] iArr = this.f28305a;
        Paint paint = this.f28307c;
        Paint paint2 = this.f28308d;
        int width = getWidth();
        int height = getHeight();
        if (width > height) {
            i10 = 8;
            i4 = 2;
        } else {
            i4 = 8;
            i10 = 2;
        }
        int i11 = height / i4;
        int i12 = width / i10;
        for (int i13 = 0; i13 < i4; i13++) {
            int i14 = 0;
            while (i14 < i10) {
                int i15 = (i13 * i10) + i14;
                paint.setColor(iArr[i15]);
                float f10 = i14 * i12;
                float f11 = i13 * i11;
                int i16 = i14;
                canvas.drawRect(f10, f11, r3 + i12, r4 + i11, paint);
                if (i15 < iArr.length / 2) {
                    paint2.setColor(-1);
                } else {
                    paint2.setColor(-16777216);
                }
                canvas.drawText(this.f28306b[i15], (paint2.getTextSize() * 0.2f) + f10, (paint2.getTextSize() * 1.2f) + f11, paint2);
                i14 = i16 + 1;
            }
        }
    }
}
