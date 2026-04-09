package vh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    public Paint f36237a;

    /* renamed from: b, reason: collision with root package name */
    public int f36238b;

    /* renamed from: c, reason: collision with root package name */
    public int f36239c;

    /* renamed from: d, reason: collision with root package name */
    public float f36240d;

    /* renamed from: e, reason: collision with root package name */
    public float f36241e;

    /* renamed from: f, reason: collision with root package name */
    public int f36242f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public String f36243h;

    /* renamed from: i, reason: collision with root package name */
    public String f36244i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public String f36245k;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f36237a;
        paint.setColor(-1);
        canvas.drawLine(getWidth(), 0.0f, 0.0f, getHeight(), paint);
        canvas.drawText(this.f36245k, (int) (this.f36238b * 1.525d), (int) (this.f36239c * 0.525f), paint);
        paint.setColor(-16711936);
        int i4 = this.f36238b;
        canvas.drawLine(i4, 0.0f, i4, getHeight(), paint);
        canvas.drawText(this.f36243h, this.f36238b + 14, this.f36242f, paint);
        canvas.drawText(this.j, this.f36238b + 14, this.f36242f + this.f36241e, paint);
        paint.setColor(-65536);
        canvas.drawLine(0.0f, this.f36239c, getWidth(), this.f36239c, paint);
        canvas.drawText(this.g, this.f36240d, this.f36239c + 4 + this.f36241e, paint);
        canvas.drawText(this.f36244i, this.f36240d, (this.f36241e * 2.0f) + this.f36239c + 4, paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        int i13 = i4 / 2;
        this.f36238b = i13;
        int i14 = i10 / 2;
        this.f36239c = i14;
        this.f36240d = (float) (i13 * 1.4d);
        this.f36242f = (int) (i14 * 1.5d);
        Paint.FontMetrics fontMetrics = this.f36237a.getFontMetrics();
        this.f36241e = fontMetrics.bottom - fontMetrics.top;
    }
}
