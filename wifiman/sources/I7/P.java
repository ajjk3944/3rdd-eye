package I7;

import I7.P;
import Zg.AbstractC3689v;
import com.ubnt.teleport.TeleportTunnel;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.UnifiTeleportTunnelConnectionManager;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.teleport.unifi.stun.TeleportStun;
import com.wireguard.android.backend.BackendException;
import com.wireguard.android.backend.c;
import com.wireguard.config.BadConfigException;
import com.wireguard.config.ParseException;
import com.wireguard.config.a;
import com.wireguard.config.b;
import com.wireguard.config.c;
import com.wireguard.crypto.KeyFormatException;
import gg.AbstractC5912b;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class P implements UnifiTeleportTunnel {

    /* renamed from: u, reason: collision with root package name */
    public static final C2971a f8709u = new C2971a(null);

    /* renamed from: a, reason: collision with root package name */
    private final TeleportStun f8710a;

    /* renamed from: b, reason: collision with root package name */
    private final com.wireguard.android.backend.a f8711b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.a f8712c;

    /* renamed from: d, reason: collision with root package name */
    private final UnifiTeleportTunnel.a f8713d;

    /* renamed from: e, reason: collision with root package name */
    private final UnifiTeleportTunnelConnectionManager f8714e;

    /* renamed from: f, reason: collision with root package name */
    private final Fg.a f8715f;

    /* renamed from: g, reason: collision with root package name */
    private final Fg.a f8716g;

    /* renamed from: h, reason: collision with root package name */
    private final Fg.a f8717h;

    /* renamed from: i, reason: collision with root package name */
    private UnifiTeleportTunnel.f f8718i;

    /* renamed from: j, reason: collision with root package name */
    private final Fg.a f8719j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f8720k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.z f8721l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC5912b f8722m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f8723n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC5912b f8724o;

    /* renamed from: p, reason: collision with root package name */
    private final gg.z f8725p;

    /* renamed from: q, reason: collision with root package name */
    private final gg.z f8726q;

    /* renamed from: r, reason: collision with root package name */
    private InterfaceC6043c f8727r;

    /* renamed from: s, reason: collision with root package name */
    private final Fg.c f8728s;

    /* renamed from: t, reason: collision with root package name */
    private final AbstractC5912b f8729t;

    static final class A extends AbstractC6494u implements InterfaceC6835l {

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f8731a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(P p10) {
                super(0);
                this.f8731a = p10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "TUNNEL Open Connection " + ((Object) TeleportTunnel.d.f(this.f8731a.getConfig().b())) + " subscribed";
            }
        }

        A() {
            super(1);
        }

        public final void a(InterfaceC6043c interfaceC6043c) {
            N7.a.b(new a(P.this));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6043c) obj);
            return Yg.J.f24997a;
        }
    }

    static final class B extends AbstractC6494u implements InterfaceC6824a {
        B() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "TUNNEL Open Connection " + ((Object) TeleportTunnel.d.f(P.this.getConfig().b())) + " SUCCESS";
        }
    }

    static final class C extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8734b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.wireguard.crypto.b f8735c;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f8736a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f8737b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(P p10, String str) {
                super(1);
                this.f8736a = p10;
                this.f8737b = str;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D invoke(TeleportCloud.g gVar) {
                return this.f8736a.f8710a.createLocalPeerDescription(new TeleportStun.b(gVar.a(), this.f8737b));
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportCloud.f f8738a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.wireguard.crypto.b f8739b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f8740c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(TeleportCloud.f fVar, com.wireguard.crypto.b bVar, String str) {
                super(1);
                this.f8738a = fVar;
                this.f8739b = bVar;
                this.f8740c = str;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D invoke(String localPeerDescription) {
                TeleportCloud.f fVar = this.f8738a;
                String strH = this.f8739b.h();
                AbstractC6492s.h(strH, "toBase64()");
                AbstractC6492s.h(localPeerDescription, "localPeerDescription");
                return fVar.a(new TeleportCloud.d(strH, localPeerDescription, this.f8740c));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(String str, com.wireguard.crypto.b bVar) {
            super(1);
            this.f8734b = str;
            this.f8735c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.D j(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (gg.D) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.D l(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (gg.D) tmp0.invoke(obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final gg.D invoke(TeleportCloud.f fVar) {
            gg.z zVarD = fVar.d();
            final a aVar = new a(P.this, this.f8734b);
            gg.z zVarS = zVarD.s(new kg.n() { // from class: I7.x0
                @Override // kg.n
                public final Object apply(Object obj) {
                    return P.C.j(aVar, obj);
                }
            });
            final b bVar = new b(fVar, this.f8735c, this.f8734b);
            return zVarS.s(new kg.n() { // from class: I7.y0
                @Override // kg.n
                public final Object apply(Object obj) {
                    return P.C.l(bVar, obj);
                }
            });
        }
    }

    public static final class D implements InterfaceC5915e {
        public D() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                P.this.f8717h.h(Boolean.FALSE);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class E extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final E f8742a = new E();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8743a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Teleport connection reconnect() subscribed";
            }
        }

        E() {
            super(1);
        }

        public final void a(InterfaceC6043c interfaceC6043c) {
            N7.a.b(a.f8743a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6043c) obj);
            return Yg.J.f24997a;
        }
    }

    static final class F extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final F f8744a = new F();

        F() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Teleport connection reconnect() finished";
        }
    }

    static final class G implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ InterfaceC6835l f8745a;

        G(InterfaceC6835l function) {
            AbstractC6492s.i(function, "function");
            this.f8745a = function;
        }

        @Override // kg.InterfaceC6469f
        public final /* synthetic */ void accept(Object obj) {
            this.f8745a.invoke(obj);
        }
    }

    public static final class H implements InterfaceC5915e {
        public H() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                P.this.f8718i = null;
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class I implements gg.C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                String string = UUID.randomUUID().toString();
                AbstractC6492s.h(string, "randomUUID().toString()");
                interfaceC5910A.onSuccess(string);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public static final class J implements gg.C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new com.wireguard.crypto.c());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class K extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final K f8747a = new K();

        K() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifiTeleportTunnel.d invoke(Yg.s sVar) {
            Boolean isReconnecting = (Boolean) sVar.a();
            UnifiTeleportTunnel.d dVar = (UnifiTeleportTunnel.d) sVar.c();
            if (!(dVar instanceof UnifiTeleportTunnel.d.c)) {
                return dVar;
            }
            AbstractC6492s.h(isReconnecting, "isReconnecting");
            return isReconnecting.booleanValue() ? UnifiTeleportTunnel.d.b.c.f39312a : dVar;
        }
    }

    static final class L extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel.d f8749b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        L(UnifiTeleportTunnel.d dVar) {
            super(0);
            this.f8749b = dVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Teleport tunnel " + System.identityHashCode(P.this) + " state - " + this.f8749b;
        }
    }

    static final class M extends AbstractC6494u implements InterfaceC6835l {

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8751a = new a();

            a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a invoke(gg.i iVar) {
                return iVar.S(500L, TimeUnit.MILLISECONDS, Gg.a.d());
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f8752a;

            public static final class a implements gg.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ P f8753a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ com.wireguard.android.backend.b f8754b;

                public a(P p10, com.wireguard.android.backend.b bVar) {
                    this.f8753a = p10;
                    this.f8754b = bVar;
                }

                @Override // gg.q
                public final void a(gg.o oVar) {
                    try {
                        UnifiTeleportTunnel.f fVar = this.f8753a.f8718i;
                        UnifiTeleportTunnel.d.a aVar = null;
                        if (fVar != null && AbstractC6492s.d(this.f8753a.f8719j.l2(), Boolean.TRUE)) {
                            UnifiTeleportTunnelConnectionManager unifiTeleportTunnelConnectionManager = this.f8753a.f8714e;
                            com.wireguard.android.backend.b it = this.f8754b;
                            AbstractC6492s.h(it, "it");
                            aVar = new UnifiTeleportTunnel.d.a(fVar, unifiTeleportTunnelConnectionManager.Q(this.f8754b));
                        }
                        if (aVar != null) {
                            oVar.onSuccess(aVar);
                        } else {
                            oVar.a();
                        }
                    } catch (Throwable th2) {
                        oVar.onError(th2);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(P p10) {
                super(1);
                this.f8752a = p10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.r invoke(com.wireguard.android.backend.b bVar) {
                gg.n nVarC = gg.n.c(new a(this.f8752a, bVar));
                AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                return nVarC;
            }
        }

        public /* synthetic */ class c {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8755a;

            static {
                int[] iArr = new int[EnumC2972b.values().length];
                try {
                    iArr[EnumC2972b.UP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2972b.DOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f8755a = iArr;
            }
        }

        public static final class d implements gg.C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f8756a;

            public d(P p10) {
                this.f8756a = p10;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(this.f8756a.f8711b.c(this.f8756a));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        M() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Dj.a j(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (Dj.a) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.r l(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (gg.r) tmp0.invoke(obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Dj.a invoke(EnumC2972b enumC2972b) {
            int i10 = enumC2972b == null ? -1 : c.f8755a[enumC2972b.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return gg.i.j0();
                }
                throw new NoWhenBranchMatchedException();
            }
            gg.z zVarI = gg.z.i(new d(P.this));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            final a aVar = a.f8751a;
            gg.i iVarK = zVarI.K(new kg.n() { // from class: I7.z0
                @Override // kg.n
                public final Object apply(Object obj) {
                    return P.M.j(aVar, obj);
                }
            });
            final b bVar = new b(P.this);
            return iVarK.v0(new kg.n() { // from class: I7.A0
                @Override // kg.n
                public final Object apply(Object obj) {
                    return P.M.l(bVar, obj);
                }
            }).W();
        }
    }

    static final class N extends AbstractC6494u implements InterfaceC6835l {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f8758a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnel.d.a f8759b;

            public a(P p10, UnifiTeleportTunnel.d.a aVar) {
                this.f8758a = p10;
                this.f8759b = aVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    P p10 = this.f8758a;
                    UnifiTeleportTunnel.d.a state = this.f8759b;
                    AbstractC6492s.h(state, "state");
                    p10.k0(this.f8759b);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        N() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(UnifiTeleportTunnel.d.a aVar) {
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(P.this, aVar));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    /* renamed from: I7.P$a, reason: case insensitive filesystem */
    public static final class C2971a {
        public /* synthetic */ C2971a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2971a() {
        }
    }

    /* renamed from: I7.P$b, reason: case insensitive filesystem */
    private enum EnumC2972b {
        UP,
        DOWN
    }

    /* renamed from: I7.P$c, reason: case insensitive filesystem */
    public /* synthetic */ class C2973c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8760a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.a.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.a.TOGGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8760a = iArr;
        }
    }

    /* renamed from: I7.P$d, reason: case insensitive filesystem */
    static final class C2974d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: I7.P$d$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnel.d f8762a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UnifiTeleportTunnel.d dVar) {
                super(0);
                this.f8762a = dVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Teleport connection close() - calling interruptConnection(), state : " + this.f8762a;
            }
        }

        C2974d() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(UnifiTeleportTunnel.d dVar) {
            if (dVar instanceof UnifiTeleportTunnel.d.c) {
                return AbstractC5912b.m();
            }
            if (!(dVar instanceof UnifiTeleportTunnel.d.b ? true : dVar instanceof UnifiTeleportTunnel.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            N7.a.b(new a(dVar));
            return P.this.b0();
        }
    }

    /* renamed from: I7.P$e, reason: case insensitive filesystem */
    public static final class C2975e implements InterfaceC5915e {
        public C2975e() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                c.a aVarB = P.this.f8711b.b(P.this);
                c.a aVar = c.a.DOWN;
                if (aVarB != aVar) {
                    P.this.f8711b.a(P.this, aVar, null);
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: I7.P$f, reason: case insensitive filesystem */
    public static final class C2976f implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel.d.c f8765b;

        public C2976f(UnifiTeleportTunnel.d.c cVar) {
            this.f8765b = cVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                P.this.k0(this.f8765b);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: I7.P$g, reason: case insensitive filesystem */
    static final class C2977g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C2977g f8766a = new C2977g();

        /* renamed from: I7.P$g$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8767a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Connection interrupted by user";
            }
        }

        C2977g() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a invoke(Yg.J j10) {
            N7.a.b(a.f8767a);
            return gg.i.k0(UnifiTeleportTunnel.Error.InterruptedByUser.f39294a);
        }
    }

    /* renamed from: I7.P$h, reason: case insensitive filesystem */
    public static final class C2978h implements InterfaceC5915e {
        public C2978h() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                InterfaceC6043c interfaceC6043c = P.this.f8727r;
                if (interfaceC6043c != null) {
                    interfaceC6043c.dispose();
                }
                P.this.f8727r = null;
                P.this.f8717h.h(Boolean.FALSE);
                P.this.f8728s.h(Yg.J.f24997a);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: I7.P$i, reason: case insensitive filesystem */
    static final class C2979i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C2979i f8769a = new C2979i();

        /* renamed from: I7.P$i$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Boolean f8770a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Boolean bool) {
                super(0);
                this.f8770a = bool;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Reconnecting state " + this.f8770a;
            }
        }

        C2979i() {
            super(1);
        }

        public final void a(Boolean bool) {
            N7.a.b(new a(bool));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: I7.P$j, reason: case insensitive filesystem */
    static final class C2980j extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel.b f8772b;

        /* renamed from: I7.P$j$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Boolean f8773a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Boolean bool) {
                super(0);
                this.f8773a = bool;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Reconnection flag is " + this.f8773a;
            }
        }

        /* renamed from: I7.P$j$b */
        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnel.b f8774a;

            /* renamed from: I7.P$j$b$a */
            static final class a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AtomicInteger f8775a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ UnifiTeleportTunnel.b f8776b;

                /* renamed from: I7.P$j$b$a$a, reason: collision with other inner class name */
                static final class C0353a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ AtomicInteger f8777a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ UnifiTeleportTunnel.b f8778b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0353a(AtomicInteger atomicInteger, UnifiTeleportTunnel.b bVar) {
                        super(0);
                        this.f8777a = atomicInteger;
                        this.f8778b = bVar;
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Retrying to establish tunnel connection. Try num " + this.f8777a + '/' + ((UnifiTeleportTunnel.b.a.C1245a) this.f8778b.b()).b();
                    }
                }

                /* renamed from: I7.P$j$b$a$b, reason: collision with other inner class name */
                static final class C0354b extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ AtomicInteger f8779a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ UnifiTeleportTunnel.b f8780b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0354b(AtomicInteger atomicInteger, UnifiTeleportTunnel.b bVar) {
                        super(0);
                        this.f8779a = atomicInteger;
                        this.f8780b = bVar;
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Retry count exceeded max retry count " + this.f8779a + '/' + ((UnifiTeleportTunnel.b.a.C1245a) this.f8780b.b()).b();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(AtomicInteger atomicInteger, UnifiTeleportTunnel.b bVar) {
                    super(1);
                    this.f8775a = atomicInteger;
                    this.f8776b = bVar;
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a invoke(Throwable error) {
                    if (!(error instanceof UnifiTeleportTunnel.Error.InterruptedByUser) && (error instanceof UnifiTeleportTunnel.Error)) {
                        if (this.f8775a.getAndIncrement() < ((UnifiTeleportTunnel.b.a.C1245a) this.f8776b.b()).b()) {
                            N7.a.b(new C0353a(this.f8775a, this.f8776b));
                            return gg.i.d2(((UnifiTeleportTunnel.b.a.C1245a) this.f8776b.b()).a(), TimeUnit.MILLISECONDS);
                        }
                        N7.a.b(new C0354b(this.f8775a, this.f8776b));
                        AbstractC6492s.h(error, "error");
                        return gg.i.k0(new UnifiTeleportTunnel.Error.ReconnectionFailed((UnifiTeleportTunnel.Error) error));
                    }
                    return gg.i.k0(error);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(UnifiTeleportTunnel.b bVar) {
                super(1);
                this.f8774a = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Dj.a h(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                return (Dj.a) tmp0.invoke(obj);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Dj.a invoke(gg.i iVar) {
                if (!(this.f8774a.b() instanceof UnifiTeleportTunnel.b.a.C1245a)) {
                    throw new NoWhenBranchMatchedException();
                }
                final a aVar = new a(new AtomicInteger(), this.f8774a);
                return iVar.p0(new kg.n() { // from class: I7.X
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return P.C2980j.b.h(aVar, obj);
                    }
                });
            }
        }

        /* renamed from: I7.P$j$c */
        static final class c extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f8781a;

            /* renamed from: I7.P$j$c$a */
            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final a f8782a = new a();

                a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Reconnection failed";
                }
            }

            /* renamed from: I7.P$j$c$b */
            public static final class b implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ P f8783a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Throwable f8784b;

                public b(P p10, Throwable th2) {
                    this.f8783a = p10;
                    this.f8784b = th2;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        N7.a.b(a.f8782a);
                        P p10 = this.f8783a;
                        Throwable error = this.f8784b;
                        AbstractC6492s.h(error, "error");
                        p10.k0(new UnifiTeleportTunnel.d.c.a((UnifiTeleportTunnel.Error) this.f8784b));
                        this.f8783a.f8717h.h(Boolean.FALSE);
                        InterfaceC6043c interfaceC6043c = this.f8783a.f8727r;
                        if (interfaceC6043c != null) {
                            interfaceC6043c.dispose();
                        }
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(P p10) {
                super(1);
                this.f8781a = p10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f invoke(Throwable th2) {
                if (!(th2 instanceof UnifiTeleportTunnel.Error.ReconnectionFailed)) {
                    return AbstractC5912b.D(th2);
                }
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(this.f8781a, th2));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
        }

        /* renamed from: I7.P$j$d */
        static final class d extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final d f8785a = new d();

            /* renamed from: I7.P$j$d$a */
            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final a f8786a = new a();

                a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Reconnect subscribed";
                }
            }

            d() {
                super(1);
            }

            public final void a(InterfaceC6043c interfaceC6043c) {
                N7.a.b(a.f8786a);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC6043c) obj);
                return Yg.J.f24997a;
            }
        }

        /* renamed from: I7.P$j$e */
        static final class e extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f8787a;

            /* renamed from: I7.P$j$e$a */
            public /* synthetic */ class a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f8788a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ int[] f8789b;

                static {
                    int[] iArr = new int[Q.values().length];
                    try {
                        iArr[Q.CONNECTED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Q.LOOSING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Q.LOST.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f8788a = iArr;
                    int[] iArr2 = new int[EnumC2972b.values().length];
                    try {
                        iArr2[EnumC2972b.UP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr2[EnumC2972b.DOWN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f8789b = iArr2;
                }
            }

            /* renamed from: I7.P$j$e$b */
            public static final class b implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ P f8790a;

                public b(P p10) {
                    this.f8790a = p10;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        this.f8790a.f8717h.h(Boolean.TRUE);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            /* renamed from: I7.P$j$e$c */
            public static final class c implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ P f8791a;

                public c(P p10) {
                    this.f8791a = p10;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        this.f8791a.f8717h.h(Boolean.TRUE);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(P p10) {
                super(1);
                this.f8787a = p10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f invoke(Yg.s sVar) {
                EnumC2972b enumC2972b = (EnumC2972b) sVar.a();
                Q q10 = (Q) sVar.c();
                int i10 = enumC2972b == null ? -1 : a.f8789b[enumC2972b.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC5912b abstractC5912bR = AbstractC5912b.r(new c(this.f8787a));
                    AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                    return abstractC5912bR;
                }
                int i11 = a.f8788a[q10.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    return AbstractC5912b.m();
                }
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC5912b abstractC5912bR2 = AbstractC5912b.r(new b(this.f8787a));
                AbstractC6492s.h(abstractC5912bR2, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR2;
            }
        }

        /* renamed from: I7.P$j$f */
        static final class f extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final f f8792a = new f();

            /* renamed from: I7.P$j$f$a */
            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final a f8793a = new a();

                a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Reconnection check subscribed";
                }
            }

            f() {
                super(1);
            }

            public final void a(InterfaceC6043c interfaceC6043c) {
                N7.a.b(a.f8793a);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC6043c) obj);
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2980j(UnifiTeleportTunnel.b bVar) {
            super(1);
            this.f8772b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Dj.a o(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (Dj.a) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.f p(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (gg.f) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.f t(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (gg.f) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(Boolean reconnecting) {
            N7.a.b(new a(reconnecting));
            AbstractC6492s.h(reconnecting, "reconnecting");
            if (reconnecting.booleanValue()) {
                AbstractC5912b abstractC5912bD0 = P.this.D0(this.f8772b);
                final b bVar = new b(this.f8772b);
                AbstractC5912b abstractC5912bQ = abstractC5912bD0.Q(new kg.n() { // from class: I7.S
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return P.C2980j.o(bVar, obj);
                    }
                });
                final c cVar = new c(P.this);
                AbstractC5912b abstractC5912bO = abstractC5912bQ.O(new kg.n() { // from class: I7.T
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return P.C2980j.p(cVar, obj);
                    }
                });
                final d dVar = d.f8785a;
                return abstractC5912bO.B(new InterfaceC6469f() { // from class: I7.U
                    @Override // kg.InterfaceC6469f
                    public final void accept(Object obj) {
                        P.C2980j.r(dVar, obj);
                    }
                });
            }
            Ag.c cVar2 = Ag.c.f753a;
            Fg.a wireguardTunnelStateProcessor = P.this.f8715f;
            AbstractC6492s.h(wireguardTunnelStateProcessor, "wireguardTunnelStateProcessor");
            gg.i iVarA = cVar2.a(wireguardTunnelStateProcessor, P.this.f8714e.D());
            final e eVar = new e(P.this);
            AbstractC5912b abstractC5912bL1 = iVarA.L1(new kg.n() { // from class: I7.V
                @Override // kg.n
                public final Object apply(Object obj) {
                    return P.C2980j.t(eVar, obj);
                }
            });
            final f fVar = f.f8792a;
            return abstractC5912bL1.B(new InterfaceC6469f() { // from class: I7.W
                @Override // kg.InterfaceC6469f
                public final void accept(Object obj) {
                    P.C2980j.v(fVar, obj);
                }
            });
        }
    }

    /* renamed from: I7.P$k, reason: case insensitive filesystem */
    static final class C2981k extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f8794a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2981k(c.a aVar) {
            super(0);
            this.f8794a = aVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Processing new WG tunnel state " + this.f8794a;
        }
    }

    /* renamed from: I7.P$l, reason: case insensitive filesystem */
    static final class C2982l extends AbstractC6494u implements InterfaceC6824a {
        C2982l() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Closed tunnel " + P.this + " because it was closed by OS, probably by user from OS settings";
        }
    }

    /* renamed from: I7.P$m, reason: case insensitive filesystem */
    static final class C2983m extends AbstractC6494u implements InterfaceC6824a {
        C2983m() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Tunnel " + P.this + " closed";
        }
    }

    /* renamed from: I7.P$n, reason: case insensitive filesystem */
    static final class C2984n extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C2984n f8797a = new C2984n();

        C2984n() {
            super(1);
        }

        public final void a(Throwable th2) {
            throw new IllegalStateException("Tunnel close should never fail", th2);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    static final class o extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel.b f8799b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8800a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Connection opened, will prepare reconnection WorkerDisposable";
            }
        }

        static final class b implements InterfaceC6464a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f8801a = new b();

            b() {
            }

            @Override // kg.InterfaceC6464a
            public final void run() {
                throw new IllegalStateException("Tunnel reconnection worker should never complete");
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f8802a = new c();

            c() {
                super(1);
            }

            public final void a(Throwable th2) {
                throw new IllegalStateException("Tunnel reconnection worker should never end with error", th2);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Yg.J.f24997a;
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f8803a = new d();

            d() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "concatArray for take until for connection completed";
            }
        }

        static final class e extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final e f8804a = new e();

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Throwable f8805a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Throwable th2) {
                    super(0);
                    this.f8805a = th2;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "concatArray for take until for connection error : " + this.f8805a;
                }
            }

            e() {
                super(1);
            }

            public final void a(Throwable th2) {
                N7.a.b(new a(th2));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Yg.J.f24997a;
            }
        }

        static final class f extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnel.d f8806a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(UnifiTeleportTunnel.d dVar) {
                super(0);
                this.f8806a = dVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "UNIFI_TELEPORT_TUNNEL STATE : " + this.f8806a + " - will finish connection";
            }
        }

        public static final class g implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f8807a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnel.b f8808b;

            public g(P p10, UnifiTeleportTunnel.b bVar) {
                this.f8807a = p10;
                this.f8808b = bVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    N7.a.b(a.f8800a);
                    InterfaceC6043c interfaceC6043c = this.f8807a.f8727r;
                    if (interfaceC6043c != null) {
                        interfaceC6043c.dispose();
                    }
                    P p10 = this.f8807a;
                    p10.f8727r = p10.f0(this.f8808b).W(Gg.a.a()).U(b.f8801a, new G(c.f8802a));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(UnifiTeleportTunnel.b bVar) {
            super(1);
            this.f8799b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j() {
            N7.a.b(d.f8803a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(UnifiTeleportTunnel.d dVar) {
            if (!(dVar instanceof UnifiTeleportTunnel.d.c)) {
                if (!(dVar instanceof UnifiTeleportTunnel.d.b ? true : dVar instanceof UnifiTeleportTunnel.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                N7.a.b(new f(dVar));
                return AbstractC5912b.m();
            }
            AbstractC5912b abstractC5912bX = P.this.f8714e.x();
            AbstractC5912b abstractC5912bQ0 = P.this.q0(this.f8799b);
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new g(P.this, this.f8799b));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            AbstractC5912b abstractC5912bX2 = abstractC5912bR.x(new InterfaceC6464a() { // from class: I7.Y
                @Override // kg.InterfaceC6464a
                public final void run() {
                    P.o.j();
                }
            });
            final e eVar = e.f8804a;
            return AbstractC5912b.p(abstractC5912bX, abstractC5912bQ0, abstractC5912bX2.z(new InterfaceC6469f() { // from class: I7.Z
                @Override // kg.InterfaceC6469f
                public final void accept(Object obj) {
                    P.o.l(eVar, obj);
                }
            })).W(Gg.a.d());
        }
    }

    static final class p extends AbstractC6494u implements InterfaceC6835l {
        p() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a invoke(Throwable error) {
            AbstractC6492s.i(error, "error");
            return P.this.Z((error instanceof UnifiTeleportTunnel.Error ? (UnifiTeleportTunnel.Error) error : null) != null ? new UnifiTeleportTunnel.d.c.a((UnifiTeleportTunnel.Error) error) : UnifiTeleportTunnel.d.c.b.f39316a).h(gg.i.k0(error));
        }
    }

    static final class q extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final q f8810a = new q();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8811a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Teleport connection open() subscribed";
            }
        }

        q() {
            super(1);
        }

        public final void a(Dj.c cVar) {
            N7.a.b(a.f8811a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Dj.c) obj);
            return Yg.J.f24997a;
        }
    }

    static final class r extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final r f8812a = new r();

        r() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Teleport connection open() finished";
        }
    }

    static final class s extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final s f8813a = new s();

        s() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "TUNNEL previous connection closed";
        }
    }

    static final class t extends AbstractC6494u implements InterfaceC6835l {

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f8815a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(P p10) {
                super(0);
                this.f8815a = p10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "TUNNEL Open Connection " + ((Object) TeleportTunnel.d.f(this.f8815a.getConfig().b())) + " ERROR";
            }
        }

        t() {
            super(1);
        }

        public final void a(Throwable th2) {
            N7.a.c(new a(P.this), th2);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    static final class u extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final u f8816a = new u();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8817a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "TUNNEL initialization";
            }
        }

        u() {
            super(1);
        }

        public final void a(InterfaceC6043c interfaceC6043c) {
            N7.a.b(a.f8817a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6043c) obj);
            return Yg.J.f24997a;
        }
    }

    static final class v extends AbstractC6494u implements InterfaceC6835l {
        v() {
            super(1);
        }

        public final void a(InterfaceC6043c interfaceC6043c) {
            P.this.k0(UnifiTeleportTunnel.d.b.c.f39312a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6043c) obj);
            return Yg.J.f24997a;
        }
    }

    static final class w extends AbstractC6494u implements InterfaceC6835l {
        w() {
            super(1);
        }

        public final void a(InterfaceC6043c interfaceC6043c) {
            P.this.f8719j.h(Boolean.FALSE);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6043c) obj);
            return Yg.J.f24997a;
        }
    }

    static final class x extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final x f8820a = new x();

        x() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "TUNNEL initialization finished";
        }
    }

    static final class y extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel.b f8822b;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8823a = new a();

            /* renamed from: I7.P$y$a$a, reason: collision with other inner class name */
            static final class C0355a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0355a f8824a = new C0355a();

                C0355a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "TUNNEL peer description";
                }
            }

            a() {
                super(1);
            }

            public final void a(InterfaceC6043c interfaceC6043c) {
                N7.a.b(C0355a.f8824a);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC6043c) obj);
                return Yg.J.f24997a;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f8825a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(P p10) {
                super(1);
                this.f8825a = p10;
            }

            public final void a(InterfaceC6043c interfaceC6043c) {
                this.f8825a.k0(UnifiTeleportTunnel.d.b.C1247d.f39313a);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC6043c) obj);
                return Yg.J.f24997a;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f8826a = new c();

            static final class a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final a f8827a = new a();

                a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "TUNNEL peer description exchanged";
                }
            }

            c() {
                super(1);
            }

            public final void a(TeleportCloud.a aVar) {
                N7.a.b(a.f8827a);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((TeleportCloud.a) obj);
                return Yg.J.f24997a;
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f8828a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f8829b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnel.b f8830c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.wireguard.crypto.c f8831d;

            static final class a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final a f8832a = new a();

                /* renamed from: I7.P$y$d$a$a, reason: collision with other inner class name */
                static final class C0356a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0356a f8833a = new C0356a();

                    C0356a() {
                        super(0);
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "TUNNEL connection handshake";
                    }
                }

                a() {
                    super(1);
                }

                public final void a(InterfaceC6043c interfaceC6043c) {
                    N7.a.b(C0356a.f8833a);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((InterfaceC6043c) obj);
                    return Yg.J.f24997a;
                }
            }

            static final class b extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ P f8834a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(P p10) {
                    super(1);
                    this.f8834a = p10;
                }

                public final void a(InterfaceC6043c interfaceC6043c) {
                    this.f8834a.k0(UnifiTeleportTunnel.d.b.C1246b.f39311a);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((InterfaceC6043c) obj);
                    return Yg.J.f24997a;
                }
            }

            static final class c extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final c f8835a = new c();

                static final class a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f8836a = new a();

                    a() {
                        super(0);
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "TUNNEL connection handshake success";
                    }
                }

                c() {
                    super(1);
                }

                public final void a(TeleportStun.a aVar) {
                    N7.a.b(a.f8836a);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((TeleportStun.a) obj);
                    return Yg.J.f24997a;
                }
            }

            /* renamed from: I7.P$y$d$d, reason: collision with other inner class name */
            static final class C0357d extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ P f8837a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ UnifiTeleportTunnel.b f8838b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ TeleportCloud.a f8839c;

                /* renamed from: I7.P$y$d$d$a */
                static final class a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ P f8840a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(P p10) {
                        super(0);
                        this.f8840a = p10;
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "TUNNEL CONFIG STORED - cfg: " + this.f8840a.f8718i;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0357d(P p10, UnifiTeleportTunnel.b bVar, TeleportCloud.a aVar) {
                    super(1);
                    this.f8837a = p10;
                    this.f8838b = bVar;
                    this.f8839c = aVar;
                }

                public final void a(TeleportStun.a ipParams) {
                    P p10 = this.f8837a;
                    UnifiTeleportTunnel.b bVar = this.f8838b;
                    TeleportCloud.a connectionInfo = this.f8839c;
                    AbstractC6492s.h(connectionInfo, "connectionInfo");
                    AbstractC6492s.h(ipParams, "ipParams");
                    p10.f8718i = p10.e0(bVar, connectionInfo, ipParams);
                    N7.a.b(new a(this.f8837a));
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((TeleportStun.a) obj);
                    return Yg.J.f24997a;
                }
            }

            static final class e extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ UnifiTeleportTunnel.b f8841a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ TeleportCloud.a f8842b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ P f8843c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.wireguard.crypto.c f8844d;

                static final class a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f8845a = new a();

                    a() {
                        super(0);
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "TUNNEL requesting Tunnel UP";
                    }
                }

                static final class b extends AbstractC6494u implements InterfaceC6835l {

                    /* renamed from: a, reason: collision with root package name */
                    public static final b f8846a = new b();

                    static final class a extends AbstractC6494u implements InterfaceC6824a {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ Throwable f8847a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        a(Throwable th2) {
                            super(0);
                            this.f8847a = th2;
                        }

                        @Override // mh.InterfaceC6824a
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "TUNNEL wireguard error : " + this.f8847a;
                        }
                    }

                    b() {
                        super(1);
                    }

                    public final void a(Throwable th2) {
                        N7.a.c(new a(th2), th2);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((Throwable) obj);
                        return Yg.J.f24997a;
                    }
                }

                static final class c extends AbstractC6494u implements InterfaceC6835l {

                    /* renamed from: a, reason: collision with root package name */
                    public static final c f8848a = new c();

                    static final class a extends AbstractC6494u implements InterfaceC6824a {

                        /* renamed from: a, reason: collision with root package name */
                        public static final a f8849a = new a();

                        a() {
                            super(0);
                        }

                        @Override // mh.InterfaceC6824a
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "TUNNEL requesting connection activation";
                        }
                    }

                    c() {
                        super(1);
                    }

                    public final void a(InterfaceC6043c interfaceC6043c) {
                        N7.a.b(a.f8849a);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((InterfaceC6043c) obj);
                        return Yg.J.f24997a;
                    }
                }

                /* renamed from: I7.P$y$d$e$d, reason: collision with other inner class name */
                static final class C0358d extends AbstractC6494u implements InterfaceC6835l {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ P f8850a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0358d(P p10) {
                        super(1);
                        this.f8850a = p10;
                    }

                    public final void a(InterfaceC6043c interfaceC6043c) {
                        UnifiTeleportTunnel.f fVar = this.f8850a.f8718i;
                        if (fVar != null) {
                            this.f8850a.k0(new UnifiTeleportTunnel.d.b.e(fVar));
                        }
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((InterfaceC6043c) obj);
                        return Yg.J.f24997a;
                    }
                }

                /* renamed from: I7.P$y$d$e$e, reason: collision with other inner class name */
                static final class C0359e extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0359e f8851a = new C0359e();

                    C0359e() {
                        super(0);
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "TUNNEL requesting connection activation success";
                    }
                }

                static final class f extends AbstractC6494u implements InterfaceC6835l {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ P f8852a;

                    static final class a extends AbstractC6494u implements InterfaceC6824a {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ c.a f8853a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        a(c.a aVar) {
                            super(0);
                            this.f8853a = aVar;
                        }

                        @Override // mh.InterfaceC6824a
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "STUN ACTIVATE CONNECTION - will start activate connection : " + this.f8853a;
                        }
                    }

                    static final class b extends AbstractC6494u implements InterfaceC6824a {

                        /* renamed from: a, reason: collision with root package name */
                        public static final b f8854a = new b();

                        b() {
                            super(0);
                        }

                        @Override // mh.InterfaceC6824a
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "STUN ACTIVATE CONNECTION - completed activate connection";
                        }
                    }

                    static final class c extends AbstractC6494u implements InterfaceC6835l {

                        /* renamed from: a, reason: collision with root package name */
                        public static final c f8855a = new c();

                        static final class a extends AbstractC6494u implements InterfaceC6824a {

                            /* renamed from: a, reason: collision with root package name */
                            public static final a f8856a = new a();

                            a() {
                                super(0);
                            }

                            @Override // mh.InterfaceC6824a
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                return "TUNNEL requesting connection activation";
                            }
                        }

                        c() {
                            super(1);
                        }

                        public final void a(InterfaceC6043c interfaceC6043c) {
                            N7.a.b(a.f8856a);
                        }

                        @Override // mh.InterfaceC6835l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((InterfaceC6043c) obj);
                            return Yg.J.f24997a;
                        }
                    }

                    /* renamed from: I7.P$y$d$e$f$d, reason: collision with other inner class name */
                    static final class C0360d extends AbstractC6494u implements InterfaceC6835l {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ P f8857a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0360d(P p10) {
                            super(1);
                            this.f8857a = p10;
                        }

                        public final void a(InterfaceC6043c interfaceC6043c) {
                            UnifiTeleportTunnel.f fVar = this.f8857a.f8718i;
                            if (fVar != null) {
                                this.f8857a.k0(new UnifiTeleportTunnel.d.b.a(fVar));
                            }
                        }

                        @Override // mh.InterfaceC6835l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((InterfaceC6043c) obj);
                            return Yg.J.f24997a;
                        }
                    }

                    /* renamed from: I7.P$y$d$e$f$e, reason: collision with other inner class name */
                    static final class C0361e extends AbstractC6494u implements InterfaceC6835l {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C0361e f8858a = new C0361e();

                        /* renamed from: I7.P$y$d$e$f$e$a */
                        static final class a extends AbstractC6494u implements InterfaceC6824a {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ Throwable f8859a;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            a(Throwable th2) {
                                super(0);
                                this.f8859a = th2;
                            }

                            @Override // mh.InterfaceC6824a
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                return "TUNNEL requesting connection action error : " + this.f8859a;
                            }
                        }

                        C0361e() {
                            super(1);
                        }

                        public final void a(Throwable th2) {
                            N7.a.c(new a(th2), th2);
                        }

                        @Override // mh.InterfaceC6835l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((Throwable) obj);
                            return Yg.J.f24997a;
                        }
                    }

                    /* renamed from: I7.P$y$d$e$f$f, reason: collision with other inner class name */
                    static final class C0362f extends AbstractC6494u implements InterfaceC6824a {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C0362f f8860a = new C0362f();

                        C0362f() {
                            super(0);
                        }

                        @Override // mh.InterfaceC6824a
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "TUNNEL requesting connection activation finished";
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    f(P p10) {
                        super(1);
                        this.f8852a = p10;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void o() {
                        N7.a.b(b.f8854a);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void p(InterfaceC6835l tmp0, Object obj) {
                        AbstractC6492s.i(tmp0, "$tmp0");
                        tmp0.invoke(obj);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void r(InterfaceC6835l tmp0, Object obj) {
                        AbstractC6492s.i(tmp0, "$tmp0");
                        tmp0.invoke(obj);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void t(InterfaceC6835l tmp0, Object obj) {
                        AbstractC6492s.i(tmp0, "$tmp0");
                        tmp0.invoke(obj);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void v() {
                        N7.a.b(C0362f.f8860a);
                    }

                    @Override // mh.InterfaceC6835l
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final gg.f invoke(c.a aVar) {
                        N7.a.b(new a(aVar));
                        AbstractC5912b abstractC5912bX = this.f8852a.f8710a.activateConnection().x(new InterfaceC6464a() { // from class: I7.s0
                            @Override // kg.InterfaceC6464a
                            public final void run() {
                                P.y.d.e.f.o();
                            }
                        });
                        final c cVar = c.f8855a;
                        AbstractC5912b abstractC5912bB = abstractC5912bX.B(new InterfaceC6469f() { // from class: I7.t0
                            @Override // kg.InterfaceC6469f
                            public final void accept(Object obj) {
                                P.y.d.e.f.p(cVar, obj);
                            }
                        });
                        final C0360d c0360d = new C0360d(this.f8852a);
                        AbstractC5912b abstractC5912bB2 = abstractC5912bB.B(new InterfaceC6469f() { // from class: I7.u0
                            @Override // kg.InterfaceC6469f
                            public final void accept(Object obj) {
                                P.y.d.e.f.r(c0360d, obj);
                            }
                        });
                        final C0361e c0361e = C0361e.f8858a;
                        return abstractC5912bB2.z(new InterfaceC6469f() { // from class: I7.v0
                            @Override // kg.InterfaceC6469f
                            public final void accept(Object obj) {
                                P.y.d.e.f.t(c0361e, obj);
                            }
                        }).w(new InterfaceC6464a() { // from class: I7.w0
                            @Override // kg.InterfaceC6464a
                            public final void run() {
                                P.y.d.e.f.v();
                            }
                        });
                    }
                }

                public static final class g implements gg.C {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ UnifiTeleportTunnel.b f8861a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ TeleportCloud.a f8862b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ TeleportStun.a f8863c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ P f8864d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ com.wireguard.crypto.c f8865e;

                    public g(UnifiTeleportTunnel.b bVar, TeleportCloud.a aVar, TeleportStun.a aVar2, P p10, com.wireguard.crypto.c cVar) {
                        this.f8861a = bVar;
                        this.f8862b = aVar;
                        this.f8863c = aVar2;
                        this.f8864d = p10;
                        this.f8865e = cVar;
                    }

                    @Override // gg.C
                    public final void a(InterfaceC5910A interfaceC5910A) {
                        try {
                            N7.a.b(a.f8845a);
                            int iA = this.f8861a.a();
                            String hostAddress = this.f8862b.c().getHostAddress();
                            String strA = this.f8863c.a();
                            int iB = this.f8863c.b();
                            String strC = this.f8863c.c();
                            int iD = this.f8863c.d();
                            List listA = this.f8862b.a();
                            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listA, 10));
                            Iterator it = listA.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((InetAddress) it.next()).getHostAddress());
                            }
                            String strA2 = this.f8862b.b().a();
                            String hostAddress2 = this.f8862b.d().getHostAddress();
                            int iE = this.f8862b.e();
                            P p10 = this.f8864d;
                            com.wireguard.crypto.c encKeypar = this.f8865e;
                            AbstractC6492s.h(encKeypar, "encKeypar");
                            com.wireguard.crypto.c cVar = this.f8865e;
                            AbstractC6492s.h(hostAddress, "hostAddress");
                            AbstractC6492s.h(hostAddress2, "hostAddress");
                            interfaceC5910A.onSuccess(this.f8864d.f8711b.a(this.f8864d, c.a.UP, p10.h0(iA, cVar, strA2, strA, iB, strC, iD, hostAddress, hostAddress2, iE, arrayList)));
                        } catch (Throwable th2) {
                            interfaceC5910A.onError(th2);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(UnifiTeleportTunnel.b bVar, TeleportCloud.a aVar, P p10, com.wireguard.crypto.c cVar) {
                    super(1);
                    this.f8841a = bVar;
                    this.f8842b = aVar;
                    this.f8843c = p10;
                    this.f8844d = cVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void o(InterfaceC6835l tmp0, Object obj) {
                    AbstractC6492s.i(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void p(InterfaceC6835l tmp0, Object obj) {
                    AbstractC6492s.i(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void r(InterfaceC6835l tmp0, Object obj) {
                    AbstractC6492s.i(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void t() {
                    N7.a.b(C0359e.f8851a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final gg.f v(InterfaceC6835l tmp0, Object obj) {
                    AbstractC6492s.i(tmp0, "$tmp0");
                    return (gg.f) tmp0.invoke(obj);
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final gg.f invoke(TeleportStun.a aVar) {
                    gg.z zVarI = gg.z.i(new g(this.f8841a, this.f8842b, aVar, this.f8843c, this.f8844d));
                    AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
                    final b bVar = b.f8846a;
                    gg.z zVarM = zVarI.m(new InterfaceC6469f() { // from class: I7.n0
                        @Override // kg.InterfaceC6469f
                        public final void accept(Object obj) {
                            P.y.d.e.o(bVar, obj);
                        }
                    });
                    final c cVar = c.f8848a;
                    gg.z zVarN = zVarM.n(new InterfaceC6469f() { // from class: I7.o0
                        @Override // kg.InterfaceC6469f
                        public final void accept(Object obj) {
                            P.y.d.e.p(cVar, obj);
                        }
                    });
                    final C0358d c0358d = new C0358d(this.f8843c);
                    gg.z zVarL = zVarN.n(new InterfaceC6469f() { // from class: I7.p0
                        @Override // kg.InterfaceC6469f
                        public final void accept(Object obj) {
                            P.y.d.e.r(c0358d, obj);
                        }
                    }).l(new InterfaceC6464a() { // from class: I7.q0
                        @Override // kg.InterfaceC6464a
                        public final void run() {
                            P.y.d.e.t();
                        }
                    });
                    final f fVar = new f(this.f8843c);
                    return zVarL.t(new kg.n() { // from class: I7.r0
                        @Override // kg.n
                        public final Object apply(Object obj) {
                            return P.y.d.e.v(fVar, obj);
                        }
                    });
                }
            }

            static final class f extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final f f8866a = new f();

                f() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "TUNNEL UP request finished";
                }
            }

            static final class g extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final g f8867a = new g();

                static final class a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f8868a = new a();

                    a() {
                        super(0);
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "TUNNEL UDP echo setting up";
                    }
                }

                g() {
                    super(1);
                }

                public final void a(InterfaceC6043c interfaceC6043c) {
                    N7.a.b(a.f8868a);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((InterfaceC6043c) obj);
                    return Yg.J.f24997a;
                }
            }

            static final class h extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final h f8869a = new h();

                static final class a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Throwable f8870a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(Throwable th2) {
                        super(0);
                        this.f8870a = th2;
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "TUNNEL UDP setup error : " + this.f8870a;
                    }
                }

                h() {
                    super(1);
                }

                public final void a(Throwable th2) {
                    N7.a.c(new a(th2), th2);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((Throwable) obj);
                    return Yg.J.f24997a;
                }
            }

            static final class i extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final i f8871a = new i();

                i() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "TUNNEL UDP Echo setup finished";
                }
            }

            public static final class j implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ P f8872a;

                public j(P p10) {
                    this.f8872a = p10;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        this.f8872a.f8719j.h(Boolean.TRUE);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(P p10, String str, UnifiTeleportTunnel.b bVar, com.wireguard.crypto.c cVar) {
                super(1);
                this.f8828a = p10;
                this.f8829b = str;
                this.f8830c = bVar;
                this.f8831d = cVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void B(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void E(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void J(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final gg.f S(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                return (gg.f) tmp0.invoke(obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void T() {
                N7.a.b(f.f8866a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b0(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d0(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void f0() {
                N7.a.b(i.f8871a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void v(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final gg.f invoke(TeleportCloud.a aVar) {
                gg.z zVar = this.f8828a.f8710a.setupPeerConnection(aVar.b().b());
                final a aVar2 = a.f8832a;
                gg.z zVarN = zVar.n(new InterfaceC6469f() { // from class: I7.e0
                    @Override // kg.InterfaceC6469f
                    public final void accept(Object obj) {
                        P.y.d.v(aVar2, obj);
                    }
                });
                final b bVar = new b(this.f8828a);
                gg.z zVarN2 = zVarN.n(new InterfaceC6469f() { // from class: I7.f0
                    @Override // kg.InterfaceC6469f
                    public final void accept(Object obj) {
                        P.y.d.B(bVar, obj);
                    }
                });
                final c cVar = c.f8835a;
                gg.z zVarO = zVarN2.o(new InterfaceC6469f() { // from class: I7.g0
                    @Override // kg.InterfaceC6469f
                    public final void accept(Object obj) {
                        P.y.d.E(cVar, obj);
                    }
                });
                final C0357d c0357d = new C0357d(this.f8828a, this.f8830c, aVar);
                gg.z zVarO2 = zVarO.o(new InterfaceC6469f() { // from class: I7.h0
                    @Override // kg.InterfaceC6469f
                    public final void accept(Object obj) {
                        P.y.d.J(c0357d, obj);
                    }
                });
                final e eVar = new e(this.f8830c, aVar, this.f8828a, this.f8831d);
                AbstractC5912b abstractC5912bX = zVarO2.t(new kg.n() { // from class: I7.i0
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return P.y.d.S(eVar, obj);
                    }
                }).x(new InterfaceC6464a() { // from class: I7.j0
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        P.y.d.T();
                    }
                });
                UnifiTeleportTunnelConnectionManager unifiTeleportTunnelConnectionManager = this.f8828a.f8714e;
                InetAddress inetAddressF = aVar.f();
                int iG = aVar.g();
                String stunSessionSecret = this.f8829b;
                AbstractC6492s.h(stunSessionSecret, "stunSessionSecret");
                AbstractC5912b abstractC5912bL = unifiTeleportTunnelConnectionManager.L(new UnifiTeleportTunnelConnectionManager.c(stunSessionSecret, inetAddressF, iG, 2000L, 10000L, 5000L, 20000L));
                final g gVar = g.f8867a;
                AbstractC5912b abstractC5912bB = abstractC5912bL.B(new InterfaceC6469f() { // from class: I7.k0
                    @Override // kg.InterfaceC6469f
                    public final void accept(Object obj) {
                        P.y.d.b0(gVar, obj);
                    }
                });
                final h hVar = h.f8869a;
                AbstractC5912b abstractC5912bG = abstractC5912bX.g(abstractC5912bB.z(new InterfaceC6469f() { // from class: I7.l0
                    @Override // kg.InterfaceC6469f
                    public final void accept(Object obj) {
                        P.y.d.d0(hVar, obj);
                    }
                }).w(new InterfaceC6464a() { // from class: I7.m0
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        P.y.d.f0();
                    }
                }));
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new j(this.f8828a));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bG.g(abstractC5912bR);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(UnifiTeleportTunnel.b bVar) {
            super(1);
            this.f8822b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.f r(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (gg.f) tmp0.invoke(obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(Yg.s sVar) {
            String stunSessionSecret = (String) sVar.a();
            com.wireguard.crypto.c cVar = (com.wireguard.crypto.c) sVar.c();
            P p10 = P.this;
            com.wireguard.crypto.b bVarB = cVar.b();
            AbstractC6492s.h(bVarB, "encKeypar.publicKey");
            AbstractC6492s.h(stunSessionSecret, "stunSessionSecret");
            gg.z zVarB0 = p10.B0(bVarB, stunSessionSecret);
            final a aVar = a.f8823a;
            gg.z zVarN = zVarB0.n(new InterfaceC6469f() { // from class: I7.a0
                @Override // kg.InterfaceC6469f
                public final void accept(Object obj) {
                    P.y.n(aVar, obj);
                }
            });
            final b bVar = new b(P.this);
            gg.z zVarN2 = zVarN.n(new InterfaceC6469f() { // from class: I7.b0
                @Override // kg.InterfaceC6469f
                public final void accept(Object obj) {
                    P.y.o(bVar, obj);
                }
            });
            final c cVar2 = c.f8826a;
            gg.z zVarO = zVarN2.o(new InterfaceC6469f() { // from class: I7.c0
                @Override // kg.InterfaceC6469f
                public final void accept(Object obj) {
                    P.y.p(cVar2, obj);
                }
            });
            final d dVar = new d(P.this, stunSessionSecret, this.f8822b, cVar);
            return zVarO.t(new kg.n() { // from class: I7.d0
                @Override // kg.n
                public final Object apply(Object obj) {
                    return P.y.r(dVar, obj);
                }
            });
        }
    }

    static final class z extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final z f8873a = new z();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8874a;

            static {
                int[] iArr = new int[BackendException.a.values().length];
                try {
                    iArr[BackendException.a.VPN_NOT_AUTHORIZED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BackendException.a.UNKNOWN_KERNEL_MODULE_NAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BackendException.a.WG_QUICK_CONFIG_ERROR_CODE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BackendException.a.TUNNEL_MISSING_CONFIG.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BackendException.a.TUN_CREATION_ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[BackendException.a.GO_ACTIVATION_ERROR_CODE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[BackendException.a.UNABLE_TO_START_VPN.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[BackendException.a.DNS_RESOLUTION_FAILURE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f8874a = iArr;
            }
        }

        z() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(Throwable error) {
            if (error instanceof TeleportCloud.Error) {
                AbstractC6492s.h(error, "error");
                return AbstractC5912b.D(new UnifiTeleportTunnel.Error.Cloud((Exception) error));
            }
            if (error instanceof TeleportStun.Error) {
                AbstractC6492s.h(error, "error");
                return AbstractC5912b.D(new UnifiTeleportTunnel.Error.Stun((Exception) error));
            }
            if (!(error instanceof BackendException)) {
                return AbstractC5912b.D(error);
            }
            BackendException backendException = (BackendException) error;
            BackendException.a aVarA = backendException.a();
            switch (aVarA == null ? -1 : a.f8874a[aVarA.ordinal()]) {
                case -1:
                    throw new IllegalStateException("Wireguard error with no reason");
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    return AbstractC5912b.D(UnifiTeleportTunnel.Error.Wireguard.VPNUnauthorized.f39301a);
                case 2:
                case 3:
                case 4:
                    return AbstractC5912b.D(new UnifiTeleportTunnel.Error.Wireguard.Config((Exception) error, backendException.a().toString()));
                case 5:
                case 6:
                case 7:
                case 8:
                    AbstractC6492s.h(error, "error");
                    return AbstractC5912b.D(new UnifiTeleportTunnel.Error.Wireguard.Connection((Exception) error, backendException.a().toString()));
            }
        }
    }

    public P(UnifiTeleportTunnel.a config, TeleportCloud.c cloudFactory, TeleportStun stun, com.wireguard.android.backend.a wgBackend) {
        AbstractC6492s.i(config, "config");
        AbstractC6492s.i(cloudFactory, "cloudFactory");
        AbstractC6492s.i(stun, "stun");
        AbstractC6492s.i(wgBackend, "wgBackend");
        this.f8710a = stun;
        this.f8711b = wgBackend;
        Fg.a aVarK2 = Fg.a.k2(config);
        this.f8712c = aVarK2;
        Object objL2 = aVarK2.l2();
        AbstractC6492s.f(objL2);
        this.f8713d = (UnifiTeleportTunnel.a) objL2;
        this.f8714e = new UnifiTeleportTunnelConnectionManager();
        Fg.a aVarK22 = Fg.a.k2(EnumC2972b.DOWN);
        this.f8715f = aVarK22;
        Fg.a aVarK23 = Fg.a.k2(UnifiTeleportTunnel.d.c.b.f39316a);
        this.f8716g = aVarK23;
        Boolean bool = Boolean.FALSE;
        Fg.a aVarK24 = Fg.a.k2(bool);
        this.f8717h = aVarK24;
        this.f8719j = Fg.a.k2(bool);
        gg.i iVarW = aVarK24.e1().X0(Gg.a.a()).W();
        final C2979i c2979i = C2979i.f8769a;
        gg.i isReconnecting = iVarW.f0(new InterfaceC6469f() { // from class: I7.A
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                P.c0(c2979i, obj);
            }
        }).o1(1).i2();
        this.f8720k = isReconnecting;
        this.f8721l = cloudFactory.b(config.a());
        gg.i iVarX0 = aVarK22.e1().W().X0(Gg.a.d());
        final M m10 = new M();
        gg.i iVarI1 = iVarX0.I1(new kg.n() { // from class: I7.B
            @Override // kg.n
            public final Object apply(Object obj) {
                return P.I0(m10, obj);
            }
        });
        final N n10 = new N();
        AbstractC5912b abstractC5912bW = iVarI1.t0(new kg.n() { // from class: I7.C
            @Override // kg.n
            public final Object apply(Object obj) {
                return P.J0(n10, obj);
            }
        }).W(Gg.a.a());
        AbstractC6492s.h(abstractC5912bW, "wireguardTunnelStateProc…Schedulers.computation())");
        this.f8722m = abstractC5912bW;
        Ag.c cVar = Ag.c.f753a;
        AbstractC6492s.h(isReconnecting, "isReconnecting");
        gg.i iVarW2 = aVarK23.e1().W();
        AbstractC6492s.h(iVarW2, "stateProcessor\n         …  .distinctUntilChanged()");
        gg.i iVarU0 = cVar.a(isReconnecting, iVarW2).U0(abstractC5912bW);
        final K k10 = K.f8747a;
        gg.i iVarI2 = iVarU0.N0(new kg.n() { // from class: I7.D
            @Override // kg.n
            public final Object apply(Object obj) {
                return P.G0(k10, obj);
            }
        }).W().r1(new InterfaceC6465b() { // from class: I7.E
            @Override // kg.InterfaceC6465b
            public final Object apply(Object obj, Object obj2) {
                return P.H0(this.f8693a, (UnifiTeleportTunnel.d) obj, (UnifiTeleportTunnel.d) obj2);
            }
        }).X0(Gg.a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "Flowables.combineLatest(…)\n            .refCount()");
        this.f8723n = iVarI2;
        AbstractC5912b abstractC5912bClosePeer = stun.closePeer();
        AbstractC5912b abstractC5912bCloseConnection = stun.closeConnection();
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new H());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(abstractC5912bClosePeer, abstractC5912bCloseConnection, abstractC5912bR);
        AbstractC6492s.h(abstractC5912bP, "concatArray(\n        stu…figuration = null }\n    )");
        this.f8724o = abstractC5912bP;
        gg.z zVarI = gg.z.i(new I());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        this.f8725p = zVarI;
        gg.z zVarI2 = gg.z.i(new J());
        AbstractC6492s.h(zVarI2, "crossinline action: () -…or(error)\n        }\n    }");
        this.f8726q = zVarI2;
        Fg.c cVarJ2 = Fg.c.j2();
        this.f8728s = cVarJ2;
        gg.i iVarX02 = cVarJ2.X0(Gg.a.a());
        final C2977g c2977g = C2977g.f8766a;
        AbstractC5912b abstractC5912bE0 = iVarX02.p0(new kg.n() { // from class: I7.F
            @Override // kg.n
            public final Object apply(Object obj) {
                return P.a0(c2977g, obj);
            }
        }).o1(1).i2().E0();
        AbstractC6492s.h(abstractC5912bE0, "interruptedProcessor\n   …        .ignoreElements()");
        this.f8729t = abstractC5912bE0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.z B0(com.wireguard.crypto.b bVar, String str) {
        gg.z zVar = this.f8721l;
        final C c10 = new C(str, bVar);
        gg.z zVarS = zVar.s(new kg.n() { // from class: I7.q
            @Override // kg.n
            public final Object apply(Object obj) {
                return P.C0(c10, obj);
            }
        });
        AbstractC6492s.h(zVarS, "private fun peerDescript…          }\n            }");
        return zVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.D C0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.D) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b D0(UnifiTeleportTunnel.b bVar) {
        AbstractC5912b abstractC5912b = this.f8729t;
        AbstractC5912b abstractC5912bZ = Z(UnifiTeleportTunnel.d.c.C1248c.f39317a);
        AbstractC5912b abstractC5912bQ0 = q0(bVar);
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new D());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bX = abstractC5912b.X(AbstractC5912b.p(abstractC5912bZ, abstractC5912bQ0, abstractC5912bR).W(Gg.a.d()));
        final E e10 = E.f8742a;
        AbstractC5912b abstractC5912bW = abstractC5912bX.B(new InterfaceC6469f() { // from class: I7.r
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                P.E0(e10, obj);
            }
        }).w(new InterfaceC6464a() { // from class: I7.s
            @Override // kg.InterfaceC6464a
            public final void run() {
                P.F0();
            }
        });
        AbstractC6492s.h(abstractC5912bW, "connectionInterruptStrea…reconnect() finished\" } }");
        return abstractC5912bW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0() {
        N7.a.b(F.f8744a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UnifiTeleportTunnel.d G0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (UnifiTeleportTunnel.d) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UnifiTeleportTunnel.d H0(P this$0, UnifiTeleportTunnel.d dVar, UnifiTeleportTunnel.d dVar2) {
        AbstractC6492s.i(this$0, "this$0");
        if (!AbstractC6492s.d(dVar.getClass(), dVar2.getClass())) {
            N7.a.b(this$0.new L(dVar2));
        }
        return dVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dj.a I0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (Dj.a) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f J0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f Y(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b Z(UnifiTeleportTunnel.d.c cVar) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C2975e());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912b = this.f8724o;
        AbstractC5912b abstractC5912bR2 = AbstractC5912b.r(new C2976f(cVar));
        AbstractC6492s.h(abstractC5912bR2, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(abstractC5912bR, abstractC5912b, abstractC5912bR2);
        AbstractC6492s.h(abstractC5912bP, "concatArray(\n           …)\n            }\n        )");
        return abstractC5912bP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dj.a a0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (Dj.a) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b b0() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C2978h());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bG = abstractC5912bR.g(Z(UnifiTeleportTunnel.d.c.b.f39316a));
        AbstractC6492s.h(abstractC5912bG, "complete {\n            /…State.Disconnected.Idle))");
        return abstractC5912bG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final Yf.c d0(String str, Integer num) throws NoSuchMethodException, ParseException {
        if (num != null && kotlin.text.t.W(str, ":", false, 2, null)) {
            Yf.c cVarC = Yf.c.c('[' + str + "]:" + num);
            AbstractC6492s.h(cVarC, "{\n            InetEndpoi…(\"[$ip]:$port\")\n        }");
            return cVarC;
        }
        if (num == null) {
            Yf.c cVarC2 = Yf.c.c(str);
            AbstractC6492s.h(cVarC2, "{\n            InetEndpoint.parse(ip)\n        }");
            return cVarC2;
        }
        Yf.c cVarC3 = Yf.c.c(str + ':' + num);
        AbstractC6492s.h(cVarC3, "{\n            InetEndpoi…se(\"$ip:$port\")\n        }");
        return cVarC3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnifiTeleportTunnel.f e0(UnifiTeleportTunnel.b bVar, TeleportCloud.a aVar, TeleportStun.a aVar2) {
        int iA = bVar.a();
        InetAddress inetAddressC = aVar.c();
        return new UnifiTeleportTunnel.f(iA, aVar2.a(), aVar2.b(), aVar2.c(), aVar2.d(), inetAddressC, aVar.d(), aVar.e(), aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b f0(UnifiTeleportTunnel.b bVar) {
        gg.i iVar = this.f8720k;
        final C2980j c2980j = new C2980j(bVar);
        AbstractC5912b abstractC5912bL1 = iVar.L1(new kg.n() { // from class: I7.p
            @Override // kg.n
            public final Object apply(Object obj) {
                return P.g0(c2980j, obj);
            }
        });
        AbstractC6492s.h(abstractC5912bL1, "private fun newTunnelRec…    }\n            }\n    }");
        return abstractC5912bL1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f g0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.wireguard.config.a h0(int i10, com.wireguard.crypto.c cVar, String str, String str2, int i11, String str3, int i12, String str4, String str5, int i13, List list) throws BadConfigException {
        a.b bVar = new a.b();
        try {
            try {
                try {
                    b.C1689b c1689bI = new b.C1689b().o(i10).m(InetAddress.getByName(str2)).n(i11).i(Yf.d.c(str4)).i(Yf.d.c(str5 + '/' + i13));
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(InetAddress.getByName((String) it.next()));
                        } catch (UnknownHostException e10) {
                            throw new UnifiTeleportTunnel.Error.Wireguard.Config(e10, "Failed to set dns IP");
                        }
                    }
                    com.wireguard.config.b bVarK = c1689bI.j(arrayList).l(cVar).k();
                    try {
                        try {
                            com.wireguard.config.c cVarG = new c.b().h(d0(str3, Integer.valueOf(i12))).f(Yf.d.c("0.0.0.0/0")).f(Yf.d.c("::0/0")).i(com.wireguard.crypto.b.c(str)).g();
                            bVar.e(bVarK);
                            bVar.c(cVarG);
                            com.wireguard.config.a aVarD = bVar.d();
                            AbstractC6492s.h(aVarD, "builder.build()");
                            return aVarD;
                        } catch (KeyFormatException e11) {
                            throw new UnifiTeleportTunnel.Error.Wireguard.Config(e11, "Failed to set remote public key");
                        }
                    } catch (ParseException e12) {
                        throw new UnifiTeleportTunnel.Error.Wireguard.Config(e12, "Failed to set peer address");
                    }
                } catch (ParseException e13) {
                    throw new UnifiTeleportTunnel.Error.Wireguard.Config(e13, "Failed to parse udp echo IP " + str5 + '/' + i13);
                }
            } catch (ParseException e14) {
                throw new UnifiTeleportTunnel.Error.Wireguard.Config(e14, "Failed to parse client IP " + str4);
            }
        } catch (UnknownHostException e15) {
            throw new UnifiTeleportTunnel.Error.Wireguard.Config(e15, "Failed to set interface IP");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(P this$0) {
        AbstractC6492s.i(this$0, "this$0");
        N7.a.b(this$0.new C2983m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(UnifiTeleportTunnel.d dVar) {
        this.f8716g.h(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f m0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dj.a n0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (Dj.a) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0() {
        N7.a.b(r.f8812a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b q0(UnifiTeleportTunnel.b bVar) {
        gg.z zVarK = this.f8724o.x(new InterfaceC6464a() { // from class: I7.o
            @Override // kg.InterfaceC6464a
            public final void run() {
                P.r0();
            }
        }).k(Ag.e.f756a.a(this.f8725p, this.f8726q));
        final u uVar = u.f8816a;
        gg.z zVarN = zVarK.n(new InterfaceC6469f() { // from class: I7.z
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                P.s0(uVar, obj);
            }
        });
        final v vVar = new v();
        gg.z zVarN2 = zVarN.n(new InterfaceC6469f() { // from class: I7.H
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                P.t0(vVar, obj);
            }
        });
        final w wVar = new w();
        gg.z zVarL = zVarN2.n(new InterfaceC6469f() { // from class: I7.I
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                P.u0(wVar, obj);
            }
        }).l(new InterfaceC6464a() { // from class: I7.J
            @Override // kg.InterfaceC6464a
            public final void run() {
                P.v0();
            }
        });
        final y yVar = new y(bVar);
        AbstractC5912b abstractC5912bT = zVarL.t(new kg.n() { // from class: I7.K
            @Override // kg.n
            public final Object apply(Object obj) {
                return P.w0(yVar, obj);
            }
        });
        final z zVar = z.f8873a;
        AbstractC5912b abstractC5912bO = abstractC5912bT.O(new kg.n() { // from class: I7.L
            @Override // kg.n
            public final Object apply(Object obj) {
                return P.x0(zVar, obj);
            }
        });
        final A a10 = new A();
        AbstractC5912b abstractC5912bX = abstractC5912bO.B(new InterfaceC6469f() { // from class: I7.M
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                P.y0(a10, obj);
            }
        }).x(new InterfaceC6464a() { // from class: I7.N
            @Override // kg.InterfaceC6464a
            public final void run() {
                P.z0(this.f8707a);
            }
        });
        final t tVar = new t();
        AbstractC5912b abstractC5912bZ = abstractC5912bX.z(new InterfaceC6469f() { // from class: I7.O
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                P.A0(tVar, obj);
            }
        });
        AbstractC6492s.h(abstractC5912bZ, "private fun openConnecti…id} ERROR\" }, it) }\n    }");
        return abstractC5912bZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0() {
        N7.a.b(s.f8813a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0() {
        N7.a.b(x.f8820a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f w0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f x0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(P this$0) {
        AbstractC6492s.i(this$0, "this$0");
        N7.a.b(this$0.new B());
    }

    @Override // com.ubnt.teleport.unifi.UnifiTeleportTunnel
    public AbstractC5912b a(int i10, UnifiTeleportTunnel.b.a aVar) {
        return UnifiTeleportTunnel.c.a(this, i10, aVar);
    }

    @Override // com.wireguard.android.backend.c
    public void c(c.a newState) {
        AbstractC6492s.i(newState, "newState");
        N7.a.b(new C2981k(newState));
        int i10 = C2973c.f8760a[newState.ordinal()];
        if (i10 == 1) {
            this.f8715f.h(EnumC2972b.UP);
            return;
        }
        if (i10 != 2) {
            return;
        }
        if (AbstractC6492s.d(this.f8717h.l2(), Boolean.FALSE)) {
            N7.a.b(new C2982l());
            AbstractC5912b abstractC5912bW = close().W(Gg.a.d());
            InterfaceC6464a interfaceC6464a = new InterfaceC6464a() { // from class: I7.t
                @Override // kg.InterfaceC6464a
                public final void run() {
                    P.i0(this.f8933a);
                }
            };
            final C2984n c2984n = C2984n.f8797a;
            abstractC5912bW.U(interfaceC6464a, new InterfaceC6469f() { // from class: I7.u
                @Override // kg.InterfaceC6469f
                public final void accept(Object obj) {
                    P.j0(c2984n, obj);
                }
            });
        }
        this.f8715f.h(EnumC2972b.DOWN);
    }

    @Override // com.ubnt.teleport.TeleportTunnel
    public AbstractC5912b close() {
        gg.z zVarO0 = getState().o0();
        final C2974d c2974d = new C2974d();
        AbstractC5912b abstractC5912bT = zVarO0.t(new kg.n() { // from class: I7.G
            @Override // kg.n
            public final Object apply(Object obj) {
                return P.Y(c2974d, obj);
            }
        });
        AbstractC6492s.h(abstractC5912bT, "override fun close(): Co…          }\n            }");
        return abstractC5912bT;
    }

    public boolean equals(Object obj) {
        return (obj instanceof P) && AbstractC6492s.d(((P) obj).getName(), getName());
    }

    @Override // com.ubnt.teleport.unifi.UnifiTeleportTunnel
    public UnifiTeleportTunnel.a getConfig() {
        return this.f8713d;
    }

    @Override // com.wireguard.android.backend.c
    public String getName() {
        return "wgTunnel-" + ((Object) TeleportTunnel.d.f(getConfig().b()));
    }

    @Override // com.ubnt.teleport.TeleportTunnel
    public gg.i getState() {
        return this.f8723n;
    }

    public int hashCode() {
        return getName().hashCode();
    }

    @Override // com.ubnt.teleport.TeleportTunnel
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public AbstractC5912b b(UnifiTeleportTunnel.b params) {
        AbstractC6492s.i(params, "params");
        AbstractC5912b abstractC5912b = this.f8729t;
        gg.z zVarO0 = getState().o0();
        final o oVar = new o(params);
        gg.i iVarC0 = abstractC5912b.X(zVarO0.t(new kg.n() { // from class: I7.v
            @Override // kg.n
            public final Object apply(Object obj) {
                return P.m0(oVar, obj);
            }
        })).c0();
        final p pVar = new p();
        gg.i iVarF1 = iVarC0.f1(new kg.n() { // from class: I7.w
            @Override // kg.n
            public final Object apply(Object obj) {
                return P.n0(pVar, obj);
            }
        });
        final q qVar = q.f8810a;
        AbstractC5912b abstractC5912bE0 = iVarF1.g0(new InterfaceC6469f() { // from class: I7.x
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                P.o0(qVar, obj);
            }
        }).Z(new InterfaceC6464a() { // from class: I7.y
            @Override // kg.InterfaceC6464a
            public final void run() {
                P.p0();
            }
        }).o1(1).i2().E0();
        AbstractC6492s.h(abstractC5912bE0, "override fun open(params…        .ignoreElements()");
        return abstractC5912bE0;
    }
}
