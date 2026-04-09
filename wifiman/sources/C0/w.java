package C0;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.Z0;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public abstract class w {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2159a = new a();

        a() {
            super(1);
        }

        public final void a(E0.G g10) {
            g10.A1(true);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((E0.G) obj);
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f2160a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f2161b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C f2162c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2163d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2164e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, C c10, int i10, int i11) {
            super(2);
            this.f2160a = eVar;
            this.f2161b = interfaceC6839p;
            this.f2162c = c10;
            this.f2163d = i10;
            this.f2164e = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            w.a(this.f2160a, this.f2161b, this.f2162c, interfaceC3540l, L0.a(this.f2163d | 1), this.f2164e);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f2165a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list) {
            super(2);
            this.f2165a = list;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1953651383, i10, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:182)");
            }
            List list = this.f2165a;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC6839p interfaceC6839p = (InterfaceC6839p) list.get(i11);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
                InterfaceC6824a interfaceC6824aI = aVar.i();
                if (interfaceC3540l.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540l.u();
                if (interfaceC3540l.o()) {
                    interfaceC3540l.D(interfaceC6824aI);
                } else {
                    interfaceC3540l.I();
                }
                InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
                InterfaceC6839p interfaceC6839pB = aVar.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                interfaceC6839p.invoke(interfaceC3540l, 0);
                interfaceC3540l.R();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f2166a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.e eVar) {
            super(3);
            this.f2166a = eVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, InterfaceC3540l interfaceC3540l2, int i10) {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-55743822, i10, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:228)");
            }
            int iA = AbstractC3536j.a(interfaceC3540l2, 0);
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC3540l2, this.f2166a);
            interfaceC3540l.e(509942095);
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            E1.c(interfaceC3540lA, eVarF, aVar.f());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            interfaceC3540l.P();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a(((Z0) obj).f(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, C c10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1949933075);
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
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(c10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1949933075, i12, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:248)");
            }
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            InterfaceC6824a interfaceC6824aA = E0.G.f3617X.a();
            int i14 = ((i12 << 3) & 896) | 6;
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
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            E1.c(interfaceC3540lA, c10, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            E1.b(interfaceC3540lA, a.f2159a);
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            interfaceC6839p.invoke(interfaceC3540lR, Integer.valueOf((i14 >> 6) & 14));
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(eVar2, interfaceC6839p, c10, i10, i11));
        }
    }

    public static final InterfaceC6839p b(List list) {
        return b0.c.c(-1953651383, true, new c(list));
    }

    public static final mh.q c(androidx.compose.ui.e eVar) {
        return b0.c.c(-55743822, true, new d(eVar));
    }
}
