package com.ui.wifiman.model.discovery.engine.snmp;

import Wc.a;
import Zc.e;
import Zg.AbstractC3689v;
import com.ui.wifiman.model.discovery.engine.snmp.Snmp;
import com.ui.wifiman.model.discovery.engine.snmp.a;
import ee.C5455a;
import gg.i;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class b extends com.ui.wifiman.model.discovery.engine.snmp.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f42772d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Snmp f42773a;

    /* renamed from: b, reason: collision with root package name */
    private final i f42774b;

    /* renamed from: c, reason: collision with root package name */
    private final i f42775c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.ui.wifiman.model.discovery.engine.snmp.b$b, reason: collision with other inner class name */
    static final class C1403b implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1403b f42776a = new C1403b();

        C1403b() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap apply(ConcurrentHashMap map, Snmp.a response) {
            AbstractC6492s.i(map, "map");
            AbstractC6492s.i(response, "response");
            long jCurrentTimeMillis = System.currentTimeMillis();
            inet.ipaddr.g gVarC = response.c();
            String strE = response.e();
            String str = (strE == null || t.m0(strE)) ? null : strE;
            String strB = response.b();
            String str2 = (strB == null || t.m0(strB)) ? null : strB;
            String strG = response.g();
            String str3 = (strG == null || t.m0(strG)) ? null : strG;
            String strA = response.a();
            String str4 = (strA == null || t.m0(strA)) ? null : strA;
            String strD = response.d();
            String str5 = (strD == null || t.m0(strD)) ? null : strD;
            String strF = response.f();
            a.C1402a c1402a = new a.C1402a(gVarC, str, str2, str3, str4, str5, (strF == null || t.m0(strF)) ? null : strF, jCurrentTimeMillis, jCurrentTimeMillis + 60000);
            map.put(c1402a.b(), c1402a);
            return map;
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f42777a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(ConcurrentHashMap it) {
            AbstractC6492s.i(it, "it");
            Collection collectionValues = it.values();
            AbstractC6492s.h(collectionValues, "<get-values>(...)");
            return AbstractC3689v.i1(collectionValues);
        }
    }

    static final class d implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f42779a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ inet.ipaddr.g f42780b;

            /* renamed from: com.ui.wifiman.model.discovery.engine.snmp.b$d$a$a, reason: collision with other inner class name */
            static final class C1404a implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                public static final C1404a f42781a = new C1404a();

                C1404a() {
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(Dj.c it) {
                    AbstractC6492s.i(it, "it");
                    Z7.b.g("SNMP discovery scan request", "SnmpDiscEngine");
                }
            }

            /* renamed from: com.ui.wifiman.model.discovery.engine.snmp.b$d$a$b, reason: collision with other inner class name */
            static final class C1405b implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final C1405b f42782a = new C1405b();

                C1405b() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(Throwable error) {
                    AbstractC6492s.i(error, "error");
                    return error instanceof Snmp.Error ? i.j0() : i.k0(error);
                }
            }

            a(b bVar, inet.ipaddr.g gVar) {
                this.f42779a = bVar;
                this.f42780b = gVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Long it) {
                AbstractC6492s.i(it, "it");
                return this.f42779a.f42773a.a(this.f42780b, 10000L).g0(C1404a.f42781a).P1(10000L, TimeUnit.MILLISECONDS).f1(C1405b.f42782a);
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            inet.ipaddr.g gVar = (inet.ipaddr.g) c6556a.a();
            if (gVar != null) {
                return i.F0(0L, 10000L, TimeUnit.MILLISECONDS).e1().Y0(Gg.a.a(), false, 1).p0(new a(b.this, gVar));
            }
            Z7.b.g("SNMP discovery not initiated since broadcast address unavailable", "SnmpDiscEngine");
            return i.j0();
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final e f42783a = new e();

        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("SNMP discovery results emission - size: " + it.size(), "SnmpDiscEngine");
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f42784a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("SNMP discovery subscribed", "SnmpDiscEngine");
        }
    }

    static final class g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final g f42785a = new g();

        g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.c("SNMP discovery should never emit error", it, "SnmpDiscEngine");
        }
    }

    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f42786a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Zc.e connection) {
            AbstractC6492s.i(connection, "connection");
            e.a aVarB = connection.b();
            String strE = null;
            if ((aVarB != null ? aVarB.b() : null) != null) {
                e.a aVarB2 = connection.b();
                if ((aVarB2 != null ? Integer.valueOf(aVarB2.c()) : null) != null) {
                    a.C0895a c0895a = Wc.a.f23857c;
                    e.a aVarB3 = connection.b();
                    inet.ipaddr.g gVarB = aVarB3 != null ? aVarB3.b() : null;
                    AbstractC6492s.f(gVarB);
                    e.a aVarB4 = connection.b();
                    Integer numValueOf = aVarB4 != null ? Integer.valueOf(aVarB4.c()) : null;
                    AbstractC6492s.f(numValueOf);
                    Wc.a aVarA = c0895a.a(gVarB, numValueOf.intValue());
                    if (aVarA != null) {
                        C5455a c5455a = C5455a.f46379a;
                        strE = c5455a.e(c5455a.a(aVarA));
                    }
                }
            }
            return new C6556a(new inet.ipaddr.n(strE).g());
        }
    }

    public b(Zc.f networkConnection, Snmp snmp) {
        AbstractC6492s.i(networkConnection, "networkConnection");
        AbstractC6492s.i(snmp, "snmp");
        this.f42773a = snmp;
        i iVarI2 = networkConnection.getState().N0(h.f42786a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42774b = iVarI2;
        i iVarI1 = iVarI2.I1(new d());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        i iVarI22 = e(iVarI1).W().f0(e.f42783a).g0(f.f42784a).d0(g.f42785a).Z(new InterfaceC6464a() { // from class: Oc.a
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.discovery.engine.snmp.b.f();
            }
        }).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f42775c = iVarI22;
    }

    private final i e(i iVar) {
        i iVarZ1 = iVar.q1(new ConcurrentHashMap(), C1403b.f42776a).N0(c.f42777a).z1(AbstractC3689v.l());
        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
        return iVarZ1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        Z7.b.g("SNMP discovery finished", "SnmpDiscEngine");
    }

    @Override // Ec.t
    public i b() {
        return this.f42775c;
    }
}
