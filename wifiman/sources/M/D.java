package M;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class D {

    static final class a implements C0.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12071a = new a();

        /* renamed from: M.D$a$a, reason: collision with other inner class name */
        static final class C0479a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f12072a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0479a(List list) {
                super(1);
                this.f12072a = list;
            }

            public final void a(t.a aVar) {
                List list = this.f12072a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t.a.h(aVar, (androidx.compose.ui.layout.t) list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return Yg.J.f24997a;
            }
        }

        a() {
        }

        @Override // C0.C
        public final C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            Integer numValueOf = 0;
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((C0.B) list.get(i10)).T(j10));
            }
            int size2 = arrayList.size();
            Integer numValueOf2 = numValueOf;
            for (int i11 = 0; i11 < size2; i11++) {
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((androidx.compose.ui.layout.t) arrayList.get(i11)).I0()));
            }
            int iIntValue = numValueOf2.intValue();
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((androidx.compose.ui.layout.t) arrayList.get(i12)).C0()));
            }
            return androidx.compose.ui.layout.m.x0(mVar, iIntValue, numValueOf.intValue(), null, new C0479a(arrayList), 4, null);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f12073a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f12074b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12075c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f12076d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f12073a = eVar;
            this.f12074b = interfaceC6839p;
            this.f12075c = i10;
            this.f12076d = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            D.a(this.f12073a, this.f12074b, interfaceC3540l, L0.a(this.f12075c | 1), this.f12076d);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-2105228848);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2105228848, i12, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            a aVar = a.f12071a;
            int i14 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, aVar, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            interfaceC6839p.invoke(interfaceC3540lR, Integer.valueOf((i15 >> 6) & 14));
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(eVar, interfaceC6839p, i10, i11));
        }
    }
}
