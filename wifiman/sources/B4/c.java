package B4;

import com.google.crypto.tink.config.internal.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import o4.InterfaceC7066a;
import q4.C7423b;

/* loaded from: classes3.dex */
public final class c implements InterfaceC7066a {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC1214b f1159b = b.EnumC1214b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    private final C7423b f1160a;

    public c(byte[] bArr) throws GeneralSecurityException {
        if (!f1159b.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f1160a = new C7423b(bArr, true);
    }

    @Override // o4.InterfaceC7066a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f1160a.b(p.c(12), bArr, bArr2);
    }

    @Override // o4.InterfaceC7066a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f1160a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
