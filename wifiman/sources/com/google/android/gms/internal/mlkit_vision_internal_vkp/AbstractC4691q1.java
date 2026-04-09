package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import org.snmp4j.asn1.BER;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4691q1 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f35713a = 100;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35714b = 0;

    static int a(byte[] bArr, int i10, C4680p1 c4680p1) throws zzbew {
        int iJ = j(bArr, i10, c4680p1);
        int i11 = c4680p1.f35707a;
        if (i11 < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iJ) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            c4680p1.f35709c = B1.f35555b;
            return iJ;
        }
        c4680p1.f35709c = B1.J(bArr, iJ, i11);
        return iJ + i11;
    }

    static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int c(J2 j22, byte[] bArr, int i10, int i11, int i12, C4680p1 c4680p1) throws zzbew {
        Object objZze = j22.zze();
        int iN = n(objZze, j22, bArr, i10, i11, i12, c4680p1);
        j22.zzf(objZze);
        c4680p1.f35709c = objZze;
        return iN;
    }

    static int d(J2 j22, byte[] bArr, int i10, int i11, C4680p1 c4680p1) throws zzbew {
        Object objZze = j22.zze();
        int iO = o(objZze, j22, bArr, i10, i11, c4680p1);
        j22.zzf(objZze);
        c4680p1.f35709c = objZze;
        return iO;
    }

    static int e(J2 j22, int i10, byte[] bArr, int i11, int i12, InterfaceC4582g2 interfaceC4582g2, C4680p1 c4680p1) throws zzbew {
        int iD = d(j22, bArr, i11, i12, c4680p1);
        interfaceC4582g2.add(c4680p1.f35709c);
        while (iD < i12) {
            int iJ = j(bArr, iD, c4680p1);
            if (i10 != c4680p1.f35707a) {
                break;
            }
            iD = d(j22, bArr, iJ, i12, c4680p1);
            interfaceC4582g2.add(c4680p1.f35709c);
        }
        return iD;
    }

    static int f(byte[] bArr, int i10, InterfaceC4582g2 interfaceC4582g2, C4680p1 c4680p1) throws zzbew {
        C4527b2 c4527b2 = (C4527b2) interfaceC4582g2;
        int iJ = j(bArr, i10, c4680p1);
        int i11 = c4680p1.f35707a + iJ;
        while (iJ < i11) {
            iJ = j(bArr, iJ, c4680p1);
            c4527b2.g(c4680p1.f35707a);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(byte[] bArr, int i10, C4680p1 c4680p1) throws zzbew {
        int iJ = j(bArr, i10, c4680p1);
        int i11 = c4680p1.f35707a;
        if (i11 < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            c4680p1.f35709c = "";
            return iJ;
        }
        c4680p1.f35709c = new String(bArr, iJ, i11, AbstractC4593h2.f35691a);
        return iJ + i11;
    }

    static int h(byte[] bArr, int i10, C4680p1 c4680p1) throws zzbew {
        int iJ = j(bArr, i10, c4680p1);
        int i11 = c4680p1.f35707a;
        if (i11 < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            c4680p1.f35709c = "";
            return iJ;
        }
        c4680p1.f35709c = AbstractC4594h3.d(bArr, iJ, i11);
        return iJ + i11;
    }

    static int i(int i10, byte[] bArr, int i11, int i12, W2 w22, C4680p1 c4680p1) throws zzbew {
        if ((i10 >>> 3) == 0) {
            throw new zzbew("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM = m(bArr, i11, c4680p1);
            w22.j(i10, Long.valueOf(c4680p1.f35708b));
            return iM;
        }
        if (i13 == 1) {
            w22.j(i10, Long.valueOf(q(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iJ = j(bArr, i11, c4680p1);
            int i14 = c4680p1.f35707a;
            if (i14 < 0) {
                throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iJ) {
                throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                w22.j(i10, B1.f35555b);
            } else {
                w22.j(i10, B1.J(bArr, iJ, i14));
            }
            return iJ + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzbew("Protocol message contained an invalid tag (zero).");
            }
            w22.j(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        W2 w2F = W2.f();
        int i16 = c4680p1.f35711e + 1;
        c4680p1.f35711e = i16;
        r(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iJ2 = j(bArr, i11, c4680p1);
            i17 = c4680p1.f35707a;
            if (i17 == i15) {
                i11 = iJ2;
                break;
            }
            i11 = i(i17, bArr, iJ2, i12, w2F, c4680p1);
        }
        c4680p1.f35711e--;
        if (i11 > i12 || i17 != i15) {
            throw new zzbew("Failed to parse the message.");
        }
        w22.j(i10, w2F);
        return i11;
    }

    static int j(byte[] bArr, int i10, C4680p1 c4680p1) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return k(b10, bArr, i11, c4680p1);
        }
        c4680p1.f35707a = b10;
        return i11;
    }

    static int k(int i10, byte[] bArr, int i11, C4680p1 c4680p1) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & BER.MAX_OID_LENGTH;
        if (b10 >= 0) {
            c4680p1.f35707a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c4680p1.f35707a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c4680p1.f35707a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c4680p1.f35707a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c4680p1.f35707a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int l(int i10, byte[] bArr, int i11, int i12, InterfaceC4582g2 interfaceC4582g2, C4680p1 c4680p1) {
        C4527b2 c4527b2 = (C4527b2) interfaceC4582g2;
        int iJ = j(bArr, i11, c4680p1);
        c4527b2.g(c4680p1.f35707a);
        while (iJ < i12) {
            int iJ2 = j(bArr, iJ, c4680p1);
            if (i10 != c4680p1.f35707a) {
                break;
            }
            iJ = j(bArr, iJ2, c4680p1);
            c4527b2.g(c4680p1.f35707a);
        }
        return iJ;
    }

    static int m(byte[] bArr, int i10, C4680p1 c4680p1) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c4680p1.f35708b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & 127) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & 127) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        c4680p1.f35708b = j11;
        return i12;
    }

    static int n(Object obj, J2 j22, byte[] bArr, int i10, int i11, int i12, C4680p1 c4680p1) throws zzbew {
        C2 c22 = (C2) j22;
        int i13 = c4680p1.f35711e + 1;
        c4680p1.f35711e = i13;
        r(i13);
        int iW = c22.w(obj, bArr, i10, i11, i12, c4680p1);
        c4680p1.f35711e--;
        c4680p1.f35709c = obj;
        return iW;
    }

    static int o(Object obj, J2 j22, byte[] bArr, int i10, int i11, C4680p1 c4680p1) throws zzbew {
        int iK = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iK = k(i12, bArr, iK, c4680p1);
            i12 = c4680p1.f35707a;
        }
        int i13 = iK;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = c4680p1.f35711e + 1;
        c4680p1.f35711e = i14;
        r(i14);
        int i15 = i12 + i13;
        j22.b(obj, bArr, i13, i15, c4680p1);
        c4680p1.f35711e--;
        c4680p1.f35709c = obj;
        return i15;
    }

    static int p(int i10, byte[] bArr, int i11, int i12, C4680p1 c4680p1) throws zzbew {
        if ((i10 >>> 3) == 0) {
            throw new zzbew("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return m(bArr, i11, c4680p1);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return j(bArr, i11, c4680p1) + c4680p1.f35707a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzbew("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = j(bArr, i11, c4680p1);
            i15 = c4680p1.f35707a;
            if (i15 == i14) {
                break;
            }
            i11 = p(i15, bArr, i11, i12, c4680p1);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zzbew("Failed to parse the message.");
        }
        return i11;
    }

    static long q(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    private static void r(int i10) throws zzbew {
        if (i10 >= f35713a) {
            throw new zzbew("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
