package J7;

import I7.C2997g;
import J7.n;
import Yg.J;
import Zg.AbstractC3689v;
import com.squareup.moshi.JsonDataException;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudClientInfo;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudError;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequest;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestPayloadConnection;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestPayloadIce;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseConnection;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseError;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseIce;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseTokenFetch;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo;
import hg.InterfaceC6043c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class m extends J7.n implements TeleportCloud.f {

    /* renamed from: j, reason: collision with root package name */
    public static final a f9835j = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private final String f9836h;

    /* renamed from: i, reason: collision with root package name */
    private final TeleportCloud.e.a f9837i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.ubnt.teleport.unifi.cloud.TeleportCloud.b a(com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo r17) {
            /*
                r16 = this;
                java.lang.String r0 = "<this>"
                r1 = r17
                kotlin.jvm.internal.AbstractC6492s.i(r1, r0)
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Reachability r0 = r17.getReachability()
                r2 = 0
                if (r0 == 0) goto L14
                java.lang.String r0 = r0.getDeviceId()
                r4 = r0
                goto L15
            L14:
                r4 = r2
            L15:
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Metadata r0 = r17.getMetadata()
                if (r0 == 0) goto L21
                java.lang.String r0 = r0.getSiteDeviceName()
                r5 = r0
                goto L22
            L21:
                r5 = r2
            L22:
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Metadata r0 = r17.getMetadata()
                if (r0 == 0) goto L2e
                java.lang.String r0 = r0.getSiteNetworkName()
                r6 = r0
                goto L2f
            L2e:
                r6 = r2
            L2f:
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Metadata r0 = r17.getMetadata()
                if (r0 == 0) goto L3b
                java.lang.String r0 = r0.getWanIP()
                r7 = r0
                goto L3c
            L3b:
                r7 = r2
            L3c:
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Metadata r0 = r17.getMetadata()
                if (r0 == 0) goto L4b
                java.lang.String r0 = r0.getImageIdUidb()
                if (r0 != 0) goto L49
                goto L4b
            L49:
                r8 = r0
                goto L5d
            L4b:
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Metadata r0 = r17.getMetadata()
                if (r0 == 0) goto L5c
                java.lang.Long r0 = r0.getImageId()
                if (r0 == 0) goto L5c
                java.lang.String r0 = r0.toString()
                goto L49
            L5c:
                r8 = r2
            L5d:
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Metadata r0 = r17.getMetadata()
                if (r0 == 0) goto L74
                java.lang.Long r0 = r0.getImageEngine()
                if (r0 == 0) goto L74
                long r9 = r0.longValue()
                int r0 = (int) r9
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r9 = r0
                goto L75
            L74:
                r9 = r2
            L75:
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Metadata r0 = r17.getMetadata()
                if (r0 == 0) goto L81
                java.lang.String r0 = r0.getSku()
                r10 = r0
                goto L82
            L81:
                r10 = r2
            L82:
                com.ubnt.teleport.unifi.cloud.TeleportCloud$b$b r11 = r17.d()
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Metadata r0 = r17.getMetadata()
                if (r0 == 0) goto Ld5
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Location r0 = r0.getLocation()
                if (r0 == 0) goto Ld5
                java.lang.String r3 = r0.getLatitude()
                if (r3 == 0) goto L9d
                java.lang.Double r3 = kotlin.text.t.n(r3)
                goto L9e
            L9d:
                r3 = r2
            L9e:
                if (r3 == 0) goto Ld2
                java.lang.String r3 = r0.getLongitude()
                if (r3 == 0) goto Lab
                java.lang.Double r3 = kotlin.text.t.n(r3)
                goto Lac
            Lab:
                r3 = r2
            Lac:
                if (r3 == 0) goto Ld2
                com.ubnt.teleport.unifi.cloud.TeleportCloud$b$a r3 = new com.ubnt.teleport.unifi.cloud.TeleportCloud$b$a
                java.lang.String r12 = r0.getLatitude()
                java.lang.Double r12 = kotlin.text.t.n(r12)
                kotlin.jvm.internal.AbstractC6492s.f(r12)
                double r12 = r12.doubleValue()
                java.lang.String r0 = r0.getLatitude()
                java.lang.Double r0 = kotlin.text.t.n(r0)
                kotlin.jvm.internal.AbstractC6492s.f(r0)
                double r14 = r0.doubleValue()
                r3.<init>(r12, r14)
                goto Ld3
            Ld2:
                r3 = r2
            Ld3:
                r12 = r3
                goto Ld6
            Ld5:
                r12 = r2
            Ld6:
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Metadata r0 = r17.getMetadata()
                if (r0 == 0) goto Le6
                com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo$Location r0 = r0.getLocation()
                if (r0 == 0) goto Le6
                java.lang.String r2 = r0.getText()
            Le6:
                r13 = r2
                com.ubnt.teleport.unifi.cloud.TeleportCloud$b r0 = new com.ubnt.teleport.unifi.cloud.TeleportCloud$b
                r3 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: J7.m.a.a(com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo):com.ubnt.teleport.unifi.cloud.TeleportCloud$b");
        }

        private a() {
        }
    }

    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J7.n f9838a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f9839b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9840c;

        public static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ J7.n f9841a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(J7.n nVar) {
                super(1);
                this.f9841a = nVar;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Mj.w it) throws TeleportCloud.Error.InvalidResponse, TeleportCloud.Error.CloudError.Unauthenticated, TeleportCloud.Error.ApiError, TeleportCloud.Error.CloudError.TeleportDisabled, TeleportCloud.Error.CloudError.SiteGatewayNotFound, TeleportCloud.Error.CloudError.ClientInvalid {
                Object objC;
                Object next;
                J7.n nVar = this.f9841a;
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
                if (objC instanceof ApiTeleportCloudResponseConnection) {
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

        /* renamed from: J7.m$b$b, reason: collision with other inner class name */
        public static final class C0395b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f9842a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f9843b;

            /* renamed from: J7.m$b$b$a */
            public static final class a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ N f9844a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ long f9845b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(N n10, long j10) {
                    super(1);
                    this.f9844a = n10;
                    this.f9845b = j10;
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a invoke(Throwable th2) {
                    this.f9844a.f51689a = th2;
                    if (!(th2 instanceof TeleportCloud.Error) && (th2 instanceof IOException)) {
                        return gg.i.d2(this.f9845b, TimeUnit.MILLISECONDS);
                    }
                    return gg.i.k0(th2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0395b(N n10, long j10) {
                super(1);
                this.f9842a = n10;
                this.f9843b = j10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a invoke(gg.i iVar) {
                return iVar.p0(new n.e(new a(this.f9842a, this.f9843b)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(J7.n nVar, N n10, long j10) {
            super(1);
            this.f9838a = nVar;
            this.f9839b = n10;
            this.f9840c = j10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D invoke(String requestId) {
            K7.a aVarJ = this.f9838a.j();
            AbstractC6492s.h(requestId, "requestId");
            return aVarJ.a(requestId).A(new n.e(new a(this.f9838a))).L(new n.e(new C0395b(this.f9839b, this.f9840c)));
        }
    }

    public static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f9846a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ApiTeleportCloudRequest f9847b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(N n10, ApiTeleportCloudRequest apiTeleportCloudRequest) {
            super(1);
            this.f9846a = n10;
            this.f9847b = apiTeleportCloudRequest;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D invoke(Throwable error) {
            Object obj;
            if ((error instanceof TimeoutException) && (obj = this.f9846a.f51689a) != null) {
                AbstractC6492s.f(obj);
                error = (Throwable) obj;
            }
            ApiTeleportCloudRequest apiTeleportCloudRequest = this.f9847b;
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

    static final class d extends AbstractC6494u implements InterfaceC6835l {
        d() {
            super(1);
        }

        public final void a(ApiTeleportCloudResponseConnection it) throws TeleportCloud.Error.InvalidResponse {
            m mVar = m.this;
            AbstractC6492s.h(it, "it");
            mVar.n(it);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws TeleportCloud.Error.InvalidResponse {
            a((ApiTeleportCloudResponseConnection) obj);
            return J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f9849a = new e();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f9850a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "CLOUD - connection info request";
            }
        }

        e() {
            super(1);
        }

        public final void a(InterfaceC6043c interfaceC6043c) {
            N7.a.b(a.f9850a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6043c) obj);
            return J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {
        f() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeleportCloud.a invoke(ApiTeleportCloudResponseConnection apiTeleportCloudResponseConnection) throws TeleportCloud.Error.InvalidResponse, UnknownHostException {
            List listL;
            TeleportCloud.d dVarE;
            try {
                String clientIp = apiTeleportCloudResponseConnection.getClientIp();
                if (clientIp == null) {
                    throw new TeleportCloud.Error.InvalidResponse("missing remote peer IP", null, 2, null);
                }
                InetAddress byName = InetAddress.getByName(clientIp);
                AbstractC6492s.h(byName, "try {\n                  …or)\n                    }");
                List dns = apiTeleportCloudResponseConnection.getDns();
                if (dns != null) {
                    List<String> list = dns;
                    ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
                    for (String str : list) {
                        try {
                            arrayList.add(InetAddress.getByName(str));
                        } catch (UnknownHostException e10) {
                            throw new TeleportCloud.Error.InvalidResponse("dns addr '" + str + "' is not an IP address", e10);
                        }
                    }
                    listL = arrayList;
                } else {
                    listL = AbstractC3689v.l();
                }
                ApiTeleportCloudClientInfo remoteClientInfo = apiTeleportCloudResponseConnection.getRemoteClientInfo();
                if (remoteClientInfo == null || (dVarE = m.this.E(remoteClientInfo)) == null) {
                    throw new TeleportCloud.Error.InvalidResponse("missing peer info", null, 2, null);
                }
                try {
                    String udpEchoAddr = apiTeleportCloudResponseConnection.getRemoteClientInfo().getUdpEchoAddr();
                    if (udpEchoAddr == null) {
                        throw new TeleportCloud.Error.InvalidResponse("missing udp echo address", null, 2, null);
                    }
                    InetAddress byName2 = InetAddress.getByName(udpEchoAddr);
                    AbstractC6492s.h(byName2, "try {\n                  …  )\n                    }");
                    Integer udpEchoPort = apiTeleportCloudResponseConnection.getRemoteClientInfo().getUdpEchoPort();
                    if (udpEchoPort == null) {
                        throw new TeleportCloud.Error.InvalidResponse("missing udp echo port", null, 2, null);
                    }
                    int iIntValue = udpEchoPort.intValue();
                    try {
                        String udpEchoTunnelAddress = apiTeleportCloudResponseConnection.getRemoteClientInfo().getUdpEchoTunnelAddress();
                        if (udpEchoTunnelAddress == null) {
                            throw new TeleportCloud.Error.InvalidResponse("missing udp echo address", null, 2, null);
                        }
                        InetAddress byName3 = InetAddress.getByName(udpEchoTunnelAddress);
                        AbstractC6492s.h(byName3, "try {\n                  …  )\n                    }");
                        Integer udpEchoTunnelAddressMask = apiTeleportCloudResponseConnection.getRemoteClientInfo().getUdpEchoTunnelAddressMask();
                        if (udpEchoTunnelAddressMask != null) {
                            return new TeleportCloud.a(byName, listL, dVarE, byName2, iIntValue, byName3, udpEchoTunnelAddressMask.intValue());
                        }
                        throw new TeleportCloud.Error.InvalidResponse("missing udp echo address mask", null, 2, null);
                    } catch (UnknownHostException e11) {
                        throw new TeleportCloud.Error.InvalidResponse("udp echo tunnel address '" + apiTeleportCloudResponseConnection.getRemoteClientInfo().getUdpEchoTunnelAddress() + "' is not an IP address", e11);
                    }
                } catch (UnknownHostException e12) {
                    throw new TeleportCloud.Error.InvalidResponse("udp echo address '" + apiTeleportCloudResponseConnection.getRemoteClientInfo().getUdpEchoAddr() + "' is not an IP address", e12);
                }
            } catch (UnknownHostException e13) {
                throw new TeleportCloud.Error.InvalidResponse("client IP '" + apiTeleportCloudResponseConnection.getClientIp() + "' is not an IP address", e13);
            }
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final g f9852a = new g();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportCloud.a f9853a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TeleportCloud.a aVar) {
                super(0);
                this.f9853a = aVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "CLOUD - connection info SUCCESS: " + this.f9853a;
            }
        }

        g() {
            super(1);
        }

        public final void a(TeleportCloud.a aVar) {
            N7.a.b(new a(aVar));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TeleportCloud.a) obj);
            return J.f24997a;
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
            m mVar = m.this;
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
                        objC = ((J7.n) mVar).f9879e.c(strC);
                    } catch (JsonDataException unused) {
                        objC = ((J7.n) mVar).f9880f.c(strC);
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
        public static final i f9855a = new i();

        i() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeleportCloud.b invoke(ApiTeleportSiteInfo it) {
            a aVar = m.f9835j;
            AbstractC6492s.h(it, "it");
            return aVar.a(it);
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final j f9856a = new j();

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

    public static final class k extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J7.n f9857a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f9858b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9859c;

        public static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ J7.n f9860a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(J7.n nVar) {
                super(1);
                this.f9860a = nVar;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Mj.w it) throws TeleportCloud.Error.InvalidResponse, TeleportCloud.Error.CloudError.Unauthenticated, TeleportCloud.Error.ApiError, TeleportCloud.Error.CloudError.TeleportDisabled, TeleportCloud.Error.CloudError.SiteGatewayNotFound, TeleportCloud.Error.CloudError.ClientInvalid {
                Object objC;
                Object next;
                J7.n nVar = this.f9860a;
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
                if (objC instanceof ApiTeleportCloudResponseIce) {
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

        public static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f9861a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f9862b;

            public static final class a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ N f9863a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ long f9864b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(N n10, long j10) {
                    super(1);
                    this.f9863a = n10;
                    this.f9864b = j10;
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a invoke(Throwable th2) {
                    this.f9863a.f51689a = th2;
                    if (!(th2 instanceof TeleportCloud.Error) && (th2 instanceof IOException)) {
                        return gg.i.d2(this.f9864b, TimeUnit.MILLISECONDS);
                    }
                    return gg.i.k0(th2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(N n10, long j10) {
                super(1);
                this.f9861a = n10;
                this.f9862b = j10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a invoke(gg.i iVar) {
                return iVar.p0(new n.e(new a(this.f9861a, this.f9862b)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(J7.n nVar, N n10, long j10) {
            super(1);
            this.f9857a = nVar;
            this.f9858b = n10;
            this.f9859c = j10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D invoke(String requestId) {
            K7.a aVarJ = this.f9857a.j();
            AbstractC6492s.h(requestId, "requestId");
            return aVarJ.a(requestId).A(new n.e(new a(this.f9857a))).L(new n.e(new b(this.f9858b, this.f9859c)));
        }
    }

    public static final class l extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f9865a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ApiTeleportCloudRequest f9866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(N n10, ApiTeleportCloudRequest apiTeleportCloudRequest) {
            super(1);
            this.f9865a = n10;
            this.f9866b = apiTeleportCloudRequest;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D invoke(Throwable error) {
            Object obj;
            if ((error instanceof TimeoutException) && (obj = this.f9865a.f51689a) != null) {
                AbstractC6492s.f(obj);
                error = (Throwable) obj;
            }
            ApiTeleportCloudRequest apiTeleportCloudRequest = this.f9866b;
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

    /* renamed from: J7.m$m, reason: collision with other inner class name */
    static final class C0396m extends AbstractC6494u implements InterfaceC6835l {
        C0396m() {
            super(1);
        }

        public final void a(ApiTeleportCloudResponseIce it) throws TeleportCloud.Error.InvalidResponse {
            m mVar = m.this;
            AbstractC6492s.h(it, "it");
            mVar.o(it);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws TeleportCloud.Error.InvalidResponse {
            a((ApiTeleportCloudResponseIce) obj);
            return J.f24997a;
        }
    }

    static final class n extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final n f9868a = new n();

        n() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ApiTeleportCloudResponseIce invoke(ApiTeleportCloudResponseIce it) {
            AbstractC6492s.h(it, "it");
            return H.a(it);
        }
    }

    static final class o extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final o f9869a = new o();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f9870a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "CLOUD - ICE config request";
            }
        }

        o() {
            super(1);
        }

        public final void a(InterfaceC6043c interfaceC6043c) {
            N7.a.b(a.f9870a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6043c) obj);
            return J.f24997a;
        }
    }

    static final class p extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final p f9871a = new p();

        p() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeleportCloud.g invoke(ApiTeleportCloudResponseIce apiTeleportCloudResponseIce) {
            String ice = apiTeleportCloudResponseIce.getIce();
            if (ice != null) {
                return new TeleportCloud.g(ice);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    static final class q extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final q f9872a = new q();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportCloud.g f9873a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TeleportCloud.g gVar) {
                super(0);
                this.f9873a = gVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "CLOUD - ICE config SUCCESS: " + this.f9873a;
            }
        }

        q() {
            super(1);
        }

        public final void a(TeleportCloud.g gVar) {
            N7.a.b(new a(gVar));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TeleportCloud.g) obj);
            return J.f24997a;
        }
    }

    public /* synthetic */ m(OkHttpClient okHttpClient, String str, String str2, TeleportCloud.e.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(okHttpClient, (i10 & 2) != 0 ? C2997g.f8908a.b() : str, str2, aVar);
    }

    private final ApiTeleportCloudClientInfo D(TeleportCloud.d dVar) {
        return new ApiTeleportCloudClientInfo(dVar.a(), dVar.b(), dVar.c(), null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeleportCloud.d E(ApiTeleportCloudClientInfo apiTeleportCloudClientInfo) throws TeleportCloud.Error.InvalidResponse {
        String encryptionPublicKey = apiTeleportCloudClientInfo.getEncryptionPublicKey();
        if (encryptionPublicKey == null) {
            throw new TeleportCloud.Error.InvalidResponse("missing encryption key", null, 2, null);
        }
        String peerDescription = apiTeleportCloudClientInfo.getPeerDescription();
        if (peerDescription != null) {
            return new TeleportCloud.d(encryptionPublicKey, peerDescription, apiTeleportCloudClientInfo.getStunSessionSecret());
        }
        throw new TeleportCloud.Error.InvalidResponse("missing peer description", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeleportCloud.a H(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (TeleportCloud.a) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeleportCloud.b J(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (TeleportCloud.b) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.D K(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.D) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiTeleportSiteInfo L(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (ApiTeleportSiteInfo) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiTeleportCloudResponseIce N(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (ApiTeleportCloudResponseIce) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeleportCloud.g P(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (TeleportCloud.g) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud.f
    public gg.z a(TeleportCloud.d peerInfo) {
        AbstractC6492s.i(peerInfo, "peerInfo");
        ApiTeleportCloudRequest apiTeleportCloudRequest = new ApiTeleportCloudRequest(f().b(), new ApiTeleportCloudRequestPayloadConnection(this.f9836h, D(peerInfo), f().a()));
        N n10 = new N();
        gg.z zVarO = j().c(apiTeleportCloudRequest).A(new n.e(new J7.o(this))).o(new n.d(new J7.p(this))).A(new n.e(J7.q.f9887a)).s(new n.e(new b(this, n10, 200L))).Q(20000L, TimeUnit.MILLISECONDS).F(new n.e(new c(n10, apiTeleportCloudRequest))).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "protected inline fun <re…On(Schedulers.io())\n    }");
        final d dVar = new d();
        gg.z zVarO2 = zVarO.o(new InterfaceC6469f() { // from class: J7.f
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                m.F(dVar, obj);
            }
        });
        final e eVar = e.f9849a;
        gg.z zVarN = zVarO2.n(new InterfaceC6469f() { // from class: J7.g
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                m.G(eVar, obj);
            }
        });
        final f fVar = new f();
        gg.z zVarA = zVarN.A(new kg.n() { // from class: J7.h
            @Override // kg.n
            public final Object apply(Object obj) {
                return m.H(fVar, obj);
            }
        });
        final g gVar = g.f9852a;
        gg.z zVarO3 = zVarA.o(new InterfaceC6469f() { // from class: J7.i
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                m.I(gVar, obj);
            }
        });
        AbstractC6492s.h(zVarO3, "override fun getConnecti…SUCCESS: ${it}\" } }\n    }");
        return zVarO3;
    }

    @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud.f
    public gg.z c() {
        gg.z<Mj.w<ApiTeleportSiteInfo>> zVarB = j().b(f().b());
        final h hVar = new h();
        gg.z zVarA = zVarB.A(new kg.n() { // from class: J7.a
            @Override // kg.n
            public final Object apply(Object obj) {
                return m.L(hVar, obj);
            }
        });
        final i iVar = i.f9855a;
        gg.z zVarA2 = zVarA.A(new kg.n() { // from class: J7.d
            @Override // kg.n
            public final Object apply(Object obj) {
                return m.J(iVar, obj);
            }
        });
        final j jVar = j.f9856a;
        gg.z zVarO = zVarA2.F(new kg.n() { // from class: J7.e
            @Override // kg.n
            public final Object apply(Object obj) {
                return m.K(jVar, obj);
            }
        }).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "override fun getEndpoint…On(Schedulers.io())\n    }");
        return zVarO;
    }

    @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud.f
    public gg.z d() {
        ApiTeleportCloudRequest apiTeleportCloudRequest = new ApiTeleportCloudRequest(f().b(), new ApiTeleportCloudRequestPayloadIce(f().a()));
        N n10 = new N();
        gg.z zVarO = j().c(apiTeleportCloudRequest).A(new n.e(new J7.o(this))).o(new n.d(new J7.p(this))).A(new n.e(J7.q.f9887a)).s(new n.e(new k(this, n10, 200L))).Q(20000L, TimeUnit.MILLISECONDS).F(new n.e(new l(n10, apiTeleportCloudRequest))).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "protected inline fun <re…On(Schedulers.io())\n    }");
        final C0396m c0396m = new C0396m();
        gg.z zVarO2 = zVarO.o(new InterfaceC6469f() { // from class: J7.j
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                m.M(c0396m, obj);
            }
        });
        final n nVar = n.f9868a;
        gg.z zVarA = zVarO2.A(new kg.n() { // from class: J7.k
            @Override // kg.n
            public final Object apply(Object obj) {
                return m.N(nVar, obj);
            }
        });
        final o oVar = o.f9869a;
        gg.z zVarN = zVarA.n(new InterfaceC6469f() { // from class: J7.l
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                m.O(oVar, obj);
            }
        });
        final p pVar = p.f9871a;
        gg.z zVarA2 = zVarN.A(new kg.n() { // from class: J7.b
            @Override // kg.n
            public final Object apply(Object obj) {
                return m.P(pVar, obj);
            }
        });
        final q qVar = q.f9872a;
        gg.z zVarO3 = zVarA2.o(new InterfaceC6469f() { // from class: J7.c
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                m.Q(qVar, obj);
            }
        });
        AbstractC6492s.h(zVarO3, "override fun getWebRTCIc…SUCCESS: ${it}\" } }\n    }");
        return zVarO3;
    }

    @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud.f
    public TeleportCloud.e.a f() {
        return this.f9837i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(OkHttpClient sharedOkhttpClient, String url, String clientName, TeleportCloud.e.a token) {
        super(sharedOkhttpClient, url);
        AbstractC6492s.i(sharedOkhttpClient, "sharedOkhttpClient");
        AbstractC6492s.i(url, "url");
        AbstractC6492s.i(clientName, "clientName");
        AbstractC6492s.i(token, "token");
        this.f9836h = clientName;
        this.f9837i = token;
    }
}
