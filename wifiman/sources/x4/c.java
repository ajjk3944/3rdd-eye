package x4;

import com.google.crypto.tink.config.internal.b;
import java.security.GeneralSecurityException;
import w4.C8264i;
import w4.InterfaceC8262g;

/* loaded from: classes3.dex */
public final class c implements InterfaceC8262g {

    /* renamed from: b, reason: collision with root package name */
    private static final b.EnumC1214b f65332b = b.EnumC1214b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    private final C8264i f65333a;

    public c(C8264i c8264i) throws GeneralSecurityException {
        if (!f65332b.isCompatible()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f65333a = c8264i;
    }
}
