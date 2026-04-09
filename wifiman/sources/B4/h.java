package B4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import o4.InterfaceC7066a;
import o4.t;

/* loaded from: classes3.dex */
public final class h implements InterfaceC7066a {

    /* renamed from: a, reason: collision with root package name */
    private final l f1185a;

    /* renamed from: b, reason: collision with root package name */
    private final t f1186b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1187c;

    public h(l lVar, t tVar, int i10) {
        this.f1185a = lVar;
        this.f1186b = tVar;
        this.f1187c = i10;
    }

    @Override // o4.InterfaceC7066a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.f1185a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(bArrA, this.f1186b.b(f.a(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // o4.InterfaceC7066a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f1187c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f1187c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f1186b.a(bArrCopyOfRange2, f.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f1185a.b(bArrCopyOfRange);
    }
}
