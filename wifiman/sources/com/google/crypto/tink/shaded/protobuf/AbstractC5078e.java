package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;
import org.snmp4j.asn1.BER;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5078e {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f38490a;

        /* renamed from: b, reason: collision with root package name */
        public long f38491b;

        /* renamed from: c, reason: collision with root package name */
        public Object f38492c;

        /* renamed from: d, reason: collision with root package name */
        public final C5088o f38493d;

        a(C5088o c5088o) {
            c5088o.getClass();
            this.f38493d = c5088o;
        }
    }

    static int A(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) {
        D d10 = (D) dVar;
        int iK = K(bArr, i11, aVar);
        d10.e(AbstractC5082i.c(aVar.f38491b));
        while (iK < i12) {
            int iH = H(bArr, iK, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            iK = K(bArr, iH, aVar);
            d10.e(AbstractC5082i.c(aVar.f38491b));
        }
        return iK;
    }

    static int B(byte[] bArr, int i10, a aVar) throws InvalidProtocolBufferException {
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.l();
        }
        if (i11 == 0) {
            aVar.f38492c = "";
            return iH;
        }
        aVar.f38492c = new String(bArr, iH, i11, AbstractC5097y.f38598b);
        return iH + i11;
    }

    static int C(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        int iH = H(bArr, i11, aVar);
        int i13 = aVar.f38490a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.l();
        }
        if (i13 == 0) {
            dVar.add("");
        } else {
            dVar.add(new String(bArr, iH, i13, AbstractC5097y.f38598b));
            iH += i13;
        }
        while (iH < i12) {
            int iH2 = H(bArr, iH, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            int i14 = aVar.f38490a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (i14 == 0) {
                dVar.add("");
            } else {
                dVar.add(new String(bArr, iH, i14, AbstractC5097y.f38598b));
                iH += i14;
            }
        }
        return iH;
    }

    static int D(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        int iH = H(bArr, i11, aVar);
        int i13 = aVar.f38490a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.l();
        }
        if (i13 == 0) {
            dVar.add("");
        } else {
            int i14 = iH + i13;
            if (!m0.n(bArr, iH, i14)) {
                throw InvalidProtocolBufferException.g();
            }
            dVar.add(new String(bArr, iH, i13, AbstractC5097y.f38598b));
            iH = i14;
        }
        while (iH < i12) {
            int iH2 = H(bArr, iH, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            int i15 = aVar.f38490a;
            if (i15 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (i15 == 0) {
                dVar.add("");
            } else {
                int i16 = iH + i15;
                if (!m0.n(bArr, iH, i16)) {
                    throw InvalidProtocolBufferException.g();
                }
                dVar.add(new String(bArr, iH, i15, AbstractC5097y.f38598b));
                iH = i16;
            }
        }
        return iH;
    }

    static int E(byte[] bArr, int i10, a aVar) throws InvalidProtocolBufferException {
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.l();
        }
        if (i11 == 0) {
            aVar.f38492c = "";
            return iH;
        }
        aVar.f38492c = m0.e(bArr, iH, i11);
        return iH + i11;
    }

    static int F(int i10, byte[] bArr, int i11, int i12, i0 i0Var, a aVar) throws InvalidProtocolBufferException {
        if (n0.a(i10) == 0) {
            throw InvalidProtocolBufferException.d();
        }
        int iB = n0.b(i10);
        if (iB == 0) {
            int iK = K(bArr, i11, aVar);
            i0Var.n(i10, Long.valueOf(aVar.f38491b));
            return iK;
        }
        if (iB == 1) {
            i0Var.n(i10, Long.valueOf(i(bArr, i11)));
            return i11 + 8;
        }
        if (iB == 2) {
            int iH = H(bArr, i11, aVar);
            int i13 = aVar.f38490a;
            if (i13 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (i13 > bArr.length - iH) {
                throw InvalidProtocolBufferException.s();
            }
            if (i13 == 0) {
                i0Var.n(i10, AbstractC5081h.f38499b);
            } else {
                i0Var.n(i10, AbstractC5081h.v(bArr, iH, i13));
            }
            return iH + i13;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw InvalidProtocolBufferException.d();
            }
            i0Var.n(i10, Integer.valueOf(g(bArr, i11)));
            return i11 + 4;
        }
        i0 i0VarK = i0.k();
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iH2 = H(bArr, i11, aVar);
            int i16 = aVar.f38490a;
            if (i16 == i14) {
                i15 = i16;
                i11 = iH2;
                break;
            }
            i15 = i16;
            i11 = F(i16, bArr, iH2, i12, i0VarK, aVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw InvalidProtocolBufferException.m();
        }
        i0Var.n(i10, i0VarK);
        return i11;
    }

    static int G(int i10, byte[] bArr, int i11, a aVar) {
        int i12 = i10 & BER.MAX_OID_LENGTH;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            aVar.f38490a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            aVar.f38490a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            aVar.f38490a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            aVar.f38490a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                aVar.f38490a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int H(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return G(b10, bArr, i11, aVar);
        }
        aVar.f38490a = b10;
        return i11;
    }

    static int I(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) {
        AbstractC5096x abstractC5096x = (AbstractC5096x) dVar;
        int iH = H(bArr, i11, aVar);
        abstractC5096x.e(aVar.f38490a);
        while (iH < i12) {
            int iH2 = H(bArr, iH, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            abstractC5096x.e(aVar.f38490a);
        }
        return iH;
    }

    static int J(long j10, byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & 127) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= (b11 & 127) << i12;
            i11 = i13;
            b10 = b11;
        }
        aVar.f38491b = j11;
        return i11;
    }

    static int K(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return J(j10, bArr, i11, aVar);
        }
        aVar.f38491b = j10;
        return i11;
    }

    static int L(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) {
        D d10 = (D) dVar;
        int iK = K(bArr, i11, aVar);
        d10.e(aVar.f38491b);
        while (iK < i12) {
            int iH = H(bArr, iK, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            iK = K(bArr, iH, aVar);
            d10.e(aVar.f38491b);
        }
        return iK;
    }

    static int M(Object obj, c0 c0Var, byte[] bArr, int i10, int i11, int i12, a aVar) {
        int iG0 = ((P) c0Var).g0(obj, bArr, i10, i11, i12, aVar);
        aVar.f38492c = obj;
        return iG0;
    }

    static int N(Object obj, c0 c0Var, byte[] bArr, int i10, int i11, a aVar) throws InvalidProtocolBufferException {
        int iG = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iG = G(i12, bArr, iG, aVar);
            i12 = aVar.f38490a;
        }
        int i13 = iG;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.s();
        }
        int i14 = i12 + i13;
        c0Var.h(obj, bArr, i13, i14, aVar);
        aVar.f38492c = obj;
        return i14;
    }

    static int a(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) {
        AbstractC5079f abstractC5079f = (AbstractC5079f) dVar;
        int iK = K(bArr, i11, aVar);
        abstractC5079f.e(aVar.f38491b != 0);
        while (iK < i12) {
            int iH = H(bArr, iK, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            iK = K(bArr, iH, aVar);
            abstractC5079f.e(aVar.f38491b != 0);
        }
        return iK;
    }

    static int b(byte[] bArr, int i10, a aVar) throws InvalidProtocolBufferException {
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.l();
        }
        if (i11 > bArr.length - iH) {
            throw InvalidProtocolBufferException.s();
        }
        if (i11 == 0) {
            aVar.f38492c = AbstractC5081h.f38499b;
            return iH;
        }
        aVar.f38492c = AbstractC5081h.v(bArr, iH, i11);
        return iH + i11;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        int iH = H(bArr, i11, aVar);
        int i13 = aVar.f38490a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.l();
        }
        if (i13 > bArr.length - iH) {
            throw InvalidProtocolBufferException.s();
        }
        if (i13 == 0) {
            dVar.add(AbstractC5081h.f38499b);
        } else {
            dVar.add(AbstractC5081h.v(bArr, iH, i13));
            iH += i13;
        }
        while (iH < i12) {
            int iH2 = H(bArr, iH, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            int i14 = aVar.f38490a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (i14 > bArr.length - iH) {
                throw InvalidProtocolBufferException.s();
            }
            if (i14 == 0) {
                dVar.add(AbstractC5081h.f38499b);
            } else {
                dVar.add(AbstractC5081h.v(bArr, iH, i14));
                iH += i14;
            }
        }
        return iH;
    }

    static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(i(bArr, i10));
    }

    static int e(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) {
        AbstractC5085l abstractC5085l = (AbstractC5085l) dVar;
        abstractC5085l.e(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iH = H(bArr, i13, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            abstractC5085l.e(d(bArr, iH));
            i13 = iH + 8;
        }
        return i13;
    }

    static int f(int i10, byte[] bArr, int i11, int i12, Object obj, M m10, h0 h0Var, a aVar) {
        aVar.f38493d.a(m10, i10 >>> 3);
        return F(i10, bArr, i11, i12, P.w(obj), aVar);
    }

    static int g(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int h(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) {
        AbstractC5096x abstractC5096x = (AbstractC5096x) dVar;
        abstractC5096x.e(g(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iH = H(bArr, i13, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            abstractC5096x.e(g(bArr, iH));
            i13 = iH + 4;
        }
        return i13;
    }

    static long i(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    static int j(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) {
        D d10 = (D) dVar;
        d10.e(i(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iH = H(bArr, i13, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            d10.e(i(bArr, iH));
            i13 = iH + 8;
        }
        return i13;
    }

    static float k(byte[] bArr, int i10) {
        return Float.intBitsToFloat(g(bArr, i10));
    }

    static int l(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) {
        AbstractC5093u abstractC5093u = (AbstractC5093u) dVar;
        abstractC5093u.e(k(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iH = H(bArr, i13, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            abstractC5093u.e(k(bArr, iH));
            i13 = iH + 4;
        }
        return i13;
    }

    static int m(c0 c0Var, byte[] bArr, int i10, int i11, int i12, a aVar) {
        Object objB = c0Var.b();
        int iM = M(objB, c0Var, bArr, i10, i11, i12, aVar);
        c0Var.c(objB);
        aVar.f38492c = objB;
        return iM;
    }

    static int n(c0 c0Var, int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) {
        int i13 = (i10 & (-8)) | 4;
        int iM = m(c0Var, bArr, i11, i12, i13, aVar);
        dVar.add(aVar.f38492c);
        while (iM < i12) {
            int iH = H(bArr, iM, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            iM = m(c0Var, bArr, iH, i12, i13, aVar);
            dVar.add(aVar.f38492c);
        }
        return iM;
    }

    static int o(c0 c0Var, byte[] bArr, int i10, int i11, a aVar) throws InvalidProtocolBufferException {
        Object objB = c0Var.b();
        int iN = N(objB, c0Var, bArr, i10, i11, aVar);
        c0Var.c(objB);
        aVar.f38492c = objB;
        return iN;
    }

    static int p(c0 c0Var, int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        int iO = o(c0Var, bArr, i11, i12, aVar);
        dVar.add(aVar.f38492c);
        while (iO < i12) {
            int iH = H(bArr, iO, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            iO = o(c0Var, bArr, iH, i12, aVar);
            dVar.add(aVar.f38492c);
        }
        return iO;
    }

    static int q(byte[] bArr, int i10, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        AbstractC5079f abstractC5079f = (AbstractC5079f) dVar;
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a + iH;
        while (iH < i11) {
            iH = K(bArr, iH, aVar);
            abstractC5079f.e(aVar.f38491b != 0);
        }
        if (iH == i11) {
            return iH;
        }
        throw InvalidProtocolBufferException.s();
    }

    static int r(byte[] bArr, int i10, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        AbstractC5085l abstractC5085l = (AbstractC5085l) dVar;
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a + iH;
        while (iH < i11) {
            abstractC5085l.e(d(bArr, iH));
            iH += 8;
        }
        if (iH == i11) {
            return iH;
        }
        throw InvalidProtocolBufferException.s();
    }

    static int s(byte[] bArr, int i10, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        AbstractC5096x abstractC5096x = (AbstractC5096x) dVar;
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a + iH;
        while (iH < i11) {
            abstractC5096x.e(g(bArr, iH));
            iH += 4;
        }
        if (iH == i11) {
            return iH;
        }
        throw InvalidProtocolBufferException.s();
    }

    static int t(byte[] bArr, int i10, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        D d10 = (D) dVar;
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a + iH;
        while (iH < i11) {
            d10.e(i(bArr, iH));
            iH += 8;
        }
        if (iH == i11) {
            return iH;
        }
        throw InvalidProtocolBufferException.s();
    }

    static int u(byte[] bArr, int i10, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        AbstractC5093u abstractC5093u = (AbstractC5093u) dVar;
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a + iH;
        while (iH < i11) {
            abstractC5093u.e(k(bArr, iH));
            iH += 4;
        }
        if (iH == i11) {
            return iH;
        }
        throw InvalidProtocolBufferException.s();
    }

    static int v(byte[] bArr, int i10, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        AbstractC5096x abstractC5096x = (AbstractC5096x) dVar;
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a + iH;
        while (iH < i11) {
            iH = H(bArr, iH, aVar);
            abstractC5096x.e(AbstractC5082i.b(aVar.f38490a));
        }
        if (iH == i11) {
            return iH;
        }
        throw InvalidProtocolBufferException.s();
    }

    static int w(byte[] bArr, int i10, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        D d10 = (D) dVar;
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a + iH;
        while (iH < i11) {
            iH = K(bArr, iH, aVar);
            d10.e(AbstractC5082i.c(aVar.f38491b));
        }
        if (iH == i11) {
            return iH;
        }
        throw InvalidProtocolBufferException.s();
    }

    static int x(byte[] bArr, int i10, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        AbstractC5096x abstractC5096x = (AbstractC5096x) dVar;
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a + iH;
        while (iH < i11) {
            iH = H(bArr, iH, aVar);
            abstractC5096x.e(aVar.f38490a);
        }
        if (iH == i11) {
            return iH;
        }
        throw InvalidProtocolBufferException.s();
    }

    static int y(byte[] bArr, int i10, AbstractC5097y.d dVar, a aVar) throws InvalidProtocolBufferException {
        D d10 = (D) dVar;
        int iH = H(bArr, i10, aVar);
        int i11 = aVar.f38490a + iH;
        while (iH < i11) {
            iH = K(bArr, iH, aVar);
            d10.e(aVar.f38491b);
        }
        if (iH == i11) {
            return iH;
        }
        throw InvalidProtocolBufferException.s();
    }

    static int z(int i10, byte[] bArr, int i11, int i12, AbstractC5097y.d dVar, a aVar) {
        AbstractC5096x abstractC5096x = (AbstractC5096x) dVar;
        int iH = H(bArr, i11, aVar);
        abstractC5096x.e(AbstractC5082i.b(aVar.f38490a));
        while (iH < i12) {
            int iH2 = H(bArr, iH, aVar);
            if (i10 != aVar.f38490a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            abstractC5096x.e(AbstractC5082i.b(aVar.f38490a));
        }
        return iH;
    }
}
