package ba;

import C0.C;
import E0.InterfaceC2629g;
import F.D;
import F9.c0;
import Ii.AbstractC3063k;
import Ii.N;
import L9.AbstractC3198d;
import L9.E;
import N.a1;
import R0.C3471y;
import R0.K;
import T.A;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import Yg.J;
import Yg.v;
import android.content.res.Resources;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.n1;
import ba.j;
import ba.l;
import com.google.ar.core.ImageMetadata;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;
import sa.AbstractC7930a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.a0;
import z.j0;

/* loaded from: classes3.dex */
public abstract class j {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f33035a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f33036b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f33036b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f33036b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f33035a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f33036b.w0();
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f33037a;

        b(l lVar) {
            this.f33037a = lVar;
        }

        public final void a(A9.i UiColumnWithDividers, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(UiColumnWithDividers, "$this$UiColumnWithDividers");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1359441766, i10, -1, "com.ui.core.ui.sso.password.UiResetPasswordLayout.<anonymous>.<anonymous> (UiResetPasswordLayout.kt:99)");
            }
            c0.c(null, null, null, this.f33037a.h0(), null, null, ((Boolean) o1.b(this.f33037a.i0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue(), null, W0.j.f23523b.f(), H0.f.a(P9.b.f18397K0, interfaceC3540l, 0), null, 0L, null, false, null, new D(0, (Boolean) null, C3471y.f19528b.c(), 0, (K) null, (Boolean) null, (S0.e) null, 123, (DefaultConstructorMarker) null), null, null, interfaceC3540l, 48, ImageMetadata.EDGE_MODE, 228533);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f33038a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f33039b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l lVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f33039b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f33039b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f33038a;
            if (i10 == 0) {
                v.b(obj);
                l lVar = this.f33039b;
                this.f33038a = 1;
                if (lVar.u0(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f33040a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f33041b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l lVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f33041b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f33041b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f33040a;
            if (i10 == 0) {
                v.b(obj);
                l lVar = this.f33041b;
                this.f33040a = 1;
                if (lVar.t0(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f33042a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f33043b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(l lVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f33043b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new e(this.f33043b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f33042a;
            if (i10 == 0) {
                v.b(obj);
                l lVar = this.f33043b;
                this.f33042a = 1;
                if (lVar.s0(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class f implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f33044a;

        static final class a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f33045a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f33046b;

            a(l lVar, InterfaceC6824a interfaceC6824a) {
                this.f33045a = lVar;
                this.f33046b = interfaceC6824a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(l lVar) {
                lVar.v0();
                return J.f24997a;
            }

            public final void b(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1822502294, i10, -1, "com.ui.core.ui.sso.password.UiResetPasswordLayout.<anonymous>.<anonymous> (UiResetPasswordLayout.kt:190)");
                }
                String strB = AbstractC7930a.b((s9.d) o1.b(this.f33045a.g0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
                String str = String.format(AbstractC7930a.b((s9.d) o1.b(this.f33045a.f0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0), Arrays.copyOf(new Object[]{this.f33045a.h0().i()}, 1));
                AbstractC6492s.h(str, "format(...)");
                d.c cVar = new d.c(str);
                String strB2 = AbstractC7930a.b((s9.d) o1.b(this.f33045a.g0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
                interfaceC3540l.U(-887003927);
                boolean zT = interfaceC3540l.T(this.f33045a);
                final l lVar = this.f33045a;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: ba.k
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return j.f.a.c(lVar);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                y9.q.k(null, strB, 0, 0, 0L, null, null, cVar, null, null, null, strB2, null, (InterfaceC6824a) objF, H0.f.a(P9.b.f18389G0, interfaceC3540l, 0), null, this.f33046b, null, null, interfaceC3540l, 805306368, 0, 431485);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return J.f24997a;
            }
        }

        f(l lVar) {
            this.f33044a = lVar;
        }

        public final void a(l.a event, InterfaceC6824a dismissalAction, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(event, "event");
            AbstractC6492s.i(dismissalAction, "dismissalAction");
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.T(event) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= interfaceC3540l.l(dismissalAction) ? 32 : 16;
            }
            if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1456955688, i11, -1, "com.ui.core.ui.sso.password.UiResetPasswordLayout.<anonymous> (UiResetPasswordLayout.kt:183)");
            }
            if (AbstractC6492s.d(event, l.a.C1148a.f33048a)) {
                dismissalAction.invoke();
            } else {
                if (!AbstractC6492s.d(event, l.a.b.f33049a)) {
                    throw new NoWhenBranchMatchedException();
                }
                y9.s.b(null, 0L, null, dismissalAction, b0.c.e(1822502294, true, new a(this.f33044a, dismissalAction), interfaceC3540l, 54), interfaceC3540l, ((i11 << 6) & 7168) | 24576, 7);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((l.a) obj, (InterfaceC6824a) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final void f(l lVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        C6562a c6562a;
        InterfaceC3540l interfaceC3540l2;
        e.a aVar;
        int i12;
        InterfaceC3540l interfaceC3540l3;
        ?? r12;
        e.a aVar2;
        int i13;
        int i14;
        C6562a c6562a2;
        InterfaceC5384i interfaceC5384i;
        C6562a c6562a3;
        e.a aVar3;
        int i15;
        final l vm = lVar;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-512151759);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(vm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l3 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-512151759, i11, -1, "com.ui.core.ui.sso.password.UiResetPasswordLayout (UiResetPasswordLayout.kt:46)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar4 = InterfaceC3540l.f21100a;
            if (objF == aVar4.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            final N nA = ((A) objF).a();
            final n1 n1Var = (n1) interfaceC3540lR.t(AbstractC3932k0.q());
            C6562a c6562a4 = C6562a.f52458a;
            int i16 = C6562a.f52459b;
            float fC = c6562a4.d(interfaceC3540lR, i16).a().a().c();
            e.a aVar5 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarA = M9.e.a(androidx.compose.foundation.layout.r.f(j0.a(j0.d(androidx.compose.foundation.b.d(aVar5, c6562a4.a(interfaceC3540lR, i16).e().a(), null, 2, null))), 0.0f, 1, null));
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540lR, 0);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarA);
            InterfaceC2629g.a aVar6 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar6.a();
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
            E1.c(interfaceC3540lA, cA, aVar6.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar6.g());
            InterfaceC6839p interfaceC6839pB = aVar6.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar6.f());
            C8688k c8688k = C8688k.f66923a;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar5, 0.0f, 1, null);
            AbstractC3198d.a aVar7 = AbstractC3198d.a.f11402b;
            interfaceC3540lR.U(-495058752);
            int i17 = i11 & 14;
            boolean zL = interfaceC3540lR.l(nA) | (i17 == 4);
            Object objF2 = interfaceC3540lR.f();
            if (zL || objF2 == aVar4.a()) {
                objF2 = new InterfaceC6824a() { // from class: ba.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return j.g(nA, vm);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            int i18 = i11;
            E.i(eVarH, null, aVar7, (InterfaceC6824a) objF2, null, 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540lR, (AbstractC3198d.a.f11403c << 6) | 6, 0, 2034);
            Z9.h.c(AbstractC7930a.b((s9.d) o1.b(lVar.q0(), null, interfaceC3540lR, 0, 1).getValue(), interfaceC3540lR, 0), androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar5, 0.0f, 1, null), fC, 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC3540lR, 0, 0, 65532);
            Z9.k.c(AbstractC7930a.b((s9.d) o1.b(lVar.p0(), null, interfaceC3540lR, 0, 1).getValue(), interfaceC3540lR, 0), androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(aVar5, 0.0f, 1, null), fC, c6562a4.d(interfaceC3540lR, i16).a().b().d(), fC, 0.0f, 8, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC3540lR, 0, 0, 65532);
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar5, 0.0f, 1, null);
            float f10 = 32;
            A9.h.e(M9.j.a(androidx.compose.foundation.layout.o.m(eVarH2, fC, c6562a4.d(interfaceC3540lR, i16).a().b().a(Y0.h.j(f10)), fC, 0.0f, 8, null), null, 0L, interfaceC3540lR, 0, 3), null, b0.c.e(1359441766, true, new b(vm), interfaceC3540lR, 54), interfaceC3540lR, 384, 2);
            s9.d dVar = (s9.d) o1.b(lVar.j0(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(-495009800);
            if (dVar != null) {
                i12 = i16;
                c6562a = c6562a4;
                interfaceC3540l2 = interfaceC3540lR;
                aVar = aVar5;
                a1.b(AbstractC7930a.b(dVar, interfaceC3540lR, 0), androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(aVar5, 0.0f, 1, null), c6562a4.d(interfaceC3540lR, i16).a().a().a(Y0.h.j(f10)), c6562a4.d(interfaceC3540lR, i16).a().b().e(), c6562a4.d(interfaceC3540lR, i16).a().a().a(Y0.h.j(f10)), 0.0f, 8, null), c6562a4.a(interfaceC3540lR, i16).a().l().f(), c6562a4.c(interfaceC3540lR, i16).b().a().l(), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3540l2, 0, 0, 131056);
            } else {
                c6562a = c6562a4;
                interfaceC3540l2 = interfaceC3540lR;
                aVar = aVar5;
                i12 = i16;
            }
            interfaceC3540l2.J();
            interfaceC3540l3 = interfaceC3540l2;
            a0.a(InterfaceC8687j.b(c8688k, aVar, 1.0f, false, 2, null), interfaceC3540l3, 0);
            interfaceC3540l3.U(-494990056);
            if (((Boolean) o1.b(lVar.o0(), null, interfaceC3540l3, 0, 1).getValue()).booleanValue()) {
                e.a aVar8 = aVar;
                int i19 = i12;
                C6562a c6562a5 = c6562a;
                androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.h(aVar8, 0.0f, 1, null), c6562a5.d(interfaceC3540l3, i19).a().a().a(Y0.h.j(f10)), c6562a5.d(interfaceC3540l3, i19).a().b().a(Y0.h.j(20)));
                String strB = AbstractC7930a.b((s9.d) o1.b(lVar.n0(), null, interfaceC3540l3, 0, 1).getValue(), interfaceC3540l3, 0);
                boolean zBooleanValue = ((Boolean) o1.b(lVar.m0(), null, interfaceC3540l3, 0, 1).getValue()).booleanValue();
                interfaceC3540l3.U(-494973929);
                boolean zT = interfaceC3540l3.T(n1Var) | interfaceC3540l3.l(nA) | (i17 == 4);
                Object objF3 = interfaceC3540l3.f();
                if (zT || objF3 == aVar4.a()) {
                    objF3 = new InterfaceC6824a() { // from class: ba.f
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return j.h(n1Var, nA, vm);
                        }
                    };
                    interfaceC3540l3.K(objF3);
                }
                interfaceC3540l3.J();
                i14 = i19;
                c6562a2 = c6562a5;
                aVar2 = aVar8;
                i13 = i17;
                r12 = 1;
                w9.r.b(eVarJ, (InterfaceC6824a) objF3, zBooleanValue, false, null, null, strB, null, interfaceC3540l3, 0, 184);
            } else {
                r12 = 1;
                aVar2 = aVar;
                i13 = i17;
                i14 = i12;
                c6562a2 = c6562a;
            }
            interfaceC3540l3.J();
            interfaceC3540l3.U(-494966703);
            if (((Boolean) o1.b(lVar.l0(), null, interfaceC3540l3, 0, r12).getValue()).booleanValue()) {
                e.a aVar9 = aVar2;
                C6562a c6562a6 = c6562a2;
                androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar9, 0.0f, r12, null), c6562a6.d(interfaceC3540l3, i14).a().a().a(Y0.h.j(f10)), 0.0f, 2, null);
                String strA = H0.f.a(P9.b.f18383D0, interfaceC3540l3, 0);
                interfaceC3540l3.U(-494954452);
                int i20 = i13;
                boolean zL2 = interfaceC3540l3.l(nA) | (i20 == 4 ? r12 : false);
                Object objF4 = interfaceC3540l3.f();
                if (zL2 || objF4 == aVar4.a()) {
                    objF4 = new InterfaceC6824a() { // from class: ba.g
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return j.i(nA, vm);
                        }
                    };
                    interfaceC3540l3.K(objF4);
                }
                interfaceC3540l3.J();
                i15 = i20;
                c6562a3 = c6562a6;
                aVar3 = aVar9;
                interfaceC5384i = null;
                w9.r.b(eVarK, (InterfaceC6824a) objF4, false, false, null, null, strA, null, interfaceC3540l3, 0, 188);
            } else {
                interfaceC5384i = null;
                c6562a3 = c6562a2;
                aVar3 = aVar2;
                i15 = i13;
            }
            interfaceC3540l3.J();
            interfaceC3540l3.U(-494948323);
            if (((Boolean) o1.b(lVar.k0(), interfaceC5384i, interfaceC3540l3, 0, r12).getValue()).booleanValue()) {
                C6562a c6562a7 = c6562a3;
                androidx.compose.ui.e eVarL = androidx.compose.foundation.layout.o.l(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, r12, interfaceC5384i), c6562a7.d(interfaceC3540l3, i14).a().a().a(Y0.h.j(f10)), c6562a7.d(interfaceC3540l3, i14).a().b().c(), c6562a7.d(interfaceC3540l3, i14).a().a().a(Y0.h.j(f10)), c6562a7.d(interfaceC3540l3, i14).a().b().a(Y0.h.j(20)));
                String strA2 = H0.f.a(P9.b.f18379B0, interfaceC3540l3, 0);
                interfaceC3540l3.U(-494929809);
                boolean zL3 = interfaceC3540l3.l(nA) | (i15 == 4 ? r12 : false);
                Object objF5 = interfaceC3540l3.f();
                if (zL3 || objF5 == aVar4.a()) {
                    vm = lVar;
                    objF5 = new InterfaceC6824a() { // from class: ba.h
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return j.j(nA, vm);
                        }
                    };
                    interfaceC3540l3.K(objF5);
                } else {
                    vm = lVar;
                }
                interfaceC3540l3.J();
                w9.o.c(eVarL, (InterfaceC6824a) objF5, false, false, null, strA2, interfaceC3540l3, 0, 28);
            } else {
                vm = lVar;
            }
            interfaceC3540l3.J();
            interfaceC3540l3.R();
            y9.s.c(lVar.b(), vm, b0.c.e(1456955688, r12, new f(vm), interfaceC3540l3, 54), interfaceC3540l3, ((i18 << 3) & 112) | 384);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l3.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: ba.i
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return j.k(vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(N n10, l lVar) {
        AbstractC3063k.d(n10, null, null, new a(lVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(n1 n1Var, N n10, l lVar) {
        if (n1Var != null) {
            n1Var.c();
        }
        AbstractC3063k.d(n10, null, null, new c(lVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(N n10, l lVar) {
        AbstractC3063k.d(n10, null, null, new d(lVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(N n10, l lVar) {
        AbstractC3063k.d(n10, null, null, new e(lVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k(l lVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        f(lVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
