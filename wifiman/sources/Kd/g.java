package kd;

import Ii.N;
import W7.c;
import Wc.b;
import Yg.J;
import Yg.v;
import Zc.e;
import dh.InterfaceC5380e;
import ee.AbstractC5456b;
import eh.AbstractC5467b;
import fe.AbstractC5817h;
import gg.D;
import gg.i;
import gg.z;
import java.net.InetAddress;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kg.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import td.InterfaceC8082d;

/* loaded from: classes4.dex */
public final class g implements InterfaceC6454d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f51402c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final z f51403a;

    /* renamed from: b, reason: collision with root package name */
    private final i f51404b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f51405a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8082d f51406b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC8082d interfaceC8082d, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f51406b = interfaceC8082d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f51406b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f51405a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return this.f51406b.b(null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f51408a;

            /* renamed from: kd.g$c$a$a, reason: collision with other inner class name */
            static final class C1903a extends l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f51409a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Ia.a f51410b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1903a(Ia.a aVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f51410b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C1903a(this.f51410b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f51409a;
                    if (i10 == 0) {
                        v.b(obj);
                        Ia.a aVar = this.f51410b;
                        this.f51409a = 1;
                        obj = aVar.b(this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v.b(obj);
                    }
                    return obj;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C1903a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            static final class b implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f51411a;

                b(g gVar) {
                    this.f51411a = gVar;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C6455e apply(La.b it) {
                    AbstractC6492s.i(it, "it");
                    return this.f51411a.e(it);
                }
            }

            a(g gVar) {
                this.f51408a = gVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(Ia.a it) {
                AbstractC6492s.i(it, "it");
                return Qi.l.c(null, new C1903a(it, null), 1, null).A(new b(this.f51408a)).O(Gg.a.d()).E(Gg.a.a());
            }
        }

        static final class b implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f51412a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(i it) {
                AbstractC6492s.i(it, "it");
                return it.R(5000L, TimeUnit.MILLISECONDS);
            }
        }

        /* renamed from: kd.g$c$c, reason: collision with other inner class name */
        static final class C1904c implements p {

            /* renamed from: a, reason: collision with root package name */
            public static final C1904c f51413a = new C1904c();

            C1904c() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(Wc.b it) {
                AbstractC6492s.i(it, "it");
                return it instanceof b.a.C0897b;
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Zc.e networkConnection) {
            AbstractC6492s.i(networkConnection, "networkConnection");
            if (networkConnection.f() != e.b.CONNECTED) {
                return i.K0(new b.c());
            }
            i iVarW = g.this.f51403a.s(new a(g.this)).W();
            AbstractC6492s.h(iVarW, "toFlowable(...)");
            return AbstractC5817h.e(iVarW, null, 1, null).n1(b.f51412a).R1(C1904c.f51413a);
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f51414a = new d();

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("PublicIP status Subscribed", null, 2, null);
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final e f51415a = new e();

        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Wc.b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("PublicIP status: " + it, null, 2, null);
        }
    }

    public g(Zc.f networkConnectionManager, InterfaceC8082d clientFactory) {
        AbstractC6492s.i(networkConnectionManager, "networkConnectionManager");
        AbstractC6492s.i(clientFactory, "clientFactory");
        z zVarE = Qi.l.c(null, new b(clientFactory, null), 1, null).e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f51403a = zVarE;
        i iVarI2 = networkConnectionManager.getState().I1(new c()).x1(i.K0(new b.C0898b(null, 1, null))).W().g0(d.f51414a).f0(e.f51415a).Z(new InterfaceC6464a() { // from class: kd.f
            @Override // kg.InterfaceC6464a
            public final void run() {
                g.f();
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f51404b = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6455e e(La.b bVar) {
        W7.c cVar;
        InetAddress inetAddressF = bVar.f();
        inet.ipaddr.g gVarA = inetAddressF != null ? AbstractC5456b.a(inetAddressF) : null;
        String strC = bVar.c();
        URL urlB = bVar.b();
        String strA = bVar.a();
        if (bVar.d() == null || bVar.e() == null) {
            cVar = null;
        } else {
            Double d10 = bVar.d();
            AbstractC6492s.f(d10);
            double dDoubleValue = d10.doubleValue();
            Double dE = bVar.e();
            AbstractC6492s.f(dE);
            cVar = new W7.c(new c.a(dDoubleValue, dE.doubleValue()), null, 2, null);
        }
        return new C6455e(gVarA, strC, urlB, strA, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        Z7.b.h("PublicIP status Finished", null, 2, null);
    }

    @Override // kd.InterfaceC6454d
    public i a() {
        return this.f51404b;
    }
}
