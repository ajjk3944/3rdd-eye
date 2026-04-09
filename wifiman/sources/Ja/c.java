package Ja;

import Ii.C3048c0;
import Ja.a;
import Ja.c;
import Ki.r;
import Ki.t;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import speedtest.ChangedCallback;
import speedtest.Speedtest;
import speedtest.SpeedtestError;
import speedtest.SpeedtestServer;
import speedtest.SpeedtestServerParams;
import speedtest.SpeedtestServerStatus;

/* loaded from: classes3.dex */
public final class c implements Ja.a {

    /* renamed from: b, reason: collision with root package name */
    private final a.b f9961b;

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f9962a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9963b;

        /* renamed from: Ja.c$a$a, reason: collision with other inner class name */
        static final class C0401a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SpeedtestServer f9965a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0401a(SpeedtestServer speedtestServer) {
                super(0);
                this.f9965a = speedtestServer;
            }

            public final void a() {
                this.f9965a.stop();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(SpeedtestServer speedtestServer, t tVar) {
            a.c cVar;
            SpeedtestServerStatus status = speedtestServer.getStatus();
            if (status.getErr() != null) {
                SpeedtestError err = status.getErr();
                if (err != null) {
                    tVar.f(com.ui.speedtest.a.a(err));
                    return;
                }
                return;
            }
            long state = status.getState();
            if (state == 0) {
                cVar = a.c.OFF;
            } else if (state == 1) {
                cVar = a.c.STARTING;
            } else if (state == 2) {
                cVar = a.c.IDLE;
            } else {
                if (state != 3) {
                    throw new IllegalStateException("Unknown server state " + status.getState());
                }
                cVar = a.c.ACTIVE;
            }
            Long lValueOf = Long.valueOf(status.getPort());
            if (lValueOf.longValue() == 0) {
                lValueOf = null;
            }
            tVar.k(new a.d(cVar, lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null, (int) status.getConnectionCount()));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = c.this.new a(interfaceC5380e);
            aVar.f9963b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f9962a;
            if (i10 == 0) {
                v.b(obj);
                final t tVar = (t) this.f9963b;
                c cVar = c.this;
                final SpeedtestServer speedtestServerNewSpeedtestServer = Speedtest.newSpeedtestServer(cVar.b(cVar.c()));
                speedtestServerNewSpeedtestServer.start(new ChangedCallback() { // from class: Ja.b
                    @Override // speedtest.ChangedCallback
                    public final void onChanged() {
                        c.a.t(speedtestServerNewSpeedtestServer, tVar);
                    }
                });
                C0401a c0401a = new C0401a(speedtestServerNewSpeedtestServer);
                this.f9962a = 1;
                if (r.a(tVar, c0401a, this) == objG) {
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
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, InterfaceC5380e interfaceC5380e) {
            return ((a) create(tVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f9966a;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f9968a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.f9968a = cVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Server Status " + this.f9968a.c().hashCode() + " subscribed";
            }
        }

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return c.this.new b(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f9966a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            La.a.b(new a(c.this));
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: Ja.c$c, reason: collision with other inner class name */
    static final class C0402c extends l implements q {

        /* renamed from: a, reason: collision with root package name */
        int f9969a;

        /* renamed from: Ja.c$c$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f9971a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.f9971a = cVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Server Status " + this.f9971a.c().hashCode() + " completed";
            }
        }

        C0402c(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f9969a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            La.a.b(new a(c.this));
            return J.f24997a;
        }

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Throwable th2, InterfaceC5380e interfaceC5380e) {
            return c.this.new C0402c(interfaceC5380e).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f9972a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9973b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a.d f9974a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a.d dVar) {
                super(0);
                this.f9974a = dVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Server Status State: " + this.f9974a.c() + ", port: " + this.f9974a.b() + ", connections: " + this.f9974a.a();
            }
        }

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(interfaceC5380e);
            dVar.f9973b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f9972a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            La.a.b(new a((a.d) this.f9973b));
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.d dVar, InterfaceC5380e interfaceC5380e) {
            return ((d) create(dVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public c(a.b params) {
        AbstractC6492s.i(params, "params");
        this.f9961b = params;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpeedtestServerParams b(a.b bVar) {
        SpeedtestServerParams speedtestServerParams = new SpeedtestServerParams();
        speedtestServerParams.setHttpServer(bVar.a());
        speedtestServerParams.setTcpServer(bVar.b());
        return speedtestServerParams;
    }

    public final a.b c() {
        return this.f9961b;
    }

    @Override // Ja.a
    public InterfaceC3220g start() {
        return AbstractC3222i.C(AbstractC3222i.I(AbstractC3222i.H(AbstractC3222i.J(AbstractC3222i.e(new a(null)), new b(null)), new C0402c(null)), new d(null)), C3048c0.a());
    }
}
