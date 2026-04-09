package o4;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final y f55318a = new y();

    private y() {
    }

    static y a() {
        return f55318a;
    }

    public static y b(y yVar) throws GeneralSecurityException {
        if (yVar != null) {
            return yVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
