package Eb;

import Zi.C0;
import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002\u0016!B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001f\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\u001f\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u0019¨\u00060"}, d2 = {"LEb/p;", "", "", "user", "password", "", "sendDefaultMfaCode", "pkceChallenge", "pkceMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(LEb/p;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUser", SnmpConfigurator.O_BIND_ADDRESS, "getPassword", SnmpConfigurator.O_COMMUNITY, "Z", "getSendDefaultMfaCode", "()Z", "getSendDefaultMfaCode$annotations", "()V", "d", "getPkceChallenge", "getPkceChallenge$annotations", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getPkceMethod", "getPkceMethod$annotations", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.p, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class SsoSignInBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String user;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String password;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sendDefaultMfaCode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pkceChallenge;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pkceMethod;

    /* renamed from: Eb.p$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4493a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4493a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.SsoSignInBody", aVar, 5);
            h02.p("user", false);
            h02.p("password", false);
            h02.p("send_default_mfa", false);
            h02.p("code_challenge", false);
            h02.p("code_challenge_method", true);
            descriptor = h02;
        }

        private a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final Xi.f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final Vi.b[] d() {
            W0 w02 = W0.f25599a;
            return new Vi.b[]{w02, w02, C3710i.f25639a, w02, w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final SsoSignInBody c(Yi.e decoder) {
            String str;
            String strW;
            String strW2;
            boolean z10;
            String str2;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            if (cVarC.B()) {
                String strW3 = cVarC.w(fVar, 0);
                String strW4 = cVarC.w(fVar, 1);
                boolean zU = cVarC.u(fVar, 2);
                str = strW3;
                strW = cVarC.w(fVar, 3);
                strW2 = cVarC.w(fVar, 4);
                z10 = zU;
                str2 = strW4;
                i10 = 31;
            } else {
                String strW5 = null;
                String strW6 = null;
                String strW7 = null;
                String strW8 = null;
                boolean z11 = true;
                boolean zU2 = false;
                int i11 = 0;
                while (z11) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z11 = false;
                    } else if (iK == 0) {
                        strW5 = cVarC.w(fVar, 0);
                        i11 |= 1;
                    } else if (iK == 1) {
                        strW8 = cVarC.w(fVar, 1);
                        i11 |= 2;
                    } else if (iK == 2) {
                        zU2 = cVarC.u(fVar, 2);
                        i11 |= 4;
                    } else if (iK == 3) {
                        strW6 = cVarC.w(fVar, 3);
                        i11 |= 8;
                    } else {
                        if (iK != 4) {
                            throw new UnknownFieldException(iK);
                        }
                        strW7 = cVarC.w(fVar, 4);
                        i11 |= 16;
                    }
                }
                str = strW5;
                strW = strW6;
                strW2 = strW7;
                z10 = zU2;
                str2 = strW8;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new SsoSignInBody(i10, str, str2, z10, strW, strW2, (R0) null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, SsoSignInBody value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            SsoSignInBody.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.p$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f4493a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SsoSignInBody(int i10, String str, String str2, boolean z10, String str3, String str4, R0 r02) {
        if (15 != (i10 & 15)) {
            C0.a(i10, 15, a.f4493a.a());
        }
        this.user = str;
        this.password = str2;
        this.sendDefaultMfaCode = z10;
        this.pkceChallenge = str3;
        if ((i10 & 16) == 0) {
            this.pkceMethod = "S256";
        } else {
            this.pkceMethod = str4;
        }
    }

    public static final /* synthetic */ void a(SsoSignInBody self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.user);
        output.y(serialDesc, 1, self.password);
        output.i(serialDesc, 2, self.sendDefaultMfaCode);
        output.y(serialDesc, 3, self.pkceChallenge);
        if (!output.o(serialDesc, 4) && AbstractC6492s.d(self.pkceMethod, "S256")) {
            return;
        }
        output.y(serialDesc, 4, self.pkceMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SsoSignInBody)) {
            return false;
        }
        SsoSignInBody ssoSignInBody = (SsoSignInBody) other;
        return AbstractC6492s.d(this.user, ssoSignInBody.user) && AbstractC6492s.d(this.password, ssoSignInBody.password) && this.sendDefaultMfaCode == ssoSignInBody.sendDefaultMfaCode && AbstractC6492s.d(this.pkceChallenge, ssoSignInBody.pkceChallenge) && AbstractC6492s.d(this.pkceMethod, ssoSignInBody.pkceMethod);
    }

    public int hashCode() {
        return (((((((this.user.hashCode() * 31) + this.password.hashCode()) * 31) + Boolean.hashCode(this.sendDefaultMfaCode)) * 31) + this.pkceChallenge.hashCode()) * 31) + this.pkceMethod.hashCode();
    }

    public String toString() {
        return "SsoSignInBody(user=" + this.user + ", password=" + this.password + ", sendDefaultMfaCode=" + this.sendDefaultMfaCode + ", pkceChallenge=" + this.pkceChallenge + ", pkceMethod=" + this.pkceMethod + ")";
    }

    public SsoSignInBody(String user, String password, boolean z10, String pkceChallenge, String pkceMethod) {
        AbstractC6492s.i(user, "user");
        AbstractC6492s.i(password, "password");
        AbstractC6492s.i(pkceChallenge, "pkceChallenge");
        AbstractC6492s.i(pkceMethod, "pkceMethod");
        this.user = user;
        this.password = password;
        this.sendDefaultMfaCode = z10;
        this.pkceChallenge = pkceChallenge;
        this.pkceMethod = pkceMethod;
    }

    public /* synthetic */ SsoSignInBody(String str, String str2, boolean z10, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z10, str3, (i10 & 16) != 0 ? "S256" : str4);
    }
}
