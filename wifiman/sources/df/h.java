package df;

import Be.AbstractC2487w;
import C0.C;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import Yg.J;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import b8.AbstractC4074a;
import f0.c;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import q.AbstractC7385d;
import q.AbstractC7391j;
import q.InterfaceC7386e;
import s.AbstractC7844e;
import s.AbstractC7847h;
import s9.InterfaceC7929a;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.W;
import z.Y;
import z.Z;
import z.a0;

/* loaded from: classes4.dex */
public abstract class h {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5369c f46076a;

        /* renamed from: df.h$a$a, reason: collision with other inner class name */
        static final class C1722a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5367a f46077a;

            C1722a(C5367a c5367a) {
                this.f46077a = c5367a;
            }

            public final void a(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(206673815, i10, -1, "com.ui.wifiman.ui.speed.isp.IspDetailUi.<anonymous>.<anonymous>.<anonymous> (IspDetailUi.kt:97)");
                }
                e.a aVar = androidx.compose.ui.e.f28771b0;
                androidx.compose.ui.e eVarH = r.h(aVar, 0.0f, 1, null);
                f0.c cVarE = f0.c.f46573a.e();
                C5367a c5367a = this.f46077a;
                C cH = androidx.compose.foundation.layout.d.h(cVarE, false);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
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
                AbstractC4074a abstractC4074aA = c5367a.a();
                if (abstractC4074aA instanceof AbstractC4074a.b) {
                    interfaceC3540l.U(-1768817716);
                    C6562a c6562a = C6562a.f52458a;
                    int i11 = C6562a.f52459b;
                    androidx.compose.ui.e eVarA = H9.a.a(androidx.compose.foundation.b.d(aVar, c6562a.a(interfaceC3540l, i11).a().g().b(), null, 2, null), interfaceC3540l, 0);
                    a1.c(AbstractC7930a.a(Ne.c.e(AbstractC4074a.c.f33001a, false), interfaceC3540l, 0), eVarA, C6733v0.f52951b.d(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 384, 0, 131064);
                    interfaceC3540l.J();
                } else {
                    if (!(abstractC4074aA instanceof AbstractC4074a.C1143a) && !(abstractC4074aA instanceof AbstractC4074a.c)) {
                        interfaceC3540l.U(-2135271071);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-1768133329);
                    C3174d c3174dA = AbstractC7930a.a(Ne.c.e(c5367a.a(), true), interfaceC3540l, 0);
                    C6562a c6562a2 = C6562a.f52458a;
                    int i12 = C6562a.f52459b;
                    a1.c(c3174dA, aVar, c6562a2.a(interfaceC3540l, i12).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a2.c(interfaceC3540l, i12).b().a(), interfaceC3540l, 48, 0, 131064);
                    interfaceC3540l.J();
                }
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        static final class b implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ci.c f46078a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5369c f46079b;

            /* renamed from: df.h$a$b$a, reason: collision with other inner class name */
            /* synthetic */ class C1723a extends C6490p implements InterfaceC6835l {
                C1723a(Object obj) {
                    super(1, obj, AbstractC5369c.class, "onIspContactClicked", "onIspContactClicked(Lcom/ui/wifiman/ui/speed/isp/IspDetail$IspContactType;)V", 0);
                }

                public final void a(EnumC5368b p02) {
                    AbstractC6492s.i(p02, "p0");
                    ((AbstractC5369c) this.receiver).r0(p02);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((EnumC5368b) obj);
                    return J.f24997a;
                }
            }

            b(Ci.c cVar, AbstractC5369c abstractC5369c) {
                this.f46078a = cVar;
                this.f46079b = abstractC5369c;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1575004144, i10, -1, "com.ui.wifiman.ui.speed.isp.IspDetailUi.<anonymous>.<anonymous>.<anonymous> (IspDetailUi.kt:131)");
                }
                androidx.compose.ui.e eVarM = o.m(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), 0.0f, Y0.h.j(16), 0.0f, 0.0f, 13, null);
                Ci.c cVar = this.f46078a;
                AbstractC5369c abstractC5369c = this.f46079b;
                interfaceC3540l.U(-1844097972);
                boolean zT = interfaceC3540l.T(abstractC5369c);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C1723a(abstractC5369c);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                h.g(eVarM, cVar, (InterfaceC6835l) ((th.g) objF), interfaceC3540l, 6);
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

        a(AbstractC5369c abstractC5369c) {
            this.f46076a = abstractC5369c;
        }

        public final void a(InterfaceC8687j ModalScaffold, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalScaffold, "$this$ModalScaffold");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1571814366, i10, -1, "com.ui.wifiman.ui.speed.isp.IspDetailUi.<anonymous> (IspDetailUi.kt:64)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            androidx.compose.ui.e eVarM = o.m(o.k(aVar, c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, c6562a.d(interfaceC3540l, i11).a().b().a(Y0.h.j(24)), 7, null);
            c.b bVarG = f0.c.f46573a.g();
            C8680c.m mVarG = C8680c.f66832a.g();
            AbstractC5369c abstractC5369c = this.f46076a;
            C cA = AbstractC8685h.a(mVarG, bVarG, interfaceC3540l, 54);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarM);
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
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            a0.a(r.i(aVar, c6562a.d(interfaceC3540l, i11).a().b().a(Y0.h.j(32))), interfaceC3540l, 0);
            InterfaceC7929a interfaceC7929aB = (InterfaceC7929a) o1.b(abstractC5369c.p0(), null, interfaceC3540l, 0, 1).getValue();
            if (interfaceC7929aB == null) {
                interfaceC7929aB = N9.b.f16117a.B();
            }
            AbstractC2487w.b(interfaceC7929aB, r.v(aVar, Y0.h.j(64)), null, N9.b.f16117a.B(), null, 0.0f, 0L, interfaceC3540l, 48, 58);
            a0.a(r.i(aVar, Y0.h.j(16)), interfaceC3540l, 6);
            s9.d bVar = (s9.d) o1.b(abstractC5369c.q0(), null, interfaceC3540l, 0, 1).getValue();
            if (bVar == null) {
                bVar = new d.b(AbstractC6780c.f53519k1);
            }
            a1.c(AbstractC7930a.a(bVar, interfaceC3540l, 0), null, c6562a.a(interfaceC3540l, i11).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).a().b(), interfaceC3540l, 0, 0, 131066);
            a0.a(r.i(aVar, Y0.h.j(6)), interfaceC3540l, 6);
            AbstractC7391j.a(Boolean.valueOf(!(r0.a() instanceof AbstractC4074a.b)), r.h(aVar, 0.0f, 1, null), null, "crossfade", b0.c.e(206673815, true, new C1722a((C5367a) o1.b(abstractC5369c.n0(), null, interfaceC3540l, 0, 1).getValue()), interfaceC3540l, 54), interfaceC3540l, 27696, 4);
            AbstractC7385d.d(c8688k, !r0.isEmpty(), r.h(aVar, 0.0f, 1, null), null, null, null, b0.c.e(1575004144, true, new b((Ci.c) o1.b(abstractC5369c.o0(), null, interfaceC3540l, 0, 1).getValue(), abstractC5369c), interfaceC3540l, 54), interfaceC3540l, 1573254, 28);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46080a;

        static {
            int[] iArr = new int[EnumC5368b.values().length];
            try {
                iArr[EnumC5368b.PHONE_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5368b.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5368b.WEBSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46080a = iArr;
        }
    }

    private static final void e(final androidx.compose.ui.e eVar, final EnumC5368b enumC5368b, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1832013199);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(enumC5368b) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1832013199, i11, -1, "com.ui.wifiman.ui.speed.isp.ContactsItem (IspDetailUi.kt:168)");
            }
            float fJ = Y0.h.j(1);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            androidx.compose.ui.e eVarJ = o.j(r.y(r.r(AbstractC7844e.e(eVar, AbstractC7847h.a(fJ, c6562a.a(interfaceC3540lR, i12).a().g().g()), E.h.d(Y0.h.j(6))), 0.0f, 0.0f, Y0.h.j(220), 0.0f, 11, null), 0.0f, Y0.h.j(56), 0.0f, 0.0f, 13, null), Y0.h.j(16), Y0.h.j(8));
            C cA = AbstractC8685h.a(C8680c.f66832a.b(), f0.c.f46573a.g(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            s9.b bVarM = m(enumC5368b);
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            AbstractC8049c.c(bVarM, r.v(aVar2, Y0.h.j(24)), C6733v0.g(c6562a.a(interfaceC3540lR, i12).c().a()), null, interfaceC3540lR, 48, 4);
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(AbstractC7930a.a(n(enumC5368b), interfaceC3540lR, 0), aVar2, c6562a.a(interfaceC3540lR, i12).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i12).a().f(), interfaceC3540l2, 48, 0, 131064);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: df.g
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return h.f(eVar, enumC5368b, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(androidx.compose.ui.e eVar, EnumC5368b enumC5368b, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        e(eVar, enumC5368b, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final androidx.compose.ui.e eVar, final Ci.c cVar, final InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(914359199);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6835l) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(914359199, i11, -1, "com.ui.wifiman.ui.speed.isp.ContactsRow (IspDetailUi.kt:148)");
            }
            C cB = W.b(C8680c.f66832a.n(Y0.h.j(16)), f0.c.f46573a.l(), interfaceC3540lR, 6);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            Z z10 = Z.f66823a;
            interfaceC3540lR.U(-2059729531);
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                final EnumC5368b enumC5368b = (EnumC5368b) it.next();
                androidx.compose.ui.e eVarB = Y.b(z10, androidx.compose.ui.e.f28771b0, 1.0f, false, 2, null);
                interfaceC3540lR.U(934900522);
                boolean zT = ((i11 & 896) == 256) | interfaceC3540lR.T(enumC5368b);
                Object objF = interfaceC3540lR.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: df.e
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return h.h(interfaceC6835l, enumC5368b);
                        }
                    };
                    interfaceC3540lR.K(objF);
                }
                interfaceC3540lR.J();
                e(androidx.compose.foundation.d.d(eVarB, false, null, null, (InterfaceC6824a) objF, 7, null), enumC5368b, interfaceC3540lR, 0);
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: df.f
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return h.i(eVar, cVar, interfaceC6835l, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(InterfaceC6835l interfaceC6835l, EnumC5368b enumC5368b) {
        interfaceC6835l.invoke(enumC5368b);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(androidx.compose.ui.e eVar, Ci.c cVar, InterfaceC6835l interfaceC6835l, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        g(eVar, cVar, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(final androidx.compose.ui.e r11, final df.AbstractC5369c r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.h.j(androidx.compose.ui.e, df.c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k(androidx.compose.ui.e eVar, AbstractC5369c abstractC5369c, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        j(eVar, abstractC5369c, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    private static final s9.b m(EnumC5368b enumC5368b) {
        int i10 = b.f46080a[enumC5368b.ordinal()];
        if (i10 == 1) {
            return Pe.a.f18599a.q();
        }
        if (i10 == 2) {
            return N9.b.f16117a.C();
        }
        if (i10 == 3) {
            return N9.b.f16117a.B();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final s9.d n(EnumC5368b enumC5368b) {
        int i10;
        int i11 = b.f46080a[enumC5368b.ordinal()];
        if (i11 == 1) {
            i10 = AbstractC6780c.f53554p1;
        } else if (i11 == 2) {
            i10 = AbstractC6780c.f53547o1;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = AbstractC6780c.f53561q1;
        }
        return new d.b(i10);
    }
}
