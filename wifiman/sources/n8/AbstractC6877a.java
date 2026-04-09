package n8;

import Af.C2428c;
import Af.w;
import Be.A0;
import Cc.AbstractC2558b;
import Cc.InterfaceC2557a;
import Ee.C2706g;
import Je.a;
import Ke.a;
import Ke.m;
import Lc.a;
import Nc.b;
import Sc.b;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Tc.a;
import Uc.e;
import Yg.s;
import Zg.AbstractC3689v;
import android.content.Context;
import b8.AbstractC4075b;
import ch.AbstractC4260a;
import com.ubnt.usurvey.product.m;
import com.ui.wifiman.model.bluetooth.le.BleCommonCharacteristicsReader;
import com.ui.wifiman.model.bluetooth.le.a;
import com.ui.wifiman.model.discovery.engine.bonjour.a;
import com.ui.wifiman.model.discovery.engine.snmp.a;
import com.ui.wifiman.model.vendor.d;
import dd.InterfaceC5347a;
import e8.EnumC5428a;
import gd.C5896a;
import gg.AbstractC5912b;
import gg.InterfaceC5910A;
import gg.o;
import gg.q;
import gg.r;
import h9.C5969a;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import k8.AbstractC6401a;
import k8.AbstractC6402b;
import ke.AbstractC6458c;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import le.C6588i;
import mh.InterfaceC6835l;
import n8.AbstractC6877a;
import ne.C6937a;
import o8.InterfaceC7106a;
import org.kodein.di.DI;
import org.snmp4j.smi.GenericAddress;
import q8.AbstractC7434a;
import rj.InterfaceC7810x2;
import s9.InterfaceC7929a;
import s9.c;
import s9.d;
import wc.C8321a;
import wc.C8322b;
import xa.InterfaceC8439a;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: n8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6877a implements InterfaceC6904e {

    /* renamed from: A, reason: collision with root package name */
    private final gg.i f54302A;

    /* renamed from: B, reason: collision with root package name */
    private final gg.i f54303B;

    /* renamed from: C, reason: collision with root package name */
    private final gg.i f54304C;

    /* renamed from: D, reason: collision with root package name */
    private final gg.i f54305D;

    /* renamed from: E, reason: collision with root package name */
    private final gg.i f54306E;

    /* renamed from: F, reason: collision with root package name */
    private final gg.i f54307F;

    /* renamed from: G, reason: collision with root package name */
    private final gg.i f54308G;

    /* renamed from: H, reason: collision with root package name */
    private final gg.i f54309H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f54310I;

    /* renamed from: J, reason: collision with root package name */
    private final gg.i f54311J;

    /* renamed from: K, reason: collision with root package name */
    private final gg.i f54312K;

    /* renamed from: L, reason: collision with root package name */
    private final gg.i f54313L;

    /* renamed from: M, reason: collision with root package name */
    private final gg.i f54314M;

    /* renamed from: N, reason: collision with root package name */
    private final gg.i f54315N;

    /* renamed from: O, reason: collision with root package name */
    private final AbstractC5912b f54316O;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6879c f54317a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f54318b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f54319c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f54320d;

    /* renamed from: e, reason: collision with root package name */
    private final Yg.m f54321e;

    /* renamed from: f, reason: collision with root package name */
    private final Yg.m f54322f;

    /* renamed from: g, reason: collision with root package name */
    private final Yg.m f54323g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f54324h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f54325i;

    /* renamed from: j, reason: collision with root package name */
    private final Comparator f54326j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f54327k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f54328l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f54329m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC5912b f54330n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f54331o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC5912b f54332p;

    /* renamed from: q, reason: collision with root package name */
    private final gg.i f54333q;

    /* renamed from: r, reason: collision with root package name */
    private final gg.i f54334r;

    /* renamed from: s, reason: collision with root package name */
    private final gg.i f54335s;

    /* renamed from: t, reason: collision with root package name */
    private final gg.i f54336t;

    /* renamed from: u, reason: collision with root package name */
    private final gg.i f54337u;

    /* renamed from: v, reason: collision with root package name */
    private final gg.i f54338v;

    /* renamed from: w, reason: collision with root package name */
    private final gg.i f54339w;

    /* renamed from: x, reason: collision with root package name */
    private final gg.i f54340x;

    /* renamed from: y, reason: collision with root package name */
    private final gg.i f54341y;

    /* renamed from: z, reason: collision with root package name */
    private final gg.i f54342z;

    /* renamed from: Q, reason: collision with root package name */
    static final /* synthetic */ th.l[] f54300Q = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(AbstractC6877a.class, "hostnameLatencyService", "getHostnameLatencyService()Lcom/ui/wifiman/model/network/latency/HostLatencyService;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(AbstractC6877a.class, "bleCharacteristics", "getBleCharacteristics()Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristics;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(AbstractC6877a.class, "bluetoothScanner", "getBluetoothScanner()Lcom/ui/wifiman/model/bluetooth/BluetoothSurveyManager;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(AbstractC6877a.class, "bluetoothSignalStatsManager", "getBluetoothSignalStatsManager()Lcom/ui/wifiman/model/bluetooth/BluetoothDeviceSignalStatistics$Manager;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(AbstractC6877a.class, "wifiSignalStatsService", "getWifiSignalStatsService()Lcom/ui/wifiman/model/wifi/scan/timelapse/WifiSignalTimelapse$Service;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(AbstractC6877a.class, "portScanManager", "getPortScanManager()Lcom/ubnt/usurvey/ui/device/portscan/DeviceDetailPortScanManager;", 0))};

    /* renamed from: P, reason: collision with root package name */
    public static final C1970a f54299P = new C1970a(null);

    /* renamed from: R, reason: collision with root package name */
    public static final int f54301R = 8;

    /* renamed from: n8.a$A */
    static final class A implements n {

        /* renamed from: n8.a$A$a, reason: collision with other inner class name */
        static final class C1966a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1966a f54344a = new C1966a();

            C1966a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a.a();
                return new C6556a(interfaceC2557a != null ? interfaceC2557a.n() : null);
            }
        }

        /* renamed from: n8.a$A$b */
        static final class b implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC6877a f54345a;

            /* renamed from: n8.a$A$b$a, reason: collision with other inner class name */
            static final class C1967a implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final C1967a f54346a = new C1967a();

                C1967a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C6556a apply(dd.i it) {
                    AbstractC6492s.i(it, "it");
                    return new C6556a(it);
                }
            }

            b(AbstractC6877a abstractC6877a) {
                this.f54345a = abstractC6877a;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                C6180b c6180b = (C6180b) c6556a.a();
                if (c6180b == null) {
                    gg.i iVarK0 = gg.i.K0(new C6556a(null));
                    AbstractC6492s.f(iVarK0);
                    return iVarK0;
                }
                InterfaceC5347a interfaceC5347aZ = this.f54345a.z();
                String string = c6180b.toString();
                AbstractC6492s.h(string, "toString(...)");
                gg.i iVarN0 = InterfaceC5347a.C1716a.a(interfaceC5347aZ, string, 0, 0, 6, null).N0(C1967a.f54346a);
                AbstractC6492s.f(iVarN0);
                return iVarN0;
            }
        }

        A() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean enabled) {
            AbstractC6492s.i(enabled, "enabled");
            if (enabled.booleanValue()) {
                gg.i iVarI1 = AbstractC6877a.this.a().N0(C1966a.f54344a).W().I1(new b(AbstractC6877a.this));
                AbstractC6492s.f(iVarI1);
                return iVarI1;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    /* renamed from: n8.a$B */
    static final class B implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final B f54347a = new B();

        /* renamed from: n8.a$B$a, reason: collision with other inner class name */
        public static final class C1968a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f54348a;

            public C1968a(String str) {
                this.f54348a = str;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    String str = this.f54348a;
                    if (str != null) {
                        oVar.onSuccess(str);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        B() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new C1968a((String) c6556a.a()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: n8.a$C */
    static final class C implements n {
        C() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(String host) {
            AbstractC6492s.i(host, "host");
            return AbstractC6877a.this.C().a(host);
        }
    }

    /* renamed from: n8.a$D */
    static final class D implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final D f54350a = new D();

        D() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(InterfaceC2557a device) {
            AbstractC6492s.i(device, "device");
            inet.ipaddr.a aVarN = device.n();
            if (aVarN == null) {
                aVarN = device.i();
            }
            return new C6556a(aVarN != null ? aVarN.toString() : null);
        }
    }

    /* renamed from: n8.a$E */
    static final class E implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final E f54351a = new E();

        /* renamed from: n8.a$E$a, reason: collision with other inner class name */
        public static final class C1969a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2557a f54352a;

            public C1969a(InterfaceC2557a interfaceC2557a) {
                this.f54352a = interfaceC2557a;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    InterfaceC2557a interfaceC2557a = this.f54352a;
                    if (interfaceC2557a != null) {
                        oVar.onSuccess(interfaceC2557a);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        E() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new C1969a((InterfaceC2557a) c6556a.a()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: n8.a$F */
    static final class F implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final F f54353a = new F();

        F() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it;
        }
    }

    /* renamed from: n8.a$G */
    static final class G implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final G f54354a = new G();

        G() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it;
        }
    }

    /* renamed from: n8.a$H */
    static final class H implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final H f54355a = new H();

        H() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it;
        }
    }

    /* renamed from: n8.a$I */
    static final class I implements kg.k {

        /* renamed from: a, reason: collision with root package name */
        public static final I f54356a = new I();

        I() {
        }

        @Override // kg.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6878b a(List network, List netbios, List upnp, List snmp, List bonjour, List cellular, List portScan) {
            AbstractC6492s.i(network, "network");
            AbstractC6492s.i(netbios, "netbios");
            AbstractC6492s.i(upnp, "upnp");
            AbstractC6492s.i(snmp, "snmp");
            AbstractC6492s.i(bonjour, "bonjour");
            AbstractC6492s.i(cellular, "cellular");
            AbstractC6492s.i(portScan, "portScan");
            return new C6878b(network, netbios, upnp, bonjour, snmp, cellular, portScan);
        }
    }

    /* renamed from: n8.a$J */
    public static final class J implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            inet.ipaddr.g gVar = (inet.ipaddr.g) obj;
            Integer num = 2;
            Integer num2 = gVar instanceof C6180b ? 0 : gVar instanceof C6205b ? 1 : num;
            inet.ipaddr.g gVar2 = (inet.ipaddr.g) obj2;
            if (gVar2 instanceof C6180b) {
                num = 0;
            } else if (gVar2 instanceof C6205b) {
                num = 1;
            }
            return AbstractC4260a.e(num2, num);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.a$K */
    public static final class K extends org.kodein.type.o<InterfaceC5347a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.a$L */
    public static final class L extends org.kodein.type.o<com.ui.wifiman.model.bluetooth.le.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.a$M */
    public static final class M extends org.kodein.type.o<wc.h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.a$N */
    public static final class N extends org.kodein.type.o<C8322b.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.a$O */
    public static final class O extends org.kodein.type.o<C6937a.InterfaceC1989a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n8.a$P */
    public static final class P extends org.kodein.type.o<InterfaceC7106a> {
    }

    /* renamed from: n8.a$Q */
    public static final class Q implements gg.C {
        public Q() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Boolean.valueOf(AbstractC6877a.this.B()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: n8.a$R */
    public static final class R implements gg.C {
        public R() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Boolean.valueOf(AbstractC6877a.this.s()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: n8.a$S */
    public static final class S implements gg.C {
        public S() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Boolean.valueOf(AbstractC6877a.this.F()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: n8.a$T */
    public static final class T implements gg.C {
        public T() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(AbstractC6877a.this.x());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: n8.a$U */
    public static final class U implements gg.C {
        public U() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(AbstractC6877a.this.v());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: n8.a$V */
    public static final class V implements gg.C {
        public V() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(AbstractC6877a.this.w());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: n8.a$W */
    public static final class W implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f54363a;

        public W(Comparator comparator) {
            this.f54363a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f54363a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : AbstractC4260a.e(((inet.ipaddr.g) obj).toString(), ((inet.ipaddr.g) obj2).toString());
        }
    }

    /* renamed from: n8.a$X */
    static final class X implements n {
        X() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean enabled) {
            AbstractC6492s.i(enabled, "enabled");
            return enabled.booleanValue() ? AbstractC6877a.this.t().a(wc.f.BLE_AND_CLASSIC).E0() : AbstractC5912b.m();
        }
    }

    /* renamed from: n8.a$a, reason: collision with other inner class name */
    public static final class C1970a {
        public /* synthetic */ C1970a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1970a() {
        }
    }

    /* renamed from: n8.a$b, reason: case insensitive filesystem */
    public static final class C6878b {

        /* renamed from: a, reason: collision with root package name */
        private final List f54365a;

        /* renamed from: b, reason: collision with root package name */
        private final List f54366b;

        /* renamed from: c, reason: collision with root package name */
        private final List f54367c;

        /* renamed from: d, reason: collision with root package name */
        private final List f54368d;

        /* renamed from: e, reason: collision with root package name */
        private final List f54369e;

        /* renamed from: f, reason: collision with root package name */
        private final List f54370f;

        /* renamed from: g, reason: collision with root package name */
        private final List f54371g;

        public C6878b(List network, List netbios, List upnp, List bonjour, List snmp, List cellular, List portScan) {
            AbstractC6492s.i(network, "network");
            AbstractC6492s.i(netbios, "netbios");
            AbstractC6492s.i(upnp, "upnp");
            AbstractC6492s.i(bonjour, "bonjour");
            AbstractC6492s.i(snmp, "snmp");
            AbstractC6492s.i(cellular, "cellular");
            AbstractC6492s.i(portScan, "portScan");
            this.f54365a = network;
            this.f54366b = netbios;
            this.f54367c = upnp;
            this.f54368d = bonjour;
            this.f54369e = snmp;
            this.f54370f = cellular;
            this.f54371g = portScan;
        }

        public final List a() {
            return this.f54368d;
        }

        public final List b() {
            return this.f54370f;
        }

        public final List c() {
            return this.f54366b;
        }

        public final List d() {
            return this.f54365a;
        }

        public final List e() {
            return this.f54371g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6878b)) {
                return false;
            }
            C6878b c6878b = (C6878b) obj;
            return AbstractC6492s.d(this.f54365a, c6878b.f54365a) && AbstractC6492s.d(this.f54366b, c6878b.f54366b) && AbstractC6492s.d(this.f54367c, c6878b.f54367c) && AbstractC6492s.d(this.f54368d, c6878b.f54368d) && AbstractC6492s.d(this.f54369e, c6878b.f54369e) && AbstractC6492s.d(this.f54370f, c6878b.f54370f) && AbstractC6492s.d(this.f54371g, c6878b.f54371g);
        }

        public final List f() {
            return this.f54369e;
        }

        public final List g() {
            return this.f54367c;
        }

        public int hashCode() {
            return (((((((((((this.f54365a.hashCode() * 31) + this.f54366b.hashCode()) * 31) + this.f54367c.hashCode()) * 31) + this.f54368d.hashCode()) * 31) + this.f54369e.hashCode()) * 31) + this.f54370f.hashCode()) * 31) + this.f54371g.hashCode();
        }

        public String toString() {
            return "SecondaryDiscoveryProtocolStats(network=" + this.f54365a + ", netbios=" + this.f54366b + ", upnp=" + this.f54367c + ", bonjour=" + this.f54368d + ", snmp=" + this.f54369e + ", cellular=" + this.f54370f + ", portScan=" + this.f54371g + ")";
        }
    }

    /* renamed from: n8.a$c, reason: case insensitive filesystem */
    public interface InterfaceC6879c {
        gg.i a();
    }

    /* renamed from: n8.a$d, reason: case insensitive filesystem */
    static final class C6880d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C6880d f54372a = new C6880d();

        C6880d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(InterfaceC2557a it) {
            AbstractC6492s.i(it, "it");
            C8321a c8321aP = it.p();
            return new C6556a(c8321aP != null ? c8321aP.d() : null);
        }
    }

    /* renamed from: n8.a$e, reason: case insensitive filesystem */
    static final class C6881e implements n {

        /* renamed from: n8.a$e$a, reason: collision with other inner class name */
        static final class C1971a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1971a f54374a = new C1971a();

            C1971a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(C8322b it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        C6881e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            C5969a c5969a = (C5969a) c6556a.a();
            if (c5969a != null) {
                gg.i iVarN0 = AbstractC6877a.this.u().get(c5969a).N0(C1971a.f54374a);
                AbstractC6492s.f(iVarN0);
                return iVarN0;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    /* renamed from: n8.a$f, reason: case insensitive filesystem */
    static final class C6882f implements n {

        /* renamed from: n8.a$f$a, reason: collision with other inner class name */
        static final class C1972a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f54376a;

            C1972a(Set set) {
                this.f54376a = set;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(-151936047);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-151936047, i10, -1, "com.ubnt.usurvey.ui.device.BaseDeviceDetailContentProvider.cardBluetooth.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseDeviceDetailContentProvider.kt:469)");
                }
                Set set = this.f54376a;
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC6401a.a((U7.b) it.next()).a(context, interfaceC3540l, i10 & 14));
                }
                String strZ0 = AbstractC3689v.z0(arrayList, ", ", null, null, 0, null, null, 62, null);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return strZ0;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        /* renamed from: n8.a$f$b */
        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f54377a;

            b(long j10) {
                this.f54377a = j10;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(1156466886);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1156466886, i10, -1, "com.ubnt.usurvey.ui.device.BaseDeviceDetailContentProvider.cardBluetooth.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseDeviceDetailContentProvider.kt:484)");
                }
                String string = context.getString(com.ubnt.usurvey.R.string.unit_ms_format);
                AbstractC6492s.h(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{Long.valueOf(this.f54377a)}, 1));
                AbstractC6492s.h(str, "format(...)");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return str;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        C6882f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(U7.b it) {
            AbstractC6492s.i(it, "it");
            return it.name();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v10, types: [s9.d] */
        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List apply(InterfaceC2557a device) {
            Long lA;
            Set setM;
            AbstractC6492s.i(device, "device");
            ArrayList arrayList = new ArrayList();
            AbstractC6877a abstractC6877a = AbstractC6877a.this;
            C8321a c8321aP = device.p();
            if (c8321aP != null && (setM = c8321aP.m()) != null) {
                if (setM.isEmpty()) {
                    setM = null;
                }
                if (setM != null) {
                    arrayList.add(AbstractC6877a.I(abstractC6877a, "type", new d.b(com.ubnt.usurvey.R.string.bluetooth_type), null, setM.size() == 1 ? AbstractC6401a.a((U7.b) AbstractC3689v.p0(setM)) : new d.a(AbstractC3689v.z0(setM, null, null, null, 0, null, new InterfaceC6835l() { // from class: n8.b
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return AbstractC6877a.C6882f.c((U7.b) obj);
                        }
                    }, 31, null), new C1972a(setM)), false, 20, null));
                }
            }
            C8321a c8321aP2 = device.p();
            if (c8321aP2 != null && (lA = c8321aP2.a()) != null) {
                long jLongValue = lA.longValue();
                arrayList.add(AbstractC6877a.I(abstractC6877a, "advertisingIntenval", new d.b(com.ubnt.usurvey.R.string.bluetooth_advertising_interval), null, new d.a(String.valueOf(jLongValue), new b(jLongValue)), false, 20, null));
            }
            return arrayList;
        }
    }

    /* renamed from: n8.a$g, reason: case insensitive filesystem */
    static final class C6883g implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C6883g f54378a = new C6883g();

        C6883g() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(InterfaceC2557a device, C6556a c6556a) {
            AbstractC6492s.i(device, "device");
            AbstractC6492s.i(c6556a, "<destruct>");
            C8322b c8322b = (C8322b) c6556a.a();
            C8321a c8321aP = device.p();
            a.f fVar = null;
            if (c8321aP != null) {
                A0 a0A = AbstractC7434a.a(c8321aP, device instanceof InterfaceC2557a.b ? (InterfaceC2557a.b) device : null, c8322b, false);
                if (a0A != null) {
                    fVar = new a.f(a0A, false);
                }
            }
            return new C6556a(fVar);
        }
    }

    /* renamed from: n8.a$h, reason: case insensitive filesystem */
    static final class C6884h implements n {
        C6884h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(InterfaceC2557a device) {
            Dc.j jVarJ;
            a.C1395a c1395aB;
            List<a.b> listI;
            String strA;
            AbstractC6492s.i(device, "device");
            ArrayList arrayList = new ArrayList();
            AbstractC6877a abstractC6877a = AbstractC6877a.this;
            if (!abstractC6877a.G(device) && (jVarJ = device.j()) != null && (c1395aB = jVarJ.B()) != null && (listI = c1395aB.i()) != null) {
                for (a.b bVar : listI) {
                    String str = bVar.g() + bVar.d();
                    d.c cVar = new d.c(bVar.e());
                    C5896a c5896aF = bVar.f();
                    d.c cVar2 = (c5896aF == null || (strA = c5896aF.a()) == null) ? null : new d.c(strA);
                    String strE = bVar.e();
                    C5896a c5896aF2 = bVar.f();
                    arrayList.add(AbstractC6877a.I(abstractC6877a, str, cVar, AbstractC6492s.d(strE, c5896aF2 != null ? c5896aF2.d() : null) ? cVar2 : null, new d.b(com.ubnt.usurvey.R.string.device_detail_bonjour_port_format, AbstractC3689v.e(Integer.valueOf(bVar.d()))), false, 16, null));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: n8.a$i, reason: case insensitive filesystem */
    static final class C6885i implements n {
        C6885i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(InterfaceC2557a device) {
            String strA;
            a.C0455a c0455aE;
            String strM;
            s9.d dVarA;
            AbstractC6492s.i(device, "device");
            AbstractC6877a abstractC6877a = AbstractC6877a.this;
            List listC = AbstractC3689v.c();
            C5969a c5969aL = device.l();
            if (c5969aL != null) {
                d.b bVar = new d.b(com.ubnt.usurvey.R.string.mac);
                String strD = c5969aL.d(":");
                Locale US = Locale.US;
                AbstractC6492s.h(US, "US");
                String upperCase = strD.toUpperCase(US);
                AbstractC6492s.h(upperCase, "toUpperCase(...)");
                listC.add(AbstractC6877a.I(abstractC6877a, "mac", bVar, null, new d.c(upperCase), false, 20, null));
            }
            String strB = device.b();
            if (strB != null) {
                listC.add(AbstractC6877a.I(abstractC6877a, "model", new d.b(com.ubnt.usurvey.R.string.device_model), null, new d.c(strB), false, 20, null));
            }
            com.ui.wifiman.model.vendor.d dVarC = device.c();
            if (dVarC != null) {
                listC.add(AbstractC6877a.I(abstractC6877a, "vendor", new d.b(com.ubnt.usurvey.R.string.device_manufacturer), null, L8.k.a(dVarC), false, 20, null));
            }
            AbstractC2558b abstractC2558bD = device.d();
            if (abstractC2558bD != null && (dVarA = AbstractC6402b.a(abstractC2558bD)) != null) {
                listC.add(AbstractC6877a.I(abstractC6877a, "deviceType", new d.b(com.ubnt.usurvey.R.string.device_type), null, dVarA, false, 20, null));
            }
            String strH = device.h();
            if (strH != null) {
                listC.add(AbstractC6877a.I(abstractC6877a, "fw", new d.b(com.ubnt.usurvey.R.string.device_firmware_version), null, new d.c(strH), false, 4, null));
            }
            Long lE = device.e();
            if (lE != null) {
                listC.add(AbstractC6877a.I(abstractC6877a, "uptime", new d.b(com.ubnt.usurvey.R.string.device_uptime), null, L8.d.f11260a.b(lE.longValue()), false, 20, null));
            }
            Dc.j jVarJ = device.j();
            if (jVarJ != null && (c0455aE = jVarJ.E()) != null && (strM = c0455aE.m()) != null) {
                listC.add(AbstractC6877a.I(abstractC6877a, "softwareid", new d.b(com.ubnt.usurvey.R.string.device_detail_upnp_serial_software_id), null, new d.c(strM), false, 20, null));
            }
            a.C1388a c1388aG = device.g();
            if (c1388aG != null && (strA = c1388aG.a()) != null) {
                listC.add(AbstractC6877a.I(abstractC6877a, "battery", new d.b(com.ubnt.usurvey.R.string.device_battery_level), null, new d.c(strA), false, 20, null));
            }
            return AbstractC3689v.a(listC);
        }
    }

    /* renamed from: n8.a$j, reason: case insensitive filesystem */
    static final class C6886j implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C6886j f54381a = new C6886j();

        C6886j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.C0430a apply(InterfaceC2557a device) {
            List listC;
            List listB;
            List listA;
            AbstractC6492s.i(device, "device");
            ArrayList arrayList = new ArrayList();
            Dc.j jVarJ = device.j();
            if (jVarJ != null && (listA = r8.e.a(jVarJ, false, false)) != null) {
                arrayList.addAll(listA);
            }
            C8321a c8321aP = device.p();
            if (c8321aP != null && (listB = q8.f.b(c8321aP, false, false, 2, null)) != null) {
                arrayList.addAll(listB);
            }
            C8321a c8321aP2 = device.p();
            if (c8321aP2 != null && (listC = q8.f.c(c8321aP2, false)) != null) {
                arrayList.addAll(listC);
            }
            String name = device.getName();
            s9.d cVar = name != null ? new d.c(name) : new d.b(com.ubnt.usurvey.R.string.device_name_fallback);
            InterfaceC7929a interfaceC7929aF = AbstractC6912m.f(device, m.c.NORMAL, null, 2, null);
            String strB = device.b();
            return new a.C0430a(cVar, device.getName() != null, interfaceC7929aF, strB != null ? new d.c(strB) : null, arrayList);
        }
    }

    /* renamed from: n8.a$k, reason: case insensitive filesystem */
    static final class C6887k implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C6887k f54382a = new C6887k();

        /* renamed from: n8.a$k$a, reason: collision with other inner class name */
        static final class C1973a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EnumC5428a f54383a;

            C1973a(EnumC5428a enumC5428a) {
                this.f54383a = enumC5428a;
            }

            public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(context, "context");
                interfaceC3540l.U(-906347581);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-906347581, i10, -1, "com.ubnt.usurvey.ui.device.BaseDeviceDetailContentProvider.cardManagerApp.<anonymous>.<anonymous>.<anonymous> (BaseDeviceDetailContentProvider.kt:241)");
                }
                String string = context.getString(com.ubnt.usurvey.R.string.device_detail_manage_device_in_app_format);
                AbstractC6492s.h(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{this.f54383a.getAppName()}, 1));
                AbstractC6492s.h(str, "format(...)");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return str;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        C6887k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(InterfaceC2557a device) {
            EnumC5428a enumC5428aA;
            AbstractC6492s.i(device, "device");
            InterfaceC8439a.d dVarF = device.f();
            a.c cVar = null;
            if (dVarF != null && (enumC5428aA = Ld.d.a(dVarF)) != null) {
                cVar = new a.c(enumC5428aA.getPackageName(), new c.a(Ne.g.a(enumC5428aA), null, 2, null), new d.a(enumC5428aA.name(), new C1973a(enumC5428aA)));
            }
            return new C6556a(cVar);
        }
    }

    /* renamed from: n8.a$l, reason: case insensitive filesystem */
    static final class C6888l implements n {
        C6888l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(InterfaceC2557a device) {
            b.C0593b c0593bG;
            String strG;
            AbstractC6492s.i(device, "device");
            ArrayList arrayList = new ArrayList();
            AbstractC6877a abstractC6877a = AbstractC6877a.this;
            Dc.j jVarJ = device.j();
            if (jVarJ != null && (c0593bG = jVarJ.G()) != null && (strG = c0593bG.g()) != null) {
                arrayList.add(AbstractC6877a.I(abstractC6877a, "name", new d.b(com.ubnt.usurvey.R.string.name), null, new d.c(strG), false, 20, null));
            }
            return arrayList;
        }
    }

    /* renamed from: n8.a$m, reason: case insensitive filesystem */
    static final class C6889m implements InterfaceC6465b {
        C6889m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(inet.ipaddr.g it) {
            AbstractC6492s.i(it, "it");
            String strB = L8.f.b(it, false);
            return strB != null ? strB : "";
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List apply(InterfaceC2557a device, C6556a c6556a) {
            s9.d bVar;
            AbstractC6492s.i(device, "device");
            AbstractC6492s.i(c6556a, "<destruct>");
            dd.i iVar = (dd.i) c6556a.a();
            AbstractC6877a abstractC6877a = AbstractC6877a.this;
            List listC = AbstractC3689v.c();
            Set setQ = device.q();
            Collection arrayList = new ArrayList();
            for (Object obj : setQ) {
                if (!((inet.ipaddr.g) obj).g1()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList == null) {
                Collection collectionQ = device.q();
                arrayList = collectionQ.isEmpty() ? null : collectionQ;
            }
            if (arrayList != null) {
                listC.add(AbstractC6877a.I(abstractC6877a, GenericAddress.TYPE_IP, new d.b(com.ubnt.usurvey.R.string.ip_address), null, new d.c(AbstractC3689v.z0(AbstractC3689v.X0(arrayList, abstractC6877a.A()), "\n", null, null, 0, null, new InterfaceC6835l() { // from class: n8.c
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj2) {
                        return AbstractC6877a.C6889m.c((inet.ipaddr.g) obj2);
                    }
                }, 30, null)), false, 20, null));
            }
            String strO = device.o();
            if (strO != null) {
                listC.add(AbstractC6877a.I(abstractC6877a, "hostname", new d.b(com.ubnt.usurvey.R.string.device_detail_network_hostname), null, new d.c(strO), false, 20, null));
            }
            if (iVar != null) {
                d.b bVar2 = new d.b(com.ubnt.usurvey.R.string.device_detail_network_ping);
                AbstractC4075b abstractC4075bD = iVar.d();
                if (abstractC4075bD == null || (bVar = Ne.d.c(abstractC4075bD, true)) == null) {
                    bVar = new d.b(com.ubnt.usurvey.R.string.value_not_available_dashed);
                }
                listC.add(AbstractC6877a.I(abstractC6877a, "ping", bVar2, null, bVar, false, 20, null));
            }
            if (iVar != null) {
                listC.add(AbstractC6877a.I(abstractC6877a, "packetloss", new d.b(com.ubnt.usurvey.R.string.device_detail_network_packet_loss), null, k8.i.b(iVar.e(), true), false, 20, null));
            }
            return AbstractC3689v.a(listC);
        }
    }

    /* renamed from: n8.a$n, reason: case insensitive filesystem */
    static final class C6890n implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C6890n f54386a = new C6890n();

        C6890n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(!(it.b() == null));
        }
    }

    /* renamed from: n8.a$o, reason: case insensitive filesystem */
    static final class C6891o implements n {

        /* renamed from: n8.a$o$a, reason: collision with other inner class name */
        static final class C1974a implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1974a f54388a = new C1974a();

            C1974a() {
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List apply(Ke.m state, List openPorts) {
                AbstractC6492s.i(state, "state");
                AbstractC6492s.i(openPorts, "openPorts");
                ArrayList arrayList = new ArrayList();
                Iterator it = openPorts.iterator();
                while (it.hasNext()) {
                    Ke.l lVar = (Ke.l) it.next();
                    arrayList.add(new a.e("portScanItem:" + lVar.c(), lVar));
                }
                if ((state instanceof m.b) || (state instanceof m.c)) {
                    arrayList.add(a.d.f10691a);
                } else {
                    if (!(state instanceof m.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (openPorts.isEmpty()) {
                        arrayList.add(new a.e("portScanItem:empty", new Ke.l(null, new d.b(com.ubnt.usurvey.R.string.port_scan_empty), null)));
                    }
                }
                return arrayList;
            }
        }

        C6891o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Object objA = sVar.a();
            AbstractC6492s.h(objA, "component1(...)");
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            Boolean bool = (Boolean) objC;
            if (((Boolean) objA).booleanValue() && bool.booleanValue()) {
                gg.i iVarW = gg.i.v(AbstractC6877a.this.C().b(), AbstractC6877a.this.C().c(), C1974a.f54388a).W();
                AbstractC6492s.f(iVarW);
                return iVarW;
            }
            gg.i iVarK0 = gg.i.K0(AbstractC3689v.l());
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    /* renamed from: n8.a$p, reason: case insensitive filesystem */
    static final class C6892p implements n {
        C6892p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(InterfaceC2557a device) {
            a.C1402a c1402aH;
            String strG;
            a.C1402a c1402aH2;
            String strI;
            a.C1402a c1402aH3;
            String strH;
            a.C1402a c1402aH4;
            String strJ;
            AbstractC6492s.i(device, "device");
            ArrayList arrayList = new ArrayList();
            AbstractC6877a abstractC6877a = AbstractC6877a.this;
            Dc.j jVarJ = device.j();
            if (jVarJ != null && (c1402aH4 = jVarJ.H()) != null && (strJ = c1402aH4.j()) != null) {
                arrayList.add(AbstractC6877a.I(abstractC6877a, "name", new d.b(com.ubnt.usurvey.R.string.name), null, new d.c(strJ), false, 20, null));
            }
            Dc.j jVarJ2 = device.j();
            if (jVarJ2 != null && (c1402aH3 = jVarJ2.H()) != null && (strH = c1402aH3.h()) != null) {
                arrayList.add(AbstractC6877a.I(abstractC6877a, "description", new d.b(com.ubnt.usurvey.R.string.device_detail_snmp_description), null, new d.c(strH), false, 20, null));
            }
            Dc.j jVarJ3 = device.j();
            if (jVarJ3 != null && (c1402aH2 = jVarJ3.H()) != null && (strI = c1402aH2.i()) != null) {
                arrayList.add(AbstractC6877a.I(abstractC6877a, "location", new d.b(com.ubnt.usurvey.R.string.device_detail_snmp_location), null, new d.c(strI), false, 20, null));
            }
            Dc.j jVarJ4 = device.j();
            if (jVarJ4 != null && (c1402aH = jVarJ4.H()) != null && (strG = c1402aH.g()) != null) {
                arrayList.add(AbstractC6877a.I(abstractC6877a, "contact", new d.b(com.ubnt.usurvey.R.string.device_detail_snmp_contact), null, new d.c(strG), false, 20, null));
            }
            return arrayList;
        }
    }

    /* renamed from: n8.a$q, reason: case insensitive filesystem */
    static final class C6893q implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C6893q f54390a = new C6893q();

        C6893q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(InterfaceC2557a device) {
            Dc.j jVarJ;
            AbstractC6492s.i(device, "device");
            a.g gVar = null;
            if ((device.f() == null || !(!Cc.m.a(r0))) && (jVarJ = device.j()) != null && (jVarJ.K() != null || jVarJ.J() != null)) {
                gVar = a.g.f10701a;
            }
            return new C6556a(gVar);
        }
    }

    /* renamed from: n8.a$r, reason: case insensitive filesystem */
    static final class C6894r implements n {
        C6894r() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(InterfaceC2557a device) {
            e.a aVarM;
            Uc.a aVarH;
            String strA;
            e.a aVarM2;
            Uc.a aVarH2;
            String strE;
            e.a aVarM3;
            Uc.a aVarH3;
            String strF;
            AbstractC6492s.i(device, "device");
            ArrayList arrayList = new ArrayList();
            AbstractC6877a abstractC6877a = AbstractC6877a.this;
            if (!abstractC6877a.G(device)) {
                Dc.j jVarJ = device.j();
                if (jVarJ != null && (aVarM3 = jVarJ.M()) != null && (aVarH3 = aVarM3.h()) != null && (strF = aVarH3.f()) != null) {
                    arrayList.add(AbstractC6877a.I(abstractC6877a, "modelUrl", new d.b(com.ubnt.usurvey.R.string.device_detail_upnp_product_site), null, new d.c(strF), false, 20, null));
                }
                Dc.j jVarJ2 = device.j();
                if (jVarJ2 != null && (aVarM2 = jVarJ2.M()) != null && (aVarH2 = aVarM2.h()) != null && (strE = aVarH2.e()) != null) {
                    arrayList.add(AbstractC6877a.I(abstractC6877a, "vendorUrl", new d.b(com.ubnt.usurvey.R.string.device_detail_upnp_manufacturer_site), null, new d.c(strE), false, 20, null));
                }
                Dc.j jVarJ3 = device.j();
                if (jVarJ3 != null && (aVarM = jVarJ3.M()) != null && (aVarH = aVarM.h()) != null && (strA = aVarH.a()) != null) {
                    arrayList.add(AbstractC6877a.I(abstractC6877a, "serial", new d.b(com.ubnt.usurvey.R.string.device_detail_upnp_serial_number), null, new d.c(strA), false, 20, null));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: n8.a$s, reason: case insensitive filesystem */
    static final class C6895s implements n {
        C6895s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(InterfaceC2557a device) {
            b.a aVarI;
            S8.h hVarU;
            s9.d dVarA;
            a.C0794a c0794aL;
            S8.l lVarM;
            a.C0794a c0794aL2;
            S8.g gVarP;
            AbstractC6492s.i(device, "device");
            ArrayList arrayList = new ArrayList();
            AbstractC6877a abstractC6877a = AbstractC6877a.this;
            Dc.j jVarJ = device.j();
            if (jVarJ != null && (c0794aL2 = jVarJ.L()) != null && (gVarP = c0794aL2.p()) != null) {
                arrayList.add(AbstractC6877a.I(abstractC6877a, "experience", new d.b(com.ubnt.usurvey.R.string.wifi_experience), null, Ne.k.b(gVarP, true), false, 20, null));
            }
            Dc.j jVarJ2 = device.j();
            if (jVarJ2 != null && (c0794aL = jVarJ2.L()) != null && (lVarM = c0794aL.m()) != null) {
                arrayList.add(AbstractC6877a.I(abstractC6877a, "wifiSignal", new d.b(com.ubnt.usurvey.R.string.wifi_signal_strength), null, Ne.f.h(lVarM, true, null, 2, null), false, 20, null));
            }
            Dc.j jVarJ3 = device.j();
            if (jVarJ3 != null && (aVarI = jVarJ3.I()) != null && (hVarU = aVarI.u()) != null && (dVarA = k8.n.a(hVarU)) != null) {
                arrayList.add(AbstractC6877a.I(abstractC6877a, "wirelessMode", new d.b(com.ubnt.usurvey.R.string.device_detail_wifi_wireless_mode), null, dVarA, false, 20, null));
            }
            return arrayList;
        }
    }

    /* renamed from: n8.a$t, reason: case insensitive filesystem */
    static final class C6896t implements InterfaceC6465b {

        /* renamed from: n8.a$t$a, reason: collision with other inner class name */
        public static final class C1975a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((S8.i) ((Map.Entry) obj).getKey()).l(), ((S8.i) ((Map.Entry) obj2).getKey()).l());
            }
        }

        C6896t() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a.h c(AbstractC6877a abstractC6877a, Map map, Map.Entry entry) {
            AbstractC6492s.i(entry, "<destruct>");
            List list = (List) entry.getValue();
            AbstractC6492s.f(map);
            return abstractC6877a.D(list, map);
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List apply(InterfaceC2557a device, final Map signalStats) {
            AbstractC6492s.i(device, "device");
            AbstractC6492s.i(signalStats, "signalStats");
            TreeSet treeSetM = device.m();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : treeSetM) {
                S8.i iVarA = S8.i.a(((C6588i) obj).o());
                Object arrayList = linkedHashMap.get(iVarA);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(iVarA, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            InterfaceC8780j interfaceC8780jT = AbstractC8783m.T(Zg.U.y(linkedHashMap), new C1975a());
            final AbstractC6877a abstractC6877a = AbstractC6877a.this;
            return AbstractC8783m.Z(AbstractC8783m.O(interfaceC8780jT, new InterfaceC6835l() { // from class: n8.d
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj2) {
                    return AbstractC6877a.C6896t.c(abstractC6877a, signalStats, (Map.Entry) obj2);
                }
            }));
        }
    }

    /* renamed from: n8.a$u, reason: case insensitive filesystem */
    static final class C6897u implements kg.m {

        /* renamed from: a, reason: collision with root package name */
        public static final C6897u f54394a = new C6897u();

        C6897u() {
        }

        @Override // kg.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2706g a(a.C0430a header, List general, C6556a c6556a, C6556a c6556a2, C6556a c6556a3, List bluetooth, List wifiSignals, List wifi, C6878b secondaryStats) {
            AbstractC6492s.i(header, "header");
            AbstractC6492s.i(general, "general");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(c6556a2, "<destruct>");
            AbstractC6492s.i(c6556a3, "<destruct>");
            AbstractC6492s.i(bluetooth, "bluetooth");
            AbstractC6492s.i(wifiSignals, "wifiSignals");
            AbstractC6492s.i(wifi, "wifi");
            AbstractC6492s.i(secondaryStats, "secondaryStats");
            a.g gVar = (a.g) c6556a.a();
            a.c cVar = (a.c) c6556a2.a();
            a.f fVar = (a.f) c6556a3.a();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C2706g.a.b(header));
            if (gVar != null) {
                arrayList.add(new C2706g.a.b(gVar));
            }
            if (!general.isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("cardGeneral", null, null, general, 6, null));
            }
            if (cVar != null) {
                arrayList.add(new C2706g.a.C0194a(cVar.getId(), null, null, AbstractC3689v.e(cVar), 6, null));
            }
            if (!secondaryStats.d().isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("cardNetwork", new d.b(com.ubnt.usurvey.R.string.device_detail_network_title), null, secondaryStats.d(), 4, null));
            }
            if (fVar != null) {
                arrayList.add(new C2706g.a.C0194a("cardBluetoothSignal", new d.b(com.ubnt.usurvey.R.string.device_detail_bluetooth_title), null, AbstractC3689v.e(fVar), 4, null));
            }
            if (!bluetooth.isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("cardBluetooth", fVar == null ? new d.b(com.ubnt.usurvey.R.string.device_detail_bluetooth_title) : null, null, bluetooth, 4, null));
            }
            if (!wifiSignals.isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("cardWifiSignal", new d.b(com.ubnt.usurvey.R.string.device_detail_wifi_signals_title), null, wifiSignals, 4, null));
            }
            if (!wifi.isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("cardWifi", wifiSignals.isEmpty() ? new d.b(com.ubnt.usurvey.R.string.device_detail_wifi_title) : null, null, wifi, 4, null));
            }
            if (!secondaryStats.b().isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("cardCellular", wifiSignals.isEmpty() ? new d.b(com.ubnt.usurvey.R.string.device_detail_cellular_title) : null, null, secondaryStats.b(), 4, null));
            }
            if (!secondaryStats.c().isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("cardNetbios", new d.b(com.ubnt.usurvey.R.string.device_detail_netbios_title), null, secondaryStats.c(), 4, null));
            }
            if (!secondaryStats.f().isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("cardSnmp", new d.b(com.ubnt.usurvey.R.string.device_detail_snmp_title), null, secondaryStats.f(), 4, null));
            }
            if (!secondaryStats.g().isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("cardUpnp", new d.b(com.ubnt.usurvey.R.string.device_detail_upnp_title), null, secondaryStats.g(), 4, null));
            }
            if (!secondaryStats.a().isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("cardBonjour", new d.b(com.ubnt.usurvey.R.string.device_detail_bonjour_title), null, secondaryStats.a(), 4, null));
            }
            if (!secondaryStats.e().isEmpty()) {
                arrayList.add(new C2706g.a.C0194a("cardPortScan", new d.b(com.ubnt.usurvey.R.string.port_scan_title), null, secondaryStats.e(), 4, null));
            }
            return new C2706g(arrayList);
        }
    }

    /* renamed from: n8.a$v, reason: case insensitive filesystem */
    static final class C6898v implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C6898v f54395a = new C6898v();

        C6898v() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Je.a apply(InterfaceC2557a it) {
            AbstractC6492s.i(it, "it");
            return a.C0407a.f10004a;
        }
    }

    /* renamed from: n8.a$w, reason: case insensitive filesystem */
    static final class C6899w implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C6899w f54396a = new C6899w();

        /* renamed from: n8.a$w$a, reason: collision with other inner class name */
        static final class C1976a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1976a f54397a = new C1976a();

            C1976a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Je.a apply(Long it) {
                AbstractC6492s.i(it, "it");
                return a.b.f10005a;
            }
        }

        C6899w() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Je.a contentType) {
            AbstractC6492s.i(contentType, "contentType");
            if ((contentType instanceof a.C0407a) || (contentType instanceof a.b)) {
                return gg.i.K0(contentType);
            }
            if (contentType instanceof a.c) {
                return gg.i.d2(5000L, TimeUnit.MILLISECONDS).N0(C1976a.f54397a).z1(a.c.f10006a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: n8.a$x, reason: case insensitive filesystem */
    static final class C6900x implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C6900x f54398a = new C6900x();

        C6900x() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(InterfaceC2557a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.getId() != null);
        }
    }

    /* renamed from: n8.a$y */
    static final class y implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final y f54399a = new y();

        y() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            C8321a c8321aP;
            C8321a c8321aP2;
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC2557a interfaceC2557a = (InterfaceC2557a) c6556a.a();
            C5969a c5969aD = null;
            if (interfaceC2557a != null && (c8321aP = interfaceC2557a.p()) != null && c8321aP.c() && (c8321aP2 = interfaceC2557a.p()) != null) {
                c5969aD = c8321aP2.d();
            }
            return new C6556a(c5969aD);
        }
    }

    /* renamed from: n8.a$z */
    static final class z implements n {

        /* renamed from: n8.a$z$a, reason: collision with other inner class name */
        static final class C1977a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1977a f54401a = new C1977a();

            /* renamed from: n8.a$z$a$a, reason: collision with other inner class name */
            static final class C1978a implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final C1978a f54402a = new C1978a();

                C1978a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(Throwable error) {
                    AbstractC6492s.i(error, "error");
                    return error instanceof BleCommonCharacteristicsReader.Error ? gg.i.d2(10000L, TimeUnit.MILLISECONDS) : gg.i.k0(error);
                }
            }

            C1977a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.p0(C1978a.f54402a);
            }
        }

        z() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            C5969a c5969a = (C5969a) c6556a.a();
            return (!AbstractC6877a.this.y() || c5969a == null) ? AbstractC5912b.m() : AbstractC6877a.this.r().a(c5969a).y().Q(C1977a.f54401a);
        }
    }

    public AbstractC6877a(DI di2, InterfaceC6879c deviceProvider) {
        AbstractC6492s.i(di2, "di");
        AbstractC6492s.i(deviceProvider, "deviceProvider");
        this.f54317a = deviceProvider;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new K().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, InterfaceC5347a.class), null);
        th.l[] lVarArr = f54300Q;
        this.f54318b = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new L().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f54319c = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, com.ui.wifiman.model.bluetooth.le.a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new M().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f54320d = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE3, wc.h.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new N().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f54321e = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE4, C8322b.a.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new O().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f54322f = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE5, C6937a.InterfaceC1989a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new P().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f54323g = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE6, InterfaceC7106a.class), null).a(this, lVarArr[5]);
        gg.i iVarA = deviceProvider.a();
        this.f54324h = iVarA;
        gg.i iVarI2 = iVarA.v0(E.f54351a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f54325i = iVarI2;
        this.f54326j = new W(new J());
        this.f54327k = true;
        gg.z zVarI = gg.z.i(new Q());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI22 = zVarI.w(new A()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f54328l = iVarI22;
        this.f54329m = true;
        gg.z zVarI2 = gg.z.i(new R());
        AbstractC6492s.h(zVarI2, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bT = zVarI2.t(new X());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        this.f54330n = abstractC5912bT;
        this.f54331o = true;
        AbstractC5912b abstractC5912bL1 = iVarA.N0(y.f54399a).W().L1(new z());
        AbstractC6492s.h(abstractC5912bL1, "switchMapCompletable(...)");
        this.f54332p = abstractC5912bL1;
        gg.i iVarK0 = gg.i.K0(new C6556a(new d.b(com.ubnt.usurvey.R.string.device_detail_title)));
        AbstractC6492s.h(iVarK0, "just(...)");
        this.f54333q = iVarK0;
        gg.i iVarW = iVarI2.N0(C6898v.f54395a).z1(a.c.f10006a).I1(C6899w.f54396a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f54334r = iVarW;
        gg.i iVarW2 = iVarI2.N0(C6900x.f54398a).W().z1(Boolean.FALSE).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f54335s = iVarW2;
        gg.i iVarW3 = iVarI2.N0(C6886j.f54381a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f54336t = iVarW3;
        gg.i iVarW4 = iVarI2.N0(C6893q.f54390a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f54337u = iVarW4;
        gg.i iVarW5 = iVarI2.N0(C6887k.f54382a).W();
        AbstractC6492s.h(iVarW5, "distinctUntilChanged(...)");
        this.f54338v = iVarW5;
        gg.i iVarW6 = iVarI2.N0(new C6885i()).W();
        AbstractC6492s.h(iVarW6, "distinctUntilChanged(...)");
        this.f54339w = iVarW6;
        gg.i iVarW7 = gg.i.v(iVarI2, iVarI22, new C6889m()).W();
        AbstractC6492s.h(iVarW7, "distinctUntilChanged(...)");
        this.f54340x = iVarW7;
        gg.i iVarI1 = iVarI2.N0(C6880d.f54372a).W().I1(new C6881e());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f54341y = iVarI1;
        gg.i iVarW8 = gg.i.v(iVarI2, iVarI1, C6883g.f54378a).W();
        AbstractC6492s.h(iVarW8, "distinctUntilChanged(...)");
        this.f54342z = iVarW8;
        gg.i iVarW9 = iVarI2.N0(new C6882f()).W();
        AbstractC6492s.h(iVarW9, "distinctUntilChanged(...)");
        this.f54302A = iVarW9;
        gg.i iVarW10 = gg.i.v(iVarI2, E().getAll(), new C6896t()).W();
        AbstractC6492s.h(iVarW10, "distinctUntilChanged(...)");
        this.f54303B = iVarW10;
        gg.i iVarW11 = iVarI2.N0(new C6895s()).W();
        AbstractC6492s.h(iVarW11, "distinctUntilChanged(...)");
        this.f54304C = iVarW11;
        gg.i iVarW12 = iVarI2.N0(new C6888l()).W();
        AbstractC6492s.h(iVarW12, "distinctUntilChanged(...)");
        this.f54305D = iVarW12;
        gg.i iVarW13 = iVarI2.N0(new C6892p()).W();
        AbstractC6492s.h(iVarW13, "distinctUntilChanged(...)");
        this.f54306E = iVarW13;
        gg.i iVarW14 = iVarI2.N0(new C6884h()).W();
        AbstractC6492s.h(iVarW14, "distinctUntilChanged(...)");
        this.f54307F = iVarW14;
        gg.i iVarW15 = iVarI2.N0(new C6894r()).W();
        AbstractC6492s.h(iVarW15, "distinctUntilChanged(...)");
        this.f54308G = iVarW15;
        gg.i iVarK02 = gg.i.K0(AbstractC3689v.l());
        AbstractC6492s.h(iVarK02, "just(...)");
        this.f54309H = iVarK02;
        this.f54310I = true;
        gg.i iVarI23 = iVarI2.N0(D.f54350a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f54311J = iVarI23;
        Ag.c cVar = Ag.c.f753a;
        gg.i iVarW16 = iVarI23.N0(C6890n.f54386a).W();
        AbstractC6492s.h(iVarW16, "distinctUntilChanged(...)");
        gg.z zVarI3 = gg.z.i(new S());
        AbstractC6492s.h(zVarI3, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarW17 = zVarI3.W();
        AbstractC6492s.h(iVarW17, "toFlowable(...)");
        gg.i iVarI12 = cVar.a(iVarW16, iVarW17).W().I1(new C6891o());
        AbstractC6492s.h(iVarI12, "switchMap(...)");
        this.f54312K = iVarI12;
        this.f54313L = C().b();
        gg.z zVarI4 = gg.z.i(new T());
        AbstractC6492s.h(zVarI4, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarW18 = zVarI4.w(F.f54353a);
        gg.z zVarI5 = gg.z.i(new U());
        AbstractC6492s.h(zVarI5, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarW19 = zVarI5.w(G.f54354a);
        gg.z zVarI6 = gg.z.i(new V());
        AbstractC6492s.h(zVarI6, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarQ = gg.i.q(iVarW18, iVarW12, iVarW15, iVarW13, iVarW19, zVarI6.w(H.f54355a), iVarI12, I.f54356a);
        AbstractC6492s.h(iVarQ, "combineLatest(...)");
        this.f54314M = iVarQ;
        gg.i iVarW20 = gg.i.o(iVarW3, iVarW6, iVarW4, iVarW5, iVarW8, iVarW9, iVarW10, iVarW11, iVarQ, C6897u.f54394a).W();
        AbstractC6492s.h(iVarW20, "distinctUntilChanged(...)");
        this.f54315N = iVarW20;
        AbstractC5912b abstractC5912bI = AbstractC5912b.I(abstractC5912bL1, abstractC5912bT);
        AbstractC6492s.h(abstractC5912bI, "mergeArray(...)");
        this.f54316O = abstractC5912bI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7106a C() {
        return (InterfaceC7106a) this.f54323g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.h D(List list, Map map) {
        s9.d bVar;
        boolean z10;
        Object next;
        Object next2;
        Object next3;
        C6588i c6588i = (C6588i) AbstractC3689v.s0(list);
        if (c6588i == null) {
            return null;
        }
        String strO = c6588i.o();
        AbstractC6458c abstractC6458cR = c6588i.r();
        if (abstractC6458cR instanceof AbstractC6458c.a) {
            bVar = new d.c(((AbstractC6458c.a) abstractC6458cR).b());
        } else {
            if (!(abstractC6458cR instanceof AbstractC6458c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new d.b(com.ubnt.usurvey.R.string.wifi_ssid_hidden);
        }
        AbstractC6458c abstractC6458cR2 = c6588i.r();
        if (abstractC6458cR2 instanceof AbstractC6458c.a) {
            z10 = true;
        } else {
            if (!(abstractC6458cR2 instanceof AbstractC6458c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            z10 = false;
        }
        List listC = AbstractC3689v.c();
        if (c6588i.c().size() > 1) {
            listC.add(w.f742a);
        }
        Yg.J j10 = Yg.J.f24997a;
        List listA = AbstractC3689v.a(listC);
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C6588i) next).f().a() == S8.c.GHZ_2_4) {
                break;
            }
        }
        C6588i c6588i2 = (C6588i) next;
        C2428c.a aVarH = c6588i2 != null ? M8.r.h(c6588i2, (C6937a) map.get(S8.k.a(c6588i2.k()))) : null;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((C6588i) next2).f().a() == S8.c.GHZ_5) {
                break;
            }
        }
        C6588i c6588i3 = (C6588i) next2;
        C2428c.a aVarH2 = c6588i3 != null ? M8.r.h(c6588i3, (C6937a) map.get(S8.k.a(c6588i3.k()))) : null;
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (((C6588i) next3).f().a() == S8.c.GHZ_6) {
                break;
            }
        }
        C6588i c6588i4 = (C6588i) next3;
        return new a.h(new C2428c(strO, null, bVar, z10, listA, aVarH, aVarH2, c6588i4 != null ? M8.r.h(c6588i4, (C6937a) map.get(S8.k.a(c6588i4.k()))) : null));
    }

    private final C6937a.InterfaceC1989a E() {
        return (C6937a.InterfaceC1989a) this.f54322f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G(InterfaceC2557a interfaceC2557a) {
        com.ui.wifiman.model.vendor.d dVarC = interfaceC2557a.c();
        return dVarC != null && (dVarC instanceof d.c) && ((d.c) dVarC).c() == d.EnumC1510d.UBIQUITI;
    }

    public static /* synthetic */ a.b I(AbstractC6877a abstractC6877a, String str, s9.d dVar, s9.d dVar2, s9.d dVar3, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newKeyVal");
        }
        if ((i10 & 4) != 0) {
            dVar2 = null;
        }
        s9.d dVar4 = dVar2;
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        return abstractC6877a.H(str, dVar, dVar4, dVar3, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wifiman.model.bluetooth.le.a r() {
        return (com.ui.wifiman.model.bluetooth.le.a) this.f54319c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wc.h t() {
        return (wc.h) this.f54320d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C8322b.a u() {
        return (C8322b.a) this.f54321e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5347a z() {
        return (InterfaceC5347a) this.f54318b.getValue();
    }

    protected final Comparator A() {
        return this.f54326j;
    }

    protected boolean B() {
        return this.f54327k;
    }

    public boolean F() {
        return this.f54310I;
    }

    protected final a.b H(String id2, s9.d title, s9.d dVar, s9.d value, boolean z10) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(title, "title");
        AbstractC6492s.i(value, "value");
        return new a.b(id2, title, dVar, value, z10);
    }

    @Override // n8.InterfaceC6904e
    public final gg.i a() {
        return this.f54324h;
    }

    @Override // n8.InterfaceC6904e
    public gg.i b() {
        return this.f54313L;
    }

    @Override // n8.InterfaceC6904e
    public gg.i c() {
        return this.f54333q;
    }

    @Override // n8.InterfaceC6904e
    public void d(androidx.lifecycle.E savedState) {
        AbstractC6492s.i(savedState, "savedState");
        C().d(savedState);
    }

    @Override // n8.InterfaceC6904e
    public void e(androidx.lifecycle.E savedState) {
        AbstractC6492s.i(savedState, "savedState");
        C().e(savedState);
    }

    @Override // n8.InterfaceC6904e
    public gg.i f() {
        return this.f54335s;
    }

    @Override // n8.InterfaceC6904e
    public gg.i g() {
        return this.f54334r;
    }

    @Override // n8.InterfaceC6904e
    public gg.i h() {
        return this.f54315N;
    }

    @Override // n8.InterfaceC6904e
    public AbstractC5912b i() {
        AbstractC5912b abstractC5912bK = this.f54311J.o0().u(B.f54347a).k(new C());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        return abstractC5912bK;
    }

    @Override // n8.InterfaceC6904e
    public AbstractC5912b j() {
        return this.f54316O;
    }

    protected boolean s() {
        return this.f54329m;
    }

    public gg.i v() {
        return this.f54307F;
    }

    public gg.i w() {
        return this.f54309H;
    }

    protected gg.i x() {
        return this.f54340x;
    }

    protected boolean y() {
        return this.f54331o;
    }
}
