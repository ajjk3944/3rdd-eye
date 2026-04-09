package com.google.android.gms.internal.measurement;

import org.snmp4j.asn1.BER;

/* loaded from: classes.dex */
abstract class R3 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f35101a = 100;

    static double a(byte[] bArr, int i10) {
        return Double.longBitsToDouble(t(bArr, i10));
    }

    static int b(int i10, byte[] bArr, int i11, int i12, L4 l42, U3 u32) {
        G4 g42 = (G4) l42;
        int iR = r(bArr, i11, u32);
        g42.g(u32.f35118a);
        while (iR < i12) {
            int iR2 = r(bArr, iR, u32);
            if (i10 != u32.f35118a) {
                break;
            }
            iR = r(bArr, iR2, u32);
            g42.g(u32.f35118a);
        }
        return iR;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, K5 k52, U3 u32) {
        if ((i10 >>> 3) == 0) {
            throw zzkq.c();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iS = s(bArr, i11, u32);
            k52.e(i10, Long.valueOf(u32.f35119b));
            return iS;
        }
        if (i13 == 1) {
            k52.e(i10, Long.valueOf(t(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iR = r(bArr, i11, u32);
            int i14 = u32.f35118a;
            if (i14 < 0) {
                throw zzkq.g();
            }
            if (i14 > bArr.length - iR) {
                throw zzkq.l();
            }
            if (i14 == 0) {
                k52.e(i10, V3.f35128b);
            } else {
                k52.e(i10, V3.C(bArr, iR, i14));
            }
            return iR + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzkq.c();
            }
            k52.e(i10, Integer.valueOf(q(bArr, i11)));
            return i11 + 4;
        }
        K5 k5L = K5.l();
        int i15 = (i10 & (-8)) | 4;
        int i16 = u32.f35122e + 1;
        u32.f35122e = i16;
        m(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iR2 = r(bArr, i11, u32);
            int i18 = u32.f35118a;
            i17 = i18;
            if (i18 == i15) {
                i11 = iR2;
                break;
            }
            int iC = c(i17, bArr, iR2, i12, k5L, u32);
            i17 = i18;
            i11 = iC;
        }
        u32.f35122e--;
        if (i11 > i12 || i17 != i15) {
            throw zzkq.h();
        }
        k52.e(i10, k5L);
        return i11;
    }

    static int d(int i10, byte[] bArr, int i11, int i12, Object obj, InterfaceC4366h5 interfaceC4366h5, L5 l52, U3 u32) {
        u32.f35121d.b(interfaceC4366h5, i10 >>> 3);
        return c(i10, bArr, i11, i12, C4392k5.F(obj), u32);
    }

    static int e(int i10, byte[] bArr, int i11, U3 u32) {
        int i12 = i10 & BER.MAX_OID_LENGTH;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            u32.f35118a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            u32.f35118a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            u32.f35118a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            u32.f35118a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                u32.f35118a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int f(InterfaceC4495x5 interfaceC4495x5, int i10, byte[] bArr, int i11, int i12, L4 l42, U3 u32) {
        int i13 = (i10 & (-8)) | 4;
        int iG = g(interfaceC4495x5, bArr, i11, i12, i13, u32);
        l42.add(u32.f35120c);
        while (iG < i12) {
            int iR = r(bArr, iG, u32);
            if (i10 != u32.f35118a) {
                break;
            }
            iG = g(interfaceC4495x5, bArr, iR, i12, i13, u32);
            l42.add(u32.f35120c);
        }
        return iG;
    }

    private static int g(InterfaceC4495x5 interfaceC4495x5, byte[] bArr, int i10, int i11, int i12, U3 u32) {
        Object objZza = interfaceC4495x5.zza();
        int i13 = i(objZza, interfaceC4495x5, bArr, i10, i11, i12, u32);
        interfaceC4495x5.b(objZza);
        u32.f35120c = objZza;
        return i13;
    }

    static int h(InterfaceC4495x5 interfaceC4495x5, byte[] bArr, int i10, int i11, U3 u32) {
        Object objZza = interfaceC4495x5.zza();
        int iJ = j(objZza, interfaceC4495x5, bArr, i10, i11, u32);
        interfaceC4495x5.b(objZza);
        u32.f35120c = objZza;
        return iJ;
    }

    static int i(Object obj, InterfaceC4495x5 interfaceC4495x5, byte[] bArr, int i10, int i11, int i12, U3 u32) {
        C4392k5 c4392k5 = (C4392k5) interfaceC4495x5;
        int i13 = u32.f35122e + 1;
        u32.f35122e = i13;
        m(i13);
        int iJ = c4392k5.j(obj, bArr, i10, i11, i12, u32);
        u32.f35122e--;
        u32.f35120c = obj;
        return iJ;
    }

    static int j(Object obj, InterfaceC4495x5 interfaceC4495x5, byte[] bArr, int i10, int i11, U3 u32) {
        int iE = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iE = e(i12, bArr, iE, u32);
            i12 = u32.f35118a;
        }
        int i13 = iE;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzkq.l();
        }
        int i14 = u32.f35122e + 1;
        u32.f35122e = i14;
        m(i14);
        int i15 = i12 + i13;
        interfaceC4495x5.e(obj, bArr, i13, i15, u32);
        u32.f35122e--;
        u32.f35120c = obj;
        return i15;
    }

    static int k(byte[] bArr, int i10, U3 u32) {
        int iR = r(bArr, i10, u32);
        int i11 = u32.f35118a;
        if (i11 < 0) {
            throw zzkq.g();
        }
        if (i11 > bArr.length - iR) {
            throw zzkq.l();
        }
        if (i11 == 0) {
            u32.f35120c = V3.f35128b;
            return iR;
        }
        u32.f35120c = V3.C(bArr, iR, i11);
        return iR + i11;
    }

    static int l(byte[] bArr, int i10, L4 l42, U3 u32) {
        G4 g42 = (G4) l42;
        int iR = r(bArr, i10, u32);
        int i11 = u32.f35118a + iR;
        while (iR < i11) {
            iR = r(bArr, iR, u32);
            g42.g(u32.f35118a);
        }
        if (iR == i11) {
            return iR;
        }
        throw zzkq.l();
    }

    private static void m(int i10) throws zzkq {
        if (i10 >= f35101a) {
            throw zzkq.j();
        }
    }

    static float n(byte[] bArr, int i10) {
        return Float.intBitsToFloat(q(bArr, i10));
    }

    static int o(InterfaceC4495x5 interfaceC4495x5, int i10, byte[] bArr, int i11, int i12, L4 l42, U3 u32) {
        int iH = h(interfaceC4495x5, bArr, i11, i12, u32);
        l42.add(u32.f35120c);
        while (iH < i12) {
            int iR = r(bArr, iH, u32);
            if (i10 != u32.f35118a) {
                break;
            }
            iH = h(interfaceC4495x5, bArr, iR, i12, u32);
            l42.add(u32.f35120c);
        }
        return iH;
    }

    static int p(byte[] bArr, int i10, U3 u32) {
        int iR = r(bArr, i10, u32);
        int i11 = u32.f35118a;
        if (i11 < 0) {
            throw zzkq.g();
        }
        if (i11 == 0) {
            u32.f35120c = "";
            return iR;
        }
        u32.f35120c = R5.d(bArr, iR, i11);
        return iR + i11;
    }

    static int q(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int r(byte[] bArr, int i10, U3 u32) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return e(b10, bArr, i11, u32);
        }
        u32.f35118a = b10;
        return i11;
    }

    static int s(byte[] bArr, int i10, U3 u32) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            u32.f35119b = j10;
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
        u32.f35119b = j11;
        return i12;
    }

    static long t(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
