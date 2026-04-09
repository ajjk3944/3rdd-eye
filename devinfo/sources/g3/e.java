package g3;

import android.view.View;
import android.view.ViewGroup;
import g2.j0;
import g2.k0;
import g2.l0;
import i2.e0;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f24462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f24463b;

    public e(x xVar, e0 e0Var) {
        this.f24462a = xVar;
        this.f24463b = e0Var;
    }

    @Override // g2.j0
    public final int b(g2.q qVar, List list, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        x xVar = this.f24462a;
        ViewGroup.LayoutParams layoutParams = xVar.getLayoutParams();
        nk.k.b(layoutParams);
        xVar.measure(iMakeMeasureSpec, j.l(xVar, 0, i4, layoutParams.height));
        return xVar.getMeasuredWidth();
    }

    @Override // g2.j0
    public final int d(g2.q qVar, List list, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        x xVar = this.f24462a;
        ViewGroup.LayoutParams layoutParams = xVar.getLayoutParams();
        nk.k.b(layoutParams);
        xVar.measure(iMakeMeasureSpec, j.l(xVar, 0, i4, layoutParams.height));
        return xVar.getMeasuredWidth();
    }

    @Override // g2.j0
    public final int e(g2.q qVar, List list, int i4) {
        x xVar = this.f24462a;
        ViewGroup.LayoutParams layoutParams = xVar.getLayoutParams();
        nk.k.b(layoutParams);
        xVar.measure(j.l(xVar, 0, i4, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return xVar.getMeasuredHeight();
    }

    @Override // g2.j0
    public final k0 f(l0 l0Var, List list, long j) {
        x xVar = this.f24462a;
        int childCount = xVar.getChildCount();
        zj.t tVar = zj.t.f38318a;
        if (childCount == 0) {
            return l0Var.O(d3.a.j(j), d3.a.i(j), tVar, c.f24455c);
        }
        if (d3.a.j(j) != 0) {
            xVar.getChildAt(0).setMinimumWidth(d3.a.j(j));
        }
        if (d3.a.i(j) != 0) {
            xVar.getChildAt(0).setMinimumHeight(d3.a.i(j));
        }
        int iJ = d3.a.j(j);
        int iH = d3.a.h(j);
        ViewGroup.LayoutParams layoutParams = xVar.getLayoutParams();
        nk.k.b(layoutParams);
        int iL = j.l(xVar, iJ, iH, layoutParams.width);
        int i4 = d3.a.i(j);
        int iG = d3.a.g(j);
        ViewGroup.LayoutParams layoutParams2 = xVar.getLayoutParams();
        nk.k.b(layoutParams2);
        xVar.measure(iL, j.l(xVar, i4, iG, layoutParams2.height));
        return l0Var.O(xVar.getMeasuredWidth(), xVar.getMeasuredHeight(), tVar, new d(xVar, this.f24463b, 1));
    }

    @Override // g2.j0
    public final int h(g2.q qVar, List list, int i4) {
        x xVar = this.f24462a;
        ViewGroup.LayoutParams layoutParams = xVar.getLayoutParams();
        nk.k.b(layoutParams);
        xVar.measure(j.l(xVar, 0, i4, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return xVar.getMeasuredHeight();
    }
}
