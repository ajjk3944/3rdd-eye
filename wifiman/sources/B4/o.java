package B4;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o4.t;
import z4.InterfaceC8710a;

/* loaded from: classes3.dex */
public class o implements t {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8710a f1209a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1210b;

    public o(InterfaceC8710a interfaceC8710a, int i10) throws InvalidAlgorithmParameterException {
        this.f1209a = interfaceC8710a;
        this.f1210b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        interfaceC8710a.a(new byte[0], i10);
    }

    @Override // o4.t
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // o4.t
    public byte[] b(byte[] bArr) {
        return this.f1209a.a(bArr, this.f1210b);
    }
}
