package B;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.I0;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Zg.U;
import c0.AbstractC4174c;
import c0.AbstractC4178g;
import c0.AbstractC4181j;
import c0.InterfaceC4179h;
import c0.InterfaceC4182k;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class H {

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f897a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.q f898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(G g10, mh.q qVar) {
            super(2);
            this.f897a = g10;
            this.f898b = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1863926504, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f897a.i(AbstractC4178g.a(interfaceC3540l, 0));
            this.f898b.s(this.f897a, interfaceC3540l, 0);
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

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.q f899a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f900b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(mh.q qVar, int i10) {
            super(2);
            this.f899a = qVar;
            this.f900b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            H.a(this.f899a, interfaceC3540l, L0.a(this.f900b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4179h f901a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC4179h interfaceC4179h) {
            super(0);
            this.f901a = interfaceC4179h;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke() {
            return new G(this.f901a, U.h());
        }
    }

    public static final void a(mh.q qVar, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(674185128);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(674185128, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            InterfaceC4179h interfaceC4179h = (InterfaceC4179h) interfaceC3540lR.t(AbstractC4181j.d());
            Object[] objArr = {interfaceC4179h};
            InterfaceC4182k interfaceC4182kA = G.f882d.a(interfaceC4179h);
            boolean zL = interfaceC3540lR.l(interfaceC4179h);
            Object objF = interfaceC3540lR.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new c(interfaceC4179h);
                interfaceC3540lR.K(objF);
            }
            G g10 = (G) AbstractC4174c.e(objArr, interfaceC4182kA, null, (InterfaceC6824a) objF, interfaceC3540lR, 0, 4);
            AbstractC3561w.a(AbstractC4181j.d().d(g10), b0.c.e(1863926504, true, new a(g10, qVar), interfaceC3540lR, 54), interfaceC3540lR, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(qVar, i10));
        }
    }
}
