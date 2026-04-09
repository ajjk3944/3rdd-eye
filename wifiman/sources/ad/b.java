package Ad;

import Ad.a;
import Ad.b;
import Zg.AbstractC3689v;
import be.InterfaceC4089c;
import be.InterfaceC4091e;
import ce.ApiNetworkWifimanSpeedtestFeedbackReport;
import com.ui.wifiman.model.speedtest.result.e;
import gg.AbstractC5912b;
import gg.f;
import gg.i;
import gg.r;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class b implements Ad.a {

    /* renamed from: a, reason: collision with root package name */
    private final e f619a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4091e f620b;

    /* renamed from: c, reason: collision with root package name */
    private final i f621c;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f622a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wifiman.model.speedtest.result.b bVar = (com.ui.wifiman.model.speedtest.result.b) c6556a.a();
            return bVar != null ? gg.n.o(bVar) : gg.n.h();
        }
    }

    /* renamed from: Ad.b$b, reason: collision with other inner class name */
    static final class C0022b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0022b f623a = new C0022b();

        C0022b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            return Boolean.valueOf(((InterfaceC4089c) c6556a.a()) != null);
        }
    }

    static final class c implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.b f625b;

        c(a.b bVar) {
            this.f625b = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f apply(com.ui.wifiman.model.speedtest.result.b result) {
            AbstractC6492s.i(result, "result");
            return AbstractC5912b.H(AbstractC3689v.e(b.this.e(this.f625b, result)));
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.b f627b;

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final a f628a = new a();

            a() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable it) {
                AbstractC6492s.i(it, "it");
                Z7.b.j("Unifi feedback report failed", it, null, 4, null);
            }
        }

        /* renamed from: Ad.b$d$b, reason: collision with other inner class name */
        public /* synthetic */ class C0023b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f629a;

            static {
                int[] iArr = new int[a.EnumC0020a.values().length];
                try {
                    iArr[a.EnumC0020a.DROPPED_CONNECTIVITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.EnumC0020a.POOR_LATENCY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.EnumC0020a.POOR_THROUGHPUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.EnumC0020a.NOT_AS_EXPECTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f629a = iArr;
            }
        }

        d(com.ui.wifiman.model.speedtest.result.b bVar, a.b bVar2) {
            this.f626a = bVar;
            this.f627b = bVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            Z7.b.h("Unifi feedback reported", null, 2, null);
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f apply(C6556a c6556a) {
            String str;
            AbstractC6492s.i(c6556a, "<destruct>");
            InterfaceC4089c interfaceC4089c = (InterfaceC4089c) c6556a.a();
            String str2 = null;
            if (interfaceC4089c == null || this.f626a.i() == null) {
                Z7.b.h("Skipping unifi feedback report since no unifi api available", null, 2, null);
                return AbstractC5912b.m();
            }
            String strI = this.f626a.i();
            String strA = this.f627b.a().a();
            a.EnumC0020a enumC0020aB = this.f627b.a().b();
            if (enumC0020aB != null) {
                int i10 = C0023b.f629a[enumC0020aB.ordinal()];
                if (i10 == 1) {
                    str = "DROPPED_CONNECTIVITY";
                } else if (i10 == 2) {
                    str = "POOR_LATENCY";
                } else if (i10 == 3) {
                    str = "POOR_THROUGHPUT";
                } else {
                    if (i10 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "NOT_AS_EXPECTED";
                }
                str2 = str;
            }
            return interfaceC4089c.d(strI, new ApiNetworkWifimanSpeedtestFeedbackReport(strA, str2)).x(new InterfaceC6464a() { // from class: Ad.c
                @Override // kg.InterfaceC6464a
                public final void run() {
                    b.d.c();
                }
            }).z(a.f628a);
        }
    }

    public b(e speedtestResultManager, InterfaceC4091e unifiApiManager) {
        AbstractC6492s.i(speedtestResultManager, "speedtestResultManager");
        AbstractC6492s.i(unifiApiManager, "unifiApiManager");
        this.f619a = speedtestResultManager;
        this.f620b = unifiApiManager;
        i iVarI2 = unifiApiManager.c().N0(C0022b.f623a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f621c = iVarI2;
    }

    private final gg.n d(long j10) {
        gg.n nVarU = this.f619a.f(j10).o0().u(a.f622a);
        AbstractC6492s.h(nVarU, "flatMapMaybe(...)");
        return nVarU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b e(a.b bVar, com.ui.wifiman.model.speedtest.result.b bVar2) {
        if (bVar.a() != null) {
            AbstractC5912b abstractC5912bT = this.f620b.c().o0().t(new d(bVar2, bVar));
            AbstractC6492s.f(abstractC5912bT);
            return abstractC5912bT;
        }
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.f(abstractC5912bM);
        return abstractC5912bM;
    }

    @Override // Ad.a
    public AbstractC5912b a(a.b params) {
        AbstractC6492s.i(params, "params");
        AbstractC5912b abstractC5912bK = d(params.b()).k(new c(params));
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        return abstractC5912bK;
    }

    @Override // Ad.a
    public i b() {
        return this.f621c;
    }
}
