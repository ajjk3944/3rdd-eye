package ga;

import Eb.SsoUser;
import Gb.f;
import com.ui.core.ui.sso.UiSSO;
import ia.AbstractC6138a;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ga.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5884a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5884a f47755a = new C5884a();

    private C5884a() {
    }

    public static /* synthetic */ UiSSO.a b(C5884a c5884a, SsoUser ssoUser, f fVar, UiSSO.e eVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c5884a.a(ssoUser, fVar, eVar, z10);
    }

    public final UiSSO.a a(SsoUser user, f ssoStorage, UiSSO.e eVar, boolean z10) {
        String strA;
        AbstractC6492s.i(user, "user");
        AbstractC6492s.i(ssoStorage, "ssoStorage");
        String strS = ssoStorage.s();
        if (strS == null) {
            throw new UiSSO.Error.InvalidMFAParams("missing UBIC_AUTH cookie after successful authentication");
        }
        String strR = ssoStorage.r();
        if (strR == null) {
            throw new UiSSO.Error.InvalidMFAParams("missing oAuthToken after successful authentication");
        }
        String strJ = ssoStorage.j();
        if (strJ == null) {
            throw new UiSSO.Error.MissingSsoPassword();
        }
        if (!AbstractC6138a.a(eVar)) {
            return new UiSSO.a.Cookie(user, strS, strR, strJ, c(ssoStorage), z10);
        }
        UiSSO.DeviceIdentifiers deviceIdentifiersC = c(ssoStorage);
        if (eVar == null || (strA = eVar.a()) == null) {
            throw new UiSSO.Error.InvalidMFAParams("missing method after successful authentication");
        }
        String strX = ssoStorage.x();
        if (strX != null) {
            return new UiSSO.a.PKCECookie(user, strS, strR, strJ, deviceIdentifiersC, z10, strA, strX);
        }
        throw new UiSSO.Error.InvalidMFAParams("missing pkceCodeVerifier after successful authentication");
    }

    public final UiSSO.DeviceIdentifiers c(f ssoStorage) {
        AbstractC6492s.i(ssoStorage, "ssoStorage");
        String strP = ssoStorage.p();
        if (strP == null) {
            throw new UiSSO.Error.InvalidMFAParams("missing deviceId after successful authentication");
        }
        String strA = ssoStorage.a();
        if (strA == null) {
            throw new UiSSO.Error.InvalidMFAParams("missing deviceName after successful authentication");
        }
        String strA2 = ssoStorage.A();
        if (strA2 != null) {
            return new UiSSO.DeviceIdentifiers(strP, strA, strA2);
        }
        throw new UiSSO.Error.InvalidMFAParams("missing deviceModel after successful authentication");
    }
}
