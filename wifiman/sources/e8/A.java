package E8;

import E8.A;
import L0.C3174d;
import Li.N;
import P7.c;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import Zg.AbstractC3689v;
import android.content.Context;
import b8.AbstractC4075b;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import com.ui.wifiman.model.speedtest.result.b;
import com.ui.wifiman.model.ubiquiti.uisp.UispController;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import hf.C6031c;
import hf.t;
import i8.InterfaceC6084a;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import jf.AbstractC6321d;
import jf.AbstractC6325h;
import jf.C6322e;
import jf.C6323f;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import l9.C6556a;
import la.C6562a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import rc.InterfaceC7586b;
import rj.InterfaceC7810x2;
import xd.C8456g;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class A extends AbstractC6325h {

    /* renamed from: y, reason: collision with root package name */
    static final /* synthetic */ th.l[] f4046y = {O.h(new kotlin.jvm.internal.F(A.class, "applicationContext", "getApplicationContext()Landroid/content/Context;", 0)), O.h(new kotlin.jvm.internal.F(A.class, "resultManager", "getResultManager()Lcom/ui/wifiman/model/speedtest/result/SpeedtestResultManager;", 0)), O.h(new kotlin.jvm.internal.F(A.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), O.h(new kotlin.jvm.internal.F(A.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new kotlin.jvm.internal.F(A.class, "speedtestResultCloud", "getSpeedtestResultCloud()Lcom/ui/wifiman/model/speedtest/result/SpeedtestResult$Cloud;", 0)), O.h(new kotlin.jvm.internal.F(A.class, "speedtestSettings", "getSpeedtestSettings()Lcom/ui/wifiman/model/speedtest/settings/SpeedtestSettingsManager;", 0)), O.h(new kotlin.jvm.internal.F(A.class, "feedbackService", "getFeedbackService()Lcom/ui/wifiman/model/speedtest/feedback/SpeedtestFeedbackService;", 0)), O.h(new kotlin.jvm.internal.F(A.class, "uispController", "getUispController()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;", 0)), O.h(new kotlin.jvm.internal.F(A.class, "uispReporter", "getUispReporter()Lcom/ui/wifiman/model/speedtest/common/report/service/UispSpeedtestResultReportService;", 0)), O.h(new kotlin.jvm.internal.F(A.class, "analytics", "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;", 0)), O.h(new kotlin.jvm.internal.F(A.class, "appReview", "getAppReview()Lcom/ui/wifiman/model/android/review/AppReviewOperator;", 0))};

    /* renamed from: z, reason: collision with root package name */
    public static final int f4047z = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f4048g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f4049h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f4050i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f4051j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f4052k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f4053l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f4054m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f4055n;

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f4056o;

    /* renamed from: p, reason: collision with root package name */
    private final Yg.m f4057p;

    /* renamed from: q, reason: collision with root package name */
    private final Yg.m f4058q;

    /* renamed from: r, reason: collision with root package name */
    private final Yg.m f4059r;

    /* renamed from: s, reason: collision with root package name */
    private final gg.i f4060s;

    /* renamed from: t, reason: collision with root package name */
    private final gg.i f4061t;

    /* renamed from: u, reason: collision with root package name */
    private final N f4062u;

    /* renamed from: v, reason: collision with root package name */
    private final N f4063v;

    /* renamed from: w, reason: collision with root package name */
    private final N f4064w;

    /* renamed from: x, reason: collision with root package name */
    private final N f4065x;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: E8.A$A, reason: collision with other inner class name */
    public static final class C0174A extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class B extends org.kodein.type.o<b.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C extends org.kodein.type.o<Dd.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class D extends org.kodein.type.o<Ad.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class E extends org.kodein.type.o<UispController> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class F extends org.kodein.type.o<C8456g> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SERVER_PROVIDER = new a("SERVER_PROVIDER", 0);

        private static final /* synthetic */ a[] $values() {
            return new a[]{SERVER_PROVIDER};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: E8.A$b, reason: case insensitive filesystem */
    public /* synthetic */ class C2648b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4066a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SERVER_PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4066a = iArr;
        }
    }

    /* renamed from: E8.A$c, reason: case insensitive filesystem */
    static final class C2649c implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final C2649c f4067a = new C2649c();

        C2649c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[EDGE_INSN: B:33:0x0055->B:19:0x0055 BREAK  A[LOOP:0: B:12:0x0039->B:35:?]] */
        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final l9.C6556a a(jf.C6323f r7, l9.C6556a r8, java.lang.Boolean r9) {
            /*
                r6 = this;
                java.lang.String r0 = "params"
                kotlin.jvm.internal.AbstractC6492s.i(r7, r0)
                java.lang.String r0 = "<destruct>"
                kotlin.jvm.internal.AbstractC6492s.i(r8, r0)
                java.lang.String r0 = "isFeedbackServiceAvailable"
                kotlin.jvm.internal.AbstractC6492s.i(r9, r0)
                java.lang.Object r8 = r8.a()
                com.ui.wifiman.model.speedtest.result.b r8 = (com.ui.wifiman.model.speedtest.result.b) r8
                boolean r0 = r7.b()
                r1 = 0
                r2 = 1
                if (r8 == 0) goto L55
                java.util.List r3 = r8.g()
                if (r3 == 0) goto L55
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                boolean r4 = r3 instanceof java.util.Collection
                if (r4 == 0) goto L35
                r4 = r3
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L35
                goto L55
            L35:
                java.util.Iterator r3 = r3.iterator()
            L39:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L55
                java.lang.Object r4 = r3.next()
                com.ui.wifiman.model.speedtest.result.b$c r4 = (com.ui.wifiman.model.speedtest.result.b.c) r4
                pd.s r4 = r4.g()
                pd.s r5 = pd.s.INTERNET
                if (r4 != r5) goto L39
                java.lang.String r8 = r8.c()
                if (r8 == 0) goto L55
                r8 = r2
                goto L56
            L55:
                r8 = r1
            L56:
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L63
                boolean r7 = r7.b()
                if (r7 == 0) goto L63
                r1 = r2
            L63:
                l9.a r7 = new l9.a
                if (r0 != 0) goto L6c
                if (r8 == 0) goto L6a
                goto L6c
            L6a:
                r8 = 0
                goto L72
            L6c:
                jf.c r9 = new jf.c
                r9.<init>(r0, r1, r8)
                r8 = r9
            L72:
                r7.<init>(r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: E8.A.C2649c.a(jf.f, l9.a, java.lang.Boolean):l9.a");
        }
    }

    /* renamed from: E8.A$d, reason: case insensitive filesystem */
    static final class C2650d implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final C2650d f4068a = new C2650d();

        C2650d() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a a(Boolean uispControllerApiAvailable, Dd.a settings, C6323f params) {
            AbstractC6492s.i(uispControllerApiAvailable, "uispControllerApiAvailable");
            AbstractC6492s.i(settings, "settings");
            AbstractC6492s.i(params, "params");
            return new C6556a((uispControllerApiAvailable.booleanValue() && params.b()) ? new C6322e(settings.d()) : null);
        }
    }

    /* renamed from: E8.A$e, reason: case insensitive filesystem */
    static final class C2651e implements kg.n {

        /* renamed from: E8.A$e$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4070a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.R(30L, TimeUnit.SECONDS);
            }
        }

        /* renamed from: E8.A$e$b */
        public static final class b implements gg.C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6556a f4071a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ A f4072b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Cc.j f4073c;

            public b(C6556a c6556a, A a10, Cc.j jVar) {
                this.f4071a = c6556a;
                this.f4072b = a10;
                this.f4073c = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x00b4 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0004, B:5:0x0019, B:7:0x0024, B:8:0x002e, B:10:0x0034, B:17:0x004a, B:18:0x0054, B:20:0x005a, B:25:0x006d, B:26:0x0077, B:28:0x007d, B:32:0x008e, B:33:0x009a, B:35:0x00a0, B:39:0x00b1, B:40:0x00b4, B:42:0x00c0, B:44:0x00c6, B:46:0x00e9, B:48:0x014d, B:49:0x0157, B:51:0x015d, B:55:0x016e, B:57:0x0172, B:59:0x017d, B:61:0x0185, B:64:0x0193, B:63:0x018b, B:47:0x0126, B:65:0x01a9), top: B:69:0x0004 }] */
            @Override // gg.C
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(gg.InterfaceC5910A r20) {
                /*
                    Method dump skipped, instructions count: 438
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: E8.A.C2651e.b.a(gg.A):void");
            }
        }

        C2651e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            gg.z zVarI = gg.z.i(new b((C6556a) sVar.a(), A.this, (Cc.j) sVar.c()));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI.K(a.f4070a);
        }
    }

    /* renamed from: E8.A$f, reason: case insensitive filesystem */
    static final class C2652f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2652f f4074a = new C2652f();

        C2652f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC6321d apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            return ((com.ui.wifiman.model.speedtest.result.b) c6556a.a()) != null ? AbstractC6321d.a.f50822a : AbstractC6321d.b.f50823a;
        }
    }

    static final class g implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S8.a f4075a;

        g(S8.a aVar) {
            this.f4075a = aVar;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(1762116337);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1762116337, i10, -1, "com.ubnt.usurvey.ui.speedtest.SpeedtestResultDetailVM.getDetails.<anonymous>.<anonymous> (SpeedtestResultDetailVM.kt:97)");
            }
            String str = Ne.b.c(this.f4075a, context) + " (" + S8.b.a(this.f4075a) + ")";
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

    static final class h implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f4076a;

        h(com.ui.wifiman.model.speedtest.result.b bVar) {
            this.f4076a = bVar;
        }

        public final CharSequence a(Context unused$var$, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(unused$var$, "$unused$var$");
            interfaceC3540l.U(1366938728);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1366938728, i10, -1, "com.ubnt.usurvey.ui.speedtest.SpeedtestResultDetailVM.getDetails.<anonymous>.<anonymous> (SpeedtestResultDetailVM.kt:108)");
            }
            C6031c c6031c = C6031c.f48649a;
            W7.b bVarE = this.f4076a.j().e();
            AbstractC6492s.f(bVarE);
            W7.a aVarB = bVarE.b();
            W7.b bVarE2 = this.f4076a.j().e();
            AbstractC6492s.f(bVarE2);
            C3174d c3174dE = c6031c.e(aVarB, false, bVarE2.c(), false, interfaceC3540l, C6031c.f48651c << 12, 10);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c3174dE;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class i implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.AbstractC1432b f4077a;

        i(b.AbstractC1432b abstractC1432b) {
            this.f4077a = abstractC1432b;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(810804353);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(810804353, i10, -1, "com.ubnt.usurvey.ui.speedtest.SpeedtestResultDetailVM.getDetails.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultDetailVM.kt:171)");
            }
            b.AbstractC1432b abstractC1432b = this.f4077a;
            C3174d.a aVar = new C3174d.a(0, 1, null);
            int iN = aVar.n(new L0.D(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                aVar.i(AbstractC3689v.z0(AbstractC3689v.q(((b.AbstractC1432b.AbstractC1433b.C1434b) abstractC1432b).e().getName(), ((b.AbstractC1432b.AbstractC1433b.C1434b) abstractC1432b).e().getServerCity(), ((b.AbstractC1432b.AbstractC1433b.C1434b) abstractC1432b).e().getServerCountry()), ", ", null, null, 0, null, null, 62, null));
                J j10 = J.f24997a;
                aVar.l(iN);
                b.AbstractC1432b.AbstractC1433b.C1434b c1434b = (b.AbstractC1432b.AbstractC1433b.C1434b) abstractC1432b;
                if (!c1434b.f().isEmpty()) {
                    aVar.i(" ");
                    String string = it.getString(R.string.speedtest_result_detail_test_server_secondary_server_count_format);
                    AbstractC6492s.h(string, "getString(...)");
                    String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(c1434b.f().size())}, 1));
                    AbstractC6492s.h(str, "format(...)");
                    aVar.i(str);
                }
                C3174d c3174dP = aVar.p();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return c3174dP;
            } catch (Throwable th2) {
                aVar.l(iN);
                throw th2;
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f4078a = new j();

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f4079a;

            public a(com.ui.wifiman.model.speedtest.result.b bVar) {
                this.f4079a = bVar;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    com.ui.wifiman.model.speedtest.result.b bVar = this.f4079a;
                    if (bVar != null) {
                        oVar.onSuccess(bVar);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new a((com.ui.wifiman.model.speedtest.result.b) c6556a.a()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class k implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4081a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean apply(Dd.a it) {
                AbstractC6492s.i(it, "it");
                return Boolean.valueOf(it.d());
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ A f4082a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f4083b;

            b(A a10, com.ui.wifiman.model.speedtest.result.b bVar) {
                this.f4082a = a10;
                this.f4083b = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c() {
                Z7.b.h("Speedtest result successfully reported to UISP", null, 2, null);
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Boolean reportEnabled) {
                AbstractC6492s.i(reportEnabled, "reportEnabled");
                if (!reportEnabled.booleanValue()) {
                    return AbstractC5912b.m();
                }
                C8456g c8456gX0 = this.f4082a.X0();
                com.ui.wifiman.model.speedtest.result.b bVar = this.f4083b;
                AbstractC6492s.f(bVar);
                return c8456gX0.e(bVar).y().x(new InterfaceC6464a() { // from class: E8.B
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        A.k.b.c();
                    }
                });
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ui.wifiman.model.speedtest.result.b result) {
            AbstractC6492s.i(result, "result");
            return A.this.V0().b().N0(a.f4081a).o0().t(new b(A.this, result));
        }
    }

    static final class l implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final l f4084a = new l();

        l() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            AbstractC6492s.i(error, "error");
            Z7.b.j("Failed to report speedtest result to UISP", error, null, 4, null);
        }
    }

    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f4085a = new m();

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f4086a;

            public a(com.ui.wifiman.model.speedtest.result.b bVar) {
                this.f4086a = bVar;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                b.AbstractC1432b.AbstractC1433b.C1434b c1434bB;
                b.AbstractC1432b.AbstractC1433b.C1434b.Provider providerE;
                try {
                    com.ui.wifiman.model.speedtest.result.b bVar = this.f4086a;
                    String url = null;
                    if (bVar != null && (c1434bB = E8.C.f4095a.b(bVar)) != null && (providerE = c1434bB.e()) != null) {
                        url = providerE.getUrl();
                    }
                    if (url != null) {
                        oVar.onSuccess(url);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new a((com.ui.wifiman.model.speedtest.result.b) c6556a.a()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class n implements kg.n {
        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(String url) {
            AbstractC6492s.i(url, "url");
            return AbstractC5912b.I(A.this.N0().d(new c.h.b()), A.this.Y0().a(new InterfaceC6084a.b.o(url)));
        }
    }

    static final class o implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final o f4088a = new o();

        o() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(C6323f it) {
            AbstractC6492s.i(it, "it");
            return it.b();
        }
    }

    static final class p implements kg.n {
        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6323f it) {
            AbstractC6492s.i(it, "it");
            return A.this.O0().a();
        }
    }

    static final class q implements kg.n {
        q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6323f params) {
            AbstractC6492s.i(params, "params");
            return AbstractC5912b.I(A.this.N0().d(new P7.e()), A.this.Y0().a(new InterfaceC6084a.b.B.AbstractC1814b.c(params.a())));
        }
    }

    static final class r implements kg.n {
        r() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6556a c6556a) {
            String strC;
            gg.z zVarA;
            gg.n nVarX;
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wifiman.model.speedtest.result.b bVar = (com.ui.wifiman.model.speedtest.result.b) c6556a.a();
            return (bVar == null || (strC = bVar.c()) == null || (zVarA = A.this.U0().a(strC)) == null || (nVarX = zVarA.X()) == null) ? gg.n.h() : nVarX;
        }
    }

    static final class s implements kg.n {
        s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(String shareLink) {
            AbstractC6492s.i(shareLink, "shareLink");
            AbstractC5912b abstractC5912bD = A.this.N0().d(new c.h.C0636c());
            InterfaceC6084a interfaceC6084aY0 = A.this.Y0();
            String string = A.this.P0().getString(R.string.speedtest_result_share_chooser_title);
            AbstractC6492s.h(string, "getString(...)");
            String string2 = A.this.P0().getString(R.string.speedtest_result_share_message_text);
            AbstractC6492s.h(string2, "getString(...)");
            String str = String.format(string2, Arrays.copyOf(new Object[]{shareLink}, 1));
            AbstractC6492s.h(str, "format(...)");
            return AbstractC5912b.I(abstractC5912bD, interfaceC6084aY0.a(new InterfaceC6084a.b.D.f(string, str)));
        }
    }

    static final class t implements kg.n {
        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6323f params) {
            AbstractC6492s.i(params, "params");
            return A.this.T0().f(params.a());
        }
    }

    public static final class u implements gg.k {
        public u() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(A.this.r0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class v extends org.kodein.type.o<P7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class w extends org.kodein.type.o<InterfaceC7586b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class x extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class y extends org.kodein.type.o<com.ui.wifiman.model.speedtest.result.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class z extends org.kodein.type.o<Cc.n> {
    }

    public A(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f4048g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new x().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, Context.class), null);
        th.l[] lVarArr = f4046y;
        this.f4049h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new y().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4050i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, com.ui.wifiman.model.speedtest.result.e.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new z().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4051j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, Cc.n.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new C0174A().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4052k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, InterfaceC6084a.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new B().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4053l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, b.a.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new C().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4054m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, Dd.b.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new D().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4055n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, Ad.a.class), null).a(this, lVarArr[6]);
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new E().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4056o = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE8, UispController.class), null).a(this, lVarArr[7]);
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new F().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4057p = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE9, C8456g.class), null).a(this, lVarArr[8]);
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new v().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4058q = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE10, P7.a.class), null).a(this, lVarArr[9]);
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new w().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f4059r = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE11, InterfaceC7586b.class), null).a(this, lVarArr[10]);
        gg.i iVarI2 = gg.i.N(new u(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f4060s = iVarI2;
        gg.i iVarW = iVarI2.I1(new t()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f4061t = iVarW;
        gg.i iVarN0 = iVarW.N0(C2652f.f4074a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f4062u = AbstractC8661g.d0(this, iVarN0, AbstractC6321d.b.f50823a, false, null, 6, null);
        gg.i iVarW2 = Ag.c.f753a.a(iVarW, R0().b()).I1(new C2651e()).e1().Y0(Gg.a.a(), false, 1).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f4063v = AbstractC8661g.h0(this, iVarW2, null, null, 2, null);
        gg.i iVarW3 = gg.i.u(W0().b(), V0().b(), iVarI2, C2650d.f4068a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f4064w = AbstractC8661g.h0(this, iVarW3, null, null, 2, null);
        gg.i iVarW4 = gg.i.u(iVarI2, iVarW, S0().b(), C2649c.f4067a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f4065x = AbstractC8661g.h0(this, iVarW4, null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t.b L0(b.c cVar) {
        return new t.b(E8.C.f4095a.e(cVar, m.c.NORMAL));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t.c M0(b.c cVar) {
        AbstractC4075b abstractC4075bA;
        W7.a aVarB;
        W7.a aVarB2;
        t.c.a aVar = t.c.a.COMPLETE;
        Integer numF = cVar.f();
        if (numF != null) {
            abstractC4075bA = AbstractC4075b.f33002a.a(numF.intValue());
        } else {
            abstractC4075bA = null;
        }
        Integer numE = cVar.e();
        Long lA = cVar.a();
        if (lA != null) {
            aVarB = W7.a.f23676b.b(lA.longValue());
        } else {
            aVarB = null;
        }
        Long lH = cVar.h();
        if (lH != null) {
            aVarB2 = W7.a.f23676b.b(lH.longValue());
        } else {
            aVarB2 = null;
        }
        return new t.c(aVar, abstractC4075bA, numE, aVarB, aVarB2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P7.a N0() {
        return (P7.a) this.f4058q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7586b O0() {
        return (InterfaceC7586b) this.f4059r.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context P0() {
        return (Context) this.f4049h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List Q0(com.ui.wifiman.model.speedtest.result.b r21) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E8.A.Q0(com.ui.wifiman.model.speedtest.result.b):java.util.List");
    }

    private final Cc.n R0() {
        return (Cc.n) this.f4051j.getValue();
    }

    private final Ad.a S0() {
        return (Ad.a) this.f4055n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wifiman.model.speedtest.result.e T0() {
        return (com.ui.wifiman.model.speedtest.result.e) this.f4050i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b.a U0() {
        return (b.a) this.f4053l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Dd.b V0() {
        return (Dd.b) this.f4054m.getValue();
    }

    private final UispController W0() {
        return (UispController) this.f4056o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C8456g X0() {
        return (C8456g) this.f4057p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a Y0() {
        return (InterfaceC6084a) this.f4052k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dd.a a1(boolean z10, Dd.a it) {
        AbstractC6492s.i(it, "it");
        return Dd.a.b(it, z10, false, 2, null);
    }

    @Override // androidx.lifecycle.N
    protected void W() {
        super.W();
        this.f4061t.o0().u(j.f4078a).k(new k()).W(Gg.a.d()).U(new InterfaceC6464a() { // from class: E8.z
            @Override // kg.InterfaceC6464a
            public final void run() {
                A.Z0();
            }
        }, l.f4084a);
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f4048g;
    }

    @Override // jf.AbstractC6325h
    public N n0() {
        return this.f4065x;
    }

    @Override // jf.AbstractC6325h
    public N o0() {
        return this.f4064w;
    }

    @Override // jf.AbstractC6325h
    public N p0() {
        return this.f4063v;
    }

    @Override // jf.AbstractC6325h
    public N q0() {
        return this.f4062u;
    }

    @Override // jf.AbstractC6325h
    public void s0(String id2) {
        AbstractC6492s.i(id2, "id");
        if (C2648b.f4066a[a.valueOf(id2).ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = this.f4061t.o0().u(m.f4085a).k(new n());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }

    @Override // jf.AbstractC6325h
    public void t0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(this.f4060s.o0().r(o.f4088a).k(new p()), Y0().a(InterfaceC6084a.b.n.f48939a));
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        c8658d.d(abstractC5912bP, this);
    }

    @Override // jf.AbstractC6325h
    public void u0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f4060s.o0().t(new q());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // jf.AbstractC6325h
    public void v0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = this.f4061t.o0().u(new r()).k(new s());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }

    @Override // jf.AbstractC6325h
    public void w0(final boolean z10) {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bI = AbstractC5912b.I(N0().d(new c.h.a()), V0().a(new InterfaceC6835l() { // from class: E8.y
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return A.a1(z10, (Dd.a) obj);
            }
        }));
        AbstractC6492s.h(abstractC5912bI, "mergeArray(...)");
        c8658d.d(abstractC5912bI, this);
    }
}
