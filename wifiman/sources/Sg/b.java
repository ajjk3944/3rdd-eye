package Sg;

import java.io.UnsupportedEncodingException;
import org.snmp4j.asn1.BER;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static final String f20613e = Rg.a.g("jcifs.smb1.netbios.scope");

    /* renamed from: f, reason: collision with root package name */
    static final String f20614f = Rg.a.h("jcifs.smb1.encoding", System.getProperty("file.encoding"));

    /* renamed from: a, reason: collision with root package name */
    public String f20615a;

    /* renamed from: b, reason: collision with root package name */
    public String f20616b;

    /* renamed from: c, reason: collision with root package name */
    public int f20617c;

    /* renamed from: d, reason: collision with root package name */
    int f20618d;

    b() {
    }

    int a(byte[] bArr, int i10) {
        int i11;
        int i12 = i10 + 1;
        int i13 = bArr[i10] & 255;
        if (i13 == 0) {
            this.f20616b = null;
            return 1;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer(new String(bArr, i12, i13, f20614f));
            int i14 = i12 + i13;
            while (true) {
                i11 = i14 + 1;
                try {
                    int i15 = bArr[i14] & 255;
                    if (i15 == 0) {
                        break;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(new String(bArr, i11, i15, f20614f));
                    i14 = i15 + i11;
                } catch (UnsupportedEncodingException unused) {
                    i12 = i11;
                    i11 = i12;
                    return i11 - i10;
                }
            }
            this.f20616b = stringBuffer.toString();
        } catch (UnsupportedEncodingException unused2) {
        }
        return i11 - i10;
    }

    int b(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[33];
        int i11 = 15;
        for (int i12 = 0; i12 < 15; i12++) {
            int i13 = i12 * 2;
            byte b10 = (byte) (((bArr[(i13 + 1) + i10] & 255) - 65) << 4);
            bArr2[i12] = b10;
            byte b11 = (byte) (((byte) (((bArr[(i13 + 2) + i10] & 255) - 65) & 15)) | b10);
            bArr2[i12] = b11;
            if (b11 != 32) {
                i11 = i12 + 1;
            }
        }
        try {
            this.f20615a = new String(bArr2, 0, i11, f20614f);
        } catch (UnsupportedEncodingException unused) {
        }
        int i14 = ((bArr[i10 + 31] & 255) - 65) << 4;
        this.f20617c = i14;
        this.f20617c = i14 | (15 & ((bArr[i10 + 32] & 255) - 65));
        return a(bArr, i10 + 33) + 33;
    }

    int c(byte[] bArr, int i10) {
        String str = this.f20616b;
        if (str == null) {
            bArr[i10] = 0;
            return 1;
        }
        int i11 = i10 + 1;
        bArr[i10] = 46;
        try {
            System.arraycopy(str.getBytes(f20614f), 0, bArr, i11, this.f20616b.length());
        } catch (UnsupportedEncodingException unused) {
        }
        int length = i11 + this.f20616b.length();
        bArr[length] = 0;
        int i12 = length - 1;
        int length2 = i12 - this.f20616b.length();
        int i13 = 0;
        while (true) {
            if (bArr[i12] == 46) {
                bArr[i12] = (byte) i13;
                i13 = 0;
            } else {
                i13++;
            }
            int i14 = i12 - 1;
            if (i12 <= length2) {
                return this.f20616b.length() + 2;
            }
            i12 = i14;
        }
    }

    int d(byte[] bArr, int i10) throws UnsupportedEncodingException {
        bArr[i10] = BER.ASN_CONSTRUCTOR;
        try {
            byte[] bytes = this.f20615a.getBytes(f20614f);
            int i11 = 0;
            while (i11 < bytes.length) {
                int i12 = i11 * 2;
                bArr[i12 + 1 + i10] = (byte) (((bytes[i11] & 240) >> 4) + 65);
                bArr[i12 + 2 + i10] = (byte) ((15 & bytes[i11]) + 65);
                i11++;
            }
            while (i11 < 15) {
                int i13 = i11 * 2;
                bArr[i13 + 1 + i10] = BER.TIMETICKS;
                bArr[i13 + 2 + i10] = 65;
                i11++;
            }
            int i14 = this.f20617c;
            bArr[i10 + 31] = (byte) (((i14 & 240) >> 4) + 65);
            bArr[i10 + 32] = (byte) ((i14 & 15) + 65);
        } catch (UnsupportedEncodingException unused) {
        }
        return c(bArr, i10 + 33) + 33;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return (this.f20616b == null && bVar.f20616b == null) ? this.f20615a.equals(bVar.f20615a) && this.f20617c == bVar.f20617c : this.f20615a.equals(bVar.f20615a) && this.f20617c == bVar.f20617c && this.f20616b.equals(bVar.f20616b);
    }

    public int hashCode() {
        int iHashCode = this.f20615a.hashCode() + (this.f20617c * 65599) + (this.f20618d * 65599);
        String str = this.f20616b;
        return (str == null || str.length() == 0) ? iHashCode : iHashCode + this.f20616b.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.f20615a;
        if (str == null) {
            str = "null";
        } else if (str.charAt(0) == 1) {
            char[] charArray = str.toCharArray();
            charArray[0] = '.';
            charArray[1] = '.';
            charArray[14] = '.';
            str = new String(charArray);
        }
        stringBuffer.append(str);
        stringBuffer.append("<");
        stringBuffer.append(Ug.d.c(this.f20617c, 2));
        stringBuffer.append(">");
        if (this.f20616b != null) {
            stringBuffer.append(".");
            stringBuffer.append(this.f20616b);
        }
        return stringBuffer.toString();
    }

    public b(String str, int i10, String str2) {
        this.f20615a = (str.length() > 15 ? str.substring(0, 15) : str).toUpperCase();
        this.f20617c = i10;
        this.f20616b = (str2 == null || str2.length() <= 0) ? f20613e : str2;
        this.f20618d = 0;
    }
}
