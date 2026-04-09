package jcifs.smb1.smb1;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import jcifs.smb1.smb1.Q;
import org.snmp4j.mp.PduHandle;

/* renamed from: jcifs.smb1.smb1.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6285t extends AbstractC6278l {

    /* renamed from: B, reason: collision with root package name */
    int f50647B;

    /* renamed from: C, reason: collision with root package name */
    Q.a f50648C;

    C6285t(Q.a aVar) {
        this.f50648C = aVar;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int h(byte[] bArr, int i10) {
        int i11;
        Q.a aVar = this.f50648C;
        int i12 = 0;
        if ((aVar.f50471d & PduHandle.NONE) == 0) {
            int i13 = aVar.f50482o;
            byte[] bArr2 = new byte[i13];
            aVar.f50483p = bArr2;
            System.arraycopy(bArr, i10, bArr2, 0, i13);
            Q.a aVar2 = this.f50648C;
            int i14 = aVar2.f50482o;
            i11 = i10 + i14;
            if (this.f50603o > i14) {
                try {
                    if ((this.f50597i & 32768) == 32768) {
                        do {
                            int i15 = i11 + i12;
                            if (bArr[i15] == 0 && bArr[i15 + 1] == 0) {
                                this.f50648C.f50472e = new String(bArr, i11, i12, "UTF-16LE");
                            }
                            i12 += 2;
                        } while (i12 <= 256);
                        throw new RuntimeException("zero termination not found");
                    }
                    while (bArr[i11 + i12] != 0) {
                        i12++;
                        if (i12 > 256) {
                            throw new RuntimeException("zero termination not found");
                        }
                    }
                    this.f50648C.f50472e = new String(bArr, i11, i12, L.f50363M0);
                } catch (UnsupportedEncodingException e10) {
                    if (Ug.e.f22464b > 1) {
                        e10.printStackTrace(AbstractC6278l.f50590z);
                    }
                }
                i11 += i12;
            } else {
                aVar2.f50472e = new String();
            }
        } else {
            byte[] bArr3 = new byte[16];
            aVar.f50484q = bArr3;
            System.arraycopy(bArr, i10, bArr3, 0, 16);
            this.f50648C.f50472e = new String();
            i11 = i10;
        }
        return i11 - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int m(byte[] bArr, int i10) {
        int iJ = AbstractC6278l.j(bArr, i10);
        this.f50647B = iJ;
        int i11 = i10 + 2;
        if (iJ > 10) {
            return i11 - i10;
        }
        Q.a aVar = this.f50648C;
        int i12 = i10 + 3;
        byte b10 = bArr[i11];
        aVar.f50473f = b10 & 255;
        aVar.f50474g = b10 & 1;
        aVar.f50475h = (b10 & 2) == 2;
        aVar.f50476i = (b10 & 4) == 4;
        aVar.f50477j = (b10 & 8) == 8;
        aVar.f50468a = AbstractC6278l.j(bArr, i12);
        this.f50648C.f50478k = AbstractC6278l.j(bArr, i10 + 5);
        this.f50648C.f50469b = AbstractC6278l.k(bArr, i10 + 7);
        this.f50648C.f50479l = AbstractC6278l.k(bArr, i10 + 11);
        this.f50648C.f50470c = AbstractC6278l.k(bArr, i10 + 15);
        this.f50648C.f50471d = AbstractC6278l.k(bArr, i10 + 19);
        this.f50648C.f50480m = AbstractC6278l.r(bArr, i10 + 23);
        this.f50648C.f50481n = AbstractC6278l.j(bArr, i10 + 31);
        this.f50648C.f50482o = bArr[i10 + 33] & 255;
        return (i10 + 34) - i10;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SmbComNegotiateResponse[");
        sb2.append(super.toString());
        sb2.append(",wordCount=");
        sb2.append(this.f50602n);
        sb2.append(",dialectIndex=");
        sb2.append(this.f50647B);
        sb2.append(",securityMode=0x");
        sb2.append(Ug.d.c(this.f50648C.f50473f, 1));
        sb2.append(",security=");
        sb2.append(this.f50648C.f50474g == 0 ? "share" : "user");
        sb2.append(",encryptedPasswords=");
        sb2.append(this.f50648C.f50475h);
        sb2.append(",maxMpxCount=");
        sb2.append(this.f50648C.f50468a);
        sb2.append(",maxNumberVcs=");
        sb2.append(this.f50648C.f50478k);
        sb2.append(",maxBufferSize=");
        sb2.append(this.f50648C.f50469b);
        sb2.append(",maxRawSize=");
        sb2.append(this.f50648C.f50479l);
        sb2.append(",sessionKey=0x");
        sb2.append(Ug.d.c(this.f50648C.f50470c, 8));
        sb2.append(",capabilities=0x");
        sb2.append(Ug.d.c(this.f50648C.f50471d, 8));
        sb2.append(",serverTime=");
        sb2.append(new Date(this.f50648C.f50480m));
        sb2.append(",serverTimeZone=");
        sb2.append(this.f50648C.f50481n);
        sb2.append(",encryptionKeyLength=");
        sb2.append(this.f50648C.f50482o);
        sb2.append(",byteCount=");
        sb2.append(this.f50603o);
        sb2.append(",oemDomainName=");
        sb2.append(this.f50648C.f50472e);
        sb2.append("]");
        return new String(sb2.toString());
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
