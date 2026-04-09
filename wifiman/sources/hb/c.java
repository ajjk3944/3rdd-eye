package hb;

import Yg.InterfaceC3665i;
import Yg.J;
import Yg.z;
import com.ui.unifi.core.base.net.client.MissingDataClientException;
import eb.AbstractC5445i;
import eb.InterfaceC5443g;
import gg.D;
import gg.EnumC5911a;
import gg.s;
import gg.v;
import hb.AbstractC5972b;
import hb.c;
import hg.InterfaceC6043c;
import java.security.cert.Certificate;
import java.util.Iterator;
import java.util.List;
import jb.InterfaceC6263a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.InterfaceC6487m;
import lb.C6569c;
import lb.CloudCredentials;
import lb.UnifiCloudAccess;
import mb.DirectController;
import mb.x;
import mh.InterfaceC6835l;
import org.eclipse.paho.client.mqttv3.MqttException;
import tb.C8074u;
import tb.N;
import tb.V;

/* loaded from: classes3.dex */
public final class c extends AbstractC5971a {

    /* renamed from: e, reason: collision with root package name */
    private final String f48530e;

    /* renamed from: f, reason: collision with root package name */
    private final String f48531f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f48532g;

    /* renamed from: h, reason: collision with root package name */
    private final Gb.f f48533h;

    /* renamed from: i, reason: collision with root package name */
    private final C6569c f48534i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC6263a f48535j;

    /* renamed from: k, reason: collision with root package name */
    private final jb.i f48536k;

    /* renamed from: l, reason: collision with root package name */
    private final V.a f48537l;

    /* renamed from: m, reason: collision with root package name */
    private AbstractC5445i.a f48538m;

    /* renamed from: n, reason: collision with root package name */
    private final Hg.a f48539n;

    /* renamed from: o, reason: collision with root package name */
    private final s f48540o;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48541a;

