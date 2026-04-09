package n8;

import Cc.InterfaceC2557a;
import Je.n;
import Li.N;
import a8.C3771a;
import a8.C3772b;
import com.ubnt.usurvey.R;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import h9.C5969a;
import i8.InterfaceC6084a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6835l;
import n8.C6910k;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: n8.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6910k extends n {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ th.l[] f54491o = {O.h(new F(C6910k.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new F(C6910k.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: p, reason: collision with root package name */
    public static final int f54492p = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f54493g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f54494h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f54495i;

    /* renamed from: j, reason: collision with root package name */
    private String f54496j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f54497k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f54498l;

    /* renamed from: m, reason: collision with root package name */
    private final N f54499m;

    /* renamed from: n, reason: collision with root package name */
    private final N f54500n;

    /* renamed from: n8.k$a */
    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f54501a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            Cc.l config;
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a.a();
            return new C6556a((interfaceC2557a == null || (config = interfaceC2557a.getConfig()) == null) ? null : config.c());
        }
    }

    /* renamed from: n8.k$b */
    static final class b implements InterfaceC6469f {
        b() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            String str = (String) c6556a.a();
            C6910k c6910k = C6910k.this;
            if (str == null) {
                str = "";
            }
            c6910k.f54496j = str;
        }
    }

    /* renamed from: n8.k$c */
    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f54503a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            String str = (String) c6556a.a();
            return new C6556a(str != null ? new d.c(str) : null);
        }
    }

    /* renamed from: n8.k$d */
    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f54504a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3772b apply(Je.m it) {
            AbstractC6492s.i(it, "it");
            return C3772b.f25747c.b(it.b());
        }
    }

    /* renamed from: n8.k$e */
    static final class e implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f54505a = new e();

        e() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C3772b deviceId, C3771a devices) {
            AbstractC6492s.i(deviceId, "deviceId");
            AbstractC6492s.i(devices, "devices");
            Object objA = devices.a(deviceId);
            return new C6556a(objA instanceof InterfaceC2557a ? (InterfaceC2557a) objA : null);
        }
    }

    /* renamed from: n8.k$f */
    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f54506a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9.d apply(C6556a c6556a) {
            Dc.j jVarJ;
            String name;
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a.a();
            return (interfaceC2557a == null || (jVarJ = interfaceC2557a.j()) == null || (name = jVarJ.getName()) == null) ? new d.b(R.string.device_name_fallback) : new d.c(name);
        }
    }

    /* renamed from: n8.k$g */
    static final class g implements kg.n {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cc.l c(C6910k c6910k, Cc.l config) {
            AbstractC6492s.i(config, "config");
            String str = c6910k.f54496j;
            if (str.length() <= 0) {
                str = null;
            }
            return Cc.l.b(config, null, null, null, str, 0L, 23, null);
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Je.m mVar) {
            AbstractC6492s.i(mVar, "<destruct>");
            C5969a c5969aA = mVar.a();
            Cc.n nVarW0 = C6910k.this.w0();
            final C6910k c6910k = C6910k.this;
            return nVarW0.c(c5969aA, new InterfaceC6835l() { // from class: n8.l
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C6910k.g.c(c6910k, (Cc.l) obj);
                }
            });
        }
    }

    /* renamed from: n8.k$h */
    public static final class h implements gg.k {
        public h() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(C6910k.this.p0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.k$i */
    public static final class i extends o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.k$j */
    public static final class j extends o<InterfaceC6084a> {
    }

    public C6910k(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f54493g = di2;
        org.kodein.type.i iVarE = s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, Cc.n.class), null);
        th.l[] lVarArr = f54491o;
        this.f54494h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f54495i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        this.f54496j = "";
        gg.i iVarI2 = gg.i.N(new h(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f54497k = iVarI2;
        gg.i iVarW = gg.i.v(iVarI2.N0(d.f54504a), w0().a(), e.f54505a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f54498l = iVarW;
        gg.i iVarN0 = iVarW.N0(a.f54501a).W().f0(new b()).N0(c.f54503a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f54499m = AbstractC8661g.h0(this, iVarN0, null, null, 2, null);
        gg.i iVarN02 = iVarW.N0(f.f54506a);
        AbstractC6492s.h(iVarN02, "map(...)");
        this.f54500n = AbstractC8661g.d0(this, iVarN02, new d.b(R.string.device_name_fallback), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Cc.n w0() {
        return (Cc.n) this.f54494h.getValue();
    }

    private final InterfaceC6084a x0() {
        return (InterfaceC6084a) this.f54495i.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f54493g;
    }

    @Override // Je.n
    public N n0() {
        return this.f54499m;
    }

    @Override // Je.n
    public N o0() {
        return this.f54500n;
    }

    @Override // Je.n
    public void q0(String name) {
        AbstractC6492s.i(name, "name");
        this.f54496j = name;
    }

    @Override // Je.n
    public void r0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bG = this.f54497k.o0().t(new g()).g(x0().a(InterfaceC6084a.b.n.f48939a));
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        c8658d.d(abstractC5912bG, this);
    }
}
