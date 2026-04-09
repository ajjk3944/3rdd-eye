package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
public class a implements c {
    @Override // q.c
    public void a(b bVar) {
        o(bVar, k(bVar));
    }

    @Override // q.c
    public void b(b bVar, float f10) {
        p(bVar).h(f10);
    }

    @Override // q.c
    public float c(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // q.c
    public float d(b bVar) {
        return i(bVar) * 2.0f;
    }

    @Override // q.c
    public void e(b bVar, float f10) {
        bVar.f().setElevation(f10);
    }

    @Override // q.c
    public void f(b bVar) {
        if (!bVar.c()) {
            bVar.a(0, 0, 0, 0);
            return;
        }
        float fK = k(bVar);
        float fI = i(bVar);
        int iCeil = (int) Math.ceil(e.a(fK, fI, bVar.e()));
        int iCeil2 = (int) Math.ceil(e.b(fK, fI, bVar.e()));
        bVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // q.c
    public void g(b bVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        bVar.b(new d(colorStateList, f10));
        View viewF = bVar.f();
        viewF.setClipToOutline(true);
        viewF.setElevation(f11);
        o(bVar, f12);
    }

    @Override // q.c
    public float h(b bVar) {
        return i(bVar) * 2.0f;
    }

    @Override // q.c
    public float i(b bVar) {
        return p(bVar).d();
    }

    @Override // q.c
    public void j(b bVar) {
        o(bVar, k(bVar));
    }

    @Override // q.c
    public float k(b bVar) {
        return p(bVar).c();
    }

    @Override // q.c
    public ColorStateList l(b bVar) {
        return p(bVar).b();
    }

    @Override // q.c
    public void n(b bVar, ColorStateList colorStateList) {
        p(bVar).f(colorStateList);
    }

    @Override // q.c
    public void o(b bVar, float f10) {
        p(bVar).g(f10, bVar.c(), bVar.e());
        f(bVar);
    }

    public final d p(b bVar) {
        return (d) bVar.d();
    }

    @Override // q.c
    public void m() {
    }
}
