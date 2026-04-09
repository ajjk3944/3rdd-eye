package B6;

import H6.C0672i;
import H6.C0675l;
import H6.L;
import N7.C1439yb;
import N7.Z;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes.dex */
public final class i implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0675l f538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f539c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1439yb f541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A7.d f542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f543g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C6.k f544h;
    public final /* synthetic */ C0672i i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z f545j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f546k;

    public i(C0675l c0675l, View view, View view2, C1439yb c1439yb, A7.d dVar, k kVar, C6.k kVar2, C0672i c0672i, Z z10, b bVar) {
        this.f538b = c0675l;
        this.f539c = view;
        this.f540d = view2;
        this.f541e = c1439yb;
        this.f542f = dVar;
        this.f543g = kVar;
        this.f544h = kVar2;
        this.i = c0672i;
        this.f545j = z10;
        this.f546k = bVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        view.removeOnLayoutChangeListener(this);
        Rect rect = new Rect();
        C0675l c0675l = this.f538b;
        c0675l.getWindowVisibleDisplayFrame(rect);
        View view2 = this.f539c;
        Point pointA = l.a(view2, this.f540d, this.f541e, this.f542f);
        int iMin = Math.min(view2.getWidth(), rect.width());
        int iMin2 = Math.min(view2.getHeight(), rect.height());
        int width = view2.getWidth();
        k kVar = this.f543g;
        if (iMin < width) {
            Q6.c cVarA = kVar.f553d.a(c0675l.getDivData(), c0675l.getDataTag());
            cVarA.f11320d.add(new Throwable("Tooltip width > screen size, width was changed"));
            cVarA.b();
        }
        if (iMin2 < view2.getHeight()) {
            Q6.c cVarA2 = kVar.f553d.a(c0675l.getDivData(), c0675l.getDataTag());
            cVarA2.f11320d.add(new Throwable("Tooltip height > screen size, height was changed"));
            cVarA2.b();
        }
        this.f544h.update(pointA.x, pointA.y, iMin, iMin2);
        Z z10 = this.f545j;
        b bVar = this.f546k;
        kVar.getClass();
        C0672i c0672i = this.i;
        C0675l c0675l2 = c0672i.f2146a;
        L l5 = kVar.f551b;
        A7.d dVar = c0672i.f2147b;
        L.j(l5, c0675l2, dVar, null, z10);
        L.j(l5, c0672i.f2146a, dVar, bVar, z10);
        kVar.f550a.getClass();
    }
}
