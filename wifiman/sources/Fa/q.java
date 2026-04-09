package fa;

import Eb.DeviceInfo;
import Ii.AbstractC3063k;
import Ii.N;
import Li.P;
import Li.z;
import Yg.J;
import Yg.v;
import androidx.lifecycle.O;
import com.ui.core.ui.sso.SSOAccountVM;
import com.ui.core.ui.sso.UiSSO;
import com.ui.core.ui.sso.c;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.AbstractC5912b;
import hg.C6042b;
import hg.InterfaceC6043c;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6497x;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class q extends j {

    /* renamed from: e, reason: collision with root package name */
    private final SSOAccountVM f47222e;

    /* renamed from: f, reason: collision with root package name */
    private final z f47223f;

    /* renamed from: g, reason: collision with root package name */
    private final Fg.a f47224g;

    /* renamed from: h, reason: collision with root package name */
    private final C6042b f47225h;

    static final class a implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47226a = new a();

        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fa.f apply(DeviceInfo deviceInfo, Boolean isLoading) {
            AbstractC6492s.i(deviceInfo, "deviceInfo");
            AbstractC6492s.i(isLoading, "isLoading");
            return new fa.f(!isLoading.booleanValue(), !isLoading.booleanValue(), new fa.e(deviceInfo.getDeviceName(), deviceInfo.getDeviceId()));
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6835l {
        b(Object obj) {
            super(1, obj, th.i.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        public final void a(fa.f p02) {
            AbstractC6492s.i(p02, "p0");
            ((th.i) this.receiver).set(p02);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((fa.f) obj);
            return J.f24997a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f47227a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UiSSO.a f47229c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(UiSSO.a aVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f47229c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return q.this.new d(this.f47229c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f47227a;
            if (i10 == 0) {
                v.b(obj);
                c.a aVarC = q.this.f47222e.r0().c();
                UiSSO.a aVar = this.f47229c;
                this.f47227a = 1;
                if (aVarC.G(aVar, this) == objG) {
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
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e implements InterfaceC6469f {
        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            q.this.f47224g.h(Boolean.TRUE);
        }
    }

    /* synthetic */ class f extends C6490p implements InterfaceC6824a {
        f(Object obj) {
            super(0, obj, q.class, "close", "close()V", 0);
        }

        public final void a() {
            ((q) this.receiver).q0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public q(SSOAccountVM sessionVM) {
        AbstractC6492s.i(sessionVM, "sessionVM");
        this.f47222e = sessionVM;
        z zVarA = P.a(new fa.f(false, true, null));
        this.f47223f = zVarA;
        Fg.a aVarK2 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f47224g = aVarK2;
        C6042b c6042b = new C6042b();
        this.f47225h = c6042b;
        gg.i iVarV = gg.i.v(sessionVM.r0().g().a().W(), aVarK2, a.f47226a);
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        Ag.a.a(Ag.f.h(iVarV, new InterfaceC6835l() { // from class: fa.l
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return q.m0(this.f47219a, (Throwable) obj);
            }
        }, null, new b(new AbstractC6497x(zVarA) { // from class: fa.q.c
            @Override // th.m
            public Object get() {
                return ((z) this.receiver).getValue();
            }

            @Override // th.i
            public void set(Object obj) {
                ((z) this.receiver).setValue(obj);
            }
        }), 2, null), c6042b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m0(q qVar, Throwable error) {
        AbstractC6492s.i(error, "error");
        S9.a.e(new InterfaceC6824a() { // from class: fa.p
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return q.r0();
            }
        }, error);
        qVar.q0();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        UiSSO.a aVarF = this.f47222e.r0().f();
        if (aVarF != null) {
            AbstractC3063k.d(O.a(this), null, null, new d(aVarF, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r0() {
        return "Failed to load device info, closing trusted device flow";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(q qVar) {
        qVar.f47224g.h(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J t0(q qVar, Throwable error) {
        AbstractC6492s.i(error, "error");
        S9.a.e(new InterfaceC6824a() { // from class: fa.o
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return q.u0();
            }
        }, error);
        qVar.q0();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String u0() {
        return "Failed to trust device, closing trusted device flow";
    }

    @Override // R9.a, androidx.lifecycle.N
    protected void W() {
        this.f47225h.dispose();
    }

    @Override // fa.j
    public void e0() {
        q0();
    }

    @Override // fa.j
    public void f0(String deviceId) {
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC5912b abstractC5912bW = this.f47222e.r0().g().k(deviceId).B(new e()).w(new InterfaceC6464a() { // from class: fa.m
            @Override // kg.InterfaceC6464a
            public final void run() {
                q.s0(this.f47220a);
            }
        });
        AbstractC6492s.h(abstractC5912bW, "doFinally(...)");
        Ag.a.a(Ag.f.d(abstractC5912bW, new InterfaceC6835l() { // from class: fa.n
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return q.t0(this.f47221a, (Throwable) obj);
            }
        }, new f(this)), this.f47225h);
    }

    @Override // fa.j
    public Li.N g0() {
        return this.f47223f;
    }
}
