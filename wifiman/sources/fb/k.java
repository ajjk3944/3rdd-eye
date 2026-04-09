package fb;

import Yg.J;
import com.ui.unifi.core.base.net.client.MissingDataClientException;
import com.ui.unifi.core.base.net.client.http.HttpClientDisconnectedException;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import eb.AbstractC5439c;
import eb.InterfaceC5443g;
import fb.k;
import fb.o;
import gb.AuthorizeNcaRequest;
import gg.AbstractC5912b;
import gg.D;
import gg.EnumC5911a;
import gg.z;
import java.security.cert.Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.C6569c;
import mb.DirectController;
import mb.x;
import mh.InterfaceC6824a;
import okhttp3.logging.HttpLoggingInterceptor;
import wb.InterfaceC8291a;
import xb.AbstractC8444e;

/* loaded from: classes3.dex */
public final class k extends AbstractC5439c {

    /* renamed from: r, reason: collision with root package name */
    public static final a f47248r = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private final String f47249e;

    /* renamed from: f, reason: collision with root package name */
    private final String f47250f;

    /* renamed from: g, reason: collision with root package name */
    private final C6569c f47251g;

    /* renamed from: h, reason: collision with root package name */
    private final o f47252h;

    /* renamed from: i, reason: collision with root package name */
    private final Gb.f f47253i;

    /* renamed from: j, reason: collision with root package name */
    private final Ab.a f47254j;

    /* renamed from: k, reason: collision with root package name */
    private final Cb.a f47255k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f47256l;

    /* renamed from: m, reason: collision with root package name */
    private final s f47257m;

    /* renamed from: n, reason: collision with root package name */
    private final fb.e f47258n;

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f47259o;

    /* renamed from: p, reason: collision with root package name */
    private gg.j f47260p;

    /* renamed from: q, reason: collision with root package name */
    private final gg.i f47261q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5912b f47263b;

