package com.ui.sso.auth;

import Vi.n;
import Xi.f;
import Yg.J;
import Zi.C0;
import Zi.C3709h0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import aj.AbstractC3868b;
import aj.C3871e;
import aj.w;
import com.ui.sso.auth.UiAuthSerializer;
import com.ui.sso.auth.a;
import com.ui.sso.auth.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.text.t;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.UnknownFieldException;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public final class b implements UiAuthSerializer {

    /* renamed from: c, reason: collision with root package name */
    public static final a f42161c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3868b f42162a = w.b(null, e.f42173a, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3868b f42163b = w.b(null, d.f42172a, 1, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @n
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0083\b\u0018\u0000 12\u00020\u0001:\u0002!&B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBc\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010%\u001a\u0004\b(\u0010)R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\"\u0012\u0004\b,\u0010%\u001a\u0004\b&\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\"\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010\u001aR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010\"\u0012\u0004\b/\u0010%\u001a\u0004\b!\u0010\u001aR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\"\u0012\u0004\b0\u0010%\u001a\u0004\b.\u0010\u001a¨\u00062"}, d2 = {"Lcom/ui/sso/auth/b$b;", "", "", "token", "", "expiresAt", "deviceId", "deviceName", "codeVerifier", "method", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "g", "(Lcom/ui/sso/auth/b$b;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "f", "getToken$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "getExpiresAt$annotations", SnmpConfigurator.O_COMMUNITY, "getDeviceId$annotations", "getDeviceName$annotations", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getCodeVerifier$annotations", "getMethod$annotations", "Companion", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ui.sso.auth.b$b, reason: collision with other inner class name and from toString */
    private static final /* data */ class UiPKCEAuthJsonSerializable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String token;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long expiresAt;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deviceId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deviceName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String codeVerifier;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String method;

        /* renamed from: com.ui.sso.auth.b$b$a */
        public static final class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42170a;
            private static final /* synthetic */ H0 descriptor;

            static {
                a aVar = new a();
                f42170a = aVar;
                H0 h02 = new H0("com.ui.sso.auth.UiAuthSerializerImpl.UiPKCEAuthJsonSerializable", aVar, 6);
                h02.p("token", false);
                h02.p("expiresAt", false);
                h02.p("deviceId", false);
                h02.p("deviceName", false);
                h02.p("codeVerifier", false);
                h02.p("method", false);
                descriptor = h02;
            }

            private a() {
            }

            @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
            public f a() {
                return descriptor;
            }

            @Override // Zi.M
            public Vi.b[] b() {
                return M.a.a(this);
            }

            @Override // Zi.M
            public Vi.b[] d() {
                Vi.b bVarU = Wi.a.u(C3709h0.f25636a);
                W0 w02 = W0.f25599a;
                return new Vi.b[]{w02, bVarU, w02, w02, w02, w02};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public UiPKCEAuthJsonSerializable c(Yi.e decoder) {
                int i10;
                String str;
                Long l10;
                String str2;
                String str3;
                String str4;
                String strW;
                AbstractC6492s.i(decoder, "decoder");
                f fVarA = a();
                Yi.c cVarC = decoder.c(fVarA);
                String strW2 = null;
                if (cVarC.B()) {
                    String strW3 = cVarC.w(fVarA, 0);
                    Long l11 = (Long) cVarC.h(fVarA, 1, C3709h0.f25636a, null);
                    String strW4 = cVarC.w(fVarA, 2);
                    String strW5 = cVarC.w(fVarA, 3);
                    String strW6 = cVarC.w(fVarA, 4);
                    str = strW3;
                    strW = cVarC.w(fVarA, 5);
                    str3 = strW5;
                    str4 = strW6;
                    str2 = strW4;
                    l10 = l11;
                    i10 = 63;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Long l12 = null;
                    String strW7 = null;
                    String strW8 = null;
                    String strW9 = null;
                    String strW10 = null;
                    while (z10) {
                        int iK = cVarC.k(fVarA);
                        switch (iK) {
                            case -1:
                                z10 = false;
                                continue;
                            case 0:
                                strW2 = cVarC.w(fVarA, 0);
                                i11 |= 1;
                                continue;
                            case 1:
                                l12 = (Long) cVarC.h(fVarA, 1, C3709h0.f25636a, l12);
                                i11 |= 2;
                                break;
                            case 2:
                                strW7 = cVarC.w(fVarA, 2);
                                i11 |= 4;
                                break;
                            case 3:
                                strW8 = cVarC.w(fVarA, 3);
                                i11 |= 8;
                                break;
                            case 4:
                                strW9 = cVarC.w(fVarA, 4);
                                i11 |= 16;
                                break;
                            case 5:
                                strW10 = cVarC.w(fVarA, 5);
                                i11 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(iK);
                        }
                    }
                    i10 = i11;
                    str = strW2;
                    l10 = l12;
                    str2 = strW7;
                    str3 = strW8;
                    str4 = strW9;
                    strW = strW10;
                }
                cVarC.b(fVarA);
                return new UiPKCEAuthJsonSerializable(i10, str, l10, str2, str3, str4, strW, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, UiPKCEAuthJsonSerializable value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                UiPKCEAuthJsonSerializable.g(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: com.ui.sso.auth.b$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vi.b serializer() {
                return a.f42170a;
            }

            private Companion() {
            }
        }

        public /* synthetic */ UiPKCEAuthJsonSerializable(int i10, String str, Long l10, String str2, String str3, String str4, String str5, R0 r02) {
            if (63 != (i10 & 63)) {
                C0.a(i10, 63, a.f42170a.a());
            }
            this.token = str;
            this.expiresAt = l10;
            this.deviceId = str2;
            this.deviceName = str3;
            this.codeVerifier = str4;
            this.method = str5;
        }

        public static final /* synthetic */ void g(UiPKCEAuthJsonSerializable self, Yi.d output, f serialDesc) {
            output.y(serialDesc, 0, self.token);
            output.t(serialDesc, 1, C3709h0.f25636a, self.expiresAt);
            output.y(serialDesc, 2, self.deviceId);
            output.y(serialDesc, 3, self.deviceName);
            output.y(serialDesc, 4, self.codeVerifier);
            output.y(serialDesc, 5, self.method);
        }

        /* renamed from: a, reason: from getter */
        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        /* renamed from: b, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        /* renamed from: c, reason: from getter */
        public final String getDeviceName() {
            return this.deviceName;
        }

        /* renamed from: d, reason: from getter */
        public final Long getExpiresAt() {
            return this.expiresAt;
        }

        /* renamed from: e, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiPKCEAuthJsonSerializable)) {
                return false;
            }
            UiPKCEAuthJsonSerializable uiPKCEAuthJsonSerializable = (UiPKCEAuthJsonSerializable) other;
            return AbstractC6492s.d(this.token, uiPKCEAuthJsonSerializable.token) && AbstractC6492s.d(this.expiresAt, uiPKCEAuthJsonSerializable.expiresAt) && AbstractC6492s.d(this.deviceId, uiPKCEAuthJsonSerializable.deviceId) && AbstractC6492s.d(this.deviceName, uiPKCEAuthJsonSerializable.deviceName) && AbstractC6492s.d(this.codeVerifier, uiPKCEAuthJsonSerializable.codeVerifier) && AbstractC6492s.d(this.method, uiPKCEAuthJsonSerializable.method);
        }

        /* renamed from: f, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            int iHashCode = this.token.hashCode() * 31;
            Long l10 = this.expiresAt;
            return ((((((((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.deviceId.hashCode()) * 31) + this.deviceName.hashCode()) * 31) + this.codeVerifier.hashCode()) * 31) + this.method.hashCode();
        }

        public String toString() {
            return "UiPKCEAuthJsonSerializable(token=" + this.token + ", expiresAt=" + this.expiresAt + ", deviceId=" + this.deviceId + ", deviceName=" + this.deviceName + ", codeVerifier=" + this.codeVerifier + ", method=" + this.method + ")";
        }

        public UiPKCEAuthJsonSerializable(String token, Long l10, String deviceId, String deviceName, String codeVerifier, String method) {
            AbstractC6492s.i(token, "token");
            AbstractC6492s.i(deviceId, "deviceId");
            AbstractC6492s.i(deviceName, "deviceName");
            AbstractC6492s.i(codeVerifier, "codeVerifier");
            AbstractC6492s.i(method, "method");
            this.token = token;
            this.expiresAt = l10;
            this.deviceId = deviceId;
            this.deviceName = deviceName;
            this.codeVerifier = codeVerifier;
            this.method = method;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42171a;

        static {
            int[] iArr = new int[a.EnumC1372a.values().length];
            try {
                iArr[a.EnumC1372a.UBIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC1372a.UBIC_PKCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC1372a.SSO_PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f42171a = iArr;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final d f42172a = new d();

        d() {
            super(1);
        }

        public final void a(C3871e Json) {
            AbstractC6492s.i(Json, "$this$Json");
            Json.f(true);
            Json.e(false);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3871e) obj);
            return J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f42173a = new e();

        e() {
            super(1);
        }

        public final void a(C3871e Json) {
            AbstractC6492s.i(Json, "$this$Json");
            Json.e(true);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3871e) obj);
            return J.f24997a;
        }
    }

    private final UiPKCEAuthJsonSerializable c(d.b bVar) {
        return new UiPKCEAuthJsonSerializable(bVar.f(), bVar.d(), bVar.b(), bVar.c(), bVar.a(), bVar.e());
    }

    private final d.b d(UiPKCEAuthJsonSerializable uiPKCEAuthJsonSerializable) {
        return new d.b(uiPKCEAuthJsonSerializable.getToken(), uiPKCEAuthJsonSerializable.getExpiresAt(), uiPKCEAuthJsonSerializable.getDeviceId(), uiPKCEAuthJsonSerializable.getDeviceName(), uiPKCEAuthJsonSerializable.getCodeVerifier(), uiPKCEAuthJsonSerializable.getMethod());
    }

    private final com.ui.sso.auth.d e(String str) throws UiAuthSerializer.Error {
        try {
            AbstractC3868b abstractC3868b = this.f42163b;
            return new com.ui.sso.auth.d(d((UiPKCEAuthJsonSerializable) abstractC3868b.b(Vi.w.c(abstractC3868b.a(), O.l(UiPKCEAuthJsonSerializable.class)), str)));
        } catch (SerializationException e10) {
            throw new UiAuthSerializer.Error("PKCE Auth deserialization failed", e10);
        }
    }

    private final com.ui.sso.auth.e f(String str) {
        return new com.ui.sso.auth.e(str);
    }

    private final com.ui.sso.auth.c g(String str) {
        return new com.ui.sso.auth.c(t.l1(str, ";", null, 2, null), t.s(t.b1(str, ";", "")));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String h(com.ui.sso.auth.c r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.a()
            java.lang.Long r5 = r5.c()
            if (r5 == 0) goto L21
            long r1 = r5.longValue()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = ";"
            r5.append(r3)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L23
        L21:
            java.lang.String r5 = ""
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.auth.b.h(com.ui.sso.auth.c):java.lang.String");
    }

    private final String i(com.ui.sso.auth.d dVar) throws UiAuthSerializer.Error {
        try {
            AbstractC3868b abstractC3868b = this.f42162a;
            return abstractC3868b.c(Vi.w.c(abstractC3868b.a(), O.l(UiPKCEAuthJsonSerializable.class)), c(dVar.c()));
        } catch (SerializationException e10) {
            throw new UiAuthSerializer.Error("PKCE Auth serialization failed", e10);
        }
    }

    private final String j(com.ui.sso.auth.e eVar) {
        return eVar.a();
    }

    @Override // com.ui.sso.auth.UiAuthSerializer
    public String a(com.ui.sso.auth.a auth) {
        AbstractC6492s.i(auth, "auth");
        if (auth instanceof com.ui.sso.auth.c) {
            return h((com.ui.sso.auth.c) auth);
        }
        if (auth instanceof com.ui.sso.auth.d) {
            return i((com.ui.sso.auth.d) auth);
        }
        if (auth instanceof com.ui.sso.auth.e) {
            return j((com.ui.sso.auth.e) auth);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.ui.sso.auth.UiAuthSerializer
    public com.ui.sso.auth.a b(String str, a.EnumC1372a type) {
        AbstractC6492s.i(str, "str");
        AbstractC6492s.i(type, "type");
        int i10 = c.f42171a[type.ordinal()];
        if (i10 == 1) {
            return g(str);
        }
        if (i10 == 2) {
            return e(str);
        }
        if (i10 == 3) {
            return f(str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
