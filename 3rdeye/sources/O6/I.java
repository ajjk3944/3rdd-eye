package O6;

import H6.C0672i;
import H6.C0675l;
import H6.O;
import N7.R3;
import N7.S2;
import N7.Z;
import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.Iterator;
import k2.C5211b;

/* compiled from: ReleaseViewVisitor.kt */
/* loaded from: classes.dex */
public final class I extends I9.g {

    /* renamed from: b, reason: collision with root package name */
    public final C0675l f10377b;

    /* renamed from: c, reason: collision with root package name */
    public final j6.m f10378c;

    /* renamed from: d, reason: collision with root package name */
    public final C5211b f10379d;

    public I(C0675l divView, j6.m divCustomContainerViewAdapter, C5211b c5211b) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(divCustomContainerViewAdapter, "divCustomContainerViewAdapter");
        this.f10377b = divView;
        this.f10378c = divCustomContainerViewAdapter;
        this.f10379d = c5211b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i0(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        if (view instanceof O) {
            ((O) view).release();
        }
        Object tag = view.getTag(R.id.div_releasable_list);
        m0.j jVar = tag instanceof m0.j ? (m0.j) tag : null;
        C6.n nVar = jVar != null ? new C6.n(jVar) : null;
        if (nVar == null) {
            return;
        }
        Iterator it = nVar.iterator();
        while (true) {
            C6.o oVar = (C6.o) it;
            if (!oVar.hasNext()) {
                return;
            } else {
                ((O) oVar.next()).release();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // I9.g
    public final void N(l<?> view) {
        kotlin.jvm.internal.l.f(view, "view");
        View view2 = (View) view;
        Z div = view.getDiv();
        S2 s2D = div != null ? div.d() : null;
        C0672i bindingContext = view.getBindingContext();
        A7.d dVar = bindingContext != null ? bindingContext.f2147b : null;
        if (s2D != null && dVar != null) {
            this.f10379d.f(this.f10377b, dVar, view2, s2D);
        }
        i0(view2);
    }

    @Override // I9.g
    public final void d0(C1482h view) {
        C0672i bindingContext;
        A7.d dVar;
        kotlin.jvm.internal.l.f(view, "view");
        Z.b div = view.getDiv();
        if (div == null || (bindingContext = view.getBindingContext()) == null || (dVar = bindingContext.f2147b) == null) {
            return;
        }
        i0(view);
        View customView = view.getCustomView();
        if (customView != null) {
            C5211b c5211b = this.f10379d;
            C0675l c0675l = this.f10377b;
            R3 r32 = div.f7814c;
            c5211b.f(c0675l, dVar, customView, r32);
            this.f10378c.release(customView, r32);
        }
    }

    @Override // I9.g
    public final void e0(t view) {
        kotlin.jvm.internal.l.f(view, "view");
        N(view);
        view.getViewPager().setAdapter(null);
    }

    @Override // I9.g
    public final void f0(v view) {
        kotlin.jvm.internal.l.f(view, "view");
        N(view);
        view.setAdapter(null);
    }

    @Override // I9.g
    public final void h0(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        i0(view);
    }
}
