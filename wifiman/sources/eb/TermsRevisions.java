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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\u001c\u001eB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0015R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u0012\u0004\b!\u0010 \u001a\u0004\b\u001c\u0010\u0015R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0015¨\u0006%"}, d2 = {"LEb/s;", "", "", "seen0", "", "termsRevision", "privacyRevision", "airCrmTermsRevision", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(LEb/s;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "getTermsRevision$annotations", "()V", "getPrivacyRevision$annotations", "getAirCrmTermsRevision", "getAirCrmTermsRevision$annotations", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.s, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class TermsRevisions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsRevision;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String privacyRevision;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String airCrmTermsRevision;

    /* renamed from: Eb.s$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4512a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4512a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.TermsRevisions", aVar, 3);
            h02.p("rev_terms", false);
            h02.p("rev_privacy", false);
            h02.p("rev_terms_aircrm", false);
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
        public final TermsRevisions c(Yi.e decoder) {
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
            return new TermsRevisions(i10, str, str2, strW, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, TermsRevisions value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            TermsRevisions.c(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.s$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f4512a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TermsRevisions(int i10, String str, String str2, String str3, R0 r02) {
        if (7 != (i10 & 7)) {
            C0.a(i10, 7, a.f4512a.a());
        }
        this.termsRevision = str;
        this.privacyRevision = str2;
        this.airCrmTermsRevision = str3;
    }

    public static final /* synthetic */ void c(TermsRevisions self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.termsRevision);
        output.y(serialDesc, 1, self.privacyRevision);
        output.y(serialDesc, 2, self.airCrmTermsRevision);
    }

    /* renamed from: a, reason: from getter */
    public final String getPrivacyRevision() {
        return this.privacyRevision;
    }

    /* renamed from: b, reason: from getter */
    public final String getTermsRevision() {
        return this.termsRevision;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TermsRevisions)) {
            return false;
        }
        TermsRevisions termsRevisions = (TermsRevisions) other;
        return AbstractC6492s.d(this.termsRevision, termsRevisions.termsRevision) && AbstractC6492s.d(this.privacyRevision, termsRevisions.privacyRevision) && AbstractC6492s.d(this.airCrmTermsRevision, termsRevisions.airCrmTermsRevision);
    }

    public int hashCode() {
        return (((this.termsRevision.hashCode() * 31) + this.privacyRevision.hashCode()) * 31) + this.airCrmTermsRevision.hashCode();
    }

    public String toString() {
        return "TermsRevisions(termsRevision=" + this.termsRevision + ", privacyRevision=" + this.privacyRevision + ", airCrmTermsRevision=" + this.airCrmTermsRevision + ")";
    }
}
