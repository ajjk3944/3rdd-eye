package Ka;

import Ka.h;
import Li.InterfaceC3220g;
import Yg.m;
import Yg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import speedtest.Speedtest;
import speedtest.SpeedtestParams;
import speedtest.Speedtest_;
import speedtest.TcpSpeedTestParamsLocal;
import speedtest.TcpSpeedtestServerApi;
import speedtest.TcpSpeedtestServerApiFactory;
import speedtest.TcpSpeedtestServerApiParams;

/* loaded from: classes3.dex */
public final class i implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private final m f10584a = n.b(a.f10585a);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10585a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TcpSpeedtestServerApi invoke() {
            return new TcpSpeedtestServerApiFactory().newApi(new TcpSpeedtestServerApiParams());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.b f10587b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h.b bVar) {
            super(0);
            this.f10587b = bVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest_ invoke() {
            Speedtest_ speedtest_TestDownload = i.this.h().testDownload(i.this.g(this.f10587b));
            AbstractC6492s.h(speedtest_TestDownload, "goApi.testDownload(params.asApiParams())");
            return speedtest_TestDownload;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.b f10589b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h.b bVar) {
            super(0);
            this.f10589b = bVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest_ invoke() {
            Speedtest_ speedtest_TestUpload = i.this.h().testUpload(i.this.g(this.f10589b));
            AbstractC6492s.h(speedtest_TestUpload, "goApi.testUpload(params.asApiParams())");
            return speedtest_TestUpload;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpeedtestParams g(h.b bVar) {
        TcpSpeedTestParamsLocal tcpSpeedTestParamsLocalNewTcpSpeedtestParams = Speedtest.newTcpSpeedtestParams(bVar.b(), bVar.d(), bVar.c(), bVar.a());
        AbstractC6492s.h(tcpSpeedTestParamsLocalNewTcpSpeedtestParams, "newTcpSpeedtestParams(ho…encyMs, durationInfinite)");
        return tcpSpeedTestParamsLocalNewTcpSpeedtestParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TcpSpeedtestServerApi h() {
        Object value = this.f10584a.getValue();
        AbstractC6492s.h(value, "<get-goApi>(...)");
        return (TcpSpeedtestServerApi) value;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    @Override // Ka.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r11, dh.InterfaceC5380e r12) {
        /*
            r10 = this;
            speedtest.TcpSpeedtestServerApi r12 = r10.h()
            speedtest.SpeedtestServerEvaluationParams r0 = new speedtest.SpeedtestServerEvaluationParams
            r0.<init>()
            r0.setUrl(r11)
            speedtest.SpeedtestServerEvaluation r12 = r12.evaluate(r0)
            speedtest.SpeedtestError r0 = r12.getErr()
            if (r0 == 0) goto L24
            java.lang.String r1 = "err"
            kotlin.jvm.internal.AbstractC6492s.h(r0, r1)
            com.ui.speedtest.UiSpeedtestLib$Error r0 = com.ui.speedtest.a.a(r0)
            if (r0 != 0) goto L23
            goto L24
        L23:
            throw r0
        L24:
            java.lang.String r0 = r12.getVersion()
            r1 = 0
            if (r0 == 0) goto L39
            java.lang.String r2 = "version"
            kotlin.jvm.internal.AbstractC6492s.h(r0, r2)
            boolean r2 = kotlin.text.t.m0(r0)
            if (r2 != 0) goto L39
            r5 = r0
            goto L3a
        L39:
            r5 = r1
        L3a:
            speedtest.Duration r0 = r12.getLatency()
            if (r0 == 0) goto L4a
            long r2 = r0.getMs()
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.e(r2)
            r6 = r0
            goto L4b
        L4a:
            r6 = r1
        L4b:
            speedtest.Duration r0 = r12.getJitter()
            if (r0 == 0) goto L59
            long r0 = r0.getMs()
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.b.e(r0)
        L59:
            r7 = r1
            boolean r8 = r12.getPacketLoss()
            La.e r12 = new La.e
            r9 = 0
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Ka.i.b(java.lang.String, dh.e):java.lang.Object");
    }

    @Override // Ka.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC3220g a(h.b params) {
        AbstractC6492s.i(params, "params");
        return e.a(new b(params));
    }

    @Override // Ka.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public InterfaceC3220g d(h.b params) {
        AbstractC6492s.i(params, "params");
        return e.a(new c(params));
    }
}
