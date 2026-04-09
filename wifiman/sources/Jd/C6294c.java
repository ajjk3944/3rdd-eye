package jd;

import Cc.InterfaceC2557a;
import Md.g;
import Tc.a;
import Zc.e;
import Zg.AbstractC3689v;
import a8.C3771a;
import a8.C3772b;
import b8.AbstractC4074a;
import b8.EnumC4076c;
import be.InterfaceC4091e;
import ce.ApiNetworkWifimanDeviceInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jd.C6292a;
import je.AbstractC6317r;
import je.u;
import kg.InterfaceC6465b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* renamed from: jd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6294c implements InterfaceC6293b {

    /* renamed from: a, reason: collision with root package name */
    private final gg.i f50694a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f50695b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f50696c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f50697d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f50698e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f50699f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f50700g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f50701h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f50702i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f50703j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f50704k;

    /* renamed from: jd.c$a */
    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4091e f50705a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6294c f50706b;

        /* renamed from: jd.c$a$a, reason: collision with other inner class name */
        static final class C1870a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1870a f50707a = new C1870a();

            C1870a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a) {
                List topology;
                AbstractC6492s.i(c6556a, "<destruct>");
                ApiNetworkWifimanDeviceInfo apiNetworkWifimanDeviceInfo = (ApiNetworkWifimanDeviceInfo) c6556a.a();
                return new C6556a((apiNetworkWifimanDeviceInfo == null || (topology = apiNetworkWifimanDeviceInfo.getTopology()) == null) ? null : (ApiNetworkWifimanDeviceInfo.TopologyItem) AbstractC3689v.s0(topology));
            }
        }

        /* renamed from: jd.c$a$b */
        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f50708a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean apply(C6556a c6556a) {
                List topology;
                AbstractC6492s.i(c6556a, "<destruct>");
                ApiNetworkWifimanDeviceInfo apiNetworkWifimanDeviceInfo = (ApiNetworkWifimanDeviceInfo) c6556a.a();
                boolean z10 = false;
                if (apiNetworkWifimanDeviceInfo != null && (topology = apiNetworkWifimanDeviceInfo.getTopology()) != null && topology.size() == 1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* renamed from: jd.c$a$c, reason: collision with other inner class name */
        static final class C1871c implements kg.h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6294c f50709a;

            C1871c(C6294c c6294c) {
                this.f50709a = c6294c;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[PHI: r8
  0x007f: PHI (r8v14 inet.ipaddr.g) = (r8v5 inet.ipaddr.g), (r8v7 inet.ipaddr.g), (r8v16 inet.ipaddr.g) binds: [B:40:0x0091, B:44:0x009b, B:33:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
            @Override // kg.h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final l9.C6556a a(l9.C6556a r8, java.lang.Boolean r9, l9.C6556a r10, l9.C6556a r11) {
                /*
                    r7 = this;
                    java.lang.String r0 = "<destruct>"
                    kotlin.jvm.internal.AbstractC6492s.i(r8, r0)
                    java.lang.String r1 = "apiApIsGateway"
                    kotlin.jvm.internal.AbstractC6492s.i(r9, r1)
                    kotlin.jvm.internal.AbstractC6492s.i(r10, r0)
                    kotlin.jvm.internal.AbstractC6492s.i(r11, r0)
                    java.lang.Object r8 = r8.a()
                    ce.b$a r8 = (ce.ApiNetworkWifimanDeviceInfo.TopologyItem) r8
                    java.lang.Object r10 = r10.a()
                    r4 = r10
                    Cc.a r4 = (Cc.InterfaceC2557a) r4
                    java.lang.Object r10 = r11.a()
                    jd.a$b r10 = (jd.C6292a.b) r10
                    r11 = 0
                    if (r8 == 0) goto L2d
                    jd.c r0 = r7.f50709a
                    jd.a$b r0 = jd.C6294c.e(r0, r8, r11)
                    goto L2e
                L2d:
                    r0 = r11
                L2e:
                    if (r4 == 0) goto L3f
                    inet.ipaddr.ipv4.b r1 = r4.n()
                    if (r1 == 0) goto L3f
                    jd.c r2 = r7.f50709a
                    inet.ipaddr.g r1 = jd.C6294c.k(r2, r1)
                    if (r1 == 0) goto L3f
                    goto L4f
                L3f:
                    if (r0 == 0) goto L4e
                    inet.ipaddr.g r1 = r0.c()
                    if (r1 == 0) goto L4e
                    jd.c r2 = r7.f50709a
                    inet.ipaddr.g r1 = jd.C6294c.k(r2, r1)
                    goto L4f
                L4e:
                    r1 = r11
                L4f:
                    l9.a r6 = new l9.a
                    if (r10 == 0) goto L58
                    inet.ipaddr.g r2 = r10.c()
                    goto L59
                L58:
                    r2 = r11
                L59:
                    boolean r1 = kotlin.jvm.internal.AbstractC6492s.d(r1, r2)
                    if (r1 == 0) goto L61
                    goto Lbe
                L61:
                    if (r8 != 0) goto L65
                    if (r4 == 0) goto Lbe
                L65:
                    boolean r8 = r9.booleanValue()
                    if (r8 != 0) goto Lbe
                    jd.a$b r10 = new jd.a$b
                    jd.a$c r1 = jd.C6292a.c.AP
                    if (r0 == 0) goto L81
                    inet.ipaddr.g r8 = r0.c()
                    if (r8 == 0) goto L81
                    jd.c r9 = r7.f50709a
                    inet.ipaddr.g r8 = jd.C6294c.k(r9, r8)
                    if (r8 == 0) goto L81
                L7f:
                    r2 = r8
                    goto La3
                L81:
                    if (r4 == 0) goto L90
                    inet.ipaddr.ipv4.b r8 = r4.n()
                    if (r8 == 0) goto L90
                    jd.c r9 = r7.f50709a
                    inet.ipaddr.g r8 = jd.C6294c.k(r9, r8)
                    goto L91
                L90:
                    r8 = r11
                L91:
                    if (r8 != 0) goto L7f
                    if (r4 == 0) goto La2
                    inet.ipaddr.ipv6.b r8 = r4.i()
                    if (r8 == 0) goto La2
                    jd.c r9 = r7.f50709a
                    inet.ipaddr.g r8 = jd.C6294c.k(r9, r8)
                    goto L7f
                La2:
                    r2 = r11
                La3:
                    if (r0 == 0) goto Lae
                    jd.a$a r8 = r0.a()
                    if (r8 != 0) goto Lac
                    goto Lae
                Lac:
                    r3 = r8
                    goto Lb1
                Lae:
                    jd.a$a r8 = jd.C6292a.EnumC1869a.WIRED
                    goto Lac
                Lb1:
                    if (r0 == 0) goto Lb9
                    jd.a$d r8 = r0.e()
                    r5 = r8
                    goto Lba
                Lb9:
                    r5 = r11
                Lba:
                    r0 = r10
                    r0.<init>(r1, r2, r3, r4, r5)
                Lbe:
                    r6.<init>(r10)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: jd.C6294c.a.C1871c.a(l9.a, java.lang.Boolean, l9.a, l9.a):l9.a");
            }
        }

        a(InterfaceC4091e interfaceC4091e, C6294c c6294c) {
            this.f50705a = interfaceC4091e;
            this.f50706b = c6294c;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean connected) {
            AbstractC6492s.i(connected, "connected");
            if (connected.booleanValue()) {
                gg.i iVarT = gg.i.t(this.f50705a.a().N0(C1870a.f50707a).W(), this.f50705a.a().N0(b.f50708a).W(), this.f50706b.f50699f, this.f50706b.d(), new C1871c(this.f50706b));
                AbstractC6492s.f(iVarT);
                return iVarT;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    /* renamed from: jd.c$b */
    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f50710a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            List topology;
            ApiNetworkWifimanDeviceInfo.TopologyItem topologyItem;
            AbstractC6492s.i(c6556a, "<destruct>");
            ApiNetworkWifimanDeviceInfo apiNetworkWifimanDeviceInfo = (ApiNetworkWifimanDeviceInfo) c6556a.a();
            return new C6556a((apiNetworkWifimanDeviceInfo == null || (topology = apiNetworkWifimanDeviceInfo.getTopology()) == null || (topologyItem = (ApiNetworkWifimanDeviceInfo.TopologyItem) AbstractC3689v.s0(topology)) == null) ? null : topologyItem.f());
        }
    }

    /* renamed from: jd.c$c, reason: collision with other inner class name */
    static final class C1872c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Dc.e f50711a;

        /* renamed from: jd.c$c$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ inet.ipaddr.g f50712a;

            a(inet.ipaddr.g gVar) {
                this.f50712a = gVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Map it) {
                Object next;
                AbstractC6492s.i(it, "it");
                Collection collectionValues = it.values();
                inet.ipaddr.g gVar = this.f50712a;
                Iterator it2 = collectionValues.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (AbstractC6492s.d(((Dc.j) next).w(), gVar)) {
                        break;
                    }
                }
                Dc.j jVar = (Dc.j) next;
                return new C6556a(jVar != null ? Dc.n.a(jVar) : null);
            }
        }

        C1872c(Dc.e eVar) {
            this.f50711a = eVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            inet.ipaddr.g gVar = (inet.ipaddr.g) c6556a.a();
            if (gVar != null) {
                gg.i iVarN0 = this.f50711a.b().N0(new a(gVar));
                AbstractC6492s.f(iVarN0);
                return iVarN0;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    /* renamed from: jd.c$d */
    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f50713a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(AbstractC6317r it) {
            AbstractC6492s.i(it, "it");
            AbstractC6317r.b.a aVar = it instanceof AbstractC6317r.b.a ? (AbstractC6317r.b.a) it : null;
            return new C6556a(aVar != null ? aVar.a() : null);
        }
    }

    /* renamed from: jd.c$e */
    static final class e implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final e f50714a = new e();

        e() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(C6556a c6556a, C6556a c6556a2, C3771a devices) {
            InterfaceC2557a.b bVar;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            AbstractC6492s.i(devices, "devices");
            C3772b c3772b = (C3772b) c6556a.a();
            InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a2.a();
            if (c3772b != null && (bVar = (InterfaceC2557a.b) devices.a(c3772b)) != null) {
                interfaceC2557a = bVar;
            }
            return new C6556a(interfaceC2557a);
        }
    }

    /* renamed from: jd.c$f */
    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f50715a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Zc.e connection) {
            inet.ipaddr.g gVarA;
            AbstractC6492s.i(connection, "connection");
            inet.ipaddr.g gVarA2 = null;
            if (connection.f() == e.b.CONNECTED) {
                e.a aVarB = connection.b();
                if (aVarB == null || (gVarA = aVarB.a()) == null) {
                    e.a aVarC = connection.c();
                    if (aVarC != null) {
                        gVarA2 = aVarC.a();
                    }
                } else {
                    gVarA2 = gVarA;
                }
            }
            return new C6556a(gVarA2);
        }
    }

    /* renamed from: jd.c$g */
    static final class g implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4091e f50717b;

        /* renamed from: jd.c$g$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f50718a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a) {
                List topology;
                AbstractC6492s.i(c6556a, "<destruct>");
                ApiNetworkWifimanDeviceInfo apiNetworkWifimanDeviceInfo = (ApiNetworkWifimanDeviceInfo) c6556a.a();
                return new C6556a((apiNetworkWifimanDeviceInfo == null || (topology = apiNetworkWifimanDeviceInfo.getTopology()) == null) ? null : (ApiNetworkWifimanDeviceInfo.TopologyItem) AbstractC3689v.D0(topology));
            }
        }

        /* renamed from: jd.c$g$b */
        static final class b implements kg.g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6294c f50719a;

            b(C6294c c6294c) {
                this.f50719a = c6294c;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
            /* JADX WARN: Type inference failed for: r8v2, types: [jd.a$b] */
            @Override // kg.g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final l9.C6556a a(l9.C6556a r19, l9.C6556a r20, l9.C6556a r21) {
                /*
                    Method dump skipped, instructions count: 241
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: jd.C6294c.g.b.a(l9.a, l9.a, l9.a):l9.a");
            }
        }

        g(InterfaceC4091e interfaceC4091e) {
            this.f50717b = interfaceC4091e;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean connected) {
            AbstractC6492s.i(connected, "connected");
            if (connected.booleanValue()) {
                gg.i iVarU = gg.i.u(C6294c.this.f50697d, C6294c.this.f50696c, this.f50717b.a().N0(a.f50718a), new b(C6294c.this));
                AbstractC6492s.f(iVarU);
                return iVarU;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    /* renamed from: jd.c$h */
    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f50720a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Map it) {
            Object next;
            AbstractC6492s.i(it, "it");
            Iterator it2 = it.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((Dc.j) next).C() != null) {
                    break;
                }
            }
            Dc.j jVar = (Dc.j) next;
            return new C6556a(jVar != null ? Dc.n.a(jVar) : null);
        }
    }

    /* renamed from: jd.c$i */
    static final class i implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final i f50721a = new i();

        i() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C3771a devices, C6556a c6556a) {
            C3772b id2;
            InterfaceC2557a.b bVar;
            AbstractC6492s.i(devices, "devices");
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a.a();
            if (interfaceC2557a != null && (id2 = interfaceC2557a.getId()) != null && (bVar = (InterfaceC2557a.b) devices.a(id2)) != null) {
                interfaceC2557a = bVar;
            }
            return new C6556a(interfaceC2557a);
        }
    }

    /* renamed from: jd.c$j */
    static final class j implements kg.g {
        j() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6292a.b a(Zc.e connection, Cc.j myself, C6556a c6556a) {
            inet.ipaddr.g gVarO;
            inet.ipaddr.g gVarB;
            a.C0794a c0794aL;
            a.C0794a c0794aL2;
            inet.ipaddr.g gVarB2;
            inet.ipaddr.g gVarO2;
            AbstractC6492s.i(connection, "connection");
            AbstractC6492s.i(myself, "myself");
            AbstractC6492s.i(c6556a, "<destruct>");
            C6292a.EnumC1869a enumC1869a = (C6292a.EnumC1869a) c6556a.a();
            C6292a.c cVar = C6292a.c.MYSELF;
            if (enumC1869a == null) {
                enumC1869a = C6292a.EnumC1869a.WIRELESS;
            }
            C6292a.EnumC1869a enumC1869a2 = enumC1869a;
            e.a aVarB = connection.b();
            if (aVarB == null || (gVarB2 = aVarB.b()) == null || (gVarO2 = C6294c.this.o(gVarB2)) == null) {
                e.a aVarC = connection.c();
                gVarO = (aVarC == null || (gVarB = aVarC.b()) == null) ? null : C6294c.this.o(gVarB);
            } else {
                gVarO = gVarO2;
            }
            String name = myself.getName();
            Dc.j jVarJ = myself.j();
            String strJ = (jVarJ == null || (c0794aL2 = jVarJ.L()) == null) ? null : c0794aL2.j();
            Dc.j jVarJ2 = myself.j();
            return new C6292a.b(cVar, gVarO, enumC1869a2, myself, new C6292a.d(name, strJ, (jVarJ2 == null || (c0794aL = jVarJ2.L()) == null) ? null : c0794aL.p(), null));
        }
    }

    /* renamed from: jd.c$k */
    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f50723a = new k();

        /* renamed from: jd.c$k$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50724a;

            static {
                int[] iArr = new int[e.b.values().length];
                try {
                    iArr[e.b.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.b.CONNECTING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.b.OBTAINING_IP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.b.AUTHENTICATING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[e.b.DISCONNECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f50724a = iArr;
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            int i10 = a.f50724a[it.f().ordinal()];
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: jd.c$l */
    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f50725a = new l();

        /* renamed from: jd.c$l$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50726a;

            static {
                int[] iArr = new int[EnumC4076c.values().length];
                try {
                    iArr[EnumC4076c.UNKNOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC4076c.WIFI.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC4076c.MOBILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC4076c.ETHERNET.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC4076c.DISCONNECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f50726a = iArr;
            }
        }

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Zc.e connection) {
            C6292a.EnumC1869a enumC1869a;
            AbstractC6492s.i(connection, "connection");
            int i10 = a.f50726a[connection.g().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                enumC1869a = C6292a.EnumC1869a.WIRELESS;
            } else if (i10 == 4) {
                enumC1869a = C6292a.EnumC1869a.WIRED;
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC1869a = null;
            }
            return new C6556a(enumC1869a);
        }
    }

    /* renamed from: jd.c$m */
    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f50727a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC4076c apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            return it.g();
        }
    }

    /* renamed from: jd.c$n */
    static final class n implements kg.j {

        /* renamed from: a, reason: collision with root package name */
        public static final n f50728a = new n();

        n() {
        }

        @Override // kg.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6292a a(C6556a c6556a, List topologyItems, C6556a c6556a2, C6292a.b myself, AbstractC4074a internet, EnumC4076c networkState) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(topologyItems, "topologyItems");
            AbstractC6492s.i(c6556a2, "<destruct>");
            AbstractC6492s.i(myself, "myself");
            AbstractC6492s.i(internet, "internet");
            AbstractC6492s.i(networkState, "networkState");
            C6292a.b bVar = (C6292a.b) c6556a.a();
            C6292a.b bVar2 = (C6292a.b) c6556a2.a();
            ArrayList arrayList = new ArrayList();
            if (bVar != null && networkState != EnumC4076c.MOBILE) {
                arrayList.add(bVar);
            }
            Iterator it = topologyItems.iterator();
            while (it.hasNext()) {
                arrayList.add((C6292a.b) it.next());
            }
            if (bVar2 != null) {
                if (!AbstractC6492s.d(bVar2.b(), bVar != null ? bVar.b() : null)) {
                    arrayList.add(bVar2);
                }
            }
            arrayList.add(myself);
            return new C6292a(internet, arrayList);
        }
    }

    /* renamed from: jd.c$o */
    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final o f50729a = new o();

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(C6556a c6556a) {
            List topology;
            AbstractC6492s.i(c6556a, "<destruct>");
            ApiNetworkWifimanDeviceInfo apiNetworkWifimanDeviceInfo = (ApiNetworkWifimanDeviceInfo) c6556a.a();
            if (apiNetworkWifimanDeviceInfo == null || (topology = apiNetworkWifimanDeviceInfo.getTopology()) == null) {
                return AbstractC3689v.l();
            }
            List listP0 = AbstractC3689v.P0(topology);
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (Object obj : listP0) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                ApiNetworkWifimanDeviceInfo.TopologyItem topologyItem = (ApiNetworkWifimanDeviceInfo.TopologyItem) obj;
                if (i10 == 0 || i10 == topology.size() - 1) {
                    topologyItem = null;
                }
                if (topologyItem != null) {
                    arrayList.add(topologyItem);
                }
                i10 = i11;
            }
            return arrayList;
        }
    }

    /* renamed from: jd.c$p */
    static final class p implements kg.g {
        p() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(Map networkDiscoveryResults, C3771a devices, List topologyItemsInBetween) {
            InterfaceC2557a interfaceC2557aA;
            Dc.j jVar;
            AbstractC6492s.i(networkDiscoveryResults, "networkDiscoveryResults");
            AbstractC6492s.i(devices, "devices");
            AbstractC6492s.i(topologyItemsInBetween, "topologyItemsInBetween");
            List<ApiNetworkWifimanDeviceInfo.TopologyItem> list = topologyItemsInBetween;
            C6294c c6294c = C6294c.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (ApiNetworkWifimanDeviceInfo.TopologyItem topologyItem : list) {
                inet.ipaddr.g gVarF = topologyItem.f();
                if (gVarF == null || (jVar = (Dc.j) networkDiscoveryResults.get(gVarF)) == null) {
                    interfaceC2557aA = null;
                } else {
                    C3772b c3772bU = jVar.u();
                    if (c3772bU == null || (interfaceC2557aA = (InterfaceC2557a.b) devices.a(c3772bU)) == null) {
                        interfaceC2557aA = Dc.n.a(jVar);
                    }
                }
                arrayList.add(c6294c.l(topologyItem, interfaceC2557aA));
            }
            return arrayList;
        }
    }

    public C6294c(Zc.f networkConnectionManager, Zc.a internetAvailabilityService, u wifiConnectionService, Dc.e networkDiscovery, InterfaceC4091e unifiWifimanApi, Cc.n deviceManager) {
        AbstractC6492s.i(networkConnectionManager, "networkConnectionManager");
        AbstractC6492s.i(internetAvailabilityService, "internetAvailabilityService");
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        AbstractC6492s.i(networkDiscovery, "networkDiscovery");
        AbstractC6492s.i(unifiWifimanApi, "unifiWifimanApi");
        AbstractC6492s.i(deviceManager, "deviceManager");
        gg.i iVarI2 = networkConnectionManager.getState().N0(k.f50723a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f50694a = iVarI2;
        gg.i iVarI22 = networkConnectionManager.getState().N0(l.f50725a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f50695b = iVarI22;
        gg.i iVarW = networkConnectionManager.getState().N0(f.f50715a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f50696c = iVarW;
        gg.i iVarW2 = gg.i.v(deviceManager.a(), networkDiscovery.b().N0(h.f50720a), i.f50721a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f50697d = iVarW2;
        gg.i iVarW3 = unifiWifimanApi.a().N0(b.f50710a).W().I1(new C1872c(networkDiscovery)).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f50698e = iVarW3;
        gg.i iVarW4 = gg.i.u(wifiConnectionService.a().N0(d.f50713a).W(), iVarW3, deviceManager.a(), e.f50714a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f50699f = iVarW4;
        gg.i iVarI23 = iVarI2.I1(new g(unifiWifimanApi)).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f50700g = iVarI23;
        gg.i iVarI24 = gg.i.u(networkDiscovery.b(), deviceManager.a(), unifiWifimanApi.a().N0(o.f50729a), new p()).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f50701h = iVarI24;
        gg.i iVarI25 = iVarI2.I1(new a(unifiWifimanApi, this)).W().o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f50702i = iVarI25;
        gg.i iVarI26 = gg.i.u(networkConnectionManager.getState(), deviceManager.b(), iVarI22, new j()).W().o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f50703j = iVarI26;
        gg.i iVarI27 = gg.i.r(d(), iVarI24, c(), b(), internetAvailabilityService.a(), networkConnectionManager.getState().N0(m.f50727a).W(), n.f50728a).W().o1(1).i2();
        AbstractC6492s.h(iVarI27, "refCount(...)");
        this.f50704k = iVarI27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6292a.b l(ApiNetworkWifimanDeviceInfo.TopologyItem topologyItem, InterfaceC2557a interfaceC2557a) {
        String iconDeviceUidb;
        C6292a.c cVar = C6292a.c.GENERIC;
        inet.ipaddr.g gVarF = topologyItem.f();
        String strB = null;
        inet.ipaddr.g gVarO = gVarF != null ? o(gVarF) : null;
        C6292a.EnumC1869a enumC1869a = AbstractC6492s.d(topologyItem.getHasWirelessUplinkConnection(), Boolean.TRUE) ? C6292a.EnumC1869a.WIRELESS : C6292a.EnumC1869a.WIRED;
        String strG = topologyItem.g();
        Integer numM = m(topologyItem);
        Integer iconEngine = topologyItem.getIconEngine();
        int iB = g.b.f13110b.b();
        if (iconEngine != null && iconEngine.intValue() == iB) {
            Integer numC = topologyItem.c();
            if (numC != null) {
                strB = g.a.b(Md.g.f13109a, String.valueOf(numC.intValue()), topologyItem.getIconEngine().intValue(), null, 4, null);
            }
        } else {
            int iB2 = g.c.f13113b.b();
            if (iconEngine != null && iconEngine.intValue() == iB2 && (iconDeviceUidb = topologyItem.getIconDeviceUidb()) != null) {
                strB = g.a.b(Md.g.f13109a, iconDeviceUidb, topologyItem.getIconEngine().intValue(), null, 4, null);
            }
        }
        return new C6292a.b(cVar, gVarO, enumC1869a, interfaceC2557a, new C6292a.d(strG, strB, n(topologyItem), numM));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer m(ApiNetworkWifimanDeviceInfo.TopologyItem topologyItem) {
        if (n(topologyItem) != null) {
            return topologyItem.getClientsCount();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S8.g n(ApiNetworkWifimanDeviceInfo.TopologyItem topologyItem) {
        Integer wifiExperience = topologyItem.getWifiExperience();
        if (wifiExperience == null) {
            return null;
        }
        return S8.g.f20381b.a(wifiExperience.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final inet.ipaddr.g o(inet.ipaddr.g gVar) {
        if (gVar.g1()) {
            return null;
        }
        return gVar;
    }

    @Override // jd.InterfaceC6293b
    public gg.i a() {
        return this.f50704k;
    }

    @Override // jd.InterfaceC6293b
    public gg.i b() {
        return this.f50703j;
    }

    @Override // jd.InterfaceC6293b
    public gg.i c() {
        return this.f50702i;
    }

    @Override // jd.InterfaceC6293b
    public gg.i d() {
        return this.f50700g;
    }
}
