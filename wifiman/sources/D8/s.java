package D8;

import D8.j;
import S8.f;
import W7.f;
import Yg.J;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.d0;
import af.C3806O;
import af.C3807P;
import af.C3808Q;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.wifi.WifiMcs;
import ef.AbstractC5460b;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import h9.C5969a;
import i8.InterfaceC6084a;
import ie.C6146c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.AbstractC6317r;
import je.C6316q;
import ke.AbstractC6456a;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import l9.C6556a;
import le.C6588i;
import le.InterfaceC6586g;
import mh.InterfaceC6835l;
import oh.AbstractC7137b;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.d;
import zi.AbstractC8783m;

/* loaded from: classes3.dex */
public final class s implements j.b {

    /* renamed from: a, reason: collision with root package name */
    private final Yg.m f3040a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f3041b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f3042c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f3043d;

    /* renamed from: e, reason: collision with root package name */
    private final Fg.a f3044e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f3045f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f3046g;

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ th.l[] f3038i = {O.h(new F(s.class, "wifiWifiConnectionService", "getWifiWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;", 0)), O.h(new F(s.class, "wifiScanner", "getWifiScanner()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;", 0)), O.h(new F(s.class, "wifiEnvironment", "getWifiEnvironment()Lcom/ui/wifiman/model/wifi/channel/WifiEnvironmentService;", 0)), O.h(new F(s.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: h, reason: collision with root package name */
    public static final a f3037h = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f3039j = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3047a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3048b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f3049c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f3050d;

        static {
            int[] iArr = new int[S8.c.values().length];
            try {
                iArr[S8.c.GHZ_2_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.c.GHZ_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.c.GHZ_6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3047a = iArr;
            int[] iArr2 = new int[f.a.values().length];
            try {
                iArr2[f.a.EXCELLENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f.a.GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[f.a.POOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f3048b = iArr2;
            int[] iArr3 = new int[S8.d.values().length];
            try {
                iArr3[S8.d.MHZ_20.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[S8.d.MHZ_40.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[S8.d.MHZ_80.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[S8.d.MHZ_160.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[S8.d.MHZ_80_80.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[S8.d.MHZ_320.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            f3049c = iArr3;
            int[] iArr4 = new int[f.a.values().length];
            try {
                iArr4[f.a.EXCELLENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[f.a.GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[f.a.FAIR.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[f.a.POOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            f3050d = iArr4;
        }
    }

    static final class c implements kg.h {
        c() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(S8.c bandSelected, AbstractC6317r state, List affiliatedScanResults, Map affiliatedChannelEnvironment) {
            C3807P c3807pP;
            AbstractC6492s.i(bandSelected, "bandSelected");
            AbstractC6492s.i(state, "state");
            AbstractC6492s.i(affiliatedScanResults, "affiliatedScanResults");
            AbstractC6492s.i(affiliatedChannelEnvironment, "affiliatedChannelEnvironment");
            if (state instanceof AbstractC6317r.b.a.C1874b) {
                c3807pP = s.this.q((AbstractC6317r.b.a.C1874b) state, affiliatedScanResults, affiliatedChannelEnvironment);
            } else if (state instanceof AbstractC6317r.b.a.C1873a) {
                c3807pP = s.this.p((AbstractC6317r.b.a.C1873a) state, bandSelected, affiliatedScanResults, affiliatedChannelEnvironment);
            } else {
                if (!(state instanceof AbstractC6317r.b.C1875b) && !(state instanceof AbstractC6317r.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c3807pP = null;
            }
            return new C6556a(c3807pP);
        }
    }

    public static final class d implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S8.c f3053b;

        public d(S8.c cVar) {
            this.f3053b = cVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                s.this.f3044e.h(this.f3053b);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<je.u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends org.kodein.type.o<InterfaceC6586g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<ie.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<InterfaceC6084a> {
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f3054a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(AbstractC6317r state) {
            S8.c cVarC;
            S8.c cVarC2;
            S8.c cVarC3;
            AbstractC6492s.i(state, "state");
            if (state instanceof AbstractC6317r.b.a.C1874b) {
                Set setB = d0.b();
                S8.c cVarB = ((AbstractC6317r.b.a.C1874b) state).b();
                if (cVarB != null) {
                    setB.add(cVarB);
                }
                return d0.a(setB);
            }
            if (!(state instanceof AbstractC6317r.b.a.C1873a)) {
                if ((state instanceof AbstractC6317r.b.C1875b) || (state instanceof AbstractC6317r.a)) {
                    return d0.e();
                }
                throw new NoWhenBranchMatchedException();
            }
            Set setB2 = d0.b();
            AbstractC6317r.b.a.C1873a c1873a = (AbstractC6317r.b.a.C1873a) state;
            C6316q c6316qQ = c1873a.q();
            if (c6316qQ != null && (cVarC3 = c6316qQ.c()) != null) {
                setB2.add(cVarC3);
            }
            C6316q c6316qR = c1873a.r();
            if (c6316qR != null && (cVarC2 = c6316qR.c()) != null) {
                setB2.add(cVarC2);
            }
            C6316q c6316qS = c1873a.s();
            if (c6316qS != null && (cVarC = c6316qS.c()) != null) {
                setB2.add(cVarC);
            }
            return d0.a(setB2);
        }
    }

    static final class j implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final j f3055a = new j();

        j() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S8.c apply(Set affiliatedBands, S8.c bandSelected) {
            S8.c cVar;
            AbstractC6492s.i(affiliatedBands, "affiliatedBands");
            AbstractC6492s.i(bandSelected, "bandSelected");
            return (affiliatedBands.contains(bandSelected) || (cVar = (S8.c) AbstractC3689v.s0(AbstractC3689v.W0(affiliatedBands))) == null) ? bandSelected : cVar;
        }
    }

    public s(DI di2) {
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, je.u.class), null);
        th.l[] lVarArr = f3038i;
        this.f3040a = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3041b = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, InterfaceC6586g.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3042c = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE3, ie.f.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f3043d = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE4, InterfaceC6084a.class), null).a(this, lVarArr[3]);
        Fg.a aVarK2 = Fg.a.k2(S8.c.GHZ_6);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f3044e = aVarK2;
        gg.i iVarI2 = gg.i.v(N().a().N0(i.f3054a), aVarK2.e1().Y0(Gg.a.a(), false, 1), j.f3055a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f3045f = iVarI2;
        gg.i iVarI22 = gg.i.t(c(), N().a(), M().b(), L().b(), new c()).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f3046g = iVarI22;
    }

    private final W7.e A(S8.c cVar) {
        int i10 = b.f3047a[cVar.ordinal()];
        if (i10 == 1) {
            return W7.e.FAIR;
        }
        if (i10 == 2 || i10 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final C3808Q B(C6316q c6316q, boolean z10, boolean z11) {
        return new C3808Q(c6316q.c(), z10, c6316q.i() instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a, c6316q.i() instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a.C1907a, z11);
    }

    private final W7.e C(S8.c cVar, S8.d dVar) {
        int i10 = b.f3047a[cVar.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            switch (b.f3049c[dVar.ordinal()]) {
                case 1:
                    return W7.e.POOR;
                case 2:
                    return W7.e.FAIR;
                case 3:
                case 4:
                case 5:
                case 6:
                    return null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        switch (b.f3049c[dVar.ordinal()]) {
            case 1:
                return W7.e.POOR;
            case 2:
                return W7.e.FAIR;
            case 3:
            case 4:
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final W7.e D(f.a aVar) {
        int i10 = b.f3050d[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return null;
        }
        if (i10 == 3) {
            return W7.e.FAIR;
        }
        if (i10 == 4) {
            return W7.e.POOR;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final List E(C6316q c6316q, C6588i c6588i, C6146c c6146c) {
        Float fT;
        Integer numF;
        List listC = AbstractC3689v.c();
        if (c6316q != null && (numF = c6316q.f()) != null) {
            listC.add(new C3806O.b(C3806O.b.a.CHANNEL, new d.b(R.string.number_int_format, AbstractC3689v.e(Integer.valueOf(numF.intValue()))), c6146c != null ? D(c6146c.b().b()) : null));
        }
        if (c6588i != null && (fT = c6588i.t()) != null) {
            int iE = AbstractC7137b.e(fT.floatValue() * 100.0f);
            listC.add(new C3806O.b(C3806O.b.a.UTILIZATION, new d.b(R.string.unit_percent_format, AbstractC3689v.e(Integer.valueOf(iE))), J(iE)));
        }
        return AbstractC3689v.a(listC);
    }

    private final W7.e F(S8.a aVar) {
        if (aVar.compareTo(S8.a.AC) < 0) {
            return W7.e.POOR;
        }
        if (aVar.compareTo(S8.a.AD) < 0) {
            return W7.e.FAIR;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final af.C3806O.a G(java.util.List r5) {
        /*
            r4 = this;
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        L8:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r5.next()
            af.O$b r2 = (af.C3806O.b) r2
            W7.e r3 = r2.a()
            if (r3 == 0) goto L2b
            W7.e r2 = r2.a()
            kotlin.jvm.internal.AbstractC6492s.f(r2)
            W7.e r3 = W7.e.GOOD
            int r2 = r2.compareTo(r3)
            if (r2 >= 0) goto L2b
            r2 = 1
            goto L2c
        L2b:
            r2 = r0
        L2c:
            int r1 = r1 + r2
            goto L8
        L2e:
            if (r1 <= 0) goto L36
            af.O$a$b r5 = new af.O$a$b
            r5.<init>(r1)
            return r5
        L36:
            af.O$a$a r5 = af.C3806O.a.C1006a.f26020a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.s.G(java.util.List):af.O$a");
    }

    private final List H(AbstractC6317r.b.a aVar, C6316q c6316q, C6588i c6588i) {
        S8.l lVarH;
        WifiMcs wifiMcsN;
        List listC = AbstractC3689v.c();
        S8.a aVarE = aVar.e();
        if (aVarE != null) {
            listC.add(new C3806O.b(C3806O.b.a.STANDARD, Ne.b.b(aVarE), F(aVarE)));
        }
        if (c6588i != null && (wifiMcsN = c6588i.n()) != null) {
            int iC = wifiMcsN.c();
            listC.add(new C3806O.b(C3806O.b.a.MIMO, new d.c(iC + "x" + iC), null, 4, null));
        }
        if (c6316q != null && (lVarH = c6316q.h()) != null) {
            listC.add(new C3806O.b(C3806O.b.a.SIGNAL, Ne.f.h(lVarH, false, null, 2, null), I(lVarH)));
        }
        return AbstractC3689v.a(listC);
    }

    private final W7.e I(S8.l lVar) {
        int i10 = b.f3048b[lVar.j().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return null;
        }
        if (i10 == 3) {
            return W7.e.POOR;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final W7.e J(int i10) {
        if (i10 >= 30 && i10 >= 50) {
            return i10 < 70 ? W7.e.FAIR : W7.e.POOR;
        }
        return null;
    }

    private final InterfaceC6084a K() {
        return (InterfaceC6084a) this.f3043d.getValue();
    }

    private final ie.f L() {
        return (ie.f) this.f3042c.getValue();
    }

    private final InterfaceC6586g M() {
        return (InterfaceC6586g) this.f3041b.getValue();
    }

    private final je.u N() {
        return (je.u) this.f3040a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final af.C3807P p(final je.AbstractC6317r.b.a.C1873a r27, S8.c r28, java.util.List r29, final java.util.Map r30) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.s.p(je.r$b$a$a, S8.c, java.util.List, java.util.Map):af.P");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3807P q(AbstractC6317r.b.a.C1874b c1874b, List list, Map map) {
        Object next;
        S8.c cVarC;
        List listZ = z(c1874b.m(), false);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C5969a c5969aE = ((C6588i) next).e();
            C6316q c6316qM = c1874b.m();
            if (AbstractC6492s.d(c5969aE, c6316qM != null ? c6316qM.e() : null)) {
                break;
            }
        }
        C6588i c6588i = (C6588i) next;
        List listH = H(c1874b, c1874b.m(), c6588i);
        C6316q c6316qM2 = c1874b.m();
        C6316q c6316qM3 = c1874b.m();
        List listE = E(c6316qM2, c6588i, (c6316qM3 == null || (cVarC = c6316qM3.c()) == null) ? null : (C6146c) map.get(cVarC));
        List listC = AbstractC3689v.c();
        Iterator it2 = AbstractC8783m.O(AbstractC3689v.d0(listZ), new InterfaceC6835l() { // from class: D8.l
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.r((C3806O.b) obj);
            }
        }).iterator();
        while (it2.hasNext()) {
            listC.add((W7.e) it2.next());
        }
        Iterator it3 = AbstractC8783m.O(AbstractC3689v.d0(listH), new InterfaceC6835l() { // from class: D8.m
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.s((C3806O.b) obj);
            }
        }).iterator();
        while (it3.hasNext()) {
            listC.add((W7.e) it3.next());
        }
        Iterator it4 = AbstractC8783m.O(AbstractC3689v.d0(listE), new InterfaceC6835l() { // from class: D8.n
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.t((C3806O.b) obj);
            }
        }).iterator();
        while (it4.hasNext()) {
            listC.add((W7.e) it4.next());
        }
        W7.e eVar = (W7.e) AbstractC3689v.s0(AbstractC3689v.a(listC));
        if (eVar == null) {
            eVar = W7.e.EXCELLENT;
        }
        d.b bVar = new d.b(R.string.speed_factors_wifi_title);
        Ci.f fVarA = Ci.a.a();
        C3806O c3806o = new C3806O("band", new d.b(R.string.speed_factors_item_spectrum_title), listZ, G(listZ), false, 16, null);
        C3806O c3806o2 = new C3806O("radio", new d.b(R.string.speed_factors_item_radio_potential_title), listH, G(listH), false, 16, null);
        if (c3806o2.d().isEmpty()) {
            c3806o2 = null;
        }
        C3806O c3806o3 = new C3806O("health", new d.b(R.string.speed_factors_item_channel_health_title), listE, G(listE), false, 16, null);
        return new C3807P(bVar, null, eVar, fVarA, c3806o, c3806o2, !c3806o3.d().isEmpty() ? c3806o3 : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W7.e r(C3806O.b it) {
        AbstractC6492s.i(it, "it");
        return it.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W7.e s(C3806O.b it) {
        AbstractC6492s.i(it, "it");
        return it.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W7.e t(C3806O.b it) {
        AbstractC6492s.i(it, "it");
        return it.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s u(s sVar, AbstractC6317r.b.a.C1873a c1873a, S8.c band) {
        AbstractC6492s.i(band, "band");
        return z.a(band, sVar.z(c1873a.o(band), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s v(AbstractC6317r.b.a.C1873a c1873a, Map map, s sVar, S8.c band) {
        AbstractC6492s.i(band, "band");
        return z.a(band, sVar.H(c1873a, c1873a.o(band), (C6588i) map.get(band)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s w(s sVar, AbstractC6317r.b.a.C1873a c1873a, Map map, Map map2, S8.c band) {
        AbstractC6492s.i(band, "band");
        return z.a(band, sVar.E(c1873a.o(band), (C6588i) map.get(band), (C6146c) map2.get(band)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s x(s sVar, Map map, Map map2, Map map3, S8.c it) {
        AbstractC6492s.i(it, "it");
        List listC = AbstractC3689v.c();
        List list = (List) map.get(it);
        if (list != null) {
            listC.addAll(list);
        }
        List list2 = (List) map2.get(it);
        if (list2 != null) {
            listC.addAll(list2);
        }
        List list3 = (List) map3.get(it);
        if (list3 != null) {
            listC.addAll(list3);
        }
        J j10 = J.f24997a;
        return z.a(it, sVar.G(AbstractC3689v.a(listC)));
    }

    private static final void y(N n10, W7.e eVar) {
        if (eVar == null || ((W7.e) n10.f51689a).compareTo(eVar) <= 0) {
            return;
        }
        n10.f51689a = eVar;
    }

    private final List z(C6316q c6316q, boolean z10) {
        S8.d dVarD;
        S8.c cVarC;
        List listC = AbstractC3689v.c();
        if (!z10 && c6316q != null && (cVarC = c6316q.c()) != null) {
            listC.add(new C3806O.b(C3806O.b.a.BAND, Ne.h.c(cVarC), A(cVarC)));
        }
        if (c6316q != null && (dVarD = c6316q.d()) != null) {
            listC.add(new C3806O.b(C3806O.b.a.CHANNEL_WIDTH, Ne.i.a(dVarD), C(c6316q.c(), dVarD)));
        }
        return AbstractC3689v.a(listC);
    }

    @Override // D8.j
    public AbstractC5912b a(String id2) {
        AbstractC6492s.i(id2, "id");
        int iHashCode = id2.hashCode();
        if (iHashCode != -1221262756) {
            if (iHashCode != 3016245) {
                if (iHashCode == 108270587 && id2.equals("radio")) {
                    return K().a(new InterfaceC6084a.b.A(AbstractC5460b.AbstractC1746b.c.f46392b));
                }
            } else if (id2.equals("band")) {
                return K().a(new InterfaceC6084a.b.A(AbstractC5460b.AbstractC1746b.d.f46393b));
            }
        } else if (id2.equals("health")) {
            return K().a(new InterfaceC6084a.b.A(AbstractC5460b.AbstractC1746b.a.f46390b));
        }
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.h(abstractC5912bM, "complete(...)");
        return abstractC5912bM;
    }

    @Override // D8.j
    public gg.i b() {
        return this.f3046g;
    }

    @Override // D8.j.b
    public gg.i c() {
        return this.f3045f;
    }

    @Override // D8.j.b
    public AbstractC5912b d(S8.c band) {
        AbstractC6492s.i(band, "band");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new d(band));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // D8.j.b
    public AbstractC5912b e() {
        return K().a(new InterfaceC6084a.b.A(AbstractC5460b.AbstractC1746b.C1747b.f46391b));
    }
}
