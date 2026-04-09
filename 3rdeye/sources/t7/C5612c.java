package t7;

import android.animation.ArgbEvaluator;
import android.graphics.RectF;
import android.util.SparseArray;
import b9.j;
import kotlin.jvm.internal.l;
import s7.AbstractC5584c;
import s7.d;

/* compiled from: ScaleIndicatorAnimator.kt */
/* renamed from: t7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5612c implements InterfaceC5610a {

    /* renamed from: a, reason: collision with root package name */
    public final s7.e f46431a;

    /* renamed from: b, reason: collision with root package name */
    public final ArgbEvaluator f46432b = new ArgbEvaluator();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray<Float> f46433c = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    public int f46434d;

    public C5612c(s7.e eVar) {
        this.f46431a = eVar;
    }

    @Override // t7.InterfaceC5610a
    public final AbstractC5584c a(int i) {
        s7.e eVar = this.f46431a;
        s7.d dVar = eVar.f46136b;
        boolean z10 = dVar instanceof d.a;
        s7.d dVar2 = eVar.f46137c;
        if (z10) {
            float f10 = ((d.a) dVar2).f46130b.f46125a;
            return new AbstractC5584c.a(com.google.android.gms.measurement.internal.a.e(((d.a) dVar).f46130b.f46125a, f10, j(i), f10));
        }
        if (!(dVar instanceof d.b)) {
            throw new j();
        }
        d.b bVar = (d.b) dVar2;
        AbstractC5584c.b bVar2 = bVar.f46132b;
        float f11 = bVar2.f46126a;
        float f12 = bVar.f46133c;
        float f13 = f11 + f12;
        d.b bVar3 = (d.b) dVar;
        AbstractC5584c.b bVar4 = bVar3.f46132b;
        float f14 = bVar4.f46126a;
        float f15 = bVar3.f46133c;
        float fE = com.google.android.gms.measurement.internal.a.e(f14 + f15, f13, j(i), f13);
        float f16 = bVar2.f46127b + f12;
        float fE2 = com.google.android.gms.measurement.internal.a.e(bVar4.f46127b + f15, f16, j(i), f16);
        float f17 = bVar2.f46128c;
        return new AbstractC5584c.b(fE, fE2, com.google.android.gms.measurement.internal.a.e(bVar4.f46128c, f17, j(i), f17));
    }

    @Override // t7.InterfaceC5610a
    public final int c(int i) {
        s7.e eVar = this.f46431a;
        s7.d dVar = eVar.f46136b;
        if (!(dVar instanceof d.b)) {
            return 0;
        }
        d.b bVar = (d.b) eVar.f46137c;
        Object objEvaluate = this.f46432b.evaluate(j(i), Integer.valueOf(bVar.f46134d), Integer.valueOf(((d.b) dVar).f46134d));
        l.d(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objEvaluate).intValue();
    }

    @Override // t7.InterfaceC5610a
    public final void d(int i) {
        this.f46434d = i;
    }

    @Override // t7.InterfaceC5610a
    public final RectF e(float f10, float f11, float f12, boolean z10) {
        return null;
    }

    @Override // t7.InterfaceC5610a
    public final void g(float f10, int i) {
        k(1.0f - f10, i);
        int i10 = this.f46434d;
        if (i < i10 - 1) {
            k(f10, i + 1);
        } else if (i10 > 1) {
            k(f10, 0);
        }
    }

    @Override // t7.InterfaceC5610a
    public final int h(int i) {
        float fJ = j(i);
        s7.e eVar = this.f46431a;
        Object objEvaluate = this.f46432b.evaluate(fJ, Integer.valueOf(eVar.f46137c.a()), Integer.valueOf(eVar.f46136b.a()));
        l.d(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objEvaluate).intValue();
    }

    @Override // t7.InterfaceC5610a
    public final float i(int i) {
        s7.e eVar = this.f46431a;
        s7.d dVar = eVar.f46136b;
        if (!(dVar instanceof d.b)) {
            return 0.0f;
        }
        s7.d dVar2 = eVar.f46137c;
        l.d(dVar2, "null cannot be cast to non-null type com.yandex.div.internal.widget.indicator.IndicatorParams.Shape.RoundedRect");
        float f10 = ((d.b) dVar).f46133c;
        float f11 = ((d.b) dVar2).f46133c;
        return (j(i) * (f10 - f11)) + f11;
    }

    public final float j(int i) {
        Float f10 = this.f46433c.get(i, Float.valueOf(0.0f));
        l.e(f10, "itemsScale.get(position, 0f)");
        return f10.floatValue();
    }

    public final void k(float f10, int i) {
        SparseArray<Float> sparseArray = this.f46433c;
        if (f10 == 0.0f) {
            sparseArray.remove(i);
        } else {
            sparseArray.put(i, Float.valueOf(Math.abs(f10)));
        }
    }

    @Override // t7.InterfaceC5610a
    public final void onPageSelected(int i) {
        SparseArray<Float> sparseArray = this.f46433c;
        sparseArray.clear();
        sparseArray.put(i, Float.valueOf(1.0f));
    }

    @Override // t7.InterfaceC5610a
    public final /* synthetic */ void b(float f10) {
    }

    @Override // t7.InterfaceC5610a
    public final /* synthetic */ void f(float f10) {
    }
}
