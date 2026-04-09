package E8;

import Cc.InterfaceC2557a;
import E8.InterfaceC2653a;
import L0.C3174d;
import Li.N;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zg.AbstractC3689v;
import a8.C3771a;
import a8.C3772b;
import android.content.Context;
import com.ubnt.usurvey.R;
import gf.AbstractC5902c;
import gf.C5900a;
import gf.C5901b;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import org.kodein.di.DI;
import qd.InterfaceC7451a;
import rd.b;
import rj.InterfaceC7810x2;
import sa.AbstractC7930a;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: E8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2658f extends AbstractC5902c {

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ th.l[] f4148n = {O.h(new kotlin.jvm.internal.F(C2658f.class, "apaSpeedtestPopupController", "getApaSpeedtestPopupController()Lcom/ubnt/usurvey/ui/speedtest/A2ASpeedtestPopupController;", 0)), O.h(new kotlin.jvm.internal.F(C2658f.class, "networkDiscovery", "getNetworkDiscovery()Lcom/ui/wifiman/model/discovery/NetworkDiscovery;", 0)), O.h(new kotlin.jvm.internal.F(C2658f.class, "wifimanDeviceManager", "getWifimanDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new kotlin.jvm.internal.F(C2658f.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: o, reason: collision with root package name */
    public static final int f4149o = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f4150g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f4151h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f4152i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f4153j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f4154k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f4155l;

    /* renamed from: m, reason: collision with root package name */
    private final N f4156m;

    /* renamed from: E8.f$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b.a f4157a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC2557a f4158b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4159c;

        /* renamed from: d, reason: collision with root package name */
        private final String f4160d;

        /* renamed from: e, reason: collision with root package name */
        private final String f4161e;

        /* renamed from: f, reason: collision with root package name */
        private final inet.ipaddr.g f4162f;

        /* renamed from: g, reason: collision with root package name */
        private final S8.g f4163g;

        public a(b.a a2aEndpoint, InterfaceC2557a interfaceC2557a) {
            Dc.j jVarJ;
            S8.g gVarN;
            String strB;
            String name;
            AbstractC6492s.i(a2aEndpoint, "a2aEndpoint");
            this.f4157a = a2aEndpoint;
            this.f4158b = interfaceC2557a;
            this.f4159c = String.valueOf(a2aEndpoint.b());
            this.f4160d = (interfaceC2557a == null || (name = interfaceC2557a.getName()) == null) ? a2aEndpoint.d() : name;
            this.f4161e = (interfaceC2557a == null || (strB = interfaceC2557a.b()) == null) ? a2aEndpoint.c() : strB;
            this.f4162f = a2aEndpoint.b();
            this.f4163g = (interfaceC2557a == null || (jVarJ = interfaceC2557a.j()) == null || (gVarN = jVarJ.N()) == null) ? a2aEndpoint.g() : gVarN;
        }

        public final b.a a() {
            return this.f4157a;
        }

        public final InterfaceC2557a b() {
            return this.f4158b;
        }

        public final inet.ipaddr.g c() {
            return this.f4162f;
        }

        public final String d() {
            return this.f4159c;
        }

        public final String e() {
            return this.f4161e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f4157a, aVar.f4157a) && AbstractC6492s.d(this.f4158b, aVar.f4158b);
        }

        public final String f() {
            return this.f4160d;
        }

        public final S8.g g() {
            return this.f4163g;
        }

        public int hashCode() {
            int iHashCode = this.f4157a.hashCode() * 31;
            InterfaceC2557a interfaceC2557a = this.f4158b;
            return iHashCode + (interfaceC2557a == null ? 0 : interfaceC2557a.hashCode());
        }

        public String toString() {
            return "SpeedtestEnpoint(a2aEndpoint=" + this.f4157a + ", device=" + this.f4158b + ")";
        }
    }

    /* renamed from: E8.f$b */
    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4164a = new b();

        /* renamed from: E8.f$b$a */
        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S8.g f4165a;

            a(S8.g gVar) {
                this.f4165a = gVar;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(-1734833751);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1734833751, i10, -1, "com.ubnt.usurvey.ui.speedtest.A2ASpeedtestPopupVM.devices.<anonymous>.<anonymous>.<anonymous>.<anonymous> (A2ASpeedtestPopupVM.kt:102)");
                }
                S8.g gVar = this.f4165a;
                C3174d.a aVar = new C3174d.a(0, 1, null);
                String string = context.getString(R.string.wifi_experience);
                AbstractC6492s.h(string, "getString(...)");
                aVar.i(string);
                aVar.i(": ");
                aVar.g(AbstractC7930a.a(Ne.k.b(gVar, true), interfaceC3540l, 0));
                C3174d c3174dP = aVar.p();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return c3174dP;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final gf.C5901b apply(java.util.List r10) {
            /*
                r9 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.AbstractC6492s.i(r10, r0)
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = Zg.AbstractC3689v.w(r10, r1)
                r0.<init>(r1)
                java.util.Iterator r10 = r10.iterator()
            L17:
                boolean r1 = r10.hasNext()
                if (r1 == 0) goto Ldc
                java.lang.Object r1 = r10.next()
                E8.f$a r1 = (E8.C2658f.a) r1
                java.lang.String r3 = r1.d()
                Cc.a r2 = r1.b()
                r4 = 0
                if (r2 == 0) goto L3a
                com.ubnt.usurvey.product.m$c r5 = com.ubnt.usurvey.product.m.c.NORMAL
                r6 = 2
                s9.a r2 = n8.AbstractC6912m.f(r2, r5, r4, r6, r4)
                if (r2 != 0) goto L38
                goto L3a
            L38:
                r5 = r2
                goto L54
            L3a:
                rd.b$a r2 = r1.a()
                rd.b$a$a r2 = r2.f()
                if (r2 == 0) goto L49
                s9.a$b r2 = r8.AbstractC7578a.a(r2)
                goto L4a
            L49:
                r2 = r4
            L4a:
                if (r2 == 0) goto L4d
                goto L38
            L4d:
                Pe.a r2 = Pe.a.f18599a
                s9.b r2 = r2.k()
                goto L38
            L54:
                s9.d$c r6 = new s9.d$c
                java.lang.String r2 = r1.f()
                r6.<init>(r2)
                java.lang.String r2 = r1.e()
                if (r2 == 0) goto L95
                boolean r2 = kotlin.text.t.m0(r2)
                if (r2 == 0) goto L6a
                goto L95
            L6a:
                inet.ipaddr.g r2 = r1.c()
                java.lang.String r2 = L8.f.a(r2)
                if (r2 == 0) goto L95
                s9.d$b r2 = new s9.d$b
                java.lang.String r7 = r1.e()
                inet.ipaddr.g r8 = r1.c()
                java.lang.String r8 = L8.f.a(r8)
                kotlin.jvm.internal.AbstractC6492s.f(r8)
                java.lang.String[] r7 = new java.lang.String[]{r7, r8}
                java.util.List r7 = Zg.AbstractC3689v.o(r7)
                r8 = 2131821507(0x7f1103c3, float:1.927576E38)
                r2.<init>(r8, r7)
                r7 = r2
                goto Lb2
            L95:
                java.lang.String r2 = r1.e()
                if (r2 == 0) goto La5
                boolean r7 = kotlin.text.t.m0(r2)
                if (r7 != 0) goto La2
                goto La3
            La2:
                r2 = r4
            La3:
                if (r2 != 0) goto Lad
            La5:
                inet.ipaddr.g r2 = r1.c()
                java.lang.String r2 = L8.f.a(r2)
            Lad:
                s9.d$c r7 = new s9.d$c
                r7.<init>(r2)
            Lb2:
                S8.g r1 = r1.g()
                if (r1 == 0) goto Lcc
                s9.d$a r2 = new s9.d$a
                int r4 = r1.a()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                E8.f$b$a r8 = new E8.f$b$a
                r8.<init>(r1)
                r2.<init>(r4, r8)
                r1 = r2
                goto Lcd
            Lcc:
                r1 = r4
            Lcd:
                gf.a r8 = new gf.a
                r2 = r8
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                r0.add(r8)
                goto L17
            Ldc:
                gf.b r10 = new gf.b
                r10.<init>(r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: E8.C2658f.b.apply(java.util.List):gf.b");
        }
    }

    /* renamed from: E8.f$c */
    static final class c implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4166a = new c();

        c() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(C5901b it) {
            AbstractC6492s.i(it, "it");
            return !it.a().isEmpty();
        }
    }

    /* renamed from: E8.f$d */
    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5900a f4167a;

        /* renamed from: E8.f$d$a */
        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f4168a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5900a f4169b;

            public a(List list, C5900a c5900a) {
                this.f4168a = list;
                this.f4169b = c5900a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                Object next;
                try {
                    AbstractC6492s.f(this.f4168a);
                    Iterator it = this.f4168a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (AbstractC6492s.d(((a) next).d(), this.f4169b.a())) {
                                break;
                            }
                        }
                    }
                    a aVar = (a) next;
                    InterfaceC7451a.C2063a c2063a = aVar != null ? new InterfaceC7451a.C2063a(aVar.a().b(), aVar.a().e(), aVar.a().d(), aVar.a().c()) : null;
                    if (c2063a != null) {
                        oVar.onSuccess(c2063a);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        d(C5900a c5900a) {
            this.f4167a = c5900a;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(List endpoints) {
            AbstractC6492s.i(endpoints, "endpoints");
            gg.n nVarC = gg.n.c(new a(endpoints, this.f4167a));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: E8.f$e */
    static final class e implements kg.n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(InterfaceC7451a.C2063a a2aSpeedTestParams) {
            AbstractC6492s.i(a2aSpeedTestParams, "a2aSpeedTestParams");
            return AbstractC5912b.p(C2658f.this.t0().a(), C2658f.this.v0().a(new InterfaceC6084a.b.B.c.C1817a(a2aSpeedTestParams)));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: E8.f$f, reason: collision with other inner class name */
    public static final class C0179f extends org.kodein.type.o<InterfaceC2653a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: E8.f$g */
    public static final class g extends org.kodein.type.o<Dc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: E8.f$h */
    public static final class h extends org.kodein.type.o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: E8.f$i */
    public static final class i extends org.kodein.type.o<InterfaceC6084a> {
    }

    /* renamed from: E8.f$j */
    static final class j implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final j f4171a = new j();

        j() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(Map discoveryResults, InterfaceC2653a.AbstractC0176a popupState, C3771a devices) {
            InterfaceC2557a interfaceC2557aA;
            AbstractC6492s.i(discoveryResults, "discoveryResults");
            AbstractC6492s.i(popupState, "popupState");
            AbstractC6492s.i(devices, "devices");
            if (popupState instanceof InterfaceC2653a.AbstractC0176a.b) {
                return AbstractC3689v.l();
            }
            if (!(popupState instanceof InterfaceC2653a.AbstractC0176a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            List<InterfaceC2653a.AbstractC0176a.C0177a> listA = ((InterfaceC2653a.AbstractC0176a.c) popupState).a();
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listA, 10));
            for (InterfaceC2653a.AbstractC0176a.C0177a c0177a : listA) {
                b.a aVarA = c0177a.a();
                Dc.j jVar = (Dc.j) discoveryResults.get(c0177a.a().b());
                if (jVar != null) {
                    C3772b id2 = jVar.getId();
                    if (id2 == null || (interfaceC2557aA = (InterfaceC2557a.b) devices.a(id2)) == null) {
                        interfaceC2557aA = Dc.n.a(jVar);
                    }
                } else {
                    interfaceC2557aA = null;
                }
                arrayList.add(new a(aVarA, interfaceC2557aA));
            }
            return arrayList;
        }
    }

    public C2658f(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f4150g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new C0179f().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC2653a.class), null);
        th.l[] lVarArr = f4148n;
        this.f4151h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4152i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, Dc.e.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4153j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, Cc.n.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4154k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC6084a.class), null).a(this, lVarArr[3]);
        gg.i iVarI2 = gg.i.u(u0().b().e1(), t0().getState(), w0().a(), j.f4171a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f4155l = iVarI2;
        gg.i iVarW = iVarI2.N0(b.f4164a).m0(c.f4166a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f4156m = AbstractC8661g.d0(this, iVarW, new C5901b(AbstractC3689v.l()), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2653a t0() {
        return (InterfaceC2653a) this.f4151h.getValue();
    }

    private final Dc.e u0() {
        return (Dc.e) this.f4152i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a v0() {
        return (InterfaceC6084a) this.f4154k.getValue();
    }

    private final Cc.n w0() {
        return (Cc.n) this.f4153j.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f4150g;
    }

    @Override // gf.AbstractC5902c
    public N n0() {
        return this.f4156m;
    }

    @Override // gf.AbstractC5902c
    public void o0() {
        C8658d.f66727a.d(t0().a(), this);
    }

    @Override // gf.AbstractC5902c
    public void p0() {
        C8658d.f66727a.d(t0().a(), this);
    }

    @Override // gf.AbstractC5902c
    public void q0(C5900a device) {
        AbstractC6492s.i(device, "device");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = this.f4155l.o0().u(new d(device)).k(new e());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }
}
