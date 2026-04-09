package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1730h;
import g0.C4356c;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CodedInputStream.java */
/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1731i {

    /* renamed from: a, reason: collision with root package name */
    public int f15607a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15608b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final int f15609c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public C1732j f15610d;

    /* compiled from: CodedInputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    public static final class a extends AbstractC1731i {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f15611e;

        /* renamed from: f, reason: collision with root package name */
        public int f15612f;

        /* renamed from: g, reason: collision with root package name */
        public int f15613g;

        /* renamed from: h, reason: collision with root package name */
        public int f15614h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public int f15615j;

        /* renamed from: k, reason: collision with root package name */
        public int f15616k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i, int i10, boolean z10) {
            this.f15611e = bArr;
            this.f15612f = i10 + i;
            this.f15614h = i;
            this.i = i;
        }

        public final long A() throws IOException {
            int i = this.f15614h;
            if (this.f15612f - i < 8) {
                throw C1747z.f();
            }
            this.f15614h = i + 8;
            byte[] bArr = this.f15611e;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final int B() throws IOException {
            int i;
            int i10 = this.f15614h;
            int i11 = this.f15612f;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f15611e;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f15614h = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        i = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            i = i16 ^ 16256;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                i = (-2080896) ^ i18;
                            } else {
                                i15 = i10 + 5;
                                byte b11 = bArr[i17];
                                int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i17 = i10 + 6;
                                    if (bArr[i15] < 0) {
                                        i15 = i10 + 7;
                                        if (bArr[i17] < 0) {
                                            i17 = i10 + 8;
                                            if (bArr[i15] < 0) {
                                                i15 = i10 + 9;
                                                if (bArr[i17] < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i15] >= 0) {
                                                        i13 = i20;
                                                        i = i19;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i19;
                                }
                                i = i19;
                            }
                            i13 = i17;
                        }
                        i13 = i15;
                    }
                    this.f15614h = i13;
                    return i;
                }
            }
            return (int) D();
        }

        public final long C() throws IOException {
            long j4;
            long j10;
            long j11;
            long j12;
            int i = this.f15614h;
            int i10 = this.f15612f;
            if (i10 != i) {
                int i11 = i + 1;
                byte[] bArr = this.f15611e;
                byte b10 = bArr[i];
                if (b10 >= 0) {
                    this.f15614h = i11;
                    return b10;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i + 2;
                    int i13 = (bArr[i11] << 7) ^ b10;
                    if (i13 < 0) {
                        j4 = i13 ^ (-128);
                    } else {
                        int i14 = i + 3;
                        int i15 = (bArr[i12] << 14) ^ i13;
                        if (i15 >= 0) {
                            j4 = i15 ^ 16256;
                            i12 = i14;
                        } else {
                            int i16 = i + 4;
                            int i17 = i15 ^ (bArr[i14] << 21);
                            if (i17 < 0) {
                                j12 = (-2080896) ^ i17;
                            } else {
                                long j13 = i17;
                                i12 = i + 5;
                                long j14 = j13 ^ (bArr[i16] << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    i16 = i + 6;
                                    long j15 = j14 ^ (bArr[i12] << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i12 = i + 7;
                                        j14 = j15 ^ (bArr[i16] << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i16 = i + 8;
                                            j15 = j14 ^ (bArr[i12] << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i12 = i + 9;
                                                long j16 = (j15 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i18 = i + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i12 = i18;
                                                    }
                                                }
                                                j4 = j16;
                                            }
                                        }
                                    }
                                    j12 = j10 ^ j15;
                                }
                                j4 = j11 ^ j14;
                            }
                            i12 = i16;
                            j4 = j12;
                        }
                    }
                    this.f15614h = i12;
                    return j4;
                }
            }
            return D();
        }

        public final long D() throws IOException {
            long j4 = 0;
            for (int i = 0; i < 64; i += 7) {
                int i10 = this.f15614h;
                if (i10 == this.f15612f) {
                    throw C1747z.f();
                }
                this.f15614h = i10 + 1;
                j4 |= (r3 & 127) << i;
                if ((this.f15611e[i10] & 128) == 0) {
                    return j4;
                }
            }
            throw C1747z.c();
        }

        public final void E() {
            int i = this.f15612f + this.f15613g;
            this.f15612f = i;
            int i10 = i - this.i;
            int i11 = this.f15616k;
            if (i10 <= i11) {
                this.f15613g = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f15613g = i12;
            this.f15612f = i - i12;
        }

        public final void F(int i) throws IOException {
            if (i >= 0) {
                int i10 = this.f15612f;
                int i11 = this.f15614h;
                if (i <= i10 - i11) {
                    this.f15614h = i11 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw C1747z.f();
            }
            throw C1747z.d();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final void a(int i) throws C1747z {
            if (this.f15615j != i) {
                throw new C1747z("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int c() {
            return this.f15614h - this.i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final boolean d() throws IOException {
            return this.f15614h == this.f15612f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final void e(int i) {
            this.f15616k = i;
            E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int f(int i) throws C1747z {
            if (i < 0) {
                throw C1747z.d();
            }
            int iC = c() + i;
            int i10 = this.f15616k;
            if (iC > i10) {
                throw C1747z.f();
            }
            this.f15616k = iC;
            E();
            return i10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final boolean g() throws IOException {
            return C() != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.datastore.preferences.protobuf.AbstractC1730h.e h() throws java.io.IOException {
            /*
                r4 = this;
                int r0 = r4.B()
                byte[] r1 = r4.f15611e
                if (r0 <= 0) goto L19
                int r2 = r4.f15612f
                int r3 = r4.f15614h
                int r2 = r2 - r3
                if (r0 > r2) goto L19
                androidx.datastore.preferences.protobuf.h$e r1 = androidx.datastore.preferences.protobuf.AbstractC1730h.c(r3, r0, r1)
                int r2 = r4.f15614h
                int r2 = r2 + r0
                r4.f15614h = r2
                return r1
            L19:
                if (r0 != 0) goto L1e
                androidx.datastore.preferences.protobuf.h$e r0 = androidx.datastore.preferences.protobuf.AbstractC1730h.f15603c
                return r0
            L1e:
                if (r0 <= 0) goto L2f
                int r2 = r4.f15612f
                int r3 = r4.f15614h
                int r2 = r2 - r3
                if (r0 > r2) goto L2f
                int r0 = r0 + r3
                r4.f15614h = r0
                byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
                goto L35
            L2f:
                if (r0 > 0) goto L42
                if (r0 != 0) goto L3d
                byte[] r0 = androidx.datastore.preferences.protobuf.C1746y.f15708b
            L35:
                androidx.datastore.preferences.protobuf.h$e r1 = androidx.datastore.preferences.protobuf.AbstractC1730h.f15603c
                androidx.datastore.preferences.protobuf.h$e r1 = new androidx.datastore.preferences.protobuf.h$e
                r1.<init>(r0)
                return r1
            L3d:
                androidx.datastore.preferences.protobuf.z r0 = androidx.datastore.preferences.protobuf.C1747z.d()
                throw r0
            L42:
                androidx.datastore.preferences.protobuf.z r0 = androidx.datastore.preferences.protobuf.C1747z.f()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC1731i.a.h():androidx.datastore.preferences.protobuf.h$e");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final double i() throws IOException {
            return Double.longBitsToDouble(A());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int j() throws IOException {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int k() throws IOException {
            return z();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final long l() throws IOException {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final float m() throws IOException {
            return Float.intBitsToFloat(z());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int n() throws IOException {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final long o() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int p() throws IOException {
            return z();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final long q() throws IOException {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int r() throws IOException {
            int iB = B();
            return (-(iB & 1)) ^ (iB >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final long s() throws IOException {
            return AbstractC1731i.b(C());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final String t() throws IOException {
            int iB = B();
            if (iB > 0) {
                int i = this.f15612f;
                int i10 = this.f15614h;
                if (iB <= i - i10) {
                    String str = new String(this.f15611e, i10, iB, C1746y.f15707a);
                    this.f15614h += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB < 0) {
                throw C1747z.d();
            }
            throw C1747z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final String u() throws IOException {
            int iB = B();
            if (iB > 0) {
                int i = this.f15612f;
                int i10 = this.f15614h;
                if (iB <= i - i10) {
                    String strA = p0.f15687a.a(this.f15611e, i10, iB);
                    this.f15614h += iB;
                    return strA;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw C1747z.d();
            }
            throw C1747z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int v() throws IOException {
            if (d()) {
                this.f15615j = 0;
                return 0;
            }
            int iB = B();
            this.f15615j = iB;
            if ((iB >>> 3) != 0) {
                return iB;
            }
            throw new C1747z("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int w() throws IOException {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final long x() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final boolean y(int i) throws IOException {
            int iV;
            int i10 = i & 7;
            int i11 = 0;
            if (i10 == 0) {
                int i12 = this.f15612f - this.f15614h;
                byte[] bArr = this.f15611e;
                if (i12 >= 10) {
                    while (i11 < 10) {
                        int i13 = this.f15614h;
                        this.f15614h = i13 + 1;
                        if (bArr[i13] < 0) {
                            i11++;
                        }
                    }
                    throw C1747z.c();
                }
                while (i11 < 10) {
                    int i14 = this.f15614h;
                    if (i14 == this.f15612f) {
                        throw C1747z.f();
                    }
                    this.f15614h = i14 + 1;
                    if (bArr[i14] < 0) {
                        i11++;
                    }
                }
                throw C1747z.c();
                return true;
            }
            if (i10 == 1) {
                F(8);
                return true;
            }
            if (i10 == 2) {
                F(B());
                return true;
            }
            if (i10 != 3) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 5) {
                    throw C1747z.b();
                }
                F(4);
                return true;
            }
            do {
                iV = v();
                if (iV == 0) {
                    break;
                }
            } while (y(iV));
            a(((i >>> 3) << 3) | 4);
            return true;
        }

        public final int z() throws IOException {
            int i = this.f15614h;
            if (this.f15612f - i < 4) {
                throw C1747z.f();
            }
            this.f15614h = i + 4;
            byte[] bArr = this.f15611e;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i$b */
    public static final class b extends AbstractC1731i {

        /* renamed from: e, reason: collision with root package name */
        public final FileInputStream f15617e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f15618f;

        /* renamed from: g, reason: collision with root package name */
        public int f15619g;

        /* renamed from: h, reason: collision with root package name */
        public int f15620h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public int f15621j;

        /* renamed from: k, reason: collision with root package name */
        public int f15622k;

        /* renamed from: l, reason: collision with root package name */
        public int f15623l = Integer.MAX_VALUE;

        public b(FileInputStream fileInputStream) {
            Charset charset = C1746y.f15707a;
            this.f15617e = fileInputStream;
            this.f15618f = new byte[4096];
            this.f15619g = 0;
            this.i = 0;
            this.f15622k = 0;
        }

        public final byte[] A(int i) throws IOException {
            if (i == 0) {
                return C1746y.f15708b;
            }
            if (i < 0) {
                throw C1747z.d();
            }
            int i10 = this.f15622k;
            int i11 = this.i;
            int i12 = i10 + i11 + i;
            if (i12 - this.f15609c > 0) {
                throw new C1747z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i13 = this.f15623l;
            if (i12 > i13) {
                J((i13 - i10) - i11);
                throw C1747z.f();
            }
            int i14 = this.f15619g - i11;
            int i15 = i - i14;
            FileInputStream fileInputStream = this.f15617e;
            if (i15 >= 4096 && i15 > fileInputStream.available()) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f15618f, this.i, bArr, 0, i14);
            this.f15622k += this.f15619g;
            this.i = 0;
            this.f15619g = 0;
            while (i14 < i) {
                int i16 = fileInputStream.read(bArr, i14, i - i14);
                if (i16 == -1) {
                    throw C1747z.f();
                }
                this.f15622k += i16;
                i14 += i16;
            }
            return bArr;
        }

        public final ArrayList B(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i10 = 0;
                while (i10 < iMin) {
                    int i11 = this.f15617e.read(bArr, i10, iMin - i10);
                    if (i11 == -1) {
                        throw C1747z.f();
                    }
                    this.f15622k += i11;
                    i10 += i11;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int C() throws IOException {
            int i = this.i;
            if (this.f15619g - i < 4) {
                I(4);
                i = this.i;
            }
            this.i = i + 4;
            byte[] bArr = this.f15618f;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long D() throws IOException {
            int i = this.i;
            if (this.f15619g - i < 8) {
                I(8);
                i = this.i;
            }
            this.i = i + 8;
            byte[] bArr = this.f15618f;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final int E() throws IOException {
            int i;
            int i10 = this.i;
            int i11 = this.f15619g;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f15618f;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.i = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        i = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            i = i16 ^ 16256;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                i = (-2080896) ^ i18;
                            } else {
                                i15 = i10 + 5;
                                byte b11 = bArr[i17];
                                int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i17 = i10 + 6;
                                    if (bArr[i15] < 0) {
                                        i15 = i10 + 7;
                                        if (bArr[i17] < 0) {
                                            i17 = i10 + 8;
                                            if (bArr[i15] < 0) {
                                                i15 = i10 + 9;
                                                if (bArr[i17] < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i15] >= 0) {
                                                        i13 = i20;
                                                        i = i19;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i19;
                                }
                                i = i19;
                            }
                            i13 = i17;
                        }
                        i13 = i15;
                    }
                    this.i = i13;
                    return i;
                }
            }
            return (int) G();
        }

        public final long F() throws IOException {
            long j4;
            long j10;
            long j11;
            long j12;
            int i = this.i;
            int i10 = this.f15619g;
            if (i10 != i) {
                int i11 = i + 1;
                byte[] bArr = this.f15618f;
                byte b10 = bArr[i];
                if (b10 >= 0) {
                    this.i = i11;
                    return b10;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i + 2;
                    int i13 = (bArr[i11] << 7) ^ b10;
                    if (i13 < 0) {
                        j4 = i13 ^ (-128);
                    } else {
                        int i14 = i + 3;
                        int i15 = (bArr[i12] << 14) ^ i13;
                        if (i15 >= 0) {
                            j4 = i15 ^ 16256;
                            i12 = i14;
                        } else {
                            int i16 = i + 4;
                            int i17 = i15 ^ (bArr[i14] << 21);
                            if (i17 < 0) {
                                j12 = (-2080896) ^ i17;
                            } else {
                                long j13 = i17;
                                i12 = i + 5;
                                long j14 = j13 ^ (bArr[i16] << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    i16 = i + 6;
                                    long j15 = j14 ^ (bArr[i12] << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i12 = i + 7;
                                        j14 = j15 ^ (bArr[i16] << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i16 = i + 8;
                                            j15 = j14 ^ (bArr[i12] << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i12 = i + 9;
                                                long j16 = (j15 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i18 = i + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i12 = i18;
                                                    }
                                                }
                                                j4 = j16;
                                            }
                                        }
                                    }
                                    j12 = j10 ^ j15;
                                }
                                j4 = j11 ^ j14;
                            }
                            i12 = i16;
                            j4 = j12;
                        }
                    }
                    this.i = i12;
                    return j4;
                }
            }
            return G();
        }

        public final long G() throws IOException {
            long j4 = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.i == this.f15619g) {
                    I(1);
                }
                int i10 = this.i;
                this.i = i10 + 1;
                j4 |= (r3 & 127) << i;
                if ((this.f15618f[i10] & 128) == 0) {
                    return j4;
                }
            }
            throw C1747z.c();
        }

        public final void H() {
            int i = this.f15619g + this.f15620h;
            this.f15619g = i;
            int i10 = this.f15622k + i;
            int i11 = this.f15623l;
            if (i10 <= i11) {
                this.f15620h = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f15620h = i12;
            this.f15619g = i - i12;
        }

        public final void I(int i) throws IOException {
            if (K(i)) {
                return;
            }
            if (i <= (this.f15609c - this.f15622k) - this.i) {
                throw C1747z.f();
            }
            throw new C1747z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void J(int i) throws IOException {
            int i10 = this.f15619g;
            int i11 = this.i;
            int i12 = i10 - i11;
            if (i <= i12 && i >= 0) {
                this.i = i11 + i;
                return;
            }
            FileInputStream fileInputStream = this.f15617e;
            if (i < 0) {
                throw C1747z.d();
            }
            int i13 = this.f15622k;
            int i14 = i13 + i11;
            int i15 = i14 + i;
            int i16 = this.f15623l;
            if (i15 > i16) {
                J((i16 - i13) - i11);
                throw C1747z.f();
            }
            this.f15622k = i14;
            this.f15619g = 0;
            this.i = 0;
            while (i12 < i) {
                long j4 = i - i12;
                try {
                    long jSkip = fileInputStream.skip(j4);
                    if (jSkip < 0 || jSkip > j4) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } finally {
                    this.f15622k += i12;
                    H();
                }
            }
            if (i12 >= i) {
                return;
            }
            int i17 = this.f15619g;
            int i18 = i17 - this.i;
            this.i = i17;
            I(1);
            while (true) {
                int i19 = i - i18;
                int i20 = this.f15619g;
                if (i19 <= i20) {
                    this.i = i19;
                    return;
                } else {
                    i18 += i20;
                    this.i = i20;
                    I(1);
                }
            }
        }

        public final boolean K(int i) throws IOException {
            int i10 = this.i;
            int i11 = i10 + i;
            int i12 = this.f15619g;
            if (i11 <= i12) {
                throw new IllegalStateException(C4356c.i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i13 = this.f15622k;
            int i14 = this.f15609c;
            if (i <= (i14 - i13) - i10 && i13 + i10 + i <= this.f15623l) {
                byte[] bArr = this.f15618f;
                if (i10 > 0) {
                    if (i12 > i10) {
                        System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                    }
                    this.f15622k += i10;
                    this.f15619g -= i10;
                    this.i = 0;
                }
                int i15 = this.f15619g;
                int iMin = Math.min(bArr.length - i15, (i14 - this.f15622k) - i15);
                FileInputStream fileInputStream = this.f15617e;
                int i16 = fileInputStream.read(bArr, i15, iMin);
                if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
                }
                if (i16 > 0) {
                    this.f15619g += i16;
                    H();
                    if (this.f15619g >= i) {
                        return true;
                    }
                    return K(i);
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final void a(int i) throws C1747z {
            if (this.f15621j != i) {
                throw new C1747z("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int c() {
            return this.f15622k + this.i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final boolean d() throws IOException {
            return this.i == this.f15619g && !K(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final void e(int i) {
            this.f15623l = i;
            H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int f(int i) throws C1747z {
            if (i < 0) {
                throw C1747z.d();
            }
            int i10 = this.f15622k + this.i + i;
            int i11 = this.f15623l;
            if (i10 > i11) {
                throw C1747z.f();
            }
            this.f15623l = i10;
            H();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final boolean g() throws IOException {
            return F() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final AbstractC1730h.e h() throws IOException {
            int iE = E();
            int i = this.f15619g;
            int i10 = this.i;
            int i11 = i - i10;
            byte[] bArr = this.f15618f;
            if (iE <= i11 && iE > 0) {
                AbstractC1730h.e eVarC = AbstractC1730h.c(i10, iE, bArr);
                this.i += iE;
                return eVarC;
            }
            if (iE == 0) {
                return AbstractC1730h.f15603c;
            }
            byte[] bArrA = A(iE);
            if (bArrA != null) {
                return AbstractC1730h.c(0, bArrA.length, bArrA);
            }
            int i12 = this.i;
            int i13 = this.f15619g;
            int length = i13 - i12;
            this.f15622k += i13;
            this.i = 0;
            this.f15619g = 0;
            ArrayList arrayListB = B(iE - length);
            byte[] bArr2 = new byte[iE];
            System.arraycopy(bArr, i12, bArr2, 0, length);
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            AbstractC1730h.e eVar = AbstractC1730h.f15603c;
            return new AbstractC1730h.e(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final double i() throws IOException {
            return Double.longBitsToDouble(D());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int j() throws IOException {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int k() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final long l() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final float m() throws IOException {
            return Float.intBitsToFloat(C());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int n() throws IOException {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final long o() throws IOException {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int p() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final long q() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int r() throws IOException {
            int iE = E();
            return (-(iE & 1)) ^ (iE >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final long s() throws IOException {
            return AbstractC1731i.b(F());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final String t() throws IOException {
            int iE = E();
            byte[] bArr = this.f15618f;
            if (iE > 0) {
                int i = this.f15619g;
                int i10 = this.i;
                if (iE <= i - i10) {
                    String str = new String(bArr, i10, iE, C1746y.f15707a);
                    this.i += iE;
                    return str;
                }
            }
            if (iE == 0) {
                return "";
            }
            if (iE > this.f15619g) {
                return new String(z(iE), C1746y.f15707a);
            }
            I(iE);
            String str2 = new String(bArr, this.i, iE, C1746y.f15707a);
            this.i += iE;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final String u() throws IOException {
            int iE = E();
            int i = this.i;
            int i10 = this.f15619g;
            int i11 = i10 - i;
            byte[] bArrZ = this.f15618f;
            if (iE <= i11 && iE > 0) {
                this.i = i + iE;
            } else {
                if (iE == 0) {
                    return "";
                }
                i = 0;
                if (iE <= i10) {
                    I(iE);
                    this.i = iE;
                } else {
                    bArrZ = z(iE);
                }
            }
            return p0.f15687a.a(bArrZ, i, iE);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int v() throws IOException {
            if (d()) {
                this.f15621j = 0;
                return 0;
            }
            int iE = E();
            this.f15621j = iE;
            if ((iE >>> 3) != 0) {
                return iE;
            }
            throw new C1747z("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final int w() throws IOException {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final long x() throws IOException {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1731i
        public final boolean y(int i) throws IOException {
            int iV;
            int i10 = i & 7;
            int i11 = 0;
            if (i10 == 0) {
                int i12 = this.f15619g - this.i;
                byte[] bArr = this.f15618f;
                if (i12 >= 10) {
                    while (i11 < 10) {
                        int i13 = this.i;
                        this.i = i13 + 1;
                        if (bArr[i13] < 0) {
                            i11++;
                        }
                    }
                    throw C1747z.c();
                }
                while (i11 < 10) {
                    if (this.i == this.f15619g) {
                        I(1);
                    }
                    int i14 = this.i;
                    this.i = i14 + 1;
                    if (bArr[i14] < 0) {
                        i11++;
                    }
                }
                throw C1747z.c();
                return true;
            }
            if (i10 == 1) {
                J(8);
                return true;
            }
            if (i10 == 2) {
                J(E());
                return true;
            }
            if (i10 != 3) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 5) {
                    throw C1747z.b();
                }
                J(4);
                return true;
            }
            do {
                iV = v();
                if (iV == 0) {
                    break;
                }
            } while (y(iV));
            a(((i >>> 3) << 3) | 4);
            return true;
        }

        public final byte[] z(int i) throws IOException {
            byte[] bArrA = A(i);
            if (bArrA != null) {
                return bArrA;
            }
            int i10 = this.i;
            int i11 = this.f15619g;
            int length = i11 - i10;
            this.f15622k += i11;
            this.i = 0;
            this.f15619g = 0;
            ArrayList arrayListB = B(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f15618f, i10, bArr, 0, length);
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }
    }

    public static long b(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public abstract void a(int i) throws C1747z;

    public abstract int c();

    public abstract boolean d() throws IOException;

    public abstract void e(int i);

    public abstract int f(int i) throws C1747z;

    public abstract boolean g() throws IOException;

    public abstract AbstractC1730h.e h() throws IOException;

    public abstract double i() throws IOException;

    public abstract int j() throws IOException;

    public abstract int k() throws IOException;

    public abstract long l() throws IOException;

    public abstract float m() throws IOException;

    public abstract int n() throws IOException;

    public abstract long o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract String t() throws IOException;

    public abstract String u() throws IOException;

    public abstract int v() throws IOException;

    public abstract int w() throws IOException;

    public abstract long x() throws IOException;

    public abstract boolean y(int i) throws IOException;
}
