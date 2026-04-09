package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import org.snmp4j.asn1.BER;
import org.snmp4j.mp.MPv3;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    private int f51955d;

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f51957f;

    /* renamed from: g, reason: collision with root package name */
    private int f51958g;

    /* renamed from: k, reason: collision with root package name */
    private int f51962k;

    /* renamed from: h, reason: collision with root package name */
    private boolean f51959h = false;

    /* renamed from: j, reason: collision with root package name */
    private int f51961j = MPv3.MAX_MESSAGE_ID;

    /* renamed from: l, reason: collision with root package name */
    private int f51963l = 64;

    /* renamed from: m, reason: collision with root package name */
    private int f51964m = 67108864;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f51952a = new byte[4096];

    /* renamed from: c, reason: collision with root package name */
    private int f51954c = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f51956e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f51960i = 0;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f51953b = false;

    private e(InputStream inputStream) {
        this.f51957f = inputStream;
    }

    public static int A(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & BER.MAX_OID_LENGTH;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.p();
            }
            i11 |= (i13 & BER.MAX_OID_LENGTH) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.p();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.j();
    }

    private void M() {
        int i10 = this.f51954c + this.f51955d;
        this.f51954c = i10;
        int i11 = this.f51960i + i10;
        int i12 = this.f51961j;
        if (i11 <= i12) {
            this.f51955d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f51955d = i13;
        this.f51954c = i10 - i13;
    }

    private void N(int i10) throws InvalidProtocolBufferException {
        if (!S(i10)) {
            throw InvalidProtocolBufferException.p();
        }
    }

    private void R(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.l();
        }
        int i11 = this.f51960i;
        int i12 = this.f51956e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f51961j;
        if (i13 > i14) {
            Q((i14 - i11) - i12);
            throw InvalidProtocolBufferException.p();
        }
        int i15 = this.f51954c;
        int i16 = i15 - i12;
        this.f51956e = i15;
        N(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.f51954c;
            if (i17 <= i18) {
                this.f51956e = i17;
                return;
            } else {
                i16 += i18;
                this.f51956e = i18;
                N(1);
            }
        }
    }

    private boolean S(int i10) throws IOException {
        int i11 = this.f51956e;
        int i12 = i11 + i10;
        int i13 = this.f51954c;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f51960i + i11 + i10 <= this.f51961j && this.f51957f != null) {
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f51952a;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f51960i += i11;
                this.f51954c -= i11;
                this.f51956e = 0;
            }
            InputStream inputStream = this.f51957f;
            byte[] bArr2 = this.f51952a;
            int i14 = this.f51954c;
            int i15 = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > this.f51952a.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f51954c += i15;
                if ((this.f51960i + i10) - this.f51964m > 0) {
                    throw InvalidProtocolBufferException.o();
                }
                M();
                if (this.f51954c >= i10) {
                    return true;
                }
                return S(i10);
            }
        }
        return false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void d(int i10) throws InvalidProtocolBufferException {
        if (this.f51954c - this.f51956e < i10) {
            N(i10);
        }
    }

    public static e g(InputStream inputStream) {
        return new e(inputStream);
    }

    private byte[] w(int i10) throws InvalidProtocolBufferException {
        if (i10 <= 0) {
            if (i10 == 0) {
                return i.f51995a;
            }
            throw InvalidProtocolBufferException.l();
        }
        int i11 = this.f51960i;
        int i12 = this.f51956e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f51961j;
        if (i13 > i14) {
            Q((i14 - i11) - i12);
            throw InvalidProtocolBufferException.p();
        }
        if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.f51954c - i12;
            System.arraycopy(this.f51952a, i12, bArr, 0, i15);
            this.f51956e = this.f51954c;
            int i16 = i10 - i15;
            d(i16);
            System.arraycopy(this.f51952a, 0, bArr, i15, i16);
            this.f51956e = i16;
            return bArr;
        }
        int i17 = this.f51954c;
        this.f51960i = i11 + i17;
        this.f51956e = 0;
        this.f51954c = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, 4096);
            byte[] bArr2 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                InputStream inputStream = this.f51957f;
                int i20 = inputStream == null ? -1 : inputStream.read(bArr2, i19, iMin - i19);
                if (i20 == -1) {
                    throw InvalidProtocolBufferException.p();
                }
                this.f51960i += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(this.f51952a, i12, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public long B() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f51956e;
        int i11 = this.f51954c;
        if (i11 != i10) {
            byte[] bArr = this.f51952a;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f51956e = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j13 = (bArr[i12] << 7) ^ b10;
                if (j13 >= 0) {
                    int i14 = i10 + 3;
                    long j14 = j13 ^ (bArr[i13] << 14);
                    if (j14 >= 0) {
                        j12 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j13 = j14 ^ (bArr[i14] << 21);
                        if (j13 < 0) {
                            j11 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j14 = j13 ^ (bArr[i13] << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j13 = j14 ^ (bArr[i14] << 35);
                                if (j13 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i10 + 7;
                                    j14 = j13 ^ (bArr[i13] << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j13 = j14 ^ (bArr[i14] << 49);
                                        if (j13 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i10 + 9;
                                            long j15 = (j13 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j15 >= 0) {
                                                j10 = j15;
                                                i13 = i14;
                                                this.f51956e = i13;
                                                return j10;
                                            }
                                            i13 = i10 + 10;
                                            if (bArr[i14] >= 0) {
                                                j10 = j15;
                                                this.f51956e = i13;
                                                return j10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j10 = j14 ^ j12;
                    i13 = i14;
                    this.f51956e = i13;
                    return j10;
                }
                j11 = -128;
                j10 = j13 ^ j11;
                this.f51956e = i13;
                return j10;
            }
        }
        return C();
    }

    long C() throws InvalidProtocolBufferException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & 127) << i10;
            if ((v() & 128) == 0) {
                return j10;
            }
        }
        throw InvalidProtocolBufferException.j();
    }

    public int D() {
        return x();
    }

    public long E() {
        return y();
    }

    public int F() {
        return b(z());
    }

    public long G() {
        return c(B());
    }

    public String H() {
        int iZ = z();
        int i10 = this.f51954c;
        int i11 = this.f51956e;
        if (iZ > i10 - i11 || iZ <= 0) {
            return iZ == 0 ? "" : new String(w(iZ), "UTF-8");
        }
        String str = new String(this.f51952a, i11, iZ, "UTF-8");
        this.f51956e += iZ;
        return str;
    }

    public String I() throws InvalidProtocolBufferException {
        byte[] bArrW;
        int iZ = z();
        int i10 = this.f51956e;
        if (iZ <= this.f51954c - i10 && iZ > 0) {
            bArrW = this.f51952a;
            this.f51956e = i10 + iZ;
        } else {
            if (iZ == 0) {
                return "";
            }
            bArrW = w(iZ);
            i10 = 0;
        }
        if (u.f(bArrW, i10, i10 + iZ)) {
            return new String(bArrW, i10, iZ, "UTF-8");
        }
        throw InvalidProtocolBufferException.g();
    }

    public int J() throws InvalidProtocolBufferException {
        if (f()) {
            this.f51958g = 0;
            return 0;
        }
        int iZ = z();
        this.f51958g = iZ;
        if (v.a(iZ) != 0) {
            return this.f51958g;
        }
        throw InvalidProtocolBufferException.d();
    }

    public int K() {
        return z();
    }

    public long L() {
        return B();
    }

    public boolean O(int i10, CodedOutputStream codedOutputStream) throws IOException {
        int iB = v.b(i10);
        if (iB == 0) {
            long jS = s();
            codedOutputStream.n0(i10);
            codedOutputStream.y0(jS);
            return true;
        }
        if (iB == 1) {
            long jY = y();
            codedOutputStream.n0(i10);
            codedOutputStream.U(jY);
            return true;
        }
        if (iB == 2) {
            d dVarK = k();
            codedOutputStream.n0(i10);
            codedOutputStream.O(dVarK);
            return true;
        }
        if (iB == 3) {
            codedOutputStream.n0(i10);
            P(codedOutputStream);
            int iC = v.c(v.a(i10), 4);
            a(iC);
            codedOutputStream.n0(iC);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw InvalidProtocolBufferException.h();
        }
        int iX = x();
        codedOutputStream.n0(i10);
        codedOutputStream.T(iX);
        return true;
    }

    public void P(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        int iJ;
        do {
            iJ = J();
            if (iJ == 0) {
                return;
            }
        } while (O(iJ, codedOutputStream));
    }

    public void Q(int i10) throws InvalidProtocolBufferException {
        int i11 = this.f51954c;
        int i12 = this.f51956e;
        if (i10 > i11 - i12 || i10 < 0) {
            R(i10);
        } else {
            this.f51956e = i12 + i10;
        }
    }

    public void a(int i10) throws InvalidProtocolBufferException {
        if (this.f51958g != i10) {
            throw InvalidProtocolBufferException.c();
        }
    }

    public int e() {
        int i10 = this.f51961j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f51960i + this.f51956e);
    }

    public boolean f() {
        return this.f51956e == this.f51954c && !S(1);
    }

    public void h(int i10) {
        this.f51961j = i10;
        M();
    }

    public int i(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.l();
        }
        int i11 = i10 + this.f51960i + this.f51956e;
        int i12 = this.f51961j;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.p();
        }
        this.f51961j = i11;
        M();
        return i12;
    }

    public boolean j() {
        return B() != 0;
    }

    public d k() {
        int iZ = z();
        int i10 = this.f51954c;
        int i11 = this.f51956e;
        if (iZ > i10 - i11 || iZ <= 0) {
            return iZ == 0 ? d.f51945a : new m(w(iZ));
        }
        d cVar = (this.f51953b && this.f51959h) ? new c(this.f51952a, this.f51956e, iZ) : d.i(this.f51952a, i11, iZ);
        this.f51956e += iZ;
        return cVar;
    }

    public double l() {
        return Double.longBitsToDouble(y());
    }

    public int m() {
        return z();
    }

    public int n() {
        return x();
    }

    public long o() {
        return y();
    }

    public float p() {
        return Float.intBitsToFloat(x());
    }

    public void q(int i10, n.a aVar, f fVar) throws InvalidProtocolBufferException {
        int i11 = this.f51962k;
        if (i11 >= this.f51963l) {
            throw InvalidProtocolBufferException.m();
        }
        this.f51962k = i11 + 1;
        aVar.b0(this, fVar);
        a(v.c(i10, 4));
        this.f51962k--;
    }

    public int r() {
        return z();
    }

    public long s() {
        return B();
    }

    public n t(p pVar, f fVar) throws InvalidProtocolBufferException {
        int iZ = z();
        if (this.f51962k >= this.f51963l) {
            throw InvalidProtocolBufferException.m();
        }
        int i10 = i(iZ);
        this.f51962k++;
        n nVar = (n) pVar.b(this, fVar);
        a(0);
        this.f51962k--;
        h(i10);
        return nVar;
    }

    public void u(n.a aVar, f fVar) throws InvalidProtocolBufferException {
        int iZ = z();
        if (this.f51962k >= this.f51963l) {
            throw InvalidProtocolBufferException.m();
        }
        int i10 = i(iZ);
        this.f51962k++;
        aVar.b0(this, fVar);
        a(0);
        this.f51962k--;
        h(i10);
    }

    public byte v() throws InvalidProtocolBufferException {
        if (this.f51956e == this.f51954c) {
            N(1);
        }
        byte[] bArr = this.f51952a;
        int i10 = this.f51956e;
        this.f51956e = i10 + 1;
        return bArr[i10];
    }

    public int x() throws InvalidProtocolBufferException {
        int i10 = this.f51956e;
        if (this.f51954c - i10 < 4) {
            N(4);
            i10 = this.f51956e;
        }
        byte[] bArr = this.f51952a;
        this.f51956e = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long y() throws InvalidProtocolBufferException {
        int i10 = this.f51956e;
        if (this.f51954c - i10 < 8) {
            N(8);
            i10 = this.f51956e;
        }
        byte[] bArr = this.f51952a;
        this.f51956e = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public int z() {
        int i10;
        int i11 = this.f51956e;
        int i12 = this.f51954c;
        if (i12 != i11) {
            byte[] bArr = this.f51952a;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f51956e = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        long j12 = i17 ^ (bArr[i16] << 21);
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            int i19 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
                            if (bArr[i18] < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i20 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i20;
                                                    i10 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i19;
                            }
                            i10 = i19;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f51956e = i14;
                return i10;
            }
        }
        return (int) C();
    }
}
