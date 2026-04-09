package ye;

import Ii.C3048c0;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.J;
import Yg.J;
import Yg.m;
import Yg.n;
import Yg.v;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.O;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.q;
import org.snmp4j.mp.PduHandle;
import th.l;
import ye.C8656b;

/* renamed from: ye.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8656b {

    /* renamed from: a, reason: collision with root package name */
    public static final C8656b f66710a = new C8656b();

    /* renamed from: ye.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC8661g f66711a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC4013k.b f66712b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC6824a f66713c;

        /* renamed from: d, reason: collision with root package name */
        private final m f66714d;

        public a(AbstractC8661g viewModel, AbstractC4013k.b isAtLeast, InterfaceC6824a streamFactory) {
            AbstractC6492s.i(viewModel, "viewModel");
            AbstractC6492s.i(isAtLeast, "isAtLeast");
            AbstractC6492s.i(streamFactory, "streamFactory");
            this.f66711a = viewModel;
            this.f66712b = isAtLeast;
            this.f66713c = streamFactory;
            this.f66714d = n.b(new InterfaceC6824a() { // from class: ye.a
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return C8656b.a.d(this.f66709a);
                }
            });
        }

        private final InterfaceC3220g b() {
            return (InterfaceC3220g) this.f66714d.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC3220g d(a aVar) {
            return C8656b.f66710a.a(aVar.f66711a, aVar.f66712b, aVar.f66713c);
        }

        public final InterfaceC3220g c(Object obj, l property) {
            AbstractC6492s.i(property, "property");
            return b();
        }
    }

    /* renamed from: ye.b$b, reason: collision with other inner class name */
    public static final class C2366b extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: a, reason: collision with root package name */
        int f66715a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f66716b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f66717c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f66718d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2366b(InterfaceC5380e interfaceC5380e, InterfaceC6824a interfaceC6824a) {
            super(3, interfaceC5380e);
            this.f66718d = interfaceC6824a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f66715a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f66716b;
                InterfaceC3220g interfaceC3220gU = ((Boolean) this.f66717c).booleanValue() ? (InterfaceC3220g) this.f66718d.invoke() : AbstractC3222i.u();
                this.f66715a = 1;
                if (AbstractC3222i.t(interfaceC3221h, interfaceC3220gU, this) == objG) {
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

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Object obj, InterfaceC5380e interfaceC5380e) {
            C2366b c2366b = new C2366b(interfaceC5380e, this.f66718d);
            c2366b.f66716b = interfaceC3221h;
            c2366b.f66717c = obj;
            return c2366b.invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: ye.b$c */
    public static final class c implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f66719a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC4013k.b f66720b;

        /* renamed from: ye.b$c$a */
        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f66721a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC4013k.b f66722b;

            /* renamed from: ye.b$c$a$a, reason: collision with other inner class name */
            public static final class C2367a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f66723a;

                /* renamed from: b, reason: collision with root package name */
                int f66724b;

                public C2367a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f66723a = obj;
                    this.f66724b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h, AbstractC4013k.b bVar) {
                this.f66721a = interfaceC3221h;
                this.f66722b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ye.C8656b.c.a.C2367a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ye.b$c$a$a r0 = (ye.C8656b.c.a.C2367a) r0
                    int r1 = r0.f66724b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f66724b = r1
                    goto L18
                L13:
                    ye.b$c$a$a r0 = new ye.b$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f66723a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f66724b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f66721a
                    androidx.lifecycle.k$b r5 = (androidx.lifecycle.AbstractC4013k.b) r5
                    androidx.lifecycle.k$b r2 = r4.f66722b
                    boolean r5 = r5.isAtLeast(r2)
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f66724b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ye.C8656b.c.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public c(InterfaceC3220g interfaceC3220g, AbstractC4013k.b bVar) {
            this.f66719a = interfaceC3220g;
            this.f66720b = bVar;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f66719a.b(new a(interfaceC3221h, this.f66720b), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    private C8656b() {
    }

    public static /* synthetic */ a c(C8656b c8656b, AbstractC8661g abstractC8661g, AbstractC4013k.b bVar, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = AbstractC4013k.b.STARTED;
        }
        return c8656b.b(abstractC8661g, bVar, interfaceC6824a);
    }

    public final InterfaceC3220g a(AbstractC8661g viewModel, AbstractC4013k.b isAtLeast, InterfaceC6824a streamFactory) {
        AbstractC6492s.i(viewModel, "viewModel");
        AbstractC6492s.i(isAtLeast, "isAtLeast");
        AbstractC6492s.i(streamFactory, "streamFactory");
        return AbstractC3222i.K(AbstractC3222i.C(AbstractC3222i.O(AbstractC3222i.n(new c(viewModel.i0(), isAtLeast)), new C2366b(null, streamFactory)), C3048c0.a()), O.a(viewModel), J.a.b(Li.J.f11860a, 0L, 0L, 3, null), 1);
    }

    public final a b(AbstractC8661g abstractC8661g, AbstractC4013k.b isAtLeast, InterfaceC6824a streamFactory) {
        AbstractC6492s.i(abstractC8661g, "<this>");
        AbstractC6492s.i(isAtLeast, "isAtLeast");
        AbstractC6492s.i(streamFactory, "streamFactory");
        return new a(abstractC8661g, isAtLeast, streamFactory);
    }
}
