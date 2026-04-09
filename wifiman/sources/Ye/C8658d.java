package ye;

import Ii.AbstractC3063k;
import Ii.C3073p;
import Ii.N;
import Yg.J;
import Yg.m;
import Yg.n;
import Yg.v;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.O;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.AbstractC5912b;
import hg.InterfaceC6043c;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import th.l;
import ye.C8658d;

/* renamed from: ye.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8658d {

    /* renamed from: a, reason: collision with root package name */
    public static final C8658d f66727a = new C8658d();

    /* renamed from: ye.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC8661g f66728a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC4013k.b f66729b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC6824a f66730c;

        /* renamed from: d, reason: collision with root package name */
        private final m f66731d;

        public a(AbstractC8661g viewModel, AbstractC4013k.b isAtLeast, InterfaceC6824a streamFactory) {
            AbstractC6492s.i(viewModel, "viewModel");
            AbstractC6492s.i(isAtLeast, "isAtLeast");
            AbstractC6492s.i(streamFactory, "streamFactory");
            this.f66728a = viewModel;
            this.f66729b = isAtLeast;
            this.f66730c = streamFactory;
            this.f66731d = n.b(new InterfaceC6824a() { // from class: ye.c
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return C8658d.a.d(this.f66726a);
                }
            });
        }

        private final gg.i b() {
            return (gg.i) this.f66731d.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.i d(a aVar) {
            return C8658d.f66727a.a(aVar.f66728a, aVar.f66729b, aVar.f66730c);
        }

        public final gg.i c(Object obj, l property) {
            AbstractC6492s.i(property, "property");
            return b();
        }
    }

    /* renamed from: ye.d$b */
    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4013k.b f66732a;

        b(AbstractC4013k.b bVar) {
            this.f66732a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(AbstractC4013k.b it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.isAtLeast(this.f66732a));
        }
    }

    /* renamed from: ye.d$c */
    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f66733a;

        c(InterfaceC6824a interfaceC6824a) {
            this.f66733a = interfaceC6824a;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean streamEnabled) {
            AbstractC6492s.i(streamEnabled, "streamEnabled");
            if (streamEnabled.booleanValue()) {
                return (gg.i) this.f66733a.invoke();
            }
            gg.i iVarJ0 = gg.i.j0();
            AbstractC6492s.f(iVarJ0);
            return iVarJ0;
        }
    }

    /* renamed from: ye.d$d, reason: collision with other inner class name */
    static final class C2368d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f66734a;

        /* renamed from: b, reason: collision with root package name */
        int f66735b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ gg.i f66736c;

        /* renamed from: ye.d$d$a */
        static final class a implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6043c f66737a;

            a(InterfaceC6043c interfaceC6043c) {
                this.f66737a = interfaceC6043c;
            }

            public final void a(Throwable th2) {
                this.f66737a.dispose();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2368d(gg.i iVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f66736c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new C2368d(this.f66736c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f66735b;
            if (i10 == 0) {
                v.b(obj);
                gg.i iVar = this.f66736c;
                this.f66734a = iVar;
                this.f66735b = 1;
                C3073p c3073p = new C3073p(AbstractC5467b.d(this), 1);
                c3073p.A();
                InterfaceC6043c interfaceC6043cA1 = iVar.A1();
                AbstractC6492s.h(interfaceC6043cA1, "subscribe(...)");
                c3073p.B(new a(interfaceC6043cA1));
                Object objU = c3073p.u();
                if (objU == AbstractC5467b.g()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objU == objG) {
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
            return ((C2368d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: ye.d$e */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f66738a;

        /* renamed from: b, reason: collision with root package name */
        int f66739b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5912b f66740c;

        /* renamed from: ye.d$e$a */
        static final class a implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6043c f66741a;

            a(InterfaceC6043c interfaceC6043c) {
                this.f66741a = interfaceC6043c;
            }

            public final void a(Throwable th2) {
                this.f66741a.dispose();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC5912b abstractC5912b, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f66740c = abstractC5912b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new e(this.f66740c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f66739b;
            if (i10 == 0) {
                v.b(obj);
                AbstractC5912b abstractC5912b = this.f66740c;
                this.f66738a = abstractC5912b;
                this.f66739b = 1;
                C3073p c3073p = new C3073p(AbstractC5467b.d(this), 1);
                c3073p.A();
                InterfaceC6043c interfaceC6043cS = abstractC5912b.S();
                AbstractC6492s.h(interfaceC6043cS, "subscribe(...)");
                c3073p.B(new a(interfaceC6043cS));
                Object objU = c3073p.u();
                if (objU == AbstractC5467b.g()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objU == objG) {
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

    private C8658d() {
    }

    public static /* synthetic */ a c(C8658d c8658d, AbstractC8661g abstractC8661g, AbstractC4013k.b bVar, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = AbstractC4013k.b.STARTED;
        }
        return c8658d.b(abstractC8661g, bVar, interfaceC6824a);
    }

    public final gg.i a(AbstractC8661g viewModel, AbstractC4013k.b isAtLeast, InterfaceC6824a streamFactory) {
        AbstractC6492s.i(viewModel, "viewModel");
        AbstractC6492s.i(isAtLeast, "isAtLeast");
        AbstractC6492s.i(streamFactory, "streamFactory");
        gg.i iVarI2 = Qi.i.c(viewModel.i0(), null, 1, null).e1().N0(new b(isAtLeast)).W().I1(new c(streamFactory)).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }

    public final a b(AbstractC8661g abstractC8661g, AbstractC4013k.b isAtLeast, InterfaceC6824a streamFactory) {
        AbstractC6492s.i(abstractC8661g, "<this>");
        AbstractC6492s.i(isAtLeast, "isAtLeast");
        AbstractC6492s.i(streamFactory, "streamFactory");
        return new a(abstractC8661g, isAtLeast, streamFactory);
    }

    public final void d(AbstractC5912b abstractC5912b, AbstractC8661g vm) {
        AbstractC6492s.i(abstractC5912b, "<this>");
        AbstractC6492s.i(vm, "vm");
        AbstractC3063k.d(O.a(vm), null, null, new e(abstractC5912b, null), 3, null);
    }

    public final void e(gg.i iVar, AbstractC8661g vm) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(vm, "vm");
        AbstractC3063k.d(O.a(vm), null, null, new C2368d(iVar, null), 3, null);
    }
}
