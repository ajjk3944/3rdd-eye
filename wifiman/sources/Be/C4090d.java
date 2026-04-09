package be;

import Mj.x;
import be.InterfaceC4089c;
import ce.ApiNetworkWifimanDeviceInfo;
import ce.ApiNetworkWifimanSpeedtestFeedbackReport;
import ce.ApiNetworkWifimanSpeedtestReport;
import ce.ApiNetworkWifimanSpeedtestReportResult;
import ce.InterfaceC4244a;
import fd.InterfaceC5808b;
import gg.AbstractC5912b;
import gg.z;
import id.C6143b;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.OkHttpClient;

/* renamed from: be.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4090d implements InterfaceC4089c {

    /* renamed from: a, reason: collision with root package name */
    private final String f33119a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33120b;

    /* renamed from: c, reason: collision with root package name */
    private final com.ui.wifiman.model.support.a f33121c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5808b f33122d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4244a f33123e;

    /* renamed from: be.d$a */
    public static final class a implements InterfaceC4089c.a {

        /* renamed from: a, reason: collision with root package name */
        private final com.ui.wifiman.model.support.a f33124a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC5808b f33125b;

        public a(com.ui.wifiman.model.support.a supportFileDataCollector, InterfaceC5808b sharedOkHttpClientHolder) {
            AbstractC6492s.i(supportFileDataCollector, "supportFileDataCollector");
            AbstractC6492s.i(sharedOkHttpClientHolder, "sharedOkHttpClientHolder");
            this.f33124a = supportFileDataCollector;
            this.f33125b = sharedOkHttpClientHolder;
        }

        @Override // be.InterfaceC4089c.a
        public InterfaceC4089c a(InterfaceC4089c.b params) {
            AbstractC6492s.i(params, "params");
            this.f33124a.b(new com.ui.wifiman.model.support.e(params));
            return new C4090d(params.a(), params.b(), this.f33124a, this.f33125b);
        }
    }

    /* renamed from: be.d$b */
    static final class b implements InterfaceC6469f {
        b() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(ApiNetworkWifimanDeviceInfo it) {
            AbstractC6492s.i(it, "it");
            C4090d.this.f33121c.b(new com.ui.wifiman.model.support.c(it));
        }
    }

    /* renamed from: be.d$c */
    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
            C4090d.this.f33121c.b(new com.ui.wifiman.model.support.d(it));
        }
    }

    /* renamed from: be.d$d, reason: collision with other inner class name */
    static final class C1153d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1153d f33128a = new C1153d();

        C1153d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(ApiNetworkWifimanSpeedtestReportResult it) {
            AbstractC6492s.i(it, "it");
            return it.getResultId();
        }
    }

    public C4090d(String apiIP, int i10, com.ui.wifiman.model.support.a supportFileDataCollector, InterfaceC5808b sharedOkHttpClientHolder) throws SecurityException {
        AbstractC6492s.i(apiIP, "apiIP");
        AbstractC6492s.i(supportFileDataCollector, "supportFileDataCollector");
        AbstractC6492s.i(sharedOkHttpClientHolder, "sharedOkHttpClientHolder");
        this.f33119a = apiIP;
        this.f33120b = i10;
        this.f33121c = supportFileDataCollector;
        this.f33122d = sharedOkHttpClientHolder;
        Object objB = f().b(InterfaceC4244a.class);
        AbstractC6492s.h(objB, "create(...)");
        this.f33123e = (InterfaceC4244a) objB;
    }

    private final x f() throws NoSuchAlgorithmException, KeyManagementException {
        OkHttpClient.Builder builderE = this.f33122d.a().E();
        C6143b.f49144a.a(builderE);
        x xVarE = new x.b().c("https://" + this.f33119a + ":" + this.f33120b).g(builderE.c()).a(Nj.g.e()).b(Oj.a.f()).e();
        AbstractC6492s.h(xVarE, "build(...)");
        return xVarE;
    }

    @Override // be.InterfaceC4089c
    public z a() {
        z zVarO = this.f33123e.a().o(new b()).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        return zVarO;
    }

    @Override // be.InterfaceC4089c
    public z b() {
        z zVarO = this.f33123e.b().o(new c()).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        return zVarO;
    }

    @Override // be.InterfaceC4089c
    public z c(ApiNetworkWifimanSpeedtestReport result) {
        AbstractC6492s.i(result, "result");
        z zVarO = this.f33123e.c(result).A(C1153d.f33128a).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        return zVarO;
    }

    @Override // be.InterfaceC4089c
    public AbstractC5912b d(String resultId, ApiNetworkWifimanSpeedtestFeedbackReport feedback) {
        AbstractC6492s.i(resultId, "resultId");
        AbstractC6492s.i(feedback, "feedback");
        AbstractC5912b abstractC5912bW = this.f33123e.d(resultId, feedback).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }
}
