package u7;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.l;
import s7.AbstractC5584c;
import s7.e;

/* compiled from: Circle.kt */
/* renamed from: u7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5636a implements InterfaceC5638c {

    /* renamed from: a, reason: collision with root package name */
    public final e f46600a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f46601b = new Paint();

    /* renamed from: c, reason: collision with root package name */
    public final RectF f46602c = new RectF();

    public C5636a(e eVar) {
        this.f46600a = eVar;
    }

    @Override // u7.InterfaceC5638c
    public final void a(Canvas canvas, float f10, float f11, AbstractC5584c itemSize, int i, float f12, int i10) {
        l.f(itemSize, "itemSize");
        Paint paint = this.f46601b;
        paint.setColor(i);
        RectF rectF = this.f46602c;
        float f13 = ((AbstractC5584c.a) itemSize).f46125a;
        rectF.left = f10 - f13;
        rectF.top = f11 - f13;
        rectF.right = f10 + f13;
        rectF.bottom = f11 + f13;
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), f13, paint);
    }

    @Override // u7.InterfaceC5638c
    public final void b(Canvas canvas, RectF rectF) {
        Paint paint = this.f46601b;
        paint.setColor(this.f46600a.f46136b.a());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, paint);
    }
}
