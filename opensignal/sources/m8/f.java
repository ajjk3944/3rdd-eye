package m8;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import xu.l;

/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final View f16323a;

    public f(View view) {
        this.f16323a = view;
    }

    public static a.a b(int i10, int i11, int i12) {
        if (i10 == -2) {
            return b.f16321f;
        }
        int i13 = i10 - i12;
        if (i13 > 0) {
            return new a(i13);
        }
        int i14 = i11 - i12;
        if (i14 > 0) {
            return new a(i14);
        }
        return null;
    }

    @Override // m8.i
    public Object a(a8.i iVar) {
        h hVarC = c();
        if (hVarC != null) {
            return hVarC;
        }
        wt.g gVar = new wt.g(1, l.D(iVar));
        gVar.v();
        ViewTreeObserver viewTreeObserver = this.f16323a.getViewTreeObserver();
        j jVar = new j(this, viewTreeObserver, gVar);
        viewTreeObserver.addOnPreDrawListener(jVar);
        gVar.x(new gt.j(this, viewTreeObserver, jVar, 1));
        Object objU = gVar.u();
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        return objU;
    }

    public h c() {
        View view = this.f16323a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a.a aVarB = b(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (aVarB == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        a.a aVarB2 = b(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (aVarB2 == null) {
            return null;
        }
        return new h(aVarB, aVarB2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return br.l.a(this.f16323a, ((f) obj).f16323a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f16323a.hashCode() * 31);
    }
}
