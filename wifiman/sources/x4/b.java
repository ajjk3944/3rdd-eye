package x4;

import com.google.crypto.tink.config.internal.b;
import java.security.GeneralSecurityException;
import w4.C8256a;
import w4.InterfaceC8262g;

/* loaded from: classes3.dex */
public final class b implements InterfaceC8262g {

    /* renamed from: b, reason: collision with root package name */
    private static final b.EnumC1214b f65330b = b.EnumC1214b.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    private final C8256a f65331a;

    public b(C8256a c8256a) throws GeneralSecurityException {
        if (!f65330b.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f65331a = c8256a;
    }
}
