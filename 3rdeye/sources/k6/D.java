package K6;

import H6.C0675l;
import H6.C0682t;
import I6.f;
import N7.C1130d0;
import N7.C1412wc;
import N7.C9;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.EnumC1356sc;
import N7.F2;
import N7.S2;
import N7.Ub;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import b9.C1992A;
import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k6.C5246y;

/* compiled from: DivBaseBinder.kt */
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final C0762w f3196a;

    /* renamed from: b, reason: collision with root package name */
    public final C0735j0 f3197b;

    /* renamed from: c, reason: collision with root package name */
    public final C0682t f3198c;

    /* compiled from: DivBaseBinder.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3199a;

        static {
            int[] iArr = new int[EnumC1356sc.values().length];
            try {
                iArr[EnumC1356sc.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1356sc.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1356sc.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3199a = iArr;
        }
    }

    /* compiled from: DivBaseBinder.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ View f3200g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Object f3201h;
        public final /* synthetic */ A7.d i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(A7.d dVar, S2 s22, View view) {
            super(1);
            this.f3200g = view;
            this.f3201h = s22;
            this.i = dVar;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [N7.S2, java.lang.Object] */
        @Override // p9.l
        public final C1992A invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            C0713c.o(this.f3200g, this.f3201h.l(), this.i);
            return C1992A.f18074a;
        }
    }

    public D(C0762w c0762w, B6.k kVar, C0735j0 c0735j0, C0682t c0682t) {
        this.f3196a = c0762w;
        this.f3197b = c0735j0;
        this.f3198c = c0682t;
    }

    public static void b(View view, C0675l c0675l, S2 s22, A7.d dVar, boolean z10) {
        int i;
        int i10 = 4;
        I6.f divTransitionHandler$div_release = c0675l.getDivTransitionHandler$div_release();
        int i11 = a.f3199a[s22.getVisibility().a(dVar).ordinal()];
        if (i11 == 1) {
            i = 0;
        } else if (i11 == 2) {
            i = 4;
        } else {
            if (i11 != 3) {
                throw new b9.j();
            }
            i = 8;
        }
        if (i != 0) {
            view.clearAnimation();
        }
        int visibility = view.getVisibility();
        List<Ub> listM = s22.m();
        K1.i iVarB = null;
        if (listM == null || listM.contains(Ub.VISIBILITY_CHANGE)) {
            divTransitionHandler$div_release.getClass();
            f.a.C0044a c0044a = (f.a.C0044a) C2097r.w0(I6.f.b(view, divTransitionHandler$div_release.f2526b));
            if (c0044a == null && (c0044a = (f.a.C0044a) C2097r.w0(I6.f.b(view, divTransitionHandler$div_release.f2527c))) == null) {
                c0044a = null;
            }
            if (c0044a != null) {
                visibility = c0044a.f2529a;
            }
            H6.z zVarM = c0675l.getViewComponent$div_release().m();
            if ((visibility == 4 || visibility == 8) && i == 0) {
                F2 f2W = s22.w();
                if (f2W != null) {
                    iVarB = zVarM.b(f2W, 1, dVar);
                }
            } else if ((i == 4 || i == 8) && visibility == 0 && !z10) {
                F2 f2B = s22.B();
                if (f2B != null) {
                    iVarB = zVarM.b(f2B, 2, dVar);
                }
            } else if (c0044a != null) {
                K1.m.b(c0675l);
            }
            if (iVarB != null) {
                iVarB.d(view);
            }
        }
        if (iVarB != null) {
            f.a.C0044a c0044a2 = new f.a.C0044a(i);
            divTransitionHandler$div_release.getClass();
            divTransitionHandler$div_release.f2526b.add(new f.b(iVarB, view, C2092m.X(c0044a2), new ArrayList()));
            if (!divTransitionHandler$div_release.f2528d) {
                divTransitionHandler$div_release.f2528d = true;
                divTransitionHandler$div_release.f2525a.post(new C.g0(divTransitionHandler$div_release, i10));
            }
        } else {
            view.setVisibility(i);
        }
        c0675l.L();
    }

    public static void e(View view, S2 s22, S2 s23, A7.d dVar, i7.k kVar) {
        if (view instanceof O6.t) {
            return;
        }
        if (C6.b.d(s22.l(), s23 != null ? s23.l() : null)) {
            return;
        }
        C0713c.o(view, s22.l(), dVar);
        if (C6.b.n(s22.l())) {
            return;
        }
        C6.g.c(kVar, s22.l(), dVar, new b(dVar, s22, view));
    }

    public static C1412wc.a g(C9 c92) {
        C1412wc c1412wc;
        C9.c cVar = c92 instanceof C9.c ? (C9.c) c92 : null;
        if (cVar == null || (c1412wc = cVar.f5045b) == null) {
            return null;
        }
        return c1412wc.f9738b;
    }

    public static C1412wc.a h(C9 c92) {
        C1412wc c1412wc;
        C9.c cVar = c92 instanceof C9.c ? (C9.c) c92 : null;
        if (cVar == null || (c1412wc = cVar.f5045b) == null) {
            return null;
        }
        return c1412wc.f9739c;
    }

    public static void i(C0675l c0675l, DisplayMetrics displayMetrics, String str, Q0 q02, int i, int i10, int i11, int i12, A7.d dVar) {
        int i13;
        if (str == null || str.length() == 0 || (i13 = i10 - i) == i12 - i11) {
            return;
        }
        if (q02.f3313b.contains(str)) {
            C5246y.d(c0675l, new Throwable("Size subscriber affects original view size. Relayout was prevented."));
            return;
        }
        Map<A7.d, Map<String, Integer>> layoutSizes$div_release = c0675l.getLayoutSizes$div_release();
        Map<String, Integer> linkedHashMap = layoutSizes$div_release.get(dVar);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            layoutSizes$div_release.put(dVar, linkedHashMap);
        }
        Map<String, Integer> map = linkedHashMap;
        Integer numValueOf = Integer.valueOf(i13);
        map.put(str, Integer.valueOf(com.google.gson.internal.c.y(Build.VERSION.SDK_INT >= 34 ? TypedValue.deriveDimension(1, numValueOf.floatValue(), displayMetrics) : numValueOf.floatValue() / displayMetrics.density)));
    }

    public final void a(View view, C0675l divView, S2 s22, C1130d0.a aVar) {
        char c10;
        C0682t c0682t = this.f3198c;
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(divView, "divView");
        if (c0682t.f2226a) {
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            C1130d0.a aVar2 = view2 != null ? divView.f2158B.get(view2) : null;
            if (aVar2 == null) {
                if (aVar == null) {
                    aVar = C0682t.d(s22);
                }
                C0682t.b(view, aVar, divView, false);
                return;
            }
            if (aVar == null) {
                aVar = C0682t.d(s22);
            }
            int[] iArr = C0682t.b.f2229b;
            int i = iArr[aVar2.ordinal()];
            char c11 = 2;
            if (i == 1) {
                c10 = 0;
            } else if (i == 2) {
                c10 = 1;
            } else {
                if (i != 3) {
                    throw new b9.j();
                }
                c10 = 2;
            }
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 1) {
                c11 = 0;
            } else if (i10 == 2) {
                c11 = 1;
            } else if (i10 != 3) {
                throw new b9.j();
            }
            if (c10 < c11) {
                aVar = aVar2;
            }
            C0682t.b(view, aVar, divView, aVar2 == aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r18, H6.C0672i r19, N7.S2 r20, N7.S2 r21, i7.k r22, android.graphics.drawable.Drawable r23) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.D.c(android.view.View, H6.i, N7.S2, N7.S2, i7.k, android.graphics.drawable.Drawable):void");
    }

    public final void d(View view, S2 s22, S2 s23, A7.d dVar, i7.k kVar) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        }
        if (!C6.b.j(s22.getWidth(), s23 != null ? s23.getWidth() : null)) {
            C0713c.r(dVar, s22, view);
            C0713c.g(view, C0713c.Q(s22.getWidth(), dVar));
            C0713c.n(view, h(s22.getWidth()), dVar);
            C0713c.l(view, g(s22.getWidth()), dVar);
            if (!C6.b.r(s22.getWidth())) {
                C6.g.i(kVar, s22.getWidth(), dVar, new O(view, s22, dVar, this));
            }
        }
        if (!C6.b.j(s22.getHeight(), s23 != null ? s23.getHeight() : null)) {
            C0713c.f(dVar, s22, view);
            C0713c.q(view, C0713c.Q(s22.getHeight(), dVar));
            C0713c.m(view, h(s22.getHeight()), dVar);
            C0713c.k(view, g(s22.getHeight()), dVar);
            if (!C6.b.r(s22.getHeight())) {
                C6.g.i(kVar, s22.getHeight(), dVar, new H(view, s22, dVar, this));
            }
        }
        if (!C6.b.d(s22.j(), s23 != null ? s23.j() : null)) {
            C0713c.j(view, s22.j(), dVar);
            if (!C6.b.n(s22.j())) {
                C6.g.c(kVar, s22.j(), dVar, new I(view, s22, dVar, 0));
            }
        }
        if (A2.l.s(s22.o(), s23 != null ? s23.o() : null)) {
            if (A2.l.s(s22.v(), s23 != null ? s23.v() : null)) {
                return;
            }
        }
        A7.b<EnumC1305p2> bVarO = s22.o();
        EnumC1305p2 enumC1305p2A = bVarO != null ? bVarO.a(dVar) : null;
        A7.b<EnumC1319q2> bVarV = s22.v();
        C0713c.a(view, enumC1305p2A, bVarV != null ? bVarV.a(dVar) : null);
        if (A2.l.A(s22.o()) && A2.l.A(s22.v())) {
            return;
        }
        G g10 = new G(view, s22, dVar, 0);
        A7.b<EnumC1305p2> bVarO2 = s22.o();
        kVar.b(bVarO2 != null ? bVarO2.d(dVar, g10) : null);
        A7.b<EnumC1319q2> bVarV2 = s22.v();
        kVar.b(bVarV2 != null ? bVarV2.d(dVar, g10) : null);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public final void f(H6.C0672i r21, android.view.View r22, N7.Z r23, N7.Z r24) {
        /*
            Method dump skipped, instructions count: 1883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.D.f(H6.i, android.view.View, N7.Z, N7.Z):void");
    }
}
