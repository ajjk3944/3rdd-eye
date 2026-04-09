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
import org.conscrypt.PSKKeyManager;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0002#&B{\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010$\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010$\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001dR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010.\u0012\u0004\b1\u0010+\u001a\u0004\b/\u00100R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010.\u0012\u0004\b3\u0010+\u001a\u0004\b2\u00100R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010$\u0012\u0004\b4\u0010+\u001a\u0004\b#\u0010\u001dR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010$\u0012\u0004\b6\u0010+\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b5\u0010\u001d¨\u00068"}, d2 = {"LEb/r;", "", "", "seen0", "", "username", "picture", "firstName", "lastName", "", "twofaEnabled", "isVerified", "currentPrivacyRevision", "currentTermsRevision", "email", "uuid", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "j", "(LEb/r;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "g", SnmpConfigurator.O_BIND_ADDRESS, "f", SnmpConfigurator.O_COMMUNITY, "d", "getFirstName$annotations", "()V", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getLastName$annotations", "Z", "getTwofaEnabled", "()Z", "getTwofaEnabled$annotations", "i", "isVerified$annotations", "getCurrentPrivacyRevision$annotations", "h", "getCurrentTermsRevision$annotations", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.r, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class SsoUser {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String username;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String picture;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean twofaEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVerified;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentPrivacyRevision;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentTermsRevision;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uuid;

    /* renamed from: Eb.r$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4508a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4508a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.SsoUser", aVar, 10);
            h02.p("username", false);
            h02.p("picture", true);
            h02.p("first_name", true);
            h02.p("last_name", true);
            h02.p("twofa_enabled", false);
            h02.p("is_verified", false);
            h02.p("curr_privacy_rev", true);
            h02.p("curr_terms_rev", true);
            h02.p("email", false);
            h02.p("uuid", false);
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
            Vi.b bVarU = Wi.a.u(w02);
            Vi.b bVarU2 = Wi.a.u(w02);
            Vi.b bVarU3 = Wi.a.u(w02);
            Vi.b bVarU4 = Wi.a.u(w02);
            Vi.b bVarU5 = Wi.a.u(w02);
            C3710i c3710i = C3710i.f25639a;
            return new Vi.b[]{w02, bVarU, bVarU2, bVarU3, c3710i, c3710i, bVarU4, bVarU5, w02, w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final SsoUser c(Yi.e decoder) {
            boolean z10;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z11;
            int i10;
            String str6;
            String str7;
            String strW;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i11 = 9;
            int i12 = 7;
            if (cVarC.B()) {
                String strW2 = cVarC.w(fVar, 0);
                W0 w02 = W0.f25599a;
                String str8 = (String) cVarC.h(fVar, 1, w02, null);
                String str9 = (String) cVarC.h(fVar, 2, w02, null);
                String str10 = (String) cVarC.h(fVar, 3, w02, null);
                boolean zU = cVarC.u(fVar, 4);
                boolean zU2 = cVarC.u(fVar, 5);
                String str11 = (String) cVarC.h(fVar, 6, w02, null);
                String str12 = (String) cVarC.h(fVar, 7, w02, null);
                String strW3 = cVarC.w(fVar, 8);
                str6 = strW2;
                strW = cVarC.w(fVar, 9);
                str2 = str12;
                str = str11;
                z10 = zU2;
                str3 = str10;
                str7 = strW3;
                z11 = zU;
                str4 = str9;
                str5 = str8;
                i10 = 1023;
            } else {
                boolean z12 = true;
                boolean zU3 = false;
                int i13 = 0;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String strW4 = null;
                String strW5 = null;
                String strW6 = null;
                String str17 = null;
                boolean zU4 = false;
                while (z12) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            z12 = false;
                            i11 = 9;
                        case 0:
                            strW4 = cVarC.w(fVar, 0);
                            i13 |= 1;
                            i11 = 9;
                            i12 = 7;
                        case 1:
                            str17 = (String) cVarC.h(fVar, 1, W0.f25599a, str17);
                            i13 |= 2;
                            i11 = 9;
                            i12 = 7;
                        case 2:
                            str16 = (String) cVarC.h(fVar, 2, W0.f25599a, str16);
                            i13 |= 4;
                            i11 = 9;
                            i12 = 7;
                        case 3:
                            str15 = (String) cVarC.h(fVar, 3, W0.f25599a, str15);
                            i13 |= 8;
                            i11 = 9;
                            i12 = 7;
                        case 4:
                            i13 |= 16;
                            zU4 = cVarC.u(fVar, 4);
                        case 5:
                            zU3 = cVarC.u(fVar, 5);
                            i13 |= 32;
                        case 6:
                            str13 = (String) cVarC.h(fVar, 6, W0.f25599a, str13);
                            i13 |= 64;
                        case 7:
                            str14 = (String) cVarC.h(fVar, i12, W0.f25599a, str14);
                            i13 |= 128;
                        case 8:
                            strW5 = cVarC.w(fVar, 8);
                            i13 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        case 9:
                            strW6 = cVarC.w(fVar, i11);
                            i13 |= 512;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                z10 = zU3;
                str = str13;
                str2 = str14;
                str3 = str15;
                str4 = str16;
                str5 = str17;
                z11 = zU4;
                i10 = i13;
                str6 = strW4;
                str7 = strW5;
                strW = strW6;
            }
            cVarC.b(fVar);
            return new SsoUser(i10, str6, str5, str4, str3, z11, z10, str, str2, str7, strW, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, SsoUser value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            SsoUser.j(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.r$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f4508a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SsoUser(int i10, String str, String str2, String str3, String str4, boolean z10, boolean z11, String str5, String str6, String str7, String str8, R0 r02) {
        if (817 != (i10 & 817)) {
            C0.a(i10, 817, a.f4508a.a());
        }
        this.username = str;
        if ((i10 & 2) == 0) {
            this.picture = null;
        } else {
            this.picture = str2;
        }
        if ((i10 & 4) == 0) {
            this.firstName = null;
        } else {
            this.firstName = str3;
        }
        if ((i10 & 8) == 0) {
            this.lastName = null;
        } else {
            this.lastName = str4;
        }
        this.twofaEnabled = z10;
        this.isVerified = z11;
        if ((i10 & 64) == 0) {
            this.currentPrivacyRevision = null;
        } else {
            this.currentPrivacyRevision = str5;
        }
        if ((i10 & 128) == 0) {
            this.currentTermsRevision = null;
        } else {
            this.currentTermsRevision = str6;
        }
        this.email = str7;
        this.uuid = str8;
    }

    public static final /* synthetic */ void j(SsoUser self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.username);
        if (output.o(serialDesc, 1) || self.picture != null) {
            output.t(serialDesc, 1, W0.f25599a, self.picture);
        }
        if (output.o(serialDesc, 2) || self.firstName != null) {
            output.t(serialDesc, 2, W0.f25599a, self.firstName);
        }
        if (output.o(serialDesc, 3) || self.lastName != null) {
            output.t(serialDesc, 3, W0.f25599a, self.lastName);
        }
        output.i(serialDesc, 4, self.twofaEnabled);
        output.i(serialDesc, 5, self.isVerified);
        if (output.o(serialDesc, 6) || self.currentPrivacyRevision != null) {
            output.t(serialDesc, 6, W0.f25599a, self.currentPrivacyRevision);
        }
        if (output.o(serialDesc, 7) || self.currentTermsRevision != null) {
            output.t(serialDesc, 7, W0.f25599a, self.currentTermsRevision);
        }
        output.y(serialDesc, 8, self.email);
        output.y(serialDesc, 9, self.uuid);
    }

    /* renamed from: a, reason: from getter */
    public final String getCurrentPrivacyRevision() {
        return this.currentPrivacyRevision;
    }

    /* renamed from: b, reason: from getter */
    public final String getCurrentTermsRevision() {
        return this.currentTermsRevision;
    }

    /* renamed from: c, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: d, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: e, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SsoUser)) {
            return false;
        }
        SsoUser ssoUser = (SsoUser) other;
        return AbstractC6492s.d(this.username, ssoUser.username) && AbstractC6492s.d(this.picture, ssoUser.picture) && AbstractC6492s.d(this.firstName, ssoUser.firstName) && AbstractC6492s.d(this.lastName, ssoUser.lastName) && this.twofaEnabled == ssoUser.twofaEnabled && this.isVerified == ssoUser.isVerified && AbstractC6492s.d(this.currentPrivacyRevision, ssoUser.currentPrivacyRevision) && AbstractC6492s.d(this.currentTermsRevision, ssoUser.currentTermsRevision) && AbstractC6492s.d(this.email, ssoUser.email) && AbstractC6492s.d(this.uuid, ssoUser.uuid);
    }

    /* renamed from: f, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* renamed from: g, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: h, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iHashCode = this.username.hashCode() * 31;
        String str = this.picture;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode4 = (((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.twofaEnabled)) * 31) + Boolean.hashCode(this.isVerified)) * 31;
        String str4 = this.currentPrivacyRevision;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currentTermsRevision;
        return ((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.email.hashCode()) * 31) + this.uuid.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    public String toString() {
        return "SsoUser(username=" + this.username + ", picture=" + this.picture + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", twofaEnabled=" + this.twofaEnabled + ", isVerified=" + this.isVerified + ", currentPrivacyRevision=" + this.currentPrivacyRevision + ", currentTermsRevision=" + this.currentTermsRevision + ", email=" + this.email + ", uuid=" + this.uuid + ")";
    }
}
