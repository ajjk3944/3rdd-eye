package E8;

import Ee.C2706g;
import Li.N;
import Zg.AbstractC3689v;
import b8.AbstractC4075b;
import ch.AbstractC4260a;
import com.ui.wifiman.model.speedtest.result.b;
import com.ui.wifiman.ui.component.network.AbstractC5218p;
import gg.AbstractC5912b;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kf.AbstractC6459a;
import kf.AbstractC6460b;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class F extends AbstractC6460b {

    /* renamed from: g, reason: collision with root package name */
    private final DI f4103g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f4104h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f4105i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f4106j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f4107k;

    /* renamed from: l, reason: collision with root package name */
    private final Fg.a f4108l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f4109m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f4110n;

    /* renamed from: o, reason: collision with root package name */
    private final N f4111o;

    /* renamed from: p, reason: collision with root package name */
    private final N f4112p;

    /* renamed from: q, reason: collision with root package name */
    private final N f4113q;

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ th.l[] f4101s = {O.h(new kotlin.jvm.internal.F(F.class, "resultManager", "getResultManager()Lcom/ui/wifiman/model/speedtest/result/SpeedtestResultManager;", 0)), O.h(new kotlin.jvm.internal.F(F.class, "queryFilter", "getQueryFilter()Lcom/ubnt/usurvey/ui/speedtest/SpeedtestResultQueryFilter;", 0)), O.h(new kotlin.jvm.internal.F(F.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new kotlin.jvm.internal.F(F.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: r, reason: collision with root package name */
    private static final a f4100r = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f4102t = 8;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC6459a.b f4114a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC6459a.b reason) {
                super(null);
                AbstractC6492s.i(reason, "reason");
                this.f4114a = reason;
            }

            public final AbstractC6459a.b a() {
                return this.f4114a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f4114a, ((a) obj).f4114a);
            }

            public int hashCode() {
                return this.f4114a.hashCode();
            }

            public String toString() {
                return "Empty(reason=" + this.f4114a + ")";
            }
        }

        /* renamed from: E8.F$b$b, reason: collision with other inner class name */
        public static final class C0175b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final List f4115a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0175b(List results) {
                super(null);
                AbstractC6492s.i(results, "results");
                this.f4115a = results;
            }

            public final List a() {
                return this.f4115a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0175b) && AbstractC6492s.d(this.f4115a, ((C0175b) obj).f4115a);
            }

            public int hashCode() {
                return this.f4115a.hashCode();
            }

            public String toString() {
                return "Results(results=" + this.f4115a + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4116a;

        static {
            int[] iArr = new int[pd.s.values().length];
            try {
                iArr[pd.s.CONSOLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pd.s.INTERNET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pd.s.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pd.s.APP_TO_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4116a = iArr;
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f4117a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(b.C0175b it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f4118a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Cc.j it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.getName());
        }
    }

    static final class f implements InterfaceC6465b {
        f() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2706g apply(List results, C6556a c6556a) {
            long jLongValue;
            Long lValueOf;
            long jLongValue2;
            long jLongValue3;
            Long lValueOf2;
            long jLongValue4;
            AbstractC6492s.i(results, "results");
            AbstractC6492s.i(c6556a, "<destruct>");
            String str = (String) c6556a.a();
            List<com.ui.wifiman.model.speedtest.result.b> list = results;
            Iterator it = list.iterator();
            Long l10 = null;
            if (it.hasNext()) {
                Iterator it2 = ((com.ui.wifiman.model.speedtest.result.b) it.next()).g().iterator();
                if (it2.hasNext()) {
                    b.c cVar = (b.c) it2.next();
                    if (cVar.a() == null || cVar.h() == null) {
                        Long lA = cVar.a();
                        if (lA != null) {
                            jLongValue = lA.longValue();
                        } else {
                            Long lH = cVar.h();
                            jLongValue = lH != null ? lH.longValue() : 100000000L;
                        }
                    } else {
                        Long lA2 = cVar.a();
                        AbstractC6492s.f(lA2);
                        long jLongValue5 = lA2.longValue();
                        Long lH2 = cVar.h();
                        AbstractC6492s.f(lH2);
                        jLongValue = Math.max(jLongValue5, lH2.longValue());
                    }
                    lValueOf = Long.valueOf(jLongValue);
                    while (it2.hasNext()) {
                        b.c cVar2 = (b.c) it2.next();
                        if (cVar2.a() == null || cVar2.h() == null) {
                            Long lA3 = cVar2.a();
                            if (lA3 != null) {
                                jLongValue2 = lA3.longValue();
                            } else {
                                Long lH3 = cVar2.h();
                                jLongValue2 = lH3 != null ? lH3.longValue() : 100000000L;
                            }
                        } else {
                            Long lA4 = cVar2.a();
                            AbstractC6492s.f(lA4);
                            long jLongValue6 = lA4.longValue();
                            Long lH4 = cVar2.h();
                            AbstractC6492s.f(lH4);
                            jLongValue2 = Math.max(jLongValue6, lH4.longValue());
                        }
                        Long lValueOf3 = Long.valueOf(jLongValue2);
                        if (lValueOf.compareTo(lValueOf3) < 0) {
                            lValueOf = lValueOf3;
                        }
                    }
                } else {
                    lValueOf = null;
                }
                Long lValueOf4 = Long.valueOf(lValueOf != null ? lValueOf.longValue() : 100000000L);
                while (it.hasNext()) {
                    Iterator it3 = ((com.ui.wifiman.model.speedtest.result.b) it.next()).g().iterator();
                    if (it3.hasNext()) {
                        b.c cVar3 = (b.c) it3.next();
                        if (cVar3.a() == null || cVar3.h() == null) {
                            Long lA5 = cVar3.a();
                            if (lA5 != null) {
                                jLongValue3 = lA5.longValue();
                            } else {
                                Long lH5 = cVar3.h();
                                jLongValue3 = lH5 != null ? lH5.longValue() : 100000000L;
                            }
                        } else {
                            Long lA6 = cVar3.a();
                            AbstractC6492s.f(lA6);
                            long jLongValue7 = lA6.longValue();
                            Long lH6 = cVar3.h();
                            AbstractC6492s.f(lH6);
                            jLongValue3 = Math.max(jLongValue7, lH6.longValue());
                        }
                        lValueOf2 = Long.valueOf(jLongValue3);
                        while (it3.hasNext()) {
                            b.c cVar4 = (b.c) it3.next();
                            if (cVar4.a() == null || cVar4.h() == null) {
                                Long lA7 = cVar4.a();
                                if (lA7 != null) {
                                    jLongValue4 = lA7.longValue();
                                } else {
                                    Long lH7 = cVar4.h();
                                    jLongValue4 = lH7 != null ? lH7.longValue() : 100000000L;
                                }
                            } else {
                                Long lA8 = cVar4.a();
                                AbstractC6492s.f(lA8);
                                long jLongValue8 = lA8.longValue();
                                Long lH8 = cVar4.h();
                                AbstractC6492s.f(lH8);
                                jLongValue4 = Math.max(jLongValue8, lH8.longValue());
                            }
                            Long lValueOf5 = Long.valueOf(jLongValue4);
                            if (lValueOf2.compareTo(lValueOf5) < 0) {
                                lValueOf2 = lValueOf5;
                            }
                        }
                    } else {
                        lValueOf2 = null;
                    }
                    Long lValueOf6 = Long.valueOf(lValueOf2 != null ? lValueOf2.longValue() : 100000000L);
                    if (lValueOf4.compareTo(lValueOf6) < 0) {
                        lValueOf4 = lValueOf6;
                    }
                }
                l10 = lValueOf4;
            }
            long jMax = Math.max(100000000L, l10 != null ? l10.longValue() : 100000000L);
            F f10 = F.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (com.ui.wifiman.model.speedtest.result.b bVar : list) {
                arrayList.add(new hf.o(f10.G0(bVar), C.f4095a.g(bVar), AbstractC5218p.a(bVar.d()), AbstractC5218p.b(bVar.d(), bVar.j().h()), f10.I0(bVar, jMax, str)));
            }
            return new C2706g(AbstractC3689v.e(new C2706g.a.C0194a("results", null, null, arrayList, 6, null)));
        }
    }

    static final class g implements InterfaceC6465b {
        g() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b apply(List results, String str) {
            AbstractC6492s.i(results, "results");
            AbstractC6492s.i(str, "<unused var>");
            F f10 = F.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : results) {
                if (((Boolean) f10.D0().e().invoke((com.ui.wifiman.model.speedtest.result.b) obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return results.isEmpty() ? new b.a(AbstractC6459a.b.C1910b.f51425a) : arrayList.isEmpty() ? new b.a(AbstractC6459a.b.C1909a.f51424a) : new b.C0175b(arrayList);
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f4121a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC6459a apply(b cnt) {
            AbstractC6492s.i(cnt, "cnt");
            if (cnt instanceof b.C0175b) {
                return AbstractC6459a.C1908a.f51423a;
            }
            if (cnt instanceof b.a) {
                return ((b.a) cnt).a();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class i implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i10;
            pd.s sVarG = ((b.c) obj).g();
            int[] iArr = c.f4116a;
            int i11 = iArr[sVarG.ordinal()];
            int i12 = 0;
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = 1;
            } else if (i11 == 3) {
                i10 = 2;
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 3;
            }
            Integer numValueOf = Integer.valueOf(i10);
            int i13 = iArr[((b.c) obj2).g().ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    i12 = 1;
                } else if (i13 == 3) {
                    i12 = 2;
                } else {
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = 3;
                }
            }
            return AbstractC4260a.e(numValueOf, Integer.valueOf(i12));
        }
    }

    public static final class j implements InterfaceC5915e {
        public j() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                F.this.f4108l.h(Boolean.FALSE);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class k implements gg.C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4124b;

        public k(String str) {
            this.f4124b = str;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Long.valueOf(F.this.H0(this.f4124b)));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class l implements kg.n {
        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Long resultId) {
            AbstractC6492s.i(resultId, "resultId");
            return F.this.F0().a(new InterfaceC6084a.b.B.AbstractC1814b.C1815a(resultId.longValue(), false, 2, null));
        }
    }

    public static final class m implements gg.C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4127b;

        public m(String str) {
            this.f4127b = str;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Long.valueOf(F.this.H0(this.f4127b)));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class n implements kg.n {
        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Long resultId) {
            AbstractC6492s.i(resultId, "resultId");
            return F.this.E0().b(resultId.longValue());
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends org.kodein.type.o<com.ui.wifiman.model.speedtest.result.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class p extends org.kodein.type.o<E> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q extends org.kodein.type.o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r extends org.kodein.type.o<InterfaceC6084a> {
    }

    public F(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f4103g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new o().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, com.ui.wifiman.model.speedtest.result.e.class), null);
        th.l[] lVarArr = f4101s;
        this.f4104h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new p().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4105i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, E.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new q().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4106j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, Cc.n.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new r().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4107k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC6084a.class), null).a(this, lVarArr[3]);
        Boolean bool = Boolean.FALSE;
        Fg.a aVarK2 = Fg.a.k2(bool);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f4108l = aVarK2;
        gg.i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f4109m = iVarI2;
        gg.i iVarI22 = gg.i.v(E0().e(null, null, null), D0().f(), new g()).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f4110n = iVarI22;
        gg.i iVarN0 = iVarI22.N0(h.f4121a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f4111o = AbstractC8661g.d0(this, iVarN0, AbstractC6459a.c.f51426a, false, null, 6, null);
        this.f4112p = AbstractC8661g.d0(this, iVarI2, bool, false, null, 6, null);
        gg.i iVarZ0 = iVarI22.Z0(b.C0175b.class);
        AbstractC6492s.h(iVarZ0, "ofType(R::class.java)");
        gg.i iVarV = gg.i.v(iVarZ0.N0(d.f4117a), C0().b().N0(e.f4118a).W(), new f());
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        this.f4113q = AbstractC8661g.d0(this, iVarV, new C2706g(AbstractC3689v.l()), false, null, 6, null);
    }

    private final Cc.n C0() {
        return (Cc.n) this.f4106j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E D0() {
        return (E) this.f4105i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wifiman.model.speedtest.result.e E0() {
        return (com.ui.wifiman.model.speedtest.result.e) this.f4104h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a F0() {
        return (InterfaceC6084a) this.f4107k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G0(com.ui.wifiman.model.speedtest.result.b bVar) {
        return String.valueOf(bVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long H0(String str) {
        return Long.parseLong(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List I0(com.ui.wifiman.model.speedtest.result.b bVar, long j10, String str) {
        ArrayList arrayList;
        if (bVar.g().size() > 1) {
            List listX0 = AbstractC3689v.X0(bVar.g(), new i());
            List list = listX0;
            arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                b.c cVar = (b.c) obj;
                Long lA = cVar.a();
                W7.a aVarB = lA != null ? W7.a.f23676b.b(lA.longValue()) : null;
                Long lH = cVar.h();
                W7.a aVarB2 = lH != null ? W7.a.f23676b.b(lH.longValue()) : null;
                W7.a aVarB3 = W7.a.f23676b.b(j10);
                C c10 = C.f4095a;
                s9.b bVarD = c10.d(cVar);
                b.AbstractC1432b abstractC1432bC = cVar.c();
                b.c cVar2 = (b.c) AbstractC3689v.t0(listX0, i11);
                s9.d dVarC = c10.c(abstractC1432bC, cVar2 != null ? cVar2.c() : null, str);
                Integer numF = cVar.f();
                arrayList.add(new hf.n(aVarB, aVarB2, aVarB3, bVarD, dVarC, numF != null ? AbstractC4075b.f33002a.a(numF.intValue()) : null));
                i10 = i11;
            }
        } else {
            List<b.c> listG = bVar.g();
            arrayList = new ArrayList(AbstractC3689v.w(listG, 10));
            for (b.c cVar3 : listG) {
                Long lA2 = cVar3.a();
                W7.a aVarB4 = lA2 != null ? W7.a.f23676b.b(lA2.longValue()) : null;
                Long lH2 = cVar3.h();
                W7.a aVarB5 = lH2 != null ? W7.a.f23676b.b(lH2.longValue()) : null;
                W7.a aVarB6 = W7.a.f23676b.b(j10);
                C c11 = C.f4095a;
                s9.b bVarD2 = c11.d(cVar3);
                s9.d dVarC2 = c11.c(cVar3.c(), null, str);
                Integer numF2 = cVar3.f();
                arrayList.add(new hf.n(aVarB4, aVarB5, aVarB6, bVarD2, dVarC2, numF2 != null ? AbstractC4075b.f33002a.a(numF2.intValue()) : null));
            }
        }
        return arrayList;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f4103g;
    }

    @Override // kf.AbstractC6460b
    public N n0() {
        return this.f4113q;
    }

    @Override // kf.AbstractC6460b
    public N o0() {
        return this.f4111o;
    }

    @Override // kf.AbstractC6460b
    public N p0() {
        return this.f4112p;
    }

    @Override // kf.AbstractC6460b
    public void q0() {
        this.f4108l.h(Boolean.TRUE);
    }

    @Override // kf.AbstractC6460b
    public void r0() {
        this.f4108l.h(Boolean.FALSE);
    }

    @Override // kf.AbstractC6460b
    public void s0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new j());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        gg.z zVarI = gg.z.i(new k(id2));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bT = abstractC5912bR.k(zVarI).t(new l());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // kf.AbstractC6460b
    public void t0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        gg.z zVarI = gg.z.i(new m(id2));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bT = zVarI.t(new n());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // kf.AbstractC6460b
    public void u0(String query) {
        AbstractC6492s.i(query, "query");
        D0().g(query);
    }
}
