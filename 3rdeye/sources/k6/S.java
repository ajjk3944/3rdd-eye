package K6;

import H6.C0672i;
import H6.C0675l;
import H6.C0683u;
import N7.C1362t4;
import N7.C1431y3;
import N7.C1447z5;
import N7.C9;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.H9;
import N7.K2;
import N7.S2;
import O6.C1483i;
import a9.InterfaceC1676a;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import b9.C1992A;
import c9.C2092m;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import t4.C5606d;
import z6.C5865d;

/* compiled from: DivContainerBinder.kt */
/* loaded from: classes.dex */
public final class S extends H6.B {

    /* renamed from: c, reason: collision with root package name */
    public final D f3320c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1676a<H6.H> f3321d;

    /* renamed from: e, reason: collision with root package name */
    public final H7.e f3322e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1676a<C0683u> f3323f;

    /* renamed from: g, reason: collision with root package name */
    public final Q6.d f3324g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f3325h;

    /* compiled from: DivContainerBinder.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3326a;

        static {
            int[] iArr = new int[C1431y3.b.values().length];
            try {
                iArr[C1431y3.b.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3326a = iArr;
        }
    }

    public S(D d10, InterfaceC1676a<H6.H> interfaceC1676a, H7.e eVar, InterfaceC1676a<C0683u> interfaceC1676a2, Q6.d dVar) {
        super(d10);
        this.f3320c = d10;
        this.f3321d = interfaceC1676a;
        this.f3322e = eVar;
        this.f3323f = interfaceC1676a2;
        this.f3324g = dVar;
        this.f3325h = new Rect();
    }

    public static final Rect m(S s10, C1362t4 c1362t4, Resources resources, A7.d dVar) {
        Rect rect = s10.f3325h;
        if (c1362t4 == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        DisplayMetrics metrics = resources.getDisplayMetrics();
        H9 h9A = c1362t4.f9222g.a(dVar);
        A7.b<Long> bVar = c1362t4.f9217b;
        A7.b<Long> bVar2 = c1362t4.f9220e;
        if (bVar2 == null && bVar == null) {
            Long lA = c1362t4.f9218c.a(dVar);
            kotlin.jvm.internal.l.e(metrics, "metrics");
            rect.left = C0713c.n0(lA, metrics, h9A);
            rect.right = C0713c.n0(c1362t4.f9219d.a(dVar), metrics, h9A);
        } else {
            if (resources.getConfiguration().getLayoutDirection() == 0) {
                Long lA2 = bVar2 != null ? bVar2.a(dVar) : null;
                kotlin.jvm.internal.l.e(metrics, "metrics");
                rect.left = C0713c.n0(lA2, metrics, h9A);
                rect.right = C0713c.n0(bVar != null ? bVar.a(dVar) : null, metrics, h9A);
            } else {
                Long lA3 = bVar != null ? bVar.a(dVar) : null;
                kotlin.jvm.internal.l.e(metrics, "metrics");
                rect.left = C0713c.n0(lA3, metrics, h9A);
                rect.right = C0713c.n0(bVar2 != null ? bVar2.a(dVar) : null, metrics, h9A);
            }
        }
        rect.top = C0713c.n0(c1362t4.f9221f.a(dVar), metrics, h9A);
        rect.bottom = C0713c.n0(c1362t4.f9216a.a(dVar), metrics, h9A);
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final int n(S s10, C1431y3.c cVar, A7.d dVar) {
        s10.getClass();
        if (cVar == null) {
            return 0;
        }
        boolean zBooleanValue = cVar.f9883c.a(dVar).booleanValue();
        ?? r12 = zBooleanValue;
        if (cVar.f9884d.a(dVar).booleanValue()) {
            r12 = (zBooleanValue ? 1 : 0) | 2;
        }
        return cVar.f9882b.a(dVar).booleanValue() ? r12 | 4 : r12;
    }

    public static void o(View view, C1431y3 c1431y3, S2 s22, A7.d dVar, A7.d dVar2) {
        A7.b<EnumC1305p2> bVarO = s22.o();
        EnumC1319q2 enumC1319q2Z = null;
        EnumC1305p2 enumC1305p2A = bVarO != null ? bVarO.a(dVar2) : C0713c.T(c1431y3, dVar) ? null : C0713c.Y(c1431y3.f9865o.a(dVar));
        A7.b<EnumC1319q2> bVarV = s22.v();
        if (bVarV != null) {
            enumC1319q2Z = bVarV.a(dVar2);
        } else if (!C0713c.T(c1431y3, dVar)) {
            enumC1319q2Z = C0713c.Z(c1431y3.f9866p.a(dVar));
        }
        C0713c.a(view, enumC1305p2A, enumC1319q2Z);
    }

    public static void r(C9 c92, S2 s22, Q6.c cVar, String str, String str2) {
        String strE;
        if (c92 instanceof C9.b) {
            String id = s22.getId();
            if (id == null || (strE = androidx.work.s.e(" with id='", id, '\'')) == null) {
                strE = "";
            }
            cVar.f11320d.add(new Throwable(String.format("Incorrect child size. Container with %s contains child%s with match_parent size along the %s axis.", Arrays.copyOf(new Object[]{str, strE, str2}, 3))));
            cVar.b();
        }
    }

    public final void p(ViewGroup viewGroup, C0672i c0672i, C1431y3 c1431y3, C1431y3 c1431y32, List<i7.b> list, List<i7.b> list2, C5865d c5865d, Q6.c cVar) {
        K2 k22;
        A2.l.H(viewGroup, c0672i.f2146a, list, this.f3321d);
        if (!(viewGroup instanceof C1483i)) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                S2 s2D = ((i7.b) it.next()).f38460a.d();
                boolean z10 = viewGroup instanceof O6.E;
                A7.d dVar = c0672i.f2147b;
                if (z10) {
                    if (C0713c.S(c1431y3, dVar)) {
                        r(s2D.getHeight(), s2D, cVar, "wrap layout mode", "cross");
                    } else {
                        r(s2D.getWidth(), s2D, cVar, "wrap layout mode", "cross");
                    }
                } else if (viewGroup instanceof O6.r) {
                    if (C0713c.S(c1431y3, dVar)) {
                        if (c1431y3.f9849Z instanceof C9.c) {
                            r(s2D.getWidth(), s2D, cVar, "wrap_content size", "main");
                        }
                    } else if ((c1431y3.f9872v instanceof C9.c) && ((k22 = c1431y3.i) == null || ((float) k22.f5615a.a(dVar).doubleValue()) == 0.0f)) {
                        r(s2D.getHeight(), s2D, cVar, "wrap_content size", "main");
                    }
                }
            }
        }
        s(viewGroup, c0672i, c1431y3, c1431y32, list, list2, c5865d);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011c  */
    @Override // H6.B
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.ViewGroup r19, H6.C0672i r20, N7.C1431y3 r21, N7.C1431y3 r22) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.S.d(android.view.ViewGroup, H6.i, N7.y3, N7.y3):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016f  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [j6.d] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r10v4, types: [i7.k] */
    /* JADX WARN: Type inference failed for: r17v2, types: [N7.S2] */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [A7.b] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [A7.b] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [j6.d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [O6.l] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r6v4, types: [N7.Z] */
    /* JADX WARN: Type inference failed for: r6v7, types: [H6.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(android.view.ViewGroup r19, H6.C0672i r20, N7.C1431y3 r21, N7.C1431y3 r22, java.util.List<i7.b> r23, java.util.List<i7.b> r24, z6.C5865d r25) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.S.s(android.view.ViewGroup, H6.i, N7.y3, N7.y3, java.util.List, java.util.List, z6.d):void");
    }

    public final void t(ViewGroup viewGroup, C0675l c0675l, List<i7.b> list, List<i7.b> list2) {
        Iterable iterableG;
        Object next;
        boolean zB;
        boolean zEquals;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<i7.b> list3 = list;
        C6.o oVar = new C6.o(viewGroup, 1);
        if (oVar.hasNext()) {
            Object next2 = oVar.next();
            if (oVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next2);
                while (oVar.hasNext()) {
                    arrayList.add(oVar.next());
                }
                iterableG = arrayList;
            } else {
                iterableG = E.u.G(next2);
            }
        } else {
            iterableG = C2099t.f18581b;
        }
        Iterable iterable = iterableG;
        Iterator<T> it = list3.iterator();
        Iterator it2 = iterable.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(C2092m.T(list3, 10), C2092m.T(iterable, 10)));
        while (it.hasNext() && it2.hasNext()) {
            linkedHashMap.put(((i7.b) it.next()).f38460a, (View) it2.next());
            arrayList2.add(C1992A.f18074a);
        }
        viewGroup.removeAllViews();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = list2.iterator();
        int i = 0;
        while (true) {
            Object obj = null;
            if (!it3.hasNext()) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    int iIntValue = ((Number) it4.next()).intValue();
                    i7.b bVar = list2.get(iIntValue);
                    Iterator it5 = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it5.next();
                            if (C6.e.d((N7.Z) next).equals(C6.e.d(bVar.f38460a))) {
                                break;
                            }
                        }
                    }
                    kotlin.jvm.internal.z.a(linkedHashMap);
                    View viewO = (View) linkedHashMap.remove((N7.Z) next);
                    if (viewO == null) {
                        viewO = this.f3321d.get().o(bVar.f38460a, bVar.f38461b);
                    }
                    viewGroup.addView(viewO, iIntValue);
                }
                Iterator it6 = linkedHashMap.values().iterator();
                while (it6.hasNext()) {
                    C5606d.I(c0675l.getReleaseViewVisitor$div_release(), (View) it6.next());
                }
                return;
            }
            Object next3 = it3.next();
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            i7.b bVar2 = (i7.b) next3;
            Iterator it7 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                Object next4 = it7.next();
                N7.Z z10 = (N7.Z) next4;
                if (C6.e.e(z10)) {
                    zEquals = C6.e.d(bVar2.f38460a).equals(C6.e.d(z10));
                } else {
                    N7.Z other = bVar2.f38460a;
                    kotlin.jvm.internal.l.f(other, "other");
                    A7.d resolver = bVar2.f38461b;
                    kotlin.jvm.internal.l.f(resolver, "resolver");
                    if (C6.e.d(z10).equals(C6.e.d(other))) {
                        S2 s2D = z10.d();
                        S2 s2D2 = other.d();
                        if ((s2D instanceof C1447z5) && (s2D2 instanceof C1447z5)) {
                            zB = kotlin.jvm.internal.l.b(((C1447z5) s2D).f10035B.a(resolver), ((C1447z5) s2D2).f10035B.a(resolver));
                        } else {
                            if (s2D.b() == s2D2.b()) {
                                zB = true;
                            }
                            zEquals = false;
                        }
                        zEquals = zB;
                    } else {
                        zEquals = false;
                    }
                }
                if (zEquals) {
                    obj = next4;
                    break;
                }
            }
            kotlin.jvm.internal.z.a(linkedHashMap);
            View view = (View) linkedHashMap.remove((N7.Z) obj);
            if (view != null) {
                viewGroup.addView(view);
            } else {
                arrayList3.add(Integer.valueOf(i));
            }
            i = i10;
        }
    }
}