        static {
            int[] iArr = new int[N.c.values().length];
            try {
                iArr[N.c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N.c.CREATE_OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N.c.SET_LOCAL_SDP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[N.c.SET_LOCAL_SDP_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[N.c.ICE_GATHERING_COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[N.c.REQUESTING_SDP_ANSWER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[N.c.SET_REMOTE_SDP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[N.c.SET_REMOTE_SDP_SUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[N.c.CONNECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f48541a = iArr;
        }
    }

    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5443g apply(C8074u it) {
            AbstractC6492s.i(it, "it");
            return c.this;
        }
    }

    /* renamed from: hb.c$c, reason: collision with other inner class name */
    static final class C1796c implements InterfaceC6465b {
        C1796c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pb.l apply(UnifiCloudAccess cloudConfig, CloudCredentials cloudCredentials) {
            AbstractC6492s.i(cloudConfig, "cloudConfig");
            AbstractC6492s.i(cloudCredentials, "cloudCredentials");
            return new pb.l(cloudConfig, cloudCredentials, c.this.f48534i);
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f48544a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v apply(pb.l it) {
            AbstractC6492s.i(it, "it");
            return it.l();
        }
    }

    static final class e implements InterfaceC6469f {
        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            c.this.m(AbstractC5972b.f.f48529a);
        }
    }

    static final class f implements InterfaceC6469f {
        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(pb.l it) {
            AbstractC6492s.i(it, "it");
            c.this.m(AbstractC5972b.d.f48527a);
        }
    }

    static final class g implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f48548a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ pb.l f48549b;

            a(c cVar, pb.l lVar) {
                this.f48548a = cVar;
                this.f48549b = lVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(c cVar, AbstractC5445i.a connectionType) {
                AbstractC6492s.i(connectionType, "connectionType");
                cVar.f48538m = connectionType;
                return J.f24997a;
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final v apply(CloudCredentials cloudCredentials) {
                AbstractC6492s.i(cloudCredentials, "cloudCredentials");
                V v10 = V.f61994a;
                String str = this.f48548a.f48530e;
                String str2 = this.f48548a.f48531f;
                Gb.f fVar = this.f48548a.f48533h;
                boolean z10 = this.f48548a.f48532g;
                pb.l lVar = this.f48549b;
                AbstractC6492s.f(lVar);
                C6569c c6569c = this.f48548a.f48534i;
                V.a aVar = this.f48548a.f48537l;
                final c cVar = this.f48548a;
                return v10.m(str, str2, fVar, cloudCredentials, lVar, c6569c, z10, aVar, new InterfaceC6835l() { // from class: hb.d
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return c.g.a.c(cVar, (AbstractC5445i.a) obj);
                    }
                });
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v apply(pb.l mqttClient) {
            AbstractC6492s.i(mqttClient, "mqttClient");
            return c.this.f48535j.b(false).v(new a(c.this, mqttClient));
        }
    }

    static final class h implements InterfaceC6469f {
        h() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C8074u webRtcClient) {
            AbstractC6492s.i(webRtcClient, "webRtcClient");
            c.this.f48539n.h(new hb.e(webRtcClient, new DirectController(false, false, false, null, null, null, null, null, null, null, null, 2047, null)));
        }
    }

    static final class i implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mb.j f48552b;

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ mb.j f48553a;

            a(mb.j jVar) {
                this.f48553a = jVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x apply(List controllers) throws MissingDataClientException {
                Object next;
                AbstractC6492s.i(controllers, "controllers");
                mb.j jVar = this.f48553a;
                Iterator it = controllers.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((x) next).getControllerType() == jVar) {
                        break;
                    }
                }
                x xVar = (x) next;
                if (xVar != null) {
                    return xVar;
                }
                throw new MissingDataClientException(this.f48553a);
            }
        }

        static final class b implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C8074u f48554a;

            b(C8074u c8074u) {
                this.f48554a = c8074u;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Yg.s apply(x it) {
                AbstractC6492s.i(it, "it");
                return z.a(this.f48554a, it);
            }
        }

        i(mb.j jVar) {
            this.f48552b = jVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(C8074u client) {
            AbstractC6492s.i(client, "client");
            return c.this.j().A(new a(this.f48552b)).A(new b(client));
        }
    }

    static final class j implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f48555a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hb.e apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Object objA = sVar.a();
            AbstractC6492s.h(objA, "component1(...)");
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            return new hb.e((C8074u) objA, (x) objC);
        }
    }

    static final class k implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f48557a;

            a(c cVar) {
                this.f48557a = cVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v apply(Throwable throwable) {
                AbstractC6492s.i(throwable, "throwable");
                if (throwable instanceof MqttException) {
                    s sVarY = this.f48557a.f48535j.b(true).Y();
                    AbstractC6492s.f(sVarY);
                    return sVarY;
                }
                s sVarL = s.L(throwable);
                AbstractC6492s.f(sVarL);
                return sVarL;
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v apply(s errors) {
            AbstractC6492s.i(errors, "errors");
            return errors.Q(new a(c.this));
        }
    }

    /* synthetic */ class l implements V.a, InterfaceC6487m {
        l() {
        }

        @Override // tb.V.a
        public final void a(N.c p02) {
            AbstractC6492s.i(p02, "p0");
            c.this.F(p02);
        }

        @Override // kotlin.jvm.internal.InterfaceC6487m
        public final InterfaceC3665i c() {
            return new C6490p(1, c.this, c.class, "onWebRtcStateChanged", "onWebRtcStateChanged(Lcom/ui/unifi/core/base/net/webrtc/WebRtcConnection$State;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof V.a) && (obj instanceof InterfaceC6487m)) {
                return AbstractC6492s.d(c(), ((InterfaceC6487m) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String appVersion, String deviceId, boolean z10, Gb.f storage, C6569c meta, InterfaceC6263a cloudAccess, jb.i cloudConfigProvider, InterfaceC5443g.b bVar) {
        super(deviceId, storage, bVar);
        AbstractC6492s.i(appVersion, "appVersion");
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(storage, "storage");
        AbstractC6492s.i(meta, "meta");
        AbstractC6492s.i(cloudAccess, "cloudAccess");
        AbstractC6492s.i(cloudConfigProvider, "cloudConfigProvider");
        this.f48530e = appVersion;
        this.f48531f = deviceId;
        this.f48532g = z10;
        this.f48533h = storage;
        this.f48534i = meta;
        this.f48535j = cloudAccess;
        this.f48536k = cloudConfigProvider;
        this.f48537l = new l();
        Hg.a aVarK1 = Hg.a.k1();
        AbstractC6492s.h(aVarK1, "create(...)");
        this.f48539n = aVarK1;
        s sVarL1 = D().G(new e()).F(new f()).Q(new g()).F(new h()).x0(1).l1();
        AbstractC6492s.h(sVarL1, "refCount(...)");
        this.f48540o = sVarL1;
    }

    private final gg.i C() {
        gg.i iVarD1 = this.f48540o.d1(EnumC5911a.LATEST);
        AbstractC6492s.h(iVarD1, "toFlowable(...)");
        return iVarD1;
    }

    private final s D() {
        s sVarV = gg.z.e0(this.f48536k.e(), this.f48535j.b(false), new C1796c()).v(d.f48544a);
        AbstractC6492s.h(sVarV, "flatMapObservable(...)");
        return G(sVarV);
    }

    private final AbstractC5972b E(N.c cVar) {
        switch (a.f48541a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
                return null;
            case 4:
                return AbstractC5972b.c.f48526a;
            case 5:
                return AbstractC5972b.C1795b.f48525a;
            case 8:
                return AbstractC5972b.e.f48528a;
            case 9:
                return AbstractC5972b.a.f48524a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(N.c cVar) {
        AbstractC5972b abstractC5972bE = E(cVar);
        if (abstractC5972bE != null) {
            m(abstractC5972bE);
        }
    }

    private final s G(s sVar) {
        s sVarA0 = sVar.A0(new k());
        AbstractC6492s.h(sVarA0, "retryWhen(...)");
        return sVarA0;
    }

    @Override // eb.InterfaceC5443g
    public gg.z a(mb.j type) {
        AbstractC6492s.i(type, "type");
        gg.z zVarA = C().o0().s(new i(type)).A(j.f48555a);
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    @Override // eb.InterfaceC5443g
    public gg.z b() {
        gg.z zVarP = this.f48539n.P();
        AbstractC6492s.h(zVarP, "firstOrError(...)");
        return zVarP;
    }

    @Override // eb.InterfaceC5443g
    public void c(Certificate[] certificates) {
        AbstractC6492s.i(certificates, "certificates");
    }

    @Override // eb.InterfaceC5443g
    public gg.i connect() {
        gg.i iVarN0 = C().N0(new b());
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }
}
