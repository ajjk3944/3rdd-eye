package bg;

import ag.AbstractC3844b;
import inet.ipaddr.IncompatibleAddressException;
import inet.ipaddr.c;
import inet.ipaddr.format.validate.r;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4109b extends AbstractC3844b {

    /* renamed from: bg.b$a */
    class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        boolean f33245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f33246b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c.a f33247c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f33248d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f33249e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f33250f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f33251g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Integer f33252h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Zf.d f33253i;

        a(boolean z10, c.a aVar, int i10, int i11, int i12, int i13, Integer num, Zf.d dVar) {
            this.f33246b = z10;
            this.f33247c = aVar;
            this.f33248d = i10;
            this.f33249e = i11;
            this.f33250f = i12;
            this.f33251g = i13;
            this.f33252h = num;
            this.f33253i = dVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Zf.d next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f33245a = true;
            return this.f33246b ? this.f33247c.c(this.f33248d & this.f33249e, this.f33250f | this.f33251g, this.f33252h) : this.f33253i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f33245a;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: bg.b$b, reason: collision with other inner class name */
    class C1164b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33254a = true;

        /* renamed from: b, reason: collision with root package name */
        private int f33255b;

        /* renamed from: c, reason: collision with root package name */
        private int f33256c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f33257d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f33258e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f33259f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.a f33260g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f33261h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f33262i;

        C1164b(int i10, int i11, int i12, c.a aVar, int i13, Integer num) {
            this.f33257d = i10;
            this.f33258e = i11;
            this.f33259f = i12;
            this.f33260g = aVar;
            this.f33261h = i13;
            this.f33262i = num;
            this.f33255b = i10 >>> i12;
            this.f33256c = i11 >>> i12;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Zf.d next() {
            if (!this.f33254a) {
                throw new NoSuchElementException();
            }
            int i10 = this.f33255b;
            int i11 = i10 << this.f33259f;
            Zf.d dVarC = this.f33260g.c(i11, this.f33261h | i11, this.f33262i);
            int i12 = i10 + 1;
            if (i12 > this.f33256c) {
                this.f33254a = false;
            } else {
                this.f33255b = i12;
            }
            return dVarC;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33254a;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: bg.b$c */
    class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33263a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f33264b;

        /* renamed from: c, reason: collision with root package name */
        private int f33265c;

        /* renamed from: d, reason: collision with root package name */
        private int f33266d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f33267e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f33268f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f33269g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f33270h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ c.a f33271i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Integer f33272j;

        c(int i10, int i11, int i12, int i13, c.a aVar, Integer num) {
            this.f33267e = i10;
            this.f33268f = i11;
            this.f33269g = i12;
            this.f33270h = i13;
            this.f33271i = aVar;
            this.f33272j = num;
            this.f33265c = i10 >>> i12;
            this.f33266d = i11 >>> i12;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Zf.d next() {
            if (!this.f33263a) {
                throw new NoSuchElementException();
            }
            int i10 = this.f33265c;
            int i11 = i10 << this.f33269g;
            int i12 = this.f33270h | i11;
            int i13 = i10 + 1;
            this.f33265c = i13;
            if (!this.f33264b) {
                i11 = this.f33267e;
                this.f33264b = true;
            }
            if (i13 > this.f33266d) {
                i12 = this.f33268f;
                this.f33263a = false;
            }
            return this.f33271i.c(i11, i12, this.f33272j);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33263a;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: bg.b$d */
    class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33273a = true;

        /* renamed from: b, reason: collision with root package name */
        private int f33274b;

        /* renamed from: c, reason: collision with root package name */
        private int f33275c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f33276d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f33277e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.a f33278f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Integer f33279g;

        d(int i10, int i11, c.a aVar, Integer num) {
            this.f33276d = i10;
            this.f33277e = i11;
            this.f33278f = aVar;
            this.f33279g = num;
            this.f33274b = i10;
            this.f33275c = i11;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Zf.d next() {
            if (!this.f33273a) {
                throw new NoSuchElementException();
            }
            Zf.d dVarG = this.f33278f.g(this.f33274b, this.f33279g);
            int i10 = this.f33274b + 1;
            this.f33274b = i10;
            this.f33273a = i10 <= this.f33275c;
            return dVarG;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33273a;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    protected AbstractC4109b() {
    }

    private int O1(int i10, long j10, int i11) {
        if (i10 >= 0) {
            return i10;
        }
        return Math.max(0, s(i11) - AbstractC3844b.d1(j10, i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void P1(long r18, int r20, int r21, boolean r22, char r23, java.lang.String r24, java.lang.StringBuilder r25) {
        /*
            r0 = r18
            r2 = r20
            r3 = r24
            r4 = r25
            r5 = 2
            if (r2 < r5) goto L7b
            r5 = 85
            if (r2 > r5) goto L7b
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 > 0) goto L18
            r7 = 1
            goto L19
        L18:
            r7 = 0
        L19:
            if (r7 == 0) goto L1d
            int r9 = (int) r0
            goto L1e
        L1d:
            r9 = r2
        L1e:
            if (r22 == 0) goto L23
            char[] r10 = ag.AbstractC3844b.f26203l
            goto L25
        L23:
            char[] r10 = ag.AbstractC3844b.f26199h
        L25:
            int r11 = r24.length()
            r12 = r9
            r9 = r7
            r7 = r21
        L2d:
            if (r12 < r2) goto L6e
            if (r9 == 0) goto L3d
            int r13 = r12 / r2
            if (r7 <= 0) goto L39
            int r7 = r7 + (-1)
            r12 = r13
            goto L2d
        L39:
            int r12 = r12 % r2
            r8 = r12
            r12 = r13
            goto L5e
        L3d:
            long r13 = (long) r2
            r18 = r9
            long r8 = r0 / r13
            int r15 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r15 > 0) goto L4a
            int r12 = (int) r8
            r15 = r12
            r12 = 1
            goto L4d
        L4a:
            r15 = r12
            r12 = r18
        L4d:
            if (r7 <= 0) goto L55
            int r7 = r7 + (-1)
            r0 = r8
            r9 = r12
            r12 = r15
            goto L2d
        L55:
            long r0 = r0 % r13
            int r0 = (int) r0
            r16 = r8
            r8 = r0
            r0 = r16
            r9 = r12
            r12 = r15
        L5e:
            if (r11 <= 0) goto L63
            r4.append(r3)
        L63:
            char r8 = r10[r8]
            r4.append(r8)
            r8 = r23
            r4.append(r8)
            goto L2d
        L6e:
            if (r7 != 0) goto L7a
            if (r11 <= 0) goto L75
            r4.append(r3)
        L75:
            char r0 = r10[r12]
            r4.append(r0)
        L7a:
            return
        L7b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.AbstractC4109b.P1(long, int, int, boolean, char, java.lang.String, java.lang.StringBuilder):void");
    }

    private static void Q1(long j10, long j11, String str, String str2, int i10, boolean z10, char c10, boolean z11, String str3, StringBuilder sb2) {
        long j12;
        int i11;
        int i12;
        long j13;
        int i13;
        long j14;
        int i14;
        long j15;
        long j16;
        int i15;
        long j17 = j11;
        if (i10 < 2 || i10 > 85) {
            throw new IllegalArgumentException();
        }
        char[] cArr = z10 ? AbstractC3844b.f26203l : AbstractC3844b.f26199h;
        long j18 = 2147483647L;
        boolean z12 = j17 <= 2147483647L;
        if (z12) {
            i12 = (int) j17;
            j12 = j10;
            i11 = (int) j12;
        } else {
            j12 = j10;
            i11 = i10;
            i12 = i11;
        }
        int length = str3.length();
        boolean z13 = true;
        while (true) {
            if (z12) {
                int i16 = i12 % i10;
                i14 = i12 / i10;
                if (i12 == i11) {
                    i13 = i16;
                    i11 = i14;
                } else {
                    i13 = i11 % i10;
                    i11 /= i10;
                }
                j15 = j17;
                j14 = j18;
                j16 = j12;
                i15 = i16;
            } else {
                int i17 = i12;
                long j19 = i10;
                int i18 = (int) (j17 % j19);
                long j20 = j17 / j19;
                if (j17 == j12) {
                    i13 = i18;
                    j13 = j20;
                } else {
                    int i19 = (int) (j12 % j19);
                    j13 = j12 / j19;
                    i13 = i19;
                }
                j14 = 2147483647L;
                if (j20 <= 2147483647L) {
                    i11 = (int) j13;
                    j15 = j20;
                    i14 = (int) j20;
                    j16 = j13;
                    z12 = true;
                } else {
                    i14 = i17;
                    j15 = j20;
                    j16 = j13;
                }
                i15 = i18;
            }
            if (i13 == i15) {
                if (z11) {
                    if (length > 0) {
                        sb2.append(str3);
                    }
                    sb2.append(cArr[i13]);
                } else {
                    sb2.append(cArr[i13]);
                    for (int i20 = length - 1; i20 >= 0; i20--) {
                        sb2.append(str3.charAt(i20));
                    }
                }
                z13 = false;
            } else {
                if (!z13) {
                    throw new IncompatibleAddressException(j16, j15, "ipaddress.error.splitMismatch");
                }
                boolean z14 = i13 == 0 && i15 == i10 + (-1);
                if (!z14 || str2 == null) {
                    if (z11) {
                        if (length > 0) {
                            sb2.append(str3);
                        }
                        sb2.append(cArr[i13]);
                        sb2.append(str);
                        sb2.append(cArr[i15]);
                    } else {
                        sb2.append(cArr[i15]);
                        sb2.append(str);
                        sb2.append(cArr[i13]);
                        for (int i21 = length - 1; i21 >= 0; i21--) {
                            sb2.append(str3.charAt(i21));
                        }
                    }
                } else if (z11) {
                    sb2.append(str2);
                } else {
                    for (int length2 = str2.length() - 1; length2 >= 0; length2--) {
                        sb2.append(str2.charAt(length2));
                    }
                }
                z13 = z14;
            }
            if (i14 == 0) {
                return;
            }
            sb2.append(c10);
            j18 = j14;
            i12 = i14;
            j12 = j16;
            j17 = j15;
        }
    }

    private String R1(int i10) {
        StringBuilder sb2 = new StringBuilder(20);
        q1(inet.ipaddr.a.f49277c, 0, 0, "", i10, false, false, sb2);
        return sb2.toString();
    }

    private static int S1(int i10, long j10, long j11, long j12) {
        int i11 = 1;
        int i12 = i10;
        while (true) {
            long j13 = i12;
            if (j10 % j13 != 0) {
                return 0;
            }
            long j14 = j12 / j13 == j11 / j13 ? j12 % j13 : i12 - 1;
            long j15 = j11 % j13;
            if (j15 != j14) {
                return 0;
            }
            if (j11 - j15 == j10) {
                return i11;
            }
            i11++;
            i12 *= i10;
        }
    }

    protected static Iterator b2(Zf.d dVar, int i10, int i11, int i12, c.a aVar, Integer num, boolean z10, boolean z11) {
        int i13;
        int i14;
        int i15;
        if (z10) {
            int iIntValue = i12 - num.intValue();
            int i16 = (-1) << iIntValue;
            i13 = iIntValue;
            i14 = i16;
            i15 = ~i16;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        return (dVar == null || dVar.A0()) ? z10 ? z11 ? new C1164b(i10, i11, i13, aVar, i15, num) : new c(i10, i11, i13, i15, aVar, num) : new d(i10, i11, aVar, num) : new a(z11, aVar, i10, i14, i11, i15, num, dVar);
    }

    protected static Iterator c2(Zf.d dVar, c.a aVar, Integer num, boolean z10, boolean z11) {
        return b2(dVar, dVar.Q(), dVar.w0(), dVar.f(), aVar, num, z10, z11);
    }

    protected static r.j d2(long j10, long j11, long j12, long j13) {
        return r.o2(j10, j11, j12, j13);
    }

    static boolean g2(long j10, long j11, long j12, long j13, long j14) {
        return j10 == (j13 & j10) && j12 == (j11 | j14);
    }

    protected static String h2(long j10, int i10) {
        int i11;
        int i12;
        int i13 = 2;
        if (i10 < 2 || i10 > 85 || j10 < 0) {
            throw new IllegalArgumentException();
        }
        if (j10 == 0) {
            return "0";
        }
        if (j10 == 1) {
            return "1";
        }
        if (i10 == 10) {
            if (j10 < 10) {
                return String.valueOf(AbstractC3844b.f26199h, (int) j10, 1);
            }
            if (j10 < 100) {
                i12 = (int) j10;
            } else {
                if (j10 >= 1000) {
                    return Long.toString(j10, i10);
                }
                i12 = (int) j10;
                i13 = 3;
            }
            char[] cArr = new char[i13];
            char[] cArr2 = AbstractC3844b.f26199h;
            while (true) {
                int i14 = (52429 * i12) >>> 19;
                i13--;
                cArr[i13] = cArr2[i12 - ((i14 << 3) + (i14 << 1))];
                if (i14 == 0) {
                    return new String(cArr);
                }
                i12 = i14;
            }
        } else {
            if (i10 != 16) {
                return Long.toString(j10, i10);
            }
            if (j10 < 16) {
                return String.valueOf(AbstractC3844b.f26199h, (int) j10, 1);
            }
            if (j10 < 256) {
                i11 = (int) j10;
            } else if (j10 < 4096) {
                i11 = (int) j10;
                i13 = 3;
            } else {
                if (j10 >= 65536) {
                    return Long.toString(j10, i10);
                }
                if (j10 == 65535) {
                    return "ffff";
                }
                i11 = (int) j10;
                i13 = 4;
            }
            char[] cArr3 = new char[i13];
            char[] cArr4 = AbstractC3844b.f26199h;
            while (true) {
                int i15 = i11 >>> 4;
                i13--;
                cArr3[i13] = cArr4[i11 - (i15 << 4)];
                if (i15 == 0) {
                    return new String(cArr3);
                }
                i11 = i15;
            }
        }
    }

    private static void i2(long j10, int i10, int i11, boolean z10, char c10, boolean z11, String str, StringBuilder sb2) {
        int length = sb2.length();
        P1(j10, i10, i11, z10, c10, str, sb2);
        if (z11) {
            return;
        }
        int length2 = str.length();
        int i12 = length + length2;
        for (int length3 = sb2.length() - 1; i12 < length3; length3 = (length3 - 2) - length2) {
            char cCharAt = sb2.charAt(i12);
            sb2.setCharAt(i12, sb2.charAt(length3));
            sb2.setCharAt(length3, cCharAt);
            i12 = i12 + 2 + length2;
        }
    }

    private static void j2(long j10, long j11, String str, String str2, int i10, boolean z10, char c10, boolean z11, String str3, StringBuilder sb2) {
        int length = sb2.length();
        Q1(j10, j11, str, str2, i10, z10, c10, z11, str3, sb2);
        if (z11) {
            return;
        }
        for (int length2 = sb2.length() - 1; length < length2; length2--) {
            char cCharAt = sb2.charAt(length);
            sb2.setCharAt(length, sb2.charAt(length2));
            sb2.setCharAt(length2, cCharAt);
            length++;
        }
    }

    private static int k2(long j10, long j11, String str, String str2, int i10, int i11, boolean z10, char c10, boolean z11, String str3) {
        if (i11 < 2 || i11 > 85) {
            throw new IllegalArgumentException();
        }
        int length = str3.length();
        int length2 = -1;
        do {
            long j12 = i11;
            length2 += (((int) (j10 % j12)) == 0 && ((int) (j11 % j12)) == i11 + (-1)) ? str2.length() + 1 : (length << 1) + 4;
            j11 /= j12;
            j10 /= j12;
        } while (j11 != j10);
        int iK1 = (j11 == 0 ? 0 : AbstractC3844b.K1(j11, i11)) + i10;
        return iK1 > 0 ? length2 + (iK1 * (length + 2)) : length2;
    }

    @Override // ag.InterfaceC3849g
    public abstract boolean A0();

    @Override // ag.AbstractC3844b
    protected void B1(int i10, boolean z10, StringBuilder sb2) {
        AbstractC3844b.H1(a2(), i10, 0, z10, sb2);
    }

    @Override // ag.AbstractC3844b
    protected int C1(int i10) {
        return AbstractC3844b.K1(a2(), i10);
    }

    @Override // ag.InterfaceC3849g
    public boolean H0() {
        return !A0() && O();
    }

    @Override // ag.AbstractC3844b
    protected int J(int i10, int i11) {
        return O1(i10, W1(), i11);
    }

    @Override // ag.InterfaceC3849g
    public abstract boolean L();

    @Override // ag.InterfaceC3849g
    public abstract boolean O();

    @Override // ag.InterfaceC3849g
    public BigInteger R() {
        return BigInteger.valueOf(a2());
    }

    protected String T1() {
        return h2(W1(), b1());
    }

    protected String U1() {
        return V1(W1(), a2(), b1());
    }

    protected String V1(long j10, long j11, int i10) {
        int i11;
        int i12;
        int i13 = 2;
        if (i10 == 10) {
            if (j11 < 10) {
                i12 = 1;
            } else if (j11 < 100) {
                i12 = 2;
            } else {
                if (j11 >= 1000) {
                    return R1(i10);
                }
                i12 = 3;
            }
            int i14 = (int) j11;
            if (j10 < 10) {
                i13 = 1;
            } else if (j10 >= 100) {
                if (j10 >= 1000) {
                    return R1(i10);
                }
                i13 = 3;
            }
            int i15 = (int) j10;
            int i16 = i12 + i13 + 1;
            char[] cArr = new char[i16];
            cArr[i13] = '-';
            char[] cArr2 = AbstractC3844b.f26199h;
            while (true) {
                int i17 = (i15 * 52429) >>> 19;
                i13--;
                cArr[i13] = cArr2[i15 - ((i17 << 3) + (i17 << 1))];
                if (i17 == 0) {
                    break;
                }
                i15 = i17;
            }
            while (true) {
                int i18 = (i14 * 52429) >>> 19;
                i16--;
                cArr[i16] = cArr2[i14 - ((i18 << 3) + (i18 << 1))];
                if (i18 == 0) {
                    return new String(cArr);
                }
                i14 = i18;
            }
        } else {
            if (i10 != 16) {
                return R1(i10);
            }
            if (j11 < 16) {
                i11 = 1;
            } else if (j11 < 256) {
                i11 = 2;
            } else if (j11 < 4096) {
                i11 = 3;
            } else {
                if (j11 >= 65536) {
                    return R1(i10);
                }
                i11 = 4;
            }
            int i19 = (int) j11;
            if (j10 < 16) {
                i13 = 1;
            } else if (j10 >= 256) {
                if (j10 < 4096) {
                    i13 = 3;
                } else {
                    if (j10 >= 65536) {
                        return R1(i10);
                    }
                    i13 = 4;
                }
            }
            int i20 = (int) j10;
            int i21 = i11 + i13 + 1;
            char[] cArr3 = new char[i21];
            cArr3[i13] = '-';
            char[] cArr4 = AbstractC3844b.f26199h;
            while (true) {
                int i22 = i20 >>> 4;
                i13--;
                cArr3[i13] = cArr4[i20 - (i22 << 4)];
                if (i22 == 0) {
                    break;
                }
                i20 = i22;
            }
            while (true) {
                int i23 = i19 >>> 4;
                i21--;
                cArr3[i21] = cArr4[i19 - (i23 << 4)];
                if (i23 == 0) {
                    return new String(cArr3);
                }
                i19 = i23;
            }
        }
    }

    public abstract long W1();

    public abstract long X1();

    public int Y1() {
        int iNumberOfTrailingZeros;
        int iF = f();
        if (!A0()) {
            return iF;
        }
        if (w()) {
            return 0;
        }
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(W1());
        return (iNumberOfTrailingZeros2 == 0 || (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~a2())) == 0) ? iF : iF - Math.min(iNumberOfTrailingZeros2, iNumberOfTrailingZeros);
    }

    @Override // ag.AbstractC3844b
    protected String Z0() {
        return inet.ipaddr.a.f49277c;
    }

    protected int Z1() {
        return S1(b1(), W1(), a2(), X1());
    }

    public abstract long a2();

    @Override // ag.AbstractC3844b
    protected int b0(int i10, int i11) {
        return O1(i10, a2(), i11);
    }

    @Override // ag.InterfaceC3849g
    public boolean c0() {
        return !A0() && L();
    }

    public boolean e2(long j10) {
        return !A0() && j10 == W1();
    }

    public boolean f2(long j10, long j11) {
        return (!A0() || (((-1) >>> Long.numberOfLeadingZeros(W1() ^ a2())) & j11) == 0) && j10 == (j11 & W1());
    }

    @Override // ag.InterfaceC3849g
    public BigInteger getValue() {
        return BigInteger.valueOf(W1());
    }

    @Override // ag.AbstractC3844b
    protected void h1(int i10, int i11, boolean z10, StringBuilder sb2) {
        AbstractC3844b.H1(W1(), i10, i11, z10, sb2);
    }

    @Override // ag.AbstractC3844b
    protected void i1(int i10, boolean z10, StringBuilder sb2) {
        AbstractC3844b.H1(W1(), i10, 0, z10, sb2);
    }

    @Override // ag.AbstractC3844b
    protected int j1(int i10) {
        return AbstractC3844b.K1(W1(), i10);
    }

    @Override // ag.AbstractC3844b
    protected int m1(int i10) {
        if (!A0()) {
            return 0;
        }
        if (i10 == b1()) {
            return Z1();
        }
        if (i10 < 2 || i10 > 85) {
            throw new IllegalArgumentException();
        }
        return S1(i10, W1(), a2(), X1());
    }

    @Override // cg.InterfaceC4257a
    public int s(int i10) {
        return i10 == b1() ? k1() : AbstractC3844b.l1(i10, f(), X1());
    }

    @Override // ag.AbstractC3844b
    protected void u1(int i10, int i11, boolean z10, char c10, boolean z11, String str, StringBuilder sb2) {
        i2(W1(), i10, i11, z10, c10, z11, str, sb2);
    }

    @Override // ag.AbstractC3844b
    protected void x1(String str, String str2, int i10, boolean z10, char c10, boolean z11, String str3, StringBuilder sb2) {
        j2(W1(), a2(), str, str2, i10, z10, c10, z11, str3, sb2);
    }

    @Override // ag.AbstractC3844b
    protected int y1(String str, String str2, int i10, int i11, boolean z10, char c10, boolean z11, String str3) {
        return k2(W1(), a2(), str, str2, i10, i11, z10, c10, z11, str3);
    }
}
