package p6;

import android.graphics.Paint;
import android.graphics.Path;
import ch.AbstractC4260a;
import kotlin.jvm.internal.AbstractC6492s;
import o6.InterfaceC7092c;
import sh.AbstractC7978m;
import u6.InterfaceC8137b;

/* renamed from: p6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7233d implements InterfaceC7092c {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7230a f57689a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7230a f57690b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC7230a f57691c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC7230a f57692d;

    public C7233d(AbstractC7230a topLeft, AbstractC7230a topRight, AbstractC7230a bottomRight, AbstractC7230a bottomLeft) {
        AbstractC6492s.i(topLeft, "topLeft");
        AbstractC6492s.i(topRight, "topRight");
        AbstractC6492s.i(bottomRight, "bottomRight");
        AbstractC6492s.i(bottomLeft, "bottomLeft");
        this.f57689a = topLeft;
        this.f57690b = topRight;
        this.f57691c = bottomRight;
        this.f57692d = bottomLeft;
    }

    private final float e(float f10) {
        if (f10 == 0.0f) {
            return 1.0f;
        }
        return f10;
    }

    @Override // o6.InterfaceC7092c
    public void a(InterfaceC8137b context, Paint paint, Path path, float f10, float f11, float f12, float f13) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(paint, "paint");
        AbstractC6492s.i(path, "path");
        c(context, path, f10, f11, f12, f13);
        context.d().drawPath(path, paint);
    }

    public void b(float f10, Path path, float f11, float f12, float f13, float f14) {
        AbstractC6492s.i(path, "path");
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        if (f15 == 0.0f || f16 == 0.0f) {
            return;
        }
        float fAbs = Math.abs(Math.min(f15, f16));
        float f17 = AbstractC7978m.f(d(f15, f16, f10), 1.0f);
        float fA = this.f57689a.a(fAbs, f10) * f17;
        float fA2 = this.f57690b.a(fAbs, f10) * f17;
        float fA3 = this.f57691c.a(fAbs, f10) * f17;
        float fA4 = this.f57692d.a(fAbs, f10) * f17;
        float f18 = f12 + fA;
        path.moveTo(f11, f18);
        this.f57689a.b().a(f11, f18, f11 + fA, f12, EnumC7231b.TopLeft, path);
        float f19 = f13 - fA2;
        path.lineTo(f19, f12);
        this.f57690b.b().a(f19, f12, f13, f12 + fA2, EnumC7231b.TopRight, path);
        float f20 = f14 - fA3;
        path.lineTo(f13, f20);
        this.f57691c.b().a(f13, f20, f13 - fA3, f14, EnumC7231b.BottomRight, path);
        float f21 = f11 + fA4;
        path.lineTo(f21, f14);
        this.f57692d.b().a(f21, f14, f11, f14 - fA4, EnumC7231b.BottomLeft, path);
        path.close();
    }

    protected void c(InterfaceC8137b context, Path path, float f10, float f11, float f12, float f13) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(path, "path");
        b(context.getDensity(), path, f10, f11, f12, f13);
    }

    public final float d(float f10, float f11, float f12) {
        float fMin = Math.min(f10, f11);
        float fA = this.f57689a.a(fMin, f12);
        float fA2 = this.f57690b.a(fMin, f12);
        float fA3 = this.f57691c.a(fMin, f12);
        float fA4 = this.f57692d.a(fMin, f12);
        return AbstractC4260a.l(f10 / e(fA + fA2), f10 / e(fA4 + fA3), f11 / e(fA + fA4), f11 / e(fA2 + fA3));
    }
}
