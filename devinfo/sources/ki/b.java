package ki;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f28300a;

    /* renamed from: b, reason: collision with root package name */
    public Paint f28301b;

    public int getCount() {
        return this.f28300a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f28301b;
        if (this.f28300a < 1) {
            return;
        }
        int iCeil = (int) Math.ceil(((getHeight() * 1.0f) / this.f28300a) * 1.0f);
        int i4 = 0;
        while (true) {
            int i10 = this.f28300a;
            if (i4 >= i10) {
                return;
            }
            int i11 = (256 / i10) * i4;
            paint.setColor(Color.rgb(i11, i11, i11));
            canvas.drawRect(0.0f, iCeil * i4, getWidth(), r0 + iCeil, paint);
            i4++;
        }
    }

    public void setCount(int i4) {
        this.f28300a = i4;
        invalidate();
    }
}
