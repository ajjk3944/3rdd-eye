package E8;

import Cc.InterfaceC2557a;
import L0.C3174d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import a8.C3771a;
import a8.C3772b;
import android.content.Context;
import b8.AbstractC4075b;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import com.ui.wifiman.model.speedtest.Speedtest;
import gg.InterfaceC5910A;
import hf.t;
import java.util.Map;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import l9.C6556a;
import n8.AbstractC6912m;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.d;
import sa.AbstractC7930a;

/* loaded from: classes3.dex */
public abstract class i extends k {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ th.l[] f4189o = {O.h(new kotlin.jvm.internal.F(i.class, "networkDiscovery", "getNetworkDiscovery()Lcom/ui/wifiman/model/discovery/NetworkDiscovery;", 0)), O.h(new kotlin.jvm.internal.F(i.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0))};

    /* renamed from: p, reason: collision with root package name */
    public static final int f4190p = 8;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f4191j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f4192k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f4193l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f4194m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f4195n;

    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4196a = new a();

        /* renamed from: E8.i$a$a, reason: collision with other inner class name */
        static final class C0181a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S8.g f4197a;

            C0181a(S8.g gVar) {
                this.f4197a = gVar;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(147283738);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(147283738, i10, -1, "com.ubnt.usurvey.ui.speedtest.BaseDirectIpSpeedtestSession.server.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseDirectIpSpeedtestSession.kt:109)");
                }
                S8.g gVar = this.f4197a;
                C3174d.a aVar = new C3174d.a(0, 1, null);
                String string = context.getString(R.string.wifi_experience);
                AbstractC6492s.h(string, "getString(...)");
                aVar.i(string);
                aVar.i(" ");
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

        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v5, types: [nf.f] */
        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            S8.g gVarN;
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a.a();
            d.a fVar = null;
            if (interfaceC2557a != null) {
                String name = interfaceC2557a.getName();
                d.c cVar = name != null ? new d.c(name) : null;
                Dc.j jVarJ = interfaceC2557a.j();
                if (jVarJ != null && (gVarN = jVarJ.N()) != null) {
                    fVar = new d.a(String.valueOf(gVarN), new C0181a(gVarN));
                }
                fVar = new nf.f(cVar, fVar);
            }
            return new C6556a(fVar);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends org.kodein.type.o<Dc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends org.kodein.type.o<Cc.n> {
    }

    public static final class d implements gg.C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4198a;

        public d(String str) {
            this.f4198a = str;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                inet.ipaddr.g gVarG = new inet.ipaddr.n(this.f4198a).g();
                if (gVarG != null) {
                    interfaceC5910A.onSuccess(gVarG);
                    return;
                }
                throw new IllegalStateException("invalid IP address " + this.f4198a);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class e implements kg.n {

        static final class a implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ inet.ipaddr.g f4200a;

            a(inet.ipaddr.g gVar) {
                this.f4200a = gVar;
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C3771a devices, Map discoveryResults) {
                Object objA;
                C3772b c3772bU;
                AbstractC6492s.i(devices, "devices");
                AbstractC6492s.i(discoveryResults, "discoveryResults");
                Dc.j jVar = (Dc.j) discoveryResults.get(this.f4200a);
                if (jVar == null || (c3772bU = jVar.u()) == null || (objA = (InterfaceC2557a.b) devices.a(c3772bU)) == null) {
                    objA = jVar != null ? Dc.n.a(jVar) : null;
                }
                return new C6556a(objA);
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(inet.ipaddr.g ip) {
            AbstractC6492s.i(ip, "ip");
            return gg.i.v(i.this.n().a(), i.this.o().b(), new a(ip));
        }
    }

    static final class f implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final f f4201a = new f();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4202a;

            static {
                int[] iArr = new int[Speedtest.e.values().length];
                try {
                    iArr[Speedtest.e.SETUP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Speedtest.e.LATENCY_CHECK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Speedtest.e.DOWNLOAD_INIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Speedtest.e.UPLOAD_INIT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Speedtest.e.DOWNLOAD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Speedtest.e.UPLOAD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Speedtest.e.RESULT_PROCESSING.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Speedtest.e.END.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f4202a = iArr;
            }
        }

        f() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(C6556a c6556a, Cc.j myself, Speedtest.d speedtestState) {
            t.c.a aVar;
            Speedtest.a aVar2;
            Speedtest.a aVar3;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(myself, "myself");
            AbstractC6492s.i(speedtestState, "speedtestState");
            InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a.a();
            t.a.b bVar = null;
            if (interfaceC2557a != null) {
                m.c cVar = m.c.NORMAL;
                t.b bVar2 = new t.b(AbstractC6912m.f(interfaceC2557a, cVar, null, 2, null));
                switch (a.f4202a[speedtestState.h().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        aVar = t.c.a.IDLE;
                        break;
                    case 5:
                        aVar = t.c.a.DOWN;
                        break;
                    case 6:
                        aVar = t.c.a.UP;
                        break;
                    case 7:
                    case 8:
                        aVar = t.c.a.COMPLETE;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                t.c.a aVar4 = aVar;
                Integer numD = com.ui.wifiman.model.speedtest.internet.g.d(speedtestState);
                AbstractC4075b abstractC4075bA = numD != null ? AbstractC4075b.f33002a.a(numD.intValue()) : null;
                Integer numC = com.ui.wifiman.model.speedtest.internet.g.c(speedtestState);
                Integer numValueOf = numC != null ? Integer.valueOf(numC.intValue()) : null;
                Speedtest.f fVarA = speedtestState.a();
                if (!(fVarA instanceof Speedtest.f.a)) {
                    fVarA = null;
                }
                W7.a aVarB = (fVarA == null || (aVar3 = (Speedtest.a) fVarA.b()) == null) ? null : W7.a.f23676b.b(aVar3.a());
                Speedtest.f fVarI = speedtestState.i();
                if (!(fVarI instanceof Speedtest.f.a)) {
                    fVarI = null;
                }
                bVar = new t.a.b(bVar2, new t.c(aVar4, abstractC4075bA, numValueOf, aVarB, (fVarI == null || (aVar2 = (Speedtest.a) fVarI.b()) == null) ? null : W7.a.f23676b.b(aVar2.a())), new t.b(AbstractC6912m.f(myself, cVar, null, 2, null)));
            }
            return new C6556a(bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gg.i speedtestStream, String hostIp, DI di2) {
        super(speedtestStream);
        AbstractC6492s.i(speedtestStream, "speedtestStream");
        AbstractC6492s.i(hostIp, "hostIp");
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, Dc.e.class), null);
        th.l[] lVarArr = f4189o;
        this.f4191j = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4192k = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, Cc.n.class), null).a(this, lVarArr[1]);
        gg.z zVarI = gg.z.i(new d(hostIp));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI2 = zVarI.w(new e()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f4193l = iVarI2;
        gg.i iVarW = gg.i.u(iVarI2, n().b(), j(), f.f4201a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f4194m = iVarW;
        gg.i iVarW2 = iVarI2.N0(a.f4196a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f4195n = iVarW2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Cc.n n() {
        return (Cc.n) this.f4192k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Dc.e o() {
        return (Dc.e) this.f4191j.getValue();
    }

    @Override // E8.k
    public gg.i g() {
        return this.f4195n;
    }

    @Override // E8.k
    public gg.i k() {
        return this.f4194m;
    }
}
