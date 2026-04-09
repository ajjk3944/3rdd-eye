package u7;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.l;
import s7.AbstractC5584c;
import s7.d;
import s7.e;

/* compiled from: RoundedRect.kt */
/* renamed from: u7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5637b implements InterfaceC5638c {

    /* renamed from: a, reason: collision with root package name */
    public final e f46603a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f46604b = new Paint();

    /* renamed from: c, reason: collision with root package name */
    public final Paint f46605c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f46606d;

    public C5637b(e eVar) {
        this.f46603a = eVar;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        this.f46605c = paint;
        this.f46606d = new RectF();
    }

    @Override // u7.InterfaceC5638c
    public final void a(Canvas canvas, float f10, float f11, AbstractC5584c itemSize, int i, float f12, int i10) {
        l.f(itemSize, "itemSize");
        AbstractC5584c.b bVar = (AbstractC5584c.b) itemSize;
        Paint paint = this.f46604b;
        paint.setColor(i);
        RectF rectF = this.f46606d;
        float f13 = bVar.f46126a / 2.0f;
        rectF.left = (float) Math.ceil(f10 - f13);
        float f14 = bVar.f46127b / 2.0f;
        rectF.top = (float) Math.ceil(f11 - f14);
        rectF.right = (float) Math.ceil(f13 + f10);
        float fCeil = (float) Math.ceil(f14 + f11);
        rectF.bottom = fCeil;
        if (f12 > 0.0f) {
            float f15 = f12 / 2.0f;
            rectF.left += f15;
            rectF.top += f15;
            rectF.right -= f15;
            rectF.bottom = fCeil - f15;
        }
        float f16 = bVar.f46128c;
        canvas.drawRoundRect(rectF, f16, f16, paint);
        if (i10 == 0 || f12 == 0.0f) {
            return;
        }
        Paint paint2 = this.f46605c;
        paint2.setColor(i10);
        paint2.setStrokeWidth(f12);
        canvas.drawRoundRect(rectF, f16, f16, paint2);
    }

    @Override // u7.InterfaceC5638c
    public final void b(Canvas canvas, RectF rectF) {
        d dVar = this.f46603a.f46136b;
        d.b bVar = (d.b) dVar;
        Paint paint = this.f46604b;
        paint.setColor(dVar.a());
        AbstractC5584c.b bVar2 = bVar.f46132b;
        float f10 = bVar2.f46128c;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        int i = bVar.f46134d;
        if (i != 0) {
            float f11 = bVar.f46133c;
            if (f11 == 0.0f) {
                return;
            }
            Paint paint2 = this.f46605c;
            paint2.setColor(i);
            paint2.setStrokeWidth(f11);
            float f12 = bVar2.f46128c;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
    }
}
