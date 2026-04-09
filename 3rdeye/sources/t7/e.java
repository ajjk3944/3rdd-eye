package t7;

import android.graphics.RectF;
import b9.j;
import s7.AbstractC5584c;
import s7.d;

/* compiled from: WormIndicatorAnimator.kt */
/* loaded from: classes.dex */
public final class e implements InterfaceC5610a {

    /* renamed from: a, reason: collision with root package name */
    public final s7.e f46441a;

    /* renamed from: b, reason: collision with root package name */
    public float f46442b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f46443c = new RectF();

    /* renamed from: d, reason: collision with root package name */
    public float f46444d;

    /* renamed from: e, reason: collision with root package name */
    public float f46445e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC5584c f46446f;

    public e(s7.e eVar) {
        AbstractC5584c abstractC5584cC;
        this.f46441a = eVar;
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
        this.f46446f = abstractC5584cC;
    }

    @Override // t7.InterfaceC5610a
    public final AbstractC5584c a(int i) {
        return this.f46446f;
    }

    @Override // t7.InterfaceC5610a
    public final void b(float f10) {
        this.f46444d = f10;
    }

    @Override // t7.InterfaceC5610a
    public final int c(int i) {
        s7.d dVar = this.f46441a.f46137c;
        if (dVar instanceof d.b) {
            return ((d.b) dVar).f46134d;
        }
        return 0;
    }

    @Override // t7.InterfaceC5610a
    public final RectF e(float f10, float f11, float f12, boolean z10) {
        float fB = this.f46445e;
        s7.d dVar = this.f46441a.f46136b;
        if (fB == 0.0f) {
            fB = dVar.b().b();
        }
        RectF rectF = this.f46443c;
        rectF.top = f11 - (dVar.b().a() / 2.0f);
        if (z10) {
            float f13 = this.f46444d;
            float f14 = this.f46442b;
            float f15 = (f14 - 0.5f) * f13 * 2.0f;
            if (f15 < 0.0f) {
                f15 = 0.0f;
            }
            float f16 = fB / 2.0f;
            rectF.right = (f10 - f15) + f16;
            float f17 = f14 * f13 * 2.0f;
            if (f17 <= f13) {
                f13 = f17;
            }
            rectF.left = (f10 - f13) - f16;
        } else {
            float f18 = this.f46444d;
            float f19 = this.f46442b;
            float f20 = f18 * f19 * 2.0f;
            if (f20 > f18) {
                f20 = f18;
            }
            float f21 = fB / 2.0f;
            rectF.right = f20 + f10 + f21;
            float f22 = (f19 - 0.5f) * f18 * 2.0f;
            if (f22 < 0.0f) {
                f22 = 0.0f;
            }
            rectF.left = (f10 + f22) - f21;
        }
        rectF.bottom = (dVar.b().a() / 2.0f) + f11;
        float f23 = rectF.left;
        if (f23 < 0.0f) {
            rectF.offset(-f23, 0.0f);
        }
        float f24 = rectF.right;
        if (f24 > f12) {
            rectF.offset(-(f24 - f12), 0.0f);
        }
        return rectF;
    }

    @Override // t7.InterfaceC5610a
    public final void f(float f10) {
        this.f46445e = f10;
    }

    @Override // t7.InterfaceC5610a
    public final void g(float f10, int i) {
        this.f46442b = f10;
    }

    @Override // t7.InterfaceC5610a
    public final int h(int i) {
        return this.f46441a.f46137c.a();
    }

    @Override // t7.InterfaceC5610a
    public final float i(int i) {
        s7.d dVar = this.f46441a.f46137c;
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
