package N6;

import H6.C0672i;
import H6.C0683u;
import H6.H;
import H6.I;
import K6.C0713c;
import N7.C1175g0;
import N7.Z;
import O6.C;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import p7.InterfaceC5475g;
import y7.c;
import z6.C5865d;

/* compiled from: DivTabsAdapter.kt */
/* loaded from: classes.dex */
public final class c extends y7.c<a, ViewGroup, C1175g0> {

    /* renamed from: n, reason: collision with root package name */
    public final C f4686n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4687o;

    /* renamed from: p, reason: collision with root package name */
    public C0672i f4688p;

    /* renamed from: q, reason: collision with root package name */
    public final H f4689q;

    /* renamed from: r, reason: collision with root package name */
    public final C0683u f4690r;

    /* renamed from: s, reason: collision with root package name */
    public final o f4691s;

    /* renamed from: t, reason: collision with root package name */
    public final b f4692t;

    /* renamed from: u, reason: collision with root package name */
    public C5865d f4693u;

    /* renamed from: v, reason: collision with root package name */
    public final B7.b f4694v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f4695w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f4696x;

    /* renamed from: y, reason: collision with root package name */
    public final I f4697y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC5475g viewPool, C view, c.h hVar, y7.k kVar, boolean z10, C0672i c0672i, I textStyleProvider, H viewCreator, C0683u c0683u, o oVar, b bVar, C5865d c5865d, B7.b divPatchCache) {
        super(viewPool, view, hVar, kVar, textStyleProvider, oVar, oVar, bVar);
        kotlin.jvm.internal.l.f(viewPool, "viewPool");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(textStyleProvider, "textStyleProvider");
        kotlin.jvm.internal.l.f(viewCreator, "viewCreator");
        kotlin.jvm.internal.l.f(divPatchCache, "divPatchCache");
        this.f4686n = view;
        this.f4687o = z10;
        this.f4688p = c0672i;
        this.f4689q = viewCreator;
        this.f4690r = c0683u;
        this.f4691s = oVar;
        this.f4692t = bVar;
        this.f4693u = c5865d;
        this.f4694v = divPatchCache;
        this.f4695w = new LinkedHashMap();
        this.f4696x = new LinkedHashMap();
        y7.n mPager = this.f48208c;
        kotlin.jvm.internal.l.e(mPager, "mPager");
        this.f4697y = new I(mPager);
    }

    public final void b() {
        for (Map.Entry entry : this.f4695w.entrySet()) {
            ViewGroup viewGroup = (ViewGroup) entry.getKey();
            p pVar = (p) entry.getValue();
            int i = pVar.f4749a;
            LinkedHashMap linkedHashMap = this.f4696x;
            Integer numValueOf = Integer.valueOf(i);
            Object objU = linkedHashMap.get(numValueOf);
            Z z10 = pVar.f4750b;
            if (objU == null) {
                objU = C0713c.U(z10.d(), i, this.f4693u);
                linkedHashMap.put(numValueOf, objU);
            }
            C0672i c0672i = this.f4688p;
            View view = pVar.f4751c;
            this.f4690r.b(c0672i, view, z10, (C5865d) objU);
            viewGroup.requestLayout();
        }
    }

    public final void c(c.f<a> fVar, int i) {
        a(fVar, this.f4688p.f2147b, A2.l.w(this.f4686n));
        this.f4695w.clear();
        this.f48208c.setCurrentItem(i, true);
    }
}
