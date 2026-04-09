package cv;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class g implements i, h, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public a0 f6705a;

    /* renamed from: d, reason: collision with root package name */
    public long f6706d;

    @Override // cv.h
    public final /* bridge */ /* synthetic */ h B(j jVar) {
        n0(jVar);
        return this;
    }

    @Override // cv.i
    public final int D(v vVar) throws EOFException {
        br.l.e(vVar, "options");
        int iC = dv.a.c(this, vVar, false);
        if (iC == -1) {
            return -1;
        }
        skip(vVar.f6740a[iC].d());
        return iC;
    }

    public final byte[] G(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(c7.a.m(j, "byteCount: ").toString());
        }
        if (this.f6706d < j) {
            throw new EOFException();
        }
        int i10 = (int) j;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        return bArr;
    }

    @Override // cv.h
    public final /* bridge */ /* synthetic */ h H(String str) {
        u0(str);
        return this;
    }

    @Override // cv.i
    public final String J(Charset charset) {
        return V(this.f6706d, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r2 = new cv.g();
        r2.q0(r7);
        r2.p0(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r9 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r2.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r2.Y()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long L() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.g.L():long");
    }

    @Override // cv.h
    public final /* bridge */ /* synthetic */ h M(String str, int i10, int i11) {
        v0(str, i10, i11);
        return this;
    }

    @Override // cv.i
    public final long O(j jVar) {
        br.l.e(jVar, "bytes");
        return w(0L, jVar);
    }

    @Override // cv.h
    public final /* bridge */ /* synthetic */ h P(long j) {
        r0(j);
        return this;
    }

    public final short R() throws EOFException {
        short s8 = readShort();
        return (short) (((s8 & 255) << 8) | ((65280 & s8) >>> 8));
    }

    @Override // cv.i
    public final boolean S(long j) {
        return this.f6706d >= j;
    }

    public final String V(long j, Charset charset) throws EOFException {
        br.l.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(c7.a.m(j, "byteCount: ").toString());
        }
        if (this.f6706d < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        a0 a0Var = this.f6705a;
        br.l.b(a0Var);
        int i10 = a0Var.f6679b;
        if (i10 + j > a0Var.f6680c) {
            return new String(G(j), charset);
        }
        int i11 = (int) j;
        String str = new String(a0Var.f6678a, i10, i11, charset);
        int i12 = a0Var.f6679b + i11;
        a0Var.f6679b = i12;
        this.f6706d -= j;
        if (i12 == a0Var.f6680c) {
            this.f6705a = a0Var.a();
            b0.a(a0Var);
        }
        return str;
    }

    @Override // cv.i
    public final String W() {
        return z(Long.MAX_VALUE);
    }

    public final String Y() {
        return V(this.f6706d, tt.a.f22975a);
    }

    public final j Z(int i10) {
        if (i10 == 0) {
            return j.f6715r;
        }
        xu.l.e(this.f6706d, 0L, i10);
        a0 a0Var = this.f6705a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            br.l.b(a0Var);
            int i14 = a0Var.f6680c;
            int i15 = a0Var.f6679b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            a0Var = a0Var.f6683f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        a0 a0Var2 = this.f6705a;
        int i16 = 0;
        while (i11 < i10) {
            br.l.b(a0Var2);
            bArr[i16] = a0Var2.f6678a;
            i11 += a0Var2.f6680c - a0Var2.f6679b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = a0Var2.f6679b;
            a0Var2.f6681d = true;
            i16++;
            a0Var2 = a0Var2.f6683f;
        }
        return new c0(bArr, iArr);
    }

    public final void b() throws EOFException {
        skip(this.f6706d);
    }

    @Override // cv.i
    public final long b0(j jVar) {
        br.l.e(jVar, "targetBytes");
        return y(0L, jVar);
    }

    public final Object clone() {
        g gVar = new g();
        if (this.f6706d == 0) {
            return gVar;
        }
        a0 a0Var = this.f6705a;
        br.l.b(a0Var);
        a0 a0VarC = a0Var.c();
        gVar.f6705a = a0VarC;
        a0VarC.f6684g = a0VarC;
        a0VarC.f6683f = a0VarC;
        for (a0 a0Var2 = a0Var.f6683f; a0Var2 != a0Var; a0Var2 = a0Var2.f6683f) {
            a0 a0Var3 = a0VarC.f6684g;
            br.l.b(a0Var3);
            br.l.b(a0Var2);
            a0Var3.b(a0Var2.c());
        }
        gVar.f6706d = this.f6706d;
        return gVar;
    }

    @Override // cv.d0
    public final void d0(g gVar, long j) {
        a0 a0VarB;
        br.l.e(gVar, "source");
        if (gVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        xu.l.e(gVar.f6706d, 0L, j);
        while (j > 0) {
            a0 a0Var = gVar.f6705a;
            br.l.b(a0Var);
            int i10 = a0Var.f6680c;
            a0 a0Var2 = gVar.f6705a;
            br.l.b(a0Var2);
            long j7 = i10 - a0Var2.f6679b;
            int i11 = 0;
            if (j < j7) {
                a0 a0Var3 = this.f6705a;
                a0 a0Var4 = a0Var3 != null ? a0Var3.f6684g : null;
                if (a0Var4 != null && a0Var4.f6682e) {
                    if ((a0Var4.f6680c + j) - (a0Var4.f6681d ? 0 : a0Var4.f6679b) <= 8192) {
                        a0 a0Var5 = gVar.f6705a;
                        br.l.b(a0Var5);
                        a0Var5.d(a0Var4, (int) j);
                        gVar.f6706d -= j;
                        this.f6706d += j;
                        return;
                    }
                }
                a0 a0Var6 = gVar.f6705a;
                br.l.b(a0Var6);
                int i12 = (int) j;
                if (i12 <= 0 || i12 > a0Var6.f6680c - a0Var6.f6679b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i12 >= 1024) {
                    a0VarB = a0Var6.c();
                } else {
                    a0VarB = b0.b();
                    byte[] bArr = a0Var6.f6678a;
                    byte[] bArr2 = a0VarB.f6678a;
                    int i13 = a0Var6.f6679b;
                    mq.l.a0(0, i13, i13 + i12, bArr, bArr2);
                }
                a0VarB.f6680c = a0VarB.f6679b + i12;
                a0Var6.f6679b += i12;
                a0 a0Var7 = a0Var6.f6684g;
                br.l.b(a0Var7);
                a0Var7.b(a0VarB);
                gVar.f6705a = a0VarB;
            }
            a0 a0Var8 = gVar.f6705a;
            br.l.b(a0Var8);
            long j10 = a0Var8.f6680c - a0Var8.f6679b;
            gVar.f6705a = a0Var8.a();
            a0 a0Var9 = this.f6705a;
            if (a0Var9 == null) {
                this.f6705a = a0Var8;
                a0Var8.f6684g = a0Var8;
                a0Var8.f6683f = a0Var8;
            } else {
                a0 a0Var10 = a0Var9.f6684g;
                br.l.b(a0Var10);
                a0Var10.b(a0Var8);
                a0 a0Var11 = a0Var8.f6684g;
                if (a0Var11 == a0Var8) {
                    throw new IllegalStateException("cannot compact");
                }
                br.l.b(a0Var11);
                if (a0Var11.f6682e) {
                    int i14 = a0Var8.f6680c - a0Var8.f6679b;
                    a0 a0Var12 = a0Var8.f6684g;
                    br.l.b(a0Var12);
                    int i15 = 8192 - a0Var12.f6680c;
                    a0 a0Var13 = a0Var8.f6684g;
                    br.l.b(a0Var13);
                    if (!a0Var13.f6681d) {
                        a0 a0Var14 = a0Var8.f6684g;
                        br.l.b(a0Var14);
                        i11 = a0Var14.f6679b;
                    }
                    if (i14 <= i15 + i11) {
                        a0 a0Var15 = a0Var8.f6684g;
                        br.l.b(a0Var15);
                        a0Var8.d(a0Var15, i14);
                        a0Var8.a();
                        b0.a(a0Var8);
                    }
                }
            }
            gVar.f6706d -= j10;
            this.f6706d += j10;
            j -= j10;
        }
    }

    @Override // cv.i
    public final long e0(y yVar) {
        long j = this.f6706d;
        if (j > 0) {
            yVar.d0(this, j);
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        long j = this.f6706d;
        g gVar = (g) obj;
        if (j != gVar.f6706d) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        a0 a0Var = this.f6705a;
        br.l.b(a0Var);
        a0 a0Var2 = gVar.f6705a;
        br.l.b(a0Var2);
        int i10 = a0Var.f6679b;
        int i11 = a0Var2.f6679b;
        long j7 = 0;
        while (j7 < this.f6706d) {
            long jMin = Math.min(a0Var.f6680c - i10, a0Var2.f6680c - i11);
            long j10 = 0;
            while (j10 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (a0Var.f6678a[i10] != a0Var2.f6678a[i11]) {
                    return false;
                }
                j10++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == a0Var.f6680c) {
                a0Var = a0Var.f6683f;
                br.l.b(a0Var);
                i10 = a0Var.f6679b;
            }
            if (i11 == a0Var2.f6680c) {
                a0Var2 = a0Var2.f6683f;
                br.l.b(a0Var2);
                i11 = a0Var2.f6679b;
            }
            j7 += jMin;
        }
        return true;
    }

    public final long f() {
        long j = this.f6706d;
        if (j == 0) {
            return 0L;
        }
        a0 a0Var = this.f6705a;
        br.l.b(a0Var);
        a0 a0Var2 = a0Var.f6684g;
        br.l.b(a0Var2);
        return (a0Var2.f6680c >= 8192 || !a0Var2.f6682e) ? j : j - (r3 - a0Var2.f6679b);
    }

    public final a0 f0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        a0 a0Var = this.f6705a;
        if (a0Var == null) {
            a0 a0VarB = b0.b();
            this.f6705a = a0VarB;
            a0VarB.f6684g = a0VarB;
            a0VarB.f6683f = a0VarB;
            return a0VarB;
        }
        a0 a0Var2 = a0Var.f6684g;
        br.l.b(a0Var2);
        if (a0Var2.f6680c + i10 <= 8192 && a0Var2.f6682e) {
            return a0Var2;
        }
        a0 a0VarB2 = b0.b();
        a0Var2.b(a0VarB2);
        return a0VarB2;
    }

    @Override // cv.f0
    public final h0 g() {
        return h0.f6707d;
    }

    @Override // cv.i
    public final void g0(long j) throws EOFException {
        if (this.f6706d < j) {
            throw new EOFException();
        }
    }

    public final void h(g gVar, long j, long j7) {
        br.l.e(gVar, "out");
        long j10 = j;
        xu.l.e(this.f6706d, j10, j7);
        if (j7 == 0) {
            return;
        }
        gVar.f6706d += j7;
        a0 a0Var = this.f6705a;
        while (true) {
            br.l.b(a0Var);
            long j11 = a0Var.f6680c - a0Var.f6679b;
            if (j10 < j11) {
                break;
            }
            j10 -= j11;
            a0Var = a0Var.f6683f;
        }
        a0 a0Var2 = a0Var;
        long j12 = j7;
        while (j12 > 0) {
            br.l.b(a0Var2);
            a0 a0VarC = a0Var2.c();
            int i10 = a0VarC.f6679b + ((int) j10);
            a0VarC.f6679b = i10;
            a0VarC.f6680c = Math.min(i10 + ((int) j12), a0VarC.f6680c);
            a0 a0Var3 = gVar.f6705a;
            if (a0Var3 == null) {
                a0VarC.f6684g = a0VarC;
                a0VarC.f6683f = a0VarC;
                gVar.f6705a = a0VarC;
            } else {
                a0 a0Var4 = a0Var3.f6684g;
                br.l.b(a0Var4);
                a0Var4.b(a0VarC);
            }
            j12 -= a0VarC.f6680c - a0VarC.f6679b;
            a0Var2 = a0Var2.f6683f;
            j10 = 0;
        }
    }

    @Override // cv.h
    public final /* bridge */ /* synthetic */ h h0(long j) {
        q0(j);
        return this;
    }

    public final int hashCode() {
        a0 a0Var = this.f6705a;
        if (a0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = a0Var.f6680c;
            for (int i12 = a0Var.f6679b; i12 < i11; i12++) {
                i10 = (i10 * 31) + a0Var.f6678a[i12];
            }
            a0Var = a0Var.f6683f;
            br.l.b(a0Var);
        } while (a0Var != this.f6705a);
        return i10;
    }

    public final boolean i() {
        return this.f6706d == 0;
    }

    public final void i0(int i10, byte[] bArr) {
        br.l.e(bArr, "source");
        int i11 = 0;
        long j = i10;
        xu.l.e(bArr.length, 0, j);
        while (i11 < i10) {
            a0 a0VarF0 = f0(1);
            int iMin = Math.min(i10 - i11, 8192 - a0VarF0.f6680c);
            int i12 = i11 + iMin;
            mq.l.a0(a0VarF0.f6680c, i11, i12, bArr, a0VarF0.f6678a);
            a0VarF0.f6680c += iMin;
            i11 = i12;
        }
        this.f6706d += j;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // cv.i
    public final j k(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(c7.a.m(j, "byteCount: ").toString());
        }
        if (this.f6706d < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new j(G(j));
        }
        j jVarZ = Z((int) j);
        skip(j);
        return jVarZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    @Override // cv.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f6706d
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            cv.a0 r7 = r15.f6705a
            br.l.b(r7)
            byte[] r8 = r7.f6678a
            int r9 = r7.f6679b
            int r10 = r7.f6680c
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            cv.g r0 = new cv.g
            r0.<init>()
            r0.r0(r4)
            r0.p0(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.Y()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            int r2 = r11 >> 4
            r2 = r2 & 15
            char[] r3 = dv.b.f7591a
            char r2 = r3[r2]
            r4 = r11 & 15
            char r3 = r3[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r2
            r4[r6] = r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L8e:
            if (r9 != r10) goto L9a
            cv.a0 r8 = r7.a()
            r15.f6705a = r8
            cv.b0.a(r7)
            goto L9c
        L9a:
            r7.f6679b = r9
        L9c:
            if (r6 != 0) goto La2
            cv.a0 r7 = r15.f6705a
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.f6706d
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f6706d = r2
            return r4
        La9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.g.k0():long");
    }

    @Override // cv.i
    public final InputStream l0() {
        return new f(this, 0);
    }

    @Override // cv.i
    public final boolean m0(long j, j jVar) {
        br.l.e(jVar, "bytes");
        int iD = jVar.d();
        if (j >= 0 && iD >= 0 && this.f6706d - j >= iD && jVar.d() >= iD) {
            for (int i10 = 0; i10 < iD; i10++) {
                if (q(i10 + j) == jVar.i(i10)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void n0(j jVar) {
        br.l.e(jVar, "byteString");
        jVar.r(this, jVar.d());
    }

    public final long o0(f0 f0Var) {
        br.l.e(f0Var, "source");
        long j = 0;
        while (true) {
            long jU = f0Var.u(this, 8192L);
            if (jU == -1) {
                return j;
            }
            j += jU;
        }
    }

    public final void p0(int i10) {
        a0 a0VarF0 = f0(1);
        byte[] bArr = a0VarF0.f6678a;
        int i11 = a0VarF0.f6680c;
        a0VarF0.f6680c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f6706d++;
    }

    public final byte q(long j) {
        xu.l.e(this.f6706d, j, 1L);
        a0 a0Var = this.f6705a;
        if (a0Var == null) {
            br.l.b(null);
            throw null;
        }
        long j7 = this.f6706d;
        if (j7 - j < j) {
            while (j7 > j) {
                a0Var = a0Var.f6684g;
                br.l.b(a0Var);
                j7 -= a0Var.f6680c - a0Var.f6679b;
            }
            return a0Var.f6678a[(int) ((a0Var.f6679b + j) - j7)];
        }
        long j10 = 0;
        while (true) {
            int i10 = a0Var.f6680c;
            int i11 = a0Var.f6679b;
            long j11 = (i10 - i11) + j10;
            if (j11 > j) {
                return a0Var.f6678a[(int) ((i11 + j) - j10)];
            }
            a0Var = a0Var.f6683f;
            br.l.b(a0Var);
            j10 = j11;
        }
    }

    public final void q0(long j) {
        boolean z10;
        if (j == 0) {
            p0(48);
            return;
        }
        int i10 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                u0("-9223372036854775808");
                return;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j >= 100000000) {
            i10 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i10 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i10 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        a0 a0VarF0 = f0(i10);
        byte[] bArr = a0VarF0.f6678a;
        int i11 = a0VarF0.f6680c + i10;
        while (j != 0) {
            long j7 = 10;
            i11--;
            bArr[i11] = dv.a.f7590a[(int) (j % j7)];
            j /= j7;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        a0VarF0.f6680c += i10;
        this.f6706d += i10;
    }

    @Override // cv.i
    public final byte[] r() {
        return G(this.f6706d);
    }

    public final void r0(long j) {
        if (j == 0) {
            p0(48);
            return;
        }
        long j7 = (j >>> 1) | j;
        long j10 = j7 | (j7 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i10 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) / 4);
        a0 a0VarF0 = f0(i10);
        byte[] bArr = a0VarF0.f6678a;
        int i11 = a0VarF0.f6680c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = dv.a.f7590a[(int) (15 & j)];
            j >>>= 4;
        }
        a0VarF0.f6680c += i10;
        this.f6706d += i10;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        br.l.e(byteBuffer, "sink");
        a0 a0Var = this.f6705a;
        if (a0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), a0Var.f6680c - a0Var.f6679b);
        byteBuffer.put(a0Var.f6678a, a0Var.f6679b, iMin);
        int i10 = a0Var.f6679b + iMin;
        a0Var.f6679b = i10;
        this.f6706d -= iMin;
        if (i10 == a0Var.f6680c) {
            this.f6705a = a0Var.a();
            b0.a(a0Var);
        }
        return iMin;
    }

    @Override // cv.i
    public final byte readByte() {
        if (this.f6706d == 0) {
            throw new EOFException();
        }
        a0 a0Var = this.f6705a;
        br.l.b(a0Var);
        int i10 = a0Var.f6679b;
        int i11 = a0Var.f6680c;
        int i12 = i10 + 1;
        byte b2 = a0Var.f6678a[i10];
        this.f6706d--;
        if (i12 != i11) {
            a0Var.f6679b = i12;
            return b2;
        }
        this.f6705a = a0Var.a();
        b0.a(a0Var);
        return b2;
    }

    @Override // cv.i
    public final int readInt() throws EOFException {
        if (this.f6706d < 4) {
            throw new EOFException();
        }
        a0 a0Var = this.f6705a;
        br.l.b(a0Var);
        int i10 = a0Var.f6679b;
        int i11 = a0Var.f6680c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = a0Var.f6678a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        this.f6706d -= 4;
        if (i14 != i11) {
            a0Var.f6679b = i14;
            return i15;
        }
        this.f6705a = a0Var.a();
        b0.a(a0Var);
        return i15;
    }

    @Override // cv.i
    public final short readShort() throws EOFException {
        if (this.f6706d < 2) {
            throw new EOFException();
        }
        a0 a0Var = this.f6705a;
        br.l.b(a0Var);
        int i10 = a0Var.f6679b;
        int i11 = a0Var.f6680c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = a0Var.f6678a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f6706d -= 2;
        if (i14 == i11) {
            this.f6705a = a0Var.a();
            b0.a(a0Var);
        } else {
            a0Var.f6679b = i14;
        }
        return (short) i15;
    }

    public final void s0(int i10) {
        a0 a0VarF0 = f0(4);
        byte[] bArr = a0VarF0.f6678a;
        int i11 = a0VarF0.f6680c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        a0VarF0.f6680c = i11 + 4;
        this.f6706d += 4;
    }

    @Override // cv.i
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            a0 a0Var = this.f6705a;
            if (a0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, a0Var.f6680c - a0Var.f6679b);
            long j7 = iMin;
            this.f6706d -= j7;
            j -= j7;
            int i10 = a0Var.f6679b + iMin;
            a0Var.f6679b = i10;
            if (i10 == a0Var.f6680c) {
                this.f6705a = a0Var.a();
                b0.a(a0Var);
            }
        }
    }

    public final void t0(int i10) {
        a0 a0VarF0 = f0(2);
        byte[] bArr = a0VarF0.f6678a;
        int i11 = a0VarF0.f6680c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        a0VarF0.f6680c = i11 + 2;
        this.f6706d += 2;
    }

    public final String toString() {
        long j = this.f6706d;
        if (j <= 2147483647L) {
            return Z((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f6706d).toString());
    }

    @Override // cv.f0
    public final long u(g gVar, long j) {
        br.l.e(gVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "byteCount < 0: ").toString());
        }
        long j7 = this.f6706d;
        if (j7 == 0) {
            return -1L;
        }
        if (j > j7) {
            j = j7;
        }
        gVar.d0(this, j);
        return j;
    }

    public final void u0(String str) {
        br.l.e(str, "string");
        v0(str, 0, str.length());
    }

    public final void v0(String str, int i10, int i11) {
        char cCharAt;
        br.l.e(str, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.h(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(h0.b.l("endIndex < beginIndex: ", i11, i10, " < ").toString());
        }
        if (i11 > str.length()) {
            StringBuilder sbU = h0.b.u("endIndex > string.length: ", i11, " > ");
            sbU.append(str.length());
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128) {
                a0 a0VarF0 = f0(1);
                byte[] bArr = a0VarF0.f6678a;
                int i12 = a0VarF0.f6680c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = a0VarF0.f6680c;
                int i15 = (i12 + i10) - i14;
                a0VarF0.f6680c = i14 + i15;
                this.f6706d += i15;
            } else {
                if (cCharAt2 < 2048) {
                    a0 a0VarF02 = f0(2);
                    byte[] bArr2 = a0VarF02.f6678a;
                    int i16 = a0VarF02.f6680c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    a0VarF02.f6680c = i16 + 2;
                    this.f6706d += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    a0 a0VarF03 = f0(3);
                    byte[] bArr3 = a0VarF03.f6678a;
                    int i17 = a0VarF03.f6680c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    a0VarF03.f6680c = i17 + 3;
                    this.f6706d += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        p0(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        a0 a0VarF04 = f0(4);
                        byte[] bArr4 = a0VarF04.f6678a;
                        int i20 = a0VarF04.f6680c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        a0VarF04.f6680c = i20 + 4;
                        this.f6706d += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    public final long w(long j, j jVar) {
        br.l.e(jVar, "bytes");
        if (jVar.d() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j7 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "fromIndex < 0: ").toString());
        }
        a0 a0Var = this.f6705a;
        if (a0Var == null) {
            return -1L;
        }
        long j10 = this.f6706d;
        if (j10 - j < j) {
            while (j10 > j) {
                a0Var = a0Var.f6684g;
                br.l.b(a0Var);
                j10 -= a0Var.f6680c - a0Var.f6679b;
            }
            byte[] bArrH = jVar.h();
            byte b2 = bArrH[0];
            int iD = jVar.d();
            long j11 = (this.f6706d - iD) + 1;
            while (j10 < j11) {
                byte[] bArr = a0Var.f6678a;
                int iMin = (int) Math.min(a0Var.f6680c, (a0Var.f6679b + j11) - j10);
                for (int i10 = (int) ((a0Var.f6679b + j) - j10); i10 < iMin; i10++) {
                    if (bArr[i10] == b2 && dv.a.a(a0Var, i10 + 1, bArrH, iD)) {
                        return (i10 - a0Var.f6679b) + j10;
                    }
                }
                j10 += a0Var.f6680c - a0Var.f6679b;
                a0Var = a0Var.f6683f;
                br.l.b(a0Var);
                j = j10;
            }
            return -1L;
        }
        while (true) {
            long j12 = (a0Var.f6680c - a0Var.f6679b) + j7;
            if (j12 > j) {
                break;
            }
            a0Var = a0Var.f6683f;
            br.l.b(a0Var);
            j7 = j12;
        }
        byte[] bArrH2 = jVar.h();
        byte b10 = bArrH2[0];
        int iD2 = jVar.d();
        long j13 = (this.f6706d - iD2) + 1;
        while (j7 < j13) {
            byte[] bArr2 = a0Var.f6678a;
            int iMin2 = (int) Math.min(a0Var.f6680c, (a0Var.f6679b + j13) - j7);
            for (int i11 = (int) ((a0Var.f6679b + j) - j7); i11 < iMin2; i11++) {
                if (bArr2[i11] == b10 && dv.a.a(a0Var, i11 + 1, bArrH2, iD2)) {
                    return (i11 - a0Var.f6679b) + j7;
                }
            }
            j7 += a0Var.f6680c - a0Var.f6679b;
            a0Var = a0Var.f6683f;
            br.l.b(a0Var);
            j = j7;
        }
        return -1L;
    }

    public final void w0(int i10) {
        if (i10 < 128) {
            p0(i10);
            return;
        }
        if (i10 < 2048) {
            a0 a0VarF0 = f0(2);
            byte[] bArr = a0VarF0.f6678a;
            int i11 = a0VarF0.f6680c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            a0VarF0.f6680c = i11 + 2;
            this.f6706d += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            p0(63);
            return;
        }
        if (i10 < 65536) {
            a0 a0VarF02 = f0(3);
            byte[] bArr2 = a0VarF02.f6678a;
            int i12 = a0VarF02.f6680c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            a0VarF02.f6680c = i12 + 3;
            this.f6706d += 3;
            return;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(xu.l.Z(i10)));
        }
        a0 a0VarF03 = f0(4);
        byte[] bArr3 = a0VarF03.f6678a;
        int i13 = a0VarF03.f6680c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        a0VarF03.f6680c = i13 + 4;
        this.f6706d += 4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        br.l.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            a0 a0VarF0 = f0(1);
            int iMin = Math.min(i10, 8192 - a0VarF0.f6680c);
            byteBuffer.get(a0VarF0.f6678a, a0VarF0.f6680c, iMin);
            i10 -= iMin;
            a0VarF0.f6680c += iMin;
        }
        this.f6706d += iRemaining;
        return iRemaining;
    }

    @Override // cv.h
    public final /* bridge */ /* synthetic */ h writeByte(int i10) {
        p0(i10);
        return this;
    }

    @Override // cv.h
    public final /* bridge */ /* synthetic */ h writeInt(int i10) {
        s0(i10);
        return this;
    }

    @Override // cv.h
    public final /* bridge */ /* synthetic */ h writeShort(int i10) {
        t0(i10);
        return this;
    }

    @Override // cv.i
    public final long x(byte b2, long j, long j7) {
        a0 a0Var;
        long j10 = j;
        long j11 = j7;
        long j12 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + this.f6706d + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long j13 = this.f6706d;
        if (j11 > j13) {
            j11 = j13;
        }
        long j14 = -1;
        if (j10 == j11 || (a0Var = this.f6705a) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                a0Var = a0Var.f6684g;
                br.l.b(a0Var);
                j13 -= a0Var.f6680c - a0Var.f6679b;
            }
            while (j13 < j11) {
                byte[] bArr = a0Var.f6678a;
                long j15 = j14;
                int iMin = (int) Math.min(a0Var.f6680c, (a0Var.f6679b + j11) - j13);
                for (int i10 = (int) ((a0Var.f6679b + j10) - j13); i10 < iMin; i10++) {
                    if (bArr[i10] == b2) {
                        return (i10 - a0Var.f6679b) + j13;
                    }
                }
                j13 += a0Var.f6680c - a0Var.f6679b;
                a0Var = a0Var.f6683f;
                br.l.b(a0Var);
                j14 = j15;
                j10 = j13;
            }
            return j14;
        }
        while (true) {
            long j16 = (a0Var.f6680c - a0Var.f6679b) + j12;
            if (j16 > j10) {
                break;
            }
            a0Var = a0Var.f6683f;
            br.l.b(a0Var);
            j12 = j16;
        }
        while (j12 < j11) {
            byte[] bArr2 = a0Var.f6678a;
            int iMin2 = (int) Math.min(a0Var.f6680c, (a0Var.f6679b + j11) - j12);
            for (int i11 = (int) ((a0Var.f6679b + j10) - j12); i11 < iMin2; i11++) {
                if (bArr2[i11] == b2) {
                    return (i11 - a0Var.f6679b) + j12;
                }
            }
            j12 += a0Var.f6680c - a0Var.f6679b;
            a0Var = a0Var.f6683f;
            br.l.b(a0Var);
            j10 = j12;
        }
        return -1L;
    }

    public final long y(long j, j jVar) {
        br.l.e(jVar, "targetBytes");
        long j7 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "fromIndex < 0: ").toString());
        }
        a0 a0Var = this.f6705a;
        if (a0Var == null) {
            return -1L;
        }
        long j10 = this.f6706d;
        if (j10 - j < j) {
            while (j10 > j) {
                a0Var = a0Var.f6684g;
                br.l.b(a0Var);
                j10 -= a0Var.f6680c - a0Var.f6679b;
            }
            if (jVar.d() == 2) {
                byte bI = jVar.i(0);
                byte bI2 = jVar.i(1);
                while (j10 < this.f6706d) {
                    byte[] bArr = a0Var.f6678a;
                    int i10 = a0Var.f6680c;
                    for (int i11 = (int) ((a0Var.f6679b + j) - j10); i11 < i10; i11++) {
                        byte b2 = bArr[i11];
                        if (b2 == bI || b2 == bI2) {
                            return (i11 - a0Var.f6679b) + j10;
                        }
                    }
                    j10 += a0Var.f6680c - a0Var.f6679b;
                    a0Var = a0Var.f6683f;
                    br.l.b(a0Var);
                    j = j10;
                }
            } else {
                byte[] bArrH = jVar.h();
                while (j10 < this.f6706d) {
                    byte[] bArr2 = a0Var.f6678a;
                    int i12 = a0Var.f6680c;
                    for (int i13 = (int) ((a0Var.f6679b + j) - j10); i13 < i12; i13++) {
                        byte b10 = bArr2[i13];
                        for (byte b11 : bArrH) {
                            if (b10 == b11) {
                                return (i13 - a0Var.f6679b) + j10;
                            }
                        }
                    }
                    j10 += a0Var.f6680c - a0Var.f6679b;
                    a0Var = a0Var.f6683f;
                    br.l.b(a0Var);
                    j = j10;
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = (a0Var.f6680c - a0Var.f6679b) + j7;
            if (j11 > j) {
                break;
            }
            a0Var = a0Var.f6683f;
            br.l.b(a0Var);
            j7 = j11;
        }
        if (jVar.d() == 2) {
            byte bI3 = jVar.i(0);
            byte bI4 = jVar.i(1);
            while (j7 < this.f6706d) {
                byte[] bArr3 = a0Var.f6678a;
                int i14 = a0Var.f6680c;
                for (int i15 = (int) ((a0Var.f6679b + j) - j7); i15 < i14; i15++) {
                    byte b12 = bArr3[i15];
                    if (b12 == bI3 || b12 == bI4) {
                        return (i15 - a0Var.f6679b) + j7;
                    }
                }
                j7 += a0Var.f6680c - a0Var.f6679b;
                a0Var = a0Var.f6683f;
                br.l.b(a0Var);
                j = j7;
            }
        } else {
            byte[] bArrH2 = jVar.h();
            while (j7 < this.f6706d) {
                byte[] bArr4 = a0Var.f6678a;
                int i16 = a0Var.f6680c;
                for (int i17 = (int) ((a0Var.f6679b + j) - j7); i17 < i16; i17++) {
                    byte b13 = bArr4[i17];
                    for (byte b14 : bArrH2) {
                        if (b13 == b14) {
                            return (i17 - a0Var.f6679b) + j7;
                        }
                    }
                }
                j7 += a0Var.f6680c - a0Var.f6679b;
                a0Var = a0Var.f6683f;
                br.l.b(a0Var);
                j = j7;
            }
        }
        return -1L;
    }

    @Override // cv.i
    public final String z(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(c7.a.m(j, "limit < 0: ").toString());
        }
        long j7 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jX = x((byte) 10, 0L, j7);
        if (jX != -1) {
            return dv.a.b(this, jX);
        }
        if (j7 < this.f6706d && q(j7 - 1) == 13 && q(j7) == 10) {
            return dv.a.b(this, j7);
        }
        g gVar = new g();
        h(gVar, 0L, Math.min(32, this.f6706d));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f6706d, j) + " content=" + gVar.k(gVar.f6706d).e() + (char) 8230);
    }

    @Override // cv.h
    public final h write(byte[] bArr) {
        i0(bArr.length, bArr);
        return this;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        xu.l.e(bArr.length, i10, i11);
        a0 a0Var = this.f6705a;
        if (a0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, a0Var.f6680c - a0Var.f6679b);
        byte[] bArr2 = a0Var.f6678a;
        int i12 = a0Var.f6679b;
        mq.l.a0(i10, i12, i12 + iMin, bArr2, bArr);
        int i13 = a0Var.f6679b + iMin;
        a0Var.f6679b = i13;
        this.f6706d -= iMin;
        if (i13 == a0Var.f6680c) {
            this.f6705a = a0Var.a();
            b0.a(a0Var);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, cv.d0
    public final void close() {
    }

    @Override // cv.h, cv.d0, java.io.Flushable
    public final void flush() {
    }

    @Override // cv.i
    public final g s() {
        return this;
    }
}
