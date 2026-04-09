package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
class b implements e {
    b() {
    }

    private f o(d dVar) {
        return (f) dVar.d();
    }

    @Override // androidx.cardview.widget.e
    public float a(d dVar) {
        return o(dVar).c();
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return o(dVar).d();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar) {
        k(dVar, a(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void d(d dVar, ColorStateList colorStateList) {
        o(dVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public float e(d dVar) {
        return b(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return dVar.a().getElevation();
    }

    @Override // androidx.cardview.widget.e
    public float g(d dVar) {
        return b(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar) {
        k(dVar, a(dVar));
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList i(d dVar) {
        return o(dVar).b();
    }

    @Override // androidx.cardview.widget.e
    public void j(d dVar, float f2) {
        dVar.a().setElevation(f2);
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar, float f2) {
        o(dVar).g(f2, dVar.b(), dVar.g());
        p(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void l() {
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        dVar.f(new f(colorStateList, f2));
        View viewA = dVar.a();
        viewA.setClipToOutline(true);
        viewA.setElevation(f3);
        k(dVar, f4);
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, float f2) {
        o(dVar).h(f2);
    }

    public void p(d dVar) {
        if (!dVar.b()) {
            dVar.c(0, 0, 0, 0);
            return;
        }
        float fA = a(dVar);
        float fB = b(dVar);
        int iCeil = (int) Math.ceil(g.c(fA, fB, dVar.g()));
        int iCeil2 = (int) Math.ceil(g.d(fA, fB, dVar.g()));
        dVar.c(iCeil, iCeil2, iCeil, iCeil2);
    }
}
