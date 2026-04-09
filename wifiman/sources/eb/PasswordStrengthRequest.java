package Eb;

import Zi.C0;
import Zi.C3704f;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u001d\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0016R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"LEb/l;", "", "", "password", "", "userInputs", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(LEb/l;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getPassword", "getPassword$annotations", "()V", "Ljava/util/List;", "getUserInputs", "()Ljava/util/List;", "getUserInputs$annotations", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.l, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class PasswordStrengthRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Vi.b[] f4473c = {null, new C3704f(W0.f25599a)};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String password;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List userInputs;

    /* renamed from: Eb.l$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4476a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4476a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.PasswordStrengthRequest", aVar, 2);
            h02.p("password", false);
            h02.p("user_inputs", true);
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
            return new Vi.b[]{W0.f25599a, Wi.a.u(PasswordStrengthRequest.f4473c[1])};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final PasswordStrengthRequest c(Yi.e decoder) {
            List list;
            String strW;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = PasswordStrengthRequest.f4473c;
            R0 r02 = null;
            if (cVarC.B()) {
                strW = cVarC.w(fVar, 0);
                list = (List) cVarC.h(fVar, 1, bVarArr[1], null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                String strW2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW2 = cVarC.w(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iK != 1) {
                            throw new UnknownFieldException(iK);
                        }
                        list2 = (List) cVarC.h(fVar, 1, bVarArr[1], list2);
                        i11 |= 2;
                    }
                }
                list = list2;
                strW = strW2;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new PasswordStrengthRequest(i10, strW, list, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, PasswordStrengthRequest value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            PasswordStrengthRequest.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.l$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f4476a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PasswordStrengthRequest(int i10, String str, List list, R0 r02) {
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, a.f4476a.a());
        }
        this.password = str;
        if ((i10 & 2) == 0) {
            this.userInputs = null;
        } else {
            this.userInputs = list;
        }
    }

    public static final /* synthetic */ void b(PasswordStrengthRequest self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f4473c;
        output.y(serialDesc, 0, self.password);
        if (!output.o(serialDesc, 1) && self.userInputs == null) {
            return;
        }
        output.t(serialDesc, 1, bVarArr[1], self.userInputs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PasswordStrengthRequest)) {
            return false;
        }
        PasswordStrengthRequest passwordStrengthRequest = (PasswordStrengthRequest) other;
        return AbstractC6492s.d(this.password, passwordStrengthRequest.password) && AbstractC6492s.d(this.userInputs, passwordStrengthRequest.userInputs);
    }

    public int hashCode() {
        int iHashCode = this.password.hashCode() * 31;
        List list = this.userInputs;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "PasswordStrengthRequest(password=" + this.password + ", userInputs=" + this.userInputs + ")";
    }

    public PasswordStrengthRequest(String password, List list) {
        AbstractC6492s.i(password, "password");
        this.password = password;
        this.userInputs = list;
    }
}
