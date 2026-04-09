package Eb;

import Eb.CredentialRequestOptions;
import Eb.User;
import Yg.J;
import Zg.AbstractC3689v;
import Zi.C0;
import Zi.C3704f;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import aj.AbstractC3868b;
import aj.C3871e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002%!BI\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"LEb/z;", "", "", "seen0", "LEb/C;", "user", "", "LEb/w;", "authenticators", "", "mfaCookie", "LEb/d;", "publicKeyCredentialRequestOptions", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILEb/C;Ljava/util/List;Ljava/lang/String;LEb/d;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "g", "(LEb/z;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "LEb/C;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()LEb/C;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/util/List;", "d", "()Ljava/util/List;", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "getMfaCookie", "LEb/d;", "getPublicKeyCredentialRequestOptions", "()LEb/d;", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.z, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class TwoFaRequiredResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Vi.b[] f4547e = {null, new C3704f(w.INSTANCE.serializer()), null, null};

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC3868b f4548f = aj.w.b(null, new InterfaceC6835l() { // from class: Eb.y
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return TwoFaRequiredResponse.f((C3871e) obj);
        }
    }, 1, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final User user;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List authenticators;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mfaCookie;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CredentialRequestOptions publicKeyCredentialRequestOptions;

    /* renamed from: Eb.z$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4553a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4553a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.TwoFaRequiredResponse", aVar, 4);
            h02.p("user", false);
            h02.p("authenticators", true);
            h02.p("mfaCookie", true);
            h02.p("publicKeyCredentialRequestOptions", true);
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
            return new Vi.b[]{User.a.f4420a, TwoFaRequiredResponse.f4547e[1], Wi.a.u(W0.f25599a), Wi.a.u(CredentialRequestOptions.a.f4453a)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final TwoFaRequiredResponse c(Yi.e decoder) {
            int i10;
            User user;
            List list;
            String str;
            CredentialRequestOptions credentialRequestOptions;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = TwoFaRequiredResponse.f4547e;
            User user2 = null;
            if (cVarC.B()) {
                User user3 = (User) cVarC.p(fVar, 0, User.a.f4420a, null);
                List list2 = (List) cVarC.p(fVar, 1, bVarArr[1], null);
                String str2 = (String) cVarC.h(fVar, 2, W0.f25599a, null);
                list = list2;
                user = user3;
                credentialRequestOptions = (CredentialRequestOptions) cVarC.h(fVar, 3, CredentialRequestOptions.a.f4453a, null);
                str = str2;
                i10 = 15;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list3 = null;
                String str3 = null;
                CredentialRequestOptions credentialRequestOptions2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        user2 = (User) cVarC.p(fVar, 0, User.a.f4420a, user2);
                        i11 |= 1;
                    } else if (iK == 1) {
                        list3 = (List) cVarC.p(fVar, 1, bVarArr[1], list3);
                        i11 |= 2;
                    } else if (iK == 2) {
                        str3 = (String) cVarC.h(fVar, 2, W0.f25599a, str3);
                        i11 |= 4;
                    } else {
                        if (iK != 3) {
                            throw new UnknownFieldException(iK);
                        }
                        credentialRequestOptions2 = (CredentialRequestOptions) cVarC.h(fVar, 3, CredentialRequestOptions.a.f4453a, credentialRequestOptions2);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                user = user2;
                list = list3;
                str = str3;
                credentialRequestOptions = credentialRequestOptions2;
            }
            cVarC.b(fVar);
            return new TwoFaRequiredResponse(i10, user, list, str, credentialRequestOptions, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, TwoFaRequiredResponse value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            TwoFaRequiredResponse.g(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.z$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TwoFaRequiredResponse a(String response) {
            AbstractC6492s.i(response, "response");
            AbstractC3868b abstractC3868b = TwoFaRequiredResponse.f4548f;
            abstractC3868b.a();
            return (TwoFaRequiredResponse) abstractC3868b.b(TwoFaRequiredResponse.INSTANCE.serializer(), response);
        }

        public final Vi.b serializer() {
            return a.f4553a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TwoFaRequiredResponse(int i10, User user, List list, String str, CredentialRequestOptions credentialRequestOptions, R0 r02) {
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, a.f4553a.a());
        }
        this.user = user;
        if ((i10 & 2) == 0) {
            this.authenticators = AbstractC3689v.l();
        } else {
            this.authenticators = list;
        }
        if ((i10 & 4) == 0) {
            this.mfaCookie = null;
        } else {
            this.mfaCookie = str;
        }
        if ((i10 & 8) == 0) {
            this.publicKeyCredentialRequestOptions = null;
        } else {
            this.publicKeyCredentialRequestOptions = credentialRequestOptions;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(C3871e Json) {
        AbstractC6492s.i(Json, "$this$Json");
        Json.f(true);
        cj.f fVar = new cj.f();
        fVar.i(w.INSTANCE.b());
        Json.h(fVar.h());
        return J.f24997a;
    }

    public static final /* synthetic */ void g(TwoFaRequiredResponse self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f4547e;
        output.q(serialDesc, 0, User.a.f4420a, self.user);
        if (output.o(serialDesc, 1) || !AbstractC6492s.d(self.authenticators, AbstractC3689v.l())) {
            output.q(serialDesc, 1, bVarArr[1], self.authenticators);
        }
        if (output.o(serialDesc, 2) || self.mfaCookie != null) {
            output.t(serialDesc, 2, W0.f25599a, self.mfaCookie);
        }
        if (!output.o(serialDesc, 3) && self.publicKeyCredentialRequestOptions == null) {
            return;
        }
        output.t(serialDesc, 3, CredentialRequestOptions.a.f4453a, self.publicKeyCredentialRequestOptions);
    }

    /* renamed from: d, reason: from getter */
    public final List getAuthenticators() {
        return this.authenticators;
    }

    /* renamed from: e, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwoFaRequiredResponse)) {
            return false;
        }
        TwoFaRequiredResponse twoFaRequiredResponse = (TwoFaRequiredResponse) other;
        return AbstractC6492s.d(this.user, twoFaRequiredResponse.user) && AbstractC6492s.d(this.authenticators, twoFaRequiredResponse.authenticators) && AbstractC6492s.d(this.mfaCookie, twoFaRequiredResponse.mfaCookie) && AbstractC6492s.d(this.publicKeyCredentialRequestOptions, twoFaRequiredResponse.publicKeyCredentialRequestOptions);
    }

    public int hashCode() {
        int iHashCode = ((this.user.hashCode() * 31) + this.authenticators.hashCode()) * 31;
        String str = this.mfaCookie;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CredentialRequestOptions credentialRequestOptions = this.publicKeyCredentialRequestOptions;
        return iHashCode2 + (credentialRequestOptions != null ? credentialRequestOptions.hashCode() : 0);
    }

    public String toString() {
        return "TwoFaRequiredResponse(user=" + this.user + ", authenticators=" + this.authenticators + ", mfaCookie=" + this.mfaCookie + ", publicKeyCredentialRequestOptions=" + this.publicKeyCredentialRequestOptions + ")";
    }
}
