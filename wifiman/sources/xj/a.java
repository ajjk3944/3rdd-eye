package xj;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f66176a;

    public a(byte[] bArr) {
        this.f66176a = bArr;
        b.a(bArr, 32);
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        b.a(bArr, 24);
        byte[] bArrC = b.c(16, bArr2);
        byte[] bArrE = b.e(bArrC.length);
        wj.a.a();
        b.b(wj.b.j(bArrE, bArrC, bArrC.length, bArr, this.f66176a), "Decryption failed. Ciphertext failed verification");
        return b.d(32, bArrE);
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        b.a(bArr, 24);
        byte[] bArrC = b.c(32, bArr2);
        byte[] bArrE = b.e(bArrC.length);
        wj.a.a();
        b.b(wj.b.i(bArrE, bArrC, bArrC.length, bArr, this.f66176a), "Encryption failed");
        return b.d(16, bArrE);
    }
}
