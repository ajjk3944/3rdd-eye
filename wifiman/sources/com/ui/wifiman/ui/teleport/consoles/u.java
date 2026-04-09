package com.ui.wifiman.ui.teleport.consoles;

import A.AbstractC2395b;
import A.InterfaceC2396c;
import Be.E;
import C0.C;
import E0.InterfaceC2629g;
import Ee.I;
import Ii.AbstractC3063k;
import Ii.N;
import L0.C3174d;
import N.O0;
import N.a1;
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
import android.content.res.Resources;
import androidx.compose.ui.e;
import com.ui.wifiman.ui.teleport.consoles.h;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.C8680c;
import z.W;
import z.Y;
import z.Z;

/* loaded from: classes4.dex */
public abstract class u {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f45077a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.teleport.consoles.i f45078b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.ui.wifiman.ui.teleport.consoles.i iVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f45078b = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f45078b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f45077a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            this.f45078b.q0();
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
        final /* synthetic */ float f45079a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f45080b;

        b(float f10, InterfaceC6824a interfaceC6824a) {
            this.f45079a = f10;
            this.f45080b = interfaceC6824a;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-83991549, i10, -1, "com.ui.wifiman.ui.teleport.consoles.TeleportConsole.<anonymous>.<anonymous>.<anonymous> (TeleportConsolePickerUi.kt:80)");
            }
            I.c(androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, this.f45079a, 0.0f, 0.0f, 0.0f, 14, null), this.f45080b, interfaceC3540l, 0, 0);
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

    static final class c implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f45081a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.teleport.consoles.i f45082b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.teleport.consoles.h f45083c;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f45084a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.ui.teleport.consoles.i f45085b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.ui.teleport.consoles.h f45086c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.ui.wifiman.ui.teleport.consoles.i iVar, com.ui.wifiman.ui.teleport.consoles.h hVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f45085b = iVar;
                this.f45086c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f45085b, this.f45086c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f45084a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                this.f45085b.p0(this.f45086c);
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        c(N n10, com.ui.wifiman.ui.teleport.consoles.i iVar, com.ui.wifiman.ui.teleport.consoles.h hVar) {
            this.f45081a = n10;
            this.f45082b = iVar;
            this.f45083c = hVar;
        }

        public final void a() {
            AbstractC3063k.d(this.f45081a, null, null, new a(this.f45082b, this.f45083c, null), 3, null);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class d implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.teleport.consoles.i f45087a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.teleport.consoles.h f45088b;

        d(com.ui.wifiman.ui.teleport.consoles.i iVar, com.ui.wifiman.ui.teleport.consoles.h hVar) {
            this.f45087a = iVar;
            this.f45088b = hVar;
        }

        public final void a() {
            this.f45087a.o0((h.a) this.f45088b);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f45089a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f45090b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC6835l interfaceC6835l, List list) {
            super(1);
            this.f45089a = interfaceC6835l;
            this.f45090b = list;
        }

        public final Object a(int i10) {
            return this.f45089a.invoke(this.f45090b.get(i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f45091a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f45092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC6835l interfaceC6835l, List list) {
            super(1);
            this.f45091a = interfaceC6835l;
            this.f45092b = list;
        }

        public final Object a(int i10) {
            return this.f45091a.invoke(this.f45092b.get(i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class g extends AbstractC6494u implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f45093a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f45094b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.teleport.consoles.i f45095c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f45096d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list, N n10, com.ui.wifiman.ui.teleport.consoles.i iVar, float f10) {
            super(4);
            this.f45093a = list;
            this.f45094b = n10;
            this.f45095c = iVar;
            this.f45096d = f10;
        }

        public final void a(InterfaceC2396c interfaceC2396c, int i10, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (interfaceC3540l.T(interfaceC2396c) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= interfaceC3540l.i(i10) ? 32 : 16;
            }
            if ((i12 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            com.ui.wifiman.ui.teleport.consoles.h hVar = (com.ui.wifiman.ui.teleport.consoles.h) this.f45093a.get(i10);
            interfaceC3540l.U(83912663);
            if (hVar instanceof h.a) {
                interfaceC3540l.U(83939849);
                e.a aVar = androidx.compose.ui.e.f28771b0;
                h.a aVar2 = (h.a) hVar;
                boolean z10 = !aVar2.e();
                interfaceC3540l.U(2716444);
                boolean zL = interfaceC3540l.l(this.f45094b) | interfaceC3540l.T(this.f45095c) | interfaceC3540l.T(hVar);
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new c(this.f45094b, this.f45095c, hVar);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                androidx.compose.ui.e eVarB = InterfaceC2396c.b(interfaceC2396c, androidx.compose.foundation.layout.r.h(androidx.compose.foundation.d.d(aVar, z10, null, null, (InterfaceC6824a) objF, 6, null), 0.0f, 1, null), null, 1, null);
                float f10 = this.f45096d;
                interfaceC3540l.U(2731195);
                boolean zT = interfaceC3540l.T(this.f45095c) | interfaceC3540l.T(hVar);
                Object objF2 = interfaceC3540l.f();
                if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new d(this.f45095c, hVar);
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                u.q(eVarB, f10, aVar2, (InterfaceC6824a) objF2, interfaceC3540l, 0);
                interfaceC3540l.J();
            } else if (hVar instanceof h.b) {
                interfaceC3540l.U(84813677);
                u.r(InterfaceC2396c.b(interfaceC2396c, androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f45096d, 0.0f, 2, null), null, 1, null), interfaceC3540l, 0);
                interfaceC3540l.J();
            } else if (hVar instanceof h.d) {
                interfaceC3540l.U(85163109);
                u.n(InterfaceC2396c.b(interfaceC2396c, androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f45096d, Y0.h.j(12)), null, 1, null), this.f45095c, interfaceC3540l, 0);
                interfaceC3540l.J();
            } else {
                if (!(hVar instanceof h.c)) {
                    interfaceC3540l.U(2706860);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(85637223);
                u.l(InterfaceC2396c.b(interfaceC2396c, androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f45096d, Y0.h.j(12)), null, 1, null), (h.c) hVar, interfaceC3540l, 0);
                interfaceC3540l.J();
            }
            interfaceC3540l.J();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) throws Resources.NotFoundException {
            a((InterfaceC2396c) obj, ((Number) obj2).intValue(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    static final class h implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h.a f45097a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y f45098b;

        h(h.a aVar, Y y10) {
            this.f45097a = aVar;
            this.f45098b = y10;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2051434067, i10, -1, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleSubtitleTitleRow.<anonymous>.<anonymous> (TeleportConsolePickerUi.kt:252)");
            }
            if (this.f45097a.h() != null) {
                Y y10 = this.f45098b;
                h.a aVar = this.f45097a;
                androidx.compose.ui.e eVarA = y10.a(androidx.compose.ui.e.f28771b0, 1.0f, false);
                C3174d c3174dA = AbstractC7930a.a(aVar.h(), interfaceC3540l, 0);
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                a1.c(c3174dA, eVarA, c6562a.a(interfaceC3540l, i11).f().c(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540l, i11).b().f(), interfaceC3540l, 0, 3120, 120824);
            }
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

    public /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45099a;

        static {
            int[] iArr = new int[h.a.EnumC1637a.values().length];
            try {
                iArr[h.a.EnumC1637a.CONNECTABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.a.EnumC1637a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.a.EnumC1637a.CONNECTION_NOT_POSSIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45099a = iArr;
        }
    }

    private static final void A(final androidx.compose.ui.e eVar, final h.a aVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        int i12;
        e.a aVar2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-48762311);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(aVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-48762311, i11, -1, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleTitleRow (TeleportConsolePickerUi.kt:183)");
            }
            C cB = W.b(C8680c.f66832a.n(Y0.h.j(4)), f0.c.f46573a.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
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
            E1.c(interfaceC3540lA, cB, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            Z z10 = Z.f66823a;
            e.a aVar4 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarA = z10.a(aVar4, 1.0f, false);
            C3174d c3174dA = AbstractC7930a.a(aVar.i(), interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            a1.c(c3174dA, eVarA, c6562a.a(interfaceC3540lR, i13).f().a(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().b(), interfaceC3540lR, 0, 3120, 120824);
            h.a.EnumC1637a enumC1637aB = aVar.b();
            interfaceC3540l2 = interfaceC3540lR;
            interfaceC3540l2.U(386393193);
            if (enumC1637aB == h.a.EnumC1637a.CONNECTED) {
                aVar2 = aVar4;
                i12 = i13;
                AbstractC8049c.c(Pe.a.f18599a.S(), androidx.compose.foundation.layout.r.v(aVar2, Y0.h.j(24)), C6733v0.g(c6562a.a(interfaceC3540l2, i12).a().i()), null, interfaceC3540l2, 54, 4);
            } else {
                i12 = i13;
                aVar2 = aVar4;
                if (enumC1637aB != h.a.EnumC1637a.CONNECTABLE && enumC1637aB != h.a.EnumC1637a.CONNECTION_NOT_POSSIBLE && enumC1637aB != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            interfaceC3540l2.J();
            interfaceC3540l2.U(386411447);
            if (aVar.f()) {
                if (AbstractC6492s.d(aVar.j(), Boolean.TRUE)) {
                    interfaceC3540l2.U(-906077589);
                    AbstractC8049c.c(Pe.a.f18599a.u(), androidx.compose.foundation.layout.r.v(aVar2, Y0.h.j(18)), C6733v0.g(c6562a.a(interfaceC3540l2, i12).a().j()), null, interfaceC3540l2, 54, 4);
                    interfaceC3540l2.J();
                } else {
                    interfaceC3540l2.U(-905820599);
                    AbstractC8049c.c(Pe.a.f18599a.v(), androidx.compose.foundation.layout.r.v(aVar2, Y0.h.j(18)), C6733v0.g(c6562a.a(interfaceC3540l2, i12).f().c()), null, interfaceC3540l2, 54, 4);
                    interfaceC3540l2.J();
                }
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.consoles.t
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return u.B(eVar, aVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J B(androidx.compose.ui.e eVar, h.a aVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        A(eVar, aVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J C(androidx.compose.ui.e eVar, float f10, h.a aVar, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        q(eVar, f10, aVar, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final androidx.compose.ui.e eVar, final h.c cVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1035734894);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1035734894, i12, -1, "com.ui.wifiman.ui.teleport.consoles.Header (TeleportConsolePickerUi.kt:168)");
            }
            C3174d c3174dA = AbstractC7930a.a(cVar.b(), interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174dA, eVar, c6562a.a(interfaceC3540lR, i13).f().a(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i13).a().a(), interfaceC3540l2, (i12 << 3) & 112, 3120, 120824);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.consoles.o
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return u.m(eVar, cVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(androidx.compose.ui.e eVar, h.c cVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        l(eVar, cVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final androidx.compose.ui.e eVar, final com.ui.wifiman.ui.teleport.consoles.i iVar, InterfaceC3540l interfaceC3540l, final int i10) throws Resources.NotFoundException {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-191249549);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(iVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-191249549, i11, -1, "com.ui.wifiman.ui.teleport.consoles.NoAccountInfo (TeleportConsolePickerUi.kt:270)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            final N nA = ((A) objF).a();
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(eVar, 0.0f, Y0.h.j(4), 1, null);
            C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
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
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            String strA = H0.f.a(AbstractC6780c.f53508i4, interfaceC3540lR, 0);
            interfaceC3540lR.U(-642691114);
            boolean zL = interfaceC3540lR.l(nA) | ((i11 & 112) == 32);
            Object objF2 = interfaceC3540lR.f();
            if (zL || objF2 == aVar.a()) {
                objF2 = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.teleport.consoles.r
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return u.o(nA, iVar);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            w9.k.c(null, (InterfaceC6824a) objF2, false, false, null, null, strA, null, interfaceC3540lR, 0, 189);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.consoles.s
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return u.p(eVar, iVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J o(N n10, com.ui.wifiman.ui.teleport.consoles.i iVar) {
        AbstractC3063k.d(n10, null, null, new a(iVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(androidx.compose.ui.e eVar, com.ui.wifiman.ui.teleport.consoles.i iVar, int i10, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
        n(eVar, iVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void q(final androidx.compose.ui.e r27, final float r28, final com.ui.wifiman.ui.teleport.consoles.h.a r29, final mh.InterfaceC6824a r30, T.InterfaceC3540l r31, final int r32) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.teleport.consoles.u.q(androidx.compose.ui.e, float, com.ui.wifiman.ui.teleport.consoles.h$a, mh.a, T.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1907262270);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1907262270, i11, -1, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleLoading (TeleportConsolePickerUi.kt:153)");
            }
            androidx.compose.ui.e eVarA = H9.a.a(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.b(eVar, 0.0f, Y0.h.j(48), 1, null), 0.0f, Y0.h.j(2), 1, null), interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            O0.a(eVarA, E.h.d(c6562a.b(interfaceC3540lR, i12).b().a()), c6562a.a(interfaceC3540lR, i12).a().g().b(), 0L, null, 0.0f, com.ui.wifiman.ui.teleport.consoles.a.f45013a.c(), interfaceC3540lR, 1572864, 56);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.consoles.q
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return u.s(eVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J s(androidx.compose.ui.e eVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        r(eVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void t(androidx.compose.ui.e eVar, final com.ui.wifiman.ui.teleport.consoles.i vm, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1551715551);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1551715551, i12, -1, "com.ui.wifiman.ui.teleport.consoles.TeleportConsolePickerUi (TeleportConsolePickerUi.kt:291)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            final N nA = ((A) objF).a();
            final float fC = C6562a.f52458a.d(interfaceC3540lR, C6562a.f52459b).a().a().c();
            final List list = (List) o1.b(vm.n0(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(-318581369);
            boolean zL = interfaceC3540lR.l(list) | interfaceC3540lR.l(nA) | ((i12 & 112) == 32) | interfaceC3540lR.g(fC);
            Object objF2 = interfaceC3540lR.f();
            if (zL || objF2 == aVar.a()) {
                objF2 = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.teleport.consoles.j
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return u.u(list, nA, vm, fC, (A.y) obj);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC2395b.a(eVar3, null, null, false, null, null, null, false, (InterfaceC6835l) objF2, interfaceC3540lR, i12 & 14, 254);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.consoles.l
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return u.x(eVar2, vm, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J u(List list, N n10, com.ui.wifiman.ui.teleport.consoles.i iVar, float f10, A.y LazyColumn) {
        AbstractC6492s.i(LazyColumn, "$this$LazyColumn");
        LazyColumn.a(list.size(), new e(new InterfaceC6835l() { // from class: com.ui.wifiman.ui.teleport.consoles.m
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return u.v((h) obj);
            }
        }, list), new f(new InterfaceC6835l() { // from class: com.ui.wifiman.ui.teleport.consoles.n
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return u.w((h) obj);
            }
        }, list), b0.c.c(-632812321, true, new g(list, n10, iVar, f10)));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object v(com.ui.wifiman.ui.teleport.consoles.h it) {
        AbstractC6492s.i(it, "it");
        return it.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object w(com.ui.wifiman.ui.teleport.consoles.h it) {
        int i10;
        AbstractC6492s.i(it, "it");
        if (it instanceof h.a) {
            i10 = 0;
        } else if (it instanceof h.b) {
            i10 = 1;
        } else if (it instanceof h.d) {
            i10 = 2;
        } else {
            if (!(it instanceof h.c)) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 3;
        }
        return Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J x(androidx.compose.ui.e eVar, com.ui.wifiman.ui.teleport.consoles.i iVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        t(eVar, iVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    private static final void y(final androidx.compose.ui.e eVar, final h.a aVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(843602545);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(aVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(843602545, i11, -1, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleSubtitleTitleRow (TeleportConsolePickerUi.kt:235)");
            }
            C cB = W.b(C8680c.f66832a.n(Y0.h.j(8)), f0.c.f46573a.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
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
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            Z z10 = Z.f66823a;
            E.b(androidx.compose.ui.e.f28771b0, ((C6733v0) com.ui.wifiman.ui.teleport.C.c(aVar.g(), interfaceC3540lR, 0).getValue()).u(), interfaceC3540lR, 6, 0);
            AbstractC7385d.e(z10, aVar.h() != null, null, androidx.compose.animation.g.o(null, 0.0f, 3, null), androidx.compose.animation.g.q(null, 0.0f, 3, null), null, b0.c.e(-2051434067, true, new h(aVar, z10), interfaceC3540lR, 54), interfaceC3540lR, 1600518, 18);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.consoles.k
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return u.z(eVar, aVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J z(androidx.compose.ui.e eVar, h.a aVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        y(eVar, aVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
