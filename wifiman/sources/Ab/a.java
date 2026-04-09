package Ab;

import Eb.CreateSsoUser;
import Eb.ForgotPasswordRequest;
import Eb.PasswordStrengthRequest;
import Eb.ResendVerificationEmailRequest;
import Eb.w;
import gg.AbstractC5912b;
import gg.z;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: Ab.a$a, reason: collision with other inner class name */
    public static final class C0015a {
        public static /* synthetic */ z a(a aVar, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mfaPollLogin");
            }
            if ((i10 & 1) != 0) {
                str = null;
            }
            return aVar.j(str);
        }

        public static /* synthetic */ z b(a aVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signIn");
            }
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            if ((i10 & 8) != 0) {
                z10 = true;
            }
            return aVar.r(str, str2, str3, z10);
        }
    }

    z a();

    AbstractC5912b b(String str, ResendVerificationEmailRequest oVar);

    z c(PasswordStrengthRequest lVar);

    z d();

    z e(CreateSsoUser c2674c);

    z f(String str, ForgotPasswordRequest hVar);

    z g();

    String h();

    z i(String str);

    z j(String str);

    AbstractC5912b k(String str);

    AbstractC5912b l(w.Sms sms);

    z m(String str);

    AbstractC5912b n(w.Email email);

    AbstractC5912b o();

    AbstractC5912b p();

    z q(String str, String str2);

    z r(String str, String str2, String str3, boolean z10);

    z s(String str);

    z t(String str);
}
