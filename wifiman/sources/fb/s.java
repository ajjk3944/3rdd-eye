package fb;

import Gb.LocalLoginToken;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f47291a;

    /* renamed from: b, reason: collision with root package name */
    private final Gb.f f47292b;

    /* renamed from: c, reason: collision with root package name */
    private LocalLoginToken f47293c;

    public s(String macAddress, Gb.f storage) {
        AbstractC6492s.i(macAddress, "macAddress");
        AbstractC6492s.i(storage, "storage");
        this.f47291a = macAddress;
        this.f47292b = storage;
    }

    private final LocalLoginToken b() {
        LocalLoginToken localLoginTokenE = this.f47292b.E();
        if (localLoginTokenE == null || !AbstractC6492s.d(localLoginTokenE.getMacAddress(), this.f47291a)) {
            return null;
        }
        return localLoginTokenE;
    }

    public final String a() {
        LocalLoginToken localLoginTokenB = this.f47293c;
        if (localLoginTokenB == null) {
            localLoginTokenB = b();
        }
        if (localLoginTokenB != null) {
            return localLoginTokenB.getToken();
        }
        return null;
    }

    public final void c(String token) {
        AbstractC6492s.i(token, "token");
        LocalLoginToken localLoginToken = this.f47293c;
        if (AbstractC6492s.d(localLoginToken != null ? localLoginToken.getMacAddress() : null, this.f47291a)) {
            LocalLoginToken localLoginToken2 = this.f47293c;
            if (AbstractC6492s.d(localLoginToken2 != null ? localLoginToken2.getToken() : null, token)) {
                return;
            }
        }
        LocalLoginToken localLoginToken3 = new LocalLoginToken(this.f47291a, token);
        this.f47293c = localLoginToken3;
        this.f47292b.i(localLoginToken3);
    }
}
