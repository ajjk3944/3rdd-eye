package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.snmp4j.mp.MPv3;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5082i {

    /* renamed from: f, reason: collision with root package name */
    private static volatile int f38511f = 100;

    /* renamed from: a, reason: collision with root package name */
    int f38512a;

    /* renamed from: b, reason: collision with root package name */
    int f38513b;

    /* renamed from: c, reason: collision with root package name */
    int f38514c;

    /* renamed from: d, reason: collision with root package name */
    C5083j f38515d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38516e;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    private static final class b extends AbstractC5082i {

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f38517g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f38518h;

        /* renamed from: i, reason: collision with root package name */
        private int f38519i;

        /* renamed from: j, reason: collision with root package name */
        private int f38520j;

        /* renamed from: k, reason: collision with root package name */
        private int f38521k;

        /* renamed from: l, reason: collision with root package name */
        private int f38522l;

        /* renamed from: m, reason: collision with root package name */
        private int f38523m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f38524n;

        /* renamed from: o, reason: collision with root package name */
        private int f38525o;

        private void M() {
            int i10 = this.f38519i + this.f38520j;
            this.f38519i = i10;
            int i11 = i10 - this.f38522l;
            int i12 = this.f38525o;
            if (i11 <= i12) {
                this.f38520j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f38520j = i13;
            this.f38519i = i10 - i13;
        }

        private void P() throws InvalidProtocolBufferException {
            if (this.f38519i - this.f38521k >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f38517g;
                int i11 = this.f38521k;
                this.f38521k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        private void R() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public String A() throws InvalidProtocolBufferException {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f38519i;
                int i11 = this.f38521k;
                if (iJ <= i10 - i11) {
                    String strE = m0.e(this.f38517g, i11, iJ);
                    this.f38521k += iJ;
                    return strE;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ <= 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.s();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int B() throws InvalidProtocolBufferException {
            if (e()) {
                this.f38523m = 0;
                return 0;
            }
            int iJ = J();
            this.f38523m = iJ;
            if (n0.a(iJ) != 0) {
                return this.f38523m;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int C() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public long D() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public boolean E(int i10) throws InvalidProtocolBufferException {
            int iB = n0.b(i10);
            if (iB == 0) {
                P();
                return true;
            }
            if (iB == 1) {
                O(8);
                return true;
            }
            if (iB == 2) {
                O(J());
                return true;
            }
            if (iB == 3) {
                N();
                a(n0.c(n0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.h();
            }
            O(4);
            return true;
        }

        public byte F() throws InvalidProtocolBufferException {
            int i10 = this.f38521k;
            if (i10 == this.f38519i) {
                throw InvalidProtocolBufferException.s();
            }
            byte[] bArr = this.f38517g;
            this.f38521k = i10 + 1;
            return bArr[i10];
        }

        public byte[] G(int i10) throws InvalidProtocolBufferException {
            if (i10 > 0) {
                int i11 = this.f38519i;
                int i12 = this.f38521k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f38521k = i13;
                    return Arrays.copyOfRange(this.f38517g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.s();
            }
            if (i10 == 0) {
                return AbstractC5097y.f38600d;
            }
            throw InvalidProtocolBufferException.l();
        }

        public int H() throws InvalidProtocolBufferException {
            int i10 = this.f38521k;
            if (this.f38519i - i10 < 4) {
                throw InvalidProtocolBufferException.s();
            }
            byte[] bArr = this.f38517g;
            this.f38521k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long I() throws InvalidProtocolBufferException {
            int i10 = this.f38521k;
            if (this.f38519i - i10 < 8) {
                throw InvalidProtocolBufferException.s();
            }
            byte[] bArr = this.f38517g;
            this.f38521k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int J() {
            int i10;
            int i11 = this.f38521k;
            int i12 = this.f38519i;
            if (i12 != i11) {
                byte[] bArr = this.f38517g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f38521k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f38521k = i14;
                    return i10;
                }
            }
            return (int) L();
        }

        public long K() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f38521k;
            int i11 = this.f38519i;
            if (i11 != i10) {
                byte[] bArr = this.f38517g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f38521k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i19] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f38521k = i13;
                    return j10;
                }
            }
            return L();
        }

        long L() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & 127) << i10;
                if ((F() & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        public void N() throws InvalidProtocolBufferException {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void O(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int i11 = this.f38519i;
                int i12 = this.f38521k;
                if (i10 <= i11 - i12) {
                    this.f38521k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.s();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f38523m != i10) {
                throw InvalidProtocolBufferException.c();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int d() {
            return this.f38521k - this.f38522l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public boolean e() {
            return this.f38521k == this.f38519i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public void k(int i10) {
            this.f38525o = i10;
            M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int l(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int iD = i10 + d();
            if (iD < 0) {
                throw InvalidProtocolBufferException.m();
            }
            int i11 = this.f38525o;
            if (iD > i11) {
                throw InvalidProtocolBufferException.s();
            }
            this.f38525o = iD;
            M();
            return i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public boolean m() {
            return K() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public AbstractC5081h n() {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f38519i;
                int i11 = this.f38521k;
                if (iJ <= i10 - i11) {
                    AbstractC5081h abstractC5081hA1 = (this.f38518h && this.f38524n) ? AbstractC5081h.a1(this.f38517g, i11, iJ) : AbstractC5081h.v(this.f38517g, i11, iJ);
                    this.f38521k += iJ;
                    return abstractC5081hA1;
                }
            }
            return iJ == 0 ? AbstractC5081h.f38499b : AbstractC5081h.Z0(G(iJ));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int p() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int q() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public long r() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int t() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public long u() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int v() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public long w() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int x() {
            return AbstractC5082i.b(J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public long y() {
            return AbstractC5082i.c(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public String z() throws InvalidProtocolBufferException {
            int iJ = J();
            if (iJ > 0) {
                int i10 = this.f38519i;
                int i11 = this.f38521k;
                if (iJ <= i10 - i11) {
                    String str = new String(this.f38517g, i11, iJ, AbstractC5097y.f38598b);
                    this.f38521k += iJ;
                    return str;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.s();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f38525o = MPv3.MAX_MESSAGE_ID;
            this.f38517g = bArr;
            this.f38519i = i11 + i10;
            this.f38521k = i10;
            this.f38522l = i10;
            this.f38518h = z10;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    private static final class c extends AbstractC5082i {

        /* renamed from: g, reason: collision with root package name */
        private final InputStream f38526g;

        /* renamed from: h, reason: collision with root package name */
        private final byte[] f38527h;

        /* renamed from: i, reason: collision with root package name */
        private int f38528i;

        /* renamed from: j, reason: collision with root package name */
        private int f38529j;

        /* renamed from: k, reason: collision with root package name */
        private int f38530k;

        /* renamed from: l, reason: collision with root package name */
        private int f38531l;

        /* renamed from: m, reason: collision with root package name */
        private int f38532m;

        /* renamed from: n, reason: collision with root package name */
        private int f38533n;

        private static int F(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e10) {
                e10.o();
                throw e10;
            }
        }

        private static int G(InputStream inputStream, byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (InvalidProtocolBufferException e10) {
                e10.o();
                throw e10;
            }
        }

        private AbstractC5081h H(int i10) throws IOException {
            byte[] bArrK = K(i10);
            if (bArrK != null) {
                return AbstractC5081h.s(bArrK);
            }
            int i11 = this.f38530k;
            int i12 = this.f38528i;
            int length = i12 - i11;
            this.f38532m += i12;
            this.f38530k = 0;
            this.f38528i = 0;
            List<byte[]> listL = L(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f38527h, i11, bArr, 0, length);
            for (byte[] bArr2 : listL) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC5081h.Z0(bArr);
        }

        private byte[] J(int i10, boolean z10) throws IOException {
            byte[] bArrK = K(i10);
            if (bArrK != null) {
                return z10 ? (byte[]) bArrK.clone() : bArrK;
            }
            int i11 = this.f38530k;
            int i12 = this.f38528i;
            int length = i12 - i11;
            this.f38532m += i12;
            this.f38530k = 0;
            this.f38528i = 0;
            List<byte[]> listL = L(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f38527h, i11, bArr, 0, length);
            for (byte[] bArr2 : listL) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] K(int i10) throws InvalidProtocolBufferException {
            if (i10 == 0) {
                return AbstractC5097y.f38600d;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i11 = this.f38532m;
            int i12 = this.f38530k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f38514c > 0) {
                throw InvalidProtocolBufferException.r();
            }
            int i14 = this.f38533n;
            if (i13 > i14) {
                V((i14 - i11) - i12);
                throw InvalidProtocolBufferException.s();
            }
            int i15 = this.f38528i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > F(this.f38526g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f38527h, this.f38530k, bArr, 0, i15);
            this.f38532m += this.f38528i;
            this.f38530k = 0;
            this.f38528i = 0;
            while (i15 < i10) {
                int iG = G(this.f38526g, bArr, i15, i10 - i15);
                if (iG == -1) {
                    throw InvalidProtocolBufferException.s();
                }
                this.f38532m += iG;
                i15 += iG;
            }
            return bArr;
        }

        private List L(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f38526g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.s();
                    }
                    this.f38532m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void R() {
            int i10 = this.f38528i + this.f38529j;
            this.f38528i = i10;
            int i11 = this.f38532m + i10;
            int i12 = this.f38533n;
            if (i11 <= i12) {
                this.f38529j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f38529j = i13;
            this.f38528i = i10 - i13;
        }

        private void S(int i10) throws InvalidProtocolBufferException {
            if (a0(i10)) {
                return;
            }
            if (i10 <= (this.f38514c - this.f38532m) - this.f38530k) {
                throw InvalidProtocolBufferException.s();
            }
            throw InvalidProtocolBufferException.r();
        }

        private static long T(InputStream inputStream, long j10) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j10);
            } catch (InvalidProtocolBufferException e10) {
                e10.o();
                throw e10;
            }
        }

        private void W(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i11 = this.f38532m;
            int i12 = this.f38530k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f38533n;
            if (i13 > i14) {
                V((i14 - i11) - i12);
                throw InvalidProtocolBufferException.s();
            }
            this.f38532m = i11 + i12;
            int i15 = this.f38528i - i12;
            this.f38528i = 0;
            this.f38530k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jT = T(this.f38526g, j10);
                    if (jT < 0 || jT > j10) {
                        throw new IllegalStateException(this.f38526g.getClass() + "#skip returned invalid result: " + jT + "\nThe InputStream implementation is buggy.");
                    }
                    if (jT == 0) {
                        break;
                    } else {
                        i15 += (int) jT;
                    }
                } finally {
                    this.f38532m += i15;
                    R();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f38528i;
            int i17 = i16 - this.f38530k;
            this.f38530k = i16;
            S(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f38528i;
                if (i18 <= i19) {
                    this.f38530k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f38530k = i19;
                    S(1);
                }
            }
        }

        private void X() throws InvalidProtocolBufferException {
            if (this.f38528i - this.f38530k >= 10) {
                Y();
            } else {
                Z();
            }
        }

        private void Y() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f38527h;
                int i11 = this.f38530k;
                this.f38530k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        private void Z() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        private boolean a0(int i10) throws InvalidProtocolBufferException {
            int i11 = this.f38530k;
            int i12 = i11 + i10;
            int i13 = this.f38528i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f38514c;
            int i15 = this.f38532m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f38533n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f38527h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f38532m += i11;
                this.f38528i -= i11;
                this.f38530k = 0;
            }
            InputStream inputStream = this.f38526g;
            byte[] bArr2 = this.f38527h;
            int i16 = this.f38528i;
            int iG = G(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f38514c - this.f38532m) - i16));
            if (iG == 0 || iG < -1 || iG > this.f38527h.length) {
                throw new IllegalStateException(this.f38526g.getClass() + "#read(byte[]) returned invalid result: " + iG + "\nThe InputStream implementation is buggy.");
            }
            if (iG <= 0) {
                return false;
            }
            this.f38528i += iG;
            R();
            if (this.f38528i >= i10) {
                return true;
            }
            return a0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public String A() throws IOException {
            byte[] bArrJ;
            int iO = O();
            int i10 = this.f38530k;
            int i11 = this.f38528i;
            if (iO <= i11 - i10 && iO > 0) {
                bArrJ = this.f38527h;
                this.f38530k = i10 + iO;
            } else {
                if (iO == 0) {
                    return "";
                }
                i10 = 0;
                if (iO <= i11) {
                    S(iO);
                    bArrJ = this.f38527h;
                    this.f38530k = iO;
                } else {
                    bArrJ = J(iO, false);
                }
            }
            return m0.e(bArrJ, i10, iO);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int B() throws InvalidProtocolBufferException {
            if (e()) {
                this.f38531l = 0;
                return 0;
            }
            int iO = O();
            this.f38531l = iO;
            if (n0.a(iO) != 0) {
                return this.f38531l;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int C() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public long D() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public boolean E(int i10) throws InvalidProtocolBufferException {
            int iB = n0.b(i10);
            if (iB == 0) {
                X();
                return true;
            }
            if (iB == 1) {
                V(8);
                return true;
            }
            if (iB == 2) {
                V(O());
                return true;
            }
            if (iB == 3) {
                U();
                a(n0.c(n0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.h();
            }
            V(4);
            return true;
        }

        public byte I() throws InvalidProtocolBufferException {
            if (this.f38530k == this.f38528i) {
                S(1);
            }
            byte[] bArr = this.f38527h;
            int i10 = this.f38530k;
            this.f38530k = i10 + 1;
            return bArr[i10];
        }

        public int M() throws InvalidProtocolBufferException {
            int i10 = this.f38530k;
            if (this.f38528i - i10 < 4) {
                S(4);
                i10 = this.f38530k;
            }
            byte[] bArr = this.f38527h;
            this.f38530k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long N() throws InvalidProtocolBufferException {
            int i10 = this.f38530k;
            if (this.f38528i - i10 < 8) {
                S(8);
                i10 = this.f38530k;
            }
            byte[] bArr = this.f38527h;
            this.f38530k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int O() {
            int i10;
            int i11 = this.f38530k;
            int i12 = this.f38528i;
            if (i12 != i11) {
                byte[] bArr = this.f38527h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f38530k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f38530k = i14;
                    return i10;
                }
            }
            return (int) Q();
        }

        public long P() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f38530k;
            int i11 = this.f38528i;
            if (i11 != i10) {
                byte[] bArr = this.f38527h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f38530k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i19] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f38530k = i13;
                    return j10;
                }
            }
            return Q();
        }

        long Q() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & 127) << i10;
                if ((I() & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        public void U() throws InvalidProtocolBufferException {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void V(int i10) throws InvalidProtocolBufferException {
            int i11 = this.f38528i;
            int i12 = this.f38530k;
            if (i10 > i11 - i12 || i10 < 0) {
                W(i10);
            } else {
                this.f38530k = i12 + i10;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f38531l != i10) {
                throw InvalidProtocolBufferException.c();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int d() {
            return this.f38532m + this.f38530k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public boolean e() {
            return this.f38530k == this.f38528i && !a0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public void k(int i10) {
            this.f38533n = i10;
            R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int l(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i11 = i10 + this.f38532m + this.f38530k;
            int i12 = this.f38533n;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.s();
            }
            this.f38533n = i11;
            R();
            return i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public boolean m() {
            return P() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public AbstractC5081h n() {
            int iO = O();
            int i10 = this.f38528i;
            int i11 = this.f38530k;
            if (iO > i10 - i11 || iO <= 0) {
                return iO == 0 ? AbstractC5081h.f38499b : H(iO);
            }
            AbstractC5081h abstractC5081hV = AbstractC5081h.v(this.f38527h, i11, iO);
            this.f38530k += iO;
            return abstractC5081hV;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public double o() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int p() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int q() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public long r() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public float s() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int t() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public long u() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int v() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public long w() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public int x() {
            return AbstractC5082i.b(O());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public long y() {
            return AbstractC5082i.c(P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5082i
        public String z() throws InvalidProtocolBufferException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f38528i;
                int i11 = this.f38530k;
                if (iO <= i10 - i11) {
                    String str = new String(this.f38527h, i11, iO, AbstractC5097y.f38598b);
                    this.f38530k += iO;
                    return str;
                }
            }
            if (iO == 0) {
                return "";
            }
            if (iO > this.f38528i) {
                return new String(J(iO, false), AbstractC5097y.f38598b);
            }
            S(iO);
            String str2 = new String(this.f38527h, this.f38530k, iO, AbstractC5097y.f38598b);
            this.f38530k += iO;
            return str2;
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f38533n = MPv3.MAX_MESSAGE_ID;
            AbstractC5097y.b(inputStream, "input");
            this.f38526g = inputStream;
            this.f38527h = new byte[i10];
            this.f38528i = 0;
            this.f38530k = 0;
            this.f38532m = 0;
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC5082i f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC5082i g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? h(AbstractC5097y.f38600d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC5082i h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC5082i i(byte[] bArr, int i10, int i11) {
        return j(bArr, i10, i11, false);
    }

    static AbstractC5082i j(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.l(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i10);

    public abstract int l(int i10);

    public abstract boolean m();

    public abstract AbstractC5081h n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    private AbstractC5082i() {
        this.f38513b = f38511f;
        this.f38514c = MPv3.MAX_MESSAGE_ID;
        this.f38516e = false;
    }
}
