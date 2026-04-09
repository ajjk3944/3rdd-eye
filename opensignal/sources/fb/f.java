package fb;

import java.nio.charset.Charset;
import java.util.Arrays;
import qb.v;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8800a;

    /* renamed from: b, reason: collision with root package name */
    public int f8801b;

    /* renamed from: c, reason: collision with root package name */
    public int f8802c;

    public f() {
        this.f8800a = v.f20833f;
    }

    public int a() {
        return this.f8802c - this.f8801b;
    }

    public void b(int i10) {
        byte[] bArr = this.f8800a;
        if (i10 > bArr.length) {
            this.f8800a = Arrays.copyOf(bArr, i10);
        }
    }

    public void c(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f8800a, this.f8801b, bArr, i10, i11);
        this.f8801b += i11;
    }

    public int d() {
        byte[] bArr = this.f8800a;
        int i10 = this.f8801b;
        int i11 = i10 + 1;
        this.f8801b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f8801b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f8801b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f8801b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String e() {
        /*
            r8 = this;
            int r0 = r8.a()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r8.f8801b
        La:
            int r1 = r8.f8802c
            r2 = 13
            r3 = 10
            if (r0 >= r1) goto L20
            byte[] r1 = r8.f8800a
            r1 = r1[r0]
            int r4 = qb.v.f20828a
            if (r1 == r3) goto L20
            if (r1 != r2) goto L1d
            goto L20
        L1d:
            int r0 = r0 + 1
            goto La
        L20:
            int r1 = r8.f8801b
            int r4 = r0 - r1
            r5 = 3
            if (r4 < r5) goto L42
            byte[] r4 = r8.f8800a
            r6 = r4[r1]
            r7 = -17
            if (r6 != r7) goto L42
            int r6 = r1 + 1
            r6 = r4[r6]
            r7 = -69
            if (r6 != r7) goto L42
            int r6 = r1 + 2
            r4 = r4[r6]
            r6 = -65
            if (r4 != r6) goto L42
            int r1 = r1 + r5
            r8.f8801b = r1
        L42:
            byte[] r1 = r8.f8800a
            int r4 = r8.f8801b
            int r5 = r0 - r4
            int r6 = qb.v.f20828a
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = ne.g.f17524c
            r6.<init>(r1, r4, r5, r7)
            r8.f8801b = r0
            int r1 = r8.f8802c
            if (r0 != r1) goto L58
            goto L6f
        L58:
            byte[] r4 = r8.f8800a
            r5 = r4[r0]
            if (r5 != r2) goto L65
            int r0 = r0 + 1
            r8.f8801b = r0
            if (r0 != r1) goto L65
            goto L6f
        L65:
            int r0 = r8.f8801b
            r1 = r4[r0]
            if (r1 != r3) goto L6f
            int r0 = r0 + 1
            r8.f8801b = r0
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.f.e():java.lang.String");
    }

    public int f() {
        byte[] bArr = this.f8800a;
        int i10 = this.f8801b;
        int i11 = i10 + 1;
        this.f8801b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f8801b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f8801b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f8801b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public long g() {
        byte[] bArr = this.f8800a;
        int i10 = this.f8801b;
        this.f8801b = i10 + 1;
        this.f8801b = i10 + 2;
        this.f8801b = i10 + 3;
        long j = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f8801b = i10 + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public int h() {
        int iF = f();
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalStateException(w.g.e("Top bit not zero: ", 29, iF));
    }

    public int i() {
        byte[] bArr = this.f8800a;
        int i10 = this.f8801b;
        int i11 = i10 + 1;
        this.f8801b = i11;
        int i12 = bArr[i10] & 255;
        this.f8801b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long j() {
        byte[] bArr = this.f8800a;
        int i10 = this.f8801b;
        this.f8801b = i10 + 1;
        this.f8801b = i10 + 2;
        this.f8801b = i10 + 3;
        long j = ((bArr[i10] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f8801b = i10 + 4;
        long j7 = j | ((bArr[r4] & 255) << 32);
        this.f8801b = i10 + 5;
        long j10 = j7 | ((bArr[r7] & 255) << 24);
        this.f8801b = i10 + 6;
        long j11 = j10 | ((bArr[r4] & 255) << 16);
        this.f8801b = i10 + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 8);
        this.f8801b = i10 + 8;
        return (bArr[r4] & 255) | j12;
    }

    public String k() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f8801b;
        while (i10 < this.f8802c && this.f8800a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f8800a;
        int i11 = this.f8801b;
        int i12 = v.f20828a;
        String str = new String(bArr, i11, i10 - i11, ne.g.f17524c);
        this.f8801b = i10;
        if (i10 < this.f8802c) {
            this.f8801b = i10 + 1;
        }
        return str;
    }

    public String l(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f8801b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f8802c || this.f8800a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f8800a;
        int i14 = v.f20828a;
        String str = new String(bArr, i11, i13, ne.g.f17524c);
        this.f8801b += i10;
        return str;
    }

    public String m(int i10, Charset charset) {
        String str = new String(this.f8800a, this.f8801b, i10, charset);
        this.f8801b += i10;
        return str;
    }

    public int n() {
        return (o() << 21) | (o() << 14) | (o() << 7) | o();
    }

    public int o() {
        byte[] bArr = this.f8800a;
        int i10 = this.f8801b;
        this.f8801b = i10 + 1;
        return bArr[i10] & 255;
    }

    public long p() {
        byte[] bArr = this.f8800a;
        int i10 = this.f8801b;
        this.f8801b = i10 + 1;
        this.f8801b = i10 + 2;
        this.f8801b = i10 + 3;
        long j = ((bArr[i10] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f8801b = i10 + 4;
        return (bArr[r4] & 255) | j;
    }

    public int q() {
        byte[] bArr = this.f8800a;
        int i10 = this.f8801b;
        int i11 = i10 + 1;
        this.f8801b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f8801b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f8801b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public int r() {
        int iD = d();
        if (iD >= 0) {
            return iD;
        }
        throw new IllegalStateException(w.g.e("Top bit not zero: ", 29, iD));
    }

    public long s() {
        long j = j();
        if (j >= 0) {
            return j;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(j);
        throw new IllegalStateException(sb2.toString());
    }

    public int t() {
        byte[] bArr = this.f8800a;
        int i10 = this.f8801b;
        int i11 = i10 + 1;
        this.f8801b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f8801b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public long u() {
        int i10;
        int i11;
        long j = this.f8800a[this.f8801b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j) != 0) {
                i12--;
            } else if (i12 < 6) {
                j &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("Invalid UTF-8 sequence first byte: ");
            sb2.append(j);
            throw new NumberFormatException(sb2.toString());
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.f8800a[this.f8801b + i10] & 192) != 128) {
                StringBuilder sb3 = new StringBuilder(62);
                sb3.append("Invalid UTF-8 sequence continuation byte: ");
                sb3.append(j);
                throw new NumberFormatException(sb3.toString());
            }
            j = (j << 6) | (r3 & 63);
        }
        this.f8801b += i11;
        return j;
    }

    public void v(int i10) {
        byte[] bArr = this.f8800a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        w(i10, bArr);
    }

    public void w(int i10, byte[] bArr) {
        this.f8800a = bArr;
        this.f8802c = i10;
        this.f8801b = 0;
    }

    public void x(int i10) {
        qb.b.g(i10 >= 0 && i10 <= this.f8800a.length);
        this.f8802c = i10;
    }

    public void y(int i10) {
        qb.b.g(i10 >= 0 && i10 <= this.f8802c);
        this.f8801b = i10;
    }

    public void z(int i10) {
        y(this.f8801b + i10);
    }

    public f(int i10) {
        this.f8800a = new byte[i10];
        this.f8802c = i10;
    }

    public f(byte[] bArr) {
        this.f8800a = bArr;
        this.f8802c = bArr.length;
    }

    public f(int i10, byte[] bArr) {
        this.f8800a = bArr;
        this.f8802c = i10;
    }
}
