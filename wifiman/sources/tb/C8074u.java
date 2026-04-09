package tb;

import eb.InterfaceC5443g;
import gg.InterfaceC5910A;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kb.C6420a;
import kg.InterfaceC6468e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: tb.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8074u {

    /* renamed from: a, reason: collision with root package name */
    private final N f62061a;

    /* renamed from: b, reason: collision with root package name */
    private int f62062b;

    /* renamed from: c, reason: collision with root package name */
    private final C8066l f62063c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f62064d;

    /* renamed from: tb.u$a */
    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, C8074u.class, "createRequester", "createRequester()Lcom/ui/unifi/core/base/net/webrtc/WebRtcApiRequester;", 0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8071q invoke() {
            return ((C8074u) this.receiver).f();
        }
    }

    public C8074u(N connection) {
        AbstractC6492s.i(connection, "connection");
        this.f62061a = connection;
        this.f62062b = 1;
        this.f62063c = new C8066l(50, new a(this));
        this.f62064d = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C8071q f() {
        int i10 = this.f62062b;
        this.f62062b = i10 + 1;
        String str = "api:" + i10;
        return new C8071q(this.f62061a.P(str), str);
    }

    private final C8063i i(String str, kb.o oVar, String str2, Map map) {
        int iIncrementAndGet = this.f62064d.incrementAndGet();
        return new C8063i(String.valueOf(iIncrementAndGet), C6420a.b(C6420a.f51349a, iIncrementAndGet, oVar, str, str2, InterfaceC5443g.c.f46347a.a(map, this.f62061a.a0()), false, 32, null));
    }

    private final void j(C8071q c8071q) {
        Sj.a.f20830a.a("release requester: " + c8071q.d(), new Object[0]);
        if (c8071q.e()) {
            this.f62063c.f(c8071q);
        } else {
            this.f62063c.d(c8071q);
            this.f62061a.r0(c8071q.d());
        }
    }

    private final gg.z l(final InterfaceC6835l interfaceC6835l) {
        gg.z zVarO = gg.z.i(new gg.C() { // from class: tb.s
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                C8074u.n(this.f62057a, interfaceC6835l, interfaceC5910A);
            }
        }).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        return zVarO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.z m(kb.o oVar, String str, C8074u c8074u, String str2, Map map, C8071q requester) {
        AbstractC6492s.i(requester, "requester");
        requester.o(oVar + " " + str);
        return requester.m(c8074u.i(str, oVar, str2, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final C8074u c8074u, InterfaceC6835l interfaceC6835l, InterfaceC5910A emitter) {
        final C8071q c8071qE;
        AbstractC6492s.i(emitter, "emitter");
        Sj.a.f20830a.a("request start", new Object[0]);
        try {
            c8071qE = c8074u.f62063c.e();
        } catch (Exception e10) {
            Sj.a.f20830a.p(e10, "Couldn't retrieve requester", new Object[0]);
            c8071qE = null;
        }
        Sj.a.f20830a.a("request requester available: " + (c8071qE != null), new Object[0]);
        if (c8071qE != null) {
            try {
                Object objD = ((gg.z) interfaceC6835l.invoke(c8071qE)).d();
                AbstractC6492s.h(objD, "blockingGet(...)");
                emitter.onSuccess((kb.p) objD);
                Yg.J j10 = Yg.J.f24997a;
            } catch (Exception e11) {
                emitter.c(e11);
            }
        } else {
            emitter.c(new Exception("Requester not available"));
        }
        emitter.d(new InterfaceC6468e() { // from class: tb.t
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                C8074u.o(c8071qE, c8074u);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(C8071q c8071q, C8074u c8074u) {
        if (c8071q != null) {
            c8074u.j(c8071q);
        }
    }

    public final gg.s e() {
        return this.f62061a.J();
    }

    public final gg.z g(String path) {
        AbstractC6492s.i(path, "path");
        Sj.a.f20830a.a("Creating WS data channel " + path, new Object[0]);
        if (!sb.g.a(path)) {
            path = "ws:" + path;
        }
        gg.z zVarZ = gg.z.z(this.f62061a.P(path));
        AbstractC6492s.h(zVarZ, "just(...)");
        return zVarZ;
    }

    public final boolean h() {
        return this.f62061a.e0();
    }

    public final gg.z k(final String path, final kb.o method, final String str, final Map map) {
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(method, "method");
        return l(new InterfaceC6835l() { // from class: tb.r
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C8074u.m(method, path, this, str, map, (C8071q) obj);
            }
        });
    }
}
