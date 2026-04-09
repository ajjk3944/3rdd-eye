package b5;

import h9.f2;
import h9.l0;
import h9.s0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

/* loaded from: classes.dex */
public class m implements g, s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2457a;

    /* renamed from: d, reason: collision with root package name */
    public int f2458d;

    /* renamed from: g, reason: collision with root package name */
    public Object f2459g;

    /* renamed from: r, reason: collision with root package name */
    public Object f2460r;

    public m() {
        this.f2459g = new io.sentry.internal.debugmeta.c(5);
        this.f2457a = 8000;
        this.f2458d = 8000;
    }

    public static int k(int i10, int i11) {
        return m(i11) + r(i10);
    }

    public static int l(int i10, int i11) {
        return m(i11) + r(i10);
    }

    public static int m(int i10) {
        if (i10 >= 0) {
            return p(i10);
        }
        return 10;
    }

    public static int n(int i10, rs.b bVar) {
        return o(bVar) + r(i10);
    }

    public static int o(rs.b bVar) {
        int iC = bVar.c();
        return p(iC) + iC;
    }

    public static int p(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int q(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int r(int i10) {
        return p(i10 << 3);
    }

    public static boolean y(int i10) {
        return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
    }

    public static m z(OutputStream outputStream, int i10) {
        byte[] bArr = new byte[i10];
        m mVar = new m();
        mVar.f2460r = outputStream;
        mVar.f2459g = bArr;
        mVar.f2458d = 0;
        mVar.f2457a = bArr.length;
        return mVar;
    }

    public Integer A() {
        int i10 = this.f2457a;
        if (i10 == this.f2458d) {
            return null;
        }
        String str = (String) this.f2460r;
        this.f2457a = i10 + 1;
        return Integer.valueOf(str.charAt(i10));
    }

    public float B() {
        h9.u uVar = (h9.u) this.f2459g;
        float fA = uVar.a((String) this.f2460r, this.f2457a, this.f2458d);
        if (!Float.isNaN(fA)) {
            this.f2457a = uVar.f10496a;
        }
        return fA;
    }

    public l0 C() {
        float fB = B();
        if (Float.isNaN(fB)) {
            return null;
        }
        f2 f2VarG = G();
        return f2VarG == null ? new l0(fB, f2.px) : new l0(fB, f2VarG);
    }

    public String D() {
        String str = (String) this.f2460r;
        if (v()) {
            return null;
        }
        int i10 = this.f2457a;
        char cCharAt = str.charAt(i10);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iH = h();
        while (iH != -1 && iH != cCharAt) {
            iH = h();
        }
        if (iH == -1) {
            this.f2457a = i10;
            return null;
        }
        int i11 = this.f2457a;
        this.f2457a = i11 + 1;
        return str.substring(i10 + 1, i11);
    }

    public String E() {
        return F(' ', false);
    }

    public String F(char c4, boolean z10) {
        String str = (String) this.f2460r;
        if (v()) {
            return null;
        }
        char cCharAt = str.charAt(this.f2457a);
        if ((!z10 && y(cCharAt)) || cCharAt == c4) {
            return null;
        }
        int i10 = this.f2457a;
        int iH = h();
        while (iH != -1 && iH != c4 && (z10 || !y(iH))) {
            iH = h();
        }
        return str.substring(i10, this.f2457a);
    }

    public f2 G() {
        String str = (String) this.f2460r;
        if (v()) {
            return null;
        }
        if (str.charAt(this.f2457a) == '%') {
            this.f2457a++;
            return f2.percent;
        }
        int i10 = this.f2457a;
        if (i10 > this.f2458d - 2) {
            return null;
        }
        try {
            f2 f2VarValueOf = f2.valueOf(str.substring(i10, i10 + 2).toLowerCase(Locale.US));
            this.f2457a += 2;
            return f2VarValueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public float H() {
        J();
        h9.u uVar = (h9.u) this.f2459g;
        float fA = uVar.a((String) this.f2460r, this.f2457a, this.f2458d);
        if (!Float.isNaN(fA)) {
            this.f2457a = uVar.f10496a;
        }
        return fA;
    }

    public void I() throws IOException {
        OutputStream outputStream = (OutputStream) this.f2460r;
        if (outputStream == null) {
            throw new androidx.datastore.preferences.protobuf.m("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.f2459g, 0, this.f2458d);
        this.f2458d = 0;
    }

    public boolean J() {
        K();
        int i10 = this.f2457a;
        if (i10 == this.f2458d || ((String) this.f2460r).charAt(i10) != ',') {
            return false;
        }
        this.f2457a++;
        K();
        return true;
    }

    public void K() {
        while (true) {
            int i10 = this.f2457a;
            if (i10 >= this.f2458d || !y(((String) this.f2460r).charAt(i10))) {
                return;
            } else {
                this.f2457a++;
            }
        }
    }

    public void L(int i10, int i11) throws IOException {
        X(i10, 0);
        N(i11);
    }

    public void M(int i10, int i11) throws IOException {
        X(i10, 0);
        N(i11);
    }

    public void N(int i10) throws IOException {
        if (i10 >= 0) {
            V(i10);
        } else {
            W(i10);
        }
    }

    public void O(int i10, rs.b bVar) throws IOException {
        X(i10, 2);
        P(bVar);
    }

    public void P(rs.b bVar) throws IOException {
        V(bVar.c());
        bVar.f(this);
    }

    public void Q(int i10) throws IOException {
        byte b2 = (byte) i10;
        if (this.f2458d == this.f2457a) {
            I();
        }
        byte[] bArr = (byte[]) this.f2459g;
        int i11 = this.f2458d;
        this.f2458d = i11 + 1;
        bArr[i11] = b2;
    }

    public void R(rs.e eVar) throws IOException {
        int size = eVar.size();
        byte[] bArr = (byte[]) this.f2459g;
        int i10 = this.f2457a;
        int i11 = this.f2458d;
        int i12 = i10 - i11;
        if (i12 >= size) {
            eVar.c(0, i11, size, bArr);
            this.f2458d += size;
            return;
        }
        eVar.c(0, i11, i12, bArr);
        int i13 = size - i12;
        this.f2458d = i10;
        I();
        if (i13 <= i10) {
            eVar.c(i12, 0, i13, bArr);
            this.f2458d = i13;
            return;
        }
        OutputStream outputStream = (OutputStream) this.f2460r;
        if (i12 < 0) {
            throw new IndexOutOfBoundsException(w.g.e("Source offset < 0: ", 30, i12));
        }
        if (i13 < 0) {
            throw new IndexOutOfBoundsException(w.g.e("Length < 0: ", 23, i13));
        }
        int i14 = i12 + i13;
        if (i14 > eVar.size()) {
            throw new IndexOutOfBoundsException(w.g.e("Source end offset exceeded: ", 39, i14));
        }
        if (i13 > 0) {
            eVar.r(outputStream, i12, i13);
        }
    }

    public void S(byte[] bArr) throws IOException {
        int length = bArr.length;
        byte[] bArr2 = (byte[]) this.f2459g;
        int i10 = this.f2457a;
        int i11 = this.f2458d;
        int i12 = i10 - i11;
        if (i12 >= length) {
            System.arraycopy(bArr, 0, bArr2, i11, length);
            this.f2458d += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i11, i12);
        int i13 = length - i12;
        this.f2458d = i10;
        I();
        if (i13 > i10) {
            ((OutputStream) this.f2460r).write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f2458d = i13;
        }
    }

    public void T(int i10) throws IOException {
        Q(i10 & 255);
        Q((i10 >> 8) & 255);
        Q((i10 >> 16) & 255);
        Q((i10 >> 24) & 255);
    }

    public void U(long j) throws IOException {
        Q(((int) j) & 255);
        Q(((int) (j >> 8)) & 255);
        Q(((int) (j >> 16)) & 255);
        Q(((int) (j >> 24)) & 255);
        Q(((int) (j >> 32)) & 255);
        Q(((int) (j >> 40)) & 255);
        Q(((int) (j >> 48)) & 255);
        Q(((int) (j >> 56)) & 255);
    }

    public void V(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            Q((i10 & 127) | 128);
            i10 >>>= 7;
        }
        Q(i10);
    }

    public void W(long j) throws IOException {
        while (((-128) & j) != 0) {
            Q((((int) j) & 127) | 128);
            j >>>= 7;
        }
        Q((int) j);
    }

    public void X(int i10, int i11) throws IOException {
        V((i10 << 3) | i11);
    }

    @Override // b5.g
    public h a() {
        return new p((String) this.f2460r, this.f2457a, this.f2458d, (io.sentry.internal.debugmeta.c) this.f2459g);
    }

    @Override // h9.s0
    public void b(float f10, float f11, float f12, float f13) {
        g((byte) 3);
        u(4);
        float[] fArr = (float[]) this.f2460r;
        int i10 = this.f2458d;
        int i11 = i10 + 1;
        this.f2458d = i11;
        fArr[i10] = f10;
        int i12 = i10 + 2;
        this.f2458d = i12;
        fArr[i11] = f11;
        int i13 = i10 + 3;
        this.f2458d = i13;
        fArr[i12] = f12;
        this.f2458d = i10 + 4;
        fArr[i13] = f13;
    }

    @Override // h9.s0
    public void c(float f10, float f11) {
        g((byte) 0);
        u(2);
        float[] fArr = (float[]) this.f2460r;
        int i10 = this.f2458d;
        int i11 = i10 + 1;
        this.f2458d = i11;
        fArr[i10] = f10;
        this.f2458d = i10 + 2;
        fArr[i11] = f11;
    }

    @Override // h9.s0
    public void close() {
        g((byte) 8);
    }

    @Override // h9.s0
    public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        g((byte) 2);
        u(6);
        float[] fArr = (float[]) this.f2460r;
        int i10 = this.f2458d;
        int i11 = i10 + 1;
        this.f2458d = i11;
        fArr[i10] = f10;
        int i12 = i10 + 2;
        this.f2458d = i12;
        fArr[i11] = f11;
        int i13 = i10 + 3;
        this.f2458d = i13;
        fArr[i12] = f12;
        int i14 = i10 + 4;
        this.f2458d = i14;
        fArr[i13] = f13;
        int i15 = i10 + 5;
        this.f2458d = i15;
        fArr[i14] = f14;
        this.f2458d = i10 + 6;
        fArr[i15] = f15;
    }

    @Override // h9.s0
    public void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        g((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
        u(5);
        float[] fArr = (float[]) this.f2460r;
        int i10 = this.f2458d;
        int i11 = i10 + 1;
        this.f2458d = i11;
        fArr[i10] = f10;
        int i12 = i10 + 2;
        this.f2458d = i12;
        fArr[i11] = f11;
        int i13 = i10 + 3;
        this.f2458d = i13;
        fArr[i12] = f12;
        int i14 = i10 + 4;
        this.f2458d = i14;
        fArr[i13] = f13;
        this.f2458d = i10 + 5;
        fArr[i14] = f14;
    }

    @Override // h9.s0
    public void f(float f10, float f11) {
        g((byte) 1);
        u(2);
        float[] fArr = (float[]) this.f2460r;
        int i10 = this.f2458d;
        int i11 = i10 + 1;
        this.f2458d = i11;
        fArr[i10] = f10;
        this.f2458d = i10 + 2;
        fArr[i11] = f11;
    }

    public void g(byte b2) {
        int i10 = this.f2457a;
        byte[] bArr = (byte[]) this.f2459g;
        if (i10 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f2459g = bArr2;
        }
        byte[] bArr3 = (byte[]) this.f2459g;
        int i11 = this.f2457a;
        this.f2457a = i11 + 1;
        bArr3[i11] = b2;
    }

    public int h() {
        int i10 = this.f2457a;
        int i11 = this.f2458d;
        if (i10 == i11) {
            return -1;
        }
        int i12 = i10 + 1;
        this.f2457a = i12;
        if (i12 < i11) {
            return ((String) this.f2460r).charAt(i12);
        }
        return -1;
    }

    public Boolean i(Object obj) {
        if (obj == null) {
            return null;
        }
        J();
        int i10 = this.f2457a;
        if (i10 == this.f2458d) {
            return null;
        }
        char cCharAt = ((String) this.f2460r).charAt(i10);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f2457a++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public float j(float f10) {
        if (Float.isNaN(f10)) {
            return Float.NaN;
        }
        J();
        return B();
    }

    public boolean s(char c4) {
        int i10 = this.f2457a;
        boolean z10 = i10 < this.f2458d && ((String) this.f2460r).charAt(i10) == c4;
        if (z10) {
            this.f2457a++;
        }
        return z10;
    }

    public boolean t(String str) {
        int length = str.length();
        int i10 = this.f2457a;
        boolean z10 = i10 <= this.f2458d - length && ((String) this.f2460r).substring(i10, i10 + length).equals(str);
        if (z10) {
            this.f2457a += length;
        }
        return z10;
    }

    public void u(int i10) {
        float[] fArr = (float[]) this.f2460r;
        if (fArr.length < this.f2458d + i10) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f2460r = fArr2;
        }
    }

    public boolean v() {
        return this.f2457a == this.f2458d;
    }

    public void w(s0 s0Var) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2457a; i11++) {
            byte b2 = ((byte[]) this.f2459g)[i11];
            if (b2 == 0) {
                float[] fArr = (float[]) this.f2460r;
                int i12 = i10 + 1;
                float f10 = fArr[i10];
                i10 += 2;
                s0Var.c(f10, fArr[i12]);
            } else if (b2 == 1) {
                float[] fArr2 = (float[]) this.f2460r;
                int i13 = i10 + 1;
                float f11 = fArr2[i10];
                i10 += 2;
                s0Var.f(f11, fArr2[i13]);
            } else if (b2 == 2) {
                float[] fArr3 = (float[]) this.f2460r;
                s0Var.d(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                i10 += 6;
            } else if (b2 == 3) {
                float[] fArr4 = (float[]) this.f2460r;
                float f12 = fArr4[i10];
                float f13 = fArr4[i10 + 1];
                int i14 = i10 + 3;
                float f14 = fArr4[i10 + 2];
                i10 += 4;
                s0Var.b(f12, f13, f14, fArr4[i14]);
            } else if (b2 != 8) {
                boolean z10 = (b2 & 2) != 0;
                boolean z11 = (b2 & 1) != 0;
                float[] fArr5 = (float[]) this.f2460r;
                s0Var.e(fArr5[i10], fArr5[i10 + 1], fArr5[i10 + 2], z10, z11, fArr5[i10 + 3], fArr5[i10 + 4]);
                i10 += 5;
            } else {
                s0Var.close();
            }
        }
    }

    public void x() throws IOException {
        if (((OutputStream) this.f2460r) != null) {
            I();
        }
    }

    public m(int i10, int i11, float[] fArr, float[] fArr2) {
        this.f2457a = i10;
        qb.b.g(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f2459g = fArr;
        this.f2460r = fArr2;
        this.f2458d = i11;
    }

    public m(String str) {
        this.f2457a = 0;
        this.f2458d = 0;
        this.f2459g = new h9.u();
        String strTrim = str.trim();
        this.f2460r = strTrim;
        this.f2458d = strTrim.length();
    }
}
