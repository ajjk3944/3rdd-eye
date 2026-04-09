package B4;

import com.google.crypto.tink.config.internal.b;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.snmp4j.mp.MPv3;

/* loaded from: classes3.dex */
public final class a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC1214b f1147d = b.EnumC1214b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f1148e = new C0045a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f1149a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1150b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1151c;

    /* renamed from: B4.a$a, reason: collision with other inner class name */
    class C0045a extends ThreadLocal {
        C0045a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f1188b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!f1147d.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f1149a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f1148e.get()).getBlockSize();
        this.f1151c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f1150b = i10;
    }

    private void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f1148e.get();
        byte[] bArr4 = new byte[this.f1151c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f1150b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z10) {
            cipher.init(1, this.f1149a, ivParameterSpec);
        } else {
            cipher.init(2, this.f1149a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // B4.l
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f1150b;
        if (length > MPv3.MAX_MESSAGE_ID - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (MPv3.MAX_MESSAGE_ID - this.f1150b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] bArrC = p.c(i10);
        System.arraycopy(bArrC, 0, bArr2, 0, this.f1150b);
        c(bArr, 0, bArr.length, bArr2, this.f1150b, bArrC, true);
        return bArr2;
    }

    @Override // B4.l
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f1150b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f1150b;
        byte[] bArr3 = new byte[length2 - i11];
        c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }
}
