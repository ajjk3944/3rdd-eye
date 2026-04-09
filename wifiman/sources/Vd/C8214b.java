package vd;

import Cd.n;
import P7.c;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.advanced.b;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import com.ui.wifiman.model.speedtest.internet.f;
import com.ui.wifiman.model.speedtest.internet.g;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import qd.C7454d;
import vd.InterfaceC8213a;

/* renamed from: vd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8214b implements InterfaceC8213a {

    /* renamed from: a, reason: collision with root package name */
    private final P7.a f63549a;

    /* renamed from: vd.b$a */
    private static final class a extends RuntimeException {

        /* renamed from: a, reason: collision with root package name */
        private final String f63550a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f63551b;

        public a(String str, Throwable th2) {
            this.f63550a = str;
            this.f63551b = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f63551b;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f63550a;
        }
    }

    /* renamed from: vd.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C2255b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63552a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f63553b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f63554c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f63555d;

        static {
            int[] iArr = new int[f.b.values().length];
            try {
                iArr[f.b.SERVER_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.b.SERVER_EVALUATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.b.TOKEN_FETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.b.SERVER_WAKEUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.b.DOWNLOAD_INTERNET_SETUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.b.DOWNLOAD_INTERNET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.b.UPLOAD_INTERNET_SETUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f.b.UPLOAD_INTERNET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f.b.RESULT_SAVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[f.b.RESULT_REPORT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[f.b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[f.b.END.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f63552a = iArr;
            int[] iArr2 = new int[C7454d.b.values().length];
            try {
                iArr2[C7454d.b.EVALUATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[C7454d.b.DOWNLOAD_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[C7454d.b.DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[C7454d.b.UPLOAD_SETUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[C7454d.b.UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[C7454d.b.RESULT_SAVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[C7454d.b.RESULT_REPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[C7454d.b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[C7454d.b.END.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            f63553b = iArr2;
            int[] iArr3 = new int[n.b.values().length];
            try {
                iArr3[n.b.EVALUATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[n.b.DOWNLOAD_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[n.b.DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[n.b.UPLOAD_SETUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[n.b.UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[n.b.RESULT_SAVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[n.b.RESULT_REPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[n.b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[n.b.END.ordinal()] = 9;
            } catch (NoSuchFieldError unused30) {
            }
            f63554c = iArr3;
            int[] iArr4 = new int[b.EnumC1419b.values().length];
            try {
                iArr4[b.EnumC1419b.CONSOLE_LATENCY_CHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[b.EnumC1419b.CONSOLE_DOWNLOAD_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[b.EnumC1419b.CONSOLE_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr4[b.EnumC1419b.CONSOLE_UPLOAD_SETUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr4[b.EnumC1419b.CONSOLE_UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr4[b.EnumC1419b.EVALUATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr4[b.EnumC1419b.DOWNLOAD_SETUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr4[b.EnumC1419b.DOWNLOAD.ordinal()] = 8;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr4[b.EnumC1419b.UPLOAD_SETUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr4[b.EnumC1419b.UPLOAD.ordinal()] = 10;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr4[b.EnumC1419b.RESULT_SAVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr4[b.EnumC1419b.RESULT_REPORT.ordinal()] = 12;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr4[b.EnumC1419b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 13;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr4[b.EnumC1419b.END.ordinal()] = 14;
            } catch (NoSuchFieldError unused44) {
            }
            f63555d = iArr4;
        }
    }

    /* renamed from: vd.b$c */
    public static final class c implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Speedtest.d f63556a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8214b f63557b;

        public c(Speedtest.d dVar, C8214b c8214b) {
            this.f63556a = dVar;
            this.f63557b = c8214b;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            String strC;
            try {
                if (this.f63556a.b() != null) {
                    Speedtest.d dVar = this.f63556a;
                    if (dVar instanceof f) {
                        strC = this.f63557b.d(((f) dVar).l());
                    } else if (dVar instanceof C7454d) {
                        strC = this.f63557b.e(((C7454d) dVar).l());
                    } else if (dVar instanceof n) {
                        strC = this.f63557b.b(((n) dVar).l());
                    } else {
                        if (!(dVar instanceof com.ui.wifiman.model.speedtest.advanced.b)) {
                            throw new IllegalStateException("unknown speedtest state type");
                        }
                        strC = this.f63557b.c(((com.ui.wifiman.model.speedtest.advanced.b) dVar).r());
                    }
                    Z7.b.f(new a("Speedtest failed in step " + strC, this.f63556a.b()), null, 2, null);
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: vd.b$d */
    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f63558a = new d();

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof TimeoutException) {
                return;
            }
            Z7.b.e("Speedtest error process failed", it, null, 4, null);
        }
    }

    public C8214b(P7.a analytics) {
        AbstractC6492s.i(analytics, "analytics");
        this.f63549a = analytics;
    }

    private final boolean f(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof UnknownHostException);
    }

    @Override // vd.InterfaceC8213a
    public AbstractC5912b a(InterfaceC8213a.C2254a params) {
        AbstractC6492s.i(params, "params");
        AbstractC5912b abstractC5912bM = AbstractC5912b.J(g(params.a()), h(params.a())).W(Gg.a.d()).Y(params.b(), TimeUnit.MILLISECONDS).z(d.f63558a).M();
        AbstractC6492s.h(abstractC5912bM, "onErrorComplete(...)");
        return abstractC5912bM;
    }

    public final String b(n.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        switch (C2255b.f63554c[bVar.ordinal()]) {
            case 1:
                return "Evaluation";
            case 2:
                return "Download start delay";
            case 3:
                return "Test Download";
            case 4:
                return "Upload start delay";
            case 5:
                return "Test Upload";
            case 6:
                return "Result Save";
            case 7:
                return "Result Report";
            case 8:
                return "Result Update with report";
            case 9:
                return "End";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String c(b.EnumC1419b enumC1419b) {
        AbstractC6492s.i(enumC1419b, "<this>");
        switch (C2255b.f63555d[enumC1419b.ordinal()]) {
            case 1:
                return "Evaluation (Console)";
            case 2:
                return "Download start delay (Console)";
            case 3:
                return "Test Download (Console)";
            case 4:
                return "Upload start delay (Console)";
            case 5:
                return "Test Upload (Console)";
            case 6:
                return "Evaluation (Local)";
            case 7:
                return "Download start delay (Local)";
            case 8:
                return "Test Download (Local)";
            case 9:
                return "Upload start delay (Local)";
            case 10:
                return "Test Upload (Local)";
            case 11:
                return "Result Save";
            case 12:
                return "Result Report";
            case 13:
                return "Result Update with report";
            case 14:
                return "End";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String d(f.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        switch (C2255b.f63552a[bVar.ordinal()]) {
            case 1:
                return "Server Fetch";
            case 2:
                return "Server Evaluation";
            case 3:
                return "Token Fetch";
            case 4:
                return "Server Wakeup";
            case 5:
                return "Download start delay";
            case 6:
                return "Test Download";
            case 7:
                return "Upload start delay";
            case 8:
                return "Test Upload";
            case 9:
                return "Result Save";
            case 10:
                return "Result Report";
            case 11:
                return "Result Update with report";
            case 12:
                return "End";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String e(C7454d.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        switch (C2255b.f63553b[bVar.ordinal()]) {
            case 1:
                return "Evaluation";
            case 2:
                return "Download start delay";
            case 3:
                return "Test Download";
            case 4:
                return "Upload start delay";
            case 5:
                return "Test Upload";
            case 6:
                return "Result Save";
            case 7:
                return "Result Report";
            case 8:
                return "Result Update with report";
            case 9:
                return "End";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final AbstractC5912b g(Speedtest.d speedtestState) {
        AbstractC6492s.i(speedtestState, "speedtestState");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new c(speedtestState, this));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    public final AbstractC5912b h(Speedtest.d speedtestState) {
        String message;
        String message2;
        AbstractC6492s.i(speedtestState, "speedtestState");
        if (speedtestState.b() == null || f(speedtestState.b())) {
            AbstractC5912b abstractC5912bM = AbstractC5912b.m();
            AbstractC6492s.f(abstractC5912bM);
            return abstractC5912bM;
        }
        String str = "UNKNOWN ERROR MESSAGE";
        if (speedtestState instanceof f) {
            P7.a aVar = this.f63549a;
            f fVar = (f) speedtestState;
            String strD = d(fVar.l());
            Speedtest.Error errorB = fVar.b();
            String simpleName = errorB != null ? errorB.getClass().getSimpleName() : null;
            Speedtest.Error errorB2 = fVar.b();
            if (errorB2 != null && (message2 = errorB2.getMessage()) != null) {
                str = message2;
            }
            String str2 = simpleName + " - " + str;
            InternetSpeedtest.b bVarA = g.a(fVar);
            return aVar.d(new c.i(strD, str2, bVarA != null ? bVarA.d() : null));
        }
        if (!(speedtestState instanceof C7454d)) {
            if (speedtestState instanceof n) {
                AbstractC5912b abstractC5912bM2 = AbstractC5912b.m();
                AbstractC6492s.f(abstractC5912bM2);
                return abstractC5912bM2;
            }
            if (!(speedtestState instanceof com.ui.wifiman.model.speedtest.advanced.b)) {
                throw new IllegalStateException("unknown speedtest state type");
            }
            AbstractC5912b abstractC5912bM3 = AbstractC5912b.m();
            AbstractC6492s.f(abstractC5912bM3);
            return abstractC5912bM3;
        }
        P7.a aVar2 = this.f63549a;
        C7454d c7454d = (C7454d) speedtestState;
        String strE = e(c7454d.l());
        Speedtest.Error errorB3 = c7454d.b();
        String simpleName2 = errorB3 != null ? errorB3.getClass().getSimpleName() : null;
        Speedtest.Error errorB4 = c7454d.b();
        if (errorB4 != null && (message = errorB4.getMessage()) != null) {
            str = message;
        }
        return aVar2.d(new c.j(strE, simpleName2 + " - " + str, c7454d.o().a()));
    }
}
