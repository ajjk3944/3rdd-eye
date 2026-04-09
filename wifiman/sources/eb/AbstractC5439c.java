package eb;

import Zg.AbstractC3689v;
import aj.AbstractC3868b;
import eb.AbstractC5439c;
import eb.InterfaceC5443g;
import gb.Apps;
import gb.SystemInfo;
import gg.D;
import gg.z;
import java.nio.ByteBuffer;
import java.util.List;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import ob.User;
import ub.C8156c;
import vb.AbstractC8205a;

/* renamed from: eb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5439c implements InterfaceC5443g {

    /* renamed from: a, reason: collision with root package name */
    private final String f46330a;

    /* renamed from: b, reason: collision with root package name */
    private final Gb.f f46331b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f46332c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f46333d;

    /* renamed from: eb.c$a */
    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46334a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Apps apply(SystemInfo it) {
            AbstractC6492s.i(it, "it");
            return it.getApps();
        }
    }

    /* renamed from: eb.c$b */
    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f46335a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(Apps apps) {
            AbstractC6492s.i(apps, "apps");
            return AbstractC3689v.y(AbstractC3689v.o(apps.getApps(), apps.getControllers()));
        }
    }

    /* renamed from: eb.c$c, reason: collision with other inner class name */
    static final class C1739c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1739c f46336a = new C1739c();

        C1739c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(InterfaceC5443g.c dataClient) {
            AbstractC6492s.i(dataClient, "dataClient");
            return dataClient.b("/api/users/self", kb.o.GET, null, null);
        }
    }

    /* renamed from: eb.c$d */
    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f46337a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final User apply(byte[] it) {
            AbstractC6492s.i(it, "it");
            AbstractC3868b abstractC3868bD = C8156c.f62925a.d();
            String strY = t.y(it);
            abstractC3868bD.a();
            return (User) abstractC3868bD.b(User.INSTANCE.serializer(), strY);
        }
    }

    /* renamed from: eb.c$e */
    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f46338a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(InterfaceC5443g.c dataClient) {
            AbstractC6492s.i(dataClient, "dataClient");
            return dataClient.b("/api/system", kb.o.GET, null, null);
        }
    }

    /* renamed from: eb.c$f */
    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f46339a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(byte[] it) {
            AbstractC6492s.i(it, "it");
            return t.y(it);
        }
    }

    /* renamed from: eb.c$h */
    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f46341a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SystemInfo apply(String it) {
            AbstractC6492s.i(it, "it");
            AbstractC3868b abstractC3868bD = C8156c.f62925a.d();
            abstractC3868bD.a();
            return (SystemInfo) abstractC3868bD.b(SystemInfo.INSTANCE.serializer(), it);
        }
    }

    /* renamed from: eb.c$j */
    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f46343a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(InterfaceC5443g.c it) {
            AbstractC6492s.i(it, "it");
            return InterfaceC5443g.c.b.c(it, "/api/ws/system", true, 0L, 4, null);
        }
    }

    /* renamed from: eb.c$k */
    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f46344a = new k();

        /* renamed from: eb.c$k$a */
        static final class a implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f46345a = new a();

            a() {
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SystemInfo apply(SystemInfo systemInfo, gb.l systemInfoUpdate) {
                AbstractC6492s.i(systemInfo, "systemInfo");
                AbstractC6492s.i(systemInfoUpdate, "systemInfoUpdate");
                return systemInfo.i(systemInfoUpdate);
            }
        }

        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C5449m c5449m) {
            c5449m.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gb.l e(ByteBuffer data) {
            AbstractC6492s.i(data, "data");
            try {
                C8156c c8156c = C8156c.f62925a;
                String strB = AbstractC5442f.b(data);
                AbstractC3868b abstractC3868bD = c8156c.d();
                abstractC3868bD.a();
                return (gb.l) abstractC3868bD.b(gb.l.INSTANCE.serializer(), strB);
            } catch (Exception e10) {
                Sj.a.f20830a.p(e10, "Error while parsing SystemInfoUpdate", new Object[0]);
                return null;
            }
        }

        @Override // kg.n
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(final C5449m webSocket) {
            AbstractC6492s.i(webSocket, "webSocket");
            gg.i iVarZ = webSocket.f().Z(new InterfaceC6464a() { // from class: eb.d
                @Override // kg.InterfaceC6464a
                public final void run() {
                    AbstractC5439c.k.d(webSocket);
                }
            });
            AbstractC6492s.h(iVarZ, "doFinally(...)");
            return AbstractC8205a.a(iVarZ, new InterfaceC6835l() { // from class: eb.e
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return AbstractC5439c.k.e((ByteBuffer) obj);
                }
            }).q1(new SystemInfo(), a.f46345a).u1(1L);
        }
    }

    public AbstractC5439c(String str, Gb.f storage, InterfaceC5443g.b bVar) {
        AbstractC6492s.i(storage, "storage");
        this.f46330a = str;
        this.f46331b = storage;
        this.f46332c = Yg.n.b(new InterfaceC6824a() { // from class: eb.a
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return AbstractC5439c.i(this.f46328a);
            }
        });
        this.f46333d = Yg.n.b(new InterfaceC6824a() { // from class: eb.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return AbstractC5439c.p(this.f46329a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(String str) {
        String str2 = this.f46330a;
        if (str2 == null) {
            return;
        }
        this.f46331b.F(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z i(AbstractC5439c abstractC5439c) {
        return vb.d.a(abstractC5439c.n());
    }

    private final z n() {
        z zVarO = b().s(e.f46338a).A(f.f46339a).o(new InterfaceC6469f() { // from class: eb.c.g
            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(String p02) {
                AbstractC6492s.i(p02, "p0");
                AbstractC5439c.this.h(p02);
            }
        }).A(h.f46341a).o(new InterfaceC6469f() { // from class: eb.c.i
            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(SystemInfo p02) {
                AbstractC6492s.i(p02, "p0");
                AbstractC5439c.this.o(p02);
            }
        });
        AbstractC6492s.h(zVarO, "doOnSuccess(...)");
        return zVarO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(SystemInfo systemInfo) {
        String anonymousDeviceId;
        String str = this.f46330a;
        if (str == null || (anonymousDeviceId = systemInfo.getAnonymousDeviceId()) == null) {
            return;
        }
        this.f46331b.f(str, anonymousDeviceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i p(AbstractC5439c abstractC5439c) {
        gg.i iVarI2 = abstractC5439c.b().s(j.f46343a).w(k.f46344a).h1().i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }

    protected final z j() {
        z zVarA = k().A(a.f46334a).A(b.f46335a);
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    public z k() {
        return n();
    }

    public z l() {
        z zVarA = b().s(C1739c.f46336a).A(d.f46337a);
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    protected final void m(InterfaceC5443g.a event) {
        AbstractC6492s.i(event, "event");
    }
}
