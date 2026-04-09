package t7;

import android.graphics.RectF;
import b9.j;
import s7.AbstractC5584c;
import s7.d;

/* compiled from: SliderIndicatorAnimator.kt */
/* loaded from: classes.dex */
public final class d implements InterfaceC5610a {

    /* renamed from: a, reason: collision with root package name */
    public final s7.e f46435a;

    /* renamed from: b, reason: collision with root package name */
    public float f46436b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f46437c = new RectF();

    /* renamed from: d, reason: collision with root package name */
    public float f46438d;

    /* renamed from: e, reason: collision with root package name */
    public float f46439e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC5584c f46440f;

    public d(s7.e eVar) {
        AbstractC5584c abstractC5584cC;
        this.f46435a = eVar;
        s7.d dVar = eVar.f46137c;
        if (dVar instanceof d.a) {
            abstractC5584cC = ((d.a) dVar).f46130b;
        } else {
            if (!(dVar instanceof d.b)) {
                throw new j();
            }
            d.b bVar = (d.b) dVar;
            AbstractC5584c.b bVar2 = bVar.f46132b;
            float f10 = bVar2.f46126a;
            float f11 = bVar.f46133c;
            abstractC5584cC = AbstractC5584c.b.c(bVar2, f10 + f11, bVar2.f46127b + f11, 4);
        }
        this.f46440f = abstractC5584cC;
    }

    @Override // t7.InterfaceC5610a
    public final AbstractC5584c a(int i) {
        return this.f46440f;
    }

    @Override // t7.InterfaceC5610a
    public final void b(float f10) {
        this.f46438d = f10;
    }

    @Override // t7.InterfaceC5610a
    public final int c(int i) {
        s7.d dVar = this.f46435a.f46137c;
        if (dVar instanceof d.b) {
            return ((d.b) dVar).f46134d;
        }
        return 0;
    }

    @Override // t7.InterfaceC5610a
    public final RectF e(float f10, float f11, float f12, boolean z10) {
        float fB = this.f46439e;
        s7.d dVar = this.f46435a.f46136b;
        if (fB == 0.0f) {
            fB = dVar.b().b();
        }
        RectF rectF = this.f46437c;
        if (z10) {
            float f13 = this.f46438d;
            float f14 = this.f46436b * f13;
            if (f14 <= f13) {
                f13 = f14;
            }
            float f15 = fB / 2.0f;
            rectF.left = (f10 - f13) - f15;
            if (f14 < 0.0f) {
                f14 = 0.0f;
            }
            rectF.right = (f10 - f14) + f15;
        } else {
            float f16 = this.f46438d;
            float f17 = this.f46436b * f16;
            float f18 = fB / 2.0f;
            rectF.left = ((f17 < 0.0f ? 0.0f : f17) + f10) - f18;
            if (f17 <= f16) {
                f16 = f17;
            }
            rectF.right = f10 + f16 + f18;
        }
        rectF.top = f11 - (dVar.b().a() / 2.0f);
        rectF.bottom = (dVar.b().a() / 2.0f) + f11;
        float f19 = rectF.left;
        if (f19 < 0.0f) {
            rectF.offset(-f19, 0.0f);
        }
        float f20 = rectF.right;
        if (f20 > f12) {
            rectF.offset(-(f20 - f12), 0.0f);
        }
        return rectF;
    }

    @Override // t7.InterfaceC5610a
    public final void f(float f10) {
        this.f46439e = f10;
    }

    @Override // t7.InterfaceC5610a
    public final void g(float f10, int i) {
        this.f46436b = f10;
    }

    @Override // t7.InterfaceC5610a
    public final int h(int i) {
        return this.f46435a.f46137c.a();
    }

    @Override // t7.InterfaceC5610a
    public final float i(int i) {
        s7.d dVar = this.f46435a.f46137c;
        if (dVar instanceof d.b) {
            return ((d.b) dVar).f46133c;
        }
        return 0.0f;
    }

    @Override // t7.InterfaceC5610a
    public final /* synthetic */ void d(int i) {
    }

    @Override // t7.InterfaceC5610a
    public final /* synthetic */ void onPageSelected(int i) {
    }
}
