package com.ui.wifiman.model.ubiquiti.uisp;

import Yd.ApiUispDiscoveryResponse;
import b8.EnumC4076c;
import com.ui.wifiman.model.ubiquiti.uisp.a;
import fd.InterfaceC5808b;
import gg.C;
import gg.InterfaceC5910A;
import gg.i;
import gg.z;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public final class UispControllerDiscoveryImpl implements com.ui.wifiman.model.ubiquiti.uisp.a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f43931e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Zc.f f43932a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5808b f43933b;

    /* renamed from: c, reason: collision with root package name */
    private final z f43934c;

    /* renamed from: d, reason: collision with root package name */
    private final i f43935d;

    private static abstract class Error extends IOException {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$RequestFailed;", "Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error;", "", "code", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "I", "getCode", "getMessage", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RequestFailed extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int code;

            public RequestFailed(int i10) {
                super(null);
                this.code = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RequestFailed) && this.code == ((RequestFailed) other).code;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return "Api check request failed with HTTP Code " + this.code;
            }

            public int hashCode() {
                return Integer.hashCode(this.code);
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "RequestFailed(code=" + this.code + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error$ResponseValidation;", "Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ResponseValidation extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResponseValidation(String message) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResponseValidation) && AbstractC6492s.d(this.message, ((ResponseValidation) other).message);
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "ResponseValidation(message=" + this.message + ")";
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43938a;

        static {
            int[] iArr = new int[EnumC4076c.values().length];
            try {
                iArr[EnumC4076c.ETHERNET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4076c.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4076c.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4076c.MOBILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4076c.DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f43938a = iArr;
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f43939a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(com.ubnt.usurvey.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.p());
        }
    }

    static final class d implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UispControllerDiscoveryImpl f43941a;

            /* renamed from: com.ui.wifiman.model.ubiquiti.uisp.UispControllerDiscoveryImpl$d$a$a, reason: collision with other inner class name */
            static final class C1504a implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final C1504a f43942a = new C1504a();

                C1504a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C6556a apply(a.C1505a it) {
                    AbstractC6492s.i(it, "it");
                    return new C6556a(it);
                }
            }

            static final class b implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final b f43943a = new b();

                b() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(i it) {
                    AbstractC6492s.i(it, "it");
                    return it.R(10000L, TimeUnit.MILLISECONDS);
                }
            }

            a(UispControllerDiscoveryImpl uispControllerDiscoveryImpl) {
                this.f43941a = uispControllerDiscoveryImpl;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Zc.e connection) {
                AbstractC6492s.i(connection, "connection");
                if (this.f43941a.f(connection)) {
                    i iVarZ1 = this.f43941a.e().A(C1504a.f43942a).L(b.f43943a).W().z1(new C6556a(null));
                    AbstractC6492s.f(iVarZ1);
                    return iVarZ1;
                }
                i iVarK0 = i.K0(new C6556a(null));
                AbstractC6492s.f(iVarK0);
                return iVarK0;
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean apiEnabled) {
            AbstractC6492s.i(apiEnabled, "apiEnabled");
            if (apiEnabled.booleanValue()) {
                i iVarI1 = UispControllerDiscoveryImpl.this.f43932a.getState().I1(new a(UispControllerDiscoveryImpl.this));
                AbstractC6492s.f(iVarI1);
                return iVarI1;
            }
            i iVarK0 = i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43944a = new e();

        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Uisp API params emission " + it, null, 2, null);
        }
    }

    public static final class f implements C {
        public f() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                Response responseG = UispControllerDiscoveryImpl.this.f43933b.a().E().d(3000L, TimeUnit.MILLISECONDS).c().b(new Request.Builder().i(new HttpUrl.Builder().r("http").h("uisp.lan").n(10009).b("me").d()).a("Origin", "http://wifiman.com").b()).g();
                if (!responseG.P()) {
                    throw new Error.RequestFailed(responseG.getCode());
                }
                ResponseBody body = responseG.getBody();
                AbstractC6492s.f(body);
                String strC = body.C();
                ApiUispDiscoveryResponse apiUispDiscoveryResponse = (ApiUispDiscoveryResponse) new com.google.gson.e().i(strC, ApiUispDiscoveryResponse.class);
                if (apiUispDiscoveryResponse.getControllerUrl() == null) {
                    throw new Error.ResponseValidation("response doesn't contain UISP controller URL (" + strC + ")");
                }
                if (apiUispDiscoveryResponse.getToken() == null) {
                    throw new Error.ResponseValidation("response doesn't contain UISP controller token (" + strC + ")");
                }
                if (apiUispDiscoveryResponse.getMac() != null) {
                    interfaceC5910A.onSuccess(new a.C1505a(apiUispDiscoveryResponse.getControllerUrl(), apiUispDiscoveryResponse.getToken(), apiUispDiscoveryResponse.getMac()));
                    return;
                }
                throw new Error.ResponseValidation("response doesn't contain mac (" + strC + ")");
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public UispControllerDiscoveryImpl(Zc.f networkConnectionManager, InterfaceC5808b sharedOkHttpClientHolder) {
        AbstractC6492s.i(networkConnectionManager, "networkConnectionManager");
        AbstractC6492s.i(sharedOkHttpClientHolder, "sharedOkHttpClientHolder");
        this.f43932a = networkConnectionManager;
        this.f43933b = sharedOkHttpClientHolder;
        z zVarI = z.i(new f());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarO = zVarI.O(Gg.a.d());
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        this.f43934c = zVarO;
        i iVarI2 = com.ubnt.usurvey.a.f39654r.a().b().N0(c.f43939a).W().I1(new d()).W().f0(e.f43944a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43935d = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f(Zc.e eVar) {
        int i10 = b.f43938a[eVar.g().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            if (eVar.b() != null || eVar.c() != null) {
                return true;
            }
        } else if (i10 != 4 && i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    @Override // com.ui.wifiman.model.ubiquiti.uisp.a
    public i a() {
        return this.f43935d;
    }

    public final z e() {
        return this.f43934c;
    }
}
