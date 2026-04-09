package Ab;

import Eb.CreateSsoUser;
import Eb.DeleteAccountRequest;
import Eb.DeleteAccountResponse;
import Eb.DeviceInfo;
import Eb.ForgotPasswordRequest;
import Eb.GenerateUsernamesRequest;
import Eb.GenerateUsernamesResponse;
import Eb.MfaPushNotificationBody;
import Eb.PasswordStrengthRequest;
import Eb.PasswordStrengthResponse;
import Eb.ResendVerificationEmailRequest;
import Eb.SsoSignInBody;
import Eb.SsoSignInMfaBody;
import Eb.SsoUser;
import Eb.TermsRevisions;
import Eb.TrustedDeviceBody;
import Rj.o;
import Rj.p;
import Rj.s;
import gg.AbstractC5912b;
import gg.z;
import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H'¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u00112\b\b\u0001\u0010\u001d\u001a\u00020\u00172\b\b\u0001\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0004H'¢\u0006\u0004\b#\u0010\fJ#\u0010'\u001a\u00020\u00112\b\b\u0001\u0010$\u001a\u00020\u00172\b\b\u0001\u0010&\u001a\u00020%H'¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\b\b\u0001\u0010*\u001a\u00020)H'¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00112\b\b\u0001\u0010\u001d\u001a\u00020\u0017H'¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u00112\b\b\u0001\u00100\u001a\u00020\u0017H'¢\u0006\u0004\b1\u0010/J\u001f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00042\b\b\u0001\u0010\u0003\u001a\u000202H'¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b6\u0010\fJ\u0019\u00108\u001a\u00020\u00112\b\b\u0001\u00107\u001a\u00020\u0017H'¢\u0006\u0004\b8\u0010/J\u0019\u00109\u001a\u00020\u00112\b\b\u0001\u00107\u001a\u00020\u0017H'¢\u0006\u0004\b9\u0010/J\u0019\u0010;\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020:H'¢\u0006\u0004\b;\u0010<¨\u0006="}, d2 = {"LAb/i;", "", "LEb/p;", "body", "Lgg/z;", "LEb/r;", "m", "(LEb/p;)Lgg/z;", "LEb/q;", SnmpConfigurator.O_RETRIES, "(LEb/q;)Lgg/z;", "g", "()Lgg/z;", "LEb/g;", SnmpConfigurator.O_AUTH_PROTOCOL, "LEb/t;", "deviceInfo", "Lgg/b;", "q", "(LEb/t;)Lgg/b;", "LEb/c;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(LEb/c;)Lgg/z;", "", "userIdOrSelf", "LEb/e;", "LEb/f;", "k", "(Ljava/lang/String;LEb/e;)Lgg/z;", "email", "LEb/o;", "resendVerificationEmailRequest", SnmpConfigurator.O_BIND_ADDRESS, "(Ljava/lang/String;LEb/o;)Lgg/b;", "LEb/s;", "d", "usernameOrEmail", "LEb/h;", "forgotPasswordRequest", "f", "(Ljava/lang/String;LEb/h;)Lgg/b;", "LEb/i;", "generateUsernamesRequest", "LEb/j;", "p", "(LEb/i;)Lgg/z;", SnmpConfigurator.O_CONTEXT_NAME, "(Ljava/lang/String;)Lgg/b;", "username", "i", "LEb/l;", "LEb/m;", SnmpConfigurator.O_COMMUNITY, "(LEb/l;)Lgg/z;", "j", "authenticatorId", "h", SnmpConfigurator.O_OPERATION, "LEb/k;", "l", "(LEb/k;)Lgg/b;", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface i {
    @Rj.f("/api/sso/v1/user/self/device")
    z<DeviceInfo> a();

    @p("/api/sso/v1/verify/email/{email}")
    AbstractC5912b b(@s("email") String email, @Rj.a ResendVerificationEmailRequest resendVerificationEmailRequest);

    @o("/api/sso/v1/password-strength")
    z<PasswordStrengthResponse> c(@Rj.a PasswordStrengthRequest body);

    @Rj.f("/api/sso/v1/legal")
    z<TermsRevisions> d();

    @o("/api/sso/v1/user")
    z<SsoUser> e(@Rj.a CreateSsoUser body);

    @o("/api/sso/v1/password/{username}")
    AbstractC5912b f(@s("username") String usernameOrEmail, @Rj.a ForgotPasswordRequest forgotPasswordRequest);

    @Rj.f("/api/sso/v1/user/self")
    z<SsoUser> g();

    @o("/api/sso/v1/user/self/mfa/email/{id}/send")
    AbstractC5912b h(@s("id") String authenticatorId);

    @Rj.f("/api/sso/v1/search/username/{username}")
    AbstractC5912b i(@s("username") String username);

    @Rj.f("/api/sso/v1/user/self/mfa/push/poll-login")
    z<SsoUser> j();

    @Rj.h(hasBody = true, method = "DELETE", path = "/api/sso/v1/user/{id}")
    z<DeleteAccountResponse> k(@s("id") String userIdOrSelf, @Rj.a DeleteAccountRequest body);

    @o("/api/sso/v1/user/self/mfa/push/send")
    AbstractC5912b l(@Rj.a MfaPushNotificationBody body);

    @o("/api/sso/v1/login")
    z<SsoUser> m(@Rj.a SsoSignInBody body);

    @Rj.f("/api/sso/v1/search/email/{email}")
    AbstractC5912b n(@s("email") String email);

    @o("/api/sso/v1/user/self/mfa/sms/{id}/send")
    AbstractC5912b o(@s("id") String authenticatorId);

    @o("/api/sso/v1/user/generator")
    z<GenerateUsernamesResponse> p(@Rj.a GenerateUsernamesRequest generateUsernamesRequest);

    @o("/api/sso/v1/user/self/device")
    AbstractC5912b q(@Rj.a TrustedDeviceBody deviceInfo);

    @o("/api/sso/v1/login/2fa")
    z<SsoUser> r(@Rj.a SsoSignInMfaBody body);
}
