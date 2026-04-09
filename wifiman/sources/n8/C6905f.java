package n8;

import Cc.InterfaceC2557a;
import Yg.s;
import Yg.z;
import a8.C3771a;
import a8.C3772b;
import gg.C;
import gg.InterfaceC5910A;
import java.util.Map;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import n8.AbstractC6877a;
import org.kodein.di.DI;
import org.kodein.type.o;
import rj.InterfaceC7810x2;

/* renamed from: n8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6905f extends AbstractC6877a {
    private C6905f(DI di2, AbstractC6877a.InterfaceC6879c interfaceC6879c) {
        super(di2, interfaceC6879c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6905f(DI di2, C3772b id2) {
        this(di2, new a(di2, id2));
        AbstractC6492s.i(di2, "di");
        AbstractC6492s.i(id2, "id");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6905f(DI di2, inet.ipaddr.g ip) {
        this(di2, new a(di2, ip));
        AbstractC6492s.i(di2, "di");
        AbstractC6492s.i(ip, "ip");
    }

    /* renamed from: n8.f$a */
    private static final class a implements AbstractC6877a.InterfaceC6879c {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ th.l[] f54405f = {O.h(new F(a.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new F(a.class, "networkDiscovery", "getNetworkDiscovery()Lcom/ui/wifiman/model/discovery/NetworkDiscovery;", 0))};

        /* renamed from: a, reason: collision with root package name */
        private C3772b f54406a;

        /* renamed from: b, reason: collision with root package name */
        private inet.ipaddr.g f54407b;

        /* renamed from: c, reason: collision with root package name */
        private final Yg.m f54408c;

        /* renamed from: d, reason: collision with root package name */
        private final Yg.m f54409d;

        /* renamed from: e, reason: collision with root package name */
        private final gg.i f54410e;

        /* renamed from: n8.f$a$a, reason: collision with other inner class name */
        static final class C1979a implements n {

            /* renamed from: n8.f$a$a$a, reason: collision with other inner class name */
            static final class C1980a implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C3772b f54412a;

                C1980a(C3772b c3772b) {
                    this.f54412a = c3772b;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C6556a apply(C3771a it) {
                    AbstractC6492s.i(it, "it");
                    return new C6556a(it.a(this.f54412a));
                }
            }

            /* renamed from: n8.f$a$a$b */
            static final class b implements InterfaceC6465b {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ inet.ipaddr.g f54413a;

                b(inet.ipaddr.g gVar) {
                    this.f54413a = gVar;
                }

                @Override // kg.InterfaceC6465b
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C6556a apply(C3771a devices, Map networkDiscoveryResults) {
                    Object objA;
                    AbstractC6492s.i(devices, "devices");
                    AbstractC6492s.i(networkDiscoveryResults, "networkDiscoveryResults");
                    Dc.j jVar = (Dc.j) networkDiscoveryResults.get(this.f54413a);
                    if (jVar != null) {
                        C3772b c3772bU = jVar.u();
                        if (c3772bU == null || (objA = (InterfaceC2557a.b) devices.a(c3772bU)) == null) {
                            objA = Dc.n.a(jVar);
                        }
                    } else {
                        objA = null;
                    }
                    return new C6556a(objA);
                }
            }

            C1979a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(s sVar) {
                AbstractC6492s.i(sVar, "<destruct>");
                C3772b c3772b = (C3772b) sVar.a();
                inet.ipaddr.g gVar = (inet.ipaddr.g) sVar.c();
                if (c3772b != null) {
                    gg.i iVarN0 = a.this.f().a().N0(new C1980a(c3772b));
                    AbstractC6492s.h(iVarN0, "map(...)");
                    return iVarN0;
                }
                if (gVar == null) {
                    throw new IllegalStateException("no device id or IP available on device detail");
                }
                gg.i iVarV = gg.i.v(a.this.f().a(), a.this.g().b(), new b(gVar));
                AbstractC6492s.h(iVarV, "combineLatest(...)");
                return iVarV;
            }
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: n8.f$a$b */
        public static final class b extends o<Cc.n> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: n8.f$a$c */
        public static final class c extends o<Dc.e> {
        }

        /* renamed from: n8.f$a$d */
        public static final class d implements C {
            public d() {
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(z.a(a.this.f54406a, a.this.f54407b));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        private a(DI di2) {
            org.kodein.type.i iVarE = org.kodein.type.s.e(new b().getSuperType());
            AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, Cc.n.class), null);
            th.l[] lVarArr = f54405f;
            this.f54408c = interfaceC7810x2A.a(this, lVarArr[0]);
            org.kodein.type.i iVarE2 = org.kodein.type.s.e(new c().getSuperType());
            AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            this.f54409d = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, Dc.e.class), null).a(this, lVarArr[1]);
            gg.z zVarI = gg.z.i(new d());
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            gg.i iVarI2 = zVarI.w(new C1979a()).o1(1).i2();
            AbstractC6492s.h(iVarI2, "refCount(...)");
            this.f54410e = iVarI2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Cc.n f() {
            return (Cc.n) this.f54408c.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Dc.e g() {
            return (Dc.e) this.f54409d.getValue();
        }

        @Override // n8.AbstractC6877a.InterfaceC6879c
        public gg.i a() {
            return this.f54410e;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(DI di2, C3772b id2) {
            this(di2);
            AbstractC6492s.i(di2, "di");
            AbstractC6492s.i(id2, "id");
            this.f54406a = id2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(DI di2, inet.ipaddr.g ip) {
            this(di2);
            AbstractC6492s.i(di2, "di");
            AbstractC6492s.i(ip, "ip");
            this.f54407b = ip;
        }
    }
}
