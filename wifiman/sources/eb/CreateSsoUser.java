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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002'\u001eBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010!R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010!R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b'\u0010!R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010(\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010!R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010(\u0012\u0004\b5\u0010+\u001a\u0004\b4\u0010!R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010(\u0012\u0004\b8\u0010+\u001a\u0004\b7\u0010!R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010(\u0012\u0004\b;\u0010+\u001a\u0004\b:\u0010!R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010(\u0012\u0004\b>\u0010+\u001a\u0004\b=\u0010!R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010(\u0012\u0004\bA\u0010+\u001a\u0004\b@\u0010!R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010+\u001a\u0004\bD\u0010ER \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010(\u0012\u0004\bI\u0010+\u001a\u0004\bH\u0010!R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010(\u0012\u0004\bL\u0010+\u001a\u0004\bK\u0010!R \u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u0010C\u0012\u0004\bO\u0010+\u001a\u0004\bN\u0010E¨\u0006Q"}, d2 = {"LEb/c;", "", "", "username", "email", "password", "firstName", "lastName", "captcha", "siteKey", "acceptedTermsRevision", "acceptedPrivacyRevision", "", "mailinglist", "phone", "acceptedAirCrmTermsRevision", "agreedToTerms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(LEb/c;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getUsername", "getUsername$annotations", "()V", "getEmail", "getEmail$annotations", SnmpConfigurator.O_COMMUNITY, "getPassword$annotations", "d", "getFirstName", "getFirstName$annotations", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getLastName", "getLastName$annotations", "f", "getCaptcha", "getCaptcha$annotations", "g", "getSiteKey", "getSiteKey$annotations", "h", "getAcceptedTermsRevision", "getAcceptedTermsRevision$annotations", "i", "getAcceptedPrivacyRevision", "getAcceptedPrivacyRevision$annotations", "j", "Z", "getMailinglist", "()Z", "getMailinglist$annotations", "k", "getPhone", "getPhone$annotations", "l", "getAcceptedAirCrmTermsRevision", "getAcceptedAirCrmTermsRevision$annotations", "m", "getAgreedToTerms", "getAgreedToTerms$annotations", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class CreateSsoUser {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String username;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String password;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String captcha;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String siteKey;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String acceptedTermsRevision;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String acceptedPrivacyRevision;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean mailinglist;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String acceptedAirCrmTermsRevision;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean agreedToTerms;

    /* renamed from: Eb.c$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4446a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4446a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.CreateSsoUser", aVar, 13);
            h02.p("username", false);
            h02.p("email", false);
            h02.p("password", false);
            h02.p("first_name", false);
            h02.p("last_name", false);
            h02.p("captcha", false);
            h02.p("site_key", false);
            h02.p("curr_terms_rev", false);
            h02.p("curr_privacy_rev", false);
            h02.p("mailinglist", false);
            h02.p("phone", true);
            h02.p("curr_terms_aircrm_rev", true);
            h02.p("agreedToTerms", true);
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
            C3710i c3710i = C3710i.f25639a;
            return new Vi.b[]{w02, w02, w02, w02, w02, w02, w02, w02, w02, c3710i, w02, w02, c3710i};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final CreateSsoUser c(Yi.e decoder) {
            String str;
            int i10;
            boolean zU;
            String str2;
            String str3;
            boolean z10;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i11 = 0;
            if (cVarC.B()) {
                String strW = cVarC.w(fVar, 0);
                String strW2 = cVarC.w(fVar, 1);
                String strW3 = cVarC.w(fVar, 2);
                String strW4 = cVarC.w(fVar, 3);
                String strW5 = cVarC.w(fVar, 4);
                String strW6 = cVarC.w(fVar, 5);
                String strW7 = cVarC.w(fVar, 6);
                String strW8 = cVarC.w(fVar, 7);
                String strW9 = cVarC.w(fVar, 8);
                boolean zU2 = cVarC.u(fVar, 9);
                String strW10 = cVarC.w(fVar, 10);
                String strW11 = cVarC.w(fVar, 11);
                str = strW;
                zU = cVarC.u(fVar, 12);
                str2 = strW11;
                str3 = strW10;
                z10 = zU2;
                str4 = strW8;
                str5 = strW7;
                str6 = strW6;
                str7 = strW4;
                str8 = strW9;
                str9 = strW5;
                str10 = strW3;
                str11 = strW2;
                i10 = 8191;
            } else {
                String strW12 = null;
                String strW13 = null;
                String strW14 = null;
                String strW15 = null;
                String strW16 = null;
                String strW17 = null;
                String strW18 = null;
                String strW19 = null;
                String strW20 = null;
                String strW21 = null;
                String strW22 = null;
                boolean z11 = true;
                boolean zU3 = false;
                boolean zU4 = false;
                while (z11) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            z11 = false;
                            break;
                        case 0:
                            i11 |= 1;
                            strW12 = cVarC.w(fVar, 0);
                            continue;
                        case 1:
                            strW22 = cVarC.w(fVar, 1);
                            i11 |= 2;
                            continue;
                        case 2:
                            strW21 = cVarC.w(fVar, 2);
                            i11 |= 4;
                            break;
                        case 3:
                            strW18 = cVarC.w(fVar, 3);
                            i11 |= 8;
                            break;
                        case 4:
                            strW20 = cVarC.w(fVar, 4);
                            i11 |= 16;
                            break;
                        case 5:
                            strW17 = cVarC.w(fVar, 5);
                            i11 |= 32;
                            break;
                        case 6:
                            strW16 = cVarC.w(fVar, 6);
                            i11 |= 64;
                            break;
                        case 7:
                            strW15 = cVarC.w(fVar, 7);
                            i11 |= 128;
                            break;
                        case 8:
                            strW19 = cVarC.w(fVar, 8);
                            i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            break;
                        case 9:
                            zU4 = cVarC.u(fVar, 9);
                            i11 |= 512;
                            break;
                        case 10:
                            strW14 = cVarC.w(fVar, 10);
                            i11 |= 1024;
                            break;
                        case 11:
                            strW13 = cVarC.w(fVar, 11);
                            i11 |= 2048;
                            break;
                        case 12:
                            zU3 = cVarC.u(fVar, 12);
                            i11 |= 4096;
                            break;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                str = strW12;
                i10 = i11;
                zU = zU3;
                str2 = strW13;
                str3 = strW14;
                z10 = zU4;
                str4 = strW15;
                str5 = strW16;
                str6 = strW17;
                str7 = strW18;
                str8 = strW19;
                str9 = strW20;
                str10 = strW21;
                str11 = strW22;
            }
            cVarC.b(fVar);
            return new CreateSsoUser(i10, str, str11, str10, str7, str9, str6, str5, str4, str8, z10, str3, str2, zU, (R0) null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, CreateSsoUser value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            CreateSsoUser.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f4446a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreateSsoUser(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10, String str11, boolean z11, R0 r02) {
        if (1023 != (i10 & 1023)) {
            C0.a(i10, 1023, a.f4446a.a());
        }
        this.username = str;
        this.email = str2;
        this.password = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.captcha = str6;
        this.siteKey = str7;
        this.acceptedTermsRevision = str8;
        this.acceptedPrivacyRevision = str9;
        this.mailinglist = z10;
        if ((i10 & 1024) == 0) {
            this.phone = "";
        } else {
            this.phone = str10;
        }
        if ((i10 & 2048) == 0) {
            this.acceptedAirCrmTermsRevision = "";
        } else {
            this.acceptedAirCrmTermsRevision = str11;
        }
        this.agreedToTerms = (i10 & 4096) == 0 ? true : z11;
    }

    public static final /* synthetic */ void b(CreateSsoUser self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.username);
        output.y(serialDesc, 1, self.email);
        output.y(serialDesc, 2, self.password);
        output.y(serialDesc, 3, self.firstName);
        output.y(serialDesc, 4, self.lastName);
        output.y(serialDesc, 5, self.captcha);
        output.y(serialDesc, 6, self.siteKey);
        output.y(serialDesc, 7, self.acceptedTermsRevision);
        output.y(serialDesc, 8, self.acceptedPrivacyRevision);
        output.i(serialDesc, 9, self.mailinglist);
        if (output.o(serialDesc, 10) || !AbstractC6492s.d(self.phone, "")) {
            output.y(serialDesc, 10, self.phone);
        }
        if (output.o(serialDesc, 11) || !AbstractC6492s.d(self.acceptedAirCrmTermsRevision, "")) {
            output.y(serialDesc, 11, self.acceptedAirCrmTermsRevision);
        }
        if (!output.o(serialDesc, 12) && self.agreedToTerms) {
            return;
        }
        output.i(serialDesc, 12, self.agreedToTerms);
    }

    /* renamed from: a, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateSsoUser)) {
            return false;
        }
        CreateSsoUser createSsoUser = (CreateSsoUser) other;
        return AbstractC6492s.d(this.username, createSsoUser.username) && AbstractC6492s.d(this.email, createSsoUser.email) && AbstractC6492s.d(this.password, createSsoUser.password) && AbstractC6492s.d(this.firstName, createSsoUser.firstName) && AbstractC6492s.d(this.lastName, createSsoUser.lastName) && AbstractC6492s.d(this.captcha, createSsoUser.captcha) && AbstractC6492s.d(this.siteKey, createSsoUser.siteKey) && AbstractC6492s.d(this.acceptedTermsRevision, createSsoUser.acceptedTermsRevision) && AbstractC6492s.d(this.acceptedPrivacyRevision, createSsoUser.acceptedPrivacyRevision) && this.mailinglist == createSsoUser.mailinglist && AbstractC6492s.d(this.phone, createSsoUser.phone) && AbstractC6492s.d(this.acceptedAirCrmTermsRevision, createSsoUser.acceptedAirCrmTermsRevision) && this.agreedToTerms == createSsoUser.agreedToTerms;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.username.hashCode() * 31) + this.email.hashCode()) * 31) + this.password.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.captcha.hashCode()) * 31) + this.siteKey.hashCode()) * 31) + this.acceptedTermsRevision.hashCode()) * 31) + this.acceptedPrivacyRevision.hashCode()) * 31) + Boolean.hashCode(this.mailinglist)) * 31) + this.phone.hashCode()) * 31) + this.acceptedAirCrmTermsRevision.hashCode()) * 31) + Boolean.hashCode(this.agreedToTerms);
    }

    public String toString() {
        return "CreateSsoUser(username=" + this.username + ", email=" + this.email + ", password=" + this.password + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", captcha=" + this.captcha + ", siteKey=" + this.siteKey + ", acceptedTermsRevision=" + this.acceptedTermsRevision + ", acceptedPrivacyRevision=" + this.acceptedPrivacyRevision + ", mailinglist=" + this.mailinglist + ", phone=" + this.phone + ", acceptedAirCrmTermsRevision=" + this.acceptedAirCrmTermsRevision + ", agreedToTerms=" + this.agreedToTerms + ")";
    }

    public CreateSsoUser(String username, String email, String password, String firstName, String lastName, String captcha, String siteKey, String acceptedTermsRevision, String acceptedPrivacyRevision, boolean z10, String phone, String acceptedAirCrmTermsRevision, boolean z11) {
        AbstractC6492s.i(username, "username");
        AbstractC6492s.i(email, "email");
        AbstractC6492s.i(password, "password");
        AbstractC6492s.i(firstName, "firstName");
        AbstractC6492s.i(lastName, "lastName");
        AbstractC6492s.i(captcha, "captcha");
        AbstractC6492s.i(siteKey, "siteKey");
        AbstractC6492s.i(acceptedTermsRevision, "acceptedTermsRevision");
        AbstractC6492s.i(acceptedPrivacyRevision, "acceptedPrivacyRevision");
        AbstractC6492s.i(phone, "phone");
        AbstractC6492s.i(acceptedAirCrmTermsRevision, "acceptedAirCrmTermsRevision");
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.captcha = captcha;
        this.siteKey = siteKey;
        this.acceptedTermsRevision = acceptedTermsRevision;
        this.acceptedPrivacyRevision = acceptedPrivacyRevision;
        this.mailinglist = z10;
        this.phone = phone;
        this.acceptedAirCrmTermsRevision = acceptedAirCrmTermsRevision;
        this.agreedToTerms = z11;
    }

    public /* synthetic */ CreateSsoUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10, String str11, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, z10, (i10 & 1024) != 0 ? "" : str10, (i10 & 2048) != 0 ? "" : str11, (i10 & 4096) != 0 ? true : z11);
    }
}
