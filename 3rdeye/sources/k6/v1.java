package K6;

import H6.C0672i;
import H6.C0675l;
import H6.C0683u;
import N7.C1332r2;
import N7.X9;
import a9.InterfaceC1676a;
import android.view.View;
import android.view.ViewGroup;
import c9.C2099t;
import j6.g;
import java.util.List;

/* compiled from: DivStateBinder.kt */
/* loaded from: classes.dex */
public final class v1 extends H6.B {

    /* renamed from: c, reason: collision with root package name */
    public final D f3659c;

    /* renamed from: d, reason: collision with root package name */
    public final H6.H f3660d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1676a<C0683u> f3661e;

    /* renamed from: f, reason: collision with root package name */
    public final E7.b f3662f;

    /* renamed from: g, reason: collision with root package name */
    public final Q6.d f3663g;

    /* renamed from: h, reason: collision with root package name */
    public final C0745n f3664h;
    public final C0719e i;

    /* renamed from: j, reason: collision with root package name */
    public final H7.e f3665j;

    /* renamed from: k, reason: collision with root package name */
    public final B7.b f3666k;

    /* renamed from: l, reason: collision with root package name */
    public final g.a f3667l;

    /* renamed from: m, reason: collision with root package name */
    public final H6.L f3668m;

    /* renamed from: n, reason: collision with root package name */
    public final Q6.d f3669n;

    /* renamed from: o, reason: collision with root package name */
    public final s6.h f3670o;

    /* renamed from: p, reason: collision with root package name */
    public final p6.d f3671p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(D d10, H6.H h10, InterfaceC1676a interfaceC1676a, E7.b divStateCache, Q6.d dVar, C0745n c0745n, C0719e c0719e, H7.e eVar, B7.b bVar, g.a div2Logger, H6.L l5, Q6.d dVar2, s6.h hVar, p6.d dVar3) {
        super(d10);
        kotlin.jvm.internal.l.f(divStateCache, "divStateCache");
        kotlin.jvm.internal.l.f(div2Logger, "div2Logger");
        this.f3659c = d10;
        this.f3660d = h10;
        this.f3661e = interfaceC1676a;
        this.f3662f = divStateCache;
        this.f3663g = dVar;
        this.f3664h = c0745n;
        this.i = c0719e;
        this.f3665j = eVar;
        this.f3666k = bVar;
        this.f3667l = div2Logger;
        this.f3668m = l5;
        this.f3669n = dVar2;
        this.f3670o = hVar;
        this.f3671p = dVar3;
    }

    public static K1.n m(C0672i c0672i, X9.a aVar, X9.a aVar2, View view, View view2) {
        C0672i c0672iK;
        List<C1332r2> listG;
        C1332r2 c1332r2 = aVar.f7745a;
        A7.d dVar = null;
        C1332r2 c1332r22 = aVar2.f7746b;
        if (c1332r2 == null && c1332r22 == null) {
            return null;
        }
        K1.n nVar = new K1.n();
        List<C1332r2> listG2 = C2099t.f18581b;
        if (c1332r2 != null && view != null) {
            A7.b<C1332r2.a> bVar = c1332r2.f9025e;
            A7.d dVar2 = c0672i.f2147b;
            if (bVar.a(dVar2) != C1332r2.a.SET) {
                listG = E.u.G(c1332r2);
            } else {
                listG = c1332r2.f9024d;
                if (listG == null) {
                    listG = listG2;
                }
            }
            for (C1332r2 c1332r23 : listG) {
                I6.i iVarA = w1.a(c1332r23, true, dVar2);
                if (iVarA != null) {
                    iVarA.f2984g.add(view);
                    iVarA.f2981d = c1332r23.f9021a.a(dVar2).longValue();
                    iVarA.f2980c = c1332r23.f9027g.a(dVar2).longValue();
                    iVarA.f2982e = C6.e.b(c1332r23.f9023c.a(dVar2));
                    nVar.M(iVarA);
                }
            }
        }
        if (view2 != null && (c0672iK = C0713c.K(view2)) != null) {
            dVar = c0672iK.f2147b;
        }
        if (c1332r22 != null && dVar != null) {
            if (c1332r22.f9025e.a(dVar) != C1332r2.a.SET) {
                listG2 = E.u.G(c1332r22);
            } else {
                List<C1332r2> list = c1332r22.f9024d;
                if (list != null) {
                    listG2 = list;
                }
            }
            for (C1332r2 c1332r24 : listG2) {
                I6.i iVarA2 = w1.a(c1332r24, false, dVar);
                if (iVarA2 != null) {
                    iVarA2.f2984g.add(view2);
                    iVarA2.f2981d = c1332r24.f9021a.a(dVar).longValue();
                    iVarA2.f2980c = c1332r24.f9027g.a(dVar).longValue();
                    iVarA2.f2982e = C6.e.b(c1332r24.f9023c.a(dVar));
                    nVar.M(iVarA2);
                }
            }
        }
        if (view2 != null) {
            view2.clearAnimation();
        }
        return nVar;
    }

    public final void n(View view, C0675l c0675l, A7.d dVar) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i10 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            N7.Z zN = c0675l.N(childAt);
            if (zN != null) {
                H6.L.j(this.f3668m, c0675l, dVar, null, zN);
            }
            n(childAt, c0675l, dVar);
            i = i10;
        }
    }
}
