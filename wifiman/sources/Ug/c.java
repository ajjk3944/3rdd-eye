package Ug;

import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class c extends MessageDigest implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private MessageDigest f22456a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f22457b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f22458c;

    public c(byte[] bArr) {
        super("HMACT64");
        this.f22457b = new byte[64];
        this.f22458c = new byte[64];
        int iMin = Math.min(bArr.length, 64);
        for (int i10 = 0; i10 < iMin; i10++) {
            this.f22457b[i10] = (byte) (54 ^ bArr[i10]);
            this.f22458c[i10] = (byte) (92 ^ bArr[i10]);
        }
        while (iMin < 64) {
            this.f22457b[iMin] = 54;
            this.f22458c[iMin] = 92;
            iMin++;
        }
        try {
            this.f22456a = MessageDigest.getInstance("MD5");
            engineReset();
        } catch (Exception e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        try {
            return new c(this);
        } catch (CloneNotSupportedException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }

    @Override // java.security.MessageDigestSpi
    protected byte[] engineDigest() {
        byte[] bArrDigest = this.f22456a.digest();
        this.f22456a.update(this.f22458c);
        return this.f22456a.digest(bArrDigest);
    }

    @Override // java.security.MessageDigestSpi
    protected int engineGetDigestLength() {
        return this.f22456a.getDigestLength();
    }

    @Override // java.security.MessageDigestSpi
    protected void engineReset() {
        this.f22456a.reset();
        this.f22456a.update(this.f22457b);
    }

    @Override // java.security.MessageDigestSpi
    protected void engineUpdate(byte b10) {
        this.f22456a.update(b10);
    }

    @Override // java.security.MessageDigestSpi
    protected void engineUpdate(byte[] bArr, int i10, int i11) {
        this.f22456a.update(bArr, i10, i11);
    }

    @Override // java.security.MessageDigestSpi
    protected int engineDigest(byte[] bArr, int i10, int i11) {
        byte[] bArrDigest = this.f22456a.digest();
        this.f22456a.update(this.f22458c);
        this.f22456a.update(bArrDigest);
        try {
            return this.f22456a.digest(bArr, i10, i11);
        } catch (Exception unused) {
            throw new IllegalStateException();
        }
    }

    private c(c cVar) {
        super("HMACT64");
        this.f22457b = new byte[64];
        this.f22458c = new byte[64];
        this.f22457b = cVar.f22457b;
        this.f22458c = cVar.f22458c;
        this.f22456a = (MessageDigest) cVar.f22456a.clone();
    }
}
