package p4;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import o4.InterfaceC7066a;

/* loaded from: classes3.dex */
public final class E implements InterfaceC7066a {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f57553c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final A4.A f57554a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7066a f57555b;

    public E(A4.A a10, InterfaceC7066a interfaceC7066a) {
        this.f57554a = a10;
        this.f57555b = interfaceC7066a;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // o4.InterfaceC7066a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] byteArray = o4.x.j(this.f57554a).toByteArray();
        return c(this.f57555b.a(byteArray, f57553c), ((InterfaceC7066a) o4.x.g(this.f57554a.Z(), byteArray, InterfaceC7066a.class)).a(bArr, bArr2));
    }

    @Override // o4.InterfaceC7066a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((InterfaceC7066a) o4.x.g(this.f57554a.Z(), this.f57555b.b(bArr3, f57553c), InterfaceC7066a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
