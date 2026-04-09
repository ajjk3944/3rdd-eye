package Dc;

import Dc.e;
import Dc.p;
import Ec.t;
import Fc.a;
import Jc.a;
import Kc.a;
import Nc.b;
import Qc.a;
import Zg.AbstractC3689v;
import Zg.U;
import b8.EnumC4076c;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6824a;
import org.kodein.di.DI;
import rj.InterfaceC7733m2;

/* loaded from: classes4.dex */
public final class p implements e {

    /* renamed from: b, reason: collision with root package name */
    private final Zc.f f3220b;

    /* renamed from: c, reason: collision with root package name */
    private final DI f3221c;

    /* renamed from: d, reason: collision with root package name */
    private final Fg.a f3222d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f3223e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f3224f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC5912b f3225g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f3226h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f3227i;

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ th.l[] f3219k = {O.g(new kotlin.jvm.internal.D(p.class, "engine", "<v#0>", 0)), O.g(new kotlin.jvm.internal.D(p.class, "engine", "<v#1>", 0)), O.g(new kotlin.jvm.internal.D(p.class, "engine", "<v#2>", 0)), O.g(new kotlin.jvm.internal.D(p.class, "engine", "<v#3>", 0)), O.g(new kotlin.jvm.internal.D(p.class, "engine", "<v#4>", 0))};

    /* renamed from: j, reason: collision with root package name */
    public static final C2582a f3218j = new C2582a(null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class A extends org.kodein.type.o<Jc.a> {
    }

    public static final class B extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3228a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(Object obj) {
            super(0);
            this.f3228a = obj;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f3228a;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C extends org.kodein.type.o<Kc.a> {
    }

    public static final class D extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3229a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(Object obj) {
            super(0);
            this.f3229a = obj;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f3229a;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class E extends org.kodein.type.o<Sc.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class F extends org.kodein.type.o<Gc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class G extends org.kodein.type.o<com.ui.wifiman.model.discovery.engine.bonjour.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class H extends org.kodein.type.o<b.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class I extends org.kodein.type.o<Nc.b> {
    }

    public static final class J extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3230a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(Object obj) {
            super(0);
            this.f3230a = obj;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f3230a;
        }
    }

    static final class K implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final K f3231a = new K();

        K() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            k kVarA;
            gg.i iVarA;
            AbstractC6492s.i(c6556a, "<destruct>");
            C2584c c2584c = (C2584c) c6556a.a();
            return (c2584c == null || (kVarA = c2584c.a()) == null || (iVarA = kVarA.a()) == null) ? gg.i.K0(U.h()) : iVarA;
        }
    }

    static final class L implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final L f3232a = new L();

        static final class a implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f3233a = new a();

            a() {
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e.b.a apply(a.c status, Integer deviceCount) {
                AbstractC6492s.i(status, "status");
                AbstractC6492s.i(deviceCount, "deviceCount");
                return status.a() ? new e.b.a.C0153a(deviceCount.intValue()) : new e.b.a.C0154b(status.b(), deviceCount.intValue());
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f3234a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e.b.a.C0153a apply(Integer deviceCount) {
                AbstractC6492s.i(deviceCount, "deviceCount");
                return new e.b.a.C0153a(deviceCount.intValue());
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final c f3235a = new c();

            c() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer apply(Map it) {
                AbstractC6492s.i(it, "it");
                return Integer.valueOf(it.size());
            }
        }

        L() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i iVarK0;
            Map mapB;
            AbstractC6492s.i(c6556a, "<destruct>");
            C2584c c2584c = (C2584c) c6556a.a();
            if (c2584c == null || (iVarK0 = c2584c.a().a().N0(c.f3235a).W()) == null) {
                iVarK0 = gg.i.K0(0);
                AbstractC6492s.h(iVarK0, "just(...)");
            }
            Object obj = (c2584c == null || (mapB = c2584c.b()) == null) ? null : (Ec.t) mapB.get(t.c.ICMP);
            Kc.a aVar = obj instanceof Kc.a ? (Kc.a) obj : null;
            if (aVar != null) {
                gg.i iVarV = gg.i.v(aVar.a().e1(), iVarK0, a.f3233a);
                AbstractC6492s.f(iVarV);
                return iVarV;
            }
            gg.i iVarN0 = iVarK0.N0(b.f3234a);
            AbstractC6492s.f(iVarN0);
            return iVarN0;
        }
    }

