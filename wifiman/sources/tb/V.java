package tb;

import Zg.AbstractC3689v;
import hg.InterfaceC6043c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import lb.C6569c;
import lb.CloudCredentials;
import lb.TurnCredentials;
import mh.InterfaceC6835l;
import org.webrtc.PeerConnection;
import tb.N;

/* loaded from: classes3.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final V f61994a = new V();

    /* renamed from: b, reason: collision with root package name */
    private static final ib.h f61995b = new ib.h();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f61996c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final Map f61997d = new LinkedHashMap();

    public interface a {
        void a(N.c cVar);
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f61998a;

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f61999a;

            a(String str) {
                this.f61999a = str;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(N.c it) {
                AbstractC6492s.i(it, "it");
                V.f61994a.p(this.f61999a, it);
            }
        }

        /* renamed from: tb.V$b$b, reason: collision with other inner class name */
        static final class C2175b implements kg.p {

            /* renamed from: a, reason: collision with root package name */
            public static final C2175b f62000a = new C2175b();

            C2175b() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(N.c it) {
                AbstractC6492s.i(it, "it");
                return it == N.c.CONNECTED;
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8074u f62001a;

            c(C8074u c8074u) {
                this.f62001a = c8074u;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C8074u apply(N.c it) {
                AbstractC6492s.i(it, "it");
                return this.f62001a;
            }
        }

        b(String str) {
            this.f61998a = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.v apply(C8074u c8074u) {
            return c8074u.e().F(new a(this.f61998a)).N(C2175b.f62000a).i0(new c(c8074u));
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f62002a = new c();

        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            V.f61994a.l().i();
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62003a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62004b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Gb.f f62005c;

        d(String str, String str2, Gb.f fVar) {
            this.f62003a = str;
            this.f62004b = str2;
            this.f62005c = fVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            V.f61994a.q(this.f62003a, this.f62004b, this.f62005c);
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final e f62006a = new e();

        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C8074u it) {
            AbstractC6492s.i(it, "it");
            V.f61994a.l().j();
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f62007a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Sj.a.f20830a.p(it, "Error while sending logs", new Object[0]);
        }
    }

    private V() {
    }

    private final void g(String str, a aVar) {
        List list;
        Map map = f61997d;
        synchronized (map) {
            try {
                Object arrayList = map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(str, arrayList);
                }
                list = (List) arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (list) {
            list.add(aVar);
        }
    }

    private final void h(String str) {
        Map map = f61997d;
        synchronized (map) {
        }
    }

    private final gg.s i(final String str, final CloudCredentials cloudCredentials, final pb.l lVar, final C6569c c6569c, final boolean z10, final InterfaceC6835l interfaceC6835l) {
        gg.s sVarV = gg.z.x(new Callable() { // from class: tb.U
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return V.j(str, cloudCredentials, lVar, c6569c, z10, interfaceC6835l);
            }
        }).v(new b(str));
        AbstractC6492s.h(sVarV, "flatMapObservable(...)");
        return sVarV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8074u j(String str, CloudCredentials cloudCredentials, pb.l lVar, C6569c c6569c, boolean z10, InterfaceC6835l interfaceC6835l) {
        return new C8074u(f61994a.k(str, cloudCredentials, lVar, c6569c, z10, interfaceC6835l));
    }

    private final N k(String str, CloudCredentials cloudCredentials, pb.l lVar, C6569c c6569c, boolean z10, InterfaceC6835l interfaceC6835l) {
        TurnCredentials turnCredentials = cloudCredentials.getTurnCredentials();
        N n10 = new N(AbstractC3689v.e(PeerConnection.IceServer.builder((List<String>) turnCredentials.getTurnUris()).setUsername(turnCredentials.getUsername()).setPassword(turnCredentials.getPassword()).createIceServer()), str, lVar, c6569c, z10);
        n10.B0(interfaceC6835l);
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.s n(C8074u it) {
        AbstractC6492s.i(it, "it");
        return gg.s.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(String str, String str2) {
        f61995b.j();
        Map map = f61996c;
        synchronized (map) {
        }
        f61994a.h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(String str, N.c cVar) {
        List list;
        Map map = f61997d;
        synchronized (map) {
            list = (List) map.get(str);
        }
        if (list == null) {
            return;
        }
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(cVar);
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(String str, final String str2, final Gb.f fVar) {
        ib.h hVar = f61995b;
        List listH = hVar.h();
        hVar.j();
        if (listH.isEmpty()) {
            return;
        }
        Long lI = fVar.I(str2);
        if (System.currentTimeMillis() - (lI != null ? lI.longValue() : 0L) > 3600000) {
            AbstractC6492s.f(new ib.d(str).h(fVar.w(str2), listH).U(new InterfaceC6464a() { // from class: tb.T
                @Override // kg.InterfaceC6464a
                public final void run() {
                    V.r(fVar, str2);
                }
            }, f.f62007a));
        } else {
            Sj.a.f20830a.a("Not sending logs since I already did send some recently!", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Gb.f fVar, String str) {
        Sj.a.f20830a.a("Logs sent!", new Object[0]);
        fVar.H(str, System.currentTimeMillis());
    }

    public final ib.h l() {
        return f61995b;
    }

    public final gg.s m(String appVersion, final String deviceId, Gb.f storage, CloudCredentials cloudCredentials, pb.l mqttClient, C6569c meta, boolean z10, a webRtcConnectionStateListener, InterfaceC6835l onConnectionInfoDetermined) {
        gg.s sVar;
        AbstractC6492s.i(appVersion, "appVersion");
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(storage, "storage");
        AbstractC6492s.i(cloudCredentials, "cloudCredentials");
        AbstractC6492s.i(mqttClient, "mqttClient");
        AbstractC6492s.i(meta, "meta");
        AbstractC6492s.i(webRtcConnectionStateListener, "webRtcConnectionStateListener");
        AbstractC6492s.i(onConnectionInfoDetermined, "onConnectionInfoDetermined");
        g(deviceId, webRtcConnectionStateListener);
        Map map = f61996c;
        synchronized (map) {
            try {
                final String str = deviceId + storage.h();
                Object objN1 = map.get(str);
                if (objN1 == null) {
                    gg.s sVarI = f61994a.i(deviceId, cloudCredentials, mqttClient, meta, z10, onConnectionInfoDetermined);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    objN1 = sVarI.Y0(gg.s.b1(30L, timeUnit), new kg.n() { // from class: tb.Q
                        @Override // kg.n
                        public final Object apply(Object obj) {
                            return V.n((C8074u) obj);
                        }
                    }).G(c.f62002a).D(new d(appVersion, deviceId, storage)).y(new InterfaceC6464a() { // from class: tb.S
                        @Override // kg.InterfaceC6464a
                        public final void run() {
                            V.o(deviceId, str);
                        }
                    }).F(e.f62006a).x0(1).n1(10L, timeUnit);
                    AbstractC6492s.h(objN1, "refCount(...)");
                    map.put(str, objN1);
                }
                sVar = (gg.s) objN1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
