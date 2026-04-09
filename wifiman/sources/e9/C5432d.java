package e9;

import T8.d;
import Yg.J;
import Zg.AbstractC3689v;
import e9.C5432d;
import e9.InterfaceC5431c;
import f9.AbstractC5800a;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.o;
import gg.q;
import gg.r;
import gg.s;
import gg.z;
import hg.InterfaceC6043c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k9.AbstractC6410e;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kg.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l9.C6556a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: e9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5432d {

    /* renamed from: a, reason: collision with root package name */
    private final T8.d f46261a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5431c f46262b;

    /* renamed from: c, reason: collision with root package name */
    private final s f46263c;

    /* renamed from: d, reason: collision with root package name */
    private final s f46264d;

    /* renamed from: e9.d$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C5432d.this + " Instantiated";
        }
    }

    /* renamed from: e9.d$b */
    static final class b implements n {
        b() {
        }

        public final InterfaceC5431c.b a(byte[] it) {
            AbstractC6492s.i(it, "it");
            return C5432d.this.f46262b.a(it);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((d.a) obj).f());
        }
    }

    /* renamed from: e9.d$c */
    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f46267a = new c();

        /* renamed from: e9.d$c$a */
        public static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5431c.b f46268a;

            public a(InterfaceC5431c.b bVar) {
                this.f46268a = bVar;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    InterfaceC5429a message = this.f46268a.getMessage();
                    if (message != null) {
                        oVar.onSuccess(message);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(InterfaceC5431c.b it) {
            AbstractC6492s.i(it, "it");
            gg.n nVarC = gg.n.c(new a(it));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: e9.d$d, reason: collision with other inner class name */
    public static final class C1735d implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5429a f46270b;

        public C1735d(InterfaceC5429a interfaceC5429a) {
            this.f46270b = interfaceC5429a;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(C5432d.this.f46262b.b(this.f46270b));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: e9.d$e */
    static final class e implements n {

        /* renamed from: e9.d$e$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5432d f46272a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5431c.a f46273b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5432d c5432d, InterfaceC5431c.a aVar) {
                super(0);
                this.f46272a = c5432d;
                this.f46273b = aVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f46272a + " There is nothing to send in " + this.f46273b + ". SKIPPING Packet";
            }
        }

        /* renamed from: e9.d$e$b */
        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5432d f46274a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5431c.a f46275b;

            /* renamed from: e9.d$e$b$a */
            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C5432d f46276a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5431c.a f46277b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f46278c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C5432d c5432d, InterfaceC5431c.a aVar, long j10) {
                    super(0);
                    this.f46276a = c5432d;
                    this.f46277b = aVar;
                    this.f46278c = j10;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return this.f46276a + " SENDING [" + this.f46277b + "] took " + this.f46278c + " ms";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C5432d c5432d, InterfaceC5431c.a aVar) {
                super(1);
                this.f46274a = c5432d;
                this.f46275b = aVar;
            }

            public final void a(long j10) {
                AbstractC5800a.b(new a(this.f46274a, this.f46275b, j10));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return J.f24997a;
            }
        }

        /* renamed from: e9.d$e$c */
        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5432d f46279a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5431c.a f46280b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C5432d c5432d, InterfaceC5431c.a aVar) {
                super(0);
                this.f46279a = c5432d;
                this.f46280b = aVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f46279a + " SENT [" + this.f46280b + "]";
            }
        }

        /* renamed from: e9.d$e$d, reason: collision with other inner class name */
        static final class C1736d implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5432d f46281a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5431c.a f46282b;

            /* renamed from: e9.d$e$d$a */
            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C5432d f46283a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5431c.a f46284b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C5432d c5432d, InterfaceC5431c.a aVar) {
                    super(0);
                    this.f46283a = c5432d;
                    this.f46284b = aVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return this.f46283a + " " + this.f46284b;
                }
            }

            C1736d(C5432d c5432d, InterfaceC5431c.a aVar) {
                this.f46281a = c5432d;
                this.f46282b = aVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                AbstractC5800a.b(new a(this.f46281a, this.f46282b));
            }
        }

        /* renamed from: e9.d$e$e, reason: collision with other inner class name */
        static final class C1737e implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1737e f46285a = new C1737e();

            C1737e() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(InterfaceC5431c.b it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it.getMessage());
            }
        }

        /* renamed from: e9.d$e$f */
        static final class f implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5432d f46286a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5431c.a f46287b;

            /* renamed from: e9.d$e$f$a */
            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C5432d f46288a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5431c.a f46289b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C5432d c5432d, InterfaceC5431c.a aVar) {
                    super(0);
                    this.f46288a = c5432d;
                    this.f46289b = aVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return this.f46288a + " RESPONSE RECEIVED for [" + this.f46289b + "]";
                }
            }

            f(C5432d c5432d, InterfaceC5431c.a aVar) {
                this.f46286a = c5432d;
                this.f46287b = aVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(C6556a it) {
                AbstractC6492s.i(it, "it");
                AbstractC5800a.b(new a(this.f46286a, this.f46287b));
            }
        }

        /* renamed from: e9.d$e$g */
        static final class g extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5432d f46290a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5431c.a f46291b;

            /* renamed from: e9.d$e$g$a */
            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C5432d f46292a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5431c.a f46293b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f46294c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C5432d c5432d, InterfaceC5431c.a aVar, long j10) {
                    super(0);
                    this.f46292a = c5432d;
                    this.f46293b = aVar;
                    this.f46294c = j10;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return this.f46292a + " RESPONSE WAIT for [" + this.f46293b + "] took " + this.f46294c + " ms";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(C5432d c5432d, InterfaceC5431c.a aVar) {
                super(1);
                this.f46290a = c5432d;
                this.f46291b = aVar;
            }

            public final void a(long j10) {
                AbstractC5800a.b(new a(this.f46290a, this.f46291b, j10));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return J.f24997a;
            }
        }

        /* renamed from: e9.d$e$h */
        public static final class h implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5432d f46295a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5431c.a f46296b;

            public h(C5432d c5432d, InterfaceC5431c.a aVar) {
                this.f46295a = c5432d;
                this.f46296b = aVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    AbstractC5800a.b(new a(this.f46295a, this.f46296b));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(C5432d this$0, InterfaceC5431c.a packResult) {
            AbstractC6492s.i(this$0, "this$0");
            AbstractC6492s.i(packResult, "$packResult");
            AbstractC5800a.b(new c(this$0, packResult));
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final D apply(final InterfaceC5431c.a packResult) {
            AbstractC5912b abstractC5912bE;
            z zVarF;
            AbstractC6492s.i(packResult, "packResult");
            if (packResult.a().isEmpty()) {
                abstractC5912bE = AbstractC5912b.r(new h(C5432d.this, packResult));
                AbstractC6492s.h(abstractC5912bE, "crossinline action: () -…or(error)\n        }\n    }");
            } else {
                T8.d dVarC = C5432d.this.c();
                List listA = packResult.a();
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(listA, 10));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(d.a.a(d.a.b((byte[]) it.next())));
                }
                abstractC5912bE = AbstractC6410e.e(dVarC.b(arrayList), new b(C5432d.this, packResult));
            }
            final C5432d c5432d = C5432d.this;
            AbstractC5912b abstractC5912bX = abstractC5912bE.x(new InterfaceC6464a() { // from class: e9.e
                @Override // kg.InterfaceC6464a
                public final void run() {
                    C5432d.e.c(c5432d, packResult);
                }
            });
            if (packResult instanceof InterfaceC5431c.a.InterfaceC1734a) {
                zVarF = z.z(new C6556a(null));
                AbstractC6492s.h(zVarF, "just(NullableValue(null))");
            } else {
                if (!(packResult instanceof InterfaceC5431c.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                z zVarO = C5432d.this.f((InterfaceC5431c.a.b) packResult).n(new C1736d(C5432d.this, packResult)).A(C1737e.f46285a).o(new f(C5432d.this, packResult));
                AbstractC6492s.h(zVarO, "override fun send(msg: M…          )\n            }");
                zVarF = AbstractC6410e.f(zVarO, new g(C5432d.this, packResult));
            }
            return abstractC5912bX.k(zVarF);
        }
    }

    /* renamed from: e9.d$f */
    static final class f implements p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5431c.a.b f46297a;

        f(InterfaceC5431c.a.b bVar) {
            this.f46297a = bVar;
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(InterfaceC5431c.b it) {
            AbstractC6492s.i(it, "it");
            return this.f46297a.b(it);
        }
    }

    public C5432d(T8.d btleSession, InterfaceC5431c packeter) {
        AbstractC6492s.i(btleSession, "btleSession");
        AbstractC6492s.i(packeter, "packeter");
        this.f46261a = btleSession;
        this.f46262b = packeter;
        AbstractC5800a.b(new a());
        s sVarL1 = btleSession.a().i0(new b()).x0(1).l1();
        AbstractC6492s.h(sVarL1, "btleSession.receive\n    …)\n            .refCount()");
        this.f46263c = sVarL1;
        s sVarL12 = sVarL1.W(c.f46267a).x0(1).l1();
        AbstractC6492s.h(sVarL12, "incomingPackets\n        …)\n            .refCount()");
        this.f46264d = sVarL12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z f(InterfaceC5431c.a.b bVar) {
        z zVarP = this.f46263c.N(new f(bVar)).P();
        AbstractC6492s.h(zVarP, "UiCommunicationPacketer.…          .firstOrError()");
        return zVarP;
    }

    public final T8.d c() {
        return this.f46261a;
    }

    public s d() {
        return this.f46264d;
    }

    public z e(InterfaceC5429a msg) {
        AbstractC6492s.i(msg, "msg");
        z zVarI = z.i(new C1735d(msg));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarS = zVarI.s(new e());
        AbstractC6492s.h(zVarS, "Msg : UiCommunication.Me…          )\n            }");
        return zVarS;
    }

    public String toString() {
        return "UiCommunicationSession[" + hashCode() + "]";
    }
}
