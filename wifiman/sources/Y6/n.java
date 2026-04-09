package Y6;

import ej.C5481e;
import ej.E;
import ej.InterfaceC5474B;
import ej.InterfaceC5482f;
import java.io.IOException;

/* loaded from: classes3.dex */
final class n extends o {

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f24680m = new String[128];

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC5482f f24681j;

    /* renamed from: k, reason: collision with root package name */
    private String f24682k = ":";

    /* renamed from: l, reason: collision with root package name */
    private String f24683l;

    class a implements InterfaceC5474B {
        a() {
        }

        @Override // ej.InterfaceC5474B
        public void Z(C5481e c5481e, long j10) {
            n.this.f24681j.Z(c5481e, j10);
        }

        @Override // ej.InterfaceC5474B
        public E c() {
            return E.f46437f;
        }

        @Override // ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (n.this.T() != 9) {
                throw new AssertionError();
            }
            n nVar = n.this;
            int i10 = nVar.f24685a;
            nVar.f24685a = i10 - 1;
            int[] iArr = nVar.f24688d;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
        }

        @Override // ej.InterfaceC5474B, java.io.Flushable
        public void flush() {
            n.this.f24681j.flush();
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f24680m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f24680m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    n(InterfaceC5482f interfaceC5482f) {
        if (interfaceC5482f == null) {
            throw new NullPointerException("sink == null");
        }
        this.f24681j = interfaceC5482f;
        b0(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void A0(ej.InterfaceC5482f r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = Y6.n.f24680m
            r1 = 34
            r7.u(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L38
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L2b
            goto L35
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L24
            java.lang.String r5 = "\\u2028"
            goto L2b
        L24:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L35
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L30
            r7.H(r8, r4, r3)
        L30:
            r7.F(r5)
            int r4 = r3 + 1
        L35:
            int r3 = r3 + 1
            goto Ld
        L38:
            if (r4 >= r2) goto L3d
            r7.H(r8, r4, r2)
        L3d:
            r7.u(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.n.A0(ej.f, java.lang.String):void");
    }

    private void B0() {
        if (this.f24683l != null) {
            v0();
            A0(this.f24681j, this.f24683l);
            this.f24683l = null;
        }
    }

    private void v0() {
        int iT = T();
        if (iT == 5) {
            this.f24681j.u(44);
        } else if (iT != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        y0();
        d0(4);
    }

    private void w0() {
        int iT = T();
        int i10 = 2;
        if (iT == 1) {
            y0();
        } else if (iT == 2) {
            this.f24681j.u(44);
            y0();
        } else if (iT == 4) {
            this.f24681j.F(this.f24682k);
            i10 = 5;
        } else {
            if (iT == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            i10 = 7;
            if (iT != 6) {
                if (iT != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f24690f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        d0(i10);
    }

    private o x0(int i10, int i11, char c10) {
        int iT = T();
        if (iT != i11 && iT != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f24683l != null) {
            throw new IllegalStateException("Dangling name: " + this.f24683l);
        }
        int i12 = this.f24685a;
        int i13 = this.f24693i;
        if (i12 == (~i13)) {
            this.f24693i = ~i13;
            return this;
        }
        int i14 = i12 - 1;
        this.f24685a = i14;
        this.f24687c[i14] = null;
        int[] iArr = this.f24688d;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        if (iT == i11) {
            y0();
        }
        this.f24681j.u(c10);
        return this;
    }

    private void y0() {
        if (this.f24689e == null) {
            return;
        }
        this.f24681j.u(10);
        int i10 = this.f24685a;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f24681j.F(this.f24689e);
        }
    }

    private o z0(int i10, int i11, char c10) {
        int i12 = this.f24685a;
        int i13 = this.f24693i;
        if (i12 == i13) {
            int[] iArr = this.f24686b;
            if (iArr[i12 - 1] == i10 || iArr[i12 - 1] == i11) {
                this.f24693i = ~i13;
                return this;
            }
        }
        w0();
        j();
        b0(i10);
        this.f24688d[this.f24685a - 1] = 0;
        this.f24681j.u(c10);
        return this;
    }

    @Override // Y6.o
    public o J(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f24685a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iT = T();
        if ((iT != 3 && iT != 5) || this.f24683l != null || this.f24692h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f24683l = str;
        this.f24687c[this.f24685a - 1] = str;
        return this;
    }

    @Override // Y6.o
    public o P() {
        if (this.f24692h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        if (this.f24683l != null) {
            if (!this.f24691g) {
                this.f24683l = null;
                return this;
            }
            B0();
        }
        w0();
        this.f24681j.F("null");
        int[] iArr = this.f24688d;
        int i10 = this.f24685a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // Y6.o
    public o a() {
        if (!this.f24692h) {
            B0();
            return z0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f24681j.close();
        int i10 = this.f24685a;
        if (i10 > 1 || (i10 == 1 && this.f24686b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f24685a = 0;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f24685a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f24681j.flush();
    }

    @Override // Y6.o
    public o h() {
        if (!this.f24692h) {
            B0();
            return z0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // Y6.o
    public o n0(double d10) {
        if (!this.f24690f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f24692h) {
            this.f24692h = false;
            return J(Double.toString(d10));
        }
        B0();
        w0();
        this.f24681j.F(Double.toString(d10));
        int[] iArr = this.f24688d;
        int i10 = this.f24685a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // Y6.o
    public o o0(long j10) {
        if (this.f24692h) {
            this.f24692h = false;
            return J(Long.toString(j10));
        }
        B0();
        w0();
        this.f24681j.F(Long.toString(j10));
        int[] iArr = this.f24688d;
        int i10 = this.f24685a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // Y6.o
    public o p() {
        return x0(1, 2, ']');
    }

    @Override // Y6.o
    public o q0(Number number) {
        if (number == null) {
            return P();
        }
        String string = number.toString();
        if (!this.f24690f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f24692h) {
            this.f24692h = false;
            return J(string);
        }
        B0();
        w0();
        this.f24681j.F(string);
        int[] iArr = this.f24688d;
        int i10 = this.f24685a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // Y6.o
    public o r0(String str) {
        if (str == null) {
            return P();
        }
        if (this.f24692h) {
            this.f24692h = false;
            return J(str);
        }
        B0();
        w0();
        A0(this.f24681j, str);
        int[] iArr = this.f24688d;
        int i10 = this.f24685a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // Y6.o
    public o s0(boolean z10) {
        if (this.f24692h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        B0();
        w0();
        this.f24681j.F(z10 ? "true" : "false");
        int[] iArr = this.f24688d;
        int i10 = this.f24685a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // Y6.o
    public InterfaceC5482f t0() {
        if (this.f24692h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        }
        B0();
        w0();
        b0(9);
        return ej.p.c(new a());
    }

    @Override // Y6.o
    public o v() {
        this.f24692h = false;
        return x0(3, 5, '}');
    }
}
