package q4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: q4.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7424c extends AbstractC7425d {
    public C7424c(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // q4.AbstractC7425d
    public int[] b(int[] iArr, int i10) {
        if (iArr.length != e() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        AbstractC7422a.c(iArr2, this.f58387a);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // q4.AbstractC7425d
    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.c(bArr, byteBuffer);
    }

    @Override // q4.AbstractC7425d
    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.d(byteBuffer, bArr, bArr2);
    }

    @Override // q4.AbstractC7425d
    public int e() {
        return 12;
    }
}