        b(AbstractC5912b abstractC5912b) {
            this.f47263b = abstractC5912b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(k kVar) {
            kVar.f47256l = true;
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean bool) {
            if (!bool.booleanValue()) {
                k.this.f47253i.i(null);
            }
            if (bool.booleanValue()) {
                return AbstractC5912b.m();
            }
            AbstractC5912b abstractC5912b = this.f47263b;
            final k kVar = k.this;
            return abstractC5912b.x(new InterfaceC6464a() { // from class: fb.l
                @Override // kg.InterfaceC6464a
                public final void run() {
                    k.b.c(kVar);
                }
            });
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f47264a;

        c(InterfaceC6824a interfaceC6824a) {
            this.f47264a = interfaceC6824a;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof UnauthorisedException ? (gg.f) this.f47264a.invoke() : AbstractC5912b.D(error);
        }
    }

    static final class d implements kg.n {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k c(k kVar) {
            return kVar;
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final D apply(J it) {
            AbstractC6492s.i(it, "it");
            k kVar = k.this;
            AbstractC5912b abstractC5912bC = kVar.C(kVar.f47252h);
            final k kVar2 = k.this;
            return abstractC5912bC.g0(new kg.q() { // from class: fb.m
                @Override // kg.q
                public final Object get() {
                    return k.d.c(kVar2);
                }
            });
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f47266a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(k kVar) {
            return gg.i.W0();
        }
    }

    /* synthetic */ class f extends C6490p implements InterfaceC6824a {
        f(Object obj) {
            super(0, obj, k.class, "onDataClientUnauthorizedException", "onDataClientUnauthorizedException()V", 0);
        }

        public final void a() {
            ((k) this.receiver).N();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mb.j f47267a;

        g(mb.j jVar) {
            this.f47267a = jVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x apply(List controllers) throws MissingDataClientException {
            Object next;
            AbstractC6492s.i(controllers, "controllers");
            mb.j jVar = this.f47267a;
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
            throw new MissingDataClientException(this.f47267a);
        }
    }

    static final class h implements kg.n {

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {
            a(Object obj) {
                super(0, obj, k.class, "onDataClientUnauthorizedException", "onDataClientUnauthorizedException()V", 0);
            }

            public final void a() {
                ((k) this.receiver).N();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n apply(x controller) {
            AbstractC6492s.i(controller, "controller");
            return new n(k.this.f47258n, controller, k.this.f47251g, new a(k.this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String host, String str, String macAddress, C6569c meta, o options, Gb.f storage, Ab.a ssoClient, InterfaceC8291a interfaceC8291a, HttpLoggingInterceptor.Level httpLogLevel, Cb.a trustedDeviceHelper) {
        super(str, storage, null);
        AbstractC6492s.i(host, "host");
        AbstractC6492s.i(macAddress, "macAddress");
        AbstractC6492s.i(meta, "meta");
        AbstractC6492s.i(options, "options");
        AbstractC6492s.i(storage, "storage");
        AbstractC6492s.i(ssoClient, "ssoClient");
        AbstractC6492s.i(httpLogLevel, "httpLogLevel");
        AbstractC6492s.i(trustedDeviceHelper, "trustedDeviceHelper");
        this.f47249e = host;
        this.f47250f = macAddress;
        this.f47251g = meta;
        this.f47252h = options;
        this.f47253i = storage;
        this.f47254j = ssoClient;
        this.f47255k = trustedDeviceHelper;
        s sVar = new s(macAddress, storage);
        this.f47257m = sVar;
        this.f47258n = new fb.e(host, macAddress, storage, sVar, interfaceC8291a, httpLogLevel, trustedDeviceHelper);
        this.f47259o = Yg.n.b(new InterfaceC6824a() { // from class: fb.f
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return k.J(this.f47241a);
            }
        });
        gg.i iVarX0 = gg.i.N(new gg.k() { // from class: fb.g
            @Override // gg.k
            public final void a(gg.j jVar) {
                k.I(this.f47242a, jVar);
            }
        }, EnumC5911a.MISSING).x0(new d());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        gg.i iVarK2 = iVarX0.a2(gg.i.d2(30L, timeUnit), e.f47266a).o1(1).k2(10L, timeUnit);
        AbstractC6492s.h(iVarK2, "refCount(...)");
        gg.i iVarN = iVarK2.n(InterfaceC5443g.class);
        AbstractC6492s.h(iVarN, "cast(R::class.java)");
        this.f47261q = iVarN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b C(o oVar) {
        if (!(oVar instanceof o.a)) {
            throw new NoWhenBranchMatchedException();
        }
        String strH = this.f47254j.h();
        if (strH != null) {
            return D(L(strH, ((o.a) oVar).a()));
        }
        AbstractC5912b abstractC5912bD = AbstractC5912b.D(new UnauthorisedException("NCA auth not possible, missing ssoId", null, 2, null));
        AbstractC6492s.f(abstractC5912bD);
        return abstractC5912bD;
    }

    private final AbstractC5912b D(AbstractC5912b abstractC5912b) {
        AbstractC5912b abstractC5912bT = z.x(new Callable() { // from class: fb.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.E(this.f47243a);
            }
        }).t(new b(abstractC5912b));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean E(k kVar) {
        return Boolean.valueOf(kVar.f47256l);
    }

    private final AbstractC5912b F() {
        AbstractC5912b abstractC5912bE = AbstractC5912b.E(new InterfaceC6464a() { // from class: fb.j
            @Override // kg.InterfaceC6464a
            public final void run() throws UnauthorisedException {
                k.G(this.f47247a);
            }
        });
        AbstractC5912b abstractC5912bY = l().y();
        AbstractC6492s.h(abstractC5912bY, "ignoreElement(...)");
        AbstractC5912b abstractC5912bG = abstractC5912bE.g(AbstractC8444e.b(abstractC5912bY));
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        return abstractC5912bG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(k kVar) throws UnauthorisedException {
        if (kVar.f47257m.a() == null) {
            throw new UnauthorisedException(null, null, 3, null);
        }
    }

    private final AbstractC5912b H(InterfaceC6824a interfaceC6824a) {
        AbstractC5912b abstractC5912bO = F().O(new c(interfaceC6824a));
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        return abstractC5912bO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(k kVar, gg.j emitter) {
        AbstractC6492s.i(emitter, "emitter");
        kVar.f47260p = emitter;
        emitter.h(J.f24997a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n J(k kVar) {
        return new n(kVar.f47258n, new DirectController(false, false, false, null, null, null, null, null, null, null, null, 2047, null), kVar.f47251g, new f(kVar));
    }

    private final InterfaceC5443g.c K() {
        return (InterfaceC5443g.c) this.f47259o.getValue();
    }

    private final AbstractC5912b L(final String str, final String str2) {
        return H(new InterfaceC6824a() { // from class: fb.i
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return k.M(this.f47244a, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b M(k kVar, String str, String str2) {
        AbstractC5912b abstractC5912bY = fb.c.b(kVar.f47258n.c().n(new AuthorizeNcaRequest(str, str2))).y();
        AbstractC6492s.h(abstractC5912bY, "ignoreElement(...)");
        return abstractC5912bY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        gg.j jVar = this.f47260p;
        if (jVar == null) {
            AbstractC6492s.v("connectionStreamEmitter");
            jVar = null;
        }
        jVar.c(new HttpClientDisconnectedException());
    }

    @Override // eb.InterfaceC5443g
    public z a(mb.j type) {
        AbstractC6492s.i(type, "type");
        z zVarA = j().A(new g(type)).A(new h());
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    @Override // eb.InterfaceC5443g
    public z b() {
        z zVarZ = z.z(K());
        AbstractC6492s.h(zVarZ, "just(...)");
        return zVarZ;
    }

    @Override // eb.InterfaceC5443g
    public void c(Certificate[] certificates) {
        AbstractC6492s.i(certificates, "certificates");
        this.f47258n.g(certificates);
    }

    @Override // eb.InterfaceC5443g
    public gg.i connect() {
        return this.f47261q;
    }
}
