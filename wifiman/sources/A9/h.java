package A9;

import A9.i;
import C0.B;
import C0.C;
import C0.D;
import C0.InterfaceC2534n;
import C0.U;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.Q;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import sh.AbstractC7978m;
import zi.AbstractC8783m;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6839p f563a = A9.a.f549a.a();

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f564a;

        a(q qVar) {
            this.f564a = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1455575802, i10, -1, "com.ui.core.ui.component.layout.UiColumnWithDividers.<anonymous>.<anonymous>.<anonymous> (UiColumnWithDividers.kt:70)");
            }
            this.f564a.s(A9.b.f552a, interfaceC3540l, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f565a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f566b;

        b(List list, InterfaceC6839p interfaceC6839p) {
            this.f565a = list;
            this.f566b = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1400659551, i10, -1, "com.ui.core.ui.component.layout.UiColumnWithDividers.<anonymous>.<anonymous>.<anonymous> (UiColumnWithDividers.kt:80)");
            }
            h.f(this.f566b, this.f565a.size(), this.f565a, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f567a;

        c(InterfaceC6839p interfaceC6839p) {
            this.f567a = interfaceC6839p;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1864389806, i10, -1, "com.ui.core.ui.component.layout.UiColumnWithDividers.Dividers.<anonymous>.<anonymous>.<anonymous> (UiColumnWithDividers.kt:60)");
            }
            this.f567a.invoke(interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final void e(androidx.compose.ui.e eVar, final InterfaceC6839p interfaceC6839p, final q content, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        AbstractC6492s.i(content, "content");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1434977921);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(content) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (i14 != 0) {
                interfaceC6839p = f563a;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1434977921, i12, -1, "com.ui.core.ui.component.layout.UiColumnWithDividers (UiColumnWithDividers.kt:36)");
            }
            interfaceC3540lR.U(164765201);
            boolean z10 = ((i12 & 896) == 256) | ((i12 & 112) == 32);
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: A9.d
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return h.g(content, interfaceC6839p, (U) obj, (Y0.b) obj2);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            w.a(eVar, (InterfaceC6839p) objF, interfaceC3540lR, i12 & 14, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        final androidx.compose.ui.e eVar2 = eVar;
        final InterfaceC6839p interfaceC6839p2 = interfaceC6839p;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: A9.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return h.j(eVar2, interfaceC6839p2, content, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public static final void f(InterfaceC6839p interfaceC6839p, int i10, List list, InterfaceC3540l interfaceC3540l, int i11) {
        boolean z10;
        interfaceC3540l.U(806174756);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(806174756, i11, -1, "com.ui.core.ui.component.layout.UiColumnWithDividers.Dividers (UiColumnWithDividers.kt:41)");
        }
        int i12 = i10 - 1;
        ?? r14 = 0;
        int i13 = 0;
        while (i13 < i12) {
            boolean zBooleanValue = ((Boolean) list.get(i13)).booleanValue();
            int i14 = i13 + 1;
            Iterable iterableS = AbstractC7978m.s(i14, i10);
            if ((iterableS instanceof Collection) && ((Collection) iterableS).isEmpty()) {
                z10 = r14;
            } else {
                Iterator it = iterableS.iterator();
                while (it.hasNext()) {
                    if (((Boolean) list.get(((Q) it).d())).booleanValue()) {
                        z10 = true;
                        break;
                    }
                }
                z10 = r14;
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), r14);
            int iA = AbstractC3536j.a(interfaceC3540l, r14);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            AbstractC7385d.f(zBooleanValue && z10, aVar, androidx.compose.animation.g.m(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, 0.0f, 3, null)), androidx.compose.animation.g.y(null, null, false, null, 15, null).c(androidx.compose.animation.g.q(null, 0.0f, 3, null)), null, b0.c.e(-1864389806, true, new c(interfaceC6839p), interfaceC3540l, 54), interfaceC3540l, 200112, 16);
            interfaceC3540l.R();
            i13 = i14;
            r14 = 0;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D g(q qVar, InterfaceC6839p interfaceC6839p, U SubcomposeLayout, final Y0.b bVar) {
        Integer num;
        AbstractC6492s.i(SubcomposeLayout, "$this$SubcomposeLayout");
        List listQ1 = SubcomposeLayout.Q1(A9.c.MainContent, b0.c.c(-1455575802, true, new a(qVar)));
        final List listZ = AbstractC8783m.Z(AbstractC8783m.N(AbstractC3689v.d0(listQ1), new InterfaceC6835l() { // from class: A9.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return h.i(bVar, (B) obj);
            }
        }));
        List list = listZ;
        Iterator it = list.iterator();
        int iC0 = 0;
        while (it.hasNext()) {
            iC0 += ((t) it.next()).C0();
        }
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listQ1, 10));
        Iterator it2 = listQ1.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(l((B) it2.next())));
        }
        List listQ12 = SubcomposeLayout.Q1(A9.c.Dividers, b0.c.c(1400659551, true, new b(arrayList, interfaceC6839p)));
        final ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(listQ12, 10));
        Iterator it3 = listQ12.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((B) it3.next()).T(bVar.r()));
        }
        Iterator it4 = arrayList2.iterator();
        int iC02 = 0;
        while (it4.hasNext()) {
            iC02 += ((t) it4.next()).C0();
        }
        Iterator it5 = list.iterator();
        if (it5.hasNext()) {
            Integer numValueOf = Integer.valueOf(((t) it5.next()).I0());
            while (it5.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((t) it5.next()).I0());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        return m.x0(SubcomposeLayout, num != null ? num.intValue() : 0, iC0 + iC02, null, new InterfaceC6835l() { // from class: A9.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return h.h(listZ, arrayList2, (t.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(List list, List list2, t.a layout) {
        AbstractC6492s.i(layout, "$this$layout");
        int i10 = 0;
        int iC0 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            t tVar = (t) obj;
            t.a.h(layout, tVar, 0, iC0, 0.0f, 4, null);
            iC0 += tVar.C0();
            t tVar2 = (t) AbstractC3689v.t0(list2, i10);
            if (tVar2 != null) {
                t.a.h(layout, tVar2, 0, iC0, 0.0f, 4, null);
                iC0 += tVar2.C0();
            }
            i10 = i11;
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t i(Y0.b bVar, B it) {
        AbstractC6492s.i(it, "it");
        return it.T(bVar.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, interfaceC6839p, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    private static final boolean l(InterfaceC2534n interfaceC2534n) {
        Object objB = interfaceC2534n.b();
        i.b bVar = objB instanceof i.b ? (i.b) objB : null;
        if (bVar != null) {
            return bVar.a();
        }
        return true;
    }
}
