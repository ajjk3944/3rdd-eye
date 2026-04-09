package Q;

import C0.B;
import C0.D;
import C0.U;
import Q.k;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.ui.layout.t;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import z.N;
import z.f0;
import z.h0;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final float f18856a = Y0.h.j(16);

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R.b f18857a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f18858b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(R.b bVar, f0 f0Var) {
            super(1);
            this.f18857a = bVar;
            this.f18858b = f0Var;
        }

        public final void a(f0 f0Var) {
            this.f18857a.f(h0.g(this.f18858b, f0Var));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((f0) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18859a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18860b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mh.q f18861c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18862d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18863e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ R.b f18864f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18865g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, InterfaceC6839p interfaceC6839p, mh.q qVar, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, R.b bVar, InterfaceC6839p interfaceC6839p4) {
            super(2);
            this.f18859a = i10;
            this.f18860b = interfaceC6839p;
            this.f18861c = qVar;
            this.f18862d = interfaceC6839p2;
            this.f18863e = interfaceC6839p3;
            this.f18864f = bVar;
            this.f18865g = interfaceC6839p4;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1979205334, i10, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
            }
            r.b(this.f18859a, this.f18860b, this.f18861c, this.f18862d, this.f18863e, this.f18864f, this.f18865g, interfaceC3540l, 0);
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

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f18866a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18867b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18868c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18869d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18870e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f18871f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f18872g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f18873h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ f0 f18874i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ mh.q f18875j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f18876k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f18877l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, InterfaceC6839p interfaceC6839p4, int i10, long j10, long j11, f0 f0Var, mh.q qVar, int i11, int i12) {
            super(2);
            this.f18866a = eVar;
            this.f18867b = interfaceC6839p;
            this.f18868c = interfaceC6839p2;
            this.f18869d = interfaceC6839p3;
            this.f18870e = interfaceC6839p4;
            this.f18871f = i10;
            this.f18872g = j10;
            this.f18873h = j11;
            this.f18874i = f0Var;
            this.f18875j = qVar;
            this.f18876k = i11;
            this.f18877l = i12;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            r.a(this.f18866a, this.f18867b, this.f18868c, this.f18869d, this.f18870e, this.f18871f, this.f18872g, this.f18873h, this.f18874i, this.f18875j, interfaceC3540l, L0.a(this.f18876k | 1), this.f18877l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18878a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18879b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18880c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18881d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f0 f18882e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18883f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mh.q f18884g;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f18885a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f18886b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f18887c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ List f18888d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ j f18889e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f18890f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f18891g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ f0 f18892h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ U f18893i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f18894j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f18895k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Integer f18896l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ List f18897m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Integer f18898n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, List list2, List list3, List list4, j jVar, int i10, int i11, f0 f0Var, U u10, int i12, int i13, Integer num, List list5, Integer num2) {
                super(1);
                this.f18885a = list;
                this.f18886b = list2;
                this.f18887c = list3;
                this.f18888d = list4;
                this.f18889e = jVar;
                this.f18890f = i10;
                this.f18891g = i11;
                this.f18892h = f0Var;
                this.f18893i = u10;
                this.f18894j = i12;
                this.f18895k = i13;
                this.f18896l = num;
                this.f18897m = list5;
                this.f18898n = num2;
            }

            public final void a(t.a aVar) {
                List list = this.f18885a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t.a.h(aVar, (androidx.compose.ui.layout.t) list.get(i10), 0, 0, 0.0f, 4, null);
                }
                List list2 = this.f18886b;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    t.a.h(aVar, (androidx.compose.ui.layout.t) list2.get(i11), 0, 0, 0.0f, 4, null);
                }
                List list3 = this.f18887c;
                int i12 = this.f18890f;
                int i13 = this.f18891g;
                f0 f0Var = this.f18892h;
                U u10 = this.f18893i;
                int i14 = this.f18894j;
                int i15 = this.f18895k;
                int size3 = list3.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    t.a.h(aVar, (androidx.compose.ui.layout.t) list3.get(i16), ((i12 - i13) / 2) + f0Var.d(u10, u10.getLayoutDirection()), i14 - i15, 0.0f, 4, null);
                }
                List list4 = this.f18888d;
                int i17 = this.f18894j;
                Integer num = this.f18896l;
                int size4 = list4.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    t.a.h(aVar, (androidx.compose.ui.layout.t) list4.get(i18), 0, i17 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                }
                j jVar = this.f18889e;
                if (jVar != null) {
                    List list5 = this.f18897m;
                    int i19 = this.f18894j;
                    Integer num2 = this.f18898n;
                    int size5 = list5.size();
                    for (int i20 = 0; i20 < size5; i20++) {
                        androidx.compose.ui.layout.t tVar = (androidx.compose.ui.layout.t) list5.get(i20);
                        int iB = jVar.b();
                        AbstractC6492s.f(num2);
                        t.a.h(aVar, tVar, iB, i19 - num2.intValue(), 0.0f, 4, null);
                    }
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return J.f24997a;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f0 f18899a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ U f18900b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f18901c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f18902d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List f18903e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Integer f18904f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ mh.q f18905g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(f0 f0Var, U u10, List list, int i10, List list2, Integer num, mh.q qVar) {
                super(2);
                this.f18899a = f0Var;
                this.f18900b = u10;
                this.f18901c = list;
                this.f18902d = i10;
                this.f18903e = list2;
                this.f18904f = num;
                this.f18905g = qVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                Integer num;
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1213360416, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                }
                N nF = h0.f(this.f18899a, this.f18900b);
                this.f18905g.s(androidx.compose.foundation.layout.o.d(androidx.compose.foundation.layout.o.g(nF, this.f18900b.getLayoutDirection()), this.f18901c.isEmpty() ? nF.d() : this.f18900b.x(this.f18902d), androidx.compose.foundation.layout.o.f(nF, this.f18900b.getLayoutDirection()), (this.f18903e.isEmpty() || (num = this.f18904f) == null) ? nF.c() : this.f18900b.x(num.intValue())), interfaceC3540l, 0);
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

        static final class c extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f18906a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC6839p interfaceC6839p) {
                super(2);
                this.f18906a = interfaceC6839p;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-2146438447, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                }
                this.f18906a.invoke(interfaceC3540l, 0);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, int i10, f0 f0Var, InterfaceC6839p interfaceC6839p4, mh.q qVar) {
            super(2);
            this.f18878a = interfaceC6839p;
            this.f18879b = interfaceC6839p2;
            this.f18880c = interfaceC6839p3;
            this.f18881d = i10;
            this.f18882e = f0Var;
            this.f18883f = interfaceC6839p4;
            this.f18884g = qVar;
        }

        public final D a(U u10, long j10) {
            Object obj;
            Object obj2;
            Object obj3;
            j jVar;
            Object obj4;
            Integer numValueOf;
            int iA;
            int iB;
            Object obj5;
            Object obj6;
            int iX1;
            int iX12;
            int iL = Y0.b.l(j10);
            int iK = Y0.b.k(j10);
            long jD = Y0.b.d(j10, 0, 0, 0, 0, 10, null);
            List listQ1 = u10.Q1(s.TopBar, this.f18878a);
            ArrayList arrayList = new ArrayList(listQ1.size());
            int size = listQ1.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((B) listQ1.get(i10)).T(jD));
            }
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int iC0 = ((androidx.compose.ui.layout.t) obj).C0();
                int iN = AbstractC3689v.n(arrayList);
                if (1 <= iN) {
                    int i11 = 1;
                    while (true) {
                        Object obj7 = arrayList.get(i11);
                        int iC02 = ((androidx.compose.ui.layout.t) obj7).C0();
                        if (iC0 < iC02) {
                            obj = obj7;
                            iC0 = iC02;
                        }
                        if (i11 == iN) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            androidx.compose.ui.layout.t tVar = (androidx.compose.ui.layout.t) obj;
            int iC03 = tVar != null ? tVar.C0() : 0;
            List listQ12 = u10.Q1(s.Snackbar, this.f18879b);
            f0 f0Var = this.f18882e;
            ArrayList arrayList2 = new ArrayList(listQ12.size());
            int size2 = listQ12.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(((B) listQ12.get(i12)).T(Y0.c.n(jD, (-f0Var.d(u10, u10.getLayoutDirection())) - f0Var.a(u10, u10.getLayoutDirection()), -f0Var.b(u10))));
            }
            if (arrayList2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList2.get(0);
                int iC04 = ((androidx.compose.ui.layout.t) obj2).C0();
                int iN2 = AbstractC3689v.n(arrayList2);
                if (1 <= iN2) {
                    Object obj8 = obj2;
                    int i13 = iC04;
                    int i14 = 1;
                    while (true) {
                        Object obj9 = arrayList2.get(i14);
                        int iC05 = ((androidx.compose.ui.layout.t) obj9).C0();
                        if (i13 < iC05) {
                            obj8 = obj9;
                            i13 = iC05;
                        }
                        if (i14 == iN2) {
                            break;
                        }
                        i14++;
                    }
                    obj2 = obj8;
                }
            }
            androidx.compose.ui.layout.t tVar2 = (androidx.compose.ui.layout.t) obj2;
            int iC06 = tVar2 != null ? tVar2.C0() : 0;
            if (arrayList2.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList2.get(0);
                int iI0 = ((androidx.compose.ui.layout.t) obj3).I0();
                int iN3 = AbstractC3689v.n(arrayList2);
                if (1 <= iN3) {
                    Object obj10 = obj3;
                    int i15 = iI0;
                    int i16 = 1;
                    while (true) {
                        Object obj11 = arrayList2.get(i16);
                        int iI02 = ((androidx.compose.ui.layout.t) obj11).I0();
                        if (i15 < iI02) {
                            obj10 = obj11;
                            i15 = iI02;
                        }
                        if (i16 == iN3) {
                            break;
                        }
                        i16++;
                    }
                    obj3 = obj10;
                }
            }
            androidx.compose.ui.layout.t tVar3 = (androidx.compose.ui.layout.t) obj3;
            int iI03 = tVar3 != null ? tVar3.I0() : 0;
            List listQ13 = u10.Q1(s.Fab, this.f18880c);
            f0 f0Var2 = this.f18882e;
            ArrayList arrayList3 = new ArrayList(listQ13.size());
            int size3 = listQ13.size();
            int i17 = 0;
            while (i17 < size3) {
                List list = listQ13;
                int i18 = size3;
                f0 f0Var3 = f0Var2;
                androidx.compose.ui.layout.t tVarT = ((B) listQ13.get(i17)).T(Y0.c.n(jD, (-f0Var2.d(u10, u10.getLayoutDirection())) - f0Var2.a(u10, u10.getLayoutDirection()), -f0Var2.b(u10)));
                if (tVarT.C0() == 0 || tVarT.I0() == 0) {
                    tVarT = null;
                }
                if (tVarT != null) {
                    arrayList3.add(tVarT);
                }
                i17++;
                f0Var2 = f0Var3;
                listQ13 = list;
                size3 = i18;
            }
            if (arrayList3.isEmpty()) {
                jVar = null;
            } else {
                if (arrayList3.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList3.get(0);
                    int iI04 = ((androidx.compose.ui.layout.t) obj5).I0();
                    int iN4 = AbstractC3689v.n(arrayList3);
                    if (1 <= iN4) {
                        Object obj12 = obj5;
                        int i19 = iI04;
                        int i20 = 1;
                        while (true) {
                            Object obj13 = arrayList3.get(i20);
                            int iI05 = ((androidx.compose.ui.layout.t) obj13).I0();
                            if (i19 < iI05) {
                                obj12 = obj13;
                                i19 = iI05;
                            }
                            if (i20 == iN4) {
                                break;
                            }
                            i20++;
                        }
                        obj5 = obj12;
                    }
                }
                AbstractC6492s.f(obj5);
                int iI06 = ((androidx.compose.ui.layout.t) obj5).I0();
                if (arrayList3.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList3.get(0);
                    int iC07 = ((androidx.compose.ui.layout.t) obj6).C0();
                    int iN5 = AbstractC3689v.n(arrayList3);
                    if (1 <= iN5) {
                        Object obj14 = obj6;
                        int i21 = iC07;
                        int i22 = 1;
                        while (true) {
                            Object obj15 = arrayList3.get(i22);
                            Object obj16 = obj14;
                            int iC08 = ((androidx.compose.ui.layout.t) obj15).C0();
                            if (i21 < iC08) {
                                i21 = iC08;
                                obj14 = obj15;
                            } else {
                                obj14 = obj16;
                            }
                            if (i22 == iN5) {
                                break;
                            }
                            i22++;
                        }
                        obj6 = obj14;
                    }
                }
                AbstractC6492s.f(obj6);
                int iC09 = ((androidx.compose.ui.layout.t) obj6).C0();
                int i23 = this.f18881d;
                k.a aVar = k.f18834a;
                if (!k.e(i23, aVar.c())) {
                    if (!(k.e(i23, aVar.a()) ? true : k.e(i23, aVar.b()))) {
                        iX1 = (iL - iI06) / 2;
                    } else if (u10.getLayoutDirection() == Y0.t.Ltr) {
                        iX12 = u10.x1(r.f18856a);
                        iX1 = (iL - iX12) - iI06;
                    } else {
                        iX1 = u10.x1(r.f18856a);
                    }
                    jVar = new j(iX1, iI06, iC09);
                } else if (u10.getLayoutDirection() == Y0.t.Ltr) {
                    iX1 = u10.x1(r.f18856a);
                    jVar = new j(iX1, iI06, iC09);
                } else {
                    iX12 = u10.x1(r.f18856a);
                    iX1 = (iL - iX12) - iI06;
                    jVar = new j(iX1, iI06, iC09);
                }
            }
            List listQ14 = u10.Q1(s.BottomBar, b0.c.c(-2146438447, true, new c(this.f18883f)));
            ArrayList arrayList4 = new ArrayList(listQ14.size());
            int size4 = listQ14.size();
            for (int i24 = 0; i24 < size4; i24++) {
                arrayList4.add(((B) listQ14.get(i24)).T(jD));
            }
            if (arrayList4.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList4.get(0);
                int iC010 = ((androidx.compose.ui.layout.t) obj4).C0();
                int iN6 = AbstractC3689v.n(arrayList4);
                if (1 <= iN6) {
                    int i25 = 1;
                    while (true) {
                        Object obj17 = arrayList4.get(i25);
                        int iC011 = ((androidx.compose.ui.layout.t) obj17).C0();
                        if (iC010 < iC011) {
                            iC010 = iC011;
                            obj4 = obj17;
                        }
                        if (i25 == iN6) {
                            break;
                        }
                        i25++;
                    }
                }
            }
            androidx.compose.ui.layout.t tVar4 = (androidx.compose.ui.layout.t) obj4;
            Integer numValueOf2 = tVar4 != null ? Integer.valueOf(tVar4.C0()) : null;
            if (jVar != null) {
                int i26 = this.f18881d;
                f0 f0Var4 = this.f18882e;
                if (numValueOf2 == null || k.e(i26, k.f18834a.b())) {
                    iA = jVar.a() + u10.x1(r.f18856a);
                    iB = f0Var4.b(u10);
                } else {
                    iA = numValueOf2.intValue() + jVar.a();
                    iB = u10.x1(r.f18856a);
                }
                numValueOf = Integer.valueOf(iA + iB);
            } else {
                numValueOf = null;
            }
            int iIntValue = iC06 != 0 ? iC06 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : this.f18882e.b(u10)) : 0;
            int i27 = iI03;
            List listQ15 = u10.Q1(s.MainContent, b0.c.c(-1213360416, true, new b(this.f18882e, u10, arrayList, iC03, arrayList4, numValueOf2, this.f18884g)));
            ArrayList arrayList5 = new ArrayList(listQ15.size());
            int size5 = listQ15.size();
            for (int i28 = 0; i28 < size5; i28++) {
                arrayList5.add(((B) listQ15.get(i28)).T(jD));
            }
            return androidx.compose.ui.layout.m.x0(u10, iL, iK, null, new a(arrayList5, arrayList, arrayList2, arrayList4, jVar, iL, i27, this.f18882e, u10, iK, iIntValue, numValueOf2, arrayList3, numValueOf), 4, null);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((U) obj, ((Y0.b) obj2).r());
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18907a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18908b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mh.q f18909c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18910d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18911e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f18912f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18913g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f18914h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, InterfaceC6839p interfaceC6839p, mh.q qVar, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, f0 f0Var, InterfaceC6839p interfaceC6839p4, int i11) {
            super(2);
            this.f18907a = i10;
            this.f18908b = interfaceC6839p;
            this.f18909c = qVar;
            this.f18910d = interfaceC6839p2;
            this.f18911e = interfaceC6839p3;
            this.f18912f = f0Var;
            this.f18913g = interfaceC6839p4;
            this.f18914h = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            r.b(this.f18907a, this.f18908b, this.f18909c, this.f18910d, this.f18911e, this.f18912f, this.f18913g, interfaceC3540l, L0.a(this.f18914h | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r29, mh.InterfaceC6839p r30, mh.InterfaceC6839p r31, mh.InterfaceC6839p r32, mh.InterfaceC6839p r33, int r34, long r35, long r37, z.f0 r39, mh.q r40, T.InterfaceC3540l r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.r.a(androidx.compose.ui.e, mh.p, mh.p, mh.p, mh.p, int, long, long, z.f0, mh.q, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(int i10, InterfaceC6839p interfaceC6839p, mh.q qVar, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, f0 f0Var, InterfaceC6839p interfaceC6839p4, InterfaceC3540l interfaceC3540l, int i11) {
        int i12;
        int i13;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-975511942);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3540lR.i(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC3540lR.l(qVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p3) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= interfaceC3540lR.T(f0Var) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((i12 & 599187) == 599186 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-975511942, i12, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            boolean z10 = ((i12 & 112) == 32) | ((i12 & 7168) == 2048) | ((458752 & i12) == 131072) | ((57344 & i12) == 16384) | ((i12 & 14) == 4) | ((3670016 & i12) == 1048576) | ((i12 & 896) == 256);
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                i13 = 1;
                objF = new d(interfaceC6839p, interfaceC6839p2, interfaceC6839p3, i10, f0Var, interfaceC6839p4, qVar);
                interfaceC3540lR.K(objF);
            } else {
                i13 = 1;
            }
            androidx.compose.ui.layout.w.a(null, (InterfaceC6839p) objF, interfaceC3540lR, 0, i13);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new e(i10, interfaceC6839p, qVar, interfaceC6839p2, interfaceC6839p3, f0Var, interfaceC6839p4, i11));
        }
    }
}
