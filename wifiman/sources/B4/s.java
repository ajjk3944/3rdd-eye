package B4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import o4.InterfaceC7066a;

/* loaded from: classes3.dex */
public final class s implements InterfaceC7066a {

    /* renamed from: a, reason: collision with root package name */
    private final q4.h f1214a;

    public s(byte[] bArr) {
        this.f1214a = new q4.h(bArr);
    }

    @Override // o4.InterfaceC7066a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrC = p.c(24);
        byteBufferAllocate.put(bArrC);
        this.f1214a.b(byteBufferAllocate, bArrC, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // o4.InterfaceC7066a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f1214a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }
}
