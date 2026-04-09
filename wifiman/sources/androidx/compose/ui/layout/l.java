package androidx.compose.ui.layout;

import E0.G;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6839p f29047a = e.f29054a;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29048a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke() {
            return new G(true, 0, 2, null);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f29049a = new b();

        b() {
            super(1);
        }

        public final void a(G g10) {
            g10.K1(true);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f29050a = new c();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ G f29051a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(G g10) {
                super(0);
                this.f29051a = g10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0.r invoke() {
                G gO0 = this.f29051a.o0();
                AbstractC6492s.f(gO0);
                return gO0.P().c1();
            }
        }

        c() {
            super(2);
        }

        public final void a(G g10, k kVar) {
            kVar.a(new a(g10));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (k) obj2);
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.q f29052a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(mh.q qVar, int i10) {
            super(2);
            this.f29052a = qVar;
            this.f29053b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            l.a(this.f29052a, interfaceC3540l, L0.a(this.f29053b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final e f29054a = new e();

        e() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t.a aVar, C0.r rVar) {
            return Boolean.FALSE;
        }
    }

    public static final void a(mh.q qVar, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1078066484);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1078066484, i11, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:50)");
            }
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new k(null, 1, null);
                interfaceC3540lR.K(objF);
            }
            k kVar = (k) objF;
            a aVar = a.f29048a;
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(aVar);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.b(interfaceC3540lA, b.f29049a);
            E1.c(interfaceC3540lA, kVar, c.f29050a);
            qVar.s(kVar, interfaceC3540lR, Integer.valueOf((i11 << 3) & 112));
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new d(qVar, i10));
        }
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p, mh.q qVar) {
        return eVar.b0(new ApproachLayoutElement(qVar, interfaceC6835l, interfaceC6839p));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p, mh.q qVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC6839p = f29047a;
        }
        return b(eVar, interfaceC6835l, interfaceC6839p, qVar);
    }
}
