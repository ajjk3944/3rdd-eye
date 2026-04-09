package nk;

import java.io.IOException;

/* loaded from: classes.dex */
public final class y extends c0 {
    public static final String[] I = new String[128];
    public final cv.h F;
    public String G = ":";
    public String H;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            I[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = I;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public y(cv.h hVar) {
        if (hVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.F = hVar;
        R(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s0(cv.h r6, java.lang.String r7) {
        /*
            r0 = 34
            r6.writeByte(r0)
            int r1 = r7.length()
            r2 = 0
            r3 = r2
        Lb:
            if (r2 >= r1) goto L36
            char r4 = r7.charAt(r2)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 >= r5) goto L1c
            java.lang.String[] r5 = nk.y.I
            r4 = r5[r4]
            if (r4 != 0) goto L29
            goto L33
        L1c:
            r5 = 8232(0x2028, float:1.1535E-41)
            if (r4 != r5) goto L23
            java.lang.String r4 = "\\u2028"
            goto L29
        L23:
            r5 = 8233(0x2029, float:1.1537E-41)
            if (r4 != r5) goto L33
            java.lang.String r4 = "\\u2029"
        L29:
            if (r3 >= r2) goto L2e
            r6.M(r7, r3, r2)
        L2e:
            r6.H(r4)
            int r3 = r2 + 1
        L33:
            int r2 = r2 + 1
            goto Lb
        L36:
            if (r3 >= r1) goto L3b
            r6.M(r7, r3, r1)
        L3b:
            r6.writeByte(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.y.s0(cv.h, java.lang.String):void");
    }

    @Override // nk.c0
    public final c0 G() {
        if (this.D) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + w());
        }
        if (this.H != null) {
            if (!this.B) {
                this.H = null;
                return this;
            }
            t0();
        }
        o0();
        this.F.H("null");
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // nk.c0
    public final void V(String str) {
        super.V(str);
        this.G = !str.isEmpty() ? ": " : ":";
    }

    @Override // nk.c0
    public final c0 Y(double d6) {
        if (!this.f18358y && (Double.isNaN(d6) || Double.isInfinite(d6))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d6);
        }
        if (this.D) {
            this.D = false;
            y(Double.toString(d6));
            return this;
        }
        t0();
        o0();
        this.F.H(Double.toString(d6));
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // nk.c0
    public final c0 Z(long j) {
        if (this.D) {
            this.D = false;
            y(Long.toString(j));
            return this;
        }
        t0();
        o0();
        this.F.H(Long.toString(j));
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // nk.c0
    public final c0 b() {
        if (this.D) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + w());
        }
        t0();
        r0(1, 2, '[');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.F.close();
        int i10 = this.f18353a;
        if (i10 > 1 || (i10 == 1 && this.f18354d[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f18353a = 0;
    }

    @Override // nk.c0
    public final c0 f() {
        if (this.D) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + w());
        }
        t0();
        r0(3, 5, '{');
        return this;
    }

    @Override // nk.c0
    public final c0 f0(Float f10) {
        if (f10 == null) {
            G();
            return this;
        }
        String string = f10.toString();
        if (!this.f18358y && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f10);
        }
        if (this.D) {
            this.D = false;
            y(string);
            return this;
        }
        t0();
        o0();
        this.F.H(string);
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f18353a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.F.flush();
    }

    @Override // nk.c0
    public final c0 i() {
        p0(1, 2, ']');
        return this;
    }

    @Override // nk.c0
    public final c0 i0(String str) {
        if (str == null) {
            G();
            return this;
        }
        if (this.D) {
            this.D = false;
            y(str);
            return this;
        }
        t0();
        o0();
        s0(this.F, str);
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // nk.c0
    public final c0 n0(boolean z10) {
        if (this.D) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + w());
        }
        t0();
        o0();
        this.F.H(z10 ? "true" : "false");
        int[] iArr = this.f18356r;
        int i10 = this.f18353a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public final void o0() {
        int iL = L();
        int i10 = 2;
        if (iL != 1) {
            cv.h hVar = this.F;
            if (iL == 2) {
                hVar.writeByte(44);
                q0();
            } else if (iL == 4) {
                hVar.H(this.G);
                i10 = 5;
            } else {
                if (iL == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (iL != 6) {
                    if (iL != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f18358y) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                i10 = 7;
            }
        } else {
            q0();
        }
        this.f18354d[this.f18353a - 1] = i10;
    }

    public final void p0(int i10, int i11, char c4) {
        int iL = L();
        if (iL != i11 && iL != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.H != null) {
            throw new IllegalStateException("Dangling name: " + this.H);
        }
        int i12 = this.f18353a;
        int i13 = ~this.E;
        if (i12 == i13) {
            this.E = i13;
            return;
        }
        int i14 = i12 - 1;
        this.f18353a = i14;
        this.f18355g[i14] = null;
        int[] iArr = this.f18356r;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        if (iL == i11) {
            q0();
        }
        this.F.writeByte(c4);
    }

    @Override // nk.c0
    public final c0 q() {
        this.D = false;
        p0(3, 5, '}');
        return this;
    }

    public final void q0() {
        if (this.f18357x == null) {
            return;
        }
        cv.h hVar = this.F;
        hVar.writeByte(10);
        int i10 = this.f18353a;
        for (int i11 = 1; i11 < i10; i11++) {
            hVar.H(this.f18357x);
        }
    }

    public final void r0(int i10, int i11, char c4) {
        int i12;
        int i13 = this.f18353a;
        int i14 = this.E;
        if (i13 == i14 && ((i12 = this.f18354d[i13 - 1]) == i10 || i12 == i11)) {
            this.E = ~i14;
            return;
        }
        o0();
        h();
        R(i10);
        this.f18356r[this.f18353a - 1] = 0;
        this.F.writeByte(c4);
    }

    public final void t0() {
        if (this.H != null) {
            int iL = L();
            cv.h hVar = this.F;
            if (iL == 5) {
                hVar.writeByte(44);
            } else if (iL != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            q0();
            this.f18354d[this.f18353a - 1] = 4;
            s0(hVar, this.H);
            this.H = null;
        }
    }

    @Override // nk.c0
    public final c0 y(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f18353a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iL = L();
        if ((iL != 3 && iL != 5) || this.H != null || this.D) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.H = str;
        this.f18355g[this.f18353a - 1] = str;
        return this;
    }
}
