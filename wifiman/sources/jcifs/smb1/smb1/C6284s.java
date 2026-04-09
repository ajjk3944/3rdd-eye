package jcifs.smb1.smb1;

import java.io.UnsupportedEncodingException;

/* renamed from: jcifs.smb1.smb1.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6284s extends AbstractC6278l {
    C6284s() {
        this.f50591c = (byte) 114;
        this.f50597i = L.f50364N0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int h(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int m(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComNegotiate[" + super.toString() + ",wordCount=" + this.f50602n + ",dialects=NT LM 0.12]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) throws UnsupportedEncodingException {
        try {
            byte[] bytes = "\u0002NT LM 0.12\u0000".getBytes("ASCII");
            System.arraycopy(bytes, 0, bArr, i10, bytes.length);
            return bytes.length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }
}
