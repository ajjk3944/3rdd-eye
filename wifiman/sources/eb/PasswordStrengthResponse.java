package Eb;

import Zi.C0;
import Zi.C3704f;
import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W;
import Zi.W0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002\u001e$BE\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b&\u0010#\u001a\u0004\b$\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010#\u001a\u0004\b)\u0010\u0018R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010+\u0012\u0004\b-\u0010#\u001a\u0004\b'\u0010,¨\u0006/"}, d2 = {"LEb/m;", "", "", "seen0", "", "isAcceptable", "score", "", "warning", "", "suggestions", "LZi/R0;", "serializationConstructorMarker", "<init>", "(IZILjava/lang/String;Ljava/util/List;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "f", "(LEb/m;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Z", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Z", "isAcceptable$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "I", "getScore$annotations", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "d", "getWarning$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getSuggestions$annotations", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.m, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class PasswordStrengthResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Vi.b[] f4477e = {null, null, null, new C3704f(W0.f25599a)};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAcceptable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int score;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String warning;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List suggestions;

    /* renamed from: Eb.m$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4482a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4482a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.PasswordStrengthResponse", aVar, 4);
            h02.p("is_acceptable_password", false);
            h02.p("score", false);
            h02.p("warning", false);
            h02.p("suggestions", false);
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
            return new Vi.b[]{C3710i.f25639a, W.f25597a, W0.f25599a, PasswordStrengthResponse.f4477e[3]};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final PasswordStrengthResponse c(Yi.e decoder) {
            boolean z10;
            int i10;
            int i11;
            String str;
            List list;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = PasswordStrengthResponse.f4477e;
            if (cVarC.B()) {
                boolean zU = cVarC.u(fVar, 0);
                int i12 = cVarC.i(fVar, 1);
                String strW = cVarC.w(fVar, 2);
                list = (List) cVarC.p(fVar, 3, bVarArr[3], null);
                z10 = zU;
                str = strW;
                i10 = 15;
                i11 = i12;
            } else {
                boolean z11 = true;
                boolean zU2 = false;
                int i13 = 0;
                String strW2 = null;
                List list2 = null;
                int i14 = 0;
                while (z11) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z11 = false;
                    } else if (iK == 0) {
                        zU2 = cVarC.u(fVar, 0);
                        i14 |= 1;
                    } else if (iK == 1) {
                        i13 = cVarC.i(fVar, 1);
                        i14 |= 2;
                    } else if (iK == 2) {
                        strW2 = cVarC.w(fVar, 2);
                        i14 |= 4;
                    } else {
                        if (iK != 3) {
                            throw new UnknownFieldException(iK);
                        }
                        list2 = (List) cVarC.p(fVar, 3, bVarArr[3], list2);
                        i14 |= 8;
                    }
                }
                z10 = zU2;
                i10 = i14;
                i11 = i13;
                str = strW2;
                list = list2;
            }
            cVarC.b(fVar);
            return new PasswordStrengthResponse(i10, z10, i11, str, list, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, PasswordStrengthResponse value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            PasswordStrengthResponse.f(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.m$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f4482a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PasswordStrengthResponse(int i10, boolean z10, int i11, String str, List list, R0 r02) {
        if (15 != (i10 & 15)) {
            C0.a(i10, 15, a.f4482a.a());
        }
        this.isAcceptable = z10;
        this.score = i11;
        this.warning = str;
        this.suggestions = list;
    }

    public static final /* synthetic */ void f(PasswordStrengthResponse self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f4477e;
        output.i(serialDesc, 0, self.isAcceptable);
        output.C(serialDesc, 1, self.score);
        output.y(serialDesc, 2, self.warning);
        output.q(serialDesc, 3, bVarArr[3], self.suggestions);
    }

    /* renamed from: b, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* renamed from: c, reason: from getter */
    public final List getSuggestions() {
        return this.suggestions;
    }

    /* renamed from: d, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsAcceptable() {
        return this.isAcceptable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PasswordStrengthResponse)) {
            return false;
        }
        PasswordStrengthResponse passwordStrengthResponse = (PasswordStrengthResponse) other;
        return this.isAcceptable == passwordStrengthResponse.isAcceptable && this.score == passwordStrengthResponse.score && AbstractC6492s.d(this.warning, passwordStrengthResponse.warning) && AbstractC6492s.d(this.suggestions, passwordStrengthResponse.suggestions);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isAcceptable) * 31) + Integer.hashCode(this.score)) * 31) + this.warning.hashCode()) * 31) + this.suggestions.hashCode();
    }

    public String toString() {
        return "PasswordStrengthResponse(isAcceptable=" + this.isAcceptable + ", score=" + this.score + ", warning=" + this.warning + ", suggestions=" + this.suggestions + ")";
    }
}
