package H6;

import K6.C0713c;
import K6.C0732i0;
import K6.C0738k0;
import K6.C0748o0;
import K6.C0750p0;
import K6.C0752q0;
import K6.C0757t0;
import K6.C0759u0;
import K6.I1;
import K6.K1;
import K6.V0;
import K6.X0;
import K6.Z0;
import K6.v1;
import K6.x1;
import K6.y1;
import M6.w;
import N7.C1322q5;
import N7.C1333r3;
import N7.C1405w5;
import N7.G7;
import N7.S2;
import N7.U3;
import N7.Z;
import Q1.f;
import a9.InterfaceC1676a;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import c9.AbstractC2081b;
import c9.C2092m;
import c9.C2095p;
import c9.C2097r;
import i7.C4460a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k2.C5211b;
import r7.C5533d;
import z6.C5865d;

/* compiled from: DivBinder.kt */
/* renamed from: H6.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683u {

    /* renamed from: a, reason: collision with root package name */
    public final A f2235a;

    /* renamed from: b, reason: collision with root package name */
    public final y1 f2236b;

    /* renamed from: c, reason: collision with root package name */
    public final K6.S f2237c;

    /* renamed from: d, reason: collision with root package name */
    public final X0 f2238d;

    /* renamed from: e, reason: collision with root package name */
    public final C0752q0 f2239e;

    /* renamed from: f, reason: collision with root package name */
    public final C0738k0 f2240f;

    /* renamed from: g, reason: collision with root package name */
    public final C0750p0 f2241g;

    /* renamed from: h, reason: collision with root package name */
    public final L6.b f2242h;
    public final M6.i i;

    /* renamed from: j, reason: collision with root package name */
    public final N6.d f2243j;

    /* renamed from: k, reason: collision with root package name */
    public final v1 f2244k;

    /* renamed from: l, reason: collision with root package name */
    public final C0732i0 f2245l;

    /* renamed from: m, reason: collision with root package name */
    public final C0757t0 f2246m;

    /* renamed from: n, reason: collision with root package name */
    public final Z0 f2247n;

    /* renamed from: o, reason: collision with root package name */
    public final C0759u0 f2248o;

    /* renamed from: p, reason: collision with root package name */
    public final V0 f2249p;

    /* renamed from: q, reason: collision with root package name */
    public final I1 f2250q;

    /* renamed from: r, reason: collision with root package name */
    public final C5211b f2251r;

    /* renamed from: s, reason: collision with root package name */
    public final M6.w f2252s;

    /* renamed from: t, reason: collision with root package name */
    public final x1 f2253t;

    public C0683u(A a10, y1 y1Var, K6.S s10, X0 x02, C0752q0 c0752q0, C0738k0 c0738k0, C0750p0 c0750p0, L6.b bVar, M6.i iVar, N6.d dVar, v1 v1Var, C0732i0 c0732i0, C0757t0 c0757t0, Z0 z02, C0759u0 c0759u0, V0 v02, I1 i12, C5211b c5211b, M6.w wVar, x1 x1Var) {
        this.f2235a = a10;
        this.f2236b = y1Var;
        this.f2237c = s10;
        this.f2238d = x02;
        this.f2239e = c0752q0;
        this.f2240f = c0738k0;
        this.f2241g = c0750p0;
        this.f2242h = bVar;
        this.i = iVar;
        this.f2243j = dVar;
        this.f2244k = v1Var;
        this.f2245l = c0732i0;
        this.f2246m = c0757t0;
        this.f2247n = z02;
        this.f2248o = c0759u0;
        this.f2249p = v02;
        this.f2250q = i12;
        this.f2251r = c5211b;
        this.f2252s = wVar;
        this.f2253t = x1Var;
    }

    public final void a() {
        M6.w wVar = this.f2252s;
        LinkedHashMap linkedHashMap = wVar.f4307a;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            O6.t tVar = (O6.t) ((Map.Entry) it.next()).getValue();
            ArrayList arrayList = tVar.f10456f;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                tVar.getViewPager().f((f.e) it2.next());
            }
            arrayList.clear();
        }
        ArrayList arrayList2 = wVar.f4308b;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            w.a aVar = (w.a) it3.next();
            O6.t tVar2 = (O6.t) linkedHashMap.get(aVar.f4310b);
            if (tVar2 != null) {
                O6.s sVar = aVar.f4309a;
                sVar.getClass();
                O6.t tVar3 = sVar.f46164c;
                s7.h callback = sVar.f46166e;
                if (tVar3 != null) {
                    kotlin.jvm.internal.l.f(callback, "callback");
                    tVar3.f10456f.remove(callback);
                    tVar3.getViewPager().f(callback);
                }
                kotlin.jvm.internal.l.f(callback, "callback");
                tVar2.f10456f.add(callback);
                tVar2.getViewPager().a(callback);
                if (tVar2 == sVar.f46164c) {
                    continue;
                } else {
                    sVar.f46164c = tVar2;
                    if (tVar2.getViewPager().getAdapter() == null) {
                        throw new IllegalArgumentException("Attached pager adapter is null!");
                    }
                    s7.f fVar = sVar.f46163b;
                    if (fVar != null) {
                        sVar.a(fVar);
                    }
                    tVar2.setPagerOnItemsCountChange$div_release(new D7.c(sVar, 19));
                }
            }
        }
        linkedHashMap.clear();
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0672i parentContext, View view, Z div, C5865d c5865d) {
        Z div2;
        C5211b c5211b = this.f2251r;
        kotlin.jvm.internal.l.f(parentContext, "parentContext");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        try {
            C0672i c0672iG = T1.B.g(parentContext, div, c5865d);
            C0675l c0675l = c0672iG.f2146a;
            A7.d resolver = c0672iG.f2147b;
            T6.e currentRebindReusableList$div_release = c0675l.getCurrentRebindReusableList$div_release();
            if (currentRebindReusableList$div_release == null || currentRebindReusableList$div_release.b(div) == null) {
                A a10 = this.f2235a;
                kotlin.jvm.internal.l.f(resolver, "resolver");
                if (!a10.n(div, resolver).booleanValue()) {
                    C0713c.j(view, div.d().j(), resolver);
                    return;
                }
                c5211b.b(c0675l, resolver, view, div.d());
                if (!(div instanceof Z.b) && (div2 = ((O6.l) view).getDiv()) != null) {
                    c5211b.f(c0675l, resolver, view, div2.d());
                }
                if (div instanceof Z.p) {
                    this.f2236b.f(c0672iG, (O6.q) view, (Z.p) div);
                } else if (div instanceof Z.f) {
                    this.f2239e.f(c0672iG, (O6.n) view, (Z.f) div);
                } else if (div instanceof Z.d) {
                    this.f2240f.f(c0672iG, (O6.j) view, (Z.d) div);
                } else if (div instanceof Z.k) {
                    this.f2238d.f(c0672iG, (O6.x) view, (Z.k) div);
                } else if (div instanceof Z.a) {
                    c(c0672iG, view, (Z.a) div, c5865d);
                } else if (div instanceof Z.e) {
                    f(c0672iG, view, (Z.e) div, c5865d);
                } else if (div instanceof Z.c) {
                    e(c0672iG, view, (Z.c) div, c5865d);
                } else if (div instanceof Z.i) {
                    h(c0672iG, view, (Z.i) div, c5865d);
                } else if (div instanceof Z.o) {
                    j(c0672iG, view, (Z.o) div, c5865d);
                } else if (div instanceof Z.m) {
                    i(c0672iG, view, (Z.m) div, c5865d);
                } else if (div instanceof Z.b) {
                    d(c0672iG, view, (Z.b) div, c5865d);
                } else if (div instanceof Z.g) {
                    g(c0672iG, view, (Z.g) div);
                } else if (div instanceof Z.l) {
                    this.f2247n.g(c0672iG, (O6.y) view, (Z.l) div, c5865d);
                } else if (div instanceof Z.h) {
                    this.f2248o.g(c0672iG, (O6.p) view, (Z.h) div, c5865d);
                } else if (div instanceof Z.j) {
                    this.f2249p.g(c0672iG, (O6.w) view, (Z.j) div, c5865d);
                } else if (div instanceof Z.q) {
                    this.f2250q.g(c0672iG, (O6.D) view, (Z.q) div, c5865d);
                } else {
                    if (!(div instanceof Z.n)) {
                        throw new b9.j();
                    }
                    this.f2253t.g(c0672iG, (O6.B) view, (Z.n) div, c5865d);
                }
                C1992A c1992a = C1992A.f18074a;
                if (div instanceof Z.b) {
                    return;
                }
                c5211b.c(c0675l, resolver, view, div.d());
            }
        } catch (z7.d e4) {
            if (!com.google.gson.internal.c.a(e4)) {
                throw e4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(H6.C0672i r11, android.view.View r12, N7.Z.a r13, z6.C5865d r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.C0683u.c(H6.i, android.view.View, N7.Z$a, z6.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(H6.C0672i r11, android.view.View r12, N7.Z.b r13, z6.C5865d r14) {
        /*
            r10 = this;
            java.lang.String r0 = "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCustomWrapper"
            kotlin.jvm.internal.l.d(r12, r0)
            O6.h r12 = (O6.C1482h) r12
            K6.i0 r1 = r10.f2245l
            java.lang.String r0 = "div"
            kotlin.jvm.internal.l.f(r13, r0)
            android.view.View r6 = r12.getCustomView()
            N7.Z$b r0 = r12.getDiv()
            if (r0 != r13) goto L29
            a9.a<H6.u> r13 = r1.f3484f
            java.lang.Object r13 = r13.get()
            java.lang.String r14 = "divBinder.get()"
            kotlin.jvm.internal.l.e(r13, r14)
            H6.u r13 = (H6.C0683u) r13
            K6.C0713c.w(r12, r11, r13)
            return
        L29:
            k2.b r7 = r1.f3483e
            H6.l r3 = r11.f2146a
            if (r6 == 0) goto L42
            if (r0 == 0) goto L42
            H6.i r2 = r12.getBindingContext()
            if (r2 == 0) goto L42
            A7.d r2 = r2.f2147b
            if (r2 == 0) goto L42
            N7.S2 r4 = r0.d()
            r7.f(r3, r2, r6, r4)
        L42:
            K6.D r2 = r1.f3481c
            r2.f(r11, r12, r13, r0)
            java.lang.String r2 = "divView"
            kotlin.jvm.internal.l.f(r3, r2)
            r8 = 0
            r12.setTag(r8)
            r9 = -1
            r12.setId(r9)
            N7.R3 r2 = r13.f7814c
            java.lang.String r13 = r2.f6132j
            j6.m r4 = r1.f3482d
            boolean r13 = r4.isCustomTypeSupported(r13)
            if (r13 == 0) goto Le9
            if (r0 == 0) goto L65
            N7.R3 r13 = r0.f7814c
            goto L66
        L65:
            r13 = r8
        L66:
            K6.g0 r0 = new K6.g0
            A7.d r4 = r11.f2147b
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r14 = r0
            K6.h0 r0 = new K6.h0
            r0.<init>(r1, r2, r3, r4, r5)
            if (r6 == 0) goto La0
            N7.Z$b r1 = r12.getDiv()
            if (r1 == 0) goto L82
            N7.R3 r1 = r1.f7814c
            if (r1 == 0) goto L82
            java.lang.String r8 = r1.f6132j
        L82:
            java.lang.String r1 = r2.f6132j
            boolean r1 = kotlin.jvm.internal.l.b(r8, r1)
            if (r1 == 0) goto La0
            if (r13 == 0) goto La0
            java.util.List r13 = i7.C4460a.h(r13)
            int r13 = r13.size()
            java.util.List r1 = i7.C4460a.h(r2)
            int r1 = r1.size()
            if (r13 != r1) goto La0
            r13 = r6
            goto Lac
        La0:
            java.lang.Object r13 = r14.invoke()
            android.view.View r13 = (android.view.View) r13
            r14 = 2131362139(0x7f0a015b, float:1.834405E38)
            r13.setTag(r14, r2)
        Lac:
            boolean r14 = kotlin.jvm.internal.l.b(r6, r13)
            if (r14 != 0) goto Lca
            int r14 = r12.getChildCount()
            if (r14 == 0) goto Lc7
            O6.I r14 = r3.getReleaseViewVisitor$div_release()
            android.view.View r1 = L0.N.a(r12)
            t4.C5606d.I(r14, r1)
            r14 = 0
            r12.removeViewAt(r14)
        Lc7:
            r12.addView(r13)
        Lca:
            r0.invoke(r13)
            java.lang.String r12 = r2.f6138p
            if (r12 != 0) goto Ld2
            goto Lde
        Ld2:
            com.yandex.div.core.dagger.Div2ViewComponent r14 = r3.getViewComponent$div_release()
            H6.I r14 = r14.b()
            int r9 = r14.f(r12)
        Lde:
            r13.setTag(r12)
            r13.setId(r9)
            A7.d r11 = r11.f2147b
            r7.c(r3, r11, r13, r2)
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.C0683u.d(H6.i, android.view.View, N7.Z$b, z6.d):void");
    }

    public final void e(C0672i c0672i, View view, Z.c div, C5865d c5865d) {
        kotlin.jvm.internal.l.d(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivRecyclerView");
        O6.v vVar = (O6.v) view;
        L6.b bVar = this.f2242h;
        kotlin.jvm.internal.l.f(div, "div");
        Z.c div2 = vVar.getDiv();
        InterfaceC1676a<C0683u> interfaceC1676a = bVar.f4077e;
        if (div == div2) {
            RecyclerView.h adapter = vVar.getAdapter();
            L6.a aVar = adapter instanceof L6.a ? (L6.a) adapter : null;
            if (aVar == null) {
                return;
            }
            aVar.g(bVar.f4078f, c0672i);
            C0683u c0683u = interfaceC1676a.get();
            kotlin.jvm.internal.l.e(c0683u, "divBinder.get()");
            C0713c.w(vVar, c0672i, c0683u);
            return;
        }
        bVar.f4075c.f(c0672i, vVar, div, div2);
        C1322q5 c1322q5 = div.f7815c;
        C0748o0 c0748o0 = new C0748o0(bVar, vVar, c0672i, c1322q5, 5);
        A7.b<C1322q5.b> bVar2 = c1322q5.f8979x;
        A7.d dVar = c0672i.f2147b;
        vVar.b(bVar2.d(dVar, c0748o0));
        vVar.b(c1322q5.f8941D.d(dVar, c0748o0));
        vVar.b(c1322q5.f8940C.d(dVar, c0748o0));
        vVar.b(c1322q5.f8975t.d(dVar, c0748o0));
        vVar.b(c1322q5.f8981z.d(dVar, c0748o0));
        A7.b<Long> bVar3 = c1322q5.f8964h;
        if (bVar3 != null) {
            vVar.b(bVar3.d(dVar, c0748o0));
        }
        vVar.setRecycledViewPool(new K1(c0672i.f2146a.getReleaseViewVisitor$div_release()));
        vVar.setScrollingTouchSlop(1);
        vVar.setClipToPadding(false);
        vVar.setOverScrollMode(2);
        List<i7.b> listC = C4460a.c(c1322q5, dVar);
        C0683u c0683u2 = interfaceC1676a.get();
        kotlin.jvm.internal.l.e(c0683u2, "divBinder.get()");
        vVar.setAdapter(new L6.a(listC, c0672i, c0683u2, bVar.f4076d, c5865d));
        C1333r3 c1333r3 = c1322q5.f8974s;
        if (c1333r3 != null) {
            C0713c.u(c1333r3, dVar, new L6.c(vVar, c1333r3, c0672i));
        }
        RecyclerView.m itemAnimator = vVar.getItemAnimator();
        vVar.setItemAnimator(null);
        if (!C6.r.c(vVar) || vVar.isLayoutRequested()) {
            vVar.addOnLayoutChangeListener(new L6.d(vVar, itemAnimator));
        } else if (vVar.getItemAnimator() == null) {
            vVar.setItemAnimator(itemAnimator);
        }
        bVar.m(vVar, c0672i, c1322q5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(C0672i c0672i, View view, Z.e div, C5865d c5865d) {
        List<Z> list;
        List listG;
        kotlin.jvm.internal.l.d(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivGridLayout");
        O6.k kVar = (O6.k) view;
        C0750p0 c0750p0 = this.f2241g;
        kotlin.jvm.internal.l.f(div, "div");
        c0750p0.g(c0672i, kVar, div, c5865d);
        Z.e div2 = kVar.getDiv();
        C1405w5 c1405w5 = div2 != null ? div2.f7817c : null;
        List<Z> listI = C4460a.i(div.f7817c);
        A7.d dVar = c0672i.f2147b;
        ArrayList arrayListL = C4460a.l(listI, dVar);
        InterfaceC1676a<H> interfaceC1676a = c0750p0.f3576f;
        C0675l c0675l = c0672i.f2146a;
        A2.l.H(kVar, c0675l, arrayListL, interfaceC1676a);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i10 = 0;
        for (Object obj : listI) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C2092m.a0();
                throw null;
            }
            Z z10 = (Z) obj;
            String id = z10.d().getId();
            if (id == null || c0675l.getComplexRebindInProgress$div_release()) {
                listG = E.u.G(z10);
            } else {
                H7.e eVar = c0750p0.f3574d;
                eVar.getClass();
                ((B7.b) eVar.f2291b).a(c0675l.getDataTag(), id);
                listG = E.u.G(z10);
            }
            listG.size();
            C2095p.b0(listG, arrayList);
            i10 = i11;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i12 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            Z z11 = (Z) next;
            View childAt = kVar.getChildAt(i);
            S2 s2D = z11.d();
            C5865d c5865dU = C0713c.U(s2D, i, c5865d);
            childAt.setLayoutParams(new C5533d(-2, -2));
            c0750p0.f3575e.get().b(c0672i, childAt, z11, c5865dU);
            i7.k kVarW = A2.l.w(childAt);
            K6.D d10 = c0750p0.f3573c;
            d10.getClass();
            d10.d(childAt, s2D, null, dVar, kVarW);
            C0750p0.m(dVar, s2D, childAt);
            if (childAt instanceof i7.k) {
                p9.l<? super Long, C1992A> g10 = new K6.G(c0750p0, childAt, dVar, s2D);
                i7.k kVar2 = (i7.k) childAt;
                A7.b<Long> bVarG = s2D.g();
                kVar2.b(bVarG != null ? bVarG.d(dVar, g10) : null);
                A7.b<Long> bVarK = s2D.k();
                kVar2.b(bVarK != null ? bVarK.d(dVar, g10) : null);
            }
            if (C0713c.M(s2D)) {
                c0675l.q(childAt, z11);
            } else {
                c0675l.N(childAt);
            }
            i = i12;
        }
        C0713c.l0(kVar, c0675l, C4460a.l(arrayList, dVar), (c1405w5 == null || (list = c1405w5.f9719y) == null) ? null : C4460a.l(list, dVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16, types: [C6.l, T] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.internal.m, p9.l] */
    public final void g(C0672i c0672i, View view, Z.g div) {
        U3.a aVarI;
        kotlin.jvm.internal.l.d(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView");
        O6.s sVar = (O6.s) view;
        C0757t0 c0757t0 = this.f2246m;
        kotlin.jvm.internal.l.f(div, "div");
        C0675l c0675l = c0672i.f2146a;
        U3 divData = c0675l.getDivData();
        S2 s22 = null;
        Z z10 = (divData == null || (aVarI = c0675l.I(divData)) == null) ? null : aVarI.f6382a;
        if (z10 != null) {
            S2 s2D = div.d();
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C6.c cVarB = C6.d.a(z10, c0672i.f2147b).b(new B9.e(4, arrayList, wVar));
            Iterator<i7.b> it = new C6.c(cVarB.f929a, cVarB.f930b, cVarB.f931c, new y(3, arrayList, wVar)).iterator();
            int i = 0;
            while (true) {
                AbstractC2081b abstractC2081b = (AbstractC2081b) it;
                if (abstractC2081b.hasNext()) {
                    int i10 = i + 1;
                    if (i < 0) {
                        C2092m.a0();
                        throw null;
                    }
                    S2 s2D2 = ((i7.b) abstractC2081b.next()).f38460a.d();
                    if (s2D2 == s2D) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            C6.l lVar = (C6.l) it2.next();
                            G7 g72 = lVar.f950a;
                            if (g72 != null) {
                                linkedHashMap.put(g72, Integer.valueOf(lVar.f952c));
                            }
                        }
                        arrayList.clear();
                        wVar.f43660b = new C6.l(null);
                    }
                    if (s2D2 instanceof G7) {
                        G7 g73 = (G7) s2D2;
                        String str = div.f7819c.f5277A;
                        if (str == null || kotlin.jvm.internal.l.b(g73.f5360p, str)) {
                            T t10 = wVar.f43660b;
                            if (t10 != 0) {
                                linkedHashMap.put(s2D2, Integer.valueOf(((C6.l) t10).f952c));
                            } else {
                                arrayList.add(new C6.l((G7) s2D2));
                            }
                        }
                    }
                    i = i10;
                } else {
                    Integer num = (Integer) C2097r.x0(linkedHashMap.values());
                    if (num != null) {
                        int iIntValue = num.intValue();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (((Number) entry.getValue()).intValue() == iIntValue) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Set setKeySet = linkedHashMap2.keySet();
                        if (!setKeySet.isEmpty()) {
                            if (setKeySet.size() > 1) {
                                Log.w("SearchUtil", "Distance clash when searching for the nearest " + kotlin.jvm.internal.x.a(G7.class).d() + ". First found is taken");
                            }
                            s22 = (S2) C2097r.o0(setKeySet);
                        }
                    }
                    G7 g74 = (G7) s22;
                    if (g74 != null) {
                        M6.w wVar2 = c0757t0.f3635c;
                        wVar2.getClass();
                        wVar2.f4308b.add(new w.a(sVar, g74));
                    }
                }
            }
        }
        c0757t0.f(c0672i, sVar, div);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(H6.C0672i r20, android.view.View r21, N7.Z.i r22, z6.C5865d r23) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.C0683u.h(H6.i, android.view.View, N7.Z$i, z6.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(H6.C0672i r26, android.view.View r27, N7.Z.m r28, z6.C5865d r29) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.C0683u.i(H6.i, android.view.View, N7.Z$m, z6.d):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(H6.C0672i r24, android.view.View r25, N7.Z.o r26, z6.C5865d r27) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.C0683u.j(H6.i, android.view.View, N7.Z$o, z6.d):void");
    }
}
