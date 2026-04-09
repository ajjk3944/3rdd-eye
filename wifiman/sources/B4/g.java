package B4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import o4.InterfaceC7066a;
import q4.C7426e;

/* loaded from: classes3.dex */
public final class g implements InterfaceC7066a {

    /* renamed from: a, reason: collision with root package name */
    private final C7426e f1184a;

    public g(byte[] bArr) {
        this.f1184a = new C7426e(bArr);
    }

    @Override // o4.InterfaceC7066a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrC = p.c(12);
        byteBufferAllocate.put(bArrC);
        this.f1184a.b(byteBufferAllocate, bArrC, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // o4.InterfaceC7066a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f1184a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }
}
