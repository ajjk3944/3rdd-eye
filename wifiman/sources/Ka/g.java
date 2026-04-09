package Ka;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import Ii.N;
import Ka.f;
import Li.InterfaceC3220g;
import Yg.J;
import Yg.m;
import Yg.n;
import Yg.v;
import com.ui.speedtest.UiSpeedtestLib;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import speedtest.HttpServerApiFactory;
import speedtest.HttpServerApiParams;
import speedtest.HttpSpeedtestParamsInternet;
import speedtest.HttpSpeedtestParamsLocal;
import speedtest.HttpSpeedtestServerApi;
import speedtest.SpeedServerHandshakeResult;
import speedtest.SpeedtestApplicationInfo;
import speedtest.SpeedtestError;
import speedtest.SpeedtestParams;
import speedtest.Speedtest_;

/* loaded from: classes3.dex */
public final class g implements f.a {

    /* renamed from: a, reason: collision with root package name */
    private final SpeedtestApplicationInfo f10565a;

    /* renamed from: b, reason: collision with root package name */
    private final m f10566b;

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f10567a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10569c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f10569c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return g.this.new a(this.f10569c, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                eh.AbstractC5467b.g()
                int r0 = r8.f10567a
                if (r0 != 0) goto L7c
                Yg.v.b(r9)
                Ka.g r9 = Ka.g.this
                speedtest.HttpSpeedtestServerApi r9 = Ka.g.g(r9)
                speedtest.SpeedtestServerEvaluationParams r0 = new speedtest.SpeedtestServerEvaluationParams
                r0.<init>()
                java.lang.String r1 = r8.f10569c
                r0.setUrl(r1)
                speedtest.SpeedtestServerEvaluation r9 = r9.evaluate(r0)
                java.lang.String r1 = r8.f10569c
                speedtest.SpeedtestError r0 = r9.getErr()
                if (r0 == 0) goto L34
                java.lang.String r2 = "err"
                kotlin.jvm.internal.AbstractC6492s.h(r0, r2)
                com.ui.speedtest.UiSpeedtestLib$Error r0 = com.ui.speedtest.a.a(r0)
                if (r0 != 0) goto L33
                goto L34
            L33:
                throw r0
            L34:
                java.lang.String r0 = r9.getVersion()
                r2 = 0
                if (r0 == 0) goto L49
                java.lang.String r3 = "version"
                kotlin.jvm.internal.AbstractC6492s.h(r0, r3)
                boolean r3 = kotlin.text.t.m0(r0)
                if (r3 != 0) goto L49
                r3 = r0
                goto L4a
            L49:
                r3 = r2
            L4a:
                speedtest.Duration r0 = r9.getLatency()
                if (r0 == 0) goto L5a
                long r4 = r0.getMs()
                java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.e(r4)
                r4 = r0
                goto L5b
            L5a:
                r4 = r2
            L5b:
                speedtest.Duration r0 = r9.getJitter()
                if (r0 == 0) goto L6b
                long r5 = r0.getMs()
                java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.e(r5)
                r5 = r0
                goto L6c
            L6b:
                r5 = r2
            L6c:
                boolean r9 = r9.getPacketLoss()
                La.e r7 = new La.e
                r6 = 0
                r0 = r7
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
            L7c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Ka.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10570a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f10571b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, g gVar) {
            super(0);
            this.f10570a = str;
            this.f10571b = gVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HttpSpeedtestServerApi invoke() {
            HttpServerApiParams httpServerApiParams = new HttpServerApiParams();
            String str = this.f10570a;
            g gVar = this.f10571b;
            if (str != null) {
                httpServerApiParams.setToken(str);
            }
            httpServerApiParams.setAppInfo(gVar.f10565a);
            return new HttpServerApiFactory().newApi(httpServerApiParams);
        }
    }

    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f10572a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10574c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f10574c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return g.this.new c(this.f10574c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f10572a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            SpeedServerHandshakeResult speedServerHandshakeResultServerHandshake = g.this.i().serverHandshake(this.f10574c);
            SpeedtestError error = speedServerHandshakeResultServerHandshake.getError();
            if (error != null) {
                AbstractC6492s.h(error, "error");
                UiSpeedtestLib.Error errorA = com.ui.speedtest.a.a(error);
                if (errorA != null) {
                    throw errorA;
                }
            }
            return new f.b(speedServerHandshakeResultServerHandshake.getVersion());
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.c f10576b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f.c cVar) {
            super(0);
            this.f10576b = cVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest_ invoke() {
            Speedtest_ speedtest_TestDownload = g.this.i().testDownload(g.this.h(this.f10576b));
            AbstractC6492s.h(speedtest_TestDownload, "goApi.testDownload(params.asGoTestParams())");
            return speedtest_TestDownload;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.c f10578b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f.c cVar) {
            super(0);
            this.f10578b = cVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest_ invoke() {
            Speedtest_ speedtest_TestUpload = g.this.i().testUpload(g.this.h(this.f10578b));
            AbstractC6492s.h(speedtest_TestUpload, "goApi.testUpload(params.asGoTestParams())");
            return speedtest_TestUpload;
        }
    }

    public g(String str, La.c clientApp) {
        AbstractC6492s.i(clientApp, "clientApp");
        this.f10565a = La.d.a(clientApp);
        this.f10566b = n.b(new b(str, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpeedtestParams h(f.c cVar) {
        if (cVar instanceof f.c.a) {
            HttpSpeedtestParamsInternet httpSpeedtestParamsInternet = new HttpSpeedtestParamsInternet();
            for (f.c.a.C0423a c0423a : ((f.c.a) cVar).a()) {
                httpSpeedtestParamsInternet.addServer(c0423a.b(), c0423a.a(), c0423a.c());
            }
            return httpSpeedtestParamsInternet;
        }
        if (!(cVar instanceof f.c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        HttpSpeedtestParamsLocal httpSpeedtestParamsLocal = new HttpSpeedtestParamsLocal();
        f.c.b bVar = (f.c.b) cVar;
        httpSpeedtestParamsLocal.setInfinite(bVar.a());
        httpSpeedtestParamsLocal.addServer(bVar.b(), bVar.d(), bVar.c(), bVar.e());
        return httpSpeedtestParamsLocal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpSpeedtestServerApi i() {
        Object value = this.f10566b.getValue();
        AbstractC6492s.h(value, "<get-goApi>(...)");
        return (HttpSpeedtestServerApi) value;
    }

    @Override // Ka.a
    public Object b(String str, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(C3048c0.b(), new a(str, null), interfaceC5380e);
    }

    @Override // Ka.f.a
    public Object c(String str, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(C3048c0.b(), new c(str, null), interfaceC5380e);
    }

    @Override // Ka.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public InterfaceC3220g a(f.c params) {
        AbstractC6492s.i(params, "params");
        return Ka.e.a(new d(params));
    }

    @Override // Ka.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC3220g d(f.c params) {
        AbstractC6492s.i(params, "params");
        return Ka.e.a(new e(params));
    }
}
