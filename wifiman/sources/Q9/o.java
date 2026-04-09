package q9;

import A.AbstractC2395b;
import A.y;
import B9.a;
import C0.C;
import E0.InterfaceC2629g;
import Ii.AbstractC3063k;
import Ii.N;
import L9.AbstractC3198d;
import L9.C3203i;
import L9.E;
import L9.w;
import L9.z;
import N.Z;
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
import Zg.AbstractC3689v;
import androidx.compose.ui.e;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q9.o;
import s9.InterfaceC7929a;
import s9.c;
import s9.d;
import sa.AbstractC7930a;
import t9.AbstractC8045a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.Y;
import z.j0;
import z9.AbstractC8722b;

/* loaded from: classes3.dex */
public abstract class o {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f58528a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC7443i f58529b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC7443i interfaceC7443i, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f58529b = interfaceC7443i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f58529b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f58528a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC7443i interfaceC7443i = this.f58529b;
                this.f58528a = 1;
                if (interfaceC7443i.u(this) == objG) {
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
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f58530a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f58531b;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f58532a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f58533b;

            /* renamed from: q9.o$b$a$a, reason: collision with other inner class name */
            static final class C2061a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f58534a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC6824a f58535b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2061a(InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f58535b = interfaceC6824a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C2061a(this.f58535b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f58534a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    this.f58535b.invoke();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C2061a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            a(N n10, InterfaceC6824a interfaceC6824a) {
                this.f58532a = n10;
                this.f58533b = interfaceC6824a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(N n10, InterfaceC6824a interfaceC6824a) {
                AbstractC3063k.d(n10, null, null, new C2061a(interfaceC6824a, null), 3, null);
                return J.f24997a;
            }

            public final void b(Y IconButtons, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(IconButtons, "$this$IconButtons");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1300843881, i10, -1, "com.ui.core.ui.account.UiAccountPickerScreen.<anonymous>.<anonymous>.<anonymous> (UiAccountPickerScreen.kt:110)");
                }
                s9.b bVarS = N9.b.f16117a.s();
                androidx.compose.ui.e eVarG = M9.i.g(androidx.compose.ui.e.f28771b0, "ui_account_picker_close");
                interfaceC3540l.U(661024237);
                boolean zL = interfaceC3540l.l(this.f58532a) | interfaceC3540l.T(this.f58533b);
                final N n10 = this.f58532a;
                final InterfaceC6824a interfaceC6824a = this.f58533b;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: q9.p
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return o.b.a.c(n10, interfaceC6824a);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                z.c(bVarS, eVarG, 0L, false, (InterfaceC6824a) objF, interfaceC3540l, 0, 12);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(N n10, InterfaceC6824a interfaceC6824a) {
            this.f58530a = n10;
            this.f58531b = interfaceC6824a;
        }

        public final void a(Y UiToolbar, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiToolbar, "$this$UiToolbar");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(146736190, i10, -1, "com.ui.core.ui.account.UiAccountPickerScreen.<anonymous>.<anonymous> (UiAccountPickerScreen.kt:109)");
            }
            C3203i.f11423a.b(b0.c.e(1300843881, true, new a(this.f58530a, this.f58531b), interfaceC3540l, 54), interfaceC3540l, (C3203i.f11424b << 3) | 6, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f58536a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f58537b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC7443i f58538c;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f58539a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC7443i f58540b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f58541c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f58542d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC7443i interfaceC7443i, List list, int i10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f58540b = interfaceC7443i;
                this.f58541c = list;
                this.f58542d = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f58540b, this.f58541c, this.f58542d, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f58539a;
                if (i10 == 0) {
                    v.b(obj);
                    InterfaceC7443i interfaceC7443i = this.f58540b;
                    C7441g c7441g = (C7441g) this.f58541c.get(this.f58542d);
                    this.f58539a = 1;
                    if (interfaceC7443i.f(c7441g, this) == objG) {
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
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        c(List list, N n10, InterfaceC7443i interfaceC7443i) {
            this.f58536a = list;
            this.f58537b = n10;
            this.f58538c = interfaceC7443i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(N n10, InterfaceC7443i interfaceC7443i, List list, int i10) {
            AbstractC3063k.d(n10, null, null, new a(interfaceC7443i, list, i10, null), 3, null);
            return J.f24997a;
        }

        public final void b(final int i10, InterfaceC3540l interfaceC3540l, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= interfaceC3540l.i(i10) ? 4 : 2;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1822691448, i11, -1, "com.ui.core.ui.account.UiAccountPickerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiAccountPickerScreen.kt:135)");
            }
            androidx.compose.ui.e eVarG = M9.i.g(androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().e(), 0.0f, 0.0f, 0.0f, 14, null), "ui_account_picker_delete_" + ((C7441g) this.f58536a.get(i10)).d());
            interfaceC3540l.U(-1517615832);
            boolean zL = ((i11 & 14) == 4) | interfaceC3540l.l(this.f58537b) | interfaceC3540l.T(this.f58538c) | interfaceC3540l.l(this.f58536a);
            final N n10 = this.f58537b;
            final InterfaceC7443i interfaceC7443i = this.f58538c;
            final List list = this.f58536a;
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: q9.q
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return o.c.c(n10, interfaceC7443i, list, i10);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Z.a((InterfaceC6824a) objF, eVarG, false, null, C7435a.f58486a.a(), interfaceC3540l, 24576, 12);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b(((Number) obj).intValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f58543a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC7442h f58544b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f58545c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC7443i f58546d;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f58547a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC7443i f58548b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C7441g f58549c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC7443i interfaceC7443i, C7441g c7441g, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f58548b = interfaceC7443i;
                this.f58549c = c7441g;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f58548b, this.f58549c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f58547a;
                if (i10 == 0) {
                    v.b(obj);
                    InterfaceC7443i interfaceC7443i = this.f58548b;
                    C7441g c7441g = this.f58549c;
                    this.f58547a = 1;
                    if (interfaceC7443i.s(c7441g, this) == objG) {
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
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        d(List list, EnumC7442h enumC7442h, N n10, InterfaceC7443i interfaceC7443i) {
            this.f58543a = list;
            this.f58544b = enumC7442h;
            this.f58545c = n10;
            this.f58546d = interfaceC7443i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(N n10, InterfaceC7443i interfaceC7443i, C7441g c7441g) {
            AbstractC3063k.d(n10, null, null, new a(interfaceC7443i, c7441g, null), 3, null);
            return J.f24997a;
        }

        public final void b(int i10, InterfaceC3540l interfaceC3540l, int i11) {
            int i12;
            int i13;
            String strB;
            if ((i11 & 6) == 0) {
                i12 = i11 | (interfaceC3540l.i(i10) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-269604087, i12, -1, "com.ui.core.ui.account.UiAccountPickerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiAccountPickerScreen.kt:153)");
            }
            final C7441g c7441g = (C7441g) this.f58543a.get(i10);
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            EnumC7442h enumC7442h = this.f58544b;
            final N n10 = this.f58545c;
            final InterfaceC7443i interfaceC7443i = this.f58546d;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
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
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            boolean z10 = enumC7442h != EnumC7442h.EDIT;
            interfaceC3540l.U(642076432);
            boolean zL = interfaceC3540l.l(n10) | interfaceC3540l.T(interfaceC7443i) | interfaceC3540l.T(c7441g);
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: q9.r
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return o.d.c(n10, interfaceC7443i, c7441g);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarD = androidx.compose.foundation.d.d(eVarH2, z10, null, null, (InterfaceC6824a) objF, 6, null);
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            androidx.compose.ui.e eVarH3 = M9.i.h(androidx.compose.foundation.layout.o.k(eVarD, c6562a.d(interfaceC3540l, i14).a().a().c(), 0.0f, 2, null), "ui_account_picker_account_" + c7441g.d(), c7441g.f() != null);
            s9.c cVarA = c7441g.a();
            InterfaceC7929a.b bVarB = c7441g.b();
            s9.d dVarE = c7441g.e();
            interfaceC3540l.U(642094562);
            if (dVarE == null) {
                strB = null;
                i13 = 0;
            } else {
                i13 = 0;
                strB = AbstractC7930a.b(dVarE, interfaceC3540l, 0);
            }
            interfaceC3540l.J();
            s9.d dVarC = c7441g.c();
            interfaceC3540l.U(642096546);
            String strB2 = dVarC == null ? null : AbstractC7930a.b(dVarC, interfaceC3540l, i13);
            interfaceC3540l.J();
            t.b(eVarH3, cVarA, bVarB, strB, strB2, c7441g.f(), interfaceC3540l, 0, 0);
            AbstractC8722b.b(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i14).a().a().c(), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, 0.0f, interfaceC3540l, 0, 30);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b(((Number) obj).intValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f58550a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC7443i f58551b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC7443i interfaceC7443i, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f58551b = interfaceC7443i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new e(this.f58551b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f58550a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC7443i interfaceC7443i = this.f58551b;
                this.f58550a = 1;
                if (interfaceC7443i.o(this) == objG) {
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

    public static final void f(final InterfaceC7443i vm, final InterfaceC6824a onCloseClicked, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(vm, "vm");
        AbstractC6492s.i(onCloseClicked, "onCloseClicked");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2092824164);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(vm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(onCloseClicked) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2092824164, i11, -1, "com.ui.core.ui.account.UiAccountPickerScreen (UiAccountPickerScreen.kt:92)");
            }
            final EnumC7442h enumC7442h = (EnumC7442h) o1.b(vm.C(), null, interfaceC3540lR, 0, 1).getValue();
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            final N nA = ((A) objF).a();
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar2, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            androidx.compose.ui.e eVarB = j0.b(androidx.compose.foundation.layout.o.m(eVarH, 0.0f, 0.0f, 0.0f, c6562a.d(interfaceC3540lR, i12).a().b().c(), 7, null));
            C8680c c8680c = C8680c.f66832a;
            C cA = AbstractC8685h.a(c8680c.g(), f0.c.f46573a.k(), interfaceC3540lR, 0);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarB);
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
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar2, 0.0f, 1, null);
            s9.d dVar = (s9.d) o1.b(vm.getTitle(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(2129144902);
            String strB = dVar == null ? null : AbstractC7930a.b(dVar, interfaceC3540lR, 0);
            interfaceC3540lR.J();
            s9.d dVar2 = (s9.d) o1.b(vm.w(), null, interfaceC3540lR, 0, 1).getValue();
            AbstractC3198d.c.b bVar = dVar2 != null ? new AbstractC3198d.c.b(dVar2, false, 2, null) : null;
            float fC = w.f11485a.c();
            interfaceC3540lR.U(2129150224);
            int i13 = i11 & 14;
            boolean zL = interfaceC3540lR.l(nA) | (i13 == 4);
            Object objF2 = interfaceC3540lR.f();
            if (zL || objF2 == aVar.a()) {
                objF2 = new InterfaceC6824a() { // from class: q9.j
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return o.g(nA, vm);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            E.i(eVarH2, strB, bVar, (InterfaceC6824a) objF2, b0.c.e(146736190, true, new b(nA, onCloseClicked), interfaceC3540lR, 54), 0L, 0L, 0L, fC, null, 0.0f, interfaceC3540lR, 24582, 0, 1760);
            AbstractC8722b.b(androidx.compose.foundation.layout.r.h(aVar2, 0.0f, 1, null), 0L, 0.0f, 0.0f, 0.0f, interfaceC3540lR, 6, 30);
            final List list = (List) o1.b(vm.a(), null, interfaceC3540lR, 0, 1).getValue();
            androidx.compose.ui.e eVarA = c8688k.a(androidx.compose.foundation.layout.r.F(aVar2, null, false, 3, null), 1.0f, false);
            interfaceC3540lR.U(2129179275);
            boolean zL2 = interfaceC3540lR.l(list) | interfaceC3540lR.T(enumC7442h) | interfaceC3540lR.l(nA) | (i13 == 4);
            Object objF3 = interfaceC3540lR.f();
            if (zL2 || objF3 == aVar.a()) {
                objF3 = new InterfaceC6835l() { // from class: q9.k
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return o.h(list, enumC7442h, nA, vm, (y) obj);
                    }
                };
                interfaceC3540lR.K(objF3);
            }
            interfaceC3540lR.J();
            String strB2 = null;
            AbstractC2395b.a(eVarA, null, null, false, null, null, null, false, (InterfaceC6835l) objF3, interfaceC3540lR, 0, 254);
            interfaceC3540lR = interfaceC3540lR;
            androidx.compose.ui.e eVarG = M9.i.g(androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.b(aVar2, 0.0f, Y0.h.j(56), 1, null), Y0.h.j(c6562a.d(interfaceC3540lR, i12).a().a().c() + Y0.h.j(2)), 0.0f, 2, null), 0.0f, 1, null), "ui_account_picker_add_account");
            s9.b bVarB = N9.b.f16117a.b();
            s9.d dVar3 = (s9.d) o1.b(vm.x(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(2129270662);
            if (dVar3 != null) {
                strB2 = AbstractC7930a.b(dVar3, interfaceC3540lR, 0);
            }
            String str = strB2;
            interfaceC3540lR.J();
            C8680c.e eVarF = c8680c.f();
            interfaceC3540lR.U(2129273616);
            boolean zL3 = interfaceC3540lR.l(nA) | (i13 == 4);
            Object objF4 = interfaceC3540lR.f();
            if (zL3 || objF4 == aVar.a()) {
                objF4 = new InterfaceC6824a() { // from class: q9.l
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return o.j(nA, vm);
                    }
                };
                interfaceC3540lR.K(objF4);
            }
            interfaceC3540lR.J();
            w9.k.c(eVarG, (InterfaceC6824a) objF4, true, false, bVarB, null, str, eVarF, interfaceC3540lR, 12583296, 40);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: q9.m
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return o.k(vm, onCloseClicked, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(N n10, InterfaceC7443i interfaceC7443i) {
        AbstractC3063k.d(n10, null, null, new a(interfaceC7443i, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(final List list, EnumC7442h enumC7442h, N n10, InterfaceC7443i interfaceC7443i, y LazyColumn) {
        AbstractC6492s.i(LazyColumn, "$this$LazyColumn");
        B9.a.a(LazyColumn, list, new InterfaceC6835l() { // from class: q9.n
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return Integer.valueOf(o.i(list, ((Integer) obj).intValue()));
            }
        }, (20 & 4) != 0 ? a.C0049a.f1234a : null, enumC7442h == EnumC7442h.EDIT, (20 & 16) != 0, b0.c.c(-1822691448, true, new c(list, n10, interfaceC7443i)), b0.c.c(-269604087, true, new d(list, enumC7442h, n10, interfaceC7443i)));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(List list, int i10) {
        return ((C7441g) list.get(i10)).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(N n10, InterfaceC7443i interfaceC7443i) {
        AbstractC3063k.d(n10, null, null, new e(interfaceC7443i, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k(InterfaceC7443i interfaceC7443i, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        f(interfaceC7443i, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m() {
        int i10 = AbstractC8045a.f61861a;
        c.a aVar = new c.a(i10, null, 2, null);
        int i11 = AbstractC8045a.f61863c;
        return AbstractC3689v.o(new C7441g(0, aVar, new c.a(i11, null, 2, null), new d.c("Robert Pera"), new d.c("robert@ui.com"), null, 32, null), new C7441g(1, new c.a(i10, null, 2, null), new c.a(i11, null, 2, null), new d.c("Barack Obama"), new d.c("obama@ui.com"), null, 32, null), new C7441g(2, new c.a(i10, null, 2, null), new c.a(i11, null, 2, null), new d.c("Donald Trump"), new d.c("donald@ui.com"), null, 32, null), new C7441g(3, new c.a(i10, null, 2, null), new c.a(i11, null, 2, null), new d.c("UAP Nano HD"), new d.c("nano@ui.com"), null, 32, null), new C7441g(4, new c.a(i10, null, 2, null), new c.a(i11, null, 2, null), new d.c("UAP PRO"), new d.c("pro@ui.com"), null, 32, null));
    }
}
