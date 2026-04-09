package J7;

import J7.m;
import J7.n;
import Yg.J;
import com.squareup.moshi.JsonDataException;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudError;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequest;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestPayloadTokenRequest;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseError;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseTokenFetch;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo;
import com.ubnt.teleport.unifi.token.GoTokenSecurity;
import gg.InterfaceC5910A;
import hg.InterfaceC6043c;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class F extends n implements TeleportCloud {

    /* renamed from: i, reason: collision with root package name */
    public static final a f9796i = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private final M7.b f9797h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9800c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TeleportCloud.e.b f9801d;

        public static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f9802a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N f9803b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f9804c;

            /* renamed from: J7.F$b$a$a, reason: collision with other inner class name */
            public static final class C0391a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ n f9805a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0391a(n nVar) {
                    super(1);
                    this.f9805a = nVar;
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Mj.w it) throws TeleportCloud.Error.InvalidResponse, TeleportCloud.Error.CloudError.Unauthenticated, TeleportCloud.Error.ApiError, TeleportCloud.Error.CloudError.TeleportDisabled, TeleportCloud.Error.CloudError.SiteGatewayNotFound, TeleportCloud.Error.CloudError.ClientInvalid {
                    Object objC;
                    Object next;
                    n nVar = this.f9805a;
                    AbstractC6492s.h(it, "it");
                    String message = null;
                    if (it.f()) {
                        objC = it.a();
                    } else {
                        ResponseBody responseBodyD = it.d();
                        String strC = responseBodyD != null ? responseBodyD.C() : null;
                        AbstractC6492s.f(strC);
                        if (kotlin.text.t.m0(strC)) {
                            throw new TeleportCloud.Error.ApiError(it.b(), null, 2, null);
                        }
                        try {
                            try {
                                objC = nVar.f9879e.c(strC);
                            } catch (JsonDataException unused) {
                                objC = nVar.f9880f.c(strC);
                            }
                        } catch (JsonDataException unused2) {
                            throw new TeleportCloud.Error.ApiError(it.b(), null, 2, null);
                        }
                    }
                    int iB = it.b();
                    if (objC instanceof ApiTeleportCloudResponseTokenFetch) {
                        return objC;
                    }
                    if (!(objC instanceof ApiTeleportCloudError)) {
                        if (objC instanceof ApiTeleportCloudResponseError.TeleportDisabled) {
                            throw TeleportCloud.Error.CloudError.TeleportDisabled.f39454a;
                        }
                        if (objC instanceof ApiTeleportCloudResponseTokenFetch.Error.TokenNotFound ? true : objC instanceof ApiTeleportCloudResponseTokenFetch.Error.TokenExpired) {
                            throw TeleportCloud.Error.CloudError.Unauthenticated.f39456a;
                        }
                        if (objC instanceof ApiTeleportCloudResponseError.ClientNotFound) {
                            throw TeleportCloud.Error.CloudError.ClientInvalid.f39450a;
                        }
                        if (objC instanceof ApiTeleportCloudResponseError.SiteGatewayNotFound) {
                            throw TeleportCloud.Error.CloudError.SiteGatewayNotFound.f39452a;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid response - ");
                        sb2.append(objC != null ? objC.getClass().getSimpleName() : null);
                        throw new TeleportCloud.Error.InvalidResponse(sb2.toString(), null, 2, null);
                    }
                    if (iB == 401 || iB == 404) {
                        throw TeleportCloud.Error.CloudError.Unauthenticated.f39456a;
                    }
                    ApiTeleportCloudError apiTeleportCloudError = (ApiTeleportCloudError) objC;
                    if (AbstractC6492s.d(apiTeleportCloudError.getReason(), "Valid token is required.")) {
                        throw TeleportCloud.Error.CloudError.Unauthenticated.f39456a;
                    }
                    int iB2 = it.b();
                    String reason = apiTeleportCloudError.getReason();
                    if (reason == null && (reason = apiTeleportCloudError.getException()) == null) {
                        List errors = apiTeleportCloudError.getErrors();
                        if (errors != null) {
                            Iterator it2 = errors.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (((ApiTeleportCloudError.Error) next).getMessage() != null) {
                                    break;
                                }
                            }
                            ApiTeleportCloudError.Error error = (ApiTeleportCloudError.Error) next;
                            if (error != null) {
                                message = error.getMessage();
                            }
                        }
                    } else {
                        message = reason;
                    }
                    throw new TeleportCloud.Error.ApiError(iB2, message);
                }
            }

            /* renamed from: J7.F$b$a$b, reason: collision with other inner class name */
            public static final class C0392b extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ N f9806a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ long f9807b;

                /* renamed from: J7.F$b$a$b$a, reason: collision with other inner class name */
                public static final class C0393a extends AbstractC6494u implements InterfaceC6835l {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ N f9808a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ long f9809b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0393a(N n10, long j10) {
                        super(1);
                        this.f9808a = n10;
                        this.f9809b = j10;
                    }

                    @Override // mh.InterfaceC6835l
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Dj.a invoke(Throwable th2) {
                        this.f9808a.f51689a = th2;
                        if (!(th2 instanceof TeleportCloud.Error) && (th2 instanceof IOException)) {
                            return gg.i.d2(this.f9809b, TimeUnit.MILLISECONDS);
                        }
                        return gg.i.k0(th2);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0392b(N n10, long j10) {
                    super(1);
                    this.f9806a = n10;
                    this.f9807b = j10;
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a invoke(gg.i iVar) {
                    return iVar.p0(new n.e(new C0393a(this.f9806a, this.f9807b)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n nVar, N n10, long j10) {
                super(1);
                this.f9802a = nVar;
                this.f9803b = n10;
                this.f9804c = j10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D invoke(String requestId) {
                K7.a aVarJ = this.f9802a.j();
                AbstractC6492s.h(requestId, "requestId");
                return aVarJ.a(requestId).A(new n.e(new C0391a(this.f9802a))).L(new n.e(new C0392b(this.f9803b, this.f9804c)));
            }
        }

        /* renamed from: J7.F$b$b, reason: collision with other inner class name */
        public static final class C0394b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f9810a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ApiTeleportCloudRequest f9811b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0394b(N n10, ApiTeleportCloudRequest apiTeleportCloudRequest) {
                super(1);
                this.f9810a = n10;
                this.f9811b = apiTeleportCloudRequest;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D invoke(Throwable error) {
                Object obj;
                if ((error instanceof TimeoutException) && (obj = this.f9810a.f51689a) != null) {
                    AbstractC6492s.f(obj);
                    error = (Throwable) obj;
                }
                ApiTeleportCloudRequest apiTeleportCloudRequest = this.f9811b;
                if (error instanceof JsonDataException) {
                    return gg.z.p(new TeleportCloud.Error.InvalidResponse("Invalid JSON content", error));
                }
                if (error instanceof TimeoutException) {
                    return gg.z.p(new TeleportCloud.Error.CommunicationError.ResponseTimeout("Cloud fetch " + apiTeleportCloudRequest.getPayload().getClass().getSimpleName() + " timed out"));
                }
                if (!(error instanceof TeleportCloud.Error) && (error instanceof IOException)) {
                    AbstractC6492s.h(error, "error");
                    return gg.z.p(new TeleportCloud.Error.CommunicationError.NetworkError((IOException) error));
                }
                return gg.z.p(error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, TeleportCloud.e.b bVar) {
            super(1);
            this.f9799b = str;
            this.f9800c = str2;
            this.f9801d = bVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D invoke(String token) {
            F f10 = F.this;
            AbstractC6492s.h(token, "token");
            ApiTeleportCloudRequest apiTeleportCloudRequest = new ApiTeleportCloudRequest(token, new ApiTeleportCloudRequestPayloadTokenRequest(this.f9799b, this.f9800c, this.f9801d.a()));
            N n10 = new N();
            gg.z zVarO = f10.j().c(apiTeleportCloudRequest).A(new n.e(new o(f10))).o(new n.d(new p(f10))).A(new n.e(q.f9887a)).s(new n.e(new a(f10, n10, 200L))).Q(20000L, TimeUnit.MILLISECONDS).F(new n.e(new C0394b(n10, apiTeleportCloudRequest))).O(Gg.a.d());
            AbstractC6492s.h(zVarO, "protected inline fun <re…On(Schedulers.io())\n    }");
            return zVarO;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {
        c() {
            super(1);
        }

        public final void a(ApiTeleportCloudResponseTokenFetch it) throws TeleportCloud.Error.InvalidResponse {
            F f10 = F.this;
            AbstractC6492s.h(it, "it");
            f10.p(it);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws TeleportCloud.Error.InvalidResponse {
            a((ApiTeleportCloudResponseTokenFetch) obj);
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9813a = new d();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f9814a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "CLOUD - token request";
            }
        }

        d() {
            super(1);
        }

        public final void a(InterfaceC6043c interfaceC6043c) {
            N7.a.b(a.f9814a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6043c) obj);
            return J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f9815a = new e();

        e() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeleportCloud.e.a invoke(ApiTeleportCloudResponseTokenFetch apiTeleportCloudResponseTokenFetch) {
            String secret = apiTeleportCloudResponseTokenFetch.getSecret();
            if (secret == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String token = apiTeleportCloudResponseTokenFetch.getToken();
            if (token != null) {
                return new TeleportCloud.e.a(secret, token);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f9816a = new f();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportCloud.e.a f9817a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TeleportCloud.e.a aVar) {
                super(0);
                this.f9817a = aVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "CLOUD - token SUCCESS: " + this.f9817a;
            }
        }

        f() {
            super(1);
        }

        public final void a(TeleportCloud.e.a aVar) {
            N7.a.b(new a(aVar));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TeleportCloud.e.a) obj);
            return J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {
        g() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D invoke(String tokenString) {
            K7.a aVarJ = F.this.j();
            AbstractC6492s.h(tokenString, "tokenString");
            return aVarJ.b(tokenString);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {
        h() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ApiTeleportSiteInfo invoke(Mj.w it) throws TeleportCloud.Error.InvalidResponse, TeleportCloud.Error.CloudError.Unauthenticated, TeleportCloud.Error.ApiError, TeleportCloud.Error.CloudError.TeleportDisabled, TeleportCloud.Error.CloudError.SiteGatewayNotFound, TeleportCloud.Error.CloudError.ClientInvalid {
            Object objC;
            Object next;
            F f10 = F.this;
            AbstractC6492s.h(it, "it");
            String message = null;
            if (it.f()) {
                objC = it.a();
            } else {
                ResponseBody responseBodyD = it.d();
                String strC = responseBodyD != null ? responseBodyD.C() : null;
                AbstractC6492s.f(strC);
                if (kotlin.text.t.m0(strC)) {
                    throw new TeleportCloud.Error.ApiError(it.b(), null, 2, null);
                }
                try {
                    try {
                        objC = ((n) f10).f9879e.c(strC);
                    } catch (JsonDataException unused) {
                        objC = ((n) f10).f9880f.c(strC);
                    }
                } catch (JsonDataException unused2) {
                    throw new TeleportCloud.Error.ApiError(it.b(), null, 2, null);
                }
            }
            int iB = it.b();
            if (objC instanceof ApiTeleportSiteInfo) {
                return (ApiTeleportSiteInfo) objC;
            }
            if (!(objC instanceof ApiTeleportCloudError)) {
                if (objC instanceof ApiTeleportCloudResponseError.TeleportDisabled) {
                    throw TeleportCloud.Error.CloudError.TeleportDisabled.f39454a;
                }
                if (objC instanceof ApiTeleportCloudResponseTokenFetch.Error.TokenNotFound ? true : objC instanceof ApiTeleportCloudResponseTokenFetch.Error.TokenExpired) {
                    throw TeleportCloud.Error.CloudError.Unauthenticated.f39456a;
                }
                if (objC instanceof ApiTeleportCloudResponseError.ClientNotFound) {
                    throw TeleportCloud.Error.CloudError.ClientInvalid.f39450a;
                }
                if (objC instanceof ApiTeleportCloudResponseError.SiteGatewayNotFound) {
                    throw TeleportCloud.Error.CloudError.SiteGatewayNotFound.f39452a;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid response - ");
                sb2.append(objC != null ? objC.getClass().getSimpleName() : null);
                throw new TeleportCloud.Error.InvalidResponse(sb2.toString(), null, 2, null);
            }
            if (iB == 401 || iB == 404) {
                throw TeleportCloud.Error.CloudError.Unauthenticated.f39456a;
            }
            ApiTeleportCloudError apiTeleportCloudError = (ApiTeleportCloudError) objC;
            if (AbstractC6492s.d(apiTeleportCloudError.getReason(), "Valid token is required.")) {
                throw TeleportCloud.Error.CloudError.Unauthenticated.f39456a;
            }
            int iB2 = it.b();
            String reason = apiTeleportCloudError.getReason();
            if (reason == null && (reason = apiTeleportCloudError.getException()) == null) {
                List errors = apiTeleportCloudError.getErrors();
                if (errors != null) {
                    Iterator it2 = errors.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((ApiTeleportCloudError.Error) next).getMessage() != null) {
                            break;
                        }
                    }
                    ApiTeleportCloudError.Error error = (ApiTeleportCloudError.Error) next;
                    if (error != null) {
                        message = error.getMessage();
                    }
                }
            } else {
                message = reason;
            }
            throw new TeleportCloud.Error.ApiError(iB2, message);
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final i f9820a = new i();

        i() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeleportCloud.b invoke(ApiTeleportSiteInfo it) {
            m.a aVar = m.f9835j;
            AbstractC6492s.h(it, "it");
            return aVar.a(it);
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final j f9821a = new j();

        j() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D invoke(Throwable error) {
            if (!(error instanceof TeleportCloud.Error) && (error instanceof IOException)) {
                AbstractC6492s.h(error, "error");
                error = new TeleportCloud.Error.CommunicationError.NetworkError((IOException) error);
            }
            return gg.z.p(error);
        }
    }

    public static final class k implements gg.C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TeleportCloud.e f9822a;

        public k(TeleportCloud.e eVar) {
            this.f9822a = eVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(((TeleportCloud.e.a) this.f9822a).b());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(OkHttpClient sharedOkhttpClient, String url) {
        super(sharedOkhttpClient, url);
        AbstractC6492s.i(sharedOkhttpClient, "sharedOkhttpClient");
        AbstractC6492s.i(url, "url");
        this.f9797h = new GoTokenSecurity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeleportCloud.e.a C(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (TeleportCloud.e.a) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.D E(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.D) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiTeleportSiteInfo F(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (ApiTeleportSiteInfo) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeleportCloud.b G(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (TeleportCloud.b) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.D H(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.D) tmp0.invoke(obj);
    }

    private final gg.z I(TeleportCloud.e eVar) {
        if (eVar instanceof TeleportCloud.e.b) {
            return this.f9797h.a(eVar);
        }
        if (!(eVar instanceof TeleportCloud.e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        gg.z zVarI = gg.z.i(new k(eVar));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.D z(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.D) tmp0.invoke(obj);
    }

    @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud
    public gg.z b(TeleportCloud.e token) {
        AbstractC6492s.i(token, "token");
        gg.z zVarI = I(token);
        final g gVar = new g();
        gg.z zVarS = zVarI.s(new kg.n() { // from class: J7.B
            @Override // kg.n
            public final Object apply(Object obj) {
                return F.E(gVar, obj);
            }
        });
        final h hVar = new h();
        gg.z zVarA = zVarS.A(new kg.n() { // from class: J7.C
            @Override // kg.n
            public final Object apply(Object obj) {
                return F.F(hVar, obj);
            }
        });
        final i iVar = i.f9820a;
        gg.z zVarA2 = zVarA.A(new kg.n() { // from class: J7.D
            @Override // kg.n
            public final Object apply(Object obj) {
                return F.G(iVar, obj);
            }
        });
        final j jVar = j.f9821a;
        gg.z zVarO = zVarA2.F(new kg.n() { // from class: J7.E
            @Override // kg.n
            public final Object apply(Object obj) {
                return F.H(jVar, obj);
            }
        }).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "override fun getEndpoint…On(Schedulers.io())\n    }");
        return zVarO;
    }

    @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud
    public gg.z e(TeleportCloud.e.b secret, String clientId, String clientName) {
        AbstractC6492s.i(secret, "secret");
        AbstractC6492s.i(clientId, "clientId");
        AbstractC6492s.i(clientName, "clientName");
        gg.z zVarI = I(secret);
        final b bVar = new b(clientId, clientName, secret);
        gg.z zVarS = zVarI.s(new kg.n() { // from class: J7.w
            @Override // kg.n
            public final Object apply(Object obj) {
                return F.z(bVar, obj);
            }
        });
        final c cVar = new c();
        gg.z zVarO = zVarS.o(new InterfaceC6469f() { // from class: J7.x
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                F.A(cVar, obj);
            }
        });
        final d dVar = d.f9813a;
        gg.z zVarN = zVarO.n(new InterfaceC6469f() { // from class: J7.y
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                F.B(dVar, obj);
            }
        });
        final e eVar = e.f9815a;
        gg.z zVarA = zVarN.A(new kg.n() { // from class: J7.z
            @Override // kg.n
            public final Object apply(Object obj) {
                return F.C(eVar, obj);
            }
        });
        final f fVar = f.f9816a;
        gg.z zVarO2 = zVarA.o(new InterfaceC6469f() { // from class: J7.A
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                F.D(fVar, obj);
            }
        });
        AbstractC6492s.h(zVarO2, "override fun generateLon…SUCCESS: ${it}\" } }\n    }");
        return zVarO2;
    }
}
