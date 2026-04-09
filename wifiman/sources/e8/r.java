package E8;

import E8.r;
import Ee.C2706g;
import L0.C3174d;
import Li.N;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Wc.b;
import Zc.e;
import Zg.AbstractC3689v;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k8.AbstractC6404d;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import lf.k;
import md.C6796a;
import md.InterfaceC6797b;
import mf.AbstractC6818a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class r extends lf.l {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ th.l[] f4289p = {O.h(new kotlin.jvm.internal.F(r.class, "internetSpeedtestServerManager", "getInternetSpeedtestServerManager()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$ServerService;", 0)), O.h(new kotlin.jvm.internal.F(r.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new kotlin.jvm.internal.F(r.class, "settingsManager", "getSettingsManager()Lcom/ui/wifiman/model/settings/AppSettingsManager;", 0)), O.h(new kotlin.jvm.internal.F(r.class, "networkConnectionManager", "getNetworkConnectionManager()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0))};

    /* renamed from: q, reason: collision with root package name */
    public static final int f4290q = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f4291g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f4292h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f4293i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f4294j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f4295k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f4296l;

    /* renamed from: m, reason: collision with root package name */
    private final N f4297m;

    /* renamed from: n, reason: collision with root package name */
    private final NumberFormat f4298n;

    /* renamed from: o, reason: collision with root package name */
    private final N f4299o;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4300a;

        static {
            int[] iArr = new int[T7.c.values().length];
            try {
                iArr[T7.c.METRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T7.c.IMPERIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4300a = iArr;
        }
    }

    static final class b implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4301a = new b();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4302a;

            static {
                int[] iArr = new int[e.b.values().length];
                try {
                    iArr[e.b.DISCONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.b.CONNECTING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.b.AUTHENTICATING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.b.OBTAINING_IP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[e.b.CONNECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f4302a = iArr;
            }
        }

        b() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lf.k apply(Wc.b serversFetch, Zc.e networkConnection) {
            AbstractC6492s.i(serversFetch, "serversFetch");
            AbstractC6492s.i(networkConnection, "networkConnection");
            int i10 = a.f4302a[networkConnection.f().ordinal()];
            if (i10 == 1 || i10 == 2) {
                return k.b.C1945b.f52614a;
            }
            if (i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (serversFetch instanceof b.C0898b) {
                    return ((b.C0898b) serversFetch).b() != null ? k.a.f52612a : k.c.f52615a;
                }
                if (serversFetch instanceof b.a.C0896a) {
                    return k.b.a.f52613a;
                }
                if ((serversFetch instanceof b.c) || (serversFetch instanceof b.a.C0897b)) {
                    return k.a.f52612a;
                }
                throw new NoWhenBranchMatchedException();
            }
            return k.c.f52615a;
        }
    }

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6404d f4303a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f4304b;

        c(AbstractC6404d abstractC6404d, r rVar) {
            this.f4303a = abstractC6404d;
            this.f4304b = rVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double c(AbstractC6404d abstractC6404d, double d10) {
            long jRound;
            double d11 = 1000.0d;
            if (abstractC6404d.i() < 1000.0d) {
                d11 = 10.0d;
                jRound = Math.round(abstractC6404d.i() / 10.0d);
            } else {
                jRound = Math.round(abstractC6404d.i() / 1000.0d);
            }
            return jRound * d11;
        }

        public final CharSequence b(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(504737111);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(504737111, i10, -1, "com.ubnt.usurvey.ui.speedtest.SpeedtestInternetServerPickerVM.formattedDistanceText.<anonymous>.<anonymous> (SpeedtestInternetServerPickerVM.kt:144)");
            }
            AbstractC6404d abstractC6404d = this.f4303a;
            interfaceC3540l.U(-1305563118);
            boolean zT = interfaceC3540l.T(this.f4303a);
            final AbstractC6404d abstractC6404d2 = this.f4303a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: E8.s
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return Double.valueOf(r.c.c(abstractC6404d2, ((Double) obj).doubleValue()));
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            NumberFormat numberFormat = this.f4304b.f4298n;
            AbstractC6492s.h(numberFormat, "access$getNoFractionDigitsFormat$p(...)");
            String strC = AbstractC6404d.c(abstractC6404d, context, false, false, (InterfaceC6835l) objF, numberFormat, 6, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return strC;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return b((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(lf.k contentType) {
            AbstractC6492s.i(contentType, "contentType");
            if ((contentType instanceof k.c) || (contentType instanceof k.a) || (contentType instanceof k.b.a)) {
                return AbstractC5912b.m();
            }
            if (contentType instanceof k.b.C1945b) {
                return r.this.C0().a(InterfaceC6084a.b.D.g.f48903a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class e implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4307b;

        e(String str) {
            this.f4307b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Wc.b serversFetch) {
            InternetSpeedtest.c c1421c;
            AbstractC6492s.i(serversFetch, "serversFetch");
            InternetSpeedtest.d dVarZ0 = r.this.z0();
            List list = (List) serversFetch.b();
            Object obj = null;
            if (list != null) {
                String str = this.f4307b;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AbstractC6492s.d(((InternetSpeedtest.b) next).a(), str)) {
                        obj = next;
                        break;
                    }
                }
                obj = (InternetSpeedtest.b) obj;
            }
            if (obj == null) {
                c1421c = InternetSpeedtest.c.a.f42961a;
            } else if (obj instanceof InternetSpeedtest.b.a) {
                c1421c = new InternetSpeedtest.c.b((InternetSpeedtest.b.a) obj);
            } else {
                if (!(obj instanceof InternetSpeedtest.b.C1420b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c1421c = new InternetSpeedtest.c.C1421c((InternetSpeedtest.b.C1420b) obj);
            }
            return AbstractC5912b.p(dVarZ0.a(c1421c), r.this.C0().a(InterfaceC6084a.b.n.f48939a));
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f4308a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T7.c apply(C6796a it) {
            AbstractC6492s.i(it, "it");
            return it.g();
        }
    }

    static final class g implements kg.g {
        g() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2706g a(InternetSpeedtest.c serverSelection, Wc.b serversFetch, T7.c distanceUnitSystem) {
            AbstractC6492s.i(serverSelection, "serverSelection");
            AbstractC6492s.i(serversFetch, "serversFetch");
            AbstractC6492s.i(distanceUnitSystem, "distanceUnitSystem");
            ArrayList arrayList = new ArrayList();
            arrayList.add(r.this.x0(serverSelection instanceof InternetSpeedtest.c.a));
            List list = (List) serversFetch.b();
            if (list != null) {
                r rVar = r.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(rVar.D0((InternetSpeedtest.b) it.next(), distanceUnitSystem, serverSelection));
                }
            }
            return new C2706g(AbstractC3689v.e(new C2706g.a.C0194a("servers", null, null, arrayList, 6, null)));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<InternetSpeedtest.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends org.kodein.type.o<InterfaceC6797b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends org.kodein.type.o<Zc.f> {
    }

    static final class l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InternetSpeedtest.b f4310a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f4311b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T7.c f4312c;

        l(InternetSpeedtest.b bVar, r rVar, T7.c cVar) {
            this.f4310a = bVar;
            this.f4311b = rVar;
            this.f4312c = cVar;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(-1331676321);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1331676321, i10, -1, "com.ubnt.usurvey.ui.speedtest.SpeedtestInternetServerPickerVM.toServerItemModel.<anonymous> (SpeedtestInternetServerPickerVM.kt:89)");
            }
            InternetSpeedtest.b bVar = this.f4310a;
            r rVar = this.f4311b;
            T7.c cVar = this.f4312c;
            C3174d.a aVar = new C3174d.a(0, 1, null);
            InternetSpeedtest.b.C1420b c1420b = (InternetSpeedtest.b.C1420b) bVar;
            aVar.append(c1420b.h());
            aVar.i(", ");
            aVar.append(c1420b.i());
            Float fK = c1420b.k();
            interfaceC3540l.U(-1091766207);
            if (fK != null) {
                float fFloatValue = fK.floatValue();
                aVar.i(" - ");
                aVar.i(String.valueOf(rVar.y0(fFloatValue, cVar).a(context, interfaceC3540l, i10 & 14)));
            }
            interfaceC3540l.J();
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

    public r(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f4291g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InternetSpeedtest.d.class), null);
        th.l[] lVarArr = f4289p;
        this.f4292h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4293i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4294j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC6797b.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4295k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, Zc.f.class), null).a(this, lVarArr[3]);
        gg.i iVarI2 = gg.i.v(z0().b(), A0().getState(), b.f4301a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f4296l = iVarI2;
        this.f4297m = AbstractC8661g.d0(this, iVarI2, k.c.f52615a, false, null, 6, null);
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        numberFormat.setMinimumFractionDigits(0);
        numberFormat.setMaximumFractionDigits(0);
        this.f4298n = numberFormat;
        gg.i iVarU = gg.i.u(z0().d(), z0().b(), B0().b().N0(f.f4308a), new g());
        AbstractC6492s.h(iVarU, "combineLatest(...)");
        this.f4299o = AbstractC8661g.d0(this, iVarU, new C2706g(AbstractC3689v.l()), false, null, 6, null);
    }

    private final Zc.f A0() {
        return (Zc.f) this.f4295k.getValue();
    }

    private final InterfaceC6797b B0() {
        return (InterfaceC6797b) this.f4294j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a C0() {
        return (InterfaceC6084a) this.f4293i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC6818a.C1959a D0(InternetSpeedtest.b bVar, T7.c cVar, InternetSpeedtest.c cVar2) {
        boolean zD;
        if (cVar2 instanceof InternetSpeedtest.c.b) {
            zD = AbstractC6492s.d(((InternetSpeedtest.c.b) cVar2).a().a(), bVar.a());
        } else if (cVar2 instanceof InternetSpeedtest.c.C1421c) {
            zD = AbstractC6492s.d(((InternetSpeedtest.c.C1421c) cVar2).a().a(), bVar.a());
        } else {
            if (!(cVar2 instanceof InternetSpeedtest.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            zD = false;
        }
        boolean z10 = zD;
        if (!(bVar instanceof InternetSpeedtest.b.C1420b)) {
            if (!(bVar instanceof InternetSpeedtest.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            InternetSpeedtest.b.a aVar = (InternetSpeedtest.b.a) bVar;
            String strA = aVar.a();
            String strH = aVar.h();
            return new AbstractC6818a.C1959a(strA, strH != null ? new d.c(strH) : new d.c(""), new d.b(R.string.speedtest_server_picker_auto_isp_subtitle), true, z10);
        }
        InternetSpeedtest.b.C1420b c1420b = (InternetSpeedtest.b.C1420b) bVar;
        String strA2 = c1420b.a();
        String strC = c1420b.c();
        return new AbstractC6818a.C1959a(strA2, new d.c(strC != null ? strC : ""), new d.a(c1420b.h() + c1420b.i(), new l(bVar, this, cVar)), false, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC6818a.C1959a x0(boolean z10) {
        return new AbstractC6818a.C1959a("auto", new d.b(R.string.speedtest_server_picker_auto_title), new d.b(R.string.speedtest_server_picker_auto_subtitle), true, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s9.d y0(float f10, T7.c cVar) {
        int i10;
        AbstractC6404d abstractC6404dB = AbstractC6404d.f51302a.b(f10, cVar);
        if (abstractC6404dB.i() >= 10.0d) {
            return new d.a(String.valueOf(abstractC6404dB.i()), new c(abstractC6404dB, this));
        }
        int i11 = a.f4300a[cVar.ordinal()];
        if (i11 == 1) {
            i10 = R.string.speedtest_server_picker_less_than_10_km;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = R.string.speedtest_server_picker_less_than_10_mi;
        }
        return new d.b(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternetSpeedtest.d z0() {
        return (InternetSpeedtest.d) this.f4292h.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f4291g;
    }

    @Override // lf.l
    public N n0() {
        return this.f4297m;
    }

    @Override // lf.l
    public N o0() {
        return this.f4299o;
    }

    @Override // lf.l
    public void p0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f4296l.o0().t(new d());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // lf.l
    public void q0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = z0().b().o0().t(new e(id2));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }
}