    static final class M implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final M f3236a = new M();

        M() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(e.b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Net Discovery Status emission: " + it, null, 2, null);
        }
    }

    /* renamed from: Dc.p$a, reason: case insensitive filesystem */
    public static final class C2582a {
        public /* synthetic */ C2582a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2582a() {
        }
    }

    /* renamed from: Dc.p$b, reason: case insensitive filesystem */
    private static abstract class AbstractC2583b {

        /* renamed from: Dc.p$b$a */
        public static final class a extends AbstractC2583b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f3237a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1829079719;
            }

            public String toString() {
                return "Disabled";
            }
        }

        /* renamed from: Dc.p$b$b, reason: collision with other inner class name */
        public static final class C0155b extends AbstractC2583b {

            /* renamed from: a, reason: collision with root package name */
            private final String f3238a;

            /* renamed from: b, reason: collision with root package name */
            private final Wc.a f3239b;

            /* renamed from: c, reason: collision with root package name */
            private final Set f3240c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0155b(String str, Wc.a aVar, Set discoveryTypes) {
                super(null);
                AbstractC6492s.i(discoveryTypes, "discoveryTypes");
                this.f3238a = str;
                this.f3239b = aVar;
                this.f3240c = discoveryTypes;
            }

            public final Wc.a a() {
                return this.f3239b;
            }

            public final String b() {
                return this.f3238a;
            }

            public final Set c() {
                return this.f3240c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0155b)) {
                    return false;
                }
                C0155b c0155b = (C0155b) obj;
                return AbstractC6492s.d(this.f3238a, c0155b.f3238a) && AbstractC6492s.d(this.f3239b, c0155b.f3239b) && AbstractC6492s.d(this.f3240c, c0155b.f3240c);
            }

            public int hashCode() {
                String str = this.f3238a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Wc.a aVar = this.f3239b;
                return ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f3240c.hashCode();
            }

            public String toString() {
                return "Enabled(connectionId=" + this.f3238a + ", cidr=" + this.f3239b + ", discoveryTypes=" + this.f3240c + ")";
            }
        }

        public /* synthetic */ AbstractC2583b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2583b() {
        }
    }

    /* renamed from: Dc.p$c, reason: case insensitive filesystem */
    private static final class C2584c {

        /* renamed from: a, reason: collision with root package name */
        private final k f3241a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f3242b;

        public C2584c(k combiner, Map engines) {
            AbstractC6492s.i(combiner, "combiner");
            AbstractC6492s.i(engines, "engines");
            this.f3241a = combiner;
            this.f3242b = engines;
        }

        public final k a() {
            return this.f3241a;
        }

        public final Map b() {
            return this.f3242b;
        }
    }

    /* renamed from: Dc.p$d, reason: case insensitive filesystem */
    public /* synthetic */ class C2585d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3243a;

        static {
            int[] iArr = new int[t.c.values().length];
            try {
                iArr[t.c.ICMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.c.UBNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.c.ARP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.c.BONJOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.c.NETBIOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.c.SNMP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[t.c.MYSELF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[t.c.GATEWAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[t.c.AP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[t.c.UPNP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[t.c.MIKROTIK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[t.c.UNIFI.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[t.c.UBNT_TCP_SPEEDTEST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[t.c.UBNT_HTTP_SPEEDTEST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[t.c.HOSTNAME.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f3243a = iArr;
        }
    }

    /* renamed from: Dc.p$e, reason: case insensitive filesystem */
    public static final class C2586e implements InterfaceC5915e {
        public C2586e() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                p.this.f3222d.h(Yg.J.f24997a);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: Dc.p$f, reason: case insensitive filesystem */
    static final class C2587f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2587f f3245a = new C2587f();

        /* renamed from: Dc.p$f$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2584c f3246a;

            a(C2584c c2584c) {
                this.f3246a = c2584c;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(List results) {
                AbstractC6492s.i(results, "results");
                return this.f3246a.a().b(results).W(Gg.a.a());
            }
        }

        /* renamed from: Dc.p$f$b */
        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2584c f3247a;

            b(C2584c c2584c) {
                this.f3247a = c2584c;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                Map mapB = this.f3247a.b();
                ArrayList arrayList = new ArrayList(mapB.size());
                Iterator it2 = mapB.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add(((t.c) ((Map.Entry) it2.next()).getKey()).name());
                }
                Z7.b.h("Discovery Engines SUBSCRIBED [" + AbstractC3689v.z0(arrayList, ", ", null, null, 0, null, null, 62, null) + "]", null, 2, null);
            }
        }

        /* renamed from: Dc.p$f$c */
        static final class c implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final c f3248a = new c();

            c() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("Discovery Not Enabled", null, 2, null);
            }
        }

        C2587f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            Z7.b.h("Discovery Engines DISPOSED", null, 2, null);
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            C2584c c2584c = (C2584c) c6556a.a();
            if (c2584c == null) {
                return AbstractC5912b.m().B(c.f3248a);
            }
            Map mapB = c2584c.b();
            ArrayList arrayList = new ArrayList(mapB.size());
            Iterator it = mapB.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((Ec.t) ((Map.Entry) it.next()).getValue()).b().t0(new a(c2584c)));
            }
            return AbstractC5912b.H(arrayList).B(new b(c2584c)).y(new InterfaceC6464a() { // from class: Dc.q
                @Override // kg.InterfaceC6464a
                public final void run() {
                    p.C2587f.c();
                }
            });
        }
    }

    /* renamed from: Dc.p$g, reason: case insensitive filesystem */
    static final class C2588g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C2588g f3249a = new C2588g();

        C2588g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Discovery SUBSCRIBED", null, 2, null);
        }
    }

    /* renamed from: Dc.p$h, reason: case insensitive filesystem */
    static final class C2589h implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ th.l[] f3250b = {O.g(new kotlin.jvm.internal.D(p.class, "combiner", "<v#5>", 0))};

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Dc.p$h$a */
        public static final class a extends org.kodein.type.o<String> {
        }

        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Dc.p$h$b */
        public static final class b extends org.kodein.type.o<k> {
        }

        /* renamed from: Dc.p$h$c */
        public static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f3252a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Object obj) {
                super(0);
                this.f3252a = obj;
            }

            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return this.f3252a;
            }
        }

        C2589h() {
        }

        private static final k b(Yg.m mVar) {
            return (k) mVar.getValue();
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(AbstractC2583b params) {
            AbstractC6492s.i(params, "params");
            if (!(params instanceof AbstractC2583b.C0155b)) {
                if (params instanceof AbstractC2583b.a) {
                    return new C6556a(null);
                }
                throw new NoWhenBranchMatchedException();
            }
            DI di2 = p.this.f3221c;
            AbstractC2583b.C0155b c0155b = (AbstractC2583b.C0155b) params;
            String strB = c0155b.b();
            if (strB == null) {
                strB = "noConnection";
            }
            org.kodein.type.i iVarE = org.kodein.type.s.e(new a().getSuperType());
            AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            org.kodein.type.d dVar = new org.kodein.type.d(iVarE, String.class);
            org.kodein.type.i iVarE2 = org.kodein.type.s.e(new b().getSuperType());
            AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
            Yg.m mVarA = org.kodein.di.d.b(di2, dVar, new org.kodein.type.d(iVarE2, k.class), null, new c(strB)).a(null, f3250b[0]);
            k kVarB = b(mVarA);
            Set<t.c> setC = c0155b.c();
            p pVar = p.this;
            ArrayList arrayList = new ArrayList();
            for (t.c cVar : setC) {
                Ec.t tVarJ = pVar.j(c0155b, cVar, b(mVarA));
                Yg.s sVarA = tVarJ != null ? Yg.z.a(cVar, tVarJ) : null;
                if (sVarA != null) {
                    arrayList.add(sVarA);
                }
            }
            return new C6556a(new C2584c(kVarB, U.r(arrayList)));
        }
    }

    /* renamed from: Dc.p$i, reason: case insensitive filesystem */
    static final class C2590i implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C2590i f3253a = new C2590i();

        C2590i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Yg.J it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Discovery requested to (re)start", null, 2, null);
        }
    }

    /* renamed from: Dc.p$j, reason: case insensitive filesystem */
    static final class C2591j implements kg.n {

        /* renamed from: Dc.p$j$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f3255a = new a();

            /* renamed from: Dc.p$j$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0156a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f3256a;

                static {
                    int[] iArr = new int[EnumC4076c.values().length];
                    try {
                        iArr[EnumC4076c.WIFI.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC4076c.ETHERNET.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC4076c.UNKNOWN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC4076c.MOBILE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[EnumC4076c.DISCONNECTED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f3256a = iArr;
                }
            }

            a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final Dc.p.AbstractC2583b apply(Zc.e r10) {
                /*
                    r9 = this;
                    java.lang.String r0 = "networkConnection"
                    kotlin.jvm.internal.AbstractC6492s.i(r10, r0)
                    Zc.e$a r0 = r10.b()
                    r1 = 0
                    if (r0 == 0) goto L11
                    inet.ipaddr.g r0 = r0.b()
                    goto L12
                L11:
                    r0 = r1
                L12:
                    b8.c r2 = r10.g()
                    int[] r3 = Dc.p.C2591j.a.C0156a.f3256a
                    int r2 = r2.ordinal()
                    r2 = r3[r2]
                    r4 = 5
                    r5 = 4
                    r6 = 3
                    r7 = 2
                    r8 = 1
                    if (r2 == r8) goto L36
                    if (r2 == r7) goto L36
                    if (r2 == r6) goto L34
                    if (r2 == r5) goto L34
                    if (r2 != r4) goto L2e
                    goto L34
                L2e:
                    kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                    r10.<init>()
                    throw r10
                L34:
                    r2 = r1
                    goto L44
                L36:
                    Zc.e$a r2 = r10.b()
                    if (r2 == 0) goto L34
                    int r2 = r2.c()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                L44:
                    if (r0 == 0) goto L52
                    if (r2 == 0) goto L52
                    Wc.a$a r1 = Wc.a.f23857c
                    int r2 = r2.intValue()
                    Wc.a r1 = r1.a(r0, r2)
                L52:
                    b8.c r0 = r10.g()
                    int r0 = r0.ordinal()
                    r0 = r3[r0]
                    if (r0 == r8) goto L6e
                    if (r0 == r7) goto L6e
                    if (r0 == r6) goto L6e
                    if (r0 == r5) goto L6e
                    if (r0 != r4) goto L68
                    r0 = 0
                    goto L6f
                L68:
                    kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                    r10.<init>()
                    throw r10
                L6e:
                    r0 = r8
                L6f:
                    b8.c r2 = r10.g()
                    int r2 = r2.ordinal()
                    r2 = r3[r2]
                    if (r2 == r8) goto L9b
                    if (r2 == r7) goto L9b
                    if (r2 == r6) goto L9b
                    if (r2 == r5) goto L8e
                    if (r2 != r4) goto L88
                    java.util.Set r2 = Zg.d0.e()
                    goto La1
                L88:
                    kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                    r10.<init>()
                    throw r10
                L8e:
                    Ec.t$c r2 = Ec.t.c.GATEWAY
                    Ec.t$c r3 = Ec.t.c.MYSELF
                    Ec.t$c[] r2 = new Ec.t.c[]{r2, r3}
                    java.util.Set r2 = Zg.d0.i(r2)
                    goto La1
                L9b:
                    Dc.e$a r2 = Dc.e.f3185a
                    java.util.Set r2 = r2.a()
                La1:
                    if (r0 == 0) goto Lc5
                    Dc.p$b$b r0 = new Dc.p$b$b
                    b8.c r10 = r10.g()
                    java.lang.String r10 = r10.name()
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    r3.append(r10)
                    java.lang.String r10 = "-"
                    r3.append(r10)
                    r3.append(r1)
                    java.lang.String r10 = r3.toString()
                    r0.<init>(r10, r1, r2)
                    goto Lc7
                Lc5:
                    Dc.p$b$a r0 = Dc.p.AbstractC2583b.a.f3237a
                Lc7:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: Dc.p.C2591j.a.apply(Zc.e):Dc.p$b");
            }
        }

        C2591j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.J j10) {
            AbstractC6492s.i(j10, "<unused var>");
            if (com.ubnt.usurvey.a.f39654r.a().getConfig().h()) {
                gg.i iVarW = p.this.f3220b.getState().N0(a.f3255a).W();
                AbstractC6492s.f(iVarW);
                return iVarW;
            }
            gg.i iVarK0 = gg.i.K0(AbstractC2583b.a.f3237a);
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    /* renamed from: Dc.p$k, reason: case insensitive filesystem */
    static final class C2592k implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C2592k f3257a = new C2592k();

        C2592k() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(AbstractC2583b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("New Discovery Params - " + it, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Dc.p$l, reason: case insensitive filesystem */
    public static final class C2593l extends org.kodein.type.o<com.ui.wifiman.model.discovery.engine.snmp.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Dc.p$m, reason: case insensitive filesystem */
    public static final class C2594m extends org.kodein.type.o<Mc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends org.kodein.type.o<Ic.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<a.C0249a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Dc.p$p, reason: collision with other inner class name */
    public static final class C0157p extends org.kodein.type.o<Fc.a> {
    }

    public static final class q extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3258a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Object obj) {
            super(0);
            this.f3258a = obj;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f3258a;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r extends org.kodein.type.o<Uc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class s extends org.kodein.type.o<Lc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class t extends org.kodein.type.o<Tc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class u extends org.kodein.type.o<Rc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class v extends org.kodein.type.o<a.C0426a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class w extends org.kodein.type.o<a.C0679a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/y4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class x extends org.kodein.type.o<Qc.a> {
    }

    public static final class y extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3259a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Object obj) {
            super(0);
            this.f3259a = obj;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f3259a;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/x4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class z extends org.kodein.type.o<a.C0403a> {
    }

    public p(Zc.f networkConnectionManager, DI kodein) {
        AbstractC6492s.i(networkConnectionManager, "networkConnectionManager");
        AbstractC6492s.i(kodein, "kodein");
        this.f3220b = networkConnectionManager;
        this.f3221c = kodein;
        Fg.a aVarK2 = Fg.a.k2(Yg.J.f24997a);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f3222d = aVarK2;
        gg.i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).f0(C2590i.f3253a).I1(new C2591j()).f0(C2592k.f3257a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f3223e = iVarI2;
        gg.i iVarI22 = iVarI2.N0(new C2589h()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f3224f = iVarI22;
        AbstractC5912b abstractC5912bE0 = iVarI22.L1(C2587f.f3245a).B(C2588g.f3249a).y(new InterfaceC6464a() { // from class: Dc.o
            @Override // kg.InterfaceC6464a
            public final void run() {
                p.i();
            }
        }).c0().h1().i2().E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f3225g = abstractC5912bE0;
        gg.i iVarI23 = iVarI22.I1(L.f3232a).W().f0(M.f3236a).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f3226h = iVarI23;
        gg.i iVarI24 = iVarI22.I1(K.f3231a).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f3227i = iVarI24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i() {
        Z7.b.h("Discovery DISPOSED", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ec.t j(AbstractC2583b.C0155b c0155b, t.c cVar, k kVar) {
        Kc.a aVarK = null;
        switch (C2585d.f3243a[cVar.ordinal()]) {
            case 1:
                if (c0155b.a() != null) {
                    DI di2 = this.f3221c;
                    a.C0426a c0426a = new a.C0426a(c0155b.a(), 50, 800L);
                    org.kodein.type.i iVarE = org.kodein.type.s.e(new v().getSuperType());
                    AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                    org.kodein.type.d dVar = new org.kodein.type.d(iVarE, a.C0426a.class);
                    org.kodein.type.i iVarE2 = org.kodein.type.s.e(new C().getSuperType());
                    AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                    aVarK = k(org.kodein.di.d.b(di2, dVar, new org.kodein.type.d(iVarE2, Kc.a.class), null, new D(c0426a)).a(null, f3219k[0]));
                } else {
                    Z7.b.j("ICMP discovery engine failed to create since CIDR is unavailable", null, null, 6, null);
                }
                return aVarK;
            case 2:
                InterfaceC7733m2 interfaceC7733m2G = org.kodein.di.d.f(this.f3221c).g();
                org.kodein.type.i iVarE3 = org.kodein.type.s.e(new E().getSuperType());
                AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return (Ec.t) interfaceC7733m2G.e(new org.kodein.type.d(iVarE3, Sc.b.class), null);
            case 3:
                InterfaceC7733m2 interfaceC7733m2G2 = org.kodein.di.d.f(this.f3221c).g();
                org.kodein.type.i iVarE4 = org.kodein.type.s.e(new F().getSuperType());
                AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return (Ec.t) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE4, Gc.a.class), null);
            case 4:
                InterfaceC7733m2 interfaceC7733m2G3 = org.kodein.di.d.f(this.f3221c).g();
                org.kodein.type.i iVarE5 = org.kodein.type.s.e(new G().getSuperType());
                AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return (Ec.t) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE5, com.ui.wifiman.model.discovery.engine.bonjour.a.class), null);
            case 5:
                DI di3 = this.f3221c;
                b.a aVar = new b.a(kVar);
                org.kodein.type.i iVarE6 = org.kodein.type.s.e(new H().getSuperType());
                AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                org.kodein.type.d dVar2 = new org.kodein.type.d(iVarE6, b.a.class);
                org.kodein.type.i iVarE7 = org.kodein.type.s.e(new I().getSuperType());
                AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return l(org.kodein.di.d.b(di3, dVar2, new org.kodein.type.d(iVarE7, Nc.b.class), null, new J(aVar)).a(null, f3219k[1]));
            case 6:
                InterfaceC7733m2 interfaceC7733m2G4 = org.kodein.di.d.f(this.f3221c).g();
                org.kodein.type.i iVarE8 = org.kodein.type.s.e(new C2593l().getSuperType());
                AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return (Ec.t) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE8, com.ui.wifiman.model.discovery.engine.snmp.a.class), null);
            case 7:
                InterfaceC7733m2 interfaceC7733m2G5 = org.kodein.di.d.f(this.f3221c).g();
                org.kodein.type.i iVarE9 = org.kodein.type.s.e(new C2594m().getSuperType());
                AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return (Ec.t) interfaceC7733m2G5.e(new org.kodein.type.d(iVarE9, Mc.a.class), null);
            case 8:
                InterfaceC7733m2 interfaceC7733m2G6 = org.kodein.di.d.f(this.f3221c).g();
                org.kodein.type.i iVarE10 = org.kodein.type.s.e(new n().getSuperType());
                AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return (Ec.t) interfaceC7733m2G6.e(new org.kodein.type.d(iVarE10, Ic.a.class), null);
            case 9:
                DI di4 = this.f3221c;
                a.C0249a c0249a = new a.C0249a(kVar);
                org.kodein.type.i iVarE11 = org.kodein.type.s.e(new o().getSuperType());
                AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                org.kodein.type.d dVar3 = new org.kodein.type.d(iVarE11, a.C0249a.class);
                org.kodein.type.i iVarE12 = org.kodein.type.s.e(new C0157p().getSuperType());
                AbstractC6492s.g(iVarE12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return m(org.kodein.di.d.b(di4, dVar3, new org.kodein.type.d(iVarE12, Fc.a.class), null, new q(c0249a)).a(null, f3219k[2]));
            case 10:
                InterfaceC7733m2 interfaceC7733m2G7 = org.kodein.di.d.f(this.f3221c).g();
                org.kodein.type.i iVarE13 = org.kodein.type.s.e(new r().getSuperType());
                AbstractC6492s.g(iVarE13, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return (Ec.t) interfaceC7733m2G7.e(new org.kodein.type.d(iVarE13, Uc.e.class), null);
            case 11:
                InterfaceC7733m2 interfaceC7733m2G8 = org.kodein.di.d.f(this.f3221c).g();
                org.kodein.type.i iVarE14 = org.kodein.type.s.e(new s().getSuperType());
                AbstractC6492s.g(iVarE14, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return (Ec.t) interfaceC7733m2G8.e(new org.kodein.type.d(iVarE14, Lc.a.class), null);
            case 12:
                InterfaceC7733m2 interfaceC7733m2G9 = org.kodein.di.d.f(this.f3221c).g();
                org.kodein.type.i iVarE15 = org.kodein.type.s.e(new t().getSuperType());
                AbstractC6492s.g(iVarE15, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return (Ec.t) interfaceC7733m2G9.e(new org.kodein.type.d(iVarE15, Tc.a.class), null);
            case 13:
                InterfaceC7733m2 interfaceC7733m2G10 = org.kodein.di.d.f(this.f3221c).g();
                org.kodein.type.i iVarE16 = org.kodein.type.s.e(new u().getSuperType());
                AbstractC6492s.g(iVarE16, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return (Ec.t) interfaceC7733m2G10.e(new org.kodein.type.d(iVarE16, Rc.a.class), null);
            case 14:
                DI di5 = this.f3221c;
                a.C0679a c0679a = new a.C0679a(kVar);
                org.kodein.type.i iVarE17 = org.kodein.type.s.e(new w().getSuperType());
                AbstractC6492s.g(iVarE17, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                org.kodein.type.d dVar4 = new org.kodein.type.d(iVarE17, a.C0679a.class);
                org.kodein.type.i iVarE18 = org.kodein.type.s.e(new x().getSuperType());
                AbstractC6492s.g(iVarE18, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return n(org.kodein.di.d.b(di5, dVar4, new org.kodein.type.d(iVarE18, Qc.a.class), null, new y(c0679a)).a(null, f3219k[3]));
            case 15:
                DI di6 = this.f3221c;
                a.C0403a c0403a = new a.C0403a(kVar);
                org.kodein.type.i iVarE19 = org.kodein.type.s.e(new z().getSuperType());
                AbstractC6492s.g(iVarE19, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                org.kodein.type.d dVar5 = new org.kodein.type.d(iVarE19, a.C0403a.class);
                org.kodein.type.i iVarE20 = org.kodein.type.s.e(new A().getSuperType());
                AbstractC6492s.g(iVarE20, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
                return o(org.kodein.di.d.b(di6, dVar5, new org.kodein.type.d(iVarE20, Jc.a.class), null, new B(c0403a)).a(null, f3219k[4]));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final Kc.a k(Yg.m mVar) {
        return (Kc.a) mVar.getValue();
    }

    private static final Nc.b l(Yg.m mVar) {
        return (Nc.b) mVar.getValue();
    }

    private static final Fc.a m(Yg.m mVar) {
        return (Fc.a) mVar.getValue();
    }

    private static final Qc.a n(Yg.m mVar) {
        return (Qc.a) mVar.getValue();
    }

    private static final Jc.a o(Yg.m mVar) {
        return (Jc.a) mVar.getValue();
    }

    @Override // Dc.e
    public gg.i a() {
        return this.f3226h;
    }

    @Override // Dc.e
    public gg.i b() {
        return this.f3227i;
    }

    @Override // Dc.e
    public AbstractC5912b c() {
        return this.f3225g;
    }

    @Override // Dc.e
    public AbstractC5912b clear() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C2586e());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }
}
