package Re;

import C0.C;
import E0.InterfaceC2629g;
import Ii.AbstractC3063k;
import Ii.N;
import L0.C3174d;
import L0.U;
import N.a1;
import Re.e;
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
import com.google.ar.core.ImageMetadata;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f0.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6778a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import of.AbstractC7130f;
import of.C7125a;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import s.AbstractC7847h;
import s.C7846g;
import s9.c;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.W;
import z.Z;

/* loaded from: classes4.dex */
public abstract class e {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7125a.c f19728a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f19729b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Re.a f19730c;

        /* renamed from: Re.e$a$a, reason: collision with other inner class name */
        static final class C0710a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f19731a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Re.a f19732b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0710a(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f19732b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0710a(this.f19732b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f19731a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                this.f19732b.r0();
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C0710a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        a(C7125a.c cVar, N n10, Re.a aVar) {
            this.f19728a = cVar;
            this.f19729b = n10;
            this.f19730c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(N n10, Re.a aVar) {
            AbstractC3063k.d(n10, null, null, new C0710a(aVar, null), 3, null);
            return J.f24997a;
        }

        public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1343651308, i10, -1, "com.ui.wifiman.ui.settings.AppSettingsAccountLayout.<anonymous>.<anonymous> (AppSettingsAccountLayout.kt:88)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            c.b bVarG = f0.c.f46573a.g();
            C7125a.c cVar = this.f19728a;
            final N n10 = this.f19729b;
            final Re.a aVar2 = this.f19730c;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), bVarG, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
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
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            s9.d dVar = (s9.d) o1.b(cVar.q0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-971067393);
            C3174d c3174dA = dVar == null ? null : AbstractC7930a.a(dVar, interfaceC3540l, 0);
            interfaceC3540l.J();
            if (c3174dA == null) {
                c3174dA = new C3174d("", null, null, 6, null);
            }
            C3174d c3174d = c3174dA;
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            U uE = c6562a.c(interfaceC3540l, i11).a().e();
            a1.c(c3174d, aVar, c6562a.a(interfaceC3540l, i11).f().a(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, uE.b((15204351 & 1) != 0 ? uE.f11108a.g() : 0L, (15204351 & 2) != 0 ? uE.f11108a.k() : Y0.w.g(24), (15204351 & 4) != 0 ? uE.f11108a.n() : null, (15204351 & 8) != 0 ? uE.f11108a.l() : null, (15204351 & 16) != 0 ? uE.f11108a.m() : null, (15204351 & 32) != 0 ? uE.f11108a.i() : null, (15204351 & 64) != 0 ? uE.f11108a.j() : null, (15204351 & 128) != 0 ? uE.f11108a.o() : 0L, (15204351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? uE.f11108a.e() : null, (15204351 & 512) != 0 ? uE.f11108a.u() : null, (15204351 & 1024) != 0 ? uE.f11108a.p() : null, (15204351 & 2048) != 0 ? uE.f11108a.d() : 0L, (15204351 & 4096) != 0 ? uE.f11108a.s() : null, (15204351 & 8192) != 0 ? uE.f11108a.r() : null, (15204351 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? uE.f11108a.h() : null, (15204351 & 32768) != 0 ? uE.f11109b.h() : 0, (15204351 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uE.f11109b.i() : 0, (15204351 & 131072) != 0 ? uE.f11109b.e() : 0L, (15204351 & 262144) != 0 ? uE.f11109b.j() : null, (15204351 & ImageMetadata.LENS_APERTURE) != 0 ? uE.f11110c : null, (15204351 & ImageMetadata.SHADING_MODE) != 0 ? uE.f11109b.f() : null, (15204351 & 2097152) != 0 ? uE.f11109b.d() : 0, (15204351 & 4194304) != 0 ? uE.f11109b.c() : 0, (15204351 & 8388608) != 0 ? uE.f11109b.k() : null), interfaceC3540l, 48, 0, 130552);
            s9.d cVar2 = (s9.d) o1.b(cVar.p0(), null, interfaceC3540l, 0, 1).getValue();
            if (cVar2 == null) {
                cVar2 = new d.c("");
            }
            interfaceC3540l.U(-971051682);
            boolean zL = interfaceC3540l.l(n10) | interfaceC3540l.T(aVar2);
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Re.d
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return e.a.c(n10, aVar2);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            e.e(aVar, cVar2, (InterfaceC6824a) objF, interfaceC3540l, 6);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7125a.EnumC2013a f19733a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f19734b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Re.a f19735c;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f19736a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Re.a f19737b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f19737b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f19737b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f19736a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                this.f19737b.w0();
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: Re.e$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0711b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19738a;

            static {
                int[] iArr = new int[C7125a.EnumC2013a.values().length];
                try {
                    iArr[C7125a.EnumC2013a.NO_ACCOUNT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C7125a.EnumC2013a.LOGGED_IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C7125a.EnumC2013a.IN_PROGRESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C7125a.EnumC2013a.UNAUTHENTICATED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[C7125a.EnumC2013a.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f19738a = iArr;
            }
        }

        b(C7125a.EnumC2013a enumC2013a, N n10, Re.a aVar) {
            this.f19733a = enumC2013a;
            this.f19734b = n10;
            this.f19735c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(N n10, Re.a aVar) {
            AbstractC3063k.d(n10, null, null, new a(aVar, null), 3, null);
            return J.f24997a;
        }

        public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            int i11;
            boolean z10;
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1721830699, i10, -1, "com.ui.wifiman.ui.settings.AppSettingsAccountLayout.<anonymous>.<anonymous> (AppSettingsAccountLayout.kt:121)");
            }
            C7125a.EnumC2013a enumC2013a = this.f19733a;
            int[] iArr = C0711b.f19738a;
            int i12 = iArr[enumC2013a.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                i11 = AbstractC6780c.f53376P1;
            } else if (i12 == 4) {
                i11 = AbstractC6780c.f53369O1;
            } else {
                if (i12 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i11 = AbstractC6780c.f53362N1;
            }
            String strA = H0.f.a(i11, interfaceC3540l, 0);
            int i13 = iArr[this.f19733a.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) {
                z10 = true;
            } else {
                if (i13 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            interfaceC3540l.U(-208503757);
            boolean zL = interfaceC3540l.l(this.f19734b) | interfaceC3540l.T(this.f19735c);
            final N n10 = this.f19734b;
            final Re.a aVar = this.f19735c;
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Re.f
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return e.b.c(n10, aVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            w9.k.c(null, (InterfaceC6824a) objF, z10, false, null, null, strA, null, interfaceC3540l, 0, 185);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            b((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19739a;

        static {
            int[] iArr = new int[C7125a.EnumC2013a.values().length];
            try {
                iArr[C7125a.EnumC2013a.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C7125a.EnumC2013a.LOGGED_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C7125a.EnumC2013a.NO_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C7125a.EnumC2013a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C7125a.EnumC2013a.UNAUTHENTICATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19739a = iArr;
        }
    }

    public static final void c(androidx.compose.ui.e eVar, final Re.a vm, final C7125a.c userAccountVM, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        androidx.compose.ui.e eVar3;
        boolean z10;
        C7846g c7846gA;
        boolean z11;
        AbstractC6492s.i(vm, "vm");
        AbstractC6492s.i(userAccountVM, "userAccountVM");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-540123142);
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
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(userAccountVM) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            androidx.compose.ui.e eVar4 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-540123142, i12, -1, "com.ui.wifiman.ui.settings.AppSettingsAccountLayout (AppSettingsAccountLayout.kt:49)");
            }
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            N nA = ((A) objF).a();
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(eVar4, c6562a.d(interfaceC3540lR, i14).a().a().d(), 0.0f, 2, null);
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.g(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
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
            androidx.compose.ui.e eVarL = androidx.compose.foundation.layout.o.l(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), c6562a.d(interfaceC3540lR, i14).a().a().c(), c6562a.d(interfaceC3540lR, i14).a().b().d(), c6562a.d(interfaceC3540lR, i14).a().a().c(), c6562a.d(interfaceC3540lR, i14).a().b().d());
            s9.c cVar = (s9.c) o1.b(userAccountVM.o0(), null, interfaceC3540lR, 0, 1).getValue();
            c.a aVar2 = new c.a(AbstractC6778a.f53255t0, null, 2, null);
            C7125a.EnumC2013a enumC2013a = (C7125a.EnumC2013a) o1.b(userAccountVM.n0(), null, interfaceC3540lR, 0, 1).getValue();
            int[] iArr = c.f19739a;
            int i15 = iArr[enumC2013a.ordinal()];
            eVar3 = eVar4;
            if (i15 == 1 || i15 == 2 || i15 == 3) {
                z10 = true;
            } else {
                if (i15 != 4 && i15 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            C7125a.EnumC2013a enumC2013a2 = (C7125a.EnumC2013a) o1.b(userAccountVM.n0(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(-1623843600);
            if (enumC2013a2 == C7125a.EnumC2013a.ERROR || enumC2013a2 == C7125a.EnumC2013a.UNAUTHENTICATED) {
                c7846gA = AbstractC7847h.a(Y0.h.j(C7125a.b.f55658a.a()), c6562a.a(interfaceC3540lR, i14).a().l().f());
            } else {
                if (enumC2013a2 != C7125a.EnumC2013a.LOGGED_IN && enumC2013a2 != C7125a.EnumC2013a.IN_PROGRESS && enumC2013a2 != C7125a.EnumC2013a.NO_ACCOUNT) {
                    throw new NoWhenBranchMatchedException();
                }
                c7846gA = null;
            }
            interfaceC3540lR.J();
            AbstractC7130f.h(eVarL, cVar, aVar2, z10, Y0.h.j(96), c7846gA, interfaceC3540lR, 24576, 0);
            AbstractC7385d.d(c8688k, AbstractC6492s.d(o1.b(vm.o0(), null, interfaceC3540lR, 0, 1).getValue(), Boolean.TRUE), null, null, null, null, b0.c.e(1343651308, true, new a(userAccountVM, nA, vm), interfaceC3540lR, 54), interfaceC3540lR, 1572870, 30);
            C7125a.EnumC2013a enumC2013a3 = (C7125a.EnumC2013a) o1.b(userAccountVM.n0(), null, interfaceC3540lR, 0, 1).getValue();
            int i16 = iArr[enumC2013a3.ordinal()];
            if (i16 == 1 || i16 == 2) {
                z11 = false;
            } else {
                if (i16 != 3 && i16 != 4 && i16 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                z11 = true;
            }
            AbstractC7385d.d(c8688k, z11, null, null, null, null, b0.c.e(-1721830699, true, new b(enumC2013a3, nA, vm), interfaceC3540lR, 54), interfaceC3540lR, 1572870, 30);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar5 = eVar3;
            x0Z.a(new InterfaceC6839p() { // from class: Re.b
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return e.d(eVar5, vm, userAccountVM, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(androidx.compose.ui.e eVar, Re.a aVar, C7125a.c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, aVar, cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final androidx.compose.ui.e eVar, final s9.d dVar, final InterfaceC6824a interfaceC6824a, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-947721826);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6824a) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-947721826, i12, -1, "com.ui.wifiman.ui.settings.UserAccountDropdown (AppSettingsAccountLayout.kt:152)");
            }
            androidx.compose.ui.e eVarD = androidx.compose.foundation.d.d(eVar, true, null, null, interfaceC6824a, 6, null);
            C cB = W.b(C8680c.f66832a.f(), f0.c.f46573a.i(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarD);
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
            C3174d c3174dA = AbstractC7930a.a(dVar, interfaceC3540lR, (i12 >> 3) & 14);
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174dA, null, c6562a.a(interfaceC3540lR, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().b(), interfaceC3540l2, 0, 0, 131066);
            AbstractC8049c.c(N9.b.f16117a.f().f(AbstractC8049c.g(c6562a.a(interfaceC3540l2, i13).a().g().j(), "neutral8")), androidx.compose.foundation.b.c(androidx.compose.foundation.layout.r.v(androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, Y0.h.j(8), 0.0f, 0.0f, 0.0f, 14, null), Y0.h.j(20)), c6562a.a(interfaceC3540l2, i13).e().b(), E.h.g()), null, null, interfaceC3540l2, 0, 6);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Re.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return e.f(eVar, dVar, interfaceC6824a, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(androidx.compose.ui.e eVar, s9.d dVar, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        e(eVar, dVar, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
