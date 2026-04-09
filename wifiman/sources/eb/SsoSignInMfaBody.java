package Eb;

import Zi.C0;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u0013\u001fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001d\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001d\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"LEb/q;", "", "", "token", "pkceChallenge", "pkceMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(LEb/q;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", SnmpConfigurator.O_BIND_ADDRESS, "getPkceChallenge", "getPkceChallenge$annotations", "()V", SnmpConfigurator.O_COMMUNITY, "getPkceMethod", "getPkceMethod$annotations", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.q, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class SsoSignInMfaBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pkceChallenge;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pkceMethod;

    /* renamed from: Eb.q$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4497a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4497a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.SsoSignInMfaBody", aVar, 3);
            h02.p("token", false);
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
            return new Vi.b[]{w02, w02, w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final SsoSignInMfaBody c(Yi.e decoder) {
            String str;
            String strW;
            String str2;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            if (cVarC.B()) {
                String strW2 = cVarC.w(fVar, 0);
                String strW3 = cVarC.w(fVar, 1);
                str = strW2;
                strW = cVarC.w(fVar, 2);
                str2 = strW3;
                i10 = 7;
            } else {
                String strW4 = null;
                String strW5 = null;
                String strW6 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW4 = cVarC.w(fVar, 0);
                        i11 |= 1;
                    } else if (iK == 1) {
                        strW6 = cVarC.w(fVar, 1);
                        i11 |= 2;
                    } else {
                        if (iK != 2) {
                            throw new UnknownFieldException(iK);
                        }
                        strW5 = cVarC.w(fVar, 2);
                        i11 |= 4;
                    }
                }
                str = strW4;
                strW = strW5;
                str2 = strW6;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new SsoSignInMfaBody(i10, str, str2, strW, (R0) null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, SsoSignInMfaBody value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            SsoSignInMfaBody.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.q$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f4497a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SsoSignInMfaBody(int i10, String str, String str2, String str3, R0 r02) {
        if (3 != (i10 & 3)) {
            C0.a(i10, 3, a.f4497a.a());
        }
        this.token = str;
        this.pkceChallenge = str2;
        if ((i10 & 4) == 0) {
            this.pkceMethod = "S256";
        } else {
            this.pkceMethod = str3;
        }
    }

    public static final /* synthetic */ void a(SsoSignInMfaBody self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.token);
        output.y(serialDesc, 1, self.pkceChallenge);
        if (!output.o(serialDesc, 2) && AbstractC6492s.d(self.pkceMethod, "S256")) {
            return;
        }
        output.y(serialDesc, 2, self.pkceMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SsoSignInMfaBody)) {
            return false;
        }
        SsoSignInMfaBody ssoSignInMfaBody = (SsoSignInMfaBody) other;
        return AbstractC6492s.d(this.token, ssoSignInMfaBody.token) && AbstractC6492s.d(this.pkceChallenge, ssoSignInMfaBody.pkceChallenge) && AbstractC6492s.d(this.pkceMethod, ssoSignInMfaBody.pkceMethod);
    }

    public int hashCode() {
        return (((this.token.hashCode() * 31) + this.pkceChallenge.hashCode()) * 31) + this.pkceMethod.hashCode();
    }

    public String toString() {
        return "SsoSignInMfaBody(token=" + this.token + ", pkceChallenge=" + this.pkceChallenge + ", pkceMethod=" + this.pkceMethod + ")";
    }

    public SsoSignInMfaBody(String token, String pkceChallenge, String pkceMethod) {
        AbstractC6492s.i(token, "token");
        AbstractC6492s.i(pkceChallenge, "pkceChallenge");
        AbstractC6492s.i(pkceMethod, "pkceMethod");
        this.token = token;
        this.pkceChallenge = pkceChallenge;
        this.pkceMethod = pkceMethod;
    }

    public /* synthetic */ SsoSignInMfaBody(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? "S256" : str3);
    }
}
